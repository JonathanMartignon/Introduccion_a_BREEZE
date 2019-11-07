

/*			Seleccionando posiciones de Matrices y Vectores 			*/
import breeze.linalg._
import breeze.numerics._

var m:Int = 4
var n:Int = 6

/* Indexación y corte */
// Mostrando una posición específica de nuestra matriz
// Equivalente en numpy
// a[1,1]
val a = DenseMatrix((1.0,2.0), (3.0,4.0))
a(1,1)


/* Extracción de una parte de un vector
Error para vectores renglón (.t)*/
val b = DenseVector(1,2,3,4)

// Equivalente en python
// b[1:4]
b(1 to 3)

/* Estas dos son equivalentes*/
// Irá desde la posición 1 (0,1,...) hasta la posicion 3-1, es decir
// Hasta el 2 (1,2)
// Equivalente en python
// b[1:3]

b(1 until 3)

b.slice(1,3)


/* Para el caso de pasos negativos:
Desde 'atrás' hacia 'adelante' */
// Equivalente en python
// c[5:0:-2]
val c = DenseVector(1,2,3,4,5,6,7,8)
c(5 to 0 by -2)

/* Seleccionar la cola
El '-2' quita el último */
// Equivalente en python
// c[4:-1]
c(4 to -2)

/* El último elemento */
// Equivalente en python
// c[-1]
c(-1)

/* Extraer columna de una matriz */
// Equivalente en python
// d[:,1]
val d = DenseMatrix((1.0,2.0), (3.0,4.0),(5.0,6.0))
d(::, 1)

/* Extraer renglón de una matriz */
// Equivalente en python
// d[1,:]
d(1,::)



val e = DenseMatrix((1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0))
e



/*        Otras manipulaciones        */



/* Reshape */
// Reesctructurando la forma  de nuestra matriz
// Equivalente en python
// f = e.reshape(3,3)
// Numpy trabaja llevando primero por renglón
val f = e.reshape(3,3)
f



/* Aplanar matriz */
// Equivalente en python
// f.flatten()
f.toDenseVector

/* Obtiene la matriz triangular inferior */
// Equivalente en numpy
// np.tril(f)
lowerTriangular(f)



/* Obtiene la matriz triangular superior */
// Equivalente en numpy
// np.triu(f)
upperTriangular(f)




/* Diagonal */
//Equivalente en numpy
// np.diagonal(f)
diag(f)


//Asignación de vectores al subconjunto/
// Equivalente en python
// g[1:4] = 5
val g = DenseVector(1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0)
g(1 to 4) := 5.0

// Equivalente en python
// g[1:4] = array([1,2,3])
g(1 to 3) := DenseVector(1.0,2.0,3.0)

/* Asignación de matriz al subconjunto */
// Cambiamos cierto porcentaje de nuestra matriz por otra matriz (por así decirlo)

val h = DenseMatrix((1.0,2.0,3.0),(4.0,5.0,6.0),(7.0,8.0,9.0))
h
// Equivalente en python
// h[0:3,0:2] = 5
// recordando que va de 0 : n-1
h(0 to 2,0 to 1) := 5.0

h




/* Asignación de matriz a la columna */
// Equivalente en python
//a[:,2] = 5
h(::, 2) := 5.0
h
