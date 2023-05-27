#Realizar un programa que solicite al usuario su edad y determine si es mayor o menor de edad.

#No hay switch en python asi que voy a estar practicando con el try

try:
    edad = int(input("cual es su edad?"))
    if edad >= 18:
        print("usted es mayor de edad")

    elif edad < 18:
        print("usted es menor de edad")

except:
    print("digite un numero valido")

#Escribir un programa que pida al usuario un número y determine si es positivo, negativo o cero.

try:
    numero = float(input("digite un numero: "))

    if numero > 0:
        print("su numero {} es positivo".format(numero))
    elif numero < 0:
        print("su numero {} es negativo".format(numero))
    elif numero == 0:
        print("su numero es 0".format(numero))
except:
    print("elija un numero valido")

#Realizar un programa que pida al usuario dos números y determine cuál es el mayor.
try:
    numero1 = int(input("digite su primer numero"))
    numero2 = int(input("digite su segundo numero"))
    if numero1 > numero2:
        print("su numero {} es mayor que {}".format(numero1, numero2))

    elif numero2 > numero1:
        print("su numero {} es mayor que {}".format(numero2, numero1))

except:
    print("elija un numero valido")

#Escribir un programa que solicite al usuario una letra y determine si es una vocal o una consonante.


letra = input("cual es su letra???: ")

if letra == ("a", "e", "i", "o", "u", "A", "E", "I", "O", "U"):
    print("su letra {} es una vocal".format(letra))

else:
    print("su letra {} es una consonante".format(letra))

#Realizar un programa que pida al usuario tres números y determine cuál es el menor.

numero1 = int(input("escriba el primer numero"))
numero2 = int(input("escriba el segundo numero"))
numero3 = int(input("escriba el tercer numero"))

if numero1 > numero2 and numero1 > numero3:
    print("el numero 1 es mayor")

elif numero2 > numero1 and numero2 > numero3:
    print("numero 2 es mayor")

elif numero3 > numero1 and numero3 > numero2:
    print("numero 3 es mayor")

else:
    print("los numero son iguales")

#Escribir un programa que solicite al usuario una calificación y determine si es aprobatoria (mayor o igual a 60) o reprobatoria (menor a 60).

try:
    calificacion = float(input("digite su calificacion: "))
    if calificacion >= 60:
        print("usted aprobo con {} de nota".format(calificacion))

    elif calificacion < 60:
        print("usted no ha aprobado con {} de nota".format(calificacion))

except:
    print("digite su calificacion correctamente")


#Realizar un programa que pida al usuario dos números y determine si son iguales o distintos.

try:
    numero1 = int(input("digite su primer numero: "))
    numero2 = int(input("digite su segundo numero: "))
    if numero1 == numero2:
        print("los numeros son iguales")

    else:
        print("los numeros son diferentes")

except:
    print("elija un numero valido")

#Escribir un programa que solicite al usuario un número y determine si es par o impar.

numero = int(input("ingrese su numero: "))
if numero %2 == 0:
    print("su numero es par")

else:
    print("su numero es impar")


#Realizar un programa que pida al usuario un año y determine si es bisiesto o no.

anio = int(input("ingrese su anio: "))
if anio %4 == 0:
    print("su anio es bisiesto")
else:
    print("su anio no es bisiesto")

#Escribir un programa que solicite al usuario un número del 1 al 7 y determine
# a qué día de la semana corresponde (1=lunes, 2=martes, etc.).

#LO HICE CON TRY PORQUE NO ENCONTRE SWITCH EN PYTHON

try:
    numero = int(input("ingrese un numero del uno al siete: "))
    if numero == 1:
        print("el dia {} es lunes".format(numero))
    elif numero == 2:
        print("el dia {} es martes".format(numero))
    elif numero == 3:
        print("el dia {} es miercoles".format(numero))
    elif numero == 4:
        print("el dia {} es jueves".format(numero))
    elif numero == 5:
        print("el dia {} es viernes".format(numero))
    elif numero == 6:
        print("el dia {} es sabado".format(numero))
    elif numero == 7:
        print("el dia {} es domingo".format(numero))
except:
    print("digite un numero entre el 1 y el 7")

#Realizar un programa que pida al usuario un número del 1 al 12 y determine el mes correspondiente.

try:
    numero = int(input("ingrese un numero del uno al doce: "))
    if numero == 1:
        print("el mes {} es enero".format(numero))
    elif numero == 2:
        print("el mes {} es febrero".format(numero))
    elif numero == 3:
        print("el mes {} es marzo".format(numero))
    elif numero == 4:
        print("el mes {} es abril".format(numero))
    elif numero == 5:
        print("el mes {} es mayo".format(numero))
    elif numero == 6:
        print("el mes {} es junio".format(numero))
    elif numero == 7:
        print("el mes {} es julio".format(numero))
    elif numero == 8:
        print("el mes {} es agosto".format(numero))
    elif numero == 9:
        print("el mes {} es septiembre".format(numero))
    elif numero == 10:
        print("el mes {} es octubre".format(numero))
    elif numero == 11:
        print("el mes {} es noviembre".format(numero))
    elif numero == 12:
        print("el mes {} es diciembre".format(numero))

except:
    print("digite un numero entre el 1 y el 12")

#para optimizar el codigo podemos usar una lista y asi no hay que hacer tantos if

mes = ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre",
       "Diciembre"]

decision = int(input("digite un numero del 1 al 12"))
try:
    print("el numero {} es el mes {}".format(decision, mes[decision-1]))
except:
    print("ingrese un numero del 1 al 12")

#Realizar un programa que pida al usuario un número y calcule su factorial utilizando un ciclo for.

decision = int(input("digite un numero: "))

factorial = 1

for i in range(1, decision+1):
    factorial *=i

print("el factorial de {} es {}".format(decision, factorial))

#aqui lo que hacemos es pedirle un numero al usuario y multimplicarlo por el rango del 1 hasta el numero orientado del
# usuario mas 1 ya que en "range" se toma un numero menos del ultimo digito que declaramos, por ejemplo si ponemos
# range(1,11)solo conseguiremos que el programa entienda del 1 al 10, luego solo multiplicamos la variable factorial
# y la multiplicamos por el numero que nos proporciono el usuario

#Escribir un programa que muestre por pantalla todos los números del 1 al 100 que sean divisibles por 3.

for i in range(1, 101):
    if i % 3 == 0:
        print(i)

#del 1 al 100 el programa va a agarrar los numeros que sean divisibles entre 3 y los va a imprimir, en este caso la
# variable i.

#

numero = int(input("ingrese un numero"))

primo = True
for i in range(2, numero):
    if numero % i == 0:
        primo = False
        pass

if primo and numero > 1:
    print("{} es un numero primo".format(numero))
else:
    print("{} no es un numero primo".format(numero))


