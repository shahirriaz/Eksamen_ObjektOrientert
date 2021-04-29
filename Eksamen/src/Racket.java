public class Racket extends Equipment {


    String typeOfRacket;
    boolean needNewCoating;

    public Racket(String typeOfEquipment, int id, String location, boolean mustBeChanged,  String typeOfRacket, boolean needNewCoating) {
        super(typeOfEquipment, id, location, mustBeChanged);
        this.typeOfRacket = typeOfRacket;
        this.needNewCoating = needNewCoating;
    }

    public String getTypeOfRacket() {
        return typeOfRacket;
    }

    public void setTypeOfRacket(String typeOfRacket) {
        this.typeOfRacket = typeOfRacket;
    }

    public boolean isNeedNewCoating() {
        return needNewCoating;
    }

    public void setNeedNewCoating(boolean needNewCoating) {
        this.needNewCoating = needNewCoating;
    }


    @Override
    public String toString() {
        return "Racket{" +
                "typeOfEquipment='" + typeOfEquipment + '\'' +
                ", id=" + id +
                ", location='" + location + '\'' +
                ", mustBeChanged=" + mustBeChanged +
                ", typeOfRacket='" + typeOfRacket + '\'' +
                ", needNewCoating=" + needNewCoating +
                '}';
    }
}



