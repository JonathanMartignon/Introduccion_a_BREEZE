
/*			OPERACIONES ENTRE Matrices y Vectores 			*/


import breeze.linalg._
import breeze.numerics._

var m:Int = 4
var n:Int = 6

val x = DenseMatrix((1.0,2.0,3.0),(4.0,5.0,6.0),(7.0,8.0,9.0))
val y = DenseMatrix((10.0,11.0,12.0),(14.0,15.0,16.0),(17.0,18.0,19.0))

//Matriz vertical concatenada
// Equivalente en numpy
// c = np.vstack((y,x))
val c = DenseMatrix.vertcat(y,x)
c

//Matriz horizontal concatenada
// Equivalente en numpy
// d = np.hstack((x,y))
val d = DenseMatrix.horzcat(x,y)
d

val E = DenseVector(1.0,2.0,3.0)
val e = DenseVector(4.0,5.0,6.0)

/* Concatenar vector */
//Equivalente en numpy
// k = np.concatenate((E,e))
val k = DenseVector.vertcat(E,e)
k






val a = DenseVector(1.0,2.0,3.0)
val b = DenseVector(4.0,2.0,6.0)

/*Suma de elementos entrada por entrada */
// x1+x2, y1+y2, ...
// Igual en python a+b
a + b

/*Resta de elementos entrada por entrada */
// x1-x2, y1-y2, ..
// Igual en python a-b
a - b

/*Multiplicación por elementos entrada por entrada */
// x1*x2, y1*y2, ..
// Igual en python a*b
a * b


/*Suma por elementos con sustitucion '=' */
// x1 + 1, x2+1,...
// Igual en python a+1
a += 1.0

// Multiplicación por elementos con sustitución '='
// x1*2, x2*2,...
// Igual en python a*2
a *= 2.0

// Producto punto vectorial a punto b/
// Equivalente en numpy
// np.dot(a,b)
a dot b

a


//Elemento máximo/
// Equivalente en python
// c.max()
max(a)


//Elemento con argumento máximo/
// indice o posición donde se encuentra
// Equivalente en python
// a.argmax()
argmax(a)


// Sumas en vectores


val f = DenseVector(1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0)

//Suma por elementos
//Es decir, la suma al final
// Equivalente en python
// f.sum()
sum(f)

/* Suma acumulada */
// La suma por pasos
// Equivalente en python
// f.cumsum()
accumulate(f)


// Sumas en matrices


val g = DenseMatrix((1.0,2.0,3.0),(4.0,5.0,6.0),(7.0,8.0,9.0))
g
//Suma de todos los  elementos
// Equivalente en python
// g.sum()
sum(g)

// Suma cada columna
// Equivalente en python
// sum(g,0)
sum(g, Axis._0)

// o
sum(g (::, *))

// Suma en cada fila (dando un vector de columna)/
sum(g, Axis._1)

/*Trace (suma de elementos diagonales) */
// Equivalente en python
// g.trace()
trace(g)





