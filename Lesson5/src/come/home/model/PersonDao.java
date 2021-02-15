package come.home.model;

import java.util.List;

public interface PersonDao {
    int LIMIT = 100;

    List<Person> list();

    List<Person> list(Address address);
}

