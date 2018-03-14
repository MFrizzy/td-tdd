import java.util.Random;

public class RandomMatrix {
    public static int[][] generateMatrix(int M,int N,int A,int B){
        if(0>M||0>N){
            throw new NegativeArraySizeException();
        }
        else{
            Random r=new Random();
            int[][] matrix=new int[M][N];
            for(int i=0;i<M*N;++i){
                matrix[i/N][i%N]=r.nextInt(B-A)+A;
            }
            return matrix;
        }
    }
}
