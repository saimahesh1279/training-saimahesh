import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Assignment2_2_11_2020 {
    public static void main(String args[]) {
        int[][] people= {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
        people=reconstructQueue(people);
        for(int i=0;i<people.length;i++) {
            for(int j=0;j<people[i].length;j++) {
                System.out.print(people[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (a[0] != b[0]) return b[0] - a[0];
                else return a[1] - b[1];
            }
        });
        ArrayList<int[]> tmp = new ArrayList<>();
        for (int i = 0; i < people.length; i++) {
            tmp.add(people[i][1], people[i]);
        }
        int[][] res = new int[people.length][2];
        for (int i = 0; i < tmp.size(); i++) {
            res[i][0] = tmp.get(i)[0];
            res[i][1] = tmp.get(i)[1];
        }
        return res;
    }
}