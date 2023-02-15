# Exercício 2: Faça um programa que, dado um valor n qualquer, tal que n > 1, imprima na tela um triângulo retângulo com n asteriscos de base. Por exemplo, para n = 5 o triângulo terá 5 asteriscos na base:

from time import sleep


def triangle(n):
    for i in range(1, n + 1):
        print(i * "*")
        sleep(1)

print(triangle(5))