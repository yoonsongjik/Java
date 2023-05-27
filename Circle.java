//객채생성 및 활용법

public class Circle {
	int radius;
	String name;
	
	public double getArea() {	//멤버 메소드
		return 3.14*radius*radius;
	}
	
	public static void main(String []args)
	{
		Circle pizza;	//Circle의 속성을 가진 pizza생성
		pizza = new Circle();
		
		pizza.radius = 10;			//속성 값 설정
		pizza.name = "자바피자";	
		
		double area = pizza.getArea(); 		//피자의 면적을 멤머메소드로 보내서 알아내기
		System.out.println(pizza.name + "의 면적은" + area);
		
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
	}
}
