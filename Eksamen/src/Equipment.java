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

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public String getTypeOfEquipment() {
        return typeOfEquipment;
    }

    public void setTypeOfEquipment(String typeOfEquipment) {
        this.typeOfEquipment = typeOfEquipment;
    }

    public boolean isMustBeChanged() {
        return mustBeChanged;
    }

    public void setMustBeChanged(boolean mustBeChanged) {
        this.mustBeChanged = mustBeChanged;
    }












}
