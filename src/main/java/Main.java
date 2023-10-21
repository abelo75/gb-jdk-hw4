public class Main {
    public static void main(String[] args) {
        EmployeeList<Employee> employeeList = new EmployeeList<>();
        employeeList.add(new Employee("1", "Jack", "123456789", 1.0f));
        employeeList.add(new Employee("2", "Duck", "+123456789", 2.2f));
        employeeList.add(new Employee("3", "Heather", "+723456789", 12f));
        try {
            employeeList.add(new Employee("3", "Zoey", "+7123456789", 12f));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        employeeList.add(new Employee("4", "Zoey", "+71123456789", 12f));
        employeeList.add(new Employee("5", "Zoey", "+7112789", 12f));

        System.out.println("All employees:");
        employeeList.printAll();

        System.out.println();
        System.out.println("Employees with experience 12:");
        employeeList.getByExperience(12f).forEach(System.out::println);

        System.out.println();
        System.out.println("Phones for name Zoey:");
        employeeList.getPhoneByName("Zoey").forEach(System.out::println);

        System.out.println();
        System.out.println("Phones for name John:");
        employeeList.getPhoneByName("John").forEach(System.out::println);

        System.out.println();
        System.out.println("Employees with name Zoey:");
        employeeList.getByName("Zoey").forEach(System.out::println);

        System.out.println();
        System.out.println("Employee with id 2: " + employeeList.getById("2"));
    }
}
