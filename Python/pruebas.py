# dado una cantidad decir cuantos billetes de cada denominacion debe dar teniendo billetes de 500, 100, 50, 20, 10 y
# monedas de 5, 1 y 0.5 1523.5

billetes = [500, 100, 50, 20, 10, 5, 1, 0.5]
monto = float(input("ingrese un monto"))
entero = []
cantidad = 0

for i in billetes:
    cantidad = int(monto / i)
    entero.append(cantidad)
    monto = monto % i

print(entero)