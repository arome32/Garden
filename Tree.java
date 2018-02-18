
public class Tree extends Plant {

	public Tree(String type, int xpos, int ypos) {
		super(type, xpos, ypos);
	}

	@Override
	public String toString() {
		String retVal = "";
		if (type.equals("coconut tree"))
			retVal = "C";
		else if (type.equals("pine tree")) {
			retVal = "P";
		} else if (type.equals("banana tree")) {
			retVal = "B";
		}
		return retVal;
	}

	public String funfact() {
		String fFact = "";
		if (type.equals("coconut tree"))
			fFact = "Coconut trees can grow up to 30 meters high.";
		else if (type.equals("pine tree")) {
			fFact = "Pines trees can live between 100–1,000 years old.";
		} else if (type.equals("banana tree")) {
			fFact = "Bananas contain a natural chemical which can make people feel happy!";
		}
		return fFact;
	}

}
