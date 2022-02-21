package homework5;
import java.util.Scanner;
import java.util.NoSuchElementException;

public class ConcertApp {
	
	public void inputKNUInfo(Concert knu) {
		knu.setTotal(30);
		knu.setReserved(0);
	} //knu정보 입력함수
		
	public static void main(String[] args) {
		int i=0; int j=0;
		
		Concert knu = new Concert("KNU Concert"); //객체생성
		ConcertApp concertapp = new ConcertApp(); //객체생성
		Scanner scanner = new Scanner(System.in);

		concertapp.inputKNUInfo(knu); //knu 정보 입력
		
		do {
			System.out.println("================================");
			System.out.println("Concert Reservation System");			
			System.out.println("1. Show seats");
			System.out.println("2. Reservation of a seat");	
			System.out.println("3. Cancellation of a seat");				
			System.out.println("4. Quit");
			System.out.printf("Choose a menu: ");
		
			i = scanner.nextInt();
			
			switch (i) {
			case 1 :
				System.out.println("");
				knu.showSeat(knu);
				System.out.println("");
				break;
				
			case 2 :
				int r;
				
				System.out.println("");
				System.out.printf("Input a seat number for reservation: ");
				r = scanner.nextInt();
				
				if (r<1 || r>30) {
					System.out.println("Please input a seat number between 0 and 30.\n");
					knu.showSeat(knu);
				}
				else {
					int a; int b;
					a = r/10; //행 값
					b = r%10 - 1; //열 값
					
					if (knu.verifySeat(a,b) == 0) {
						knu.changeSeat(a,b);
						knu.setReserved(1);
						System.out.println("Reservation Success! \n");
						knu.showSeat(knu);
						}
					else {
						System.out.println("Already booked seat. Please input another number.\n");
						knu.showSeat(knu);
					}
				}
				
				System.out.println("");				
				break;
					
			case 3 :
				int c;
				
				System.out.println("");
				System.out.printf("Input a seat number for cancellation: ");
				c = scanner.nextInt();
		
				if (c<1 || c>30) {
					System.out.println("Please input a seat number between 0 and 30.\n");
					knu.showSeat(knu);
				}
				else {
					int a; int b;
					a = c/10; //행 값
					b = c%10 - 1; //열 값
					
					if (knu.verifySeat(a,b) == 1) {
						knu.changeSeat(a,b);
						knu.setReserved(-1);
						System.out.println("Cancellation Success! \n");
						knu.showSeat(knu);
						}
					else {
						System.out.println("Not booked seat. Please check the seat.\n");
						knu.showSeat(knu);
					}
				}
				
				System.out.println("");
				break;
					
			case 4 :
				System.out.println("");
				j = 1;
				System.out.println("Bye!");
				break;
					
			default :
				System.out.println("Out of menu. Try again!");
			}
			} while (j != 1);
		scanner.close();
	}
}
