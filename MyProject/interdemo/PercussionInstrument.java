package interdemo;

public interface PercussionInstrument extends MusicalInstrument,
						ChildrenToy
{
	public void hit(String s);
	public void shake(String s);

}
