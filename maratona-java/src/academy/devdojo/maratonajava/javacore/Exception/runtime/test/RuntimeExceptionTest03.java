
package academy.devdojo.maratonajava.javacore.Exception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao();
    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "Conexão aberta";
        } catch (Exception e) {
            System.out.println("Erro");
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }

    // o metodo que chama trata o erro
    private static void abreConexao2() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            throw new RuntimeException();
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }
}
