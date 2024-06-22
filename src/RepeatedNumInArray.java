import java.util.Arrays;

public class RepeatedNumInArray {
    public static void main(String[] args) {
        int[] list = {4,6,3,5,4,5,7,2,8,1,8};
        int[] dublicated = new int[list.length];
        int startedIndex = 0;
        for(int i = 0; i < list.length; i++){
            for(int j = 0; j < list.length; j++){
                if(i != j && list[i] == list[j] && !isFind(dublicated,list[i])){
                    if(list[i] % 2 == 0){
                        dublicated[startedIndex] = list[i];
                        startedIndex++;
                        break;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(dublicated));
    }


    public static boolean isFind(int[] arr, int value){
        for(int i : arr){
            if(i == value)
                return true;
        }
        return false;
    }


}
