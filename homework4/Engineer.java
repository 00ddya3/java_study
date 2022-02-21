package homework4;

public class Engineer extends Employee{
	int annualSalary;
	int overworkingDay;
	int overworkingPay;
	
	public void setOverworkingDay(int day) {
		this.overworkingDay = day;
	} //초과근무일수저장함수
	
	public int getOverworkingPay() {
		overworkingPay = overworkingDay*3;
		return overworkingPay;
	} //초과근무비용계산함수
	
	public int getAnnualSalary() {
		overworkingPay = getOverworkingPay();
		return 12*(getSalary() + overworkingPay);
	} //연봉계산함수
	
	public Engineer() {
		annualSalary = 0;
		overworkingDay = 0;
		overworkingPay = 0;
	} //생성자
	
	public void printEmployee() {
		System.out.printf("%13s %5d %15s %16d %7d %15d\n", getName(), getAge(), getPosition(), getOverworkingPay(), getSalary(), getAnnualSalary());
	}
}

