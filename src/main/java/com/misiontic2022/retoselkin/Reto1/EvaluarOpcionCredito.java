package com.misiontic2022.retoselkin.Reto1;
//Reto1 java Ciclo2 MisionTic2022
public class EvaluarOpcionCredito 
{
   
    private Double calcularInteresSimple(Double valor, Integer tiempo, Double interes) 
    {
        Double interesSimple = valor * (interes/100) * tiempo;
        return interesSimple;
    }
    
    private Double calcularInteresCompuesto(Double valor,Integer tiempo,Double interes)
    {
        Double interesCompuesto = valor * (Math.pow(1+ (interes/100), tiempo) - 1);
        return interesCompuesto;
        
    }
    
    public String compararOpcion(Double valor, Integer tiempo)
    {
        if (calcularInteresSimple(valor, tiempo, 3.0 ) < calcularInteresCompuesto(valor, tiempo, 2.6))
        {
            return "credito especial";
            
        } else if (calcularInteresSimple(valor, tiempo, 3.0) == calcularInteresCompuesto(valor, tiempo, 2.6))
        {
            return "credito especial";
        } else{
            return "credito libre inversion";
        } 
    }    
    
}
