package pro.sky.java.course1.coursework;

public class Coursework {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addEmployee("Джефф Безос", 1, 177000);
        employeeBook.addEmployee("Илон Маск", 2, 151000);
        employeeBook.addEmployee("Бернар Арно", 3, 150000);
        employeeBook.addEmployee("Билл Гейтс", 4, 124000);
        employeeBook.addEmployee("Марк Цукерберг", 5, 97000);
        employeeBook.addEmployee("Уоррен Баффет", 1, 96000);
        employeeBook.addEmployee("Ларри Эллисон", 2, 93000);
        employeeBook.addEmployee("Ларри Пейдж", 3, 91500);
        employeeBook.addEmployee("Сергей Брин", 4, 89000);
        employeeBook.addEmployee("Мукеш Амбани", 5, 84500);

        employeeBook.getAllEmployeesInfo();// Базовая сложность 8a
        System.out.println("\nСумма затрат на ЗП в месяц: " + employeeBook.calcSalarySum());// Базовая сложность 8b
        System.out.println("\nСотрудник с минимальной ЗП: " + employeeBook.getMinSalaryEmployee());// Базовая сложность 8c
        System.out.println("\nСотрудник с максимальной  ЗП: " + employeeBook.getMaxSalaryEmployee());// Базовая сложность 8d
        System.out.println("\n Среднее значение зарплат: " + employeeBook.calcAverageSalary());// Базовая сложность 8e
        employeeBook.printAllEmployeesName();// Базовая сложность 8f

        employeeBook.indexationOfWages(150);// Повышенная сложность 1
        employeeBook.getAllEmployeesInfo();
        System.out.println("\nСотрудник с минимальной ЗП из 2 отдела: " + employeeBook.getMinSalaryEmployeeOfDepartment(2));// Повышенная сложность 2a
        System.out.println("\nСотрудник с максимальной ЗП из 5 отдела: " + employeeBook.getMaxSalaryEmployeeOfDepartment(5));// Повышенная сложность 2b
        System.out.println("\nСумма затрат на ЗП в месяц в 3 отделе: " + employeeBook.calcSalarySumOfDepartment(3));// Повышенная сложность 2c
        System.out.println("\nСреднее значение зарплат в 4 отделе: " + employeeBook.calcAverageSalaryOfDepartment(4));// Повышенная сложность 2d
        employeeBook.indexationOfWagesOfDepartment(1, 130);// Повышенная сложность 2e
        employeeBook.printAllEmployeesInfoOfDepartment(1);// Повышенная сложность 2f
        employeeBook.printAllEmployeesWithLessSalary(139000);// Повышенная сложность 3a
        employeeBook.printAllEmployeesWithSalaryMore(140000);// Повышенная сложность 3b
        employeeBook.deleteEmployee(8);// Очень сложно 4b
        employeeBook.getAllEmployeesInfo();
        employeeBook.addEmployee("Амансио Ортега",3,77000);// Очень сложно 4a
        employeeBook.getAllEmployeesInfo();
        employeeBook.changeEmployee("Амансио Ортега",155500.0);// Очень сложно 5a
        employeeBook.changeEmployee("Амансио Ортега",2);// Очень сложно 5b
        employeeBook.printEmployeesByDepartment();// Очень сложно 6
        employeeBook.addEmployee("Советбеков Димаш",1,900000);
        employeeBook.getAllEmployeesInfo();
    }
}
