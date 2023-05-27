# 1 Suma de elementos en un arreglo: Escribe un programa que tome un arreglo de enteros como entrada y calcule la suma
# de todos los elementos en el arreglo. Puedes utilizar un bucle para iterar a través del arreglo y sumar los elementos
# uno por uno.

arreglo = []
total = 0
for i in range(10):
    numero = int(input("ingrese un numero entero: "))
    arreglo.append(numero)

for i in arreglo:
    total += i

print("la suma total del arreglo es: {}".format(total))

# 2 Mayor y menor en un arreglo: Escribe un programa que tome un arreglo de números como entrada y encuentre el valor
# mayor y menor en el arreglo. Puedes utilizar un bucle para iterar a través del arreglo y comparar los elementos para
# encontrar el mayor y menor valor.

