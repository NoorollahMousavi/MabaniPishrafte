public class MachinTest {

    class Machin{

        // Dade:
        boolean ayaMachinRoshanAst;
        boolean ayaDarMachinBazAst;
        double toul;
        double arz;
        String mark;


        //Tabe (methode) :
        void roshan() {
            System.out.println("Machin roshan ast");
            ayaMachinRoshanAst = true;
        }
        void khamoush() {
            System.out.println("Machin Khamoush ast");
            ayaMachinRoshanAst = false;
        }
        void bazKardanDar(){
            System.out.println("Dar Baz ast");
            ayaDarMachinBazAst = true;
        }
    }
}
