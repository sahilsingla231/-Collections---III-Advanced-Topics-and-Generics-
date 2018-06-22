package generics;
/**
*
* @author Sahil
*/

public class GenericPrintArray {
	
     static <T> void printArray(T array[]){
        
        for(T var:array){
            System.out.print(" "+var);
         }
    }
        
    public static void main(String args[]){
        //case 1
        Character array1[]={'S','A','H','I','L'};
        Integer array2[]={1,2,3,4,5,6,7,8,9,10};
        Double array3[] = { 1.1, 2.1, 3.5, 4.5, 5.6 };  
        
       printArray(array1);
         System.out.println();
       printArray(array2);
       System.out.println();
       printArray(array3);
        
    }

}
