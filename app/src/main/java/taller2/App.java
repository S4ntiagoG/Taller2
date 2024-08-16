/*
 * Este es el segundo taller de lógica de programación. En este taller deben comenzar a prácticar hacer las validaciones
 * de los datos que va a recibir la función usando los condicionales if. 
 * 
 * Como en el anterior, tenga en cuenta la siguiente rúbrica para cada ejercicio la cual, 
 * se basa en los mandamientos del programador. El taller es una herramienta para comenzar a preparar la evaluación 
 * donde los descuentos si van a ser tenidos en cuenta. 
 * Con este taller, usted irá aprendiendo a aplicar buenas prácticas en la programación.
 * 
 * La siguiente rúbrica se descuenta en cada ejercicio y es acumulativa:
 * Descuento por quemar valores en el código y no usar constantes: -0.5
 * Descuento por no implementar control de errores con trycatch: -0.8
 * Descuento por no escribir el código ordenado, identado: -0.4
 * 
 * RÉTESE, PÓNGASE A PRUEBA!!!
 * 
 */
package taller2;

public class App {

    public static void main(String[] args) {
        try {
    
        } 
        
        catch (Exception e) {
            System.out.println(e);
        }


    }


    //Algoritmo 1
     public static int Calcular_saldo(int base, int total_recaudo, int total_retiros) {
        try {
            final int base_igualdad = 2000000; 
            int saldo_taquilla = base + total_recaudo - total_retiros;
    
            // Aquí podrías agregar lógica basada en la variable base o base_igualdad
            if (base == base_igualdad) 
            {    
                return saldo_taquilla;
            } else 
            
            {
                return -1;   
            }
    
        
        } catch (Exception e) {
            
            return -1; 
        }    
    }
    
    //Algoritmo 2 
    public static String Calcular_tip (float valor_consumo) {

        try {  
            final float calcular_propina = 0.10f;
            final float calcular_impuesto = 0.08f; 
            float propina = 0 ;
            float impuesto_comida = 0; 
            float total_pagar = 0; 
            
            if (valor_consumo> 0) {
                propina = valor_consumo * calcular_propina;
                impuesto_comida = valor_consumo * calcular_impuesto;
                total_pagar = valor_consumo + propina + impuesto_comida; 
                
                return "valor comida:" +" " +"$"+ valor_consumo + " - "+ "valor propina" + " " + "$"+ propina + " - " + 
                    "valor impoconsumo" + " "+ "$"+  impuesto_comida + " - " + "total a pagar" + " "+ "$" + total_pagar;     
            } 
            
            else {
                
                return "Error calculando consumo";
            }
        } 
        catch (Exception e) { return "Error en la función Calcular_tip";
           
    }

    }
    
    //Algoritmo 3 
    public static int Obtener_puntos(int partidos_ganados, int partidos_perdidos, int partidos_empatados){
        try {
            final byte ganado = 3, perdio = 0, empatado = 1; 
            byte victorias = 0, empates = 0, perdidas = 0;
           
             
            if (partidos_empatados >= 0 && partidos_perdidos >= 0 && partidos_ganados>=0) { 
                
                victorias = (byte) (partidos_ganados*ganado);
                empates = (byte) (partidos_empatados* empatado);
                perdidas = (byte) (partidos_perdidos*perdio);
                int puntos = victorias + empates + perdidas;
                return puntos;   
             }
                    
            else return -1;
        
        
        } 
        catch (Exception e) {
            return -1;
        }


    }
    //Algoritmo 4
    public static float Calcular_definitiva(float nota_1, float nota_2, float nota_3, float nota_4, float nota_5, 
                                            float porcentaje_1, float porcentaje_2, float porcentaje_3, float porcentaje_4, float porcentaje_5) {
                                                
        try {
            float definitiva = 0;
            float suma_porcentajes = 0; 

        
            if (nota_1 >= 0 && nota_1 <= 5 &&
            nota_2 >= 0 && nota_2 <= 5 &&
            nota_3 >= 0 && nota_3 <= 5 &&
            nota_4 >= 0 && nota_4 <= 5 &&
            nota_5 >= 0 && nota_5 <= 5) {
            
           
                if (porcentaje_1 >= 0 && porcentaje_1 <= 1 &&
                    porcentaje_2 >= 0 && porcentaje_2 <= 1 &&
                    porcentaje_3 >= 0 && porcentaje_3 <= 1 &&
                    porcentaje_4 >= 0 && porcentaje_4 <= 1 &&
                    porcentaje_5 >= 0 && porcentaje_5 <= 1) {
                    suma_porcentajes = porcentaje_1 + porcentaje_2 + porcentaje_3 + porcentaje_4 + porcentaje_5; 
                        
                        if (suma_porcentajes == 1) { 
                        definitiva =  
                        (nota_1 * porcentaje_1) +
                        (nota_2 * porcentaje_2) +
                        (nota_3 * porcentaje_3) +
                        (nota_4 * porcentaje_4) +
                        (nota_5 * porcentaje_5);

                        }
                        else return -1;  
            }
            else return -1; 
        }

            else return -1;
        
        return definitiva;
    } 
    catch (Exception e) 
    {
        return -1; 
    }
    }   
    
    //Algoritmo 5 
    public static float Calcular_para_ganar (float not_1, float not_2, float not_3, float not_4, 
    float porcen_1, float porcen_2, float porcen_3, float porcen_4, float porcen_5) {
    
        try {
        float nota_faltante = 0;
        final float nota_min = 3.0f;
        if (not_1 >= 0 && not_1 <= 5 &&
            not_2 >= 0 && not_2 <= 5 &&
            not_3 >= 0 && not_3 <= 5 &&
            not_4 >= 0 && not_4 <= 5) {

            
            if (porcen_1 >= 0 && porcen_1 <= 1 &&
                porcen_2 >= 0 && porcen_2 <= 1 &&
                porcen_3 >= 0 && porcen_3 <= 1 &&
                porcen_4 >= 0 && porcen_4 <= 1 &&
                porcen_5 >= 0 && porcen_5 <= 1) {

                
                float sumaPorcentajes = porcen_1 + porcen_2 + porcen_3 + porcen_4 + porcen_5;
                
                if (sumaPorcentajes == 1 ) {
                      
                float puntos_acumulados = 
                    (not_1 * porcen_1) +
                    (not_2 * porcen_2) +
                    (not_3 * porcen_3) +
                    (not_4 * porcen_4);

                
                nota_faltante = (nota_min - puntos_acumulados) / porcen_5;
                }
                
                if (nota_faltante >= 0 && nota_faltante <= 5) {
                    return nota_faltante;
                } else {
                    return -1;  
                }
            }
        }
        
        return -1;  
    } 
    catch (Exception e) {
        return -1;  
    }
    }
    //Algoritmo 6 
        public static float Calcular_salario(int horas_normales_lab, int horas_extras_dia, int horas_extras_noche, float valor_hora_normal){
            try 
            {
                final float recargo_dia = 0.15f;
                final float recargo_noche = 0.35f;  
                float salario_total = 0; 
                if (valor_hora_normal > 0 ) { 
                    salario_total =  (horas_normales_lab * valor_hora_normal) + 
                                     (horas_extras_dia * valor_hora_normal * recargo_dia) + 
                                     (horas_extras_noche * valor_hora_normal * recargo_noche);  

                    
                } 
                else { 
                    return((int) (-1)); 
                }
            
                return salario_total;
            
            } 
            
        
            catch (Exception e) {
                return((int) (-1)); 
            }

        } 
//Algoritmo 7
public static float Calcular_area_triangulo(float  base_tri, float altura_tri){
    try {
        final float un_medio = 0.5f;
        float area_triangulo = 0; 
            if (base_tri> 0 && altura_tri>0) {
                area_triangulo = un_medio * base_tri * altura_tri;
                return area_triangulo; 
            } 
            
            else {
                return -1; 
            }



    } 
    catch (Exception e) {
        return -1; 
    }
    }
//Algoritmo 8
public static float Calcular_perimetro_cuadrado(float lado_cuadrado){
    try {
        float perimetro = 0;
        final byte para_calcular_area = 4;
        if (lado_cuadrado> 0) {
            perimetro = lado_cuadrado * para_calcular_area; 
            
            return perimetro; 
        }
        else return -1; 
    
    
    } 
    catch (Exception e) {
        return -1; 
    }
}

//Algortimo 9
public static float Calcular_volumen_cilindro (float radi_base, float altura_cilin){
    try {
            final float pi = 3.1415927f; 
            float volumen_cilindro = 0; 
            if (radi_base> 0 && altura_cilin>0) {
                volumen_cilindro = pi* (radi_base* radi_base) * altura_cilin; 
                return volumen_cilindro; 


            } else { return -1; 
                
            }
        
    } 
    
    catch (Exception e) {
        return -1;
    }

}
public static float  Calcular_area_circulo(float radio_ciruclo){
    try {
        float area_Cirulo = 0; 
        final float pi_2 = 3.1415927f; 
        if (radio_ciruclo>0) {
            area_Cirulo = pi_2*(radio_ciruclo*radio_ciruclo);
            
            return area_Cirulo; 
        } else 
        {
            return -1;             
        }
    } 
    catch (Exception e) {
        return -1; 
    }


}









}

    

    /*
     * 1. Diseñe un algoritmo e implemente la función Calcular_saldo que reciba
     * tres enteros: la base de dinero en la taquilla, el total de recaudos y
     * el total de retiros, y retorne un entero que represente el saldo final
     * en la taquilla.
     * 
     * Valide que la base sea igual a 2.000.000. Si no es así, retorne -1.
     * 
     * saldo_taquilla = base + total recaudos - total_retiros
     * Si hay algún error, retorne -1.
     */

    

    /*
     * 2. Diseñe un algoritmo e implemente la función Calcular_tip que reciba
     * un float representando el valor del consumo de un cliente, y devuelva
     * un string que contenga el valor de la propina (10%), el impuesto al
     * consumo (8%) y el valor total a pagar.
     * 
     * MUY IMPORTANTE:
     * 
     * El formato del string debe ser: valor comida: $### - valor propina $### -
     * valor impoconsumo $### - total a pagar $###.
     * 
     * Si hay algún error, retorne "Error en la función Calcular_tip".
     * 
     * Ademas de esto, primero valide que el valor del consumo sea mayor a 0. Si no
     * es así, retorne "Error calculando consumo".
     * 
     */


    /*
     * 3. Diseñe un algoritmo e implemente la función Obtener_puntos que reciba
     * tres enteros representando el número de partidos ganados, perdidos y
     * empatados de un equipo de fútbol, y devuelva un entero que represente
     * los puntos totales del equipo. La puntuación sigue los lineamientos
     * de la FIFA: 3 puntos por partido ganado, 1 punto por partido empatado y
     * 0 puntos por partido perdido. Si hay algún error, retorne -1.
     * 
     * Valide ademas que los partidos ganados, perdidos y empatados sean mayores o
     * iguales a 0. Si no es así, retorne -1.
     * 
     */


    /*
     * 4. Diseñe un algoritmo e implemente la función Calcular_definitiva que
     * reciba cinco floats representando las notas (entre 0 y 5) y cinco floats
     * representando los porcentajes (que entre todos deberán sumar 1 y cada uno
     * estar entre 0 y 1),
     * y devuelva un float que represente la nota definitiva. Si algo está mal
     * con los porcentajes o con las notas, retorne -1.
     */


    /*
     * 5. Diseñe un algoritmo e implemente la función Calcular_para_ganar que
     * reciba cinco floats representando los porcentajes de una materia (que
     * deberán sumar 1 y estar entre 0 y 1) y cuatro floats representando las
     * primeras notas (entre 0 y 5), y devuelva un float que represente la
     * nota que deberá sacar para ganar si el puntaje mínimo es 3. Si algo
     * está mal con los porcentajes o con las notas, retorne -1.
     */


    /*
     * 6. Diseñe un algoritmo e implemente la función Calcular_salario que
     * reciba cuatro enteros: cantidad de horas normales laboradas, cantidad
     * de horas extras diurnas laboradas, cantidad de horas extras nocturnas
     * laboradas, y el valor de la hora normal como un float. La función debe
     * retornar un float con el salario total. Las horas extras diurnas tienen
     * un recargo adicional del 15% sobre la hora normal, y las horas extras
     * nocturnas tienen un recargo adicional del 35% sobre la hora normal.
     * 
     * Valide que el valor de la hora normal sea mayor a 0. Si no es así, retorne
     * -1.
     * 
     * Si hay algún error, retorne -1.
     */


    /*
     * 7. Diseñe un algoritmo e implemente la función Calcular_area_triangulo
     * que reciba dos floats representando la base y la altura de un triángulo
     * rectángulo, y devuelva un float que represente el área del triángulo.
     * 
     * Valide que la base y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = 1/2 * base * altura.
     * 
     * Si hay algún error, retorne -1.
     */


    /*
     * 8. Diseñe un algoritmo e implemente la función Calcular_perimetro_cuadrado
     * que reciba un float representando el lado de un cuadrado, y devuelva un
     * float que represente el perímetro del cuadrado.
     * 
     * Valide que el lado sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del perímetro es: perímetro = lado * 4.
     * 
     * Si hay algún error, retorne -1.
     */


    /*
     * 9. Diseñe un algoritmo e implemente la función Calcular_volumen_cilindro
     * que reciba dos floats representando el radio de la base y la altura de
     * un cilindro, y devuelva un float que represente el volumen del cilindro.
     * 
     * Valide que el radio y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del volumen es: V = pi * radio^2 * altura, usando pi con
     * precisión de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */


    /*
     * 10. Diseñe un algoritmo e implemente la función Calcular_area_circulo
     * que reciba un float representando el radio de un círculo, y devuelva un
     * float que represente el área del círculo.
     * 
     * Valide que el radio sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = pi * radio^2, usando pi con precisión
     * de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */
