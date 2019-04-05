import spock.lang.Specification
import spock.lang.Unroll

class TestSpec extends Specification {

    def 'typed var same name'() {
        given:
        int myInteger = 5

        when:
        def actual = [foo: 5]

        then:
        assert actual.foo == myInteger
    }

    @Unroll
    def 'scenario with typedVar - #scenario'() {

        null == myInteger

        where:
        scenario | myInteger
        'null'   | null
    }
}