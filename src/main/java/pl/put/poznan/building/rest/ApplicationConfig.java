/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.put.poznan.building.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


@Configuration
@EnableWebSecurity
public class ApplicationConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private BasicAuthenticationPoint basicAuthenticationPoint;

    /*@Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(getApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("l.put.poznan.building.rest"))
                .paths(PathSelectors.any())
                .build();
    }*/

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        System.out.println("KONFIGURACJA");
        http.csrf().disable();
        http.authorizeRequests().antMatchers("/guest/**").permitAll()
                .anyRequest().authenticated();

        http.httpBasic().authenticationEntryPoint(basicAuthenticationPoint);

        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    }


    //private ApiInfo getApiInfo() {
    //    Contact contact = new Contact("BuildingInfo", "", "mail@gmail.com");
    //    return new ApiInfoBuilder()
    //            .title("BuildingInfo")
    //            .description("BuildingInfoProgram")
    //            .version("1.0.0")
    //            .license("Apache 2.0")
    //            .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0")
    //            .contact(contact)
    //            .build();
    //}

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        System.out.println("HASŁO");
        auth.inMemoryAuthentication().withUser("username").password("password").roles("USER");
    }
}
