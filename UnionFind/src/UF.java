import java.util.Scanner;
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
    private UF(int N) {
        // Initialize union-gind data structure
    }

    /**
     * Read in number of objects N from standard input.
     * Repeat:
     * <ul>
     * <li>read in pair of integers from standard input</li>
     * <li>if they are not yet connected, connect them and print out pair</li>
     * </ul>
     *
     * @param args system arguments, ignored
     */

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int N = stdin.nextInt();
        UF uf = new UF(N);
        while (stdin.hasNext()) {
            int p = stdin.nextInt();
            int q = stdin.nextInt();
            if (!uf.connected(p, q)) {
                uf.union(p, q);
                System.out.println(p + " " + q);
            }
        }
    }

    /**
     * Add connection between p and q
     *
     * @param p object 1
     * @param q object 2
     */
    private void union(int p, int q) {
    }

    /**
     * are p and q in the same component?
     *
     * @param p object 1
     * @param q object 2
     * @return true if p and q are connected
     */
    private boolean connected(int p, int q) {
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
