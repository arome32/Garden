
public class Tree extends Plant {

	public Tree(String type, int xpos, int ypos) {
		super(type, xpos, ypos);
		if (type.equals("coconut"))
			this.setRepresentation("C");
		else if (type.equals("pine")) {
			this.setRepresentation("P");
		} else if (type.equals("banana")) {
			this.setRepresentation("B");
		}
	}

	@Override
	public String toString() {
		return this.getRepresentation();
	}

	@Override
	public String funFact() {
		String fFact = "";
		if (type.equals("coconut"))
			fFact = "Coconut trees can grow up to 30 meters high.";
		else if (type.equals("pine")) {
			fFact = "Pines trees can live between 100–1,000 years old.";
		} else if (type.equals("banana")) {
			fFact = "Bananas contain a natural chemical which can make people feel happy!";
		}
		return fFact;
	}

}
