package ua.edu.lnu.abstractclass;

import java.util.ArrayList;
import java.util.List;

public class Matrix extends MyArray {
    @Override
    public double norm(int[][] x) {
        int sumCol;
        double norma = 0;
        List<Integer> sumList = new ArrayList<>();
        int rows = x.length;
        int cols = x[0].length;
        for(int i = 0; i < cols; i++){
            sumCol = 0;
            for(int j = 0; j < rows; j++){
                sumCol = sumCol + x[j][i];
            }
            sumList.add(sumCol);

        }
        for (int i = 0; i < sumList.size(); i++) { {
                if(sumList.get(i) > norma) {
                    norma = sumList.get(i);
                }

            }
        }
        return norma;
    }
}
