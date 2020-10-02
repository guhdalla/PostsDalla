num = 1
while num == 1 or num == 2 or num==3:
    print("")
    print("")
    print("|___Menu de Opções___|")
    print("1. Gerar digitos verificadores")
    print("2. Verificar digitos verificadores")
    print("3. Estado de Origem")
    print("4. Sair")
    num = int(input("Digite a opção desejada: "))
    while num > 4 or num < 1:
        num = int(input("Opção desejada invalida, digite novamente: "))
    if num == 1:
        CPF = int(input("Digite o numero do CPF sem os 2 ultimos digitos: "))
        while CPF > 999999999 or CPF < 100000000:
            CPF = int(input("Numero do CPF digitado invalido, digite novamente: "))


        # Calcular digito verificador J
        CPF = str(CPF)
        indiceJ = (-9)
        pesoJ = 10
        CPFaJ = 0
        CPFbJ = 0
        while indiceJ < 0:
            somaJ = int(CPF[indiceJ]) * pesoJ
            CPFaJ = somaJ + CPFbJ
            CPFbJ += somaJ
            indiceJ += 1
            pesoJ -= 1
        divJ = CPFbJ % 11
        if divJ < 2:
            digJ = 0
        else:
            digJ = 11 - divJ
        CPF = int(CPF) * 10 + digJ


        #Calcular digito verificador K
        CPF = str(CPF)
        indiceK = (-10)
        pesoK = 11
        CPFaK = 0
        CPFbK = 0
        while indiceK < 0:
            somaK = int(CPF[indiceK]) * pesoK
            CPFaK = somaK + CPFbK
            CPFbK += somaK
            indiceK += 1
            pesoK -= 1
        divK = CPFbK % 11
        if divK < 2:
            digK = 0
        else:
            digK = 11 - divK
        CPF = int(CPF) * 10 + digK
        print("O numero do CPF: ", CPF)

    elif num == 2:
        CPF = int(input("Digite o numero do CPF: "))
        while CPF > 99999999999 or CPF < 10000000000:
            CPF = int(input("Numero do CPF digitado invalido, digite novamente: "))
        # Calcular digito verificador J
        CPF = str(CPF)
        indiceJ = (-11)
        pesoJ = 10
        CPFaJ = 0
        CPFbJ = 0
        while indiceJ < -2:
            somaJ = int(CPF[indiceJ]) * pesoJ
            CPFaJ = somaJ + CPFbJ
            CPFbJ += somaJ
            indiceJ += 1
            pesoJ -= 1
            divJ = CPFbJ % 11
        if divJ < 2:
            digJ = 0
        else:
            digJ = 11 - divJ

        # Calcular digito verificador K
        CPF = str(CPF)
        indiceK = (-11)
        pesoK = 11
        CPFaK = 0
        CPFbK = 0
        while indiceK < -1:
            somaK = int(CPF[indiceK]) * pesoK
            CPFaK = somaK + CPFbK
            CPFbK += somaK
            indiceK += 1
            pesoK -= 1
        divK = CPFbK % 11
        if divK < 2:
            digK = 0
        else:
            digK = 11 - divK
        if digJ == int(CPF[-2]) and digK == int(CPF[-1]):
            print("CPF Valido!")
        else:
            print("CPF Invalido!")

    elif num == 3:
        CPF = int(input("Digite o numero do CPF: "))
        while CPF > 99999999999 or CPF < 10000000000:
            CPF = int(input("Numero do CPF digitado invalido, digite novamente: "))
        # Calcular digito verificador J
        CPF = str(CPF)
        indiceJ = (-11)
        pesoJ = 10
        CPFaJ = 0
        CPFbJ = 0
        while indiceJ < -2:
            somaJ = int(CPF[indiceJ]) * pesoJ
            CPFaJ = somaJ + CPFbJ
            CPFbJ += somaJ
            indiceJ += 1
            pesoJ -= 1
            divJ = CPFbJ % 11
        if divJ < 2:
            digJ = 0
        else:
            digJ = 11 - divJ

        # Calcular digito verificador K
        CPF = str(CPF)
        indiceK = (-11)
        pesoK = 11
        CPFaK = 0
        CPFbK = 0
        while indiceK < -1:
            somaK = int(CPF[indiceK]) * pesoK
            CPFaK = somaK + CPFbK
            CPFbK += somaK
            indiceK += 1
            pesoK -= 1
        divK = CPFbK % 11
        if divK < 2:
            digK = 0
        else:
            digK = 11 - divK

        origem = ["Rio Grande do Sul", "Distrito Federal, Goiás, Mato Grosso, Mato Grosso do Sul e Tocantins",
                        "Amazonas, Pará, Roraima, Amapá, Acre e Rondônia", " Ceará, Maranhão e Piauí",
                        "Paraíba, Pernambuco, Alagoas e Rio Grande do Norte",
                        "Bahia e Sergipe", "Minas Gerais", "Rio de Janeiro e Espírito Santo", "São Paulo",
                        "Paraná e Santa Catarina"]
        o = 0
        while o != int(CPF[-3]):
            o += 1
        if digJ == int(CPF[-2]) and digK == int(CPF[-1]):
            print("Estado de Origem: ", origem[o])
        else:
            print("CPF Invalido!")
    else:
        print("Saindo...")