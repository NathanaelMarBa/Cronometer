public class Segundo {
    int s = 55;
    Minuto m = new Minuto();
    Hora h = new Hora();

    public void Segundos(){
        try {
            for(; ;){
                s++;
                m.Minutos(s);
                if(s == 60){
                    s = 0;
                }
                Thread.sleep(1000);
                System.out.println(h.h + ":" + m.m + ":" + s);
            }
        }catch (Exception e){

        }
    }
}
