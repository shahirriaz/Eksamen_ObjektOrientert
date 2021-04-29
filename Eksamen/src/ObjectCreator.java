import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
* Ettersom jeg fikk problemer med en metode som returnerte objeter valgte jeg å bruke en void som lager og legger til objekter til arraylisten
* Problemet med return metoden var at while løkken stoppet å kjøre etter første iteration, dermed fikk jeg bare opp det første objektet
* Jeg føler at programmet mitt dekker det oppgaven ber om i med at den lager objekter ut i fra informasjon i filen.
*
* */

public class ObjectCreator {

    private static List<Ball> ballArrayList;
    private static List<Racket> racketsArrayList;
    private static List<Equipment> equipmentList;


    public void readFromFileWithScanner() throws FileNotFoundException {

        File text = new File("D:\\Eksamen_ObjektOrientert\\equipment.txt");
        Scanner scanner = new Scanner(text);

        ballArrayList = new ArrayList<>();
        racketsArrayList = new ArrayList<>();

        int id;
        String typeOfEquipment;
        boolean mustBeChanged;
        boolean needAir;
        String location;
        boolean needNewCoating;
        String typeOfBall;

        while (scanner.hasNextLine()) {
            typeOfEquipment = scanner.next();
            if (typeOfEquipment.equals("Ball")) {
                id = scanner.nextInt();
                scanner.nextLine();
                location = scanner.nextLine();
                mustBeChanged = scanner.nextBoolean();
                typeOfBall = scanner.next();
                needAir = scanner.nextBoolean();

                ballArrayList.add(new Ball(typeOfEquipment, id, location, mustBeChanged, typeOfBall, needAir));

            } else if (typeOfEquipment.equals("TableTennisRacket")) {
                id = scanner.nextInt();
                scanner.nextLine();
                location = scanner.nextLine();
                mustBeChanged = scanner.nextBoolean();
                needNewCoating = scanner.nextBoolean();

                racketsArrayList.add( new Racket(typeOfEquipment, id, location, mustBeChanged, "Tennis", needNewCoating));
            }
            setBallArrayList(ballArrayList);
            setRacketsArrayList(racketsArrayList);

            /*Kombinerer begge listene slik at jeg får de brukt i CourseOfAction klassen*/
            equipmentList = Stream.concat(ballArrayList.stream(), racketsArrayList.stream())
                    .collect(Collectors.toList());

            setEquipmentList(equipmentList);
        }

    }

    public static List<Equipment> getEquipmentList() {
        return equipmentList;
    }

    public static void setEquipmentList(List<Equipment> equipmentList) {
        ObjectCreator.equipmentList = equipmentList;
    }



    public static List<Ball> getBallArrayList() {
        return ballArrayList;
    }

    public void setBallArrayList(List<Ball> ballArrayList) {
        ObjectCreator.ballArrayList = ballArrayList;
    }

    public static List<Racket> getRacketsArrayList() {
        return racketsArrayList;
    }

    public void setRacketsArrayList(List<Racket> racketsArrayList) {
        ObjectCreator.racketsArrayList = racketsArrayList;
    }


}

