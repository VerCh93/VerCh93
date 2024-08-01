public class Couples {
    public static void main(String[] args) {
        String[] women = {"Olivia", "Carrie", "Jenna"};
        String [] men = {"John", "Frank", "Tom"};
        int start = 0;
        int end = men.length - 1;
        for (int i = 0; i < women.length; i++) {
            System.out.println(women[start] + " and " + men[end]);
            start++;
            end--;
        }

    }

}
