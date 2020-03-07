public class MainProgram {
    public static void main(String[] args) {
        Home home = new Home();
                Animal dog1 = new Dog();
                Animal dog2 = new Dog();
                Animal cat = new Cat();

        home.makeAllSounds(); // this doesn't do anything
        home.adoptPet(dog1);
        home.makeAllSounds();
// this prints:
// Dog barks

        home.adoptPet(cat);
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
//        home.adoptPet(dog1); // totally ok
//        home.adoptPet(dog1); // not ok at all // not yet

    }
}
