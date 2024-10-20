import java.util.ArrayList;

public class Race {
    ArrayList<Car> cars;
    public Race(ArrayList<Car> cars){
        this.cars = cars;
    }
    public String whoIsWinner(){
        int max = 0;
        int index = 0;
        int[] myArray = new int[3];
        for (int i = 0; i < 3; i++) {
            myArray[i] = cars.get(i).speed*24;
        }
        for (int i = 0; i < 3; i++) {
            if(myArray[i]>max){
                max = myArray[i];
                index = i;
            }
        }
        return cars.get(index).name;
    }
}
