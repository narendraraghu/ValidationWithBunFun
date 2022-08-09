public class TestClass {
    public static void main(String[] args) {
        System.out.println(Validator.checkForSequenceAlphabetCharacterAllowed("abczbz",2));
        System.out.println(Validator.checkForSequenceAlphabetCharacterAllowed("abcdzbz",1));
        System.out.println(Validator.checkForSequenceAlphabetCharacterAllowed("ablckdzbz", 2));
        System.out.println(ValidatorNew.checkForSequenceAlphabetCharacterAllowed("snehabclm", 2));
        System.out.println(ValidatorNew.checkForSequenceAlphabetCharacterAllowed("snehaxyx", 2));
    }
}
