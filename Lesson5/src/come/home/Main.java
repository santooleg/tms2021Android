package come.home;

import come.home.model.Address;
import come.home.model.Person;
import come.home.model.Recruit;

import java.util.List;


public class Main {
    public static void main(String[] args) {


        Person konstantin = new Person(30, "Konstantin","male");
        Address konstantinsAddress = new Address("Vitebsk", "Belarus");
        konstantin.setAddress(konstantinsAddress);
        konstantin.info();

        Person gleb = new Person(40, "Gleb", 190,"male");
        Address glebsAddress = new Address("Grodno", "Belarus");
        gleb.setAddress(glebsAddress);
//        gleb.info();

        Person oleg = new Person(38, "Oleg", 189,"male");
        Address olegsAddress = new Address("Braslav", "Belarus");
        oleg.setAddress(olegsAddress);

        Person vadim = new Person(30, "Vadim", 180,"male");
        Address vadimsAddress = new Address("Minsk", "Belarus");
        vadim.setAddress(vadimsAddress);

        Person olga = new Person(25, "Olga",170,"female");
        Address olgasAddress = new Address("Minsk", "Belarus");
        olga.setAddress(olgasAddress);


        PersonRegistry registry = new PersonRegistry(new Person[]{gleb, konstantin, oleg, vadim, olga});

        System.out.println(registry.countPeople(new Address("Vitebsk", "Belarus")));
        System.out.println(registry.countPeople(new Address("Krakow", "Belarus")));
        System.out.println(registry.countPeople("Belarus"));


        List<Person> personList = registry.getPeople(new Address("Minsk", "Belarus"));
        for (Person person : personList) {
            System.out.println(person.getName());
        }

        Recruit recruit = new Recruit(new Address("Minsk", "Belarus"), 20, "Pasza", "male", "privete");
        recruit.speak();




    }

}