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
		System.out.println("�߸��������Ƿο��������ηη�");
	}
	@Override
	public void receiveCall() {
		System.out.println("��ȭ�͵���");
	}
	
	
	public void flash()
	{
		System.out.println("����������.");
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
