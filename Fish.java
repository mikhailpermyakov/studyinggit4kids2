package pets;

/**
 * Created by PermyakovME on 06.06.2017.
 */
public class Fish extends Pet implements Swimmable, Talkable {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim(int howFar){
        System.out.println("OK, " + this.name + "will swim " + howFar + " feet");
    }
    @Override
    public void dive(int howDeep){
        System.out.println("OK, " + this.name + " will dive " + howDeep + " feet");
    }

    @Override
    public void talk() {

    }
}
