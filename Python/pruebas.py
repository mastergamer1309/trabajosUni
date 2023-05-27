# encontrar el segundo valor mas grande de un arreglo

# se crea una lista
lista = [10, 2, 24, 37, 847, 36, 10, 92]
# se define un numero mayor, en este caso, la posicion 0 del arreglo
mayor = lista[0]
# se define un segundo numero mayor que tambien sera en la posicion 0
mayordos = lista[0]
# Ahora realizamos un ciclo for para iterar sobre cada uno  de los espacios en el arreglo y comparamos si el numero en
# esa posicion es mayor que la variable mayor, lo reemplazamos, esto solo para tener como referencia un numero mayor
# y poder proseguir con la comparacion del segundo numero
for i in lista:
    if i > mayor:
        mayor = i
# ahora creamos un segundo ciclo para verificar un numero que sea menor al numero mayor, pero que sea mayor al
# numero que estemos iterando, en este caso iniciamos con el numero en la posicion 0, que es 10. y vamos reemplazando
# el valor de "mayordos".
for i in lista:
    if i < mayor and i > mayordos:
        mayordos = i
# por ultimo imprimimos el segundo numero mayor, en este caso yo imprimi los dos
print("el numero mayor del arreglo es: {} y el segundo numero mayor es: {}".format(mayor, mayordos))

#