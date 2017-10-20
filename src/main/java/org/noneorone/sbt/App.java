package org.noneorone.sbt;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Application Entrance
 *
 * @author Mars.Wong(noneorone@yeah.net) at 2017/7/19 11:40<br/>
 * @since 1.0
 */
@Configuration
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan
public class App extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(App.class);
	}

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		super.onStartup(servletContext);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
