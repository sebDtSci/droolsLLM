package com.example;

import org.drools.ruleunits.api.DataSource;
import org.drools.ruleunits.api.RuleUnitData;
import org.drools.ruleunits.api.SingletonStore;

public class RuleUnit implements RuleUnitData {

    private SingletonStore<Person> personne;
    private SingletonStore<Res> res;

    public RuleUnit() {
        this.personne = DataSource.createSingleton();
        this.res = DataSource.createSingleton();
    }

    public SingletonStore<Person> getPersonne() {
        return personne;
    }
    
    public SingletonStore<Res> getRes() {
        return res;
    }

    public void setPersonne(SingletonStore<Person> personne) {
        this.personne = personne;
    }
    
    public void setRes(SingletonStore<Res> res) {
        this.res = res;
    }
}
