
package child;

public class Child extends Parent{

    private Inner c;

    public Child(String s){
        this(Integer.valueOf(s)+33);
    }
    
    private class Inner{
        Lambda lam = (n) -> (n<<3);
        String str;
        public Inner(int param){
            str=Integer.toString(lam.shift(param));
            System.out.println("str: "+str);
        }
    }
    
    public static void main(String[] args) {

        Parent a = new Child("1");
        System.out.println(a.getString());
        // 100010000
    }
    
    private Child(int param){
        super(param);
        c=new Inner(param);
    }
    
    protected String getInnerString(){
        return c.str;
    }
    
}
