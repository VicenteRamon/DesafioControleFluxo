
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		
        
        int parametroUm = 0;
        int parametroDois = 0;
        
        while(true){
		try {
            //chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
            break;
            
		}catch (ParametrosInvalidosException e) {
			System.err.println(e.getMessage());
		}

    }
		
	}   
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
       int parametros[] = getParametrosFromTerminal(parametroUm, parametroDois);
         parametroUm = parametros[0];
         parametroDois = parametros[1];
        
       if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("Parametro Um não pode ser maior que Parametro Dois");
        }
		
		int contagem = parametroDois - parametroUm;
		
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número: " + i);
        }
	}
   
    public static int[] getParametrosFromTerminal(int parametroUm, int parametroDois) {
        Scanner terminal = new Scanner(System.in);
    
        System.out.println("Digite o novo valor para ParametroUm:");
        parametroUm = terminal.nextInt();
        System.out.println("Digite o novo valor para ParametroDois:");
        parametroDois = terminal.nextInt();

        return new int[]{parametroUm, parametroDois};
    }
}