public class App {

    public static void main(String[] args) throws Exception {

        // {"nomer e", "soal e", "jawaban sing bener", "jawaban A", "jawaban B",
        // "jawaban C", "jawaban D"}
        Object[][] array = { { 1, "asdasdasdasdasdasdasd", "qweqwe", "asdasd", "qweqwe", "zxczxc" } };
        // iki mek gae contoh jawaban user e, ngkok dicocokno gae fungsi ndek class
        // Fungsi
        Object[][] jawaban = { { 1, "asdasd" } };

        Object[][] result = { { 1, "asdasd", "qweqwe", true } };

        Object[][] hasil = Fungsi.quiz(array, jawaban);

        System.out.println(hasil);

    }
}
