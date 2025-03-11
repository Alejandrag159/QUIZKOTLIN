package org.example

class Producto {

    var codigo: Int = 0
    var nombre : String = ""
    var precio : Double =0.0
    var cantidadStock : Int = 0

    constructor()
    constructor(codigo: Int, nombre: String, precio: Double, cantidadStock: Int) {
        this.codigo = codigo
        this.nombre = nombre
        this.precio = precio
        this.cantidadStock = cantidadStock
    }

    fun Descuento(): Double {
        if (precio == precio) {
            precio -= precio*1.02
            return  precio
        } else {
            return precio
        }
    }
    fun Aumentar(): Double {
        if (precio == precio) {
            precio += precio*1.06
            println(" el precio aumentado al 6%: $precio")
            return  precio
        } else {
            return precio
        }
    }

    fun venderProducto(cantidadNueva: Int){
       if (cantidadStock >= 1){
           cantidadStock=cantidadNueva
           println("Producto cantidad: $cantidadStock")
       }
        else {
            println("la cantidad que deseas es insuficiente")
       }
    }

    fun aumentarstock(cantidadNueva: Int) {
        if (cantidadNueva > 1){
            cantidadStock += cantidadNueva
            println(" La cantidad disponible es de  $cantidadStock")
        }
       else {
            println(" La no cargo")
        }

    }
    fun describirProducto(){

        println("Mascota(Codigo=$codigo, nombre=$nombre, precio=$precio, cantidadStock='$cantidadStock')")
    }
}