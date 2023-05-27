# imprima los primeros 10 numeros de la sucesiojn de fibonacci
inicial = 1
segundo = 2
tercero = 0
for i in range(1, 10):
    tercero = segundo + inicial
    inicial = segundo
    segundo = tercero
    print(segundo)
