//public class Employee {
//    private final String id;
//    private final String name;
//    private final String phone;
//    private final Float experience;
//
//    public Employee(String id, String name, String phone, Float experience) {
//        this.id = id;
//        this.name = name;
//        this.phone = phone;
//        this.experience = experience;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public Float getExperience() {
//        return experience;
//    }
//
//    @Override
//    public String toString() {
//        return name + ", id=" + id + ", phone=" + phone + ", experience=" + experience;
//    }
//}

public record Employee(String id, String name, String phone, Float experience) {

    @Override
    public String toString() {
        return name + ", id=" + id + ", phone=" + phone + ", experience=" + experience;
    }

    @Override
    public String id() {
        return id;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String phone() {
        return phone;
    }

    @Override
    public Float experience() {
        return experience;
    }
}
