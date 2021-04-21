package ua.edu.lnu.task.abstractclass;

/***
 * Створити абстрактний базовий клас працівник і похідні класи: працівник з погодинною оплатою праці,
 * штатний працівник, працівник з процентною ставкою. Визначити віртуальну функцію нарахування зарплати.
 * Проілюструвати роботу усіх методів.
 */
public class Main {
    public static void main(String[] args) {
        EmployeeWithInterestRate employee = new EmployeeWithInterestRate("Roman","Boya",1);
        System.out.println(employee.salaryAccrual());

    }
}
