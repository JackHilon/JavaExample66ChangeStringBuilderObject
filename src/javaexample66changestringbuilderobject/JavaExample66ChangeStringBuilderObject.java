
package javaexample66changestringbuilderobject;


public class JavaExample66ChangeStringBuilderObject {

    
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("abcd");
        int a=9;
        Integer b = 6;
        
        System.out.println("Original StringBuilder object: "+sb);
        ChangeStringBuilder1(sb);
        System.out.println(sb);
        StringBuilder e = ChangeStringBuilder2(sb);
        System.out.println(sb);
        System.out.println(e);
        
        System.out.println();
        System.out.println();
        
        System.out.println("Original int primitive value: "+a);
        ChangeInt1(a);
        System.out.println(a);
        int x =ChangeInt2(a);
        System.out.println(x);
        System.out.println(a);
        
        System.out.println();
        System.out.println();
        
        System.out.println("Original Integer object: "+b);
        ChangeInteger1(b);
        System.out.println(b);
        Integer y =ChangeInteger2(b);
        System.out.println(y);
        System.out.println(b);
        
    }
    
    private static void ChangeStringBuilder1(StringBuilder s)
    {
        s.append("XXXX");
    }
    
    private static StringBuilder ChangeStringBuilder2(StringBuilder s)
    {
        StringBuilder res = s.append("XXXX");
        return res;
    }
    
    // -------------------------------------------------------------------------
    
    private static void ChangeInt1(int s)
    {
        s=s+100;
    }
    
    private static int ChangeInt2(int s)
    {
        int r=s+1000;
        return r;
    }
    
    // =========================================================================
    
    private static void ChangeInteger1(Integer s)
    {
        s=s+100;
    }
    
    private static int ChangeInteger2(Integer s)
    {
        int r=s+1000;
        return r;
    }
    
}
