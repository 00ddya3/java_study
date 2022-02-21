package june3;

class SharedBoard {

	private int sum = 0; // 집계판의 합

	synchronized public void add() {
		int n = sum;
		Thread.yield(); // 현재 실행중인 스레드 양보
		n += 10;
		sum = n; // 증가한 값을 집계합에 기록
		System.out.println(Thread.currentThread().getName() +" : " + sum);
	}
	
	public int getSum() {return sum;} 
	}

class StudentThread extends Thread {
	private SharedBoard board;

	public StudentThread(String name, SharedBoard board) {
		super(name);
		this.board = board;
	}
	
public void run() { 
	for(int i=0; i<10; i++)
		board.add();
	}
}

public class synchronizedEx {

	public static void main(String[] args) {
		SharedBoard board = new SharedBoard();
		Thread t1 = new StudentThread("Kitae", board);
		Thread t2 = new StudentThread("Hyosoo", board);
		t1.start();
		t2.start();
	}

}
