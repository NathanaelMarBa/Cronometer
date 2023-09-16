public class Minuto {

    int m = 59;
    Hora h = new Hora();
    public void Minutos (int s){

        if (s == 60){
            m++;
            h.Hora(m);

            if(m == 60){
                m = 0;
            }
        }
    }
}
