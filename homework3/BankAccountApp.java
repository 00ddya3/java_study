package homework3;
import java.util.Scanner;

public class BankAccountApp {

	public static void main(String[] args) {
		String mybank;
		int mybalance;
		
		BankAccount abc = new BankAccount("ABCbank", 10000);
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("은행을 입력하세요");
		mybank = scanner.next();
		
		if ( mybank.equals(abc.bankName) )
			System.out.println(mybank + " 계좌의 잔액은 " + abc.initMoney + "입니다");
		else
			System.out.println(mybank + " 계좌가 존재하지 않습니다.");
		
		scanner.close();
	}

}
