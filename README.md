# EXCEPCIONES EN SPRING BOOT

Aplicación REST enfocada en el tratamiento de excepciones en Spring Boot. 

Se centraliza el manejo de errores a través de la clase "ApiHandlerException":
* Los errores HTTP son asociados a "n" cantidad de excepciones JAVA. Cada excepcion creada se extiende de RuntimeException evitando el uso del bloque try-catch.
Es posible no crear una excepción, sino trabajar con una propia de JAVA (ArithmeticException en código). 
* Para informar y detectar rapidamente el error es de utilidad la clase "ErrorMessage", la cual cumple la función de informar el nombre de la excepción, una breve descripción de la misma y el path.
* La clase "ApiHandlerException" cuenta con el método "unexpectedException" el cual ataja cualquier error inesperado lanzando el mensaje del mismo.


El objetivo del proyecto es demostrar conceptos __básicos__.
