
public class BinarySearchTest {
  
	    public void testSearch()  
	    {  
	        BinarySearch bs=new BinarySearch();  
	        int[] sortedData={1,2,3,4,5,6,6,7,8,8,9,10};  
	        int findValue=9;  
	        int length=sortedData.length;  
	          
	        int pos=bs.searchRecursive(sortedData, 0, length-1, findValue);  
	        System.out.println("Recursice:"+findValue+" found in pos "+pos+";count:"+bs.getrCount());  
	        int pos2=bs.searchLoop(sortedData, findValue);  
	          
	        System.out.println("Loop:"+findValue+" found in pos "+pos+";count:"+bs.getlCount());  
	    }  
}
