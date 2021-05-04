package lab4;

public class students extends User {
    public students(StudentBuilder studentBuilder) {
        super(studentBuilder.ID, studentBuilder.username);

    }

    public static class StudentBuilder {
        private int ID;
        private String username;
        private boolean membership;
        private int course;
        public StudentBuilder (int ID,  String username, int course) {
            this.ID = ID;
            this.username = username;
            this.course = course;
        }
        public StudentBuilder setMembership(boolean membership) {
            this.membership = membership;
            return this;
        }
        public students build(){
            return new students(this);
        }
    }


}

