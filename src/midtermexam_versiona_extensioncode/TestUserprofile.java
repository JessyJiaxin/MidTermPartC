/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;
/**
 *
 * @author jessy
 */
public class TestUserprofile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name here: ");
        String name = scanner.nextLine();
        
        System.out.println("Choose your fav genre from the list:");
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        
        //use loop to add the number of the list  
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i+1) + ". " + genres[i]);
        }
        
        //let input num correspond to list
        System.out.print("Enter the number of your fav genre: ");
        int gIndex = scanner.nextInt();
        String genre = genres[gIndex-1];
        
        UserProfile uProfile = new UserProfile(name, genre);
        
        //print all the info together
        System.out.println("User profile has been created for " + 
                uProfile.getUserID() + ",his/her fav genre is " + uProfile.getGenre());
         
    }

}
   
