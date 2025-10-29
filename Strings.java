
     public class Strings {
     public static void main(String[] args) {
        
        //   String q ="Aarya";
        //  System.out.print(q);
      /*   int a = 10;
        float b=20.349f;
        char s= 'H';
        String q = "Aarya";
        //System.out.printf("Hey the value of a is %d, the value of b is %f , the value of s is %c and the value of q is %s" 
       // , a,b,s,q);//system.out.format is also used for same.
            // %d for int, %f for float, %c for char, %s for string
            System.out.printf("the value of b is %5.2f",b);
            // %5.3f means 5 digits in total and 2 digits after decimal= 20.35 */

          //STRING METHODS
          String  name="AarYa";//A=0, a=1, r=2, y=3, a=4
          int value= name.length(); //length of string
          System.out.print(value);

          String A= name.toLowerCase(); //convert to lower case
          System.out.println(A);

          String B= name.toUpperCase(); //convert to upper case
          System.out.println(B);

          String name1="    Hey this is aarya     ";

          String C= name1.trim(); //remove spaces from start and end of string
          System.out.println(C);

          String D= name.substring(3);//substring from index 3 to end of string
          System.out.println(D); // will print "ya"

          String E= name1.substring(8,10);
          System.out.println(E); // will print "th"
     // basically after 8 words are included and till 10th word
          System.out.println((name.substring(2,4))); // will print "rY"

         // String F= name.replace('Y','t'); //replace Y with t
          System.out.println((name.replace('Y','t'))); // will print "AartA"

          //true or false
          System.out.println(name.startsWith("Aar"));
          System.out.println(name1.endsWith("a"));

         
          System.out.println(name.charAt(2)); // will print "r"

           // will print index of first occurrence of 'ar'
          System.out.println(name.indexOf("ar")); // will print 1

           // will print 4, as it will start searching from index 2
          System.out.println(name.indexOf("a",2));

          System.out.println(name.lastIndexOf("a"));
           // will print 4, as it will start searching from end of string

           System.out.println(name.lastIndexOf("a",2)); 
           // will print 1, as it will start searching from index 2 (index 2 se phle)

           System.out.println(name.equals("AarYa")); // will print true (case sensitive)

           System.out.println(name.equalsIgnoreCase("aaRYa")); 
           // will print true (case insensitive)

           //ESCAPE SEQUENCES
           System.out.println("hello \"my name is\" aaryya");
           // will print hello "my name is" aaryya

           System.out.println("hello \\my name is\\ aaryya");
           // will print hello \my name is\ aaryya

           System.out.println("hello \n my name is aaryya");
               // will print hello
               // my name is aaryya
           // \n is used to print in new line
           
     String acd= 45;
    Integer.parseInt(acd); //string to integrr
     

          






        
     }
    
}
