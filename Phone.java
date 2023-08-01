
public class Phone {
	interface PhoneInterface{
		final int TIMEOUT = 10000;
		void sendCall();
		void receiveCall();
		default void printLogo() {
			System.out.println("**Phone**");
		}
	}
	public static void main(String [] args) {
		
	}
}
