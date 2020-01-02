package tasksFromBFD;

public class stringsOperations {
    public static void main(String[] args) {
        String sentence =
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the" +
                        " industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type" +
                        " and scrambled it to make a type specimen book. It has survived not only five centuries, but also the" +
                        " leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s" +
                        " with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop" +
                        " publishing software like Aldus PageMaker including versions of Lorem Ipsum. ";
        String replacedSpacetoDot = sentence.replace(" ", ",");
        int indexOfFirsDot = sentence.indexOf(".");
        System.out.println(replacedSpacetoDot);
        System.out.println(indexOfFirsDot);
        String firstSentence = sentence.substring(0, indexOfFirsDot + 1);
        int indexOfSecSentence = sentence.indexOf(".", indexOfFirsDot + 1);
        System.out.println(indexOfSecSentence);
        System.out.println(firstSentence);
        int lastIndexOfDot = sentence.lastIndexOf(".");
        System.out.println(lastIndexOfDot);
        String sentenceWithoutSecSentence = sentence.substring(indexOfFirsDot + 1, indexOfSecSentence + 1);
        System.out.println(sentenceWithoutSecSentence + sentence.substring(indexOfSecSentence + 1, lastIndexOfDot));
    }
}
