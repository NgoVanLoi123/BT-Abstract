import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Mời bạn nhập họ tên:");
        String name =sc.nextLine();
        String profession;

        do{
            System.out.println("Mời bạn nhập tên ngành:");
            profession =sc.nextLine();
            if(profession.equals("IT")){
                System.out.println("Nhập điểm java:");
                double markJava =sc.nextDouble();
                System.out.println("Nhập điểm html:");
                double markHtml =sc.nextDouble();
                System.out.println("Nhập điểm Css:");
                double markCss =sc.nextDouble();
                SinhVienIT IT =new SinhVienIT();
                IT.setName(name);
                IT.setProfession(profession);
                IT.setMarkJava(markJava);
                IT.setMarkHtml(markHtml);
                IT.setMarkCss(markCss);
                IT.display();
            }else if(profession.equals("Marking")){
                System.out.println("Nhập điểm Marking:");
                double markMarketing =sc.nextDouble();
                System.out.println("Nhập điểm Sales:");
                double markSales =sc.nextDouble();
                SinhVienBiz biz =new SinhVienBiz();
                biz.setName(name);
                biz.setProfession(profession);
                biz.setMarkMarketing(markMarketing);
                biz.setMarkSales(markSales);
                biz.display();
            }else {
                System.out.println("Tên ngành không hợp lệ. Vui lòng nhập lại!");
            }
        }while(!profession.equals("IT") && !profession.equals("Marking"));


    }
}