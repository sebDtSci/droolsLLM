package com.example;

import org.drools.ruleunits.api.DataSource;
import org.drools.ruleunits.api.RuleUnitData;
import org.drools.ruleunits.api.SingletonStore;

public class RuleUnit implements RuleUnitData {

    private SingletonStore<Person> personne;

    public RuleUnit() {
        this.personne = DataSource.createSingleton();
    }

    public SingletonStore<Person> getPersonne() {
        return personne;
    }

    public void setPersonne(SingletonStore<Person> personne) {
        this.personne = personne;
    }
}
