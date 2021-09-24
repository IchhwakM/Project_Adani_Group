import java.util.*; 
import java.io.*;

class Aglabs {

  

    public static boolean TreeConstructor(String[] a){
	    int im=0,i2=0;
	    for(int i=0;i<a.length;i++){
	        int i1=(int)a[i].charAt(1);
	        if(im<i1){
	            im=i1;
	        }
	        else{
	            return false;
	        }
	    }
	    return true;
	}
  

  public static void main (String[] args) {  
    Scanner s = new Scanner(System.in);
    System.out.print(TreeConstructor(s.nextLine())); 
  }

}
