/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package JavaComentarios;

public class App {
    public String getGreeting() {
        return "Olá mundo!";
    }
    
    // Comentário de uma linha básica
    
    /*
        Comentário
        de
        várias
        linhas
    */
    
    /**
        Comentário de documentação! JAVA DOC
     * @param args
     */

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
