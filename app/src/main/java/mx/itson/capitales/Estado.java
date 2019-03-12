package mx.itson.capitales;

public class Estado {

    private String capital;

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Object[] jugarTrivia(String capitalSonora, String capitalChihuahua, String capitalSinaloa){

        String resultadoSonora = "Incorrecto";
        String resultadoChihuahua = "Incorrecto";
        String resultadoSinaloa = "Incorrecto";
        int puntaje = 0;

        if (capitalSonora.equalsIgnoreCase("Hermosillo")){

            puntaje+=6;
            resultadoSonora = "Correcto";
        }
        if (capitalChihuahua.equalsIgnoreCase("Chihuahua")){

            puntaje+=2;
            resultadoChihuahua = "Correcto";
        }
        if (capitalSinaloa.equalsIgnoreCase("Culiacan") || capitalSinaloa.equalsIgnoreCase("Culiacán")){

            puntaje+=2;
            resultadoSinaloa = "Correcto";
        }

        Object[]resultados = {resultadoSonora,resultadoChihuahua,resultadoSinaloa,puntaje};

        return resultados;

    }

}