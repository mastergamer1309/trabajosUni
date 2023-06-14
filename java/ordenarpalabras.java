import java.util.Arrays;

public class ordenarpalabras {
    public static void main(String []args){
        String words[] = {"gato","ola","computadora","perros"};
        for(int i = 0; i < words.length;i++){
            for (int j = i+1; j<words.length;j++){
                if(words[i].length() > words[j].length()){
                    String rightelement = words[j];
                    String leftelement = words[i];
                    words[j] = leftelement;
                    words[i] = rightelement; 
                }

                
            }
        }

        System.out.println(Arrays.toString(words));
    }
    
}
