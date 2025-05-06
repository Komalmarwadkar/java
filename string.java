class Test
{
    public static void main (String[] args)
    {
        String s= "GeeksforGeeks";
        System.out.println("String length = " + s.length());
        System.out.println("Character at 3rd position = "+ s.charAt(3));
        System.out.println("Substring " + s.substring(3));
        System.out.println("Substring  = " + s.substring(2,5));
        String s1 = "Geeks";
        String s2 = "forGeeks";
        System.out.println("Concatenated string  = " +s1.concat(s2));
        String s4 = "Learn Share Learn";
        System.out.println("Index of Share " + s4.indexOf("Share"));
        Boolean out = "Geeks".equals("geeks");
        System.out.println("Checking Equality  " + out);
        out = "Geeks".equals("Geeks");
        System.out.println("Checking Equality  " + out);
        out = "Geeks".equalsIgnoreCase("gEeks ");
        System.out.println("Checking Equality " + out);
        int out1 = s1.compareTo(s2);
        System.out.println("the difference between ASCII value is="+out1);
        String w1 = "GeeKyMe";
        System.out.println("Changing to lower Case " +w1.toLowerCase());
        String w2 = "GeekyME";
        System.out.println("Changing to UPPER Case " +w2.toUpperCase());
        String w4 = " Learn Share Learn ";
        System.out.println("Trim the word " + w4.trim());
        String str1 = "feeksforfeeks";
        System.out.println("Original String " + str1);
        String str2 = "feeksforfeeks".replace('f' ,'g') ;
        System.out.println("Replaced f with g -> " + str2);
    }
}
