package lab4;

public abstract class Builder {

    public students createStudent(int ID, String username, boolean membership, int course ) {
        if (membership) return new students.StudentBuilder(ID, username, course).setMembership(true).build();
        else return new students.StudentBuilder(ID, username, course).build();
    }

    public pupil createPupil(int ID, String username, boolean membership, int grade ) {
        if (membership) return new pupil.PupilBuilder(ID, username, grade).setMembership(true).build();
        else return new pupil.PupilBuilder(ID, username, grade).build();
    }

}