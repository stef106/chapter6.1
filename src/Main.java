public class Main {

    public static void main(String[] args) {
     int nums [] = new int[10];
     for(int i = 0; i <10; i++) {
         nums[i]=i+1;
     }
        for(int x:nums) {
         System.out.println(x + ",");
        }
    }
}
public static int [] sort(int [] nums){
    int [] sortedList = null;
    //loop thru the size of the list
    for(int i=0; i<nums.length-1; i++) {
        //move the lowest value to the first of the list
        int small = nums[i];
        int indxSmall = i;
        for(int j=i+1; j<nums.length; j++){
            if(small>nums[j]) {
                swap(indxSmall, j);
            }
        }
    }
    return sortedList;
}