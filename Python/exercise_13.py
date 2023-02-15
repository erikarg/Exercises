#  Exercício 13: Baseado no exercício anterior, escreva uma função que, dado uma lista de emails, deve retornar somente os emails válidos. Caso uma exceção ocorra, apenas a escreva na tela.

# Exemplo: ["nome@dominio.com", "errad#@dominio.com", "outro@dominio.com"] -> ["nome@dominio.com", "outro@dominio.com"].


from exercise_11 import find_phone_number


def filter_emails(emails):
    valid_emails = []
    for email in emails:
        try:
            find_phone_number(email)
        except ValueError as exc:
            print(exc)
        else:
            valid_emails.append(email)
    return valid_emails
