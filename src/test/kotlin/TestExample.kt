import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TestExample {

    @Test
    fun `should add two numbers`() {
        assertThat(2 + 2).isEqualTo(4)
    }
}