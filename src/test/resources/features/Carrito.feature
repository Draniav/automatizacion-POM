# language: es
Característica:  carrito de compras

  Como usuario de la pagina quiero usar el  carrito de compras


  Escenario:agregar elementos del hotseller a carrito de compras
    Dado que el cliente en  la pagina principal
    Cuando seleccione de la seccion Hot Sellers   un  articulo
    Entonces podra ver un  mensaje de confirmacion

  Escenario:Eliminar elementos del carrito de compras
    Dado que el cliente en  la pagina principal
    Cuando seleccione de la seccion Hot Sellers   un  articulo
    Cuando abra la cartilla de productos
    Cuando haga clic en  el  boton eliminar y confirmar
    Entonces vera el  mensaje en  la cartilla: "You have no items in your shopping cart."
