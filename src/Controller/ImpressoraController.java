package Controller;

import br.edu.fateczl.fila.Fila;

public class ImpressoraController {


    public void insereDocumento(Fila f, String documento) {

        f.insert(documento);
    }


    public void imprime(Fila f) throws Exception {

        if(f.isEmpty()) {
            throw new Exception("Não há documentos na fila de impressão");
        } else {
            String documento = String.valueOf(f.remove());

            long tempo = (long) (Math.random() * 3) + 1;
            String[] vetorDocumento = documento.split(";");
            System.out.println("#PC: " + vetorDocumento[0] + " - Arquivo: " + vetorDocumento[1]);

            try {
                Thread.sleep(tempo);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Impressão concluída em: " + tempo + " segundos");
        }
    }
}
