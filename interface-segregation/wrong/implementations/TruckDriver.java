package wrong.implementations;

import wrong.interfaces.Person;

public class TruckDriver implements Person {


    @Override
    public void legallyDefendsPeople() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void driveATruck() throws RuntimeException {
        System.out.println("He/she can drive different types of trucks");
    }

    @Override
    public void healPeople() throws RuntimeException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
