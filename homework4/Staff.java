package homework4;

public class Staff extends Employee{
	private int annualSalary;
	
	public Staff() {
		annualSalary = 0;
	} //생성자
	
	public int getAnnualSalary() {
		annualSalary = (12*getSalary());
		return annualSalary;
	} //연봉계산함수
	
	public void printEmployee() {
		System.out.printf("%13s %5d %15s %7d %13d\n", getName(), getAge(), getPosition(), getSalary(), getAnnualSalary());
	}
	
	
}	
