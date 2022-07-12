package transients

import grails.testing.mixin.integration.Integration
import grails.util.Holders
import org.grails.datastore.mapping.model.PersistentEntity
import org.grails.datastore.mapping.model.PersistentProperty
import spock.lang.Specification

@Integration
class TransientsSpec extends Specification{
    void "TestTheSystemInitialises"() {
        given:
            PersistentEntity persistentEntity = Holders.grailsApplication.mappingContext.getPersistentEntity(DomainOne.class.name)
            List<String> props = persistentEntity.persistentPropertyNames
        expect: "persistent property list should not contain the transient field"
            ! props.contains('thisFieldShouldNotPersist')

    }
}
