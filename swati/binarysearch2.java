//finding index of an element using staircase search in 2d array
//using element of index (m-1,0)
package swati;

import java.util.*;

public class binarysearch2 {

  public static boolean staircase_search(int matrix[][], int key) {
    int row = matrix.length - 1;
    int col = 0;
    while (row >= 0 && col < matrix[0].length) {
      if (matrix[row][col] == key) {
        System.out.println("key found at (" + row + "," + col + ")");
        return true;
      } else if (key < matrix[row][col]) {
        row--;
      } else {
        col++;
      }
    }
    System.out.println("key not found");
    return false;
  }

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.print("enter your key: ");
    int key = s.nextInt();
    int matrix[][] = {
      { 10, 20, 30, 40 },
      { 15, 25, 35, 45 },
      { 27, 29, 37, 48 },
      { 32, 33, 39, 50 },
    };
    staircase_search(matrix, key);
  }
}
