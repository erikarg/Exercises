# Exercício 6: Crie uma função que receba os três lado de um triângulo e informe qual o tipo de triângulo formado ou "não é triangulo", caso não seja possível formar um triângulo.

def triangle(a, b, c):
    if a == b == c:
        return "Triângulo Equilátero"
    elif a == b or a == c or b == c:
        return "Triângulo Isósceles"
    elif a!= b and a!= c and b!= c:
        return "Triângulo Escaleno"
    else:
        return "Não é um triângulo"

print(triangle(3, 4, 5))