package be.oak3.enums;

public enum Geslacht {

    MAN("M"), VROUW("V"), TRANSGENDER("X"){
        @Override
        public String toString() {
            return "Specialeke!";
        }
    };

    private String afkorting;

    private Geslacht(String afkorting){
        this.afkorting = afkorting;
    }

    public String getAfkorting() {
        return afkorting;
    }

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
