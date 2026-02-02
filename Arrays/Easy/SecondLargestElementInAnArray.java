package A2Z.Arrays.Easy;

public class SecondLargestElementInAnArray {
    private static int findTheSecondLargest(int[] arr) {
        int largest = arr[0], second=arr[0];
        for (int a : arr) {
            if(largest<a){
                second=largest;
                largest=a;
            }else if(second<a&&largest!=a){
                second=a;
            }
        }return second==largest?-1:second;
    }
    public static void main(String[] args) {
        System.out.println(findTheSecondLargest(new int[]{5,5,5}));
                System.out.println(findTheSecondLargest(new int[]{1}));
        System.out.println(findTheSecondLargest(new int[]{1,2}));

    }
}
