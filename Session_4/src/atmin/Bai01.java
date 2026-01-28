package atmin;

import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        String title;
        String author;
        String type;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your title:");
        title = input.nextLine();
        System.out.print("Please enter your author:");
        author = input.nextLine();
        System.out.print("Please enter your type:");
        type = input.nextLine();

        title =title.trim().replaceAll(" +"," ").toUpperCase();
        author =author.trim().replaceAll(" +"," ");
        type=type.trim().replaceAll(" +"," ");

        String[] authors = author.split(" ");
        StringBuilder temp = new StringBuilder();
        for(String s: authors){
            temp.append(s.substring(0, 1).toUpperCase())
                    .append(s.substring(1).toLowerCase())
                    .append(" ");
        }
        author = temp.toString().trim();

        System.out.printf("[%s] - tac gia: %s - the loai: %s",title,author,type);
    }
}
