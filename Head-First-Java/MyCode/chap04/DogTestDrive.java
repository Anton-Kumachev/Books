class DogTestDrive2 {

	public static void main (String[] args) {
		Dog2 one = new Dog2();
		one.size = 70;
		Dog2 two = new Dog2();
		two.size = 8;
		Dog2 three = new Dog2();
		three.size = 35;

		System.out.println("Пёс весом: " + one.size);
		one.bark();

		System.out.println("Пёс весом: " + two.size);
		two.bark();

		System.out.println("Пёс весом: " + three.size);
		three.bark();
	}
}