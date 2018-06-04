public class Patient {
    String name;
    int age=25;
    boolean ill=true;

    Patient() {
        name="Default";
        age=18;
        ill=true;
    }

    Patient(String name, int age) {
        this.name=name;
        this.age=age;
        ill=true;
    }

    Patient(boolean illness) {
        name=name;
        age=18;
        ill=illness;
    }

}
