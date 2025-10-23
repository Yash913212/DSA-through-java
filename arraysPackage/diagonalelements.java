package arraysPackage;

public class diagonalelements {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3} , {4,5,6} , {7,8,9}};
        int r  = arr.length;
        int c  = arr[0].length;

        for(int i=0;i<3;i++){
            System.out.println(arr[i][i]);
        }
        //reverse diagonal
        for (int j=0;j<c;j++){
            int z = c-j-1;
            System.out.println(arr[j][z]);
        }
    }
}
