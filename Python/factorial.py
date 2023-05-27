numero = int(input("ingrese un numero"))
factorial = 1
for i in range(1, numero + 1):
    factorial = factorial * i
print("el factorial de {} es: {}".format(numero, factorial))
