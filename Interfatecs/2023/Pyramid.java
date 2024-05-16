import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Pyramid{
    public static void main (String[] args) throws IOException{
        pyramid();
    }
    
    private static void pyramid() throws IOException{
        
        BufferedReader brInput = new BufferedReader(new InputStreamReader(System.in));
        String inputs[] = brInput.readLine().split(" ");
        int lines = Integer.parseInt(inputs[0]);
        String type = inputs[1];
        
        if(lines < 1 || lines > 26){
            System.out.print("Invalid input - E001");
            return;
        }
            
        if(!type.equals("maiusculas") && !type.equals("minusculas")){
            System.out.print("Invalid input - E002");
            return;
        }
        
        String dots = ".".repeat(25);
        char a = (type.equals("maiusculas")) ? 'A' : 'a';
        
        StringBuilder out = new StringBuilder();
        StringBuilder chars = new StringBuilder();
        
        for(int i = 0; i < lines; i++){
            out.append(dots.substring(i));
            chars.append((char) (a + i));
            out.append(chars);
            out.append("\n");
        }
        
        System.out.println(out.toString());
    }
    
}
