package saiPackage;

public class Question03LengthCharacters{
  public static void main(String args[]){

    char[] str = lengthCharacters(new char[]{'a','b','c'}, 0, 4);
    if (str==null) System.out.println("NULL"); else System.out.println(str);
           str = lengthCharacters(new char[]{'a','b','c'}, 0, 3);
    if (str==null) System.out.println("NULL"); else System.out.println(str);
           str = lengthCharacters(new char[]{'a','b','c'}, 0, 2);
    if (str==null) System.out.println("NULL"); else System.out.println(str);
           str = lengthCharacters(new char[]{'a','b','c'}, 0, 1);
    if (str==null) System.out.println("NULL"); else System.out.println(str);
           str = lengthCharacters(new char[]{'a','b','c'}, 1, 3);
    if (str==null) System.out.println("NULL"); else System.out.println(str);
           str = lengthCharacters(new char[]{'a','b','c'}, 1, 2);
    if (str==null) System.out.println("NULL"); else System.out.println(str);
           str = lengthCharacters(new char[]{'a','b','c'}, 1, 1);
    if (str==null) System.out.println("NULL"); else System.out.println(str);
           str = lengthCharacters(new char[]{'a','b','c'}, 2, 2);
    if (str==null) System.out.println("NULL"); else System.out.println(str);
           str = lengthCharacters(new char[]{'a','b','c'}, 2, 1);
    if (str==null) System.out.println("NULL"); else System.out.println(str);
           str = lengthCharacters(new char[]{'a','b','c'}, 3, 1);
    if (str==null) System.out.println("NULL"); else System.out.println(str);
           str = lengthCharacters(new char[]{'a','b','c'}, 1, 0);
    if (str==null) System.out.println("NULL"); else System.out.println(str);
           str = lengthCharacters(new char[]{'a','b','c'}, -1, 2);
    if (str==null) System.out.println("NULL"); else System.out.println(str);
           str = lengthCharacters(new char[]{'a','b','c'}, -1, -2);
    if (str==null) System.out.println("NULL"); else System.out.println(str);
           str = lengthCharacters(new char[]{}, 0, 1);
    if (str==null) System.out.println("NULL"); else System.out.println(str);

  }

  static char[] lengthCharacters(char[] a, int start, int len){
    // a.len < len return null
    // a.len == 0  return null
    // start < 0   return null
    // len   < 0   return null
    // start + len > a.len return null
    
    if (a.length == 0 || start < 0 || len < 0 || start+len > a.length) 
      return null;

    char[] b = new char[len];

    for (int i=0, j=start; i<len; i++, j++){
      b[i] = a[j];
    }
    return b;
  }
}


/*
package me.sekayasin;

import java.util.Arrays;

public class Question3 {

    public static void main(String[] args) {
        System.out.println(charArrayBasedStartLength(new char[]{'a','b', 'c'}, 1, 2));
    }

    static String charArrayBasedStartLength(char[] chars, int start, int len) {
        if (len < 0 ||start < 0 || start + len - 1 >= chars.length)
            return null;
        char[] newChars = new char[len];
        for(int i = start, j = 0; j < len; i++, j++){
            newChars[j] = chars[i];
        }
        return Arrays.toString(newChars);
    }
}
*/
