package StudentInformationSystem;

public class Course {
    String name;
    String code;
    String prefix;
    int examNote;
    int verbalNote;
    double verbalNotePerc;
    Teacher teacher;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.examNote = 0;
        this.verbalNote = 0;
        this.verbalNotePerc = 0.1;
    }

    public void addTeacher(Teacher teacher){
        if(teacher.branch.equals(prefix)){
            this.teacher = teacher;
        }else{
            System.out.println("Öğretmen ve Ders bölümleri uyuşmuyor.");
        }

    }

    public void setVerbalNotePerc(int perc){
        if(perc <= 1 && perc >= 0)
            this.verbalNotePerc = perc;
        else
            System.out.println("Yanlış oran girdiniz.");
    }
    public void printTeacherInfos(){
        System.out.println(this.teacher.toString());
    }

    public double calculateNote(){
        return this.verbalNote*verbalNotePerc + this.examNote*(1-verbalNotePerc);
    }
}
