def xor(a, b):
   saida_1 = not(a and b)
   saida_2 = not(a and saida_1)
   saida_3 = not(b and saida_1)
   return not(saida_2 and saida_3)
 
def SomadorCompleto(a, b, cin):
   saida_1 = xor(a, b)
   saida_s = xor(saida_1, cin)
 
   saida_2 = a and b
   saida_3 = cin and saida_1
   saida_c = saida_2 or saida_3
 
   print(f'| {int(a)} | \033[0;35m{int(b)}\033[m |  {int(cin)}  | \033[0;35m{int(saida_s)}\033[m |   {int(saida_c)}  |\n|{"-"*24}|')

#Basta executar para ver a tabela da verdade do somador completo
print(f"\033[1m| a | b | cin | S | Cout |\033[m\n|{'-'*24}|")
SomadorCompleto(0, 0, 0)
SomadorCompleto(0, 1, 0)
SomadorCompleto(1, 0, 0)
SomadorCompleto(1, 1, 0)
SomadorCompleto(0, 0, 1)
SomadorCompleto(0, 1, 1)
SomadorCompleto(1, 0, 1)
SomadorCompleto(1, 1, 1)