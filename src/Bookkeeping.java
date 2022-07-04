public class Bookkeeping {
    public static void main(String[] args) {
        Employee[] employeeBase = new Employee[10];
        employeeBase[0] = new Employee("Петров", "Иван", "Сидорович", 1, 12000);
        employeeBase[1] = new Employee("Нечаев", "Петр", "Васильевич", 1, 13000);
        employeeBase[2] = new Employee("Сидоров", "Василий", "Петрович", 1, 14000);
        employeeBase[3] = new Employee("Бекетова", "Анна", "Васильевнв", 2, 15000);
        employeeBase[4] = new Employee("Зарев", "Михаил", "Артурович", 2, 21000);
        employeeBase[5] = new Employee("Пушкин", "Александр", "Сергеевич", 3, 22000);
        employeeBase[6] = new Employee("Сиськин", "Гиви", "Карэнович", 3, 23000);
        employeeBase[7] = new Employee("Могелева", "Кристина", "Аедреевна", 4, 24000);
        System.out.println(dataOfEmployees(employeeBase));
        System.out.println(summSalary(employeeBase));
        System.out.println(findEmployeesMinSalary(employeeBase));
        System.out.println(findEmployeesMaxSalary(employeeBase));
        System.out.println(avarageSalary(employeeBase));
        System.out.println(listOfEmployees(employeeBase));

    }

    private static String dataOfEmployees(Employee[] employees) {
        if (isEmptyBase(employees)) {
            return "None";
        }

        String dataOfEmployees = "";

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                dataOfEmployees += employees[i] + "\n";
            }
        }

        return dataOfEmployees;
    }


    private static String listOfEmployees(Employee[] employees) {
        if (isEmptyBase(employees)) {
            return "None";
        }

        String listOfEmployees = "";

        for (int i = 0; i < employees.length; i++) {

            if (employees[i] != null) {
                listOfEmployees += employees[i].getFullName() + "\n";
            }
        }

        return listOfEmployees;
    }

    private static int summSalary(Employee[] employees) {
        if (isEmptyBase(employees)) {
            return 0;
        }

        int summSalary = 0;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                summSalary += employees[i].getSalary();
            }
        }

        return summSalary;
    }

    private static String findEmployeesMinSalary(Employee[] employees) {
        if (isEmptyBase(employees)) {
            return "None";
        }

        int minSalary = employees[0].getSalary();
        int indexEmployeesMinSalary = 0;

        for (int i = 1; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() < minSalary) {
                    minSalary = employees[i].getSalary();
                    indexEmployeesMinSalary = i;
                }
            }
        }

        return employees[indexEmployeesMinSalary].getFullName();
    }

    private static String findEmployeesMaxSalary(Employee[] employees) {
        if (isEmptyBase(employees)) {
            return "None";
        }

        int maxSalary = employees[0].getSalary();
        int indexEmployeesMaxSalary = 0;

        for (int i = 1; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() > maxSalary) {
                    maxSalary = employees[i].getSalary();
                    indexEmployeesMaxSalary = i;
                }
            }
        }

        return employees[indexEmployeesMaxSalary].getFullName();
    }

    private static int avarageSalary(Employee[] employees) {
        if (isEmptyBase(employees)) {
            return 0;
        }

        int countEmployees = 0;
        int summSalary = summSalary(employees);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                countEmployees++;
            }
        }

        return Math.round(summSalary / countEmployees);
    }

    private static boolean isEmptyBase(Employee[] employees) {
        int countEmployees = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                countEmployees++;
            }
        }
        if (countEmployees == 0) {
            return true;
        } else {
            return false;
        }
    }


}