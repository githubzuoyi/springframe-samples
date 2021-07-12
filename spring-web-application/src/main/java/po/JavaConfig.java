package po;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class JavaConfig {

    @Bean
    public ConfigBean getBean(){
        return new ConfigBean();
    }


}
