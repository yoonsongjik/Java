//��ä���� �� Ȱ���

public class Circle {
	int radius;
	String name;
	
	public double getArea() {	//��� �޼ҵ�
		return 3.14*radius*radius;
	}
	
	public static void main(String []args)
	{
		Circle pizza;	//Circle�� �Ӽ��� ���� pizza����
		pizza = new Circle();
		
		pizza.radius = 10;			//�Ӽ� �� ����
		pizza.name = "�ڹ�����";	
		
		double area = pizza.getArea(); 		//������ ������ ��Ӹ޼ҵ�� ������ �˾Ƴ���
		System.out.println(pizza.name + "�� ������" + area);
		
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "�ڹٵ���";
		area = donut.getArea();
		System.out.println(donut.name + "�� ������ " + area);
	}
}
