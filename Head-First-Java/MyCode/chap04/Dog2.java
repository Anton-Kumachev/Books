class Dog2 {
	int size;
	String name;

	void bark() {
		if (size > 60) {
			System.out.println("Лает: Гав Гав!");
		} else if (size > 14) {
			System.out.println("Лает: Вуф Вуф!");
	} else {
			System.out.println("Лает: Тяф Тяф!");
		}
	}
}