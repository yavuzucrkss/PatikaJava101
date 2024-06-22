package BoksSimulation;

public class Main {

    public static void main(String[] args) {
        Fighter f1 = new Fighter("ALi",10,100,95,40);
        Fighter f2 = new Fighter("Veli",15,120,90, 30);

        Match match =new Match(f1,f2,80,100);
        match.run();
    }
}
