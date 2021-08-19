import java.util.*;
import java.util.stream.*;
public class Kata
{
  public static char findMissingLetter(char[] array)
  {
    int[] nums = new String(array).chars().sorted().toArray();
    int pos = IntStream.range(1, nums.length).filter(index -> (nums[index] - nums[index-1] != 1)).findFirst().getAsInt();
    return (char) (nums[pos]-1);
  }
}