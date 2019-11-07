
/*			Extras ENTRE Matrices y Vectores 			*/


import breeze.linalg._
import breeze.numerics._

var m:Int = 4
var n:Int = 6

val a = DenseMatrix((1.0,1.0,1.0),(2.0,3.0,5.0),(1.0,-5.0,6.0))
val b = DenseMatrix((1.0,2.0,3.0),(4.0,5.0,6.0),(7.0,8.0,9.0))
val c = DenseMatrix((1.0,0.0,3.0),(4.0,5.0,6.0))
val d = DenseVector(2.0,11.0,29.0)

// Verdadero si algún elemento no es cero
// No existe en numpy
any(a)


// Verdadero si todos los elementos son distintos de cero
// No existe en numpy
all(a)


// Resolución de ecuaciones lineal
// Equivalente en numpy
// np.linalg.solve(a,d)
a \ d





/* Transponer*/
// Equivalente en python
// a.transpose()
a.t




//Determinante/
// Equivalente en numpy
// np.linalg.det(a)
det(a)




//Inv/
// Equivalente en numpy
// np.linalg.inv(a)
inv(a)




//Pseudoinversa/
// Equivalente en numpy
// np.linalg.pinv(c)
pinv(c)




//Norma/
norm(d)




//Valores singulares/
// Equivalente en numpy
// np.linalg.svd(a)
svd(a)



//Rango/
// Equivalente en numpy
// np.rank(a)
rank(a)



//Longitud del vector/
// Equivalente en numpy
// d.size
d.length



//Matriz filas/
// Equivalente en numpy
//a.shape[0]
a.rows



//Matriz columnas/
// Equivalente en numpy
//a.shape[1]
a.cols



val s = DenseMatrix((1.0,2.0,1.0),(2.0,3.0,5.0),(1.0,5.0,6.0))

//Valores propios para matriz simetrica 
// Equivalente en numpy
// np.linalg.eig(a)[0]
eigSym(s)





