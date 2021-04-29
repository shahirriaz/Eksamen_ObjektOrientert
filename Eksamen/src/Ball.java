public class Ball extends Equipment{

    String typeOfBall;
    boolean needsAir;



    public Ball(String typeOfEquipment, int id, String location, boolean mustBeChanged, String typeOfBall, boolean needAir) {
        super(typeOfEquipment, id, location, mustBeChanged);
        this.typeOfBall = typeOfBall;
        this.needsAir = needAir;

    }



    public boolean isNeedsAir() {
        return needsAir;
    }

    public String getTypeOfBall() {
        return typeOfBall;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "typeOfEquipment='" + typeOfEquipment + '\'' +
                ", typeOfBall='" + typeOfBall + '\'' +
                ", needsAir='" + needsAir + '\'' +
                ", id=" + id +
                ", location='" + location + '\'' +
                ", mustBeChanged='" + mustBeChanged + '\'' +
                '}';
    }
}
