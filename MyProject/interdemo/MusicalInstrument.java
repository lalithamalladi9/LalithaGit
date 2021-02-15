package interdemo;

import java.util.Random;

public interface MusicalInstrument {
	
	static final String PLAY_MSG= "Play";
	private static boolean isBroke() {
		boolean isBroke =false;
		Random r =new Random();
		int num= r.nextInt();
		if(num%2==0) {
			isBroke=true;
		}
		return isBroke;
	}
	
	public static String repair() {
		if(isBroke()) {
			return "Fixed";
		}
		return "Good";
	}
	
	public void demo();
	public void instrumentName();
	public void play(String s);
	/*private String playMsg() {
        return "Play a song";
    }*/

}
