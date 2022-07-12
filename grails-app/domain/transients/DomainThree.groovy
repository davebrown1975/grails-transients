package transients

class DomainThree {

    static mapWith = "none"

    BigDecimal cost
    BigDecimal totalCost

    static constraints = {
        cost nullable: false, min: 0.0
        totalCost nullable: false
    }

    static transients = [
        'totalCostOrZero'
    ]

    BigDecimal getTotalCostOrZero() {
        totalCost
    }

}
