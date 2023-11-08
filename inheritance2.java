// A program to show person's actions by the use of inheritance, classes, and interfaces.
class Person {
    void walk() {
        System.out.println("Person is walking");
    }
}

interface PersonActions {
    void talk();
    void relax();
}

class PersonExample extends Person implements PersonActions {
    void eatLunch() {
        System.out.println("A Person is having lunch");
    }

    public void talk() {
        System.out.println("A Person is speaking");
    }

    public void relax() {
        System.out.println("A Person is taking a break");
    }

    public static void main(String args[]) {
        PersonExample person = new PersonExample();
        person.eatLunch();   // Call the eatLunch method
        person.walk();       // Call the walk method from the Person class
        person.talk();       // Call the talk method from the PersonActions interface
        person.relax();      // Call the relax method from the PersonActions interface
    }
}
