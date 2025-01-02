package ds.gptTest;

import ds.Grafo;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class GrafoTest {
    
    private Grafo grafo;

    @Before
    public void setUp() throws Exception {
        // Initializing the graph with a positive number of vertices
        grafo = new Grafo(5);
    }

    @Test(timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Grafo g = new Grafo(3);
        assertNotNull(g);
        assertEquals(3, g.numVertices());
    }

    @Test(timeout = 1000)
    public void testInsereAresta() throws Exception {
        grafo.insereAresta(0, 1, 5);
        assertTrue(grafo.existeAresta(0, 1));
    }

    @Test(timeout = 1000)
    public void testInsereArestaNegative() throws Exception {
        grafo.insereAresta(0, -1, 5);
        assertFalse(grafo.existeAresta(0, -1));
    }

    @Test(timeout = 1000)
    public void testListaAdjVazia() throws Exception {
        assertTrue(grafo.listaAdjVazia(0));
    }

    @Test(timeout = 1000)
    public void testPrimeiroListaAdj() throws Exception {
        grafo.insereAresta(1, 2, 3);
        Grafo.Aresta a = grafo.primeiroListaAdj(1);
        assertNotNull(a);
        assertEquals(1, a.v1());
        assertEquals(2, a.v2());
        assertEquals(3, a.peso());
    }

    @Test(timeout = 1000)
    public void testProxAdj() throws Exception {
        grafo.insereAresta(1, 2, 3);
        grafo.insereAresta(1, 3, 4);
        Grafo.Aresta a = grafo.primeiroListaAdj(1);
        assertNotNull(a);
        assertEquals(1, a.v1());
        assertEquals(2, a.v2());
        a = grafo.proxAdj(1);
        assertNotNull(a);
        assertEquals(1, a.v1());
        assertEquals(3, a.v2());
    }

    @Test(timeout = 1000, expected = Exception.class)
    public void testRetiraArestaThrowsException() throws Exception {
        grafo.retiraAresta(1, -1);
    }

    @Test(timeout = 1000)
    public void testImprime() throws Exception {
        // This method does not return anything, so we just check for no exceptions
        grafo.insereAresta(0, 1, 5);
        grafo.imprime();
    }

    @Test(timeout = 1000)
    public void testGrafoTransposto() throws Exception {
        grafo.insereAresta(0, 1, 5);
        Grafo transposto = grafo.grafoTransposto();
        assertTrue(transposto.existeAresta(1, 0));
        assertFalse(transposto.existeAresta(0, 1));
    }
}