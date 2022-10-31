package saiPackage;

public class Question71CharArrayReturnLengthCharacters{

 public Question71CharArrayReturnLengthCharacters(){}
  public static void main(String[] args){
    char[] str = charArrayReturnLengthCharacters(new char[]{'a','b','c'},1,2);

   if (str != null)
        System.out.println(str);
    else
        System.out.println("NULL");
  }

 static char[] charArrayReturnLengthCharacters(char[] a, int start, int len){
    char[] b = new char[len];

   if (start < 0 || len < 0 ||  start+len > a.length) return null;

   for(int i=0, j=start; i<len; i++, j++ ){
      b[i] = a[j];
    }

   return b;
  }
}
