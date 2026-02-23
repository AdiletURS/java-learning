public class Person {
    String name;
    int age;
    String city;
    Person(String name, int age, String city) {
        this.name = name;
        this.age  = age;
        this.city = city;
    }

    void introduce() {
        System.out.println("Я " + name + ", мне " + age + " лет из " + city);
    }

    boolean isAdult() {
        return age >= 18;
    }

    void birthday() {
        age++;
        System.out.println(name + " теперь " + age + " лет!");
    }

    @Override // !!!
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", city='" + city + "'}"; // !!!
    }
}