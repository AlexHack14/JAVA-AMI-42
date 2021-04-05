
public class functions {
    public static void taskFunction(int[][] A, int n){
        double P = 0;
        for(int i = 0; i < n; i++){
            int maxR = A[i][0];
            int maxS = A[0][i];
            for(int j = 1; j < n; j++)
            {
                if(maxR < A[i][j])
                {
                    maxR = A[i][j];
                }
                if(maxS < A[j][i])
                {
                    maxS = A[j][i];
                }
            }
            P += maxR*maxS;
        }
        System.out.print("P = " + P);
    }
}
