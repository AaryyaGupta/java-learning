public class arrays {

    public static void main(String[] args) {
        //classroom of 500-store marks of all students
        //we'll use arrays for that-collection of similar data types
        int[] marks = new int[5]; //array declaration 1. declaration nd memory allocation
    
      marks[0]=100;
      marks[1]=89;
      marks[2]=46;
      marks[3]=90;
      marks[4]=97;
      // int[] marks = {100, 89, 46, 90, 97}; //array initialization
      // int[]marks;
        // marks = new int[5]; //array initialization
        int[] aarya= {100, 89, 46, 90, 97}; //array initialization
       // System.out.println(aarya.length); //length of array=5
        String[] names= {"aarya", "aarav","anjali", "harry"};

        //displaying array naive method
       /* System.out.println(names[1]);
        System.out.println(names[3]);
        System.out.println(names[0]);
        System.out.println(names[2]);*/ 

        //displaying array using for loop
       /* System.out.println("Displaying names using for loop");  
        for(int i = 0; i < names.length; i++){
        
            System.out.println(names[i]);
       /* 
        
        }*/
        //reverse order
        /*for(int i = marks.length-1; i>=0; i--){
            System.out.println(marks[i]);
        }*/
        
        //for each loop
       /*  for(String name : names){
            System.out.println(name);
        } */

        //multidimensionals arrays
        //2-d array
       /*  int[][] flats;
        flats = new int[3][2]; //3 rows and 2 columns
        flats[0][0] = 001;
        flats[0][1] = 002;
        flats[1][0] = 101;
        flats[1][1] = 102;
        flats[2][0] = 201;
        flats[2][1] = 202;
        System.out.println("Displaying 2d arrays using for loop");  
        for(int i = 0; i < flats.length; i++){
        for(int j = 0; j<flats[i].length; j++){
          
        
            System.out.print(flats[i][j]);
        System.out.print(" ");}

            System.out.println("");}//new line after each row */

            //3-d array
            int[][][] matrix = new int[2][3][4]; //2 rows, 3 columns, 4 depth
            matrix[0][0][0] = 1;
            matrix[0][0][1] = 2;
            matrix[0][0][2] = 3;
            matrix[0][0][3] = 4;
            matrix[0][1][0] = 5;    
            matrix[0][1][1] = 6;
            matrix[0][1][2] = 7;
            matrix[0][1][3] = 8;
            matrix[0][2][0] = 9;
            matrix[0][2][1] = 10;
            matrix[0][2][2] = 11;
            matrix[0][2][3] = 12;
            matrix[1][0][0] = 13;
            matrix[1][0][1] = 14;
            matrix[1][0][2] = 15;
            matrix[1][0][3] = 16;
            matrix[1][1][0] = 17;
            matrix[1][1][1] = 18;
            matrix[1][1][2] = 19;
            matrix[1][1][3] = 20;
            matrix[1][2][0] = 21;
            matrix[1][2][1] = 22;
            matrix[1][2][2] = 23;
            matrix[1][2][3] = 24;
            System.out.println("Displaying 3d arrays using for loop");
            for(int i=0; i<matrix.length;i++){
                System.out.println("Layer (row)"+i+":");
                for(int j=0; j<matrix[i].length;j++){
                    for(int k=0; k<matrix[i][j].length;k++){
                        System.out.print(matrix[i][j][k]);
                        System.out.print(" ");
                    }
                    System.out.println("");
                }
                System.out.println("");
            }
            //for loop 2nd method
           /*  for(int i=0; i<2; i++){
                System.out.println("Layer (row)"+i+":");
                for(int j=0; j<3; j++){
                   
                    for(int k=0; k<4; k++){
                        System.out.print(matrix[i][j][k] );
                        System.out.print(" ");
                    }
                    System.out.println("");
                }
            }*/
            


        
    





         
        
    
            
    
    
    }
}
