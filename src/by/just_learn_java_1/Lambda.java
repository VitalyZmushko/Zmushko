package by.just_learn_java_1;

import java.util.ArrayList;
import java.util.HashSet;

public class Lambda {

    private static class Student {
        final int age;
        final String name;

        private Student(final int age, final String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

    }


    public static void main(String[] args) {
        final ArrayList<Student> students = new ArrayList<>() {{
            add(new Student(10, "AAAAA"));
            add(new Student(20, "BBBB"));
            add(new Student(30, "CCC"));
            add(new Student(40, "DD"));
            add(new Student(50, "EEEEE"));
        }};
       long count = students
                .parallelStream()
                .filter(student -> student.getAge() > 30)
                .map(Student::getName)
                .filter(name -> name == null || name.length() <= 5)
                .count();
        System.out.println(count);

        final ArrayList<Object> list = new ArrayList<>();
        final HashSet<Object> objects = new HashSet<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("5");
        list.add("6");
        list.add("6");

        retWithDuplic(list);
        System.out.println(list);
        System.out.println(retWithDuplic(list));
    }

    private static HashSet<Object> retWithDuplic(ArrayList<Object> list) {
        return new HashSet<>(list);
    }


}
