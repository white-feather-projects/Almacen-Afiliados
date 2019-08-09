package com.cbp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;

@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
	@Bean("authenticationManager")
	@Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
            return super.authenticationManagerBean();
    }
	
	@Autowired
	public void configurerGlobal(AuthenticationManagerBuilder builder) throws Exception {
		
		PasswordEncoder encoder = passwordEncoder();
		UserBuilder users = User.builder().passwordEncoder(encoder::encode);
		builder.inMemoryAuthentication()
		.withUser(users.username("admin").password("12345").roles("ADMIN","USER"))
		.withUser(users.username("esteban").password("12345").roles("ADMIN","USER"))
		.withUser(users.username("victor").password("12345").roles("ADMIN","USER"))
		.withUser(users.username("karla").password("12345").roles("USER"));
	}
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
    public AuthenticationSuccessHandler myAuthenticationSuccessHandler(){
        return new MySimpleUrlAuthenticationSuccessHandler();
    }

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests().antMatchers("/","/css/**", "/css2/**","/fonts/**", "/img/**", "/img2/**", "/js/**", "/js2/**", "/errorLogin", "/dashborad", "/error404", "/error405").permitAll()
		 .antMatchers(HttpMethod.OPTIONS).permitAll()
         .antMatchers(HttpMethod.GET).permitAll()
         .antMatchers(HttpMethod.POST).permitAll()
         .antMatchers(HttpMethod.PUT).permitAll()
         .antMatchers(HttpMethod.DELETE).permitAll()
		.antMatchers("/dashborad/**").access("hasRole('ADMIN')")
		.antMatchers("/listPurchaseOrder/**").hasAnyRole("ADMIN","USER")
		.antMatchers("/createPurchaseOrder/**").hasAnyRole("ADMIN")
		.antMatchers("/corfirmationCreatePurchaseOrder/**").hasAnyRole("ADMIN")
		.antMatchers("/generatedPurchaseOrder/**").hasAnyRole("ADMIN")
		.antMatchers("/listGestionPlasticos/**").hasAnyRole("ADMIN")
		.antMatchers("/analisis/**").hasAnyRole("ADMIN")
		.antMatchers("/customerAnalysisTdc/**").hasAnyRole("ADMIN")
		.antMatchers("/bandeja_riesgos/**").hasAnyRole("ADMIN")
		.antMatchers("/bandeja_ventas/**").hasAnyRole("ADMIN","USER")
		.antMatchers("/carga_archivos/**").hasAnyRole("ADMIN","USER")
		.antMatchers("/carga_datos/**").hasAnyRole("ADMIN","USER")
		.antMatchers("/confirmacion/**").hasAnyRole("ADMIN","USER")
		.antMatchers("/confirmacion2/**").hasAnyRole("ADMIN")
		.antMatchers("/createPurchaseOrdeRequestr/**").hasAnyRole("ADMIN","USER")
		.antMatchers("/gestion_Solicitudes/**").hasAnyRole("ADMIN","USER")
		.antMatchers("/impresion_tarjetas/**").hasAnyRole("ADMIN","USER")
		.anyRequest().authenticated()
		.and()
		.formLogin().loginPage("/login")
		.successHandler(myAuthenticationSuccessHandler())
		.permitAll()
		.and()
		.formLogin().permitAll();
	}
	/*@Bean(name = "multipartResolver")
	public CommonsMultipartResolver multipartResolver() {
	    CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
	    multipartResolver.setMaxUploadSize(100000);
	    return multipartResolver;
	}*/
	

	
}
