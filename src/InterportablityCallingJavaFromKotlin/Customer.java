package InterportablityCallingJavaFromKotlin;

/**
 * Created by chetan on 13/7/16.
 */
public class Customer {

    private String name;

    public Customer(String s){
        name = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}