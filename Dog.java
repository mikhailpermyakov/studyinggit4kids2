package pets;

/**
 * Created by PermyakovME on 06.06.2017.
 */
public class Dog extends Pet implements Swimmable, Talkable{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void talk(){
        System.out.println("My name is " + this.name + " Bark! Bark-bark!");
    }

    @Override
    public void swim(int howFar) {
        System.out.println("Ok, " + this.name + " will swim");

    }
}