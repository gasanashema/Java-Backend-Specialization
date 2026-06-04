import java.util.Arrays;

public class XO {
    public static void main(String[] args) {

    }
    public static boolean getXO (String str) {

        int Os = Arrays.stream(str.split("")).filter(n->n.equalsIgnoreCase("o")).toList().size();
        int Xs = Arrays.stream(str.split("")).filter(n->n.equalsIgnoreCase("x")).toList().size();
        return Os == Xs;
    }
}
