package ds.gptTest;

import ds.Grafo;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class GrafoTest {
    private Grafo grafo;
    
    @Before
    public void setUp() throws Exception {
        // Initialize the graph with a positive number of vertices
        grafo = new Grafo(5);
    }

    @Test(timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Grafo grafoDefault = new Grafo(0);
        assertNotNull(grafoDefault);
    }

    @Test(timeout = 1000)
    public void testInsereAresta() throws Exception {
        // Test inserting an edge with valid vertices and positive weight
        grafo.insereAresta(0, 1, 10);
        assertTrue(grafo.existeAresta(0, 1));
        
        // Test inserting an edge with negative weight
        grafo.insereAresta(1, 2, -5);
        assertTrue(grafo.existeAresta(1, 2));
        
        // Test inserting an edge with zero weight
        grafo.insereAresta(2, 3, 0);
        assertTrue(grafo.existeAresta(2, 3));
        
        // Test inserting an edge with invalid vertices (out of bounds)
        grafo.insereAresta(5, 6, 10); // Should not throw, but we cannot check existence
    }

    @Test(timeout = 1000)
    public void testExisteAresta() throws Exception {
        grafo.insereAresta(0, 1, 10);
        assertTrue(grafo.existeAresta(0, 1));
        assertFalse(grafo.existeAresta(1, 2));
    }

    @Test(timeout = 1000)
    public void testListaAdjVazia() throws Exception {
        assertTrue(grafo.listaAdjVazia(0)); // No edges added
        grafo.insereAresta(0, 1, 10);
        assertFalse(grafo.listaAdjVazia(0)); // Edge added
    }

    @Test(timeout = 1000)
    public void testPrimeiroListaAdj() throws Exception {
        grafo.insereAresta(0, 1, 10);
        Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
        assertNotNull(aresta);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(10, aresta.peso());
    }

    @Test(timeout = 1000)
    public void testProxAdj() throws Exception {
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 20);
        Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
        assertNotNull(aresta);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());

        aresta = grafo.proxAdj(0);
        assertNotNull(aresta);
        assertEquals(0, aresta.v1());
        assertEquals(2, aresta.v2());
    }

    @Test(timeout = 1000)
    public void testRetiraAresta() throws Exception {
        grafo.insereAresta(0, 1, 10);
        Grafo.Aresta removedEdge = grafo.retiraAresta(0, 1);
        assertNotNull(removedEdge);
        assertEquals(0, removedEdge.v1());
        assertEquals(1, removedEdge.v2());
        assertEquals(10, removedEdge.peso());
        assertFalse(grafo.existeAresta(0, 1)); // Edge should be removed
    }

    @Test(timeout = 1000)
    public void testImprime() throws Exception {
        // Capture the output
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(1, 2, 20);
        grafo.imprime(); // No assertion, just testing for execution
    }

    @Test(timeout = 1000)
    public void testNumVertices() throws Exception {
        assertEquals(5, grafo.numVertices());
    }

    @Test(timeout = 1000)
    public void testGrafoTransposto() throws Exception {
        grafo.insereAresta(0, 1, 10);
        Grafo grafoTransposto = grafo.grafoTransposto();
        assertTrue(grafoTransposto.existeAresta(1, 0)); // Transposed edge should exist
    }
}