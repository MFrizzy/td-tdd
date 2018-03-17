public class Triangle {
    public static String Triangle(int a, int b, int c) {
        if ((a > b && a > c && b + c > a)
                || (b > c && b > a && a + c > b)
                || (c > a && c > b && a + b > c)
                && a > 0 && b > 0 && c > 0) {

            if (a == b && b == c) {
                return "Triangle équilatéral";
            }
            else if (a == b || b == c || a == c) {
                return "Triangle isocèle";
            }
            else {
                return "Triangle scalène";
            }
        }
        else {
            return "pas un triangle";
        }
    }
}
