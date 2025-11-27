public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    public static boolean contains(String str1, String str2) 
    {
    if (str1 == null || str2 == null || str2.length() > str1.length()) {
        return false;
    }
    if (str2.isEmpty()) {
        return true;
    }
    int n1 = str1.length();
    int n2 = str2.length();
    for (int i = 0; i <= n1 - n2; i++) 
    {
        boolean isMatch = true;
        for (int j = 0; j < n2; j++) 
        {
            if (str1.charAt(i + j) != str2.charAt(j)) 
            {
                isMatch = false;
            }
        }
        if (isMatch) {
            return true;
        }
    }
    return false;
}

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        for(int i=0; i<sentences.length;i++)
        {
            String currentS = sentences[i]; 
            String lowerCaseSentence = currentS.toLowerCase();
            for(int j=0; j<keywords.length; j++)
            {
                String lowerCaseKeyword = keywords[j].toLowerCase(); 
                if (contains(lowerCaseSentence, lowerCaseKeyword)) {     
                    System.out.println(currentS);
                    break;
            }
        }
        // Replace this comment with your code
    }
    }
}
