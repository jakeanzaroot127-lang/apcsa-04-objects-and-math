public class ObjectLab {
    public static void main(String[] args) {
        // 1. Create rex (Rex, 3) and mia (Mia). Print names and ages.
        Pet rex = new Pet("Rex", 3);
        Pet mia = new Pet("Mia");

        System.out.println(rex.getName() + " is " + rex.getAge());
        System.out.println(mia.getName() + " is " + mia.getAge());
        // 2. Alias: Pet copy = rex; copy.birthday(); print both ages.
        Pet copy = rex;
        copy.birthday();

         System.out.println("Rex age: " + rex.getAge());
         System.out.println("Copy age: " + copy.getAge());
        // 3. A separate Pet twin with the same values. Print its age.
        Pet twin = new Pet("Rex", 3);
        System.out.println("Twin age: " + twin.getAge());
        // 4. copy = null; then try copy.getName().
        copy = null;
        System.out.println(rex.getName());
    }
}

// Given class. Read it, do not edit it. You will write classes like this in Unit 5.
class Pet {
    private String name;
    private int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Pet(String name) {
        this.name = name;
        this.age = 1;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public void birthday() { age++; }
}
