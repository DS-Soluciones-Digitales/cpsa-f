package wrong;

import wrong.implementations.Lawyer;
import wrong.implementations.Physician;
import wrong.implementations.TruckDriver;

public class Main {

    public static void main(String args[]) {

        System.out.println("** Lawyer **");
        Lawyer lawyer = new Lawyer();
        lawyer.legallyDefendsPeople();
        lawyer.driveATruck();
        try {
            lawyer.healPeople();
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }

        System.out.println("** Physician **");
        Physician physician = new Physician();


        physician.healPeople();
        physician.driveATruck();
        try {
            physician.legallyDefendsPeople();
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }

        System.out.println("** Truck driver **");
        TruckDriver truckDriver = new TruckDriver();

        truckDriver.driveATruck();

        try {
            truckDriver.healPeople();
        } catch (RuntimeException e) {
            System.out.println(e.getStackTrace());
        }

        try {
            truckDriver.legallyDefendsPeople();
        } catch (RuntimeException e) {
            System.out.println(e.getStackTrace());
        }

    }

}
