import java.util.Locale;

public class CourseOfAction extends ObjectCreator{

    public void printBallsNeedingMoreAir(){

        System.out.println("Following balls need air:".toUpperCase(Locale.ROOT));
        for (Ball ball : getBallArrayList())
            if(ball.needsAir){
                System.out.println("Ball{" +
                                "typeOfEquipment='" + ball.getTypeOfEquipment() + '\'' +
                                ", typeOfBall='" + ball.getTypeOfBall()+ '\'' +
                                ", needsAir='" + ball.isNeedsAir() + '\'' +
                                ", id=" + ball.getId() +
                                ", location='" + ball.getLocation() + '\'' +
                                ", mustBeChanged='" + ball.isMustBeChanged() + '\'' +
                                '}');

            }

        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
    }


    public void printEquipmentNeedingToBeReplaced(){

        System.out.println("Following equipment must be changed:".toUpperCase(Locale.ROOT));
        for (Equipment equipment : getEquipmentList())
            if(equipment.mustBeChanged){
                System.out.println("Equipment{" +
                        "typeOfEquipment='" + equipment.getTypeOfEquipment()+ '\'' +
                        ", id=" + equipment.getId() +
                        ", location='" + equipment.getLocation() + '\'' +
                        ", mustBeChanged='" + equipment.isMustBeChanged() + '\'' +
                        '}');

            }
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
    }

    public void printTableTennisRacketsNeedingNewPad(){

        System.out.println("Following rackets need new coating:".toUpperCase());
        for (Racket racket : getRacketsArrayList())
            if(racket.needNewCoating){
                System.out.println("Racket{" +
                        "typeOfEquipment='" + racket.getTypeOfEquipment() + '\'' +
                        ", typeOfRacket='" + racket.getTypeOfRacket() + '\'' +
                        ", id=" + racket.getId() +
                        ", location='" + racket.getLocation() + '\'' +
                        ", mustBeChanged=" + racket.isMustBeChanged() +
                        ", needNewCoating=" + racket.isNeedNewCoating() +
                        '}');

            }
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
    }


    }

