/**
 * Write a description of class Pascal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pascal
{
    public static int[][] pascalTriangle(int n) {
        // YOUR CODE HERE
        int [][] output = new int[n][n];
        output[0][0] = 1;
        for (int i = 1; i<n;i++){
            output[i][0] = 1;
            output[i][i] = 1;
        }
        for (int cul =2;cul < n;cul++){
            for (int row = 1;row < cul;row ++){
                output[cul][row] = output[cul-1][row-1] + output[cul-1][row];
            }
        }
        return output;
    }
}
