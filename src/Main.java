    /*
    Primera parte:
    Crear una función con tres parámetros que sean números que se suman entre sí.
    Llamar a la función en el main y darle valores.
    */
public class Main { //primera parte del ejercicio 3
    public static void main(String[] args) {
        //llamado de funcion suma de tres valores
        System.out.println(funcionSuma(1,2,3));//esperado 6
        System.out.println(funcionSuma(10,20,30));//esperado 60
    }
    //creacion de funcion que suma 3 valores entre si
    public static int funcionSuma(int numberOne, int numberSecond, int numberThree) {
        return numberOne + numberSecond + numberThree;
    }
}





