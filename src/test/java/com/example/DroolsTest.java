package com.example;

import org.junit.jupiter.api.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DroolsTest {

    @Test
    public void testDroolsSession() {
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieContainer = kieServices.getKieClasspathContainer();
        KieSession kieSession = kieContainer.newKieSession("ksession-rules");

        assertNotNull(kieSession, "KieSession should not be null");

        // Insérer un exemple de fait
        Person person = new Person("John", 17);
        kieSession.insert(person);

        // Exécuter les règles
        kieSession.fireAllRules();
        kieSession.dispose();
    }
}