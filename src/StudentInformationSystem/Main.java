package StudentInformationSystem;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut", "TRH","05432123");
        Teacher t2 = new Teacher("Graman Bell","FZK","04050504");
        Teacher t3 = new Teacher("Külyutmaz","BIO","05365434");

        Course tarih = new Course("Tarih","101","TRH");
        Course fizik = new Course("Fizik","102","FZK");
        Course bio = new Course("Bioloji","103","BIO");

        fizik.addTeacher(t2);
        tarih.addTeacher(t1);
        bio.addTeacher(t3);

        Student student1 = new Student("Ali","1334","101",tarih,fizik,bio);

        student1.addBulkExamNote(100,65,23);
        student1.addBulkVerbalNote(95,45,67);
        student1.printNotes();
        student1.isPass();
    }
}
