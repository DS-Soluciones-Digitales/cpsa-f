package wrong.implementations;

import wrong.interfaces.Person;

public class Physician implements Person {
    @Override
    public void healPeople() {
        System.out.println("He/she can operate persons");
    }

    @Override
    public void legallyDefendsPeople() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void driveATruck()  {
        System.out.println("If he/she learned that, he can drive a truck");
    }
}
