public class Blaittland {
    public static void main(String args[]){
        String ret = verifyReadenBooks("ABCEJDFGHI");
        
        System.out.println(ret);
    }
    
    public static String verifyReadenBooks(String shelf){
        char copyShelf[] = shelf.toCharArray();
        int count = 0;
        int countDirect = 0;
        
        for(int k = 0; k < copyShelf.length; k++){
            char book = copyShelf[k];
            
            for(int j = k; j < copyShelf.length; j++){
                if(book > copyShelf[j]){
                    count++;
                    countDirect++;
                }
                
                if(countDirect>=5)
                    return "yes";
            }
            
            countDirect = 0;
        }
        
        return count+"\n";
    }
          }
