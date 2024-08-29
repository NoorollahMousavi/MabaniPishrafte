import org.junit.jupiter.api.Test;

public class MachinTest {

    class Mashin {
        // Dade
        boolean ayaMachinRoshanAst;
        boolean ayaDarMachinBazAst;
        double toul;
        double arz;
        String mark;



        // Tabe (Method)
        void roshan(){
            System.out.println("Masin Roshan Ast");
            ayaMachinRoshanAst = true;
        }

        void khamosh(){
            System.out.println("Masin Khamoush Ast");
            ayaMachinRoshanAst = false;
        }

        void bazkardaneDar(){
            System.out.println("Dar Baz Ast");
            ayaDarMachinBazAst = true;
        }

        void bastanDar(){
            System.out.println("Dar Baste shod");
            ayaDarMachinBazAst = false;
        }

        void harekat(){
            // Dar baste bashe va machin roshan bashad(rule)
            if (!ayaDarMachinBazAst && ayaMachinRoshanAst){
                System.out.println("Mashin dar Hale Haraket Ast");
            } else {
                System.out.println("Mashin Park ASt");
            }
        }
    }
}
