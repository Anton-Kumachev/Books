class Dog1 {
	String name;
	public static void main (String[] args) {
		// Создаём объект Dog и получаем к нему доступ
		Dog1 dog1 = new Dog1();
		dog1.bark();
		dog1.name = "Барт";

		// Теперь создадим массив типа Dog
		Dog1[] myDogs = new Dog1[3];
		// и поместим в него несколько элементов
		myDogs[0] = new Dog1();
		myDogs[1] = new Dog1();
		myDogs[2] = dog1;

		// Теперь получаем доступ к объектам Dog
		// с помощью ссылок из массива	
		myDogs[0].name = "Фред";
		myDogs[1].name = "Джордж";

		// Хмммм... какое имя у myDogs[2]?
		System.out.print("Имя последней собаки - ");
		System.out.println(myDogs[2].name);

		// Теперь переберём все элементы массива
		// и вызовем для каждого метод bark()
		int x = 0;
		while(x < myDogs.length) {
			myDogs[x].bark();
			x = x + 1;
		}
	}
	public void bark() {
		System.out.println(name + " сказал Гав!");
	}
	public void eat() {}
	public void chaseCat() {}
}