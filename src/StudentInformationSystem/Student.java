package StudentInformationSystem;

public class Student {
    String name;
    String stuNo;
    String classes;
    Course c1;
    Course c2;
    Course c3;
    double  average;
    boolean isPass;

    public Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }

    public void addBulkExamNote(int note1,int note2, int note3){
        if(note1 >= 0 && note1 <= 100){
            c1.examNote = note1;
        }
        if(note2 >= 0 && note2 <= 100){
            c2.examNote = note2;
        }
        if(note3 >= 0 && note3 <= 100){
            c3.examNote = note3;
        }
    }

    public void addBulkVerbalNote(int note1,int note2, int note3){
        if(note1 >= 0 && note1 <= 100){
            c1.verbalNote = note1;
        }
        if(note2 >= 0 && note2 <= 100){
            c2.verbalNote = note2;
        }
        if(note3 >= 0 && note3 <= 100){
            c3.verbalNote = note3;
        }
    }

    public void printNotes(){
        System.out.println(c1.name + "Notu\t" + c1.calculateNote());
        System.out.println(c2.name + "Notu\t" + c2.calculateNote());
        System.out.println(c3.name + "Notu\t" + c3.calculateNote());
    }

    public void isPass(){
        this.average = (this.c1.calculateNote() + this.c2.calculateNote() + this.c3.calculateNote()) / 3.0;
        if(this.average > 55)
            System.out.println("Sınıf geçilmiştir! Ortalama:" + this.average);
        else
            System.out.println("Sınıf geçilemedi! Ortalama:" + this.average);
    }
}
