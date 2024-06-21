package StudentInformationSystem;

public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name, String branch, String mpno){
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", mpno='" + mpno + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }
}
