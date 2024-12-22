class matSearch {
// BruteForce
  public static boolean matSearch1(int mat[][], int x) {
          // your code here
          for(int i = 0; i < mat.length; i ++){
              for(int j = 0; j < mat[0].length; j ++){
                  if(mat[i][j] == x){
                      return true;
                  }
              }
          }
          return false;
      }
//Staircase search
    public static boolean matSearch2(int mat[][], int x) {
        // your code here
        if(mat.length == 0 || mat[0].length == 0){
            return false;
        }
        int rows = mat.length, cols = mat[0].length;
        int i = 0, j = cols - 1;
    
        while (i < rows && j >= 0) {
            if (mat[i][j] == x) {
                return true;
            } else if (mat[i][j] < x) {
                i++; // Move down
            } else {
                j--; // Move left
            }
        }
        return false;
    }
}
