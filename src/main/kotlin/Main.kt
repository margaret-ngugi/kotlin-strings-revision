fun main() {
    //Q1
    println(information("Ann",23,"Kenya"))
    //Q2
    println(person("margaret"))
   //Q3
    checkName()



}
//1. Write a function that takes in 3 parameters, name, age, and country, and returns a String with this
// structure “Hi, my name is x, I am y years old and I am from z.” Where x, y, and z are the provided name, age,
// and country respectively. (3 points)

fun information(x:String,y:Int,z:String):String{
    return "Hi,my name is $x,I am $y years old and I am from $z"
}

//2. Write a function that takes in a String and returns its length (2 points)
fun person(name:String):Int{
    return name.length
}

//3. Write a function that takes in a name and prints out “That’s me!” when your name is passed
// to it, otherwise, it prints out “I don’t know who that is” (3 points)

fun checkName(){
    var word="magdaline"
    var word2="loice"
    if(word==word2){
        println("That's me!")
    }else{
        println("I don't know who that is")
    }

}


//4. Write a Kotlin function that takes in a string will all the vowels replaces by the character ‘*’.
// Use string interpolation to generate the output. (2 points)

fun replaceVowels() {
    var name = "Wairimu"
    var vowels = "a,e,i,o,u"



}

