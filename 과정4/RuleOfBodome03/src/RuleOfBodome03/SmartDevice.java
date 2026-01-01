package RuleOfBodome03;

//스마트 기기
class SmartDevice extends DeviceDetails implements Device {
	private String feature;
	
	public SmartDevice(String model, String feature) {
		super(model);
		this.feature = feature;
		System.out.print("스마트 기기가 생성되었습니다 : ");
		displayBasicInfo();
		if (feature != null) {
			System.out.println(", " + feature);
		}
		System.out.println();
	}

	public void activateFeature() {
		if (!isPoweredOn()) {
			System.out.println(model + " 전원이 꺼져 있어 고급 기능을 활성화할 수 없습니다.");
			return;
		}
		if (feature == null || feature.trim().isEmpty()) {
			System.out.println(model + " 고급 기능이 정의되어 있지 않습니다.");
			return;
		}
		System.out.println(model + " 고급 기능을 활성화 시켰습니다.");
	}

	@Override
	public void displayInfo() {
		displayBasicInfo();
		if (feature != null) {
			System.out.print("고급 기능: " + feature);
		}
	}

	@Override
	public String getName() {
		return model;
	}
}