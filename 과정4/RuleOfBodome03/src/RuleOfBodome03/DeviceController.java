package RuleOfBodome03;

import java.util.ArrayList;
import java.util.List;

class DeviceController {
    private List<Device> devices = new ArrayList<>();

    public void registerDevice(Device device) {
        devices.add(device);
        System.out.println("컨트롤러에 기기가 등록되었습니다 : " + device.getName());
    }

    public void powerOnDevice(Device device) {
        device.powerOn();
    }

    public void powerOffAllDevices() {
        System.out.print("모든 기기 전원을 종료합니다 : ");
        for (int i = devices.size() - 1; i >= 0; i--) {
            System.out.print(devices.get(i).getName());
            if (i != 0) System.out.print(", ");
        }
        System.out.println();
        for (Device device : devices) {
            device.powerOff();
        }
    }

    public void activateSmartFeature(Device device) {
        ((SmartDevice) device).activateFeature();
    }
}
