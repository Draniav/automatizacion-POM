# language: es
Característica:  Registro



  Escenario: Registro exitoso
    Dado que el usuario navega hacia  Create and Account
    Cuando envia el  formulario con los datos correctos
    Entonces vera el  mensaje de  : "Thank you for registering with Fake Online Clothing Store".


  Escenario: Registro no exitoso
    Dado que el usuario navega hacia  Create and Account
    Cuando envie el  formulario  vacio
    Entonces tendra una notificacion de error .