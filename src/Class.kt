fun main() {
    var man = Human("Amondi",27,54.6)
    println(man.eat(15))
    man.speak("I am a grown-up")
    man.birthday()
    var users = User("Synthia","Hunter","achienghunter@gmail.com","+254728861089","truth45#")
    println(users.phoneNumber)
    println(users.email)
}
class Human (var name:String,var age:Int,var weight:Double){
    fun eat (foodWeight:Int){
        println("I am eating $foodWeight kgs of food")
        var newWeight = weight + foodWeight
        println(newWeight)
    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
        println(age + 1)
    }
}
data class User (var firstName: String,var lastName:String, var email:String,var phoneNumber:String,var password:String){

}
