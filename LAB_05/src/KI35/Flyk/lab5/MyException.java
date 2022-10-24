
package KI35.Flyk.lab5;


import java.io.FileNotFoundException;

public class MyException extends ArithmeticException {
    public MyException(){
    }

    public String toString(){
        return "an impossible number";
    }


}
