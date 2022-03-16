package com.dkit.gd2.johnloane;

//This class is needed to answer question 2

public class Employee
{
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

//    public static void main(String[] args) {
//        Employee[] arr
//                = {new Employee("Timmy","Harper" ),
//                new Employee("Toby", "Maguire"),
//                new Employee("Janice", "Mukiele" ),
//                new Employee("Clara", "Johnson"),
//                new Employee("John", "Johnson")};

        @Override
    public String toString()
    {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
