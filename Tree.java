
public class Tree extends Plant {

	public Tree(String type, int xpos, int ypos) {
		super(type, xpos, ypos);
	}

	@Override
	public String toString() {
		String retVal = "";
		if (type.equals("coconut"))
			retVal = "C";
		else if (type.equals("pine")) {
			retVal = "P";
		} else if (type.equals("banana")) {
			retVal = "B";
		}
		return retVal;
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
