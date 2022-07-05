public class Employee {
    private static int idCount = 0;
    private int id;
    private int department;
    private String surname;
    private String name;
    private String middleName;
    private int salary;

    public Employee(String surname, String name, String middleName, int department, int salary) {
        if (department < 1) {
            throw new IllegalArgumentException("Департамент не может быть отрицательным числом.");
        }
        if (salary < 0) {
            throw new IllegalArgumentException("Зарплата не может быть отрицательным числом.");
        }

        this.id = idIncrease();
        this.department = department;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public int getDepartment() {
        return department;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getFullName() {
        return surname + ' ' + name + ' ' + middleName;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id " + id + ',' + " отдел " + department + ',' + " Ф.И.О. " + surname + ' '
                + name + ' ' + middleName + ',' + " зарплата " + salary + '.';
    }

    private int idIncrease() {
        return ++idCount;
    }

}
