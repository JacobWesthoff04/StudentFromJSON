package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        Gson gson = new Gson();

        try {
            //Reads JSON file
            FileReader reader = new FileReader("students.json");

            //Define the type for List<Student>
            Type studentListType = new TypeToken<ArrayList<Student>>() {}.getType();
            ArrayList<Student> students = gson.fromJson(reader, studentListType);

            gson.fromJson(reader, Student.class);

            //Prints each student
            for (Student student : students) {
                System.out.println(student);
            }

            //Error handling
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}