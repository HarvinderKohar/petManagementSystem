package petManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class petManager 
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

    private static ArrayList<Pet> petList = new ArrayList<>();
    
    public static void addPet()
    {
        String petName = inputString("What is the pets name?: ");
        String petType = inputString("What type of pet is it?: ");
        int petAge = inputint("What is the pets age?: ");

        Pet pets = new Pet(petName, petType, petAge);
        petList.add(pets);
        System.out.println("The pet has been added succesfully! ");
    }

    public static void viewPets()
    {
        if(petList.isEmpty())
        {
            System.out.println("No Pets have been added! Add a pet to view pets!");
        }

        else
        {
            for(Pet petz: petList)
            {
                System.out.println(petz);
            }
        }
    }

    public static void searchPets()
    {
        String name = inputString("What is the pets name?: ");
        for(Pet petz: petList)
        {
            if(petz.getName().equalsIgnoreCase(name))
            {
                System.out.println("Pet has been found: " + petz);
            }

            else
            {
                System.out.println("Pet has not been found! ");
            }
        }
    }

    public static void removePet()
    {
        String name = inputString("Whats the name of the pet you would like to remove?: ");
        for (Pet petz : petList)
        {
            if(petz.getName().equalsIgnoreCase(name))
            {
                petList.remove(petz);
                System.out.println("Pet has been removed successfully! ");
            }

            else
            {
                System.out.println("Pet is not in the List! ");
            }
        }
        
    }




    
}
