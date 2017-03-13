package pkgData;

/**
 * Created by Elias on 13.03.2017.
 */

public class Person {
    private int nr = 0;
    private String name = null;

    public Person(int nr) {
        this.nr = nr;
    }

    public int getNr() {
        return nr;
    }

    public String getName() {
        return name;
    }
}
