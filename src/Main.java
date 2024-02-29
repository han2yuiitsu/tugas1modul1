import java.util.Scanner;
//class pada package java.util yg digunakan untk mmbca input dri pgguna
public class Main {
    

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String usernameAdmin = "Admin";
        String passwordAdmin = "Admin123";
        int login;

        String[] nimmahasiswa = {"202310370311086 "};

        while (true) {
            System.out.println("===== Library System =====");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");
            System.out.print("Choose option (1-3): ");
            login = input.nextInt();
            input.nextLine(); // Consume newline character after reading integer

            switch (login) {
                case 1:
                    System.out.print("Enter your NIM: ");
                    String masukkannim = input.nextLine();

                    boolean benaratausalah = false;
                    for (String nim : nimmahasiswa) {
                        if (nim.equals(masukkannim)) {
                            benaratausalah = true;
                            break;
                        }
                    }

                    if (benaratausalah) {
                        System.out.println("Successfully login as Student");
                    } else {
                        System.out.println("User Not Found");
                    }
                    break;
                case 2:
                    System.out.print("Enter your Username (admin): ");
                    String masukkanAdmin = input.nextLine();
                    System.out.print("Enter your Password (admin): ");
                    String passwordAdminInput = input.nextLine();
                    if (masukkanAdmin.equals(usernameAdmin) && passwordAdminInput.equals(passwordAdmin)) {
                        System.out.println("Successfully login as Admin");
                    } else {
                        System.out.println("Admin User Not Found!!");
                    }
                    break;
                case 3:
                    System.out.println("Thank you");
                    return;
                default:
                    System.out.println("Invalid option! Please choose between 1 to 3.");
            }
        }
    }
}