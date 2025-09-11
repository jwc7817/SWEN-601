package asst4.activities;

public class fillingArray {

    public static void fillin(int input){

        int[] mat =  new int[input];

        for(int i = 0; i < mat.length;i ++){
            mat[i] = i*10;
        }

        for(int i = 0; i < mat.length ;i ++){
            System.out.println(mat[i]);
        }

    }

    public static void main(String[] args) {



        fillin(10);
    }
}
