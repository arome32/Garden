import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Garden {

	Plant[][] garden;
	HashMap<String, Integer> hashy;

	public Garden(int rows, int cols) {
		// TODO Auto-generated constructor stub
		garden = new Plant[rows][cols];
		hashy = new HashMap<>();
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

	private void addToStorage(String type) {
		if (hashy.containsKey(type)) {
			hashy.put(type, hashy.get(type) + 1);
		} else {
			hashy.put(type, 1);
		}
	}

	private void removeFromStorage(String type) {
		if (hashy.containsKey(type) && hashy.get(type) != 0) {
			hashy.put(type, hashy.get(type) - 1);
		} else {
			System.out.println(type + " cannot be removed.");
		}
	}

	// Cuts down all trees
	public void cutDown(String type) {
		ArrayList<String> trees = new ArrayList<String>();
		trees.add("pine");
		trees.add("coconut");
		trees.add("banana");

		for (int i = 0; i < garden.length; i++) {
			for (int j = 0; j < garden[i].length; j++) {
				if (trees.contains(type)) {
					if (garden[i][j].getType().equals(type)) {
						garden[i][j] = null;
						addToStorage(type);
					}
				} else {
					System.out.println("You cannot cut down a " + type);
				}
			}
		}
	}

	// Harvests all vegetables
	public void harvest(String type) {
		ArrayList<String> trees = new ArrayList<String>();
		trees.add("carrot");
		trees.add("potato");
		trees.add("tomato");

		for (int i = 0; i < garden.length; i++) {
			for (int j = 0; j < garden[i].length; j++) {
				if (trees.contains(type)) {
					if (garden[i][j].getType().equals(type)) {
						garden[i][j] = null;
						addToStorage(type);
					}
				} else {
					System.out.println("You cannot cut down a " + type);
				}
			}
		}
	}

	// Picks all flowers
	public void pick(String type) {
		ArrayList<String> trees = new ArrayList<String>();
		trees.add("sunflower");
		trees.add("tulip");
		trees.add("dasiy");

		for (int i = 0; i < garden.length; i++) {
			for (int j = 0; j < garden[i].length; j++) {
				if (trees.contains(type)) {
					if (garden[i][j].getType().equals(type)) {
						garden[i][j] = null;
						addToStorage(type);
					}
				} else {
					System.out.println("You cannot cut down a " + type);
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

	public void eat(String type) {
		// TODO Auto-generated method stub
		switch (type) {
		case "carrot":
		case "potato":
		case "tomato":
			removeFromStorage(type);
			break;
		default:
			System.out.println("You cannot eat a " + type);
			break;
		}
	}

	public void smell(String type) {
		// TODO Auto-generated method stub
		switch (type) {
		case "sunflower":
		case "tulip":
		case "daisy":
			removeFromStorage(type);
			break;
		default:
			System.out.println("You cannot smell a " + type);
			break;
		}
	}

	public void paper(String type) {
		// TODO Auto-generated method stub
		switch (type) {
		case "pine":
		case "coconut":
		case "banana":
			removeFromStorage(type);
			break;
		default:
			System.out.println("You cannot create paper from a " + type);
			break;
		}
	}

	public void stats() {
		// TODO Auto-generated method stub

	}
}
