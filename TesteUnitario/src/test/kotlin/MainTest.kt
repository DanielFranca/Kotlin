import org.junit.jupiter.api.*

class MainTest {

    @Test
    fun provocacao(){ //esse teste não testa nada, sempre vai dar certo porque não recebemos valores nulo
        Assertions.assertNotNull(countXO("Daniel A. F. Leite"))
        Assertions.assertNotNull(countXO("xxoo"))
        Assertions.assertNotNull(countXO("xxxxxxxxo"))
    }

    @Test
    @DisplayName("Teste método xxoo")
    fun testCountXO(){
        Assertions.assertAll(
            {Assertions.assertTrue(countXO("xxoo"))},
            {Assertions.assertTrue(countXO("xxoox"))},
            {Assertions.assertTrue(countXO("xXoo"))},
            {Assertions.assertTrue(countXO("xxOo"))},
            {Assertions.assertTrue(countXO("xxoO"))}
        )

    }

    @Test
    @Disabled
    fun naoImplementado() {

    }

    @Test
    fun vaiFalhar(){
        fail("Não posso terminar os testes sem esse método")
    }

    @Test
    fun assumption(){
        Assumptions.assumeTrue(countXO("xxoo")) // aqui ele só roda o teste se a condição dessa linha for verdadeira
        Assertions.assertTrue(abc())
    }

    @Test
    fun exception() {
        assertThrows /* qual exceção estamos esperando -> */ <NullPointerException> /* metódo -> */ { excecao() }
    }
}