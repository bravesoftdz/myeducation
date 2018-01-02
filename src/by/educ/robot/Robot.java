package by.educ.robot;

public class Robot {
	// ������� ���������� X
    public double x = 0;
    // ������� ���������� Y
    double y = 0;
    // ������� ���� (� ��������)
    double course = 0;
 
    // ������ ��������� ������
    public void printCoordinates() {
        System.out.println(x + "," + y);
    }
 
    // ������������ �� ��������� distance
    // ������, ��� ���� ���� ���������� � ��������. ��� ����, ��� �� �������� � ��������
    // �� ����������� ������� � ������� ����� ������� �� 180 � ���������� �� PI (�� - 3,14159)
    void forward(int distance) {
        // ��������� � ���� ������� X
        x = x + distance * Math.cos(course / 180 * Math.PI);
        // ��������� � ���� ������� Y
        y = y + distance * Math.sin(course / 180 * Math.PI);
    }
}
