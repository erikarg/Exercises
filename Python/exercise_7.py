#  Exercício 7: Faça um programa que receba um nome e imprima o mesmo na vertical em escada invertida


def vertical_inverted(name):
    for removed_letters in range(len(name)):
        for index in range(len(name) - removed_letters):
            print(name[index], end="")
        print()


print(vertical_inverted("Érika"))
