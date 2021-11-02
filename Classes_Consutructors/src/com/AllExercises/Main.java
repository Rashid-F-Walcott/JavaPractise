package com.AllExercises;

import com.AllExercises.Exercise1.Person;
//import com.AllExercises.Gender;
//import com.AllExercises.Nationality;


public class Main {
    public static void  main(String[] args) {

        Person personOne = new Person("James", "Bond", Nationality.BRITISH, Gender.MALE );


        System.out.println(personOne.getFirstName());
    }
}
