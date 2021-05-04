package lab4;

public class pupil extends User {
    private Boolean membership;
    private int grade;
    public pupil(pupil.PupilBuilder pupilBuilder) {
        super(pupilBuilder.ID, pupilBuilder.username);
        this.membership = pupilBuilder.membership;
        this.grade = pupilBuilder.grade;
    }
    public static class PupilBuilder {

        private int ID;
        private String username;
        private Boolean membership;
        private int grade;
        public PupilBuilder (int ID,  String username, int grade) {
            this.ID = ID;
            this.username = username;
            this.grade = grade;
        }
        public pupil.PupilBuilder setMembership(boolean membership) {
            this.membership = membership;
            return this;
        }

        public pupil build(){
            return new pupil(this);
        }
    }
}