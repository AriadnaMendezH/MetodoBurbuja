# Práctica: Ordenamiento por Burbuja en Java 🫧

## 1. Descripción del proyecto

En esta práctica se realizaron dos versiones del algoritmo de ordenamiento por burbuja en Java: la versión normal y la versión mejorada u optimizada.

El objetivo es aprender cómo se pueden ordenar números de menor a mayor y entender la diferencia entre los dos métodos.

## 2. Objetivo

Comprender cómo funciona el ordenamiento por burbuja, cómo se intercambian los números cuando están en el orden incorrecto y cómo se puede mejorar el proceso para evitar comparaciones innecesarias.

## 3. Herramientas utilizadas

- **Lenguaje:** Java.
- **Entorno de desarrollo:** Apache NetBeans.
- **Versión del JDK:** Java 21.
- **Repositorio:** GitHub.

## 4. Métodos implementados

### Burbuja normal

Este método compara los números que están uno junto al otro. Si el número de la izquierda es mayor que el de la derecha, los intercambia.

Repite las comparaciones durante varias pasadas hasta terminar el proceso. Aunque los números ya estén ordenados, continúa realizando las pasadas establecidas.

### Burbuja mejorado u optimizado

Este método funciona de manera parecida al anterior, pero tiene una mejora: utiliza una variable llamada `huboIntercambio`.

Esta variable permite saber si se cambiaron de lugar algunos números durante una pasada. Si no hubo ningún intercambio, significa que el arreglo ya está ordenado y el programa puede detenerse antes.

Además, en cada pasada evita comparar los últimos elementos que ya quedaron en su posición correcta.

## 5. ¿Cómo funciona el intercambio?

Cuando dos números están en el orden incorrecto, se utiliza una variable temporal llamada `temporal` para guardar uno de ellos mientras se realiza el cambio.

Por ejemplo, si tenemos los números `18` y `3`, el algoritmo los compara y detecta que el 18 es mayor que el 3. Por eso, intercambia sus posiciones para que el 3 quede primero.

Este proceso se repite con los demás números hasta que queden ordenados de menor a mayor.

## 6. Pruebas realizadas

En la clase principal `Main` se utiliza el siguiente arreglo de prueba:

`[12, 18, 34, 44, 3, 55, 27, 11, 86, 91]`

Se crea una copia del arreglo original para que ambos métodos trabajen con los mismos números y sus resultados puedan compararse.

El programa muestra en la consola:

- El nombre de cada algoritmo.
- El arreglo antes de ordenarlo.
- El resultado después de ordenarlo.

El resultado final esperado para ambos métodos es:

`[3, 11, 12, 18, 27, 34, 44, 55, 86, 91]`

## 7. Diferencias entre los algoritmos

| Burbuja normal | Burbuja mejorado |
|---|---|
| Realiza todas las pasadas establecidas. | Puede detenerse antes si ya no necesita intercambiar números. |
| Sigue comparando elementos aunque el arreglo ya esté ordenado. | Utiliza una bandera para detectar cuándo el arreglo ya está ordenado. |
| No evita las comparaciones del final que ya podrían omitirse. | Reduce las comparaciones de los elementos que ya quedaron en su posición. |

## 8. ¿Qué aprendí?

Con esta práctica aprendí que existen diferentes maneras de ordenar datos en Java. También comprendí cómo funciona el intercambio de números y para qué sirve utilizar una variable de control.

La versión mejorada permite ahorrar comparaciones cuando el arreglo ya está ordenado o queda ordenado antes de completar todas las pasadas.

## 9. ¿Cómo ejecutar el programa?

1. Abrir el proyecto en Apache NetBeans.
2. Localizar la clase `Main`.
3. Ejecutar el programa.
4. Revisar la consola para observar el arreglo inicial y los resultados de ambos métodos.

## 10. Autor

**Nombre:** Ariadna Mnedez Hernandez.

**Asignatura:** Estructura de Datos.

**Actividad:** Práctica de ordenamiento por burbuja normal y mejorado.

**Fecha:** 20 de octubre de 2026.
