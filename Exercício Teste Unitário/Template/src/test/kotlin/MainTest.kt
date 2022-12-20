import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class MainTest {

    @Test
    @DisplayName("Testa os cenários da portaria")
    fun testPortaria(){
        Assertions.assertAll(
            {Assertions.assertEquals(portaria(15, "", ""), "Negado." )},
            {Assertions.assertEquals(portaria(20, "", ""), "Negado." )},
            {Assertions.assertEquals(portaria(25, "VIP", ""), "Negado.")},
            {Assertions.assertEquals(portaria(35, "comum", "xt45689"), "Welcome." )},
            {Assertions.assertEquals(portaria(35, "comum", "45689"), "Negado." )},
            {Assertions.assertEquals(portaria(35, "premium", "xt45689"), "Negado." )},
            {Assertions.assertEquals(portaria(35, "premium", "45689"), "Negado." )},
            {Assertions.assertEquals(portaria(35, "premium", "xl45689"), "Welcome." )},
            {Assertions.assertEquals(portaria(35, "luxo", "xl45689"), "Welcome." )}
        )
    }
}