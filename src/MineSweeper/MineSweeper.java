package MineSweeper;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    int cols;
    int rows;
    String[][] area;
    String[][] gameArea;

    public MineSweeper(int rows, int cols) {
        this.cols = cols;
        this.rows = rows;
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);

        createArea();
        System.out.println("Mayın tarlası oyununa hoşgeldiniz!");
        System.out.println("==================================");
        printArea(area);
        System.out.println();
        System.out.println();

        while(true){
            System.out.println("==================================");
            printArea(gameArea);
            System.out.println("Satır indeksini seçin");
            int rowIndex = scanner.nextInt();
            System.out.println("Sütun indeksini seçin");
            int colIndex = scanner.nextInt();
            if(!isInBound(rowIndex,colIndex)){
                System.out.println("Harita sınırını aştınız.. Tekrar indeksleri giriniz");
                continue;
            }
            if(area[rowIndex][colIndex].equals(" * ")){
                System.out.println("Game Over!!");
                printArea(area);
                break;
            }else{
                checkGameArea(rowIndex,colIndex);
                if(isWin()){
                    System.out.println("Tebrikler mayınları buldunuz.");
                    printArea(gameArea);
                    break;
                }
            }

        }

    }

    private boolean isWin() {
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(gameArea[i][j].equals(" - ") && !area[i][j].equals(" * "))
                    return false;
            }
        }
        return true;
    }

    private void checkGameArea(int row, int col) {
        int mine = 0;
        if(isInBound(row,col+1)){
            if(area[row][col+1].equals(" * "))
                mine++;
        }
        if(isInBound(row+1,col+1)){
            if(area[row+1][col+1].equals(" * "))
                mine++;
        }
        if(isInBound(row-1,col+1)){
            if(area[row-1][col+1].equals(" * "))
                mine++;
        }
        if(isInBound(row,col-1)){
            if(area[row][col-1].equals(" * "))
                mine++;
        }
        if(isInBound(row-1,col-1)){
            if(area[row-1][col-1].equals(" * "))
                mine++;
        }
        if(isInBound(row+1,col-1)){
            if(area[row+1][col-1].equals(" * "))
                mine++;
        }
        if(isInBound(row+1,col)){
            if(area[row+1][col].equals(" * "))
                mine++;
        }
        if(isInBound(row-1,col)){
            if(area[row-1][col].equals(" * "))
                mine++;
        }

        gameArea[row][col] = " " + mine + " ";
    }

    private boolean isInBound(int row, int col){
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }

    public void createArea(){
        this.area = new String[cols][rows];
        this.gameArea = new String[cols][rows];
        Random random = new Random();
        for(int i = 0; i < area.length; i++){
            for(int j = 0; j < area[i].length; j++){
                area[i][j] = " - ";
                gameArea[i][j] = " - ";
            }
        }
        int mineCount = (cols * rows) / 4;
        while(mineCount >= 0){
            int row = random.nextInt(rows -1);
            int col = random.nextInt(cols- 1);

            if(area[row][col].equals(" - ")){
                area[row][col] = " * ";
                mineCount--;
            }
        }
    }

    public void printArea(String[][] area){
        for(String[] row : area){
            for(String col : row){
                System.out.print(col);
            }
            System.out.println(" ");
        }
    }
}
