package com.df.starter.auto.configure;

import com.df.starter.properties.GoodProperties;
import com.df.starter.service.GoodService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 东风
 */
@Configuration
@ConditionalOnClass(GoodService.class)
@EnableConfigurationProperties(GoodProperties.class)
public class GoodAutoConfigure  {
    @Bean
    @ConditionalOnMissingBean(GoodService.class)
    public GoodService goodService(){
        GoodProperties goodProperties = new GoodProperties();
        return new GoodService(goodProperties);
    }
}
