package com.example.vrsagateway.security;


import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@EnableWebFluxSecurity
public class SecurityConfig {

    @Bean
    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity httpSecurity){
        httpSecurity.authorizeExchange(spec -> spec.anyExchange()
                .authenticated()).oauth2Login()
                .and()
                .csrf().disable()
                .oauth2ResourceServer().jwt();
        return httpSecurity.build();
    }

}
