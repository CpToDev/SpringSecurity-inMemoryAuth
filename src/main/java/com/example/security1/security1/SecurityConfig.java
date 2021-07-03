package com.example.security1.security1;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("saurav")
                .password("saurav123")
                .roles("USER")
                .and()
                .withUser("aman")
                .password("aman123")
                .roles("USER","ADMIN");
        

    }
    // we cau use .password({noop}saurav123) /// seen from baeldung.com

    @Bean
    public PasswordEncoder getPasswordEncoder(){

        return NoOpPasswordEncoder.getInstance();
    }
}
