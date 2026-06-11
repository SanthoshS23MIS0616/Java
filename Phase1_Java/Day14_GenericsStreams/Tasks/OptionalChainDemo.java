/*
Question:
How can you use Optional.map(), flatMap(), and orElse() in Java to safely access nested values without null checks?
*/

import java.util.Optional;

class Address {
    private String city;

    public Address(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }
}

class Person {
    private Address address;

    public Person(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}

public class OptionalChainDemo {

    public static void main(String[] args) {

        Person person = new Person(new Address("Salem"));

        String city = Optional.ofNullable(person)
                .map(Person::getAddress)
                .map(Address::getCity)
                .orElse("Unknown");

        System.out.println(city);

        Optional<Person> optionalPerson = Optional.ofNullable(person);

        String result = optionalPerson
                .flatMap(p -> Optional.ofNullable(p.getAddress()))
                .map(Address::getCity)
                .orElse("Unknown");

        System.out.println(result);
    }
}