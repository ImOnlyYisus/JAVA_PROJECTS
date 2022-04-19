package ejercicio02;

import java.util.Scanner;

public class InputText {
    protected String text = "";

    public InputText(){
        pedirTeclado();
    }

    private void pedirTeclado(){
        Scanner sc = new Scanner(System.in);
        String input ="";
        do {
            input =sc.nextLine();
            if(!input.equalsIgnoreCase("eof")){
                text+=input+"\n";
            }

        }while(!input.equalsIgnoreCase("eof"));
    }

    public String getText() {
        return text;
    }

    public static void main(String[] args) {
        InputText it = new InputText();
        System.out.println(it.getText());
    }
}
