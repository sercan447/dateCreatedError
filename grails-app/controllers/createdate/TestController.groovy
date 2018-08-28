package createdate

import grails.transaction.Transactional

class TestController {

    @Transactional
    def index() {
        def t = new Test()
        //t.save() //do not write it

        t.uid = "dfsdf"
        //write the values I wrote below.try again
        
       // t.dateCreated = //give me a date
        //t.lastUpdated = //give me a date
        t.save()
        render "ok"
       
    }
}

