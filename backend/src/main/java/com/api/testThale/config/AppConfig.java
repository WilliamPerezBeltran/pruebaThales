package com.api.testThale.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

// package com.api.testThale.config;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.web.servlet.config.annotation.CorsRegistry;
// import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
// import org.springframework.web.client.RestTemplate;

// @Configuration
// public class AppConfig implements WebMvcConfigurer {

//     @Override
//     public void addCorsMappings(CorsRegistry registry) {
//         registry.addMapping("/**")
//                 .allowedOrigins("http://localhost:3000")
//                 .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
//                 .allowedHeaders("*");
//     }
//  	@Bean
//     public RestTemplate restTemplate() {
//         return new RestTemplate();
//     }
// }
