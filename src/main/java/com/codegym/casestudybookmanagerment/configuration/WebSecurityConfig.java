package com.codegym.casestudybookmanagerment.configuration;//package com.codegym.casestudybookmanagerment.configuration;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//    @Autowired
//    CustomSuccessHandler customSuccessHandler;
//
//
//    @Autowired
//    private UserDetailsService userDetailsService;
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .antMatchers("/login").permitAll()
//                .antMatchers("/products_customer","/products").hasRole("MEMBER")
//                .antMatchers("/products**").hasRole("ADMIN")
//
//                .and()
//                .formLogin() .successHandler(customSuccessHandler)
////                .loginPage("/login")
//                .usernameParameter("email")
//                .passwordParameter("password")
//                .and()
//
//
//
//                //.defaultSuccessUrl("/")
//
//
//                //.failureUrl("/login?error")
//               // .and()
//                .exceptionHandling()
//                .accessDeniedPage("/403");
//    }
//
//}