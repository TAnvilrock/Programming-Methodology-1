package logic;

public class EnterProfile {
    private Person person;
    private int bodyTemperature;

    public EnterProfile(Person person, int bodyTemperature) {
        setPerson(person);
        setBodyTemperature(bodyTemperature);
    }

    public boolean hasFever() {
        return bodyTemperature >= 37;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getBodyTemperature() {
        return bodyTemperature;
    }

    public void setBodyTemperature(int bodyTemperatureBody) {
        this.bodyTemperature = Math.max(35 , Math.min(bodyTemperatureBody , 42));
    }
}
