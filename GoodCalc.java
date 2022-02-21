package april8;

public class GoodCalc extends Calculator{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double average(int[] a) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String [] args) {
		GoodCalc c = new GoodCalc();
		System.out.println(c.add(2,3));
		System.out.println(c.subtract(2,3));
		System.out.println(c.average(new int [] {2,3,4 }));
		}
	
	}
