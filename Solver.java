public class Solver {
    public static int GRID_SIZE = 9;

    Boolean IsNumberInRow(int[][] Grid, int row, int number) {
        if (number < 0 || number > 9)
            return false;
        for (int col = 0; col < GRID_SIZE; col++) {
            if (Grid[row][col] == number) {
                return true;
            }
        }
        return false;
    }

    Boolean IsNumberInCol(int[][] Grid, int col, int number) {
        if (number < 0 || number > 9)
            return false;
        for (int row = 0; row < GRID_SIZE; row++) {
            if (Grid[row][col] == number) {
                return true;
            }
        }
        return false;
    }

    Boolean IsNumberInBox(int[][]Grid,int col,int row, int number){
        if(number<0 ||number>9) return false;
        int Startboxrow=row-row%3;
        int Startboxcol=row-row%3;
        for(int r=Startboxrow;r<Startboxrow+3;r++){
            for(int c=Startboxcol;c<Startboxcol+3;c++){
                if(Grid[r][c]==number){
                    return true;
                }
            }
        }
        return false;
    }

}
