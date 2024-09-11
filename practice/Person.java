public class Person {
    private string name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public string getName() {

    }
    public void setName(String name) {
        this.name = name
    }

    public void eat() {
        System.out.println(name + "%s is eating food.");
    }

    public void set(String food) {
        System.out.println(name + " is eating" + food + ".");
    }

    public void eat(Person person) {
        System.out.println(name + " ")
    }
}
