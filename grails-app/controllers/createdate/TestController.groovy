package createdate

import grails.transaction.Transactional

class TestController {

    @Transactional
    def index() {
        def t = new Test()
        t.save()

        t.uid = "dfsdf"
        t.save()
        render "ok"
    }
}
