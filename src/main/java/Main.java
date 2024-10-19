import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int speed;
        ArrayList<Car> cars = new ArrayList<>();
        Scanner scannerName = new Scanner(System.in);
        Scanner scannerSpeed = new Scanner(System.in);
        for (int i = 0; i <3; i++) {
            System.out.println("Введите имя автомобиля "+(i+1));
            String name = scannerName.nextLine();
            while(true){
                System.out.println("Введите скорость автомобиля "+name);
                speed = scannerSpeed.nextInt();
                if(speed<=0 || speed>250){
                    System.out.println("Скорость введена неверно");
                }else{
                    break;
                }
            }
            cars.add(new Car(name,speed));
        }
        System.out.println("Самая быстрая машина: " + new Race(cars).whoIsWinner());
    }
}
