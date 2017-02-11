import java.util.Scanner;
import java.util.LinkedList;

public class main {
  public static void main(String[] arg) {
        int R, C, L, H;
        //Type; 0 = Mushroom, 1 = Tomato
        /* Scanning input */
        Scanner in = new Scanner(System.in);
        R = in.nextInt();
        C = in.nextInt();
        L = in.nextInt();
        H = in.nextInt();
        in.nextLine();
        int[][] pizza = new int[R][C];
        for (int i = 0; i < R; i++) {
          String row = in.nextLine();
           for (int j = 0; j < C; j++) {
            pizza[i][j] = (row.charAt(j) == 'T') ? 1 : 0;
          }
        }
        //printTable(pizza);
        /* Solving problem */
        //LinkedList<slice> slices = new LinkedList<slice>();
        LinkedList<Slice> slices = generateRandomSlices();
        /* Output solution */
        int S = slices.size();
        System.out.println(S);
        for (int i = 0; i < S; i++) {
          slices.get(i).print();
        }
      }

      static void printTable(int[][] table) {
        int R = table.length;
        int C = table[0].length;
        for (int i = 0; i < R; i++) {
          for (int j = 0; j < C; j++) {
            System.out.print(table[i][j] + " ");
          }
          System.out.println("");
        }
      }
      static LinkedList<Slice> generateRandomSlices() {
          LinkedList<Slice> result = new LinkedList<Slice>();
          for (int i = 1; i < 10; i++) {
            Slice slice = new Slice();
            slice.r1 = i;
            slice.r2 = i + 1;
            slice.c1 = i;
            slice.c2 = i + 1;
            result.add(slice);
          }
          return result;
        }
}
