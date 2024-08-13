package controller;

public class mdcController {
	
	public mdcController() {
		super();
	}
	
	public int mdcRecursiva(int x, int y) {
		if (x == y) {
			return x;
		} else if (x > y) {
			return mdcRecursiva(x - y, y);
		} else {
			return mdcRecursiva(y, x);
		}
	}
}
