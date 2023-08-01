public class ArrayCircle {
	int radius;
	public ArrayCircle(int radius) {
		this.radius = radius;
	}
	
	public static void main(String [] args)
	{
		ArrayCircle[] c = new ArrayCircle[10];
		for(int i = 0; i<10; i++)
		{
			c[i] = new ArrayCircle(i+1);
			System.out.println(c[i].radius);
		}
	}
}
