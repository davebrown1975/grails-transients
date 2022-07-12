package transients

class DomainThree {

    BigDecimal totalCost

    static constraints = {}

    static transients = [
        'totalCostOrZero'
    ]

    BigDecimal getTotalCostOrZero() {
        totalCost
    }

}
