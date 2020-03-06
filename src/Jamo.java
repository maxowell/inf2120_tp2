import java.util.ArrayList;

public class Jamo {
    protected int ci;
    protected int vi;
    protected int di;

    public Jamo (int ui) {
        int ui1 = ui - 44032;
        di = ui1 % 28;
        vi = (int) (1 + ((ui1 - di) % 588) / 28);
        ci = 1 + (int) (ui1 / 588);
    }

    @Override
    public String toString() {
        return "(" + ci + ", " + vi + ", " + di +")";
    }


}
