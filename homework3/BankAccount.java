package homework3;
import java.util.Scanner;

public class BankAccount  {
	String bankName;
	int initMoney;
	int balance;

	public BankAccount(String bankName, int initMoney) {
		this.bankName = bankName;
		this.initMoney = initMoney;
	} //생성자

	public void deposit(int money) {
		if (money%10000 == 0) {
			initMoney = initMoney + money;
			showBalance(); 
			}
		else
			System.out.println("10000원 단위의 금액을 입력하세요");
	} ///입금함수
	
	public void withdraw(int money) {
		if (money%10000 == 0) {
			if(money>initMoney)
				System.out.println("잔액이 모자랍니다");
			else {
				initMoney = initMoney - money;
				showBalance(); 
			}
		}
		else
			System.out.println("10000원 단위의 금액을 입력하세요");
	} ///출금함수
	
	public void showBalance() {
		balance = readBalance();
		System.out.println(bankName + "Bank의 잔액: " + balance);
	} ///계좌조회함수
	
	public int readBalance() {
		return initMoney;
	} ///잔액함수

	public static void main(String[] args) {
		int i; int j=0; int money;
		
		BankAccount abc = new BankAccount("ABCbank", 10000); //객체생성
		Scanner scanner = new Scanner(System.in);
		
	do {
		System.out.println(abc.bankName + "현금 입출금 프로그램 \n1.입금 \n2.출금 \n3.계좌조회 \n4.종료 \n>> ");
		i = scanner.nextInt();
		
		switch(i) {
		case 1:
			System.out.println("입금금액: ");
			money = scanner.nextInt();
			abc.deposit(money);
			break;
		case 2:
			System.out.println("출금금액: ");
			money = scanner.nextInt();
			abc.withdraw(money);
			break;
		case 3:
			abc.showBalance();
			break;
		case 4:
			j=1;
			System.out.println(abc.bankName + "종료합니다");
			break;
		default:
			System.out.println("잘못된 입력입니다. 다시 입력하세요.");
		}
		System.out.println("-------------------------------");
	} while (j != 1);
	
	scanner.close();
}
}


