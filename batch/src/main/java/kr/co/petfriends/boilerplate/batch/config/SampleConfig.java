package kr.co.petfriends.boilerplate.batch.config;

import kr.co.petfriends.boilerplate.core.sample.SampleService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SampleConfig {

    @Bean
    public SampleService sampleService() {
        return new SampleService();
    }
}
