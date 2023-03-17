fun main(){
    nums()
    println(names(arrayOf("pauline","roy","june","patricia")))
    typesOfDrinks(6)
    typesOfDrinks(9)
    typesOfDrinks(40)
    numbers()
}

//Create a function that prints out all the odd numbers between 1 and 100
fun nums(){
    for (num in 1..100){
        if(num %2 !=0){
            println(num)
        }
    }
}

//Create a function that takes in an array of names and returns the number of
//names longer than 5 characters (2pts)

fun names(word:Array<String>):Int{
    var count = 0
    for(y in word){
        if(y.length >5){
            count++
        }
    }
    return count
}

//You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age.

fun typesOfDrinks(age:Int){
    when(age){
        0,6 -> println("milk")
        7,14 ->println("fanta orange")
        else -> println("coca cola")
    }

}

//Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number.

fun numbers(){
    for(num in 1..100)
        if(num%3 ==0 &&num%5==0){
            println("FizzBuzz")
        }
        else if(num%3 ==0){
            println("Fizz")
        }
        else if(num%5 ==0){
            println("Buzz")
        }
        else{
            println(num)
        }
}