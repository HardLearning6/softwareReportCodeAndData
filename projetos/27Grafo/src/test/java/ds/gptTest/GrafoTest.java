package ds.gptTest;

import ds.Grafo;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class GrafoTest {
    
    private Grafo grafo;

    @Before
    public void setUp() throws Exception {
        grafo = new Grafo(5); // Initialize a graph with 5 vertices
    }

    @Test(timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Grafo emptyGrafo = new Grafo(0); // Test empty graph initialization
        assertEquals(0, emptyGrafo.numVertices());
    }

    @Test(timeout = 1000)
    public void testInsereAresta() throws Exception {
        grafo.insereAresta(0, 1, 10);
        assertTrue(grafo.existeAresta(0, 1));
    }

    @Test(timeout = 1000)
    public void testInsereArestaWithInvalidVertices() throws Exception {
        grafo.insereAresta(0, 6, 10); // Invalid vertex, should not throw
        assertFalse(grafo.existeAresta(0, 6));
    }

    @Test(timeout = 1000)
    public void testRetiraAresta() throws Exception {
        grafo.insereAresta(0, 1, 10);
        assertTrue(grafo.existeAresta(0, 1));
        grafo.retiraAresta(0, 1);
        assertFalse(grafo.existeAresta(0, 1));
    }

    @Test(timeout = 1000, expected = Exception.class)
    public void testRetiraArestaThrowsExceptionForInvalidEdge() throws Exception {
        grafo.retiraAresta(0, 2); // Edge does not exist
    }

    @Test(timeout = 1000)
    public void testListaAdjVazia() throws Exception {
        assertTrue(grafo.listaAdjVazia(0)); // No edges yet
        grafo.insereAresta(0, 1, 10);
        assertFalse(grafo.listaAdjVazia(0)); // Edge exists now
    }

    @Test(timeout = 1000)
    public void testPrimeiroListaAdj() throws Exception {
        grafo.insereAresta(0, 1, 10);
        Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
        assertNotNull(aresta);
        assertEquals(1, aresta.v2());
        assertEquals(10, aresta.peso());
    }

    @Test(timeout = 1000)
    public void testProxAdj() throws Exception {
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
        assertNotNull(aresta);
        assertEquals(1, aresta.v2());
        
        aresta = grafo.proxAdj(0);
        assertNotNull(aresta);
        assertEquals(2, aresta.v2());
    }

    @Test(timeout = 1000)
    public void testGrafoTransposto() throws Exception {
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        Grafo grafoTransposto = grafo.grafoTransposto();
        
        assertTrue(grafoTransposto.existeAresta(1, 0));
        assertTrue(grafoTransposto.existeAresta(2, 1));
        assertFalse(grafoTransposto.existeAresta(0, 1)); // Original direction should not exist
    }

    @Test(timeout = 1000)
    public void testNumVertices() throws Exception {
        assertEquals(5, grafo.numVertices()); // Check number of vertices
    }

    @Test(timeout = 1000)
    public void testImprime() throws Exception {
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        grafo.imprime(); // Just test if it runs without exceptions
    }
}