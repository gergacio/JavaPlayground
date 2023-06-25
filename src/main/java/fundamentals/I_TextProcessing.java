package fundamentals;

public class I_TextProcessing {

    public I_TextProcessing(){}

    //Problem 01----------------------------------------------------------------------------------
    //Read an array from strings
    //Repeat each word n times, where n is the length of the word
    public String repeatStrings(String[] arr){
        String str;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++){
            str = arr[i].repeat(arr[i].length());

            sb.append(str);
        }
        return String.format("%s",sb);
    }
    //Problem 02----------------------------------------------------------------------------------
    //You are given a remove word and a text
    //Remove all substrings that are equal to the remove word
    //Here i am using StringBuilderAPI
    public String removeSubstring(String removeWord, String text){
        StringBuffer sb = new StringBuffer();
        sb.append(text);

        while (true){
            String tempStr = sb.toString();
            if(!tempStr.contains(removeWord)){
                break;
            }
            int indexStart = tempStr.indexOf(removeWord);
            int indexEnd = indexStart + removeWord.length();
            sb.delete(indexStart, indexEnd);

        }
        return String.format("%s",sb.toString());
    }
    //Problem 02----------------------------------------------------------------------------------
    //You are given a string of banned words and a text
    //Replace all banned words in the text with asterisks (*)
    //Here i am using StringAPI
    public String textFilter(String bannedWord, String text){

        String target = bannedWord;
        String replacement = "*";
        String processed = text.replace(target, replacement);

        return String.format("%s",processed.toString());

    }

}
