package BaiTapBuoi3.phamconghoang;

import java.util.Scanner;

public class Hoang107250 {
    public static String Sex(Boolean Sex){
        return Sex ? "Male" : "Female";
    }
    public static void main(String[] args) {
        String FullName = "Pham Cong Hoang", DateOfBirth = "25/10/2006", Class = "IT24A", Major = "Information Technology", Address = "Guess";
        int StudentID = 107250, Ages = 18;
        Boolean Sex = true;

        System.out.println("-----Student Information-----");
       
        System.out.println("Student ID: " +StudentID);
        
        System.out.println("Full Name: " +FullName);
       
        System.out.println("Date Of Birth: " +DateOfBirth);
        System.out.println("Ages: " +Ages);
       
        System.out.println("Sex: " +Sex(Sex));
       
        System.out.println("Class: " +Class);
       
        System.out.println("Major: " +Major);
       
        System.out.println("Address: " +Address);
       
        System.out.println("-------------End-------------");

        //XUất thông tin nhập vào từ bàn phím
       Scanner scanner = new Scanner(System.in);

       System.out.println();
    
       System.out.print("Your Full Name: ");
       String fullName = scanner.nextLine();
    
       System.out.print("Date Of Birth: ");
       String dateOfBirth = scanner.nextLine();
    
       System.out.print("Class: ");
       String Cclass = scanner.nextLine();
    
       System.out.print("Major: ");
       String major = scanner.nextLine();
    
       System.out.print("Address: ");
       String address = scanner.nextLine();
    
       System.out.print("Student ID: ");
       int studentID = scanner.nextInt();
    
       System.out.print("Ages: ");
       int ages = scanner.nextInt();
       scanner.nextLine();
    
       System.out.print("Sex: ");
       boolean Gt = scanner.nextBoolean();
       scanner.nextLine();
    
       scanner.close();
    
       System.out.println();
       System.out.print("-----STUDENT INFORMATION-----");
       System.out.printf(
               "\nStudent ID: %d\nFull Name: %s\nDate Of Birth: %s\nAges: %d\nSex: %s\nClass: %s \nMajor: %s\nAddress: %s\n",
               studentID, fullName, dateOfBirth, ages, Sex(Gt), Cclass, major, address);
       System.out.println("-------------END-------------");
       }
}
