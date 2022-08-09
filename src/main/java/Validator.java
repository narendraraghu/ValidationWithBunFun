

public class Validator {
    public static boolean checkForSequenceAlphabetCharacterAllowed(String password, int numberOfAllowedSeqChar) {
        String alphabet = "abcdefghijklmnopqrst";
        for (int i = 0; i < password.length() - (numberOfAllowedSeqChar - 1); i++) {
            for (int j = 0; j < password.length() - 1; j++) {
                {
                    if ((i + j + numberOfAllowedSeqChar) < password.length()) {
                        String rangeToCheck = password.substring(i, j + numberOfAllowedSeqChar + 1);
                        if (rangeToCheck.length() < numberOfAllowedSeqChar)
                            return true;
                        String rangeToLowerCase = rangeToCheck.toLowerCase();
                        boolean found = alphabet.contains(rangeToLowerCase);
                        if (found) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static boolean checkForSequenceNumber(String password, int numberOfCharacter) {
        boolean foundSequence = false;
        String alphabet = "0123456789";

        for (int i = 0; i < password.length() - (numberOfCharacter - 1); i++) {
            System.out.println("password.length " + password.length());
            System.out.println("numberOfCharacter " + numberOfCharacter);

            String rangeToCheck = password.substring(i, i + numberOfCharacter);
            boolean found = alphabet.contains(rangeToCheck);
            if (found) {
                foundSequence = true;
                break;
            }
        }
        return foundSequence;
    }

}

