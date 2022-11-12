import java.util.Arrays;
import java.util.Comparator;

public class ComparableEmployee extends Employee implements Comparable<Employee> {
    public ComparableEmployee(int age, long salary, String name, int id) {

        super(age, salary, name, id);
    }

    @Override
    public int compareTo(Employee other) {
        return (int) (this.getSalary() - other.getSalary());
    }

    public static void main(String[] args) {
        ComparableEmployee[] employees = {
                new ComparableEmployee(25, 10000, "Mauro", 10),
                new ComparableEmployee(29, 20000, "Arturo", 20),
                new ComparableEmployee(35, 5000, "Lisa", 5),
                new ComparableEmployee(32, 50000, "Erica", 1),
        };
        Comparator ageComp = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (o1.getAge() - o2.getAge());
            }
        };

        Comparator idComp = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (o1.getId() - o2.getId());
            }
        };

        Comparator salaryComp = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary() - o2.getSalary());
            }
        };

        // Comparator nameComp = new Comparator<Employee>() {
        // @Override
        // public int compare(Employee o1, Employee o2) {

        // return (o1.getName() o2.getName());
        // }
        // };

        System.out.println(Arrays.toString(employees));

        Arrays.sort(employees);
        System.out.println("Arrays.sort:");
        System.out.println(Arrays.toString(employees));

        System.out.println("Arrays usando Comparator");

        System.out.println("Arrays.sort: AGE");
        Arrays.sort(employees, ageComp);
        System.out.println(Arrays.toString(employees));

        System.out.println("Arrays.sort: ID");
        Arrays.sort(employees, idComp);
        System.out.println(Arrays.toString(employees));

        System.out.println("Arrays.sort: SALARY");
        Arrays.sort(employees, salaryComp);
        System.out.println(Arrays.toString(employees));

    }

}
