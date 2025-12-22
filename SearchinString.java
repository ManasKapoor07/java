
public class SearchinString {

    public static void main(String[] args) {
        String str1 = "Manas";
        char target = 'k';

      searchInString(str1, target);

    }

    public static void  searchInString(String str1, char target) {
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == target) {
                System.out.println(i);
            }
            
        }
    }

}
