package task1;

public class TestStudents {

    public static void main(String[] args) {
        Student a = new Student("Peter");
        Student b = new Student("Allan");
        Student c = new Student("Kalle");

        Course basic = new Course("Basic Programming");
        Course programming = new Course("Programming");
        Course algorithm = new Course("Algorithms");
        Course web = new Course("Web Programming");
        Course databases = new Course("Databases");

        a.addCourse(programming);
        a.addCourse(algorithm);
        a.addCourse(web);
        a.addCourse(databases);

        b.addCourse(basic);
        b.addCourse(algorithm);

        c.addCourse(basic);
        c.addCourse(web);
        c.addCourse(databases);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(basic);
        System.out.println(algorithm);
        System.out.println(web);
        System.out.println(databases);
    }
}
