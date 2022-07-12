package transients

class DomainTwo {

    String colour

    static transients = [
        'thisFieldShouldNotPersist'
    ] + DomainThree.transients

    // Commenting the "+ DomainThree.transients" part in the line above enables app startup
    // Additionally, adding the transient from DomainThree explicitly above ('totalPriceOrZero')
    // will also enable the system to start.

    String getThisFieldShouldNotPersist() { "green" }

    void setThisFieldShouldNotPersist(String itemString) {
        colour = "red"
    }

}
