public class TestClass {
    public static void main(String[] args) {
        System.out.println(Validator.checkForSequenceAlphabetCharacter("azbz",2));
        System.out.println(Validator.checkForSequenceAlphabetCharacter("abczbz",3));
        System.out.println(Validator.checkForSequenceAlphabetCharacter("abcdzbz", 5));
    //  System.out.println(Validator.checkForSequenceNumber("123",3));
    }
}
