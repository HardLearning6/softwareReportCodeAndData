package ds.RandoopTest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        grafo13.imprime();
        ds.Grafo.Aresta aresta17 = grafo13.retiraAresta(0, (int) (short) 10);
        grafo13.imprime();
        grafo13.insereAresta((int) (short) 1, 0, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta24 = grafo13.proxAdj(32);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        ds.Grafo grafo16 = grafo1.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta18 = grafo1.proxAdj(35);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        grafo1.imprime();
        grafo1.insereAresta(10, 97, (int) ' ');
        grafo1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta21 = grafo1.proxAdj((int) '4');
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        grafo1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta15 = grafo1.proxAdj(1);
    }
}

