import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int speed =0;
        String name = "";
        ArrayList<Car> cars = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <3; i++) {
            System.out.println("Введите имя автомобиля "+(i+1));
            while (true){
                name = scanner.nextLine();
                if(!name.trim().isEmpty()){
                    break;
                }
            }
            while(true){
                System.out.println("Введите скорость автомобиля "+name);
                if (scanner.hasNextInt()) {
                    speed = scanner.nextInt();
                    if(speed>0 && speed<=250){
                        break;
                    }else{
                        System.out.println("Скорость введена неверно");
                    }
                } else {
                    System.out.println("Некорректный ввод. Пожалуйста, введите целое число.");
                    scanner.next();
                }
            }
            cars.add(new Car(name,speed));
        }
        System.out.println("Самая быстрая машина: " + new Race(cars).whoIsWinner());
    }
}


