package saiPackage;

public class Question76areAnagrams{
    public static void main(String[] args){
        System.out.println(" {'s', 'i', 't'}, {'i', 't', 's'} : " + areAnagrams(new char[]{'s', 'i', 't'}, new char[]{'i', 't', 's'}));
        System.out.println(" {'s', 'i', 't'}, {'i', 'd', 's'} : " + areAnagrams(new char[]{'s', 'i', 't'}, new char[]{'i', 'd', 's'}));
        System.out.println(" {'b', 'i', 'g'}, {'b', 'i', 't'} : " + areAnagrams(new char[]{'b', 'i', 'g'}, new char[]{'b', 'i', 't'}));
        System.out.println(" {'b', 'o', 'g'}, {'b', 'o', 'o'} : " + areAnagrams(new char[]{'b', 'o', 'g'}, new char[]{'b', 'o', 'o'}));
        System.out.println(" {}, {}                           : " + areAnagrams(new char[]{}, new char[]{}));
        System.out.println(" {'b', 'i', 'g'}, {'b', 'i', 'g'} : " + areAnagrams(new char[]{'b', 'i', 'g'}, new char[]{'b', 'i', 'g'}));
        System.out.println(" {'p', 'o', 'o', 'l'}, {'p', 'o', 'l', 'l'} : " + areAnagrams(new char[]{'p', 'o', 'o', 'l'}, new char[]{'p', 'o', 'l', 'l'}));
    }

   static int areAnagrams(char[] a1, char[] a2){
        if (a1.length != a2.length) return 0;

       int ret =1;
        char a1_char = '0';
        int a1_char_count = 0;
        int a2_char_count = 0;

       for (int i=0; i<a1.length; i++){
            a1_char =a1[i];

           a1_char_count = getCharCount(a1, a1_char);
           a2_char_count = getCharCount(a2, a1_char);

           if (a1_char_count != a2_char_count) ret =0;
        }
        return ret;
    }

   static int getCharCount(char[] a, char ch){
        int count =0;

       for (int i=0; i<a.length; i++){
            if (a[i] == ch) count++;
        }
        return count;
    }
}