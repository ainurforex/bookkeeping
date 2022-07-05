public class Bookkeeping {
    public static void main(String[] args) {
        Employee[] employeeBase = new Employee[10];
        employeeBase[0] = new Employee("Петров", "Иван", "Сидорович", 1, 1000);
        employeeBase[1] = new Employee("Нечаев", "Петр", "Васильевич", 1, 2000);
        employeeBase[2] = new Employee("Сидоров", "Василий", "Петрович", 1, 3000);
        employeeBase[3] = new Employee("Бекетова", "Анна", "Васильевнв", 2, 50000);
        employeeBase[8] = new Employee("Зарев", "Михаил", "Артурович", 2, 8000);
        employeeBase[5] = new Employee("Пушкин", "Александр", "Сергеевич", 3, 70000);
        employeeBase[6] = new Employee("Сиськин", "Гиви", "Карэнович", 3, 75000);
        employeeBase[7] = new Employee("Могелева", "Кристина", "Андреевна", 4, 25000);

        System.out.println(dataOfEmployees(employeeBase));
        System.out.println(summSalary(employeeBase));
        System.out.println(findEmployeesMinSalary(employeeBase));
        System.out.println(findEmployeesMaxSalary(employeeBase));
        System.out.println(avarageSalary(employeeBase));
        System.out.println(listOfEmployees(employeeBase));

    }

    private static String dataOfEmployees(Employee[] employees) {
        int firstEnterInBase = firstEnterInBase(employees);
        if (firstEnterInBase == -1) {
            return "None";
        }

        String dataOfEmployees = "";

        for (int i = firstEnterInBase; i < employees.length; i++) {
            if (employees[i] != null) {
                dataOfEmployees += employees[i] + "\n";
            }
        }

        return dataOfEmployees;
    }


    private static String listOfEmployees(Employee[] employees) {
        int firstEnterInBase = firstEnterInBase(employees);
        if (firstEnterInBase == -1) {
            return "None";
        }

        String listOfEmployees = "";

        for (int i = firstEnterInBase; i < employees.length; i++) {
            if (employees[i] != null) {
                listOfEmployees += employees[i].getFullName() + "\n";
            }
        }

        return listOfEmployees;
    }

    private static int summSalary(Employee[] employees) {
        int firstEnterInBase = firstEnterInBase(employees);
        if (firstEnterInBase == -1) {
            return 0;
        }

        int summSalary = 0;

        for (int i = firstEnterInBase; i < employees.length; i++) {
            if (employees[i] != null) {
                summSalary += employees[i].getSalary();
            }
        }

        return summSalary;
    }

    private static String findEmployeesMinSalary(Employee[] employees) {
        int firstEnterInBase = firstEnterInBase(employees);
        if (firstEnterInBase == -1) {
            return "None";
        }

        int minSalary = employees[firstEnterInBase].getSalary();
        int indexEmployeesMinSalary = firstEnterInBase;

        for (int i = firstEnterInBase; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                indexEmployeesMinSalary = i;
            }

        }

        return employees[indexEmployeesMinSalary].getFullName();
    }

    private static String findEmployeesMaxSalary(Employee[] employees) {
        int firstEnterInBase = firstEnterInBase(employees);
        if (firstEnterInBase == -1) {
            return "None";
        }
        int maxSalary = employees[firstEnterInBase].getSalary();
        int indexEmployeesMaxSalary = firstEnterInBase;

        for (int i = firstEnterInBase; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                indexEmployeesMaxSalary = i;
            }

        }

        return employees[indexEmployeesMaxSalary].getFullName();
    }

    private static int avarageSalary(Employee[] employees) {
        int firstEnterInBase = firstEnterInBase(employees);
        if (firstEnterInBase == -1) {
            return 0;
        }

        int countEmployees = 0;
        int summSalary = summSalary(employees);

        for (int i = firstEnterInBase; i < employees.length; i++) {
            if (employees[i] != null) {
                countEmployees++;
            }
        }

        return Math.round(summSalary / countEmployees);
    }


    private static int firstEnterInBase(Employee[] employees) {

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                return i;
            }
        }
        System.out.println("Запись в базе отсутствует.");
        return -1;
    }

}