package com.test.config;

import com.test.entity.UserEntity;
import com.test.exceptiionhandling.BusinessException;
import com.test.logging.LoggingInterceptor;
import com.test.model.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ApiConfig implements WebMvcConfigurer {
//    @Bean
//    @Qualifier("productImpl")
//    public UserDetails saveAddress(UserDetails userDetails) throws BusinessException {
//        return userDetails;
//    }
    @Autowired
    private LoggingInterceptor loggingInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loggingInterceptor);
    }
}
