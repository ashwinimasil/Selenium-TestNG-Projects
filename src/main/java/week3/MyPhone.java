package week3;

public class MyPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
iPhone iph = new iPhone();
iph.makeCall();
iph.sendSMS();
System.out.println("--------------------");

iOS ios = new iOS();
ios.shutDown();
ios.startApp();
ios.increaseVolume();
System.out.println("--------------------");

ipad ip = new ipad();
ip.watchMovie();


	}

}
