package demo

class Person {
    String name
    static hasMany = [comments: Comment]
}
