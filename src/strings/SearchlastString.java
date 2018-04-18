package strings;

public class SearchlastString {
	public static void main(String[] args) {
		String strOrig = "Hello world,Hello Reader";
	    int lastIndex = strOrig.lastIndexOf("Hello");
	    int lastIdx = strOrig.lastIndexOf("Reader");
	    if(lastIndex == - 1){
	    	System.out.println("Hello not found");
	    }else{
	    	System.out.println("Last occurrence of Hello is at index "+ lastIndex);
	    }
	    
	    if(lastIdx == - 1){
	    	System.out.println("Reader not found");
	    }else{
	    	System.out.println("Last occurrence of Reader is at index "+ lastIdx);
	    }
	}

}
