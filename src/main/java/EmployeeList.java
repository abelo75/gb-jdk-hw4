import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class EmployeeList <T extends Employee> {
    private final List<T> employees = new LinkedList<>();

    public void add(T employee) {
        if (getById(employee.id()) != null) {
            throw new IllegalArgumentException("Employee with id " + employee.id() + " already exists");
        }
        employees.add(employee);
    }

    public List<T> getByExperience(Float experience) {
        return employees.stream()
                .filter(employee -> employee.experience().equals(experience))
                .toList();
    }

    public List<T> getByName(String name) {
        return employees.stream()
                .filter(employee -> employee.name().equalsIgnoreCase(name))
                .toList();
    }

    public T getById(String id) {
        Optional<T> result = employees.stream().filter(employee -> employee.id().equalsIgnoreCase(id))
                .findFirst();
        return result.orElse(null);
    }

    public List<String> getPhoneByName(String name) {
        return employees.stream()
                .filter(employee -> employee.name().equalsIgnoreCase(name))
                .map(Employee::phone)
                .toList();
    }

    public void printAll() {
        for (T employee : employees) {
            System.out.println(employee);
        }
    }

}
