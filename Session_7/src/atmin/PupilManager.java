package atmin;

import java.util.ArrayList;
import java.util.Scanner;

public class PupilManager {
    static ArrayList<Pupil> pupilPrimary = new ArrayList<>();
    static ArrayList<Pupil> pupilSecondary = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public void addPupilSecondarySchool() {
        System.out.print("Enter full name: ");
        String fullName = input.nextLine();
        System.out.print("Enter gender (0 - Male,1 - Female): ");
        int gender = input.nextInt();
        System.out.print("Enter year of birth: ");
        int yearOfBirth = input.nextInt();
        int classname;
        do {
            System.out.print("Enter classname: ");
            classname = input.nextInt();
        } while (classname < 6 || classname > 9);
        input.nextLine();
        pupilSecondary.add(new Pupil(fullName, gender, yearOfBirth, classname));
    }

    public void addPupilPrimarySchool() {
        System.out.print("Enter full name: ");
        String fullName = input.nextLine();
        System.out.print("Enter gender (0 - Male,1 - Female): ");
        int gender = input.nextInt();
        System.out.print("Enter year of birth: ");
        int yearOfBirth = input.nextInt();
        int classname;
        do {
            System.out.print("Enter classname: ");
            classname = input.nextInt();
        } while (classname < 1 || classname > 5);
        input.nextLine();

        pupilPrimary.add(new Pupil(fullName, gender, yearOfBirth, classname));
    }

    public void findPupil() {
        System.out.print("Enter name: ");
        String tempName = input.nextLine();
    }

    public static void main(String[] args) {
        PupilManager pupilManager = new PupilManager();
        pupilManager.addPupilPrimarySchool();
        pupilManager.addPupilSecondarySchool();


        for (Pupil pupil : pupilPrimary) {
            pupil.show();
        }

        for (Pupil pupil : pupilSecondary) {
            pupil.show();
        }

    }


}
