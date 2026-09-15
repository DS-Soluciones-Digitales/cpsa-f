package wrong.implementations;

import wrong.interfaces.Person;

public class Lawyer implements Person {
    @Override
    public void healPeople() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void legallyDefendsPeople() {
        System.out.println("He/she can represent a person in a court");
    }

    @Override
    public void driveATruck() {
        System.out.println("If he/she learned that, he can drive a truck");
    }
}
