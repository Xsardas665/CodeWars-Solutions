public class Maskify {
    public static String maskify(String str) {
        if(str.length() == 0 ) {
          return "";
        } else if (str.length() < 5) {
          return str;
        } else {
          String ret = "";
          int counter = 0;
          while(counter < str.length()-4) {
            ret += "#";
            counter++;
          }
          ret += str.substring(str.length() -4, str.length());
          return ret;
        }
    }
}