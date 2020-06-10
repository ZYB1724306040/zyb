public interface Object {
    public void showObject();
}

/**
 * 
 * @author Thornhill
 * @see 宾语“简单”
 */
public class Easy implements Object {

    @Override
    public void showObject() {
        System.out.println("简单的");

    }

}

/**
 * 
 * @author Thornhill
 * @see 宾语“困难”
 */
public class Difficult implements Object {

    @Override
    public void showObject() {
        System.out.println("困难的");      
    }

}