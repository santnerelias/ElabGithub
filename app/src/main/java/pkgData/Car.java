package pkgData;

/**
 * Created by Elias on 13.03.2017.
 */

public class Car {
    private int nr = 0;
    private String name = null,
                    manufacturor = null;

    public Car(int nr, String name, String manufacturor) {
        this.nr = nr;
        this.name = name;
        this.manufacturor = manufacturor;
    }

    public String getName() {
        return name;
    }

    public int getNr() {
        return nr;
    }

    public String getManufacturor() {
        return manufacturor;
    }
}
