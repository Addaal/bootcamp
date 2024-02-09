public class Pilas {
    // Variables
    private int pilaA = 0;
    private int pilaB = 0;
    private int pilaC = 0;


    // Getter
    public int[] getPilas() {
        int[] pilas = {pilaA, pilaB, pilaC};
        return pilas;
    }
    public int getPilaA() {
        return pilaA;
    }
    public int getPilaB() {
        return pilaB;
    }
    public int getPilaC() {
        return pilaC;
    }
    // Setter
    public void setPilasInitial(int pila, int initialValue){
        if(pila == 0){  pilaA = initialValue;}
        if(pila == 1){  pilaB = initialValue;}
        if(pila == 2){  pilaC = initialValue;}
    }
    public void PilaToRemove(char pilaName, int valoresAQuitar){
        if(pilaName == 'A'){
            pilaA -= valoresAQuitar;
            if(pilaA < 0){
                pilaA = 0;
            }
        }
        if(pilaName == 'B'){
            pilaB -= valoresAQuitar;
            if(pilaB < 0){
                pilaB = 0;
            }
        }
        if(pilaName == 'C'){
            pilaC -= valoresAQuitar;
            if(pilaC < 0){
                pilaC = 0;
            }
        }
    }



}
