package ar.edu.unlp.info.oo2.ejercicio_1;

public class ReTweet extends Tweet{
	private Tweet reference;
	
	public ReTweet (String text, Tweet reference) {
		super(text,reference.getUser());
		this.setReference(reference);
	}
	
	public Tweet getReference() {
		return this.reference;
	}

	public void setReference(Tweet reference) {
		this.reference = reference;
	}

	
	
}
