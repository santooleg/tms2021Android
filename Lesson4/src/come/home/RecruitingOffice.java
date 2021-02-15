package come.home;

import come.home.model.Address;
import come.home.model.Person;

import java.util.LinkedList;
import java.util.List;

import static come.home.model.Person.MALE;


public class RecruitingOffice {

    private  final  PersonRegistry registry;

    public RecruitingOffice(PersonRegistry registry) {
        this.registry = registry;
    }

    public List<Person>getFitPeople(Address address){
        List<Person> peopleByAddress = registry.getPeople(address);
        List<Person> fitPeople = new LinkedList<>();
        for (Person person : peopleByAddress) {
            if (isPersonFit(person)) {
                System.out.println(person.getName() + " is fit!"); //System.out.printf("%s is fit!\n", person.getName()); // this is equal to System.out.println(person.getName() + " is fit!");
                fitPeople.add(person);
            }
        }
        return fitPeople;
    }

    private  boolean isPersonFit(Person person){
        return MALE.equals(person.getGender())
                && person.getAge() > 17
                && person.getAge() < 28;

    }

}

