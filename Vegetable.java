public class Vegetable extends Plant {

	private boolean ripened;

	public Vegetable(String type, int xpos, int ypos) {
		super(type, xpos, ypos);
		if (type.equals("lettuce"))
			this.setRepresentation("l");
		else if (type.equals("yams")) {
			this.setRepresentation("y");
		} else if (type.equals("tomato")) {
			this.setRepresentation("t");
		}
	}

	@Override
	public String toString() {
		return this.getRepresentation();
	}

	@Override
	public String funFact() {
		String fFact = "";
		if (type.equals("carrot"))
			fFact = "Carrots were originally purple in colour!";
		else if (type.equals("potato")) {
			fFact = "The first potatoes were cultivated in Peru about 7,000 years ago!";
		} else if (type.equals("tomato")) {
			fFact = "Tomatoes can be yellow, pink, purple, black and even white!";
		}
		return fFact;
	}

	public void ripen() {
		setRipen(true);

		if (type.equals("sunflower"))
			this.setRepresentation("S");
		else if (type.equals("dasiy")) {
			this.setRepresentation("D");
		} else if (type.equals("rose")) {
			this.setRepresentation("R");
		}
	}

	public boolean getRipen() {
		return ripened;
	}

	public void setRipen(boolean ripened) {
		this.ripened = ripened;
	}

}
