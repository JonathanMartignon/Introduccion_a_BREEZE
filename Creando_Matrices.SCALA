


/*			Creando Matrices y Vectores 			*/


import breeze.linalg._
import breeze.numerics._

var m:Int = 4
var n:Int = 6

// Creando una matriz de ceros de tipo entero
// Equivalente en numpy
// a = np.zeros((m,n))
val a = DenseMatrix.zeros[Int](m,n)
a



// Creando na matriz de ceros de tipo Double
// Equivalente en numpy
// b = np.zeros((m,n))
val b = DenseMatrix.zeros[Double](n,m)
b




//creando matriz de unos de tipo entero
// Equivalente en numpy
// c = np.ones((m,n))
val c = DenseMatrix.ones[Int](m,n)
c

//Creando matriz de unos de tipo double
// Equivalente en numpy
// d = np.ones((m,n))
val d = DenseMatrix.ones[Double](n,m)
d




//Creando un VECTOR de zeros de tipo entero
// Equivalente en numpy
// e = zeros(n)
val e = DenseVector.zeros[Int](n)
e

//Creando un VECTOR de zeros de tipo double
// Equivalente en numpy
// f = zeros(n)
val f = DenseVector.zeros[Double](n)
f

//Creando un vector de unos de tipo entero
// Equivalente en numpy
// g = np.ones(n)
val g = DenseVector.ones[Int](n)
g

//Creando un vector de unos de tipo double
// Equivalente en numpy
// h = np.ones(n)
val h = DenseVector.ones[Double](n)
h



/*			Creando Matrices y Vectores específicos			*/




// VECTOR de un número particular
// Equivalente en numpy
// i = np.ones(n) * 5
val i = DenseVector.fill(n){5}
i

// MATRIZ de un número particular
// Equivalente en numpy
// j = np.ones((n,m)) * 7.5
val j = DenseMatrix.fill(n,m){7.5}
j




// Matriz identidad
// Equivalente en numpy
// k = np.eye(n)
val k = DenseMatrix.eye[Double](n)
k





// Matriz diagonal
// Equivalente en numpy
// l = np.diag((1,2.0,3.0))
// Notar que agregué un valor Int y dos Double
val l = diag(DenseVector(1,2.0,3.0))
l





// Creación 'a mano' de una matriz
// Equivalente en numpy
// o = np.array([ [1,2], [3,4] ])
// Se acomodan por de renglón en renglón
val o = DenseMatrix((1,2), (3,4))
o




// ERROR!
//val i = DenseMatrix((1.0,2.0), (3.0,4.0,7.0))
//val i = DenseMatrix((1,2),(3.0,4))


/* Creación de un vector columna a mano  
Aquí no tenemos el error que el pasado!*/
// Equivalente en numpy
// p = np.array([1,2,3]).reshape(-1,1)
val p = DenseVector(1,2,3.0,4)
p


/* Creación de un vector renglón a mano  
Aquí no tenemos el error que el pasado!*/
// Equivalente en numpy
// q = np.array([1,2,3,4])
val q = DenseVector(1,2.0,3,4).t
q
