public class TestTV {
	public static void main(String [] args) {
		TV tv1 = new TV();
		tv1.turnOn();
		tv1.setChannel(13);
		tv1.setVolume(3);

		//Second TV 
		TV tv2 = new TV();
		tv2.turnOn();
		tv2.setChannel(118);
		tv2.setVolume(6);

		System.out.println("Tv1 is on channel " + tv1.channel + " and has a volume of " + tv1.volumeLevel+" ."); 

		System.out.println("Tv2 is on channel "+tv2.channel+" with volume "+tv2.volumeLevel);
	}
}
