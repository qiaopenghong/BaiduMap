
public class RecursionDemo {
	static void count(int n)               //�ݹ鷽��  
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
