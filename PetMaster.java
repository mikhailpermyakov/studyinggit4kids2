package pets;

/**
 * Created by PermyakovME on 06.06.2017.
 * Modified by PermyakovME on 06.22.2017.
 *yet another modification
 */
public class PetMaster {
    public static void main(String[] args) {

        Dog myDog = new Dog("Jule");
        myDog.talk();
        myDog.swim(7);
        myDog.dive(20);  // will use default method

        System.out.println();

        Fish myFish = new Fish("Glass");
        myFish.swim(50);
        myFish.dive(20);
    }
}
