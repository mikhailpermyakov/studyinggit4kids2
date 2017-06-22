package pets;

/**
 * Created by PermyakovME on 06.06.2017.
 */
public interface Swimmable {
    static final int MAX_DEPTH = 10; // in feet

    public void swim(int howFar);

    public default void dive(int howDeep){
        if (howDeep > MAX_DEPTH){
            System.out.println("Can't dive, sorry");
        }
    };
}
