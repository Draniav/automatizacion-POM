# language: es
Característica:  Ingresar al aplicativo web y  logearse

 Como usuario no  registrado quiero ingresar a la página y  hacer login


  Escenario: Ingreso fallido a la pagina por cuenta inactiva
    Dado que el cliente entre a la pagina
    Cuando navegue hacia el  formulario de sign in
    Y diligencie el formulario con  los datos correctos
    Entonces vera un  mensaje de error por inactivadad en la cuenta





