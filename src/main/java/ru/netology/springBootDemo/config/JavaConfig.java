package ru.netology.springBootDemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.springBootDemo.systemProfile.DevProfile;
import ru.netology.springBootDemo.systemProfile.ProductionProfile;
import ru.netology.springBootDemo.systemProfile.SystemProfile;

@Configuration
public class JavaConfig {
    @Bean
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}