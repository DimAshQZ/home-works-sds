package pro.sky.java.course1.coursework;

import java.util.Objects;


public class EmployeeBook {
    private final Employee[] employees;

    public EmployeeBook() {
        this.employees = new Employee[10];
    }

    public void getAllEmployeesInfo() {
        System.out.println("\n Список всех сотрудников:");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public double calcSalarySum() {
        double sum = 0.0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public Employee getMinSalaryEmployee() {
        double minSalary = Double.MAX_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public Employee getMaxSalaryEmployee() {
        double maxSalary = 0;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public double calcAverageSalary() {
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                count++;
            }
        }
        return calcSalarySum() / count;
    }

    public void printAllEmployeesName() {
        for (Employee employee : employees) {
            System.out.println(employee.getId() + ") " + employee.getName());
        }
    }

    public void indexationOfWages(double percent) {
        for (Employee employee : employees) {
            employee.setSalary(percent / 100 * employee.getSalary());
        }
    }

    public Employee getMinSalaryEmployeeOfDepartment(int department) {
        double minSalary = Integer.MAX_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public Employee getMaxSalaryEmployeeOfDepartment(int department) {
        double maxSalary = 0;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public double calcSalarySumOfDepartment(int department) {
        double sum = 0.0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public double calcAverageSalaryOfDepartment(int department) {
        int count = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                count++;
            }
        }
        return calcSalarySumOfDepartment(department) / count;
    }

    public void indexationOfWagesOfDepartment(int department, double percent) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                employee.setSalary(percent / 100 * employee.getSalary());
            }
        }
    }

    public void printAllEmployeesInfoOfDepartment(int department) {
        System.out.println("\n Все сотрудники " + department + " отдела.");
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.println("ФИО: " + employee.getName() +
                        ", ЗП: " + employee.getSalary() +
                        ", id: " + employee.getId());
            }
        }
    }

    public void printAllEmployeesWithLessSalary(double salary) {
        System.out.println("\n Все сотрудники c ЗП меньше " + salary);
        for (Employee employee : employees) {
            if (employee.getSalary() < salary) {
                System.out.println("ФИО: " + employee.getName() +
                        ", ЗП: " + employee.getSalary() +
                        ", id: " + employee.getId());
            }
        }
    }

    public void printAllEmployeesWithSalaryMore(double salary) {
        System.out.println("\n Все сотрудники c ЗП больше " + salary);
        for (Employee employee : employees) {
            if (employee.getSalary() >= salary) {
                System.out.println("ФИО: " + employee.getName() +
                        ", ЗП: " + employee.getSalary() +
                        ", id: " + employee.getId());
            }
        }
    }

    public void addEmployee(String name, int department, double salary) {
        Employee newEmployee = new Employee(name, department, salary);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = newEmployee;
                return;
            }
        }
        System.out.println("\n Нет вакантных мест");
    }

    public void deleteEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
            }
        }
    }

    public void changeEmployee(String name, double salary) {
        for (Employee employee : employees) {
            if (Objects.equals(employee.getName(), name)) {
                employee.setSalary(salary);
            }
        }
    }

    public void changeEmployee(String name, int department) {
        for (Employee employee : employees) {
            if (Objects.equals(employee.getName(), name)) {
                employee.setDepartment(department);
            }
        }
    }

    public void printEmployeesByDepartment() {
        System.out.println("\n ФИО всех сотрудников по отделам");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " отдел");
            for (Employee employee : employees) {
                if (employee.getDepartment() == i) {
                    System.out.println(employee.getName());
                }
            }
        }
    }
}