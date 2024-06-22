package BoksSimulation;

public class Fighter {

    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    public Fighter(String name, int damage, int health, int weight,int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if(dodge >= 0 && dodge<= 100){
            this.dodge = dodge;
        }
        else
            this.dodge = 0;

    }

    public int hit(Fighter fighter){
        if(fighter.health - this.damage < 0) {
            return 0;
        }

        if(fighter.isDodge()){
            System.out.println(fighter.name + "hasarı dodgeladı");
            return  fighter.health;
        }

        System.out.println(this.name + " => " + fighter.name + " " + this.damage + " hasar vurdu.");
        return fighter.health - this.damage;
    }

    public boolean isDodge(){
        double randumNumber = Math.random() * 100;
        return randumNumber <= this.dodge;
    }
}
