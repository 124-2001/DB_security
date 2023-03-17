//package com.example.db_security.security.old;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.DelegatingPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
//import org.springframework.security.crypto.scrypt.SCryptPasswordEncoder;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class Security extends WebSecurityConfigurerAdapter {
//    @Autowired
//    private CustomAuthenProvider authenProvider;
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.authenticationProvider(authenProvider);
//    }
//
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.formLogin();
//        http.authorizeRequests()
//
//                .anyRequest().authenticated();
//    }
//
//    public static PasswordEncoder delegatePasswordEncoder(String encodingType) {
//        Map<String, PasswordEncoder> encoders = new HashMap<>();
//        encoders.put("bcrypt", new BCryptPasswordEncoder());
//        encoders.put("pbkdf2", new Pbkdf2PasswordEncoder());
//        encoders.put("scrypt", new SCryptPasswordEncoder());
//
//        return new DelegatingPasswordEncoder(encodingType, encoders);
//    }
//    @Bean
//    public PasswordEncoder encoder() {
//        return Security.delegatePasswordEncoder("bcrypt");
//    }
//}
