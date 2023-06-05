package part7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Task52 {
    public static void main(String[] args) throws IOException {
        File file = new File("persons.txt");
        FileWriter writer = new FileWriter(file);

        for (int i = 0; i < 10; i++) {
            String name = "Name" + i;
            String surname = "Surname" + i;
            int age = new Random().nextInt(100);

            Person person = new Person(name, surname, age);
            writer.write(person.toString() + "\n");
        }

        writer.close();
    }
}

class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
