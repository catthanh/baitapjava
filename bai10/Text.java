public class Text {
    String text;

    public Text() {
        text = "";
    }

    public Text(String text) {
        this.text = text;
    }

    public int countWords() {
        String[] words = text.split("\\s+");
        return words.length;
    }

    public int countNumberOfCharacter(char c) {
        int count = 0;
        char lowerCaseC = Character.toLowerCase(c);
        for (int i = 0; i < text.length(); i++) {
            char lowerCaseChar = Character.toLowerCase(text.charAt(i));
            if (lowerCaseChar == lowerCaseC) {
                count++;
            }
        }
        return count;
    }

    public void standardize() {
        text = text.replaceAll("\\s+", " ");
        text = text.trim();
    }

    public static void main(String[] args) {
        Text text = new Text("   Hello   world   ");
        System.out.println(text.countWords());
        System.out.println(text.countNumberOfCharacter('o'));
        text.standardize();
        System.out.println(text.text);
    }
}
