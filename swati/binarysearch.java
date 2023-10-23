//finding index of an element using staircase search in 2d array
//using element of index (0,n-1) 
package swati;
import java.util.*;
public class binarysearch {
    public static boolean staircase_search(int matrix[][],int key){
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("key is found at ("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main (String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("enter your key: ");
        int key=s.nextInt();
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
    staircase_search(matrix,key);
    }
    }
