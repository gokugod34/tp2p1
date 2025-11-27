# tp2p1

En esta parte del proyecto trabajamos con listas enlazadas en lugar de arrays. La diferencia principal es que los arrays tienen un tamaño fijo que se debe definir desde el principio y no se puede cambiar. En cambio, las listas enlazadas pueden crecer dinámicamente agregando nodos sin necesidad de saber cuántos elementos habrá. En un array el acceso a un elemento es rápido porque se puede usar un índice, mientras que en una lista enlazada hay que recorrer los nodos uno a uno hasta encontrar el dato. Otra diferencia es que un array usa menos memoria porque solo guarda los datos, mientras que la lista enlazada necesita almacenar punteros a otros nodos. Usar listas enlazadas en este proyecto es útil porque el sistema educativo puede ir creciendo constantemente con más estudiantes, profesores o materias, y la lista permite insertar y eliminar fácilmente esos elementos. Las desventajas son que el acceso a un nodo intermedio es más lento y que el ordenamiento es más complicado, por eso a veces convertimos la lista a un array para usar algoritmos de ordenamiento y búsqueda. En resumen, los arrays son mejores cuando la cantidad de elementos es fija y necesitamos acceso rápido, mientras que las listas enlazadas son mejores para estructuras dinámicas, como nuestro sistema educativo, en el que constantemente agregamos datos nuevos y no sabemos cuántos serán.

Ejemplo de acceso rápido en array (acceder elemento directamente)
Estudiante e = estudiantes[5];


Esto es un acceso en array, donde podemos llegar al estudiante número 6 directamente porque los índices funcionan correctamente y el acceso es inmediato.

Ejemplo de acceso lento en lista enlazada
Nodo actual = listaEstudiantes.getPrimero();
int i = 0;
while(i < 5){
    actual = actual.siguiente;
    i++;
}
Estudiante e = (Estudiante) actual.dato;


Este ejemplo muestra acceso en lista enlazada, donde para llegar al estudiante número 6 hay que avanzar nodo por nodo.

 Ejemplo de agregar elemento a array (difícil)
// Si el array está lleno, hay que crear uno nuevo
Estudiante[] nuevoArray = new Estudiante[estudiantes.length + 1];
// copiar todo y agregar al final


Este ejemplo muestra por qué agregar elementos en un array es difícil cuando no sabemos el tamaño final.

 Ejemplo de agregar elemento a lista enlazada
listaEstudiantes.agregar(nuevoEstudiante);
