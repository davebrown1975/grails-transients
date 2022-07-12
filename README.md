# grails-transients
Illustrating Grails/Gorm issue with inherited transients

Run TransientsSpec to see issue causing exception to fire.

In DomainTwo, commenting the "+ DomainThree.transients" part in the line above enables app startup
Additionally, adding the transient from DomainThree explicitly above ('totalPriceOrZero')
will also enable the system to start.

Correct behaviour should permit us to create static transients list including list from other classes
