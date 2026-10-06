package sc2002.Tutorial4;

public class UnknownOperatorException extends Exception{
    public UnknownOperatorException(){
            System.out.println("Unknown Operator.");
        }
        public UnknownOperatorException(char a){
            super(a + "is an unknown operator.");
        }
        public UnknownOperatorException(String message){
            super(message);
        }
}
