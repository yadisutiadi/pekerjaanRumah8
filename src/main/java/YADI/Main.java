package YADI;

public class Main {
    public static void main(String[] args) {
        String stringA = "CAT";
        String stringB = "tac";

        if (isAnagram(stringA, stringB)) {
            System.out.println("String A dan String B adalah anagram");
        } else {
            System.out.println("String A dan String B bukan anagram");
        }
    }
    public static boolean isAnagram(String stringA, String stringB){
        //menghapus dalam kedua string
        stringA = stringA.toLowerCase().replaceAll("\\s", "");
        stringB = stringB.toLowerCase().replaceAll("\\s", "");

        //mengubah kedua string jadi huruf kecil
        stringA = stringA.toLowerCase();
        stringB = stringB.toLowerCase();


        //membandingkan apakah kedua string bernilai sama
        if (stringA.length() != stringB.length()) {
            return false;
        }

        //mengecek apakah dalam stringA memiliki karakter yang sama dengan stringB
        for (int i =0; i < stringA.length(); i++) {
            char ch = stringA.charAt(i);
            if (stringB.indexOf(ch) == -1 ) {
                return false;
            }
        }
        return true;

    }
}