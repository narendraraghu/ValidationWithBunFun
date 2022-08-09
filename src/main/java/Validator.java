
public class Validator {
    public static boolean checkForSequenceAlphabetCharacter(String password, int numberOfCharacter)
    {
        boolean foundSequence = false;
        String alphabet ="abcdefghijklmnopqrst";

        for (int i = 0; i < password.length()-(numberOfCharacter-1); i++) {
            for (int j = 0; j < numberOfCharacter; j++) {
                String rangeToCheck = password.substring(i,i+numberOfCharacter);
                String rangeToLowerCase = rangeToCheck.toLowerCase();
                boolean found = alphabet.contains(rangeToLowerCase);
                if (found) {
                    foundSequence = true;
                    break;
                }
            }
        }
        return foundSequence;
    }

    public static boolean checkForSequenceNumber(String password, int numberOfCharacter)
    {
        boolean foundSequence = false;
        String alphabet ="0123456789";

        for (int i = 0; i < password.length()-(numberOfCharacter-1); i++) {
            System.out.println("password.length "+password.length());
            System.out.println("numberOfCharacter "+numberOfCharacter);

            String rangeToCheck = password.substring(i,i+numberOfCharacter);
            boolean found = alphabet.contains(rangeToCheck);
            if (found) {
                foundSequence = true;
                break;
            }
        }
        return foundSequence;
    }

}

