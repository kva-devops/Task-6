package web.model;

public class Car {
    private String model;
    private int serial;
    private boolean isElectric;

    public Car(String model, int serial, boolean isElectric) {
        this.model = model;
        this.serial = serial;
        this.isElectric = isElectric;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }
}
