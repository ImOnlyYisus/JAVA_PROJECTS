package jesus;

import java.time.DateTimeException;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Hora {
    private int horas;
    private int minutos;
    private int segundos;

    public Hora() { //Por defecto 00:00:00
    }

    public Hora(int horas, int minutos, int segundos) {
        if(horaCorrecta(horas,minutos,segundos)){
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = segundos;
        } else{
            this.horas=12;
            //segundos y minutos estan a 00 por defecto
        }

    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        if(horaCorrecta(horas,this.minutos,this.segundos)){
            this.horas = horas;
        }
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if(horaCorrecta(this.horas,minutos,this.segundos)){
            this.minutos = minutos;
        }
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if(horaCorrecta(this.horas,minutos,segundos)){
            this.segundos=segundos;
        }
    }

    //METODOS
    private boolean horaCorrecta(int horas, int minutos, int segundos){ //Comprueba que la hora sea correcta
        boolean verificar=true;
        try {
            LocalTime hora= LocalTime.of(horas,minutos,segundos);
        }catch (DateTimeException dte){
            verificar=!verificar;
        }
        return verificar;
    }

    public String escribirHora(){ //Escribe la hora en este formato (07:03:21)
        LocalTime hora= LocalTime.of(horas,minutos,segundos);

        return hora.toString();
    }

    public long segundosDesde(){ //Segundos pasados desde las 00:00:00
        LocalTime hora= LocalTime.of(horas,minutos,segundos);
        LocalTime medianoche = LocalTime.of(24,0,0);

        return (ChronoUnit.SECONDS.between(medianoche,hora));
    }

    public long segundosHasta(){ //Segundos que faltan hasta las 00:00:00
        LocalTime hora= LocalTime.of(horas,minutos,segundos);
        LocalTime medianoche = LocalTime.of(24,0,0);

        return (ChronoUnit.SECONDS.between(hora,medianoche));
    }

    //public segundoEntreHoras(Hora h){ ¿¿segundosEntreHoras(Hora h): devolverá el número de segundos entre la hora y el objeto Hora h.??
    //
    //}

    public void siguiente(){ //+1 segundo
        LocalTime hora= LocalTime.of(horas,minutos,segundos);
        hora= hora.plusSeconds(1);

        this.horas=hora.getHour();
        this.minutos=hora.getMinute();
        this.segundos=hora.getSecond();
    }

    public void anterior(){ //-1 segundo
        LocalTime hora= LocalTime.of(horas,minutos,segundos);
        hora= hora.minusSeconds(1);

        this.horas=hora.getHour();
        this.minutos=hora.getMinute();
        this.segundos=hora.getSecond();
    }

    public static Hora copia(Hora h){ //Copia el objeto con otra direccion de memoria
        return (new Hora(h.getHoras(),h.getMinutos(),h.getSegundos()));
    }

    public boolean igualQue(Hora h){ //Dice tru si es igual y false si es distinto
        LocalTime hora= LocalTime.of(horas,minutos,segundos);
        LocalTime horaPasada= LocalTime.of(h.getHoras(),h.getMinutos(),h.getSegundos());
        return hora.equals(horaPasada);
    }

    public boolean menorQue(Hora h){ //Dice tru si es menor y false si es mayor
        LocalTime hora= LocalTime.of(horas,minutos,segundos);
        LocalTime horaPasada= LocalTime.of(h.getHoras(),h.getMinutos(),h.getSegundos());
        return hora.isBefore(horaPasada);
    }

    public boolean mayorQue(Hora h){ //Dice tru si es menor y false si es mayor
        LocalTime hora= LocalTime.of(horas,minutos,segundos);
        LocalTime horaPasada= LocalTime.of(h.getHoras(),h.getMinutos(),h.getSegundos());
        return hora.isAfter(horaPasada);
    }


}
