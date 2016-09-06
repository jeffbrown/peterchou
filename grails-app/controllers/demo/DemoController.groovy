package demo

class DemoController {

    def index() {
        def p = Person.get(1)
        def numberOfComments = p?.comments?.size()
        p.name = "Name With Time: ${new Date()}"
        p.save(flush: true)

        render "Person has ${numberOfComments} comments."
    }
}
