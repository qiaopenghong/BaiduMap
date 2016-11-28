
public class RecursionDemo {
	static void count(int n)               //µÝ¹é·½·¨  
    {  
        if (n<5)   
            count(n+1);   
        System.out.print("     "+n);  
    }   
    public static void main(String args[])  
    {  
        count(1);  
     
    }  


}
