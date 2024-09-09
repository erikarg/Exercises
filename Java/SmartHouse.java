public class SmartHouse {
    public boolean isLampOn;

    public SmartHouse() {
        this.isLampOn = false;
    }

    public void turnLampOn() {
        this.isLampOn = true;
    }

    public void turnLampOff() {
        this.isLampOn = false;
    }

    public boolean isLampTurnedOn() {
        return isLampOn;
    }
}