public class MainProgram {
    public static void main(String[] args) {
        //Part 1
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.setNames("Rax");
        cat.setNames("Stormy");
        dog.eat();   // -> 'Rax eats'
        dog.sound(); // -> 'Dog barks'
        cat.eat();    // -> 'Stormy eats'
        cat.sound(); // -> 'Cat meows'

        //Part2
        Home home = new Home();
                Dog dog1 = new Dog();
                Dog dog2 = new Dog();
                Cat cat2 = new Cat();

        home.makeAllSounds(); // this doesn't do anything
        home.adoptPet(dog1);
        home.makeAllSounds();
// this prints:
// Dog barks

        home.adoptPet(cat2);
        home.makeAllSounds();
// this prints:
// Dog barks
// Cat meows

        home.adoptPet(dog2);
        home.makeAllSounds();
// this prints:
// Dog barks
// Cat meows
// Dog barks
    }
}
