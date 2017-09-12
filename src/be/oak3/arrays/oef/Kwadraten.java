package be.oak3.arrays.oef;

public class Kwadraten {
    public static void main(String[] args) {

        int[][] tienTwee = new int[10][2];

        for (int i = 0; i < tienTwee.length; i++) {
            for (int j = 0; j < tienTwee[i].length; j++) {

                tienTwee[i][j] = (int) Math.pow((i+1), (j+1));
                //tienTwee[i][j] = (i + 1);
                //tienTwee[i][j] = (i + 1) * (i + 1);

            }
        }
        for (int[] is : tienTwee) {
            for (int i : is) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }

    }
}

