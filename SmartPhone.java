package week3.day1;

public class SmartPhone extends AndroidPhone {
	
	public void connectWhatsApp() {
		
		System.out.println("Connect WhatsApp");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SmartPhone SP = new SmartPhone();
		
		SP.connectWhatsApp();
		
		SP.takeVideo();
		
		SP.sendMsg();
		
		SP.makeCall();
		
		SP.saveContact();
	

	}

}
