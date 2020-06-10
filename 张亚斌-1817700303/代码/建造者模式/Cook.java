public interface Subject {
    public void showSbuject();
}

/**
 * 
 * @author Thornhill
 * @see 主语“做饭”
 */
public class Cook implements Subject {

    @Override
    public void showSbuject() {
        System.out.print("做饭");
    }

}

/**
 * 
 * @author Thornhill
 * @see 主语“编程”
 */
public class Coding implements Subject {

    @Override
    public void showSbuject() {
        System.out.print("编程");
    }

}