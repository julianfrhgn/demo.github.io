# Proyecto de suplementos alimenticios

## Ejercicio 

En su labor como programador de software ha sido elegido para el desarrollo de una aplicación que necesita un vendedor de suplementos, que desea calcular el promedio de 3 (tres) dias de ventas en un periodo determinado de un local determinado.Como información básica de cada suplemento se debe registrar el número de registro, su 
nombre y la marca. 

Aclaraciones:
- Se supondrá que la aplicación solo se requiere para calcular el promedio de un único periodo
especifico.
- Para efectos de mantener la simplicidad del ejemplo no se contemplan manejar persistencia en el almacenamiento de los datos.
- No se realiza validación, ni se verifica calidad en los datos ingresados.

![image](https://github.com/julianfrhgn/demo.github.io/assets/132966493/2cee2a80-13bc-4336-a1c7-e0ebcec20c68)


https://julianfrh.atlassian.net/browse/SUP-2?atlOrigin=eyJpIjoiNjgxY2FjNGMzYjc0NGRhOTlkZDk1YzFmNTQ2OTQxNzMiLCJwIjoiaiJ9

![image](https://github.com/julianfrhgn/demo.github.io/assets/132966493/716eecfa-ff68-4139-ad43-13c3296af91f)


![deb4cbdf-1e69-45d0-9852-5ebbfde9bbed](https://github.com/julianfrhgn/demo.github.io/assets/132966493/afc5f5e4-5f35-4926-b6de-36716f5a31a1)






Importar clase Scanner

Crear clase ventaPOO
    Atributos: identificacion, mes, mayo, junio, julio

Crear clase suplementosPOO
    Crear método principal
        Crear objeto Scanner
        Crear variables: numeroSuplementos, losSuplementos[], identificacion, mes, mes1, mes2, mes3, promedio = 0
        Imprimir "Digite la cantidad de Suplementos:"
        Leer numeroSuplementos
        Para i desde 0 hasta numeroSuplementos - 1, incrementando en 1
            Imprimir "Digite la marca del suplemento:"
            Leer identificacion
            Imprimir "Digite el tipo de suplemento:"
            Leer mes
            Imprimir "Digite la cantidad que se vendió en Mayo:"
            Leer mes1
            Imprimir "Digite la cantidad que se vendió en Junio:"
            Leer mes2
            Imprimir "Digite la cantidad que se vendió en Julio:"
            Leer mes3
            Crear objeto ventaPOO llamado unSuplemento
            Asignar identificacion a unSuplemento.identificacion
            Asignar mes a unSuplemento.mes
            Asignar mes1 a unSuplemento.mayo
            Asignar mes2 a unSuplemento.junio
            Asignar mes3 a unSuplemento.julio
            Asignar unSuplemento a losSuplementos[i]
        Fin Para

        Para i desde 0 hasta numeroSuplementos - 1, incrementando en 1
            Calcular la suma de mayo, junio y julio para el objeto ventaPOO actual y asignarla a sum
            Sumar a promedio la división de sum entre numeroSuplementos
        Fin Para

        Imprimir "El promedio de venta en los tres meses es: " concatenado con promedio
    Fin método principal
Fin clase suplementosPOO




