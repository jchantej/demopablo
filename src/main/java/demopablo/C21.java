package demopablo;

public class C21 {

    public String m1() {
        return Thread.currentThread().getStackTrace()[1].getMethodName();
    }

    public String m2() {
        return Thread.currentThread().getStackTrace()[1].getMethodName();
    }
    
    public String m3() {
        return Thread.currentThread().getStackTrace()[1].getMethodName();
    }
}
