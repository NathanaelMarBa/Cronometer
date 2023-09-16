public class Minuto {

    int m = 59;
    Hora h = new Hora();

    int hrs = 0;
    public void Minutos (int s){

        if (s == 60){
            m++;
            hrs = h.Hora(m);

            if(m == 60){
                m = 0;
            }
        }
    }
}
