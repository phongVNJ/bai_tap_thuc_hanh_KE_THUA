import javax.swing.*;
import java.util.ArrayList;

public class tinhtoan {
    public static void main(String[] args) {
        book book1 = new Fiction("123","Sáng",789,"Thơ","456");
        book book2 = new Fiction("456","Trưa",123,"Dũng","789");
        book book3 = new Fiction("abc","Chiều",456,"Phong","542");
        book book4 = new ProgrammingBook("paa","Buổi sáng",4124,"Hiền","java");
        book book5 = new ProgrammingBook("123","Buổi trưa ",123,"Đoán","ull");
        book book6 = new ProgrammingBook("red","Buổi tối",31,"KANH","aaa");

        book[] Mylist = new book[6];
        Mylist[0]=book1;
        Mylist[1]=book2;
        Mylist[2]=book3;
        Mylist[3]=book4;
        Mylist[4]=book5;
        Mylist[5]=book6;
        int sum = 0;
        int count = 0;
        for (int i =0;i<6;i++){
            sum += Mylist[i].price;
        }
        System.out.println("gia cua 6 quyen sach:"+sum);
        int countJavaBook = 0;

        for(int i = 0; i < 6; i++){
            boolean isProgramBook =Mylist[i] instanceof ProgrammingBook;
            if(isProgramBook){
                boolean isJavaBook = ((ProgrammingBook) Mylist[i]).Language.equals("java");
                if(isJavaBook)
                    countJavaBook++;
            }
        }

        System.out.println("Tong so sach viet ve Java la " + countJavaBook);
    }
}
