import java.util.Arrays;

public class Employee {
    private int id;
    private int age;
    private String name;
    private long salary;

    public Employee(int age, long salary, String name, int id) {
        // il this serve per utilizzare la variabile inserita nel cmapo
        // altrimenti ci sarebbe conflitto con il parametro del costruttore
        this.age = age;
        this.salary = salary;
        this.name = name;
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public long getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return String.format("Emlpoyee{age=%d, salary=%d, name='%s', id=%d}", age, salary, name, id);
        // return "Employee{"+"age= "+age+", salary= "+salary+", name= "+name+", id=
        // "+id+"}";
    }

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee(25, 10000, "Mauro", 10),
                new Employee(29, 20000, "Arturo", 20),
                new Employee(35, 5000, "Lisa", 5),
                new Employee(32, 50000, "Erica", 1),
        };
        System.out.println(Arrays.toString(employees));

        Arrays.sort(employees);
        System.out.println(Arrays.toString(employees));
    }

}
