package com.example.controller;

import com.example.Person;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rules")
public class RuleController {

    @Autowired
    private KieSession kieSession;

    @PostMapping("/evaluate")
    public String evaluateRules(@RequestBody Person person) {
        StringBuilder response = new StringBuilder();
        kieSession.setGlobal("response", response);
        kieSession.insert(person);
        kieSession.fireAllRules();
        kieSession.dispose();
        return response.toString();
    }
}