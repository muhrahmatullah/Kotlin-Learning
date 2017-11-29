class Person (val name: String, var age: Int){
    fun nextAge(): Int{
        return (age) + 1;
    }
    fun isOlderThan(other: Person): Boolean {
        return other.age < age;
    }

    override fun toString(): String {
        return "My name is $name and I am $age years old"
    }

    override fun equals(other: Any?): Boolean {
        return (other is Person && other.name == name)
    }
}
fun main(args: Array<String>){
    val person = Person("John", 43);
    val person1 = Person("John", 45);

    println(person == person1)
}