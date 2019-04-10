package telecommunication;

public class Telephone implements Telecommunication {
	
	public void dialNumber() {
		System.out.println("The telephone can dial numbers to make a call.");
		
	}

	@Override
	public void call() {
		System.out.println("You can make a phone call.");
	}

	@Override
	public void answerCall() {
		System.out.println("You can answer a call.");
	}

	@Override
	public void hangupCall() {
		System.out.println("You can hangup a call.");
	}

}
