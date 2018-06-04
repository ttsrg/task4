
import java.util.Scanner;

public class task42 {

    public static void main(String[] args) {

        int news, pages;
        pages = 0;
        news = scan();
        begin:
        // I haven't understood why it such works
        if (news > 0) {
            if (news % 10 == 0) {
                //System.out.println("bez ostatka");
                pages = news / 10;
            } else {
                //System.out.println("s ostatkom");
                pages = news / 10 + 1;
            }
        } else {
            System.out.println("Enter the correct number of news!!!");
            break begin; //This's the crutch
        }
        System.out.println("Pages= " + pages);
    }

    static int scan() {
        System.out.println("Enter the number of news, please:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        /*if (number%1 !=0  ) {
            System.out.println("iT'S NOT an Int");     /////How I can realise that?
        } */
        return number;
    }

}
