package collectionframework;

public class Student {
    String country;
    String name ;

    public Student(String country, String name) {
        this.country = country;
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "country='" + country + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
