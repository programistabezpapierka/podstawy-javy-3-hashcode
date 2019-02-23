import java.util.Objects;

class Person {

    private String firstName;
    private String lastName;
    private int age;


    Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    void setAge(int newAge) {
        this.age = newAge;
    }


    @Override
    public int hashCode() {
        int result = 19;
        int prime = 31;

        result = result * prime + this.firstName.hashCode();
        result = result * prime + this.lastName.hashCode();
        result = result * prime + this.age;

        return result;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName);
    }
}
