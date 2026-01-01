package RuleOfBodome03;

public class RuleOfBodome03 {
    public static void main(String[] args) {
        // 기기 생성
        Device generalDevice = new GeneralDevice("도어 오프너");
        Device smartDevice = new SmartDevice("자동 거울", "기분을 인식해 옷을 추천하는 기능");

        // 컨트롤러 생성 및 등록
        DeviceController controller = new DeviceController();
        controller.registerDevice(generalDevice);
        controller.registerDevice(smartDevice);
        System.out.println();

        // 스마트 기기 전원 ON
        controller.powerOnDevice(smartDevice);
        // 스마트 기능 활성화
        controller.activateSmartFeature(smartDevice);
        System.out.println();

        // 일반 기기 전원 ON
        controller.powerOnDevice(generalDevice);
        System.out.println();

        // 모든 전자기기 전원 OFF
        controller.powerOffAllDevices();
    }
}
