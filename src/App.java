import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Soal soal = new Soal();
        Object[][] array = soal.soal();
        // iki mek gae contoh jawaban user e, ngkok dicocokno gae fungsi ndek class
        // Fungsi
        Object[][] jawaban = new Object[array.length][2];
        Scanner input = new Scanner(System.in);

        // Object[][] hasil = Fungsi.quiz(array, jawaban);

        // System.out.println(Arrays.deepToString(hasil));
        Boolean lanjut = true;
        while (lanjut) {
            System.out.println("======================================");
            System.out.println("Soal - soalan");
            System.out.println("");
            System.out.println("1. Start");
            System.out.println("2. Keluar");
            System.out.println("======================================");
            System.out.print("Pilih Menu :");
            int menu = input.nextInt();
            if (menu == 1) {
                for (int a = 0; a < array.length; a++) {
                    // Runtime.getRuntime().exec("cls");
                    Boolean lanjut_quiz = true;
                    while (lanjut_quiz) {
                        System.out.println("======================================");
                        System.out.println("Quiz " + array[a][0] + ": " + array[a][1]);
                        System.out.println("1. " + array[a][3]);
                        System.out.println("2. " + array[a][4]);
                        System.out.println("3. " + array[a][5]);
                        System.out.println("4. " + array[a][6]);
                        System.out.println("Jawaban anda [1-4] :");
                        int pilihan = input.nextInt();
                        if (pilihan <= 4 && pilihan >= 1) {
                            lanjut_quiz = false;
                            Object jawab = array[a][pilihan + 2];
                            jawaban[a][0] = array[a][0];
                            jawaban[a][1] = jawab;
                        }
                    }
                }
                Object[][] hasil = Fungsi.quiz(array, jawaban);
                String salahopobener;
                for (int a = 0; a < hasil.length; a++) {
                    System.out.println("======================================");
                    if ((Boolean) hasil[a][3]) {
                        salahopobener = "Benar";
                    } else {
                        salahopobener = "Salah";
                    }
                    System.out.println("Quiz " + array[a][0] + ": " + array[a][1] + " (" + salahopobener + ")");
                    System.out.println("Jawaban Anda : " + hasil[a][1]);
                    System.out.println("Jawaban Yang Benar : " + hasil[a][2]);
                }
                System.out.println("======================================");
                int nilai = 0;
                for (int a = 0; a < hasil.length; a++) {
                    if ((Boolean) hasil[a][3]) {
                        nilai += 1;
                    }
                }
                System.out.println("Nilai Anda : " + nilai);

                // System.out.println(Arrays.deepToString(hasil));
            } else {
                lanjut = false;
            }
        }
        input.close();
    }
}
