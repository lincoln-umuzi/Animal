import java.util.ArrayList;
class Home {
    ArrayList<Animal> petStorage = new ArrayList<>();

    void makeAllSounds(){

    }


    public void adoptPet(Animal animal) {
        petStorage.add(animal);
        animal.sound();
    }
}
