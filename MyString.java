public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        if(str==null || str.isEmpty())
            return str;
        char [] arr = new char[str.length()];
        for (int i=0; i<str.length();i++)
        {
            if(str.charAt(i)>='A'&& str.charAt(i)<='Z')
            {
                char newchar = (char)(str.charAt(i) + 32);
                arr [i] = newchar;
            }
            else
                arr [i] = str.charAt(i);
        }
          return new String(arr);
        // Replace the following statement with your code
    
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
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
}
