import java.util.*;
import java.io.*;

class ADLabs {
  public static boolean TreeConstructor(String[] arr) {
    int in = 0, i2 = 0;
    for (int i = 0; i < arr.length; i++) {
      int i1 = (int) arr[i].charAt(1);
      if ( in < i1)
        in = i1;
      else
        return false;
    }
    return true;
  }

  public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.print(TreeConstructor(s.nextLine()));
  }
}
