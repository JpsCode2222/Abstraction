abstract class vehical {
    abstract void speed();
}

class car extends vehical {
    void speed(){
        System.out.println("Spede of Car is 180 km/hr");
    }
}

public class Scooter {
    void speed(){
        System.out.println("Speed of Scooter is 70 km/hr");
    }
    public static void main(String args[]){
        car BMW = new car();
        BMW.speed();
        Scooter Activa = new Scooter();
        Activa.speed();
    }
}