class Point{
	private int x, y;
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class ObjectPropertyEx {
	public static void print(Object obj) {
		System.out.println(obj.getClass().getName());
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
		System.out.println(obj);
		}
}
