public class tareafunciones {
    public static void main(String[] args) {

        int FirstArray[] = {2,2,2};
        int SecondArray[] = {2,2,2};
        int ThirdArray[] = {25,765,345,67,34,7,3,6,3,6,3};
       
        int FirstSum = sumFirstArray(FirstArray);
        int SecondSum = sumSecondArray(SecondArray);
        int ThirdSum = sumThirdArray(ThirdArray);
       
        list(FirstSum, SecondSum, ThirdSum);
    }
   
    static int sumFirstArray(int FirstArray[]){
       
        int FirstSum=0;            
        for (int i = 0;i < FirstArray.length; i++){
            FirstSum += FirstArray[i];                    
        }
        System.out.println("First array's sum is: "+ FirstSum);
        return FirstSum;
    }
   
    static int sumSecondArray(int SecondArray[]){
   
        int SecondSum = 0;
        for (int i = 0;i < SecondArray.length; i++){
            SecondSum += SecondArray[i];                    
        }
        System.out.println("Second array's sum is: "+ SecondSum);
        return SecondSum;
    }
   
    static int sumThirdArray(int ThirdArray[]){
   
        int ThirdSum=0;        
        for (int i=0;i<ThirdArray.length;i++){
           ThirdSum+=ThirdArray[i];                    
        }
        System.out.println("Third array's sum is: : " + ThirdSum + "\n");
        return ThirdSum;
    }
   
    static void list(int FirstSum, int SecondSum, int ThirdSum){
   
        if(FirstSum>SecondSum && FirstSum>ThirdSum){
           System.out.println("First array is the largest");

        }else if(SecondSum>FirstSum && SecondSum>ThirdSum){
           System.out.println("Second array is the largest");

        }else if(ThirdSum>FirstSum && ThirdSum>SecondSum){
           System.out.println("Third array is the largest");
       }
    }
}
    

