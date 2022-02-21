package homework4;
import java.util.Scanner;

public class EmployeeEx {
	
	public void inputStaffInfo(Staff[] staffs) {
		staffs[0].setName("John", "Smith");
		staffs[0].setAge(25);
		staffs[0].setPosition("Newcomer");
		staffs[0].setSalary(300);

		staffs[1].setName("Marry", "Anne");
		staffs[1].setAge(45);
		staffs[1].setPosition("Executive");
		staffs[1].setSalary(600);
		
		staffs[2].setName("Sue", "Jones");
		staffs[2].setAge(38);
		staffs[2].setPosition("Office manager");
		staffs[2].setSalary(450);	
	} //스태프정보 입력함수
	
	public void inputEngineerInfo(Engineer[] engineers) {
		engineers[0].setName("Bob", "Lewis");
		engineers[0].setAge(28);
		engineers[0].setPosition("Junior Engineer");
		engineers[0].setSalary(350);
		engineers[0].setOverworkingDay(17);
		
		engineers[1].setName("Lisa", "Barnes");
		engineers[1].setAge(37);
		engineers[1].setPosition("Senior Engineer");
		engineers[1].setSalary(580);
		engineers[1].setOverworkingDay(20);
		
		engineers[2].setName("Michael", "Kevin");
		engineers[2].setAge(46);
		engineers[2].setPosition("SW Manager");
		engineers[2].setSalary(650);
		engineers[2].setOverworkingDay(20);
	} //엔지니어정보 입력함수
	
	public void displayEmployeeInfo(Staff[] staffs, Engineer[] engineers) {
		displayStaffInfo(staffs);
		System.out.println("\n");
		displayEngineerInfo(engineers);
	} //employee 출력함수
	
	public void displayStaffInfo(Staff[] staffs) {
		System.out.println("[Staff]\n");
		System.out.printf("%13s %5s %15s %7s %13s\n","Name", "Age", "Position", "Salary", "Annual Salary");
		System.out.printf("---------------------------------------------------------\n");
		for (int i=0; i<3; i++)
			staffs[i].printEmployee();
	} //staff 출력함수
	
	public void displayEngineerInfo(Engineer[] engineers) {
		System.out.printf("[Engineer]\n");
		System.out.printf("%13s %5s %15s %16s %7s %15s\n","Name", "Age", "Position", "Overworking Pay", "Salary", "Annual Salary");
		System.out.printf("--------------------------------------------------------------------------------------------\n");
		for (int i=0; i<3; i++)
			engineers[i].printEmployee();
	} //engineer 출력함수
		
	public static void main(String[] args) {
		
		EmployeeEx employeeEx = new EmployeeEx();
		
		Staff[] staffs = new Staff[3];
		staffs[0] = new Staff();
		staffs[1] = new Staff();
		staffs[2] = new Staff();
		
		Engineer[] engineers = new Engineer[3];
		engineers[0] = new Engineer();
		engineers[1] = new Engineer();
		engineers[2] = new Engineer();
		
		employeeEx.inputStaffInfo(staffs);
		employeeEx.inputEngineerInfo(engineers);
		
		Scanner scanner = new Scanner(System.in);
		
		int j=0;
		do {
			int n=0;
			
			System.out.println("==============================================================");
			System.out.println("1. Display all employees' information (Staff, Engineer)");
			System.out.println("2. Display all staffs' information");
			System.out.println("3. Display all engineers' information");
			System.out.println("4. Display all employees' name, salary, annual salary");
			System.out.println("5. Display all employees' name, position ");
			System.out.println("0. Quit");
			System.out.println("==============================================================");
			
			n = scanner.nextInt();
			
			switch(n) {
			case 1:
				employeeEx.displayEmployeeInfo(staffs, engineers);
				System.out.println("");
				break;
				
			case 2:
				employeeEx.displayStaffInfo(staffs);
				System.out.println("");
				break;
				
			case 3:
				employeeEx.displayEngineerInfo(engineers);
				System.out.println("");
				break;
				
			case 4: 
				System.out.printf("[Staff]\n");
				System.out.printf("%13s %7s %10s\n","Name", "Salary", "Annual Salary");
				System.out.printf("---------------------------------------------------------\n");
				for(int i=0; i==2; i++) {
					System.out.printf("%13s %7d %10d", staffs[i].getName(), staffs[i].getSalary(), staffs[i].getAnnualSalary());
				}
				
				System.out.printf("[Engineer]\n");
				System.out.printf("%13s %7s %10s\n","Name", "Salary", "Annual Salary\n");
				System.out.printf("---------------------------------------------------------\n");
				for(int i=0; i==2; i++) {
					System.out.printf("%13s %7d %10d", engineers[i].getName(), engineers[i].getSalary(), engineers[i].getAnnualSalary());
				}
				
				System.out.println("");
				break;
				//제대로 실행하려면 employeeEx 안에서 함수를 생성해서 써야함
				
			case 5:
				System.out.printf("[Staff]\n");
				System.out.printf("%13s %15s","Name", "Position\n");
				System.out.printf("---------------------------------------------------------\n");
				for(int i=0; i==2; i++) {
					System.out.printf("%13s %15s", staffs[i].getName(), staffs[i].getPosition());
				}
				
				System.out.printf("[Engineer]\n");
				System.out.printf("%13s %15s","Name", "Position\n");
				System.out.printf("---------------------------------------------------------\n");
				for(int i=0; i==2; i++) {
					System.out.printf("%13s %15s", engineers[i].getName(), engineers[i].getPosition());
				}
				
				System.out.println("");
				break;
				//제대로 실행하려면 employeeEx 안에서 함수를 생성해서 써야함
				
			case 0:
				System.out.println("Bye!");
				j = 1;
				break;
				
			default:
				System.out.println("Wrong input. Try again!");
			}
			scanner.close();
		} while (j != 1);
			
	}
}
