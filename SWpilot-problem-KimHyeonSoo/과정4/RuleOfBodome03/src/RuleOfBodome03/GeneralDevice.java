package RuleOfBodome03;

//일반 기기
class GeneralDevice extends DeviceDetails implements Device {

 public GeneralDevice(String model) {
     super(model);
     System.out.print("일반 기기가 생성되었습니다 : ");
     displayBasicInfo();
     System.out.println();
 }

 @Override
 public void displayInfo() {
     displayBasicInfo();
 }

 @Override
 public String getName() {
     return model;
 }
}