package demopablo;

public class C32Test {

    public String mA() {
        return Thread.currentThread().getStackTrace()[1].getMethodName();
    }

}
