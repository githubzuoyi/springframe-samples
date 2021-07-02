package org.springframework.samples.ioc.reflection.po;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean("ConfigBean")
    public ConfigBean getBean(){
        return new ConfigBean();
    }
}
