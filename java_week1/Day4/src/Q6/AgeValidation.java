package Q6;

public class AgeValidation {
    public static void main(String[] args) throws InvalidAgeException {
        try{
            if(args.length<2){
                throw new IllegalArgumentException("Insufficient Arguments");

            }
            String name=args[0];
            int age;
            try{
                 age=Integer.parseInt(args[1]);

            }catch(NumberFormatException e){
                throw new NumberFormatException("Age must be a valid integer");
            }
            if(age<18||age >=60){
                throw new InvalidAgeException("Age must be between 18 and 60");
            }
            System.out.println("Name: "+name+ " Age: "+age);
        }catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
