import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

     ObjectCreator objectCreator = new ObjectCreator();
     objectCreator.readFromFileWithScanner();


     /*OPPGAVE 3 og 4*/
        /*Forventer å se ball som trenger luft, utstyr som må byttes, og racket som trenger nytt belegg*/
        /*Programmet som oppgave 4 ber om er implementert under metodene i CourseOfAction metoden
        * Det vil printes ut det oppgaven ber om, er vertfall slik jeg har taklet oppgaven.
        * */

        CourseOfAction todo = new CourseOfAction();
        todo.printBallsNeedingMoreAir();
        todo.printEquipmentNeedingToBeReplaced();
        todo.printTableTennisRacketsNeedingNewPad();







    }
}
