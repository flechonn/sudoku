public class Grid {
  int Grid[][];
  public static int GRID_SIZE = 9;
  
  void initGrid(int Grid[][]) {
    this.Grid = Grid;
  }

  private static void printGrid(int[][] Grid) {
    for (int row = 0; row < GRID_SIZE; row++) {
      if (row % 3 == 0 && row != 0) {
        System.out.println("-----------");
      }
      for (int column = 0; column < GRID_SIZE; column++) {
        if (column % 3 == 0 && column != 0) {
          System.out.print("|");
        }
        System.out.print(Grid[row][column]);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {

    int[][] board = {
        { 7, 0, 2, 0, 5, 0, 6, 0, 0 },
        { 0, 0, 0, 0, 0, 3, 0, 0, 0 },
        { 1, 0, 0, 0, 0, 9, 5, 0, 0 },
        { 8, 0, 0, 0, 0, 0, 0, 9, 0 },
        { 0, 4, 3, 0, 0, 0, 7, 5, 0 },
        { 0, 9, 0, 0, 0, 0, 0, 0, 8 },
        { 0, 0, 9, 7, 0, 0, 0, 0, 5 },
        { 0, 0, 0, 2, 0, 0, 0, 0, 0 },
        { 0, 0, 7, 0, 4, 0, 2, 0, 3 }
    };
    printGrid(board);
  }
}