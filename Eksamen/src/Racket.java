public class Racket extends Equipment {

    boolean needNewCoating;

    public Racket(String typeOfEquipment, int id, String location, boolean mustBeChanged, boolean needNewCoating) {
        super(typeOfEquipment, id, location, mustBeChanged);
        this.needNewCoating = needNewCoating;
    }

    @Override
    public String toString() {
        return "Racket{" +
                "typeOfEquipment='" + typeOfEquipment + '\'' +
                ", id=" + id +
                ", location='" + location + '\'' +
                ", mustBeChanged='" + mustBeChanged + '\'' +
                ", needNewCoating='" + needNewCoating + '\'' +
                '}';
    }

}



