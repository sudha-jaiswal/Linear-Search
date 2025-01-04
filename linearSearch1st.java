public class linearSearch1st {
    public static void main(String[] args) {
        int[] num = { 1,2,3,4,19,-1,-2};
        int target = 19;
        int ans = LSearch(num , target);
        System.out.println("Index of the array, where the target " + ans);
        int ans2 = LSearch2(num,target);
        System.out.println("Element of the array where the target " +ans2);
        boolean ans3 = LSearch3(num , target);
        System.out.println("TrueOrFalse of the array where the target = " +ans3);

    }
    static boolean LSearch3(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }
        for(int element : arr){
            if(element == target){
                return true;
            }

        }
        return false;

    }
    static int LSearch2(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int element : arr){
            if(element == target){
                return element;
            }

        }
        return -1;

    }
    static int LSearch(int [] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}
