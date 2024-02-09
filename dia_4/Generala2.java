import java.util.Random;

public class Generala2 {

        public static String checkDados(String dados) {
            int mayorRepeticion = 0, segundaMayorRepeticion = 0;

            for(int i = 0; i < dados.length(); i++) {
                int repeticiones = 0;
                for (int j = 0; j < dados.length(); j++) {
                    if (dados.charAt(i) == dados.charAt(j)) {
                        repeticiones++;
                    }
                    if(repeticiones > mayorRepeticion){
                        mayorRepeticion = repeticiones;
                    }
                }
                if (repeticiones == 5) {
                    return "GENERALA";
                }
                if (repeticiones == 4) {
                    return "POKER";
                }
            }
            if (mayorRepeticion == 3) {
                for (int i = 0; i < dados.length(); i++) {
                    int repeticiones = 0;
                    for (int j = 0; j < dados.length(); j++) {
                        if (dados.charAt(i) == dados.charAt(j)) {
                            repeticiones++;
                        }
                    }
                    if (repeticiones > 0 && repeticiones < mayorRepeticion) {
                        segundaMayorRepeticion = repeticiones;
                    }
                }
                if (segundaMayorRepeticion == 2) {
                    return "FULL";
                }
            }

            if ((dados.contains("1") && dados.contains("2") && dados.contains("3") && dados.contains("4") && dados.contains("5") && dados.contains("6"))
                    || (dados.contains("1") && dados.contains("6") && dados.contains("3") && dados.contains("4") && dados.contains("5") ) ||
                    (dados.contains("2") && dados.contains("6") && dados.contains("3") && dados.contains("4") && dados.contains("5") )
            ) return "ESCALERA";


            return "NADA";
        }

        public static void main(String[] args) {


            Random random = new Random();
            String dadosString = "";
            for (int i = 0; i < 5; i++) {

                int randomNumber = random.nextInt(6) + 1;
                dadosString += randomNumber;
            }

            for (int i = 0; i < dadosString.length(); i++) {
                System.out.print("\t" + dadosString.charAt(i));
            }
            System.out.println("\n"+checkDados(dadosString));

            System.out.println("______________________________");
            System.out.println("Ejemplos");
            System.out.println("______________________________");
            System.out.println(checkDados("55555"));
            System.out.println(checkDados("55553"));
            System.out.println(checkDados("25225"));
            System.out.println(checkDados("12345"));
            System.out.println(checkDados("23456"));
            System.out.println(checkDados("13456"));
            System.out.println(checkDados("34516"));
            System.out.println(checkDados("33316"));

        }

    }


