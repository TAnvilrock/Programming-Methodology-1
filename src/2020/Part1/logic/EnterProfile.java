package logic;

public class EnterProfile {
    private Person person;
    private int bodyTemperatureBody;

    public EnterProfile(Person person, int bodyTemperatureBody) {
        setPerson(person);
        setBodyTemperatureBody(bodyTemperatureBody);
    }

    public boolean hasFever() {
        return bodyTemperatureBody >= 37;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getBodyTemperatureBody() {
        return bodyTemperatureBody;
    }

    public void setBodyTemperatureBody(int bodyTemperatureBody) {
        this.bodyTemperatureBody = Math.max(35 , Math.min(bodyTemperatureBody , 42));
    }
}
