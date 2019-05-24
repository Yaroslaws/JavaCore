import mashin.SuperBike;


import java.security.Permission;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorAndComparable {

//1 случай если пример Comparable если нужно сортировать обекты PERSON
//    static class Person implements Comparable<Person>{
//        int age;
//
//        public Person(int age){
//            this.age = age;
//        }
//
//        @Override
//        public int compareTo(Person p) {
//            return this.age - p.age;
//        }
//        @Override
//        public String toString(){
//            return "Person{ age = " + age + " }";
//        }
//    }

//2 случай если нельзя обратться к классу Person
        static class Person {

        int age;
        public Person(int age){
            this.age = age;
        }
        @Override
        public String toString(){
            return "Person{ age = " + age + " }";

        }
    }

    static class ComprePerson implements Comparator<Person>{

     @Override
     public int compare(Person o1, Person o2) {
         return o1.age - o2.age;

     }
 }




    public static void main(String[] args) {

        ComprePerson comprePerson = new ComprePerson();
        Set set = new TreeSet(comprePerson);

        set.add(new Person(8));
        set.add(new Person(8));
        set.add(new Person(7));
        set.add(new Person(4));
        set.add(new Person(0));
        for (Object o: set
             ) {
            System.out.println(o);

        }
    }
}






