
public class Diego {
    public static void main(String[] args) {
        int mat[][] = new int[3][3];
        int mt[][] = new int[3][3];

        for(int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                mat[i][j] = 2;
                System.out.print(mat[i][j] + "\t ");
            }
            System.out.print("\n");
        }
        System.out.println ("******************************");
        for(int x=0; x<3; x++){
            for (int y=0; y<3; y++){
                mt[x][y] = 3;
                System.out.print(mt[x][y] + "\t ");
            }
            System.out.print("\n");
        }
        System.out.println ("******************************");
        for(int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                mat[i][j] = mat[i][j] * mt[i][j];
            }
        }
        for(int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(mat[i][j] + "\t ");
            }
            System.out.print("\n");
        }
        System.out.println ("******************************");
    }
}
