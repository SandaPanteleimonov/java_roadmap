package Week9_2;

import java.util.Scanner;

public class SortGroup {
    public static void main(String[] args) {

        //Create array for group
        Person[] group =new Person[10];
        reviewGroup(group);
        System.out.println("Before sorting:");
        display(group);

        //Bubble sort with lambda functionality - by age

        final Person[] temp = {new Person()};
        MyArray orderAge = (arr) -> {
            Person[] result = new Person[10];
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i].getAge() > arr[j].getAge()) {
                        temp[0] = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp[0];
                    }
                }
            }
            return result;
        };

        //Sort with lambda functionality - by name

        final Person[] temp1 = {new Person()};
        MyArray orderName = (arr) -> {
            Person[] result = new Person[10];
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if(arr[i].getName().compareTo(arr[j].getName())>0) {
                        temp1[0] = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp1[0];
                    }
                }
            }
            return result;
        };

        sortArray(orderAge, group);
        System.out.println("After sorting by age:");
        display(group);
        sortArray(orderName, group);
        System.out.println("After sorting by name:");
        display(group);

    }

    public static void display(Person[] persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    public static void reviewGroup(Person[] persons) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        for (int i = 0; i < persons.length; i++ ) {
            persons[i] = new Person();
            System.out.println("Introduce name and age:");
            String nameIn = scan1.nextLine();
            int ageIn = scan2.nextInt();
            persons[i].setName(nameIn);
            persons[i].setAge(ageIn);
        }

    }

    public static Person[] sortArray (MyArray ordered, Person[] arr){
        return ordered.myArrayFunction(arr);
    }
}
