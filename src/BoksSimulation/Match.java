package BoksSimulation;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run(){
        if(isCheckWeigth()){
            int round = 1;
            while(true){
                System.out.println("Round" + round);
                double randomNumber = Math.random() * 100;
                if(randomNumber <= 50){
                    this.f2.health = f1.hit(f2);
                    if(isWin())
                        break;

                    this.f1.health = f2.hit(f1);
                    if(isWin())
                        break;
                }else if(randomNumber > 50){
                    this.f1.health = f2.hit(f2);
                    if(isWin())
                        break;

                    this.f2.health = f1.hit(f1);
                    if(isWin())
                        break;
                }

                printHealth();
                System.out.println("----------------------");
                round++;
            }
        }
        else
            System.out.println("Sikletler uyuşmuyor. Maç başlatılamadı.");
    }

    boolean isCheckWeigth(){
        return ((this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >=minWeight && this.f2.weight <= maxWeight));
    }

    boolean isWin(){
        if(this.f1.health <= 0){
            System.out.println(this.f2.name + "kazandı !");
            printHealth();
            return true;
        }
        else if(this.f2.health <= 0){
            System.out.println(this.f1.name + "kazandı !");
            printHealth();
            return true;
        }
        else
            return false;
    }

    void printHealth(){
        System.out.println(this.f1.name + "Sağlık: " + this.f1.health);
        System.out.println(this.f2.name + "Sağlık: " + this.f2.health);
    }
}
