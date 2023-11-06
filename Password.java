import java.util.Random;

public class Password {
    public static void main(String args[]) 
    {
        int length = 10;
        String password = generatePassword(length);
        System.out.println("Random password: " + password);
    }

    public static String generatePassword(int length) 
    {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }

        return password.toString();
    }
}

