import java.util.Arrays;
import java.math.*;

public class AreSame {
  
  public static boolean comp(int[] a, int[] b) {
    boolean toReturn = true;
    if(a == null || b == null){
      return false;
    }
    if(a.length != b.length) {
      return false;
    }
    for(int i=0; i<b.length; ++i) {
      a[i] = a[i]*a[i];
    }
    Arrays.sort(a); Arrays.sort(b);
    for(int i=0; i<a.length; ++i)
      if(a[i] != b[i])
        return false;
    return toReturn;
  }
}