package tmp

omg()


def omg()
{
    email {
        from "omg"
        to 'john.doe@waitaminute.com', 'wp'
        subject 'The pope has resigned!'
        ff
    }
}


def email(@DelegatesTo(strategy=Closure.DELEGATE_ONLY, value=EmailSpec) Closure cl) {
    def email = new EmailSpec()
    def code = cl.rehydrate(email, this, this)
    code.resolveStrategy = Closure.DELEGATE_ONLY
    code()
}

class EmailSpec {
    void from(String from) { println "From: $from"}
    void to(String... to) { println "To: $to"}
    void subject(String subject) { println "Subject: $subject"}
    void body(Closure body) {
//        def bodySpec = new BodySpec()
//        def code = body.rehydrate(bodySpec, this, this)
//        code.resolveStrategy = Closure.DELEGATE_ONLY
//        code()
    }
}
