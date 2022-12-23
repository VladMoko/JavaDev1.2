package com.go_it.gradleHomeWork.starter;

import com.go_it.gradleHomeWork.user.User;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        addPerson();
    }

    public static void addPerson(){
        Gson gson = new Gson();
        List<User> person = new ArrayList<>();
        person.add(new User("Vladislav", "Mokosieiev"));

        System.out.println(gson.toJson(person));
    }
}
