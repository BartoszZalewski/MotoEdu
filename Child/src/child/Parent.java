
package child;

public abstract class Parent {
    String str = "50";
    
    protected interface Lambda {
        int shift(int n);
    }
    
    public Parent(String str){
        this.str = str;
        System.out.println(str);
    }
    
    public Parent(int param){
        this(Integer.toString(param+550));
    }
    
    public String getString(){
        System.out.println(getInnerString());
        return getInnerString().substring(1,2);
    }
    
    protected abstract String getInnerString();
}
