/*String = Big and Small*/
package app1;

import java.util.*;

public class App1 {

    public static void main(String[] args) {
        q2();     
    }


private static void  q2() {
            
        try{
            
        q1 q ;
        q = new q1();
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("please type the data = ");
        q.data = scanner.next(); 
        int i = 0;

        while(true){

        char a = q.data.toLowerCase().charAt(i);
        
        char b = q.data.toUpperCase().charAt(i);       

        if (i  % 2 == 0 ){
            
            System.out.print(a);
        }
        else{
            
            System.out.print(b);
       }
    
        i++; }
        
        
    }catch (Exception e){}
        
    }
} 


class q1{
        String data;
}
