public class E02ejercicio4 {
    public static void main(String[] args) {
        String stringDeNumeros = "12545345";
        int[] miArray = new int[stringDeNumeros.length()];
        for (int i = 0; i < miArray.length; i++) {

            miArray[i] = Integer.parseInt(String.valueOf(stringDeNumeros.charAt(i)));
        }
        for (int i = 0; i < miArray.length; i++) {
            System.out.print("\t" + miArray[i]);
        }
    }
}
