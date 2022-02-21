package homework4;
import java.util.Scanner;

public class Employee {	
	private int age;
	private String position;
	private String fullname;
	private int salary;
	
	public Employee() {
		fullname = "";
		age = 0;
		salary = 0;
		position = "";	
	} //생성자
	
	public void setAge(int age) {
		this.age = age;
	} //나이입력함수
	
	public void setPosition(String position) {
		this.position = position;
	} //직위입력함수
	
	public void setName(String firstname, String lastname) {
		this.fullname = firstname + " " + lastname ;
	} //이름입력함수

	public void setSalary(int salary) {
		this.salary = salary;
	} //월급입력함수
	
	public String getName() {
		return fullname;
	} //이름출력함수

	public int getSalary() {
		return salary;
	} //월급출력함수
	
	public String getPosition() {
		return position;
	} //직위출력함수
	
	public int getAge() {
		return age;
	} //나이출력함수
	
	public void printEmployee() {
		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
		System.out.println("Position: " + getPosition());
		System.out.println("------------------------------------------------------");
	} //직원정보출력함수
	
	public static void main(String[] args) {
	}
	
}
	
