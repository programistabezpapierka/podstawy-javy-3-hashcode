public class Main {

    public static void main(String[] args) {
        System.out.println("Przykład 1");
        for (int i = 0; i < 10; i++) {
            System.out.println(new Person("Jan", "Kowalski", 33).hashCode());
        }

        System.out.println("Przykład 2");
        System.out.println(new Person("Jan", "Kowalski", 33).hashCode());
        System.out.println(new Person("Jan", "Kowalski", 34).hashCode());

        System.out.println("Przykład 3");
        Person person = new Person("Jan", "Kowalski", 33);
        System.out.println(person.hashCode());
        person.setAge(22);
        System.out.println(person.hashCode());

        System.out.println("Przykład 4");
        Person person1 = new Person("Jan", "Kowalski", 33);
        Person person2 = new Person("Jan", "Kowalski", 33);
        System.out.printf("Equals = %b%n", person1.equals(person2));
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
    }
}
