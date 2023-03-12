package outils;

import domaine.Personnel;

public class TestResult {
    private Personnel person;
    private boolean positive;

    public TestResult(Personnel person, boolean positive) {
        this.person = person;
        this.positive = positive;
    }

    public Personnel getPerson() {
        return person;
    }

    public boolean isPositive() {
        return positive;
    }
}
