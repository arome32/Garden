
public class Flower extends Plant {

	private boolean bloomed;

	public Flower(String type, int xpos, int ypos) {
		super(type, xpos, ypos);
		this.bloomed = false;

		if (type.equals("sunflower"))
			this.setRepresentation("s");
		else if (type.equals("dasiy")) {
			this.setRepresentation("d");
		} else if (type.equals("rose")) {
			this.setRepresentation("r");
		}
	}

	@Override
	public String toString() {
		return this.getRepresentation();
	}

	@Override
	public String funFact() {
		String fFact = "";
		if (type.equals("sunflower"))
			fFact = "Sunflowers were brought to Russia by royalty.";
		else if (type.equals("dasiy")) {
			fFact = "A daisy is actually two flowers in one.";
		} else if (type.equals("rose")) {
			fFact = "Fun fact about roses";
		}
		return fFact;
	}

	public void bloom() {
		setBloom(true);

		if (type.equals("sunflower"))
			this.setRepresentation("S");
		else if (type.equals("dasiy")) {
			this.setRepresentation("D");
		} else if (type.equals("rose")) {
			this.setRepresentation("R");
		}
	}

	public boolean getBloom() {
		return bloomed;
	}

	public void setBloom(boolean bloomed) {
		this.bloomed = bloomed;
	}

}
