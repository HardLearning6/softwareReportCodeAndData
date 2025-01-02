package ds.gptTest;

import ds.AgmPrim;
import ds.Grafo;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class AgmPrimTest {
    private Grafo grafo;
    private AgmPrim agmPrim;

    @Before
    public void setUp() throws Exception {
        // Create a simple graph with 3 vertices and some edges
        grafo = new Grafo(3);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(1, 2, 2);
        grafo.insereAresta(0, 2, 3);
        agmPrim = new AgmPrim(grafo);
    }

    @Test(timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        // Testing the default constructor by creating a new instance
        AgmPrim agmPrimTest = new AgmPrim(grafo);
        assertNotNull(agmPrimTest);
    }

    @Test(timeout = 1000)
    public void testObterAgmValid() throws Exception {
        agmPrim.obterAgm(0);
        assertEquals(0, agmPrim.antecessor(1));
        assertEquals(1, agmPrim.antecessor(2));
    }

    @Test(timeout = 1000, expected = Exception.class)
    public void testObterAgmInvalidRoot() throws Exception {
        // Test with an invalid root
        agmPrim.obterAgm(-1);
    }

    @Test(timeout = 1000)
    public void testAntecessorValid() throws Exception {
        agmPrim.obterAgm(0);
        assertEquals(-1, agmPrim.antecessor(0)); // Root vertex has no predecessor
    }

    @Test(timeout = 1000)
    public void testPesoValid() throws Exception {
        agmPrim.obterAgm(0);
        assertEquals(1.0, agmPrim.peso(1), 0.001); // The weight of vertex 1 should be 1.0
    }

    @Test(timeout = 1000)
    public void testImprime() throws Exception {
        // This test will not have an assert, but will check if the method executes without exceptions
        agmPrim.obterAgm(0);
        agmPrim.imprime();
    }
}