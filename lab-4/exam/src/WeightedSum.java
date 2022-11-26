import java.sql.Array;
import java.util.ArrayList;

public class WeightedSum {
    public int computeWeightedSum(int[] a){
        int even = 0;
        int odd = 0;
        int total = 0;
        for ( int i = 0; i<a.length; i++){
            if ( a[i] % 2==0)
            {
                even +=a[i];
            }
            else
            {
                odd+=a[i];
            }
        }
        return (total = (2 * even) + (3 * odd));
    }

    public static void main(String[] args) {

        WeightedSum[] a;
        a= 1, 2, 3, 4, 5;
        a = new WeightedSum[];

    }
}

