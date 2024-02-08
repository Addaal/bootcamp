public class Reloj {
    // ------------------------------------------------varaibles
    int hours = 12;
    int minutes = 0;
    int seconds = 0;

    // ----------------------------------------------- constructor
    public Reloj(){};
    public Reloj(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public Reloj(int secondsFromMidnight) {
        hours = secondsFromMidnight / 3600;
        secondsFromMidnight %= 3600;
        minutes = secondsFromMidnight / 60;
        secondsFromMidnight %= 60;
        seconds = secondsFromMidnight;

    }
    // ---------------------------------------------------------------methods SET
    public void setHoras(int hours) {
        this.hours = hours;
    }

    public void setMinutos(int minutes) {
        this.minutes = minutes;
    }

    public void setSegundos(int seconds) {
        this.seconds = seconds;
    }

    public void setReloj (int secondsFromMidnight) {
            hours = secondsFromMidnight / 3600;
            secondsFromMidnight %= 3600;
            minutes = secondsFromMidnight / 60;
            secondsFromMidnight %= 60;
            seconds = secondsFromMidnight;

    }
 // ---------------------------------------------------------------methods GET
    public int getHoras() {
        return this.hours;
    }

    public int getMinutos() {
        return this.minutes;
    }

    public int getSegundos() {
        return this.seconds;
    }

    // ---------------------------------------------------------------methods randoms

    public void tick() {
        seconds++;
        if (seconds == 60) {
            seconds = 0;
        }
    }
    public void tickDecrement() {
        seconds--;
        if (seconds == 0) {
            seconds = 0;
        }
    }

    public void addReloj (Reloj reloj){
        int totalSeconds1 = hours * 3600 + minutes * 60 + seconds;
        int totalSeconds2 = reloj.hours * 3600 + reloj.minutes * 60 + reloj.seconds;
        int diferenciaSeconds = totalSeconds1 + totalSeconds2;
        hours = diferenciaSeconds / 3600;
        diferenciaSeconds %= 3600;
        minutes= diferenciaSeconds / 60;
        diferenciaSeconds %= 60;
        seconds = diferenciaSeconds;

    }

    public void restaReloj (Reloj reloj){
        int totalSeconds1 = hours * 3600 + minutes * 60 + seconds;
        int totalSeconds2 = reloj.hours * 3600 + reloj.minutes * 60 + reloj.seconds;
        int diferenciaSeconds = totalSeconds1 - totalSeconds2;

        if (diferenciaSeconds < 0) {
            // Si la diferencia es negativa, ajustamos para que sea positiva
            diferenciaSeconds += 24 * 3600; // Sumamos 24 horas en segundos para obtener el valor positivo equivalente
        }
        hours = diferenciaSeconds / 3600;
        diferenciaSeconds %= 3600;
        minutes= diferenciaSeconds / 60;
        diferenciaSeconds %= 60;
        seconds = diferenciaSeconds;
    }

    public String toString () {

        String seconds_string = "";
        String minutes_string = "";
        String hours_string = "";
        if (seconds < 10) {
            seconds_string = "0"+seconds;
        }else{
            seconds_string = ""+seconds;
        }
        if(minutes < 10) {
            minutes_string = "0"+minutes;
        }
        else {
            minutes_string = ""+minutes;
        }
        if(hours < 10) {
            hours_string = "0"+hours;
        }else{
            hours_string = ""+hours;
        }
        return hours_string + ":" + minutes_string + ":" + seconds_string;


    }


}
