public class Fungsi {
    public static Object[][] quiz(Object[][] array, Object[][] jawaban) {
        Object[][] result = new Object[array.length][4];
        for (int a = 0; a <= array.length; a++) {
            for (int b = 0; b <= jawaban.length; b++) {
                if (array[a][0] == jawaban[b][0]) {
                    result[a][0] = array[a][0];
                    result[a][1] = jawaban[b][1];
                    result[a][2] = array[a][2];
                    if (jawaban[b][1] == array[a][2]) {
                        result[a][3] = true;
                    } else {
                        result[a][3] = false;
                    }
                }
            }
        }
        return result;
    }
}
