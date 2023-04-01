package be.vdab.palindroom.services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceBeansConfiguration {
    @Bean
    WoordService woord() {
        return new WoordService();
    }
}
