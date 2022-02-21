package homework5;

public class Concert {
	private String name;
	private int total;
	private int reserved;
	private int vacant;
	private int[][] seats = new int[3][10];
	
	public Concert(String name) {
		this.name = name;
		total = 0;
		reserved = 0;
		vacant = 0;
	} //생성자
	
	public void setTotal(int total) {
		this.total = total;
	} //전체좌석 입력함수
	
	public void setReserved(int reserved) {
		this.reserved += reserved;
	} //예약좌석 입력함수
	
	public int getTotal() {
		return total;
	} //전체좌석 출력함수
	
	public int getReserved() {
		return reserved;
	} //예약좌석 출력함수
	
	public int getVacant() {
		vacant = total - reserved;
		return vacant;
	} //잔여좌석 출력함수
	
	public void changeSeat(int i, int j) {
		if (seats[i][j] == 0)
			seats[i][j] = 1;
		else
			seats[i][j] = 0;
	} //선택반전함수
	
	public int verifySeat(int i, int j) {
		return seats[i][j];
	} //예약확인함수
	
	public void showSeat(Concert knu) {
		System.out.println("[ " + knu.name + " ]");
		System.out.printf("Total seats: %d, Reserved: %d, Vacant: %d\n", getTotal(), getReserved(), getVacant());
		System.out.println("--------------------------------");
		
		for (int i=0; i<3; i++)
		{
			for (int j=0; j<10; j++)
			{
				int k = 10*i+j;
				System.out.printf("%3d", k+1);
			} //좌석번호 출력
			System.out.println("");
			
			
			for (int j=0; j<10; j++)
			{
				if (seats[i][j] == 0)
					System.out.printf("%3s", 'O');
				else
					System.out.printf("%3s", 'X');
			} //예약여부 출력
			System.out.println("\n--------------------------------");
		}
	} //좌석출력함수
	
	public static void main(String[] args) {
	}

}
