package com.example;

public class Res {
    private boolean major;
    private double montantIndemnisation;

    public Res(){}

    public Res(boolean major, double montantIndemnisation) {
        this.major = major;
        this.montantIndemnisation = montantIndemnisation;
    }

    public double getMontantIndemnisation() {
        return montantIndemnisation;
    }

    public void setMontantIndemnisation(double montantIndemnisation) {
        this.montantIndemnisation = montantIndemnisation;
    }

    public boolean getMajor() {
        return major;
    }

    public void setMajor(boolean major) {
        this.major = major;
    }
    
}
