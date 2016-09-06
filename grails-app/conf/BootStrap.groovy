import demo.*

class BootStrap {

    def init = { servletContext ->

        println 'Before saving instance'
        def p = new Person(name: 'Peter')
            .addToComments(text: 'Comment One')
            .addToComments(text: 'Comment Two')
            .addToComments(text: 'Comment Three')
            .save(flush: true)

        println 'Before retrieving instance'

        def p2 = Person.get(p.id)

        println 'Before updating instance'
        p2.name = 'Peter Chou'
        p2.save()

    }
    def destroy = {
    }
}
