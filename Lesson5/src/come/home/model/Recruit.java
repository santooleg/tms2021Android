package come.home.model;

public class Recruit extends Person {
    private  String title;

    public Recruit(){

    }
    public Recruit(Address address, int age, String name, String gender, String title) {
        super(address, age, name, gender);
        this.title = title;
    }
    @Override
    public final void speak() {
        System.out.println("Yes, SER!!!");;
    }

    public String getTitle() {
        return title;
    }


}
