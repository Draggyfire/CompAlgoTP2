public class TP2 {
    public static void FaitQuelqueChose(int a, int b, int x, int y)
    {
        while(a!=x || b!=y)
        {
            if(a> x)
            {
                a--;
            }
            else
            {
                a++;
            }
            if(b>y)
            {
                b--;
            }
            else
            {
                b++;
            }
        }
        System.out.println(a+" "+b);
    }
    public static String rev(String s){
        return new StringBuilder(s).reverse().toString();
    }

    public static boolean pal1(String s){
        return s.equals(rev(s));
    }
    public static String head(String s){
        return Character.toString(s.charAt(0));
    }
    public static String last(String s){
        return Character.toString(s.charAt(s.length()-1));
    }
    public static String allButLast(String s){
        if(s.isEmpty())return s;
        return s.substring(0,s.length()-1);
    }

    public static String tail(String s){
        return s.substring(1);
    }
    public static boolean pal2(String s){
        String x = s;
        while(!x.equals("")){
            if(head(x).equals(last(x))){
                x= allButLast(tail(x));
            }else {
                return false;
            }
        }
        return true;
    }

    public static boolean pal3(String s){

    }

    public static void main(String[] args) {
        System.out.println(pal2("kayak"));
        System.out.println(pal2("kayad"));
        System.out.println(pal2("KayaKs"));
    }
}
