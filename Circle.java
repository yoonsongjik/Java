//메인에서 생성자에 매개변수를 안넣으면 에러가난다 -> 매개변수가없는생성자를 생성안해서,
//this.은 자기자신 this는 다른개체
public class Circle {
	int radius;
	String name;
	public Circle(int radius, String name){
		this.radius = radius;
		this.name = name;
	}
	public Circle(int radius) {
		this(radius, "AAA");
	}
	void set(int radius) {
		this.radius = radius;
	}
	void Print_name() {
		System.out.println(this.name);
	}
	
	public static void main(String [] args)
	{
		Circle ob1 = new Circle(1);
		ob1.Print_name();
	}
}
