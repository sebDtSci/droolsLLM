package com.example.config;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DroolsConfig {

    @Bean
    public KieContainer kieContainer() {
        KieServices kieServices = KieServices.Factory.get();
        return kieServices.getKieClasspathContainer();
    }

    @Bean
    public KieSession kieSession(KieContainer kieContainer) {
        KieSession kieSession = kieContainer.newKieSession("ksession-rules");
        if (kieSession == null) {
            throw new RuntimeException("Failed to initialize KieSession. Check your kmodule.xml and rules configuration.");
        }
        return kieSession;
    }
}