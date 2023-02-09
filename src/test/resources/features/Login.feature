# language: es
Característica:  Ingresar al aplicativo web y  logearse

 Como usuario  quiero ingresar a la página y  hacer login


  Escenario: Ingreso correcto a la pagina
    Dado que el cliente entre a la pagina
    Cuando navegue hacia el  formulario de sign in
    Y envie el formulario :  "ABCDE@Test.com" y la contraseña: "12345ABC!"
    Entonces vera un  mensaje de: "Welcome, Mark Test!"


  Escenario: Ingreso fallido a la pagina por enviar el  formulario  vacio
    Dado que el cliente entre a la pagina
    Cuando navegue hacia el  formulario de sign in
    Y envie el formulario vacio
    Entonces vera un  mensaje de error





