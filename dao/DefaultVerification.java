package dao;

public class DefaultVerification {

    public static boolean cpfVerification(String cpfValue) {
        return true;
    }

    public static boolean dateVerification(String dateValue) {
        int[] date = {0, 0, 0};
        for (int i = 0; i < dateValue.split("-").length; i++) {
            date[i] = Integer.parseInt(dateValue.split("-")[i]);
        }

        if (date[1] > 12) {
            return false;
        }
        System.out.println(date[1] + "/" + date[2]);
        System.out.println((date[1] == 1 || date[1] == 3 || date[1] == 5 || date[1] == 7 || date[1] == 8 || date[1] == 10 || date[1] == 12)
                ? (date[2] <= 31) : ((date[1] == 4 || date[1] == 6 || date[1] == 9 || date[1] == 11)
                        ? (date[2] <= 30) : (date[2] <= 28)));
        return (date[1] == 1 || date[1] == 3 || date[1] == 5 || date[1] == 7 || date[1] == 8 || date[1] == 10 || date[1] == 12)
                ? (date[2] <= 31) : ((date[1] == 4 || date[1] == 6 || date[1] == 9 || date[1] == 11)
                        ? (date[2] <= 30) : (date[2] <= 28));
    }
}
