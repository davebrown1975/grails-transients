package transients

class DomainOne extends DomainTwo {

    String something

    static constraints = {    }

    static transients = DomainTwo.transients

}
