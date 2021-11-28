package com.leng.oldass.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 跨域配置
 *
 * @author lengzq
 * @since 2021/11/26 17:00
 */

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
       registry.addMapping("/**")
               .allowedOrigins("http://localhost:8080")
               .allowCredentials(true)
               .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
               .maxAge(3600);
    }
}
