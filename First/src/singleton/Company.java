package singleton;

public class Company {
	private static Company instance = new Company();
	private Company() {} //private으로 설정했기에 외부에서 인스턴스 생성 불가능
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
