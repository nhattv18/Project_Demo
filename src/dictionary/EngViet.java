package dictionary;

import java.util.ArrayList;
import java.util.Scanner;

public class EngViet {

    ArrayList<Dictionary> addArr = new ArrayList<>();
    Dictionary dc = new Dictionary();
    Scanner sc = new Scanner(System.in);

// Creat a method add Word
    public void addWord() {
        String eng;
        String vn;
        System.out.print("Input your English: ");
        eng = sc.nextLine();
        System.out.print("Input your Vietnamese: ");
        vn = sc.nextLine();
        dc.setEngLish(eng);
        dc.setVietNam(vn);
        addArr.add(dc);
    }

// Creat a method search Word
    public void searchWord() {
        String search;
        System.out.print("Input your word you want to search: ");
        search = sc.nextLine();
        for (int i = 0; i < addArr.size(); i++) {
            if (search.equals(addArr.get(i).getEngLish())) {
                System.out.println("Vietnamese: " + addArr.get(i).getVietNam());

            } else {
                System.out.println("Not word!!!");

            }
        }

    }

    public static void main(String[] args) {
// TODO Auto-generated method stub
        Scanner sd = new Scanner(System.in);
        EngViet ev = new EngViet();
        int choice = 0;
        System.out.println("English - Vietnamese");
        do {

            System.out.println("1. Input your word");
            System.out.println("2. Seach for word");
            System.out.println("3. Exit!");
            System.out.print("Please input your choice: ");
            choice = sd.nextInt();

            switch (choice) {
                case 1:
//EngViet ev = new EngViet();
                    ev.addWord();
                    break;
                case 2:
//EngViet em = new EngViet();
                    ev.searchWord();
                    break;
                case 3:
                    break;

                default:
                    System.out.println("Not correct! Please try again!");
                    break;
            }

        } while (choice != 3);

    }

}

class Dictionary {

    private String vietNam;
    private String engLish;

    public String getVietNam() {
        return vietNam;
    }

    public void setVietNam(String vietNam) {
        this.vietNam = vietNam;
    }

    public String getEngLish() {
        return engLish;
    }

    public void setEngLish(String engLish) {
        this.engLish = engLish;
    }

}
