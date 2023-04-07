import org.junit.jupiter.api.Test
import vet.inpulse.BuildKonfig

class SimpleTest {

    @Test
    fun test() {
        assert(BuildKonfig.VERSION == "2")
    }
}