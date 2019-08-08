package univates_2019b;

/**
 *
 * @author yuri.mattiuz
 */
public class UNIVATES_2019B {
    public static void main(String[] args){
    
        soma(2,3);
        subtrai(3,3);
        
        String var1 = "Juca";
        String var2 = "Juca";
        
        if(2 == 3){
            System.out.println("2 não é igual a 2");
        }else{
            System.out.println("2 é igual a 3");
        }
        
        // 3 laços de repetição
        for(int i = 0; i <= 10; i++){
           System.out.println("Valor de i =" + i);        
        }
        
        int i = 0;
        while(i <10){
            System.out.println(i + "i menor que 10");
            i += 1;
        }
      
         do{
            System.out.println("Infinito");
        }while(i < 18);
        {
        
        //tipos de variaveis
        boolean n1 = false;
        int n2 = 10;
        float n3 = 5.4546f;
        System.out.println(n3);
        double n4 = 5.41;
        System.out.println(n4);
        String n5 = "Juca Bala";
        System.out.println(n5.trim()); // remove os espaços
            
        }
    }   
        
    public static void soma(int var1, int var2) {
        int result = var1 + var2;
        System.out.println("Resultado= "  + result);
    
    }
    
    public static void subtrai(int num1, int num2){
        int result = num1 - num2;
        System.out.println("Resultado= " + result);
    }
}
