public class Garden {

	Plant[][] garden;

	public Garden(int rows, int cols) {
		// TODO Auto-generated constructor stub
		garden = new Plant[rows][cols];
	}

	public void plant(String type, int x, int y) {
		switch (type) {
		case "banana tree":
		case "pine tree":
		case "coconut tree":
			this.garden[x][y] = new Tree(type, x, y);
			break;
		case "sunflower":
		case "tulip":
		case "dasiy":
			this.garden[x][y] = new Flower(type, x, y);
			break;
		case "tomato":
		case "potato":
		case "carrot":
			this.garden[x][y] = new Vegetable(type, x, y);
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
	}

	public void grow() {
		for (int i = 0; i < garden.length; i++) {
			for (int j = 0; j < garden[i].length; j++) {
				growHelper(garden[i][j]);
			}
		}
	}

	private void growHelper(Plant planty) {
		int curX = planty.getX();
		int curY = planty.getY();

		if (planty instanceof Tree) {
			// check top
			if (curY != 0) {
				garden[curX][curY - 1] = new Tree(planty.getType(), curX, curY);
			}
		} else if (planty instanceof Vegetable) {
			// check bottom
			if (curY != garden[0].length - 1) {
				garden[curX][curY + 1] = new Vegetable(planty.getType(), curX, curY);
			}
		} else if (planty instanceof Flower) {
			// check far left
			if (curX != 0) {
				garden[curX - 1][curY] = new Flower(planty.getType(), curX, curY);
			}
			// check far right
			if (curX != garden[0].length - 1) {
				garden[curX + 1][curY] = new Flower(planty.getType(), curX, curY);
			}
			// check top
			if (curY != 0) {
				garden[curX][curY - 1] = new Flower(planty.getType(), curX, curY);
			}
			// check bottom
			if (curY != garden[0].length - 1) {
				garden[curX][curY + 1] = new Flower(planty.getType(), curX, curY);
			}
		}
	}

	// Cuts down all trees
	public void cutDown() {
		for (int i = 0; i < garden.length; i++) {
			for (int j = 0; j < garden[i].length; j++) {
				if (garden[i][j] instanceof Tree) {
					garden[i][j] = null;
				}
			}
		}
	}

	// Harvests all vegetables
	public void harvest() {
		for (int i = 0; i < garden.length; i++) {
			for (int j = 0; j < garden[i].length; j++) {
				if (garden[i][j] instanceof Vegetable) {
					garden[i][j] = null;
				}
			}
		}
	}

	// Picks all flowers
	public void pick() {
		for (int i = 0; i < garden.length; i++) {
			for (int j = 0; j < garden[i].length; j++) {
				if (garden[i][j] instanceof Flower) {
					garden[i][j] = null;
				}
			}
		}
	}

	// Prints the Garden
	@Override
	public String toString() {
		String retVal = "";
		for (int i = 0; i < garden.length; i++) {
			for (int j = 0; j < garden[i].length; j++) {
				if (garden[i][j] == null) {
					retVal += ".";
				} else {
					retVal += garden[i][j].toString();
				}
			}
			retVal += "\n";
		}
		return retVal;
	}

	public void funFact(String type) {
		for (int i = 0; i < garden.length; i++) {
			for (int j = 0; j < garden[i].length; j++) {
				if (garden[i][j].getType() == type) {
					garden[i][j].funFact();
					return;
				}
			}
		}
	}

}
