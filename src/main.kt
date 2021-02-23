fun main(){
    var escolha = 0
    var result:Float
    do {
        escolha = menu(escolha)
    }while (escolha <= 0 || escolha >= 8)
    println("Digite o 1 número da operação")
    var a1:Float = readLine()!!.toFloat()
    println("Digite o 2 número da operação")
    var a2:Float = readLine()!!.toFloat()
    when(escolha){
        1 -> {
            println("Opção escolhida: Soma")
            result = soma(a1,a2)
            println("O resultado da soma foi de $result")
        }
        2 -> {
            println("Opção escolhida: Subtração")
            result = subtracao(a1,a2)
            println("O resultado da subtração foi de $result")
        }
        3 -> {
            println("Opção escolhida: Divisão")
            result = divisao(a1,a2)
            println("O resultado da divisão foi de $result")
        }
        4 -> {
            println("Opção escolhida: Multiplicação")
            result = multiplicacao(a1,a2)
            println("O resultado da multiplicação foi de $result")
        }
        5 -> {
            println("Opção escolhida: Exponenciação")
            result = exponencial(a1,a2)
            println("O resultado da exponencial foi de $result")
        }
        6 -> {
            println("Opção escolhida: Fatorial")
            result = fatorial(a1)
            println("O resultado da fatorial foi de $result")
        }
        7 -> {
            println("Opção escolhida: Porcentagem")
        }
    }

}

fun menu(choice:Int):Int{
    println("------------Bem Vindo a calculadora --------------------")
    println("Opções[ Digite o numero correspondente a operação]")
    println("[1] Soma ")
    println("[2] Subtração")
    println("[3] Divisão")
    println("[4] Multiplicação")
    println("[5] Exponenciação")
    println("[6] Fatorial")
    println("[7] Porcentagem")
    var choice = readLine()!!.toInt()
    return choice
}
//Soma
fun soma(a:Float,b:Float) = a+b

//Subtração
fun subtracao(a:Float,b:Float) = a-b

//Divisão
fun divisao(a:Float,b:Float) = a/b

//Multiplicação
fun multiplicacao(a:Float,b:Float) = a*b

//Exponencial
fun exponencial(a:Float, b:Float):Float{
    var resultado = a
    do{
        resultado = a*a
         b -=1
    }while(b > 0)
    return resultado
}

//Fatorial
fun fatorial(a:Float):Float{
    var resultado = a
    while (a >= 0){
        resultado = resultado * a
        a = a - 1
    }
    return resultado
}
