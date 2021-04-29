import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Todo extends ObjectCreator{

    public void printBallsNeedingMoreAir(){

        for (Ball ball : getBallArrayList())
            if(ball.needsAir){
                System.out.println("Ball{" +
                        "typeOfBall='" + ball.getTypeOfBall()+ '\'' +
                                ", needsAir='" + ball.isNeedsAir() + '\'' +
                                ", id=" + ball.getId() +
                                ", location='" + ball.getLocation() + '\'' +
                                ", mustBeChanged='" + ball.isMustBeChanged() + '\'' +
                                '}');

            }
    }

    public void printEquipmentNeedingToBeReplaced(){
        for (Equipment equipment : getEquipmentList())
            if(equipment.mustBeChanged){
                System.out.println("Equipment{" +
                        "typeOfEquipment='" + equipment.getTypeOfEquipment()+ '\'' +
                        ", id=" + equipment.getId() +
                        ", location='" + equipment.getLocation() + '\'' +
                        ", mustBeChanged='" + equipment.isMustBeChanged() + '\'' +
                        '}');

            }
    }


    }

