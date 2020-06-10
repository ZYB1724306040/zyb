public interface Predicate {
    public void showPredicate();
}


/**
 * 
 * @author Thornhill
 * @see 谓语“是”
 */
public class Is implements Predicate {

    @Override
    public void showPredicate() {
        System.out.print("是");
    }

}

/**
 * 
 * @author Thornhill
 * @see 谓语“不是”
 */
public class IsNot implements Predicate {

    @Override
    public void showPredicate() {
        System.out.print("不是");
    }

}
