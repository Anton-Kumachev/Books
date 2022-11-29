class Test5 {
	public static void main (String [] args) {
		int x = 0;
		int y = 0;
		while (x < 5) {
			x = x + 1;
			y = y - 1;
			System.out.print(x + "" + y + " "); //1-1 3-2 5-3
			x = x + 1;
		}
	}
}