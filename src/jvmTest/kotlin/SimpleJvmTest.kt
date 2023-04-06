import org.junit.jupiter.api.Test
import vet.inpulse.core.BuildKonfig

class SimpleJvmTest {

    @Test
    fun test() {
        println("hello world")
        assert(BuildKonfig.VERSION == "2")
    }
}