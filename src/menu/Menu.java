
package menu;

import java.util.*;

public class Menu {

    public static void main(String[] args) {
            System.out.println("============Menu==============");
            System.out.println("1:Danh sach sinh vien ");
            System.out.println("2:Them moi sinh vien  ");
            System.out.println("3:Sua sinh vien");
            System.out.println("4:Xoa sinh vien");
            System.out.println("5:Thoat ");
            System.out.println("------------------------------");
            System.out.println("Nhap lua chon cua ban ");
        int luachon;
        Scanner sc = new Scanner (System.in);
        do {         
            
            do{
                luachon = sc.nextInt();
                
              if(luachon  > 5){
                System.out.println(" Yeu cau nhap lai khong co trong danh sach ");
              }
                else 
                {
                   if (luachon == 1) {
                    System.out.println("STT : 01   Nguyen van A");
                    System.out.println("STT : 02   Nguyen van A");                      
                   } 
                  if(luachon == 2){
                        System.out.println("Thêm mơi sinh vien ");
                    }
                  if(luachon == 3){
                        System.out.println("Sua sinh vien ");
                    }
                  if(luachon == 4){
                        System.out.println("Xóa sinh vien ");
                    }
                  else {
                      if(luachon == 5){
                        System.out.println("Thoát ");
                        System.out.println("============Menu==============");
                        System.out.println("1:Danh sach sinh vien ");
                        System.out.println("2:Them moi sinh vien  ");
                        System.out.println("3:Sua sinh vien");
                        System.out.println("4:Xoa sinh vien");
                        System.out.println("5:Thoat ");
                        System.out.println("------------------------------");
                        System.out.println("Nhap lua chon cua ban ");
                    }
                  } 
                 
                  
                }
            }while(luachon < 1 || luachon < 2 || luachon <3 || luachon < 4 || luachon > 5);
            
        } while (luachon == 1 || luachon == 2 || luachon == 3 || luachon == 4 || luachon == 5);
    }
    
}
