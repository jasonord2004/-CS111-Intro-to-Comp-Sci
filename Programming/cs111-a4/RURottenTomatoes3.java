public class RURottenTomatoes3 {

    public static void main(String[] args) {

        int row = Integer.parseInt(args[0]);
        int column = Integer.parseInt(args[1]);
        int arr[][] = new int[row][column];
        int num = 2;
        int sum = 0;
        int max = 0;
        int ans = 0;
        for(int h=0; h<row; h++){
            for(int i=0; i<column; i++){
                arr[h][i] = Integer.parseInt(args[num]);
                num++;
            }
        }
        for(int h=0; h<column; h++){
            for(int i=0; i<row; i++){
                sum = sum + arr[i][h];
            }

            if(sum>max){
                max = sum;
                ans = h;
            }
            sum = 0;
        }
        System.out.println(ans);
    }
}