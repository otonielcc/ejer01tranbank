<h1>El ejercicio</h1>

El planteamiento del ejercicio consiste en operaciones simples para un usuario de un banco, donde permita consultar el saldo disponible, retirar, depositar y salir del sistema.
No se finalizaria el programa hasta que el usuario seleccionara la opcion de salir, por lo que se estaba repitiendo el menu despues de realizar las 3 opciones mostradas.

<h1>Solucion</h1>

En orden cronologico como diseñe el programa y de acuerdo al ejemplo mostrado cuando se planteo el problema, ya estaba definido el nombre del usuario y se mostro el saldo inicial por lo que procedi a identicar variables las cuales fueron:

- __Saldo de la cuenta__, ya que esta podria variar si el cliente retiraba o depositaba
- __Operacion Bancaria__, serviria para definir el tipo de operacion que deseaba realizar el cliente, consulta de saldo, retirar, depositar, salir.

Una vez definidas las variables procedi a imprimir el texto que se mostraria al principio que era, nombre de cliente, tipo de cuenta y el saldo nicial.

Seguido de eso sabia que la mejor opcion para solucionar el ejercicio era usar el comando switch case, el cual usaria 4 opciones y cada uno para las operaciones

<h3>Consulta de saldo</h3>

Para la consulta de saldo, bastaba con mostrar la variable del __Saldo de Cuenta__.

<h3>Retirar</h3>

Para este caso se definieron 2 nuevas variables para la operacion que fueron

- __Saldo a retirar__, el cual era el monto que el usuario retiraria
- __Resultado de Saldo__, el cual ayudaria a asignar el nuevo saldo a la variable global Saldo de Cuenta

Definidas esas variables se procedio a relizar la operacion, tomando en cuenta que el usuario no podria retirar mas cantidad de la que tenia en su cuenta por lo que se uso la condicional que si el Saldo a Retirar era mayor que el Saldo de la cuenta mostraria un mensaje que no tenia fondo suficientes, caso contrario procederia a restar del Saldo de la Cuenta de acuerdo al Saldo a Retirar, el resultado de la suma se asignaria a la variable Resultado de Saldo que luego asignaria a Saldo de cuenta.

<h3>Depositar</h3>

Para esta operacion se creo una nueva variable para el __Saldo a Depositar__. Donde solicita el monto a depositar y se suma con la variable Saldo de la Cuenta


Una vez finalizado esas 3 operaciones tenia que proceder a que despues que se realizaran estas operaciones, volviera a mostrar el menu de lo que se podria realizar, por lo que se tenia que utilizar While. Por lo que tube que crear una nueva variable para __Salir de las Operaciones__ de tipo booleana asignandole el valor de falso.

Mientras la condicion fuese diferente a verdadera se repetiria el  menu.

<h3>Salir o Finalizar</h3>

Por lo que al seleccionar la operacion de Salir, esta mostraria un mensaje en agradecimiento por usar el servicio y posteriormente asignava el valor de verdadero a la variable de __Salir de Operaciones__, finalizando el programa.
