package Q5;

import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.nextLine();
        System.out.println("Enter your country: ");
        String country=sc.nextLine();

            if (country.equals("india")||country.equals("INDIA")||country.equals("India"))
                {
                    Registration r = new Registration(name, country);
                    r.RegisterUser(name, country);
                    System.out.println("User registered successfully");

                }

            else{
                throw new InvalidCountryException("User Outside India cannot be registered");
            }



        }

    }

