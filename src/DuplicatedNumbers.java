public class DuplicatedNumbers {

    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,2,5,2,5};
        int[] duplicated = new int[5];
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            int repeat = 1;
            boolean isEquel = false;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j] && !isFind(duplicated,arr[i])){
                      isEquel = true;
                      repeat++;
                }
            }
            if(isEquel){
                System.out.println(arr[i] + " Sayısı " + repeat + "kere tekrar etti" );
                duplicated[++index] = arr[i];
            }

        }
    }

    public static boolean isFind(int[] arr, int value){
        for(int i : arr){
            if(i == value)
                return true;
        }
        return false;
    }
}
