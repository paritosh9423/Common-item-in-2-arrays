import java.util.Arrays;
import java.util.HashMap;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    int[] arr = {1,2,3,4};
    int[] arr2 = {3,5,6};
    System.out.println(findCommonItem(arr,arr2));
  }
  public static boolean findCommonItem(int[] arr1,int[] arr2 ){
    HashMap<Integer,Boolean> hm = new HashMap<>();
    for (int item: arr1){
      hm.put(item,true);
    }
    for(int item: arr2){
      if(hm.containsKey(item))
        return true;
    }


    return false;
  }
}