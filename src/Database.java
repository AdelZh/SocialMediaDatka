import java.util.List;

public class Database {

    List<Person> people;

    public Database(List<Person> people) {
        this.people = people;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Database{" +
                "people=" + people +
                '}';
    }
}
