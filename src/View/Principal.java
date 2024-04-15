package View;

import Controller.ImpressoraController;
import br.edu.fateczl.fila.Fila;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        ImpressoraController IC = new ImpressoraController();
        Fila f = new Fila();
        Scanner scan = new Scanner(System.in);
        int opc = 0;
        String documento;


        while(opc != 9) {

            System.out.print("1 - Inserir documento \n 2 - Imprimir documento \n 9 - Encerrar \n Escolha uma opção: ");
            opc = scan.nextInt();

            switch (opc) {
                case 1:
                    System.out.print("Insira o documento: ");
                    documento = scan.next();
                    if(documento.contains(";")) {
                        IC.insereDocumento(f, documento);
                    } else {
                        System.out.println("Documento inválido");
                    }
                    break;
                case 2: IC.imprime(f);
                case 9:
                    System.out.println("Encerrando");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }


        }




    }

}
