package ru.otus.hw.l_17;

public class App {
    public static void main(String[] args) {
        Person p1 = new Person("Mike", Position.MANAGER, 1L);
        Person p2 = new Person("Helen", Position.DEVELOPER, 2L);

        PersonDatabase db = new PersonDatabase();
        db.add(p1);
        db.add(p2);

        System.out.println(db.findById(p1.getId()));
        System.out.println(db.findById(p2.getId()));
        System.out.println(db.isManager(p1));
        System.out.println(db.isManager(p2));
        System.out.println(db.isEmployee(p1.getId()));
        System.out.println(db.isEmployee(p2.getId()));
    }
}
