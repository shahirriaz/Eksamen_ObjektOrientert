import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ObjectCreator {

    private static List<Ball> ballArrayList;
    private static List<Racket> racketsArrayList;


    private static List<Equipment> equipmentList;


    public void readFromFile() throws FileNotFoundException {

        File text = new File("D:\\Eksamen_ObjektOrientert\\equipment.txt");
        Scanner scanner = new Scanner(text);

        ballArrayList = new ArrayList<Ball>();
        racketsArrayList = new ArrayList<Racket>();


        String typeOfEquipment;
        int id;
        String location;
        boolean mustBeChanged;
        String typeOfBall;
        boolean needAir;

        boolean needNewCoating;

        /*FOR BALL*/
        while(scanner.hasNextLine()){
            typeOfEquipment = scanner.next();
            if(typeOfEquipment.equals("Ball")) {
                id = scanner.nextInt();
                scanner.nextLine();
                location = scanner.nextLine();
                mustBeChanged = scanner.nextBoolean();
                typeOfBall = scanner.next();
                needAir = scanner.nextBoolean();

                ballArrayList.add(new Ball(typeOfEquipment, id, location, mustBeChanged, typeOfBall, needAir));


            }
            else if(typeOfEquipment.equals("TableTennisRacket")){
                id = scanner.nextInt();
                scanner.nextLine();
                location = scanner.nextLine();
                mustBeChanged = scanner.nextBoolean();
                needNewCoating = scanner.nextBoolean();
                racketsArrayList.add(new Racket(typeOfEquipment, id, location, mustBeChanged, needNewCoating));

            }
            setBallArrayList(ballArrayList);
            setRacketsArrayList(racketsArrayList);

            equipmentList = Stream.concat(ballArrayList.stream(), racketsArrayList.stream())
                    .collect(Collectors.toList());

            setEquipmentList(equipmentList);

        }
//        for (Ball ball : ballArrayList )
//            System.out.println(ball.toString());
//
//        for (Racket racket: racketsArrayList )
//            System.out.println(racket.toString());
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

/*
* - type of equipment
* - id
* - location
* - mustBeChanged
* - type of ball
* - needsAir
*
*
*
* - type of equipment
* - id
* - location
* - mustBeChanged
* - type of racket
* - needsCoating
* */