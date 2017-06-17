package lec7.arrays;
 public class ArrayJaggedExample {
    public static void main(String[] args) {
 
           int intJaggedArray[][]={ { 1, 2}, { 4, 5, 6 } };
           
           System.out.println("Length of 2D array would be it's ROW: "+ intJaggedArray.length);
 
           // Method 1 - To Iterate over Jagged arrays/ Ragged arrays > using enhanced for loop
           for (int[] i : intJaggedArray) {
                  for (int j : i) {
                        System.out.print(j + " ");
                  }
                  System.out.println();
           }
                                                                                     //0           //1
           System.out.println();  
           System.out.println("Method 2 Iterate over 2d Jagged array > using for loop");
           
           // Method 2 Iterate over Jagged arrays/ Ragged arrays > using for loop
           for (int i = 0; i < intJaggedArray.length; i++) {   // ROW   0, 1
        	   System.out.println("Column Lenght: "+ intJaggedArray[i].length);   // intJaggedArray[0].length
                  for (int j = 0; j < intJaggedArray[i].length; j++)
                        System.out.print(intJaggedArray[i][j] + " ");
                  System.out.println();
           }
 
    }
}