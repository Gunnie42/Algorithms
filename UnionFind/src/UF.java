/**
 * Created by Gunter on 17/05/2017.
 * <p>
 * Goal: Design efficient data structure for union-find.
 * <ul>
 * <li>Number of objects N can be huge</li>
 * <li>Number of operations M can be huge</li>
 * <li>Find queries and union commands can be intermixed</li>
 * </ul>
 */
public class UF {

    /**
     * Initialize union-find data structure with N object (0 to N-1)
     *
     * @param N number of objects
     */
    UF(int N) {
        // Initialize union-gind data structure
    }

    /**
     * Add connection between p and q
     *
     * @param p object 1
     * @param q object 2
     */
    void union(int p, int q) {
    }

    /**
     * are p and q in the same component?
     *
     * @param p object 1
     * @param q object 2
     * @return true if p and q are connected
     */
    boolean connected(int p, int q) {
        return false;
    }

    /**
     * component identifier for p (0 to N-1)
     *
     * @param p object to be identified
     * @return object that's identified (don't understand it yet :)
     */
    int find(int p) {
        return 0;
    }

    /**
     * number of components
     *
     * @return number of components
     */
    int count() {
        return 0;
    }


}
