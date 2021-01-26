# java.lang.String

## Intro

## 자바는 문자열을 위한 String 클래스를 제공하고 있습니다. String 클래스에는 문자열을 처리하기 위한 메소드가 내장되어 있는데, 개인적으로 자주 사용해왔던 메소드들을 복습 겸 정리해보겠습니다.

---

## Methods

---

### Instance Methods

---

-   charAt()
-   compareTo​(String anotherString)
-   compareToIgnoreCase​(String str)
-   concat​(String str)
-   contains​(CharSequence s)
-   contentEquals​(CharSequence cs)
-   endsWith​(String suffix)
-   equals​(Object anObject)
-   equalsIgnoreCase​(String anotherString)
-   indexOf​(int ch)
-   indexOf​(int ch, int fromIndex)
-   indexOf​(String str)
-   indexOf​(String str, int fromIndex)
-   isBlank()
-   isEmpty()
-   lastIndexOf​(int ch)
-   lastIndexOf​(int ch, int fromIndex)
-   lastIndexOf​(String str)
-   lastIndexOf​(String str, int fromIndex)
-   length()
-   matches​(String regex)
-   regionMatches​(boolean ignoreCase, int toffset, String other, int ooffset, int len)
-   regionMatches​(int toffset, String other, int ooffset, int len)
-   repeat​(int count)
-   replace​(char oldChar, char newChar)
-   replace​(CharSequence target, CharSequence replacement)
-   replaceAll​(String regex, String replacement)
-   replaceFirst​(String regex, String replacement)
-   split​(String regex)
-   split​(String regex, int limit)
-   startsWith​(String prefix)
-   startsWith​(String prefix, int toffset)
-   strip()
-   stripLeading()
-   stripTrailing()
-   subSequence​(int beginIndex, int endIndex)
-   substring​(int beginIndex)
-   substring​(int beginIndex, int endIndex)
-   toCharArray()
-   toLowerCase()
-   toLowerCase​(Locale locale)
-   toUpperCase()
-   toUpperCase​(Locale locale)
-   trim()

---

### Static Methods

---

-   copyValueOf​

    char 배열을 String으로 리턴합니다.

<pre><code>
public class CopyValueOf {
    public static void main(String[] args) {

        String hello = "hello, World!";
        char[] data = hello.toCharArray();

        // copyValueOf​(char[] data)
        String newString = String.copyValueOf(data);

        // copyValueOf​(char[] data, int offset, int count)
        String newString2 = String.copyValueOf(data, 0, 5);

        System.out.println("Hello : " + hello);
        System.out.println("newString : " + newString);
        System.out.println("newString2 : " + newString2);
    }

}

</code></pre>
<br/>
실행결과

> Hello : hello, World!  
> newString : hello, World!  
> newString2 : hello

---

-   format​  
     인자를 지정한 형식의 문자열로 리턴합니다.

<pre><code>
public class Format {
    public static void main(String[] args) {
      
     double input = 3.141592;
    String formattedString = String.format("", input);
      
    System.out.println(formattedString.isBlank());
    System.out.println(formattedString.isEmpty());
    System.out.println(formattedString == null);
  
     // format​(String format, Object... args)
    System.out.println(String.format("%.1f", input));
    System.out.println(String.format("%.2f", input));
    System.out.println(String.format("%.3f", input));
    System.out.println(String.format("%.4f", input));
    System.out.println(String.format("%f", input));
    }
}
</code></pre>
<br/>
실행결과

> true  
> true  
> false  
> 3.1  
> 3.14  
> 3.142  
> 3.1416  
> 3.141592

---

-   join​  
    구분자를 배열의 원소 사이사이에 삽입하면서 배열을 문자열로 합쳐서 리턴합니다.

<pre><code>
public class Join {
    public static void main(String[] args) {

        String input = "hello, join";
        System.out.println(input);

        String[] inputArray = input.split(", ");

        System.out.println(inputArray[0]);
        System.out.println(inputArray[1]);

        // join​(CharSequence delimiter, CharSequence... elements)
        String joinString = String.join("#", inputArray);
        System.out.println("joinString : " + joinString);
    }
}
</code></pre>
<br/>
실행결과

> hello, join  
> hello  
> join  
> joinString : hello#join

---

-   valueOf​  
     각 인자들의 값을 문자열로 표현하여 리턴합니다.
    <br/>

        valueOf​(char c)
        valueOf​(char[] data)
        valueOf​(char[] data, int offset, int count)
        valueOf​(double d)
        valueOf​(float f)
        valueOf​(int i)
        valueOf​(long l)
        valueOf​(Object obj)

<br/>

> 이글은 [Overview (Java SE 11 & JDK 11 ) - Oracle Docs](https://docs.oracle.com/en/java/javase/11/docs/api/index.html)를 참고하여 작성했습니다.
