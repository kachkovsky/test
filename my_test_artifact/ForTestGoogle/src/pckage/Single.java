package pckage;

/**
 * Created by IGOR-K on 18.07.2015.
 */
public class Single {
    private static Single ourInstance = new Single();

    public static Single getInstance() {
        return ourInstance;
    }

    private Single() {
    }
}
