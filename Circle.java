//���ο��� �����ڿ� �Ű������� �ȳ����� ���������� -> �Ű����������»����ڸ� �������ؼ�,
//this.�� �ڱ��ڽ� this�� �ٸ���ü
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
