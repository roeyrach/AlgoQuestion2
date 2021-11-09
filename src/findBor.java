public class findBor {

    public static int isPot(int[][] mat){
        int i = 0;
        int j = 0;
        while(i < mat.length && j < mat[0].length)
        {
            for(j = 0; j < mat.length;)
            {
                if(mat[i][j] == 0){
                    j++;
                }
                else
                {
                    i++;
                }
            }
        }
        if(i == mat.length) {
            return -1;
        }
        for(int k = 0; k < mat.length; k++)
        {
            if(mat[i][k] == 1)
            {
                return -1;
            }
            if(k != i && mat[k][i] != 1)
            {
                return -1;
            }
        }
        return i;
    }

    public static void main(String[] args){
        int[][] mat = {
                {0,0,1,1,1,1},
                {0,0,0,1,0,0},
                {1,1,0,1,0,1},
                {0,0,0,0,0,0},
                {1,0,0,1,0,0},
                {0,0,1,1,0,0},};
        int[][] mat2 = {
                {0,1,1,1,1,1},
                {0,0,0,0,0,0},
                {1,1,0,1,0,1},
                {0,1,0,0,0,0},
                {1,1,0,1,0,0},
                {0,1,1,1,0,0},};

        System.out.println(isPot(mat2));
    }
}
