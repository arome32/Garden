
public class Flower extends Plant {

	public Flower(String type, int xpos, int ypos) {
		super(type, xpos, ypos);
	}

	@Override
	public String toString() {
		String retVal = "";
		if (type.equals("sunflower"))
			retVal = "S";
		else if (type.equals("dasiy")) {
			retVal = "D";
		} else if (type.equals("tulip")) {
			retVal = "T";
		}
		return retVal;
	}

	public String funfact() {
		String fFact = "";
		if (type.equals("sunflower"))
			fFact = "Sunflowers were brought to Russia by royalty.";
		else if (type.equals("dasiy")) {
			fFact = "A daisy is actually two flowers in one.";
		} else if (type.equals("tulip")) {
			fFact = "Tulips are the symbol for love, passion, perfect lovers and romance.";
		}
		return fFact;
	}

}
