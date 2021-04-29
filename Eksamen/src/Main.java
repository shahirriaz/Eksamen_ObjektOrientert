import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

     ObjectCreator objectCreator = new ObjectCreator();
     objectCreator.readFromFile();

     Todo todo = new Todo();
//     todo.printBallsNeedingMoreAir();
     todo.printEquipmentNeedingToBeReplaced();


    }
}
