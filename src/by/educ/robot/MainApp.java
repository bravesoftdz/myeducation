package by.educ.robot;

public class MainApp {

	public static void main(String[] args) {
		// Ссылка r1 указывает на один объект
		Robot r1 = new Robot();
		// Ссылка r2 указывает на ДРУГОЙ объект
		Robot r2 = new Robot();
		// Установить значение поля X у переменной r1
		r1.x = 99;
		r2.x = 123;
		// Напечатать поле X
		System.out.println(r1.x);
		System.out.println(r2.x);
	}

}
