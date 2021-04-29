public class Equipment {

    String typeOfEquipment;
    int id;
    String location;
    boolean mustBeChanged;


    public Equipment(String typeOfEquipment, int id, String location, boolean mustBeChanged) {
        this.typeOfEquipment = typeOfEquipment;
        this.id = id;
        this.location = location;
        this.mustBeChanged = mustBeChanged;
    }


    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public String getTypeOfEquipment() {
        return typeOfEquipment;
    }


    public boolean isMustBeChanged() {
        return mustBeChanged;
    }

    public void setMustBeChanged(boolean mustBeChanged) {
        this.mustBeChanged = mustBeChanged;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "typeOfEquipment='" + typeOfEquipment + '\'' +
                ", id=" + id +
                ", location='" + location + '\'' +
                ", mustBeChanged=" + mustBeChanged +
                '}';
    }











}
