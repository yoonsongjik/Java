interface PhoneInterface{
	final int TIMEOUT = 10000; 
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("**Phone**");
	}
}

class SamsungPhone implements PhoneInterface{
	@Override
	public void sendCall() {
		System.out.println("삐리리리링뽀로오오오오로로롱");
	}
	@Override
	public void receiveCall() {
		System.out.println("전화와따여");
	}
	
	
	public void flash()
	{
		System.out.println("불켜졌따여.");
	}
}
public class InterfaceEx {
	public static void main(String [] args)
	{
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
	}

}
