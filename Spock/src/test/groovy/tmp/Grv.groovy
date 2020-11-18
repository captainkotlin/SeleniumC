package tmp

//import groovy.test.NotYetImplemented
import org.junit.ClassRule
import spock.lang.*

class Grv extends Specification {

    @ClassRule
    @Shared
    private static int s = { println("S init"); 5; }.call();

    @Shared
    private int x;

    private int k;

    @PendingFeature
    //@NotYetImplemented
    @Unroll("omg #a #b")
    def word(def a, def b, def d, def e) {
        print "Hello"
        given:
        x = 10;
        k = 4;

        expect:
        a == b

        where:
        a | b
        1 | 2
        3 | 4
        d = 4
        e << [7, 8]
    }

    @Ignore("Ignored due to great failures")
    def gg()
    {
        print "Hello 2"
        expect:

        a == b
        where:
        a | b
        1 | 2
        3 | 4
        d = 4
        e << [7, 8]
    }

}