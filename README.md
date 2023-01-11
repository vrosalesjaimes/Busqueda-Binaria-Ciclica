# Búsqueda binaria cíclica
El método de búsqueda  binaria pertenece al grupo de técnicas basadas en las estrategia de divide y vencerás. Este problema requiere que el espacio de búsqueda este ordenado

***Definición:***
Una secuencia $S= x_i,\ldots,x_n$ se dice que esta cíclicamente ordenada si el número más pequeño en la secuencia es el elemento $x_i$ para algún $i$ desconocido y la secuencia $S^{\prime}$ está ordenada en orden creciente, con $S^{\prime}= x_i,\ldots x_n,x_1,\ldots,x_{i-1}$.

Así, una búsqueda binaria cíclica no es más que un búsqueda binaria en una secuencia cíclica. 
# Instrucciones
El programa consiste en implementar búsqueda binaria cíclica.
El programa recibe por línea de comando:
- Una secuencia ordenada cíclicamente de enteros separados por comas 
-  El elemento a buscar. 
El programa deberá mostrar el espacio de búsqueda antes de iniciar, así como cada iteración cómo se va alterando el espacio de búsqueda. Al final deberá regresar el indice en el que se encuentra el elemento buscado o en su defecto un mensaje que indique que no se encontró el elemento.
 
Ejemplo de entrada exitosa:

    14,15,16,18,1,2,3,4,5,6,7,8,9,10,11,12,13
    4

Salida:

    El espacio de busqueda es: [14,15,16,18,1,2,3,4,5,6,7,8,9,10,11,12,13]
    El nuevo espacio de busqueda es: [2,3,4,5,6,7,8,9,10,11,12]
    El espacio de búsqueda en la iteración 1 es: [2,3,4,5,6]
    El espacio de búsqueda en la iteración 2 es: [4,5,6]
    El espacio de búsqueda en la iteración 3 es: [4]
    El indice de 4 en el secuencia es: 7

Ejemplo de entrada no exitosa:

    14,15,16,18,1,2,3,4,5,6,7,8,9,10,11,12,13
    27
Salida:

    El espacio de busqueda es: [14,15,16,18,1,2,3,4,5,6,7,8,9,10,11,12,13]
    El nuevo espacio de busqueda es: [2,3,4,5,6,7,8,9,10,11,12]
    El espacio de búsqueda en la iteración 1 es: [7,8,9,10,11,12]
    El espacio de búsqueda en la iteración 2 es: [10,11,12]
    El espacio de búsqueda en la iteración 3 es: [11,12]
    El espacio de búsqueda en la iteración 4 es: [12]
    La busqueda no tuvo éxito

# Repositorio
Se puede clonar el repositorio con el comando

    git clone https://github.com/vrosalesjaimes/Busqueda-Binaria-Ciclica.git

# Ejecución
Después de clonar el repositorio se debe acceder a la carpeta ***Busqueda-Binaria-Ciclica*** y luego a la carpeta ***src*** o desde línea de comandos

    cd Busqueda-Binaria-Ciclica/src

Para compilar usamos el comando

    javac BusquedaBinariaCiclica.java

Para ejecutar usamos el comando

    java BusquedaBinariaCiclica.java
Luego nos solicita una secuencia cíclica y elemento a buscar.
#
[![forthebadge](https://forthebadge.com/images/badges/made-with-java.svg)](https://forthebadge.com)