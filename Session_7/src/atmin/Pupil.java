package atmin;

public class Pupil {
    static int idAuto = 1;
    private int id;
    private String fullname;
    private int gender;
    private int yearOfBirth;
    private int classname;

    public Pupil(String fullname, int gender, int yearOfBirth, int classname) {
        this.id = idAuto++;
        this.fullname = fullname;
        this.gender = gender;
        this.yearOfBirth = yearOfBirth;
        this.classname = classname;
    }

    void show() {
        System.out.println("ID: " + id);
        System.out.println("Fullname: " + fullname);
        System.out.println("Gender: " + (gender == 0 ? "Male" : "Female"));
        System.out.println("Year of Birth: " + yearOfBirth);
        System.out.println("Classname: " + classname);
        System.out.println("-------------------------");
    }


}

