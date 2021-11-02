package com.AllExercises.Exercise1;

import com.AllExercises.Gender;
import com.AllExercises.Nationality;

import java.time.LocalDate;

//

   // Date dateOfBirth = new Date();     // ngl not certain about this line but rest is golden

    //so first the class needs to be named and given its properties
    
    public class Person {
        private String firstName;
        private String lastName;
        private Nationality nationality;
        private Gender gender;
        private LocalDate dateOfBirth;

        // Then a constructor is created for the class from these properties


        public Person(String firstName, String lastName, Nationality nationality, Gender gender) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.nationality = nationality;
            this.gender = gender;
            this.dateOfBirth = dateOfBirth;
        }


    // then the Getters and Setters need to be added to allow values to be set for the properties such as name = jeff
     //easiest to list them as a getter/setter pair in this case

        public String getFirstName() {
            return firstName;
        }
        public void setFirstName(){
            this.firstName = firstName;
        }
// so above is the first getter/setter pair for the property of first name , note the void type when using setter
// because nothing is being returned inside that function.

        public String getLastName() {
            return lastName;
        }
        public void setLastName(){
            this.lastName = lastName;
        }
// and again
        public Nationality getNationality() {
            return nationality;
        }
        public void setNationality(Nationality nationality){
            this.nationality = nationality;
        }
 // and again

        public Gender getGender() {
            return gender;
        }
        public void setGender(Gender gender){
            this.gender = gender;
        }
// and finally the last getter/setter pair
        public LocalDate getDateOfBirth() {
            return dateOfBirth;
        }

        public void setDateOfBirth(LocalDate dateOfBirth){
            this.dateOfBirth = dateOfBirth;
        }
    }


//    public static void main(String[] args) {
//        
//    }

