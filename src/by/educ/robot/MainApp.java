package by.educ.robot;

public class MainApp {

	public static void main(String[] args) {
		// ������ r1 ��������� �� ���� ������
		Robot r1 = new Robot();
		// ������ r2 ��������� �� ������ ������
		Robot r2 = new Robot();
		// ���������� �������� ���� X � ���������� r1
		r1.x = 99;
		r2.x = 123;
		// ���������� ���� X
		System.out.println(r1.x);
		System.out.println(r2.x);
	}

}
