package com.bsmlabs.gensonspringboot;

import com.owlike.genson.Genson;
import com.owlike.genson.GensonBuilder;
import com.owlike.genson.ext.javadatetime.JavaDateTimeBundle;
import com.owlike.genson.ext.spring.GensonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Genson genson() {
        return new GensonBuilder()
                .setHtmlSafe(true)
                .setSkipNull(true)
                .useBeanViews(true)
                .withBundle(new JavaDateTimeBundle())
                .create();

    }

    @Bean
    public GensonMessageConverter gensonMessageConverter() {
        return new GensonMessageConverter(genson());
    }
}
