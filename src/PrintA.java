public class PrintA {
    public static void main(String[] args) {
        String[][] arr = new String[6][4];

        for(int i = 0; i < arr.length; i++ ){
            for(int j = 0; j < arr[i].length; j++){
                if( i == 0 || i == 2 || i == arr.length - 1){
                    arr[i][j] = " * ";
                }
                else if(j == 0 || j == 3){
                    arr[i][j] = " * ";
                }
                else{
                    arr[i][j] = "   ";
                }
                if(i == 2 && j == 3){
                    arr[i][j] = "   ";
                }
            }
        }

        for(String[] row : arr){
            for(String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
