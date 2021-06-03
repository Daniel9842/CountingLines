# INTRODUCTION TO JAVA, MVN, AND GIT: LOC Counting
## Daniel Santiago Ducuara Ardila
## 02/06/2021
![Diseño CountingLinesline](Design/countingLines.PNG "countingLines")<br>
El método main es quien se encarga de recibir los parámetros indicados por el usuario en una lista y de ingresar cada linea a una lista llamada lines.
El metodo toDecide se encarga de recibir como parámetros la lista lines creada en el main y el tipo de conteo(phy o loc), dependiendo del
tipo de conteo retorna el valor de una vez si el parámetro es phy ya que es la cantidad de datos en la lista, si el parametro es loc se llama a la funcion locCount.
locCount es el método encargado de realizar la cuenta sin tener en cuenta las lineas en blanco o las lineas comentadas, al final retorna el valor del conteo a la 
función toDecide.

**Para la ejecución de pruebas es necesario cambiar la ruta del archivo**

La productividad de este proyecto fue de 199LOC/8h 

