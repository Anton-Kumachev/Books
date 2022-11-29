class Dog3 {

	void bark(int numOfBarks) {
		while (numOfBarks > 0) {
			System.out.println("Гав");
			numOfBarks = numOfBarks - 1;
		}
	}

	public static void main(String[] args) {
		Dog3 d = new Dog3();
		d.bark(3);
	}
}
