package sampletesting;
import java.io.File;

public class FolderTesting {

	
	
	     
	    public static void main(String[] args) {
	         
	        File dir = new File("C://directory");
	         
	        // Tests whether the directory denoted by this abstract pathname exists.
	        boolean exists = dir.exists();
	          
	        System.out.println("Directory " + dir.getPath() + " exists: " + exists);    
	    }
}
