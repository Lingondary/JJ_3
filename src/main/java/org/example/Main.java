package org.example;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        // Создание объекта Person
        Person person = new Person("John", "Doe", 30);

        // Сериализация объекта в JSON
        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println("Сериализованный объект: " + json);

        // Десериализация JSON в объект Person
        Person deserializedPerson = gson.fromJson(json, Person.class);
        System.out.println("Десериализованный объект: " + deserializedPerson);
    }
}
