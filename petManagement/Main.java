package petManagement;

import java.util.Scanner;

public class Main 
{
    public static int inputint(String message)
    {
        Scanner scanner = new Scanner(System.in);
        int answer;
        System.out.println(message);
        answer = scanner.nextInt();
        return answer;
    }

    public static String inputString(String message)
    {
        Scanner scanner = new Scanner(System.in);
        String answer;
        System.out.println(message);
        answer = scanner.nextLine();
        return answer;
    }
    public static void main(String[] args)
    {
        int select;
        do
        {
            System.out.println("****************************");
            System.out.println("Pet Management System");
            System.out.println("----------------------------");
            System.out.println("(Press 1) = Add Pet");
            System.out.println("(Press 2) = View Pets");
            System.out.println("(Press 3) = Search Pets");
            System.out.println("(Press 4) = Remove Pets");
            System.out.println("(Press 5) = Exit");
            System.out.println("****************************");

            select = inputint("What option wuld you like?: ");
            switch(select)
            {
                case 1:
                petManager.addPet();
                break;

                case 2:
                petManager.viewPets();
                break;

                case 3:
                petManager.searchPets();
                break;

                case 4:
                petManager.removePet();
                break;

                case 5:
                System.out.println("Goodbye! ");
                break;

                default:
                System.out.println("Invalid option! Try again! ");
                break;
            }
        }while(select !=5);

    }
    
}
