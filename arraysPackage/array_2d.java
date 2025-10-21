package arraysPackage;

public class array_2d {
    public static void main(String[] args) {
        int  [][] matt = {{1,2} , {3,4} , {5,6}};
        // arr[0][0] = 10;

        int r = matt.length;
        int c = matt[0].length;
        System.out.println(r);
        System.out.println(c);


        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.println(matt[i][j]);
            }
        }
    }
}
