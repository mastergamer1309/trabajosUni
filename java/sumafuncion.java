    public class sumafuncion {
        public static void main(String[] args) {
            int FirstaArray[] = {34,765,234,6654,23};
            int SecondArray[] = {765, 45, 165, 123};
            
            int Contador = Array(FirstaArray, SecondArray);
            counterArray(Contador);
        }

        static int Array(int FirstaArray[], int SecondArray[]) {
            int Contador = 0;
            System.out.println("Repeated values are the next ones: ");
            for (int i = 0; i < FirstaArray.length; i++) {
                for (int j = 0; j < SecondArray.length; j++) {
                    if (FirstaArray[i] == SecondArray[j]) {
                        System.out.println(FirstaArray[i]);
                        Contador++;
                        break;
                    }
                }
            }
            return Contador;
        }

        static void counterArray(int Contador) {
            System.out.println("The numbre==er of repeated values are: " + Contador);
            }
    }
        
        