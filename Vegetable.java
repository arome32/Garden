public class Vegetable extends Plant {

	public Vegetable(String type, int xpos, int ypos) {
		super(type, xpos, ypos);
	}

	@Override
	public String toString() {
		String retVal = "";
		if (type.equals("carrot"))
			retVal = "V";
		else if (type.equals("potato")) {
			retVal = "0";
		} else if (type.equals("tomato")) {
			retVal = "O";
		}
		return retVal;
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

}
