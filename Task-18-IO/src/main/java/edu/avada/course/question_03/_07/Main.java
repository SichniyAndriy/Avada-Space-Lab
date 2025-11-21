package edu.avada.course.question_03._07;

import java.util.ArrayList;
import java.util.List;
import net.datafaker.Faker;

/*
* Создать класс User, у которого будут поля: имя, фамилия и возраст.
* Также создать два класса: SerializeUsers и DeserializeUsers.
* В первом классе необходимо создать коллекцию класса User и сохранить их в файл.
* Во втором же классе необходимо получить сохраненную коллекцию из первого класса и вывести ее в консоль.
*/
public class Main {
    public static void main(String[] args) {
        List<User> newUsers = initCollection();

        UserSerializer.serialize(newUsers);

        List<User> deserialized = UserDeSerializer.deserialize();
        deserialized.forEach(System.out::println);
    }

    private static List<User> initCollection() {
        Faker faker = new Faker();
        List<User> users = new ArrayList<>();
        int len = faker.random().nextInt(10, 15);
        for (int i = 0; i < len; ++i) {
            String firstName = faker.name().firstName();
            String lastName = faker.name().lastName();
            Integer age = faker.random().nextInt(15, 55);
            users.add(new User(firstName, lastName, age));
        }
        return users;
    }
}
