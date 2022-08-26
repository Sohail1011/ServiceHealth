package pe.company.ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "ServicioNutricionista")
public class ServicioNutricionista {

    @WebMethod(operationName = "calculaIMC")
    public double calculaIMC(@WebParam(name = "estatura") double estatura,
            @WebParam(name = "peso") double peso) {

        double imc = peso / (estatura * estatura);
        return imc;
    }

    @WebMethod(operationName = "calculaTasaMet")
    public double calculaTasaMet(@WebParam(name = "genero") String genero,
            @WebParam(name = "estatura") double estatura,
            @WebParam(name = "peso") double peso,
            @WebParam(name = "edad") int edad) {
        double tasa = 0.0;
        if (genero.equalsIgnoreCase("Femenino")) {
            tasa = (10 * peso) + (6.25 * estatura * 100) - (5 * edad) - 161;
        } else {
            tasa = (10 * peso) + (6.25 * estatura * 100) - (5 * edad) + 5;
        }
        return tasa;
    }
}
