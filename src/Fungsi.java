public class Fungsi {
    public static String[][] quiz(String[][] array, String[][] jawaban) {
        String[][] result = new String[array.length][3];
        for (int a = 0; a <= array.length; a++) {
            for (int b = 0; b <= jawaban.length; b++) {
                if (array[a][0] == jawaban[b][0]) {
                    if (jawaban[b][1] == array[a][2]) {

                    }
                }
            }
        }
        return result;
    }
}
