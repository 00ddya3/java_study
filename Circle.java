package march25;

public class Circle {
	
	int radius; // 원의 반지름 필드
	String name; // 원의 이름 필드
	
	/* public Circle() { } // 원의 생성자
	
	public double getArea() { // 원의 면적 계산 메소드
	return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle pizza; 
		pizza = new Circle(); // Circle 객체 생성
		pizza.radius = 10; // 피자의 반지름을 10으로 설정
		pizza.name = "자바피자"; // 피자의 이름 설정
		double area = pizza.getArea(); // 피자의 면적 알아내기
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle donut = new Circle(); // Circle 객체 생성
		donut.radius = 2; // 도넛의 반지름을 2로 설정
		donut.name = "자바도넛"; // 도넛의 이름 설정
		area = donut.getArea(); // 도넛의 면적 알아내기
		System.out.println(donut.name + "의 면적은 " + area);
		*/
	
	public Circle(int radius) {this.radius = radius;}
	public void set(int radius) {this.radius = radius;}
	
	public static void main(String[] args) {
		Circle ob1 = new Circle(1);
		Circle ob2 = new Circle(2);
		Circle s;
		
		s=ob2;
		ob1=ob2;

		s.radius = 10;  // 얘를 변환시키면 모든 값이 변환 됨. 예기치 않은 변환을 야기할 수 있으므로 주의하여 사용
		System.out.println("ob1.radius = " + ob1.radius);
		System.out.println("ob2.radius = " + ob2.radius);
	}
}
