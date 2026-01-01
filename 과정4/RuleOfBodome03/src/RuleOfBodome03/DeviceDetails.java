package RuleOfBodome03;

abstract class DeviceDetails {
    String model;
    static final String BRAND = "DOMETech";
    boolean power;

    public DeviceDetails(String model) {
        this.model = model;
        this.power = false;
    }

    public void powerOn() {
        if (!power) {
            power = true;
            System.out.println(model + " 전원을 켰습니다.");
        }
    }

    public void powerOff() {
        if (power) {
            power = false;
            System.out.println(model + " 전원을 껐습니다.");
        }
    }

    public boolean isPoweredOn() {
        return power;
    }

    public String getModel() {
        return model;
    }

    public void displayBasicInfo() {
        System.out.print(model + ", " + BRAND);
    }
}