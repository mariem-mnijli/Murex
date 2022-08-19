package tn.stage.spring.secutiry;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import lombok.AllArgsConstructor;


@Configuration
@AllArgsConstructor
@EnableWebSecurity
@EnableWebMvc

public class WebSecurityConfig extends WebSecurityConfigurerAdapter implements WebMvcConfigurer  {

	private final UserDetailsService  userDetailsService;
	private final BCryptPasswordEncoder  bCryptPasswordEncoder;
	

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
				.allowedOrigins("*")
				.allowedMethods("GET", "PUT", "POST", "PATCH", "DELETE", "OPTIONS") 
				.allowedHeaders("*")
                .allowedOrigins("*")
                .allowedOriginPatterns("*");
			}
		};
	}

		//zidt hatha
	 @Bean
	    public CorsFilter corsFilter() {
	        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	        CorsConfiguration config = new CorsConfiguration();
	        config.setAllowCredentials(true);
	        config.addAllowedOrigin("http://localhost:4200");
	        config.addAllowedHeader("*");
	        config.addAllowedMethod("OPTIONS");
	        config.addAllowedMethod("GET");
	        config.addAllowedMethod("POST");
	        config.addAllowedMethod("PUT");
	        config.addAllowedMethod("DELETE");
	        source.registerCorsConfiguration("/**", config);
	        return new CorsFilter(source);
	    }
	
	
	 @Override
    protected void configure(HttpSecurity http) throws Exception {
			//http.cors().configurationSource(request -> new CorsConfiguration().applyPermitDefaultValues());

			http.cors().and().csrf().disable();
			http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
                http.authorizeRequests().antMatchers("/registration/**", "/login/**").permitAll().and(); 
                
            	http.authorizeRequests().antMatchers("/client/**").hasAnyAuthority("SUPERADMIN", "ADMIN");
            	http.authorizeRequests().antMatchers("/Consultant/**").hasAnyAuthority("SUPERADMIN", "ADMIN");
            	http.authorizeRequests().antMatchers("/SousTraitant/**").hasAnyAuthority("SUPERADMIN", "ADMIN");
            	http.authorizeRequests().antMatchers("/taches/**").hasAnyAuthority("SUPERADMIN", "ADMIN");
            	http.authorizeRequests().antMatchers("/mission/**").hasAnyAuthority("SUPERADMIN", "ADMIN");
            	http.authorizeRequests().antMatchers("/statutConsultation/**").hasAnyAuthority("SUPERADMIN", "ADMIN");
            	http.authorizeRequests().antMatchers("/blacklist/**").hasAnyAuthority("SUPERADMIN");
            	http.authorizeRequests().antMatchers("/user/**").hasAnyAuthority("SUPERADMIN");
            	http.authorizeRequests().antMatchers("/fIAdmin/**").hasAnyAuthority("SUPERADMIN");
            	http.authorizeRequests().antMatchers("/apropos/**").hasAnyAuthority("SUPERADMIN");

            	//http.authorizeRequests().antMatchers(HttpMethod.POST,"/Consultant/add-Consultant").hasAnyAuthority("SUPERADMIN");
            	//http.authorizeRequests().antMatchers(HttpMethod.DELETE,"/Consultant/remove-Consultant").hasAnyAuthority("SUPERADMIN");
            	//http.authorizeRequests().antMatchers(HttpMethod.PUT,"/Consultant/modify-Consultant").hasAnyAuthority("SUPERADMIN");
            	
                //http.authorizeRequests().antMatchers(HttpMethod.GET,"/Consultant/retrieve-all-Consultant").hasAnyAuthority("ADMIN");
            	
            	//http.authorizeRequests().antMatchers(HttpMethod.OPTIONS,"/SousTraitant/**").hasAnyAuthority("SUPERADMIN");
            	//http.authorizeRequests().antMatchers(HttpMethod.GET,"/client/**").hasAnyAuthority("SUPERADMIN");
                //http.authorizeRequests().antMatchers(HttpMethod.GET,"/user/Users").hasAnyAuthority("SUPERADMIN");
               	//http.authorizeRequests().antMatchers(HttpMethod.OPTIONS,"/blaclist/**").hasAnyAuthority("SUPERADMIN");
              
        
              	http.authorizeRequests().anyRequest().authenticated();
                http.addFilter(new CustomAuthentificationFilter(authenticationManager()));
            	http.addFilterBefore(new CustomAuthorizationFilter(),UsernamePasswordAuthenticationFilter.class);
            	
    	

    
}

	@Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder);
	}
	
	@Bean
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception{
		return super.authenticationManager();
	}
	
	
	/*@Override
	    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	        auth.authenticationProvider(daoAuthenticationProvider());
	    } 
	 @Bean
	    public DaoAuthenticationProvider daoAuthenticationProvider() {
	        DaoAuthenticationProvider provider =
	                new DaoAuthenticationProvider();
	        provider.setPasswordEncoder(bCryptPasswordEncoder); 
	        provider.setUserDetailsService(appUserService);
	        return provider;
	    }
	*/
	   /* @Bean
	    public HttpFirewall defaultHttpFirewall() {
	        return new DefaultHttpFirewall();
	    }*/
}

