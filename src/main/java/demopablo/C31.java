package demopablo;

public class C31 {
    public String m1() {
        return Thread.currentThread().getStackTrace()[1].getMethodName();
    }

    public String m2() {
        return Thread.currentThread().getStackTrace()[1].getMethodName();
    }

}
