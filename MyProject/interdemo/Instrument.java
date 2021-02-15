package interdemo;

public class Instrument  implements ChildrenToy,PercussionInstrument,
				BrassInstrument,StringInstrument , MusicalInstrument
{

	@Override
	public void instrumentName() {
		System.out.println(" This is the Violin");
	}

	@Override
	public void play(String s) {
		System.out.println("Play Message"+s);
	}

	@Override
	public void bow(String s) {
		System.out.println(" Bow Message"+s);
		
	}

	@Override
	public void pluck(String s) {
		System.out.println("Pluck Message"+s);
		
	}

	@Override
	public void buzz(String s) {
		System.out.println("String Message"+s);
		
	}

	@Override
	public void hit(String s) {
		System.out.println(" Hit Message"+s);
		
	}

	@Override
	public void shake(String s) {
		System.out.println("Shake Message"+s);
		
	}

	@Override
	public void demo() {
		System.out.println("Demo Message");
		
	}

	
}
