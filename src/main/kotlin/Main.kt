package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val producto = mutableListOf<Producto>()

    var opc: Int
/*
 1. Crear producto
2. Vender producto: Reduce la cantidad en stock si hay suficiente disponibilidad.
3. Reponer stock: Aumenta la cantidad en stock cuando llega nueva mercancía.
4. Aplicar descuento: Reduce el precio del producto en un porcentaje dado(2%).
5. Mostrar información: Imprime los detalles del producto. (NO toString)
6. Aumentar precio: Incrementa el precio del producto en un porcentaje dado.(6%)
7. Calcular valor total en inventario: Multiplica la cantidad en stock por el precio del producto. ( Mostrar total de inventario)
8. Eliminar productos por codigo.*/
    do {
        println(
            """
                
           Menu 
           1. Registrar producto 
           2. Venta 
           3. Consultar
           4. Comprar con descuento 
           5. Comprar con Aumento
           6. Registrar
           6. salir
           
           
            """.trimIndent()
        )
        print("Seleccione una opción: ")
        opc = readln().toInt()

            when (opc) {
                    1 -> {

                            println("Registrar:")
                            print(" Ingresar el Codigo: ")
                            val codigo = readln().toInt()
                            print(" Ingresar el Nombre: ")
                            val nombre = readln()
                            print("Ingresar el precio: ")
                            val precio = readln().toDouble()
                            print(" Ingresar el stock : ")
                            val stock = readln().toInt()

                            val datosMasc = Producto (codigo, nombre,precio, stock)
                            producto.add(datosMasc)
                            println("su producto ha sido creado con exito: codigo${codigo}, Nombre ${nombre}, Precio: ${precio}, stock: ${stock}")
                    }
                        2 ->{
                             if (producto.isEmpty())
                            {
                                println("No se ha encontrado ningun producto registrado!")
                            } else

                                print("Ingrese el codigo: ")
                                val codigo = readln().toInt()
                                // find sirve para buscar el codigo  en la lista producto (it.nombre) sirve para buscar que consida con el nombre ingresado por el usuario
                                // it objeto en la lista veterinaria que es lo mismo it = { mascota -> mascota.nombre == nombre } pero it rd abreviado
                                val produc = producto.find { it.codigo == codigo }
                                if (produc != null) {
                                    print("Ingrese la cantidad: ")
                                    val cantidad = readln().toInt()
                                    produc.venderProducto(cantidad)
                                } else {
                                    println("No se encontró producto con el codigo $codigo.")
                                }

                        }
                    3->{ if (producto.isEmpty())
                    {
                        println("No se ha encontrado ninguna mascota registrada!")
                    } else

                        print("Ingrese el codigo: ")
                        val codigo = readln().toInt()
                        // find sirve para buscar la mascota en la lista veterinaria, (it.nombre) sirve para buscar que consida con el nombre ingresado por el usuario
                        // it objeto en la lista veterinaria que es lo mismo it = { mascota -> mascota.nombre == nombre } pero it rd abreviado
                        val producto = producto.find { it.codigo == codigo }
                        if (producto != null) {
                            producto.describirProducto()
                        } else {
                            println("No se encontró el producto nombre $producto.")
                        }
                    }
                4->{
                    if (producto.isEmpty())
                    {
                        println("No se ha encontrado ningun producto registrado!")
                    } else

                        print("Ingrese el codigo: ")
                    val codigo = readln().toInt()
                    // find sirve para buscar el codigo  en la lista producto (it.nombre) sirve para buscar que consida con el nombre ingresado por el usuario
                    // it objeto en la lista veterinaria que es lo mismo it = { mascota -> mascota.nombre == nombre } pero it rd abreviado
                    val produc = producto.find { it.codigo == codigo }
                    if (produc != null) {
                        produc.Aumentar()

                    } else {
                        println("No se encontró producto con el codigo $codigo.")
                    }

                }
                5 -> {
                    if (producto.isEmpty())
                    {
                        println("No se ha encontrado ningun producto registrado!")
                    } else

                        print("Ingrese el codigo: ")
                    val codigo = readln().toInt()
                    // find sirve para buscar el codigo  en la lista producto (it.nombre) sirve para buscar que consida con el nombre ingresado por el usuario
                    // it objeto en la lista veterinaria que es lo mismo it = { mascota -> mascota.nombre == nombre } pero it rd abreviado
                    val produc = producto.find { it.codigo == codigo }
                    if (produc != null) {
                        produc.Descuento()
                    } else {
                        println("No se encontró producto con el codigo $codigo.")
                    }
                }
            }
        }while (opc != 6)
    }



