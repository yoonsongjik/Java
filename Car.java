import java.util.Scanner;
public class Car {
	//자동차 속성
	String carcolor;
	int carspeed=0;
	
	public int SpeedUp()
	{
		return carspeed++;
	}
	public int SpeedDown()
	{
		return carspeed--;
	}
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		Car k3;
		k3 = new Car();
		k3.carcolor = "black";
		System.out.println("k3의 색은 : " + k3.carcolor);
		k3.SpeedUp();
		System.out.println(k3.carspeed);
		
		
		Car k5;
		k5 = new Car();
		k5.carcolor = "white";
		System.out.println("K5의 색은 : " + k5.carcolor);
		k5.SpeedDown();
		System.out.println(k5.carspeed);
	}
}
