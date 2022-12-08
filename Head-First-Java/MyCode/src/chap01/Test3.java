class Test3 {
	public static void main (String [] args) {
		int x = 0;
		int y = 0;
		while (x < 5) {
			y = y + x;
			System.out.print(x + "" + y + " "); //00 11 21 32 42
			x = x + 1;
		}
	}
}