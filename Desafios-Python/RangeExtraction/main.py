def solution(args):
    posicao_em_analise = 0
    range_nation = 1
    text = ""
    for x in range(0, len(args)-1): #conta até a penultimo posição da lista por causa do if da prox linha. 
        if args[x] - args[x+1] != -1:
            if range_nation == 1:
                text += f"{args[posicao_em_analise]},"
            elif range_nation == 2:
                text += f"{args[posicao_em_analise]}, {args[posicao_em_analise + 1]},"
            else:
                text += f"{args[posicao_em_analise]}-{args[x]}," #já que quebrou no args[x+1] então o fim da sequencia eh o args[x]

            range_nation = 1
            posicao_em_analise = x+1
        range_nation += 1

    range_nation -= 1
    posicao_em_analise -= 1

    if range_nation == 1: #Se for 1 é pq no ultimo loop ela entrou no if
        text += str(args[-1])
    else:
        if range_nation == 2:
            text += f"{args[posicao_em_analise]}, {args[posicao_em_analise + 1]}"
        else:
            text += f"{args[posicao_em_analise]}-{args[x]}" #já que quebrou no args[x+1] então o fim da sequencia eh o args[x]

    return text
