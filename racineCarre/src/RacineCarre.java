public class RacineCarre {

    public static int[] tableauRacine(int A, int B) throws Error {
        if (B <= A) {
            throw new Error("B <= A");
        }
        int taille = B - A;
        int[] result = new int[taille];
        for (int i = 0; i < taille; i++) {
            result[i] = (int) Math.sqrt((double) B - i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] test = RacineCarre.tableauRacine(1, 10);
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }
        int[] nontest = RacineCarre.tableauRacine(10,1);
    }

}
