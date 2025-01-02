package ds.RandoopTest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test001");
        ds.Grafo grafo1 = new ds.Grafo(100);
        java.lang.Class<?> wildcardClass2 = grafo1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo1.retiraAresta(0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.Grafo grafo1 = new ds.Grafo(100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = grafo1.listaAdjVazia(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = grafo1.existeAresta((int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        java.lang.Class<?> wildcardClass4 = grafo1.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta10 = grafo1.proxAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo1.proxAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) ' ', (int) (byte) 1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.Grafo grafo1 = new ds.Grafo(10);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) '#', 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) ' ', (int) (byte) 1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta15 = grafo1.retiraAresta((int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta16 = grafo1.proxAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj(0);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) -1, (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        java.lang.Class<?> wildcardClass2 = grafo1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((-1), (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        grafo1.imprime();
        java.lang.Class<?> wildcardClass3 = grafo1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        boolean boolean16 = grafo1.existeAresta((int) (byte) 1, 1);
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        grafo1.insereAresta((int) (byte) 10, (int) (byte) 1, (int) (short) 100);
        int int18 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta20 = grafo1.proxAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta17 = grafo1.primeiroListaAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        int int3 = grafo2.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta5 = grafo2.proxAdj((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.Grafo grafo1 = new ds.Grafo(32);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) '#', (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', (int) (short) 10, 0);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.Grafo grafo1 = new ds.Grafo(100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta16 = grafo1.retiraAresta(0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        grafo1.imprime();
        ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj(10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(32, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        grafo1.insereAresta((int) (byte) 10, (int) (byte) 1, (int) (short) 100);
        int int18 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta21 = grafo1.retiraAresta((int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        grafo1.insereAresta((int) (byte) 10, (int) (byte) 1, (int) (short) 100);
        int int18 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta20 = grafo1.proxAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        java.lang.Class<?> wildcardClass3 = grafo2.getClass();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        int int2 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = grafo1.listaAdjVazia((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta5 = grafo1.proxAdj(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) ' ', (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) ' ', (int) (byte) 1, (int) (byte) 100);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        boolean boolean15 = grafo13.listaAdjVazia(10);
        ds.Grafo.Aresta aresta17 = grafo13.proxAdj(10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        grafo15.insereAresta((int) (byte) 10, (int) (byte) 100, 97);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta5 = grafo2.retiraAresta(32, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo1 = new ds.Grafo((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo4.retiraAresta((-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.Grafo grafo1 = new ds.Grafo(0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = grafo1.existeAresta((int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj(0);
        grafo1.insereAresta((int) '#', (-1), 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo10 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (int) (byte) -1, (int) (byte) 0);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        int int16 = grafo15.numVertices();
        ds.Grafo.Aresta aresta18 = grafo15.primeiroListaAdj((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta21 = grafo15.retiraAresta((int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNull(aresta18);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta4 = grafo2.proxAdj((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        int int13 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(100, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        java.lang.Class<?> wildcardClass3 = grafo2.getClass();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        grafo1.insereAresta((int) (byte) 10, (int) (byte) 1, (int) (short) 100);
        int int18 = grafo1.numVertices();
        ds.Grafo.Aresta aresta20 = grafo1.proxAdj((int) (byte) 0);
        boolean boolean23 = grafo1.existeAresta((int) '#', (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta25 = grafo1.primeiroListaAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        int int2 = grafo1.numVertices();
        java.lang.Class<?> wildcardClass3 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) ' ', (int) (byte) 1, (int) (byte) 100);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta16 = grafo1.retiraAresta((int) (byte) 10, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        int int2 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = grafo1.listaAdjVazia((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        java.lang.Class<?> wildcardClass3 = grafo2.getClass();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        int int13 = grafo1.numVertices();
        ds.Grafo grafo14 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta16 = grafo14.primeiroListaAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(grafo14);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo2.insereAresta(97, (int) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(97, (int) 'a', 100);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo1.imprime();
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = grafo2.listaAdjVazia((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta4 = grafo2.primeiroListaAdj((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) ' ', (int) (byte) 1, (int) (byte) 100);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = grafo13.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta16 = grafo14.proxAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        grafo1.insereAresta((int) (byte) 10, (int) (byte) 1, (int) (short) 100);
        int int18 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta20 = grafo1.proxAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        grafo1.imprime();
        boolean boolean15 = grafo1.listaAdjVazia((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta16 = grafo1.primeiroListaAdj(35);
        int int17 = aresta16.peso();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(aresta16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 0, (int) 'a');
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(35, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta4 = grafo2.primeiroListaAdj((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        int int2 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        ds.Grafo.Aresta aresta15 = grafo1.primeiroListaAdj((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta15);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj(0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo1.retiraAresta(100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Grafo grafo1 = new ds.Grafo(10);
        java.lang.Class<?> wildcardClass2 = grafo1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        grafo1.imprime();
        grafo1.insereAresta(10, 97, (int) ' ');
        java.lang.Class<?> wildcardClass19 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) ' ', (int) (byte) 1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta15 = grafo1.retiraAresta(0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo13.insereAresta((int) (byte) -1, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        grafo1.insereAresta((int) (byte) 10, (int) (byte) 1, (int) (short) 100);
        ds.Grafo grafo18 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta21 = grafo1.retiraAresta(97, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo18);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        boolean boolean6 = grafo4.listaAdjVazia(0);
        ds.Grafo grafo7 = grafo4.grafoTransposto();
        ds.Grafo.Aresta aresta9 = grafo7.primeiroListaAdj((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo7.retiraAresta((int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        int int2 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta4 = grafo1.proxAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta13 = grafo10.retiraAresta((-1), 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = grafo2.existeAresta((int) (short) -1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        grafo1.imprime();
        grafo1.insereAresta(10, 97, (int) ' ');
        int int19 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        grafo13.imprime();
        ds.Grafo.Aresta aresta17 = grafo13.retiraAresta(0, (int) (short) 10);
        grafo13.imprime();
        grafo13.insereAresta((int) (short) 1, 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 0, (int) ' ');
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        java.lang.Class<?> wildcardClass6 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, (int) (short) 100, 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta16 = grafo13.retiraAresta((-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        grafo13.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta16 = grafo13.primeiroListaAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 0, (int) 'a');
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        java.lang.Class<?> wildcardClass7 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 0, (int) 'a');
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        java.lang.Class<?> wildcardClass6 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        grafo1.insereAresta((int) (byte) 10, (int) (byte) 1, (int) (short) 100);
        boolean boolean19 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta21 = grafo1.primeiroListaAdj((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(aresta21);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        java.lang.Class<?> wildcardClass15 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj(35);
        org.junit.Assert.assertNull(aresta3);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        int int2 = grafo1.numVertices();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = grafo1.listaAdjVazia(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        boolean boolean17 = grafo1.existeAresta(0, 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        boolean boolean10 = grafo1.listaAdjVazia(0);
        boolean boolean13 = grafo1.existeAresta((int) (byte) 1, (int) '#');
        java.lang.Class<?> wildcardClass14 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        grafo13.imprime();
        ds.Grafo.Aresta aresta17 = grafo13.retiraAresta(0, (int) (short) 10);
        grafo13.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta21 = grafo13.retiraAresta((int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(97, (int) (byte) 100, (int) (short) 100);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        boolean boolean16 = grafo1.existeAresta(0, (int) (byte) 1);
        ds.Grafo grafo17 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta20 = grafo1.retiraAresta((int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(grafo17);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta4 = grafo1.proxAdj((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        grafo1.insereAresta((int) (byte) 10, (int) (byte) 1, (int) (short) 100);
        ds.Grafo grafo18 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta20 = grafo18.primeiroListaAdj((int) '#');
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertNull(aresta20);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        boolean boolean16 = grafo1.existeAresta(0, (int) (byte) 1);
        ds.Grafo grafo17 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta20 = grafo1.retiraAresta(10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(grafo17);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.Grafo grafo1 = new ds.Grafo(1);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        int int2 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) ' ', (int) (byte) 1, (int) (byte) 100);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = grafo13.grafoTransposto();
        boolean boolean17 = grafo14.existeAresta((int) (short) 10, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            grafo14.insereAresta((int) (short) -1, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = aresta14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.imprime();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo1 = new ds.Grafo((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (byte) 1, 1);
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(97, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        grafo13.imprime();
        ds.Grafo.Aresta aresta17 = grafo13.retiraAresta(0, (int) (short) 10);
        grafo13.imprime();
        boolean boolean21 = grafo13.existeAresta((int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        boolean boolean6 = grafo3.existeAresta(0, 10);
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo7);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        grafo1.insereAresta((int) (byte) 10, (int) (byte) 1, (int) (short) 100);
        ds.Grafo.Aresta aresta19 = grafo1.primeiroListaAdj((int) ' ');
        java.lang.Class<?> wildcardClass20 = grafo1.getClass();
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        grafo1.imprime();
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        grafo15.insereAresta(0, (int) (short) 1, 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo15);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int) '4');
        boolean boolean12 = grafo1.listaAdjVazia((int) (byte) 1);
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        boolean boolean6 = grafo3.existeAresta(0, 10);
        ds.Grafo.Aresta aresta8 = grafo3.proxAdj((int) (short) 0);
        ds.Grafo grafo9 = grafo3.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = grafo9.listaAdjVazia(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 0, (int) ' ');
        int int4 = aresta3.peso();
        java.lang.Class<?> wildcardClass5 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta17 = grafo1.retiraAresta(97, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        grafo1.imprime();
        boolean boolean16 = grafo1.existeAresta(10, 97);
        int int17 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) ' ', (int) (byte) 1, (int) (byte) 100);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        boolean boolean15 = grafo13.listaAdjVazia(10);
        boolean boolean18 = grafo13.existeAresta((int) (short) 1, (int) 'a');
        java.lang.Class<?> wildcardClass19 = grafo13.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        boolean boolean10 = grafo1.listaAdjVazia(0);
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo1.proxAdj((int) (short) 0);
        grafo1.insereAresta((int) (byte) 1, (int) (byte) 0, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        int int3 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        boolean boolean6 = grafo3.existeAresta(0, 10);
        ds.Grafo.Aresta aresta8 = grafo3.proxAdj((int) (short) 0);
        ds.Grafo grafo9 = grafo3.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = grafo3.existeAresta((-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 0, (int) ' ');
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) ' ', (int) (byte) 1, (int) (byte) 100);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        boolean boolean15 = grafo13.listaAdjVazia(10);
        boolean boolean18 = grafo13.existeAresta((int) (short) 1, (int) 'a');
        boolean boolean20 = grafo13.listaAdjVazia(10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (short) 0, (int) (byte) 10);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        java.lang.Class<?> wildcardClass2 = grafo1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        int int13 = grafo1.numVertices();
        ds.Grafo grafo14 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta17 = grafo14.retiraAresta((int) ' ', (int) (short) 100);
        ds.Grafo grafo18 = grafo14.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta20 = grafo14.primeiroListaAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(grafo18);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 1, (int) 'a', (int) '4');
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(32, (int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) (short) 10, (int) ' ', (int) (short) -1);
        grafo1.insereAresta((int) '4', (int) (short) 0, (int) (byte) 0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean4 = grafo1.listaAdjVazia(1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta6 = grafo1.proxAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) 'a', (int) (byte) 10);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 1);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 0);
        org.junit.Assert.assertNull(aresta3);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) ' ', (int) (byte) 1, (int) (byte) 100);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = grafo13.grafoTransposto();
        boolean boolean17 = grafo14.existeAresta((int) (short) 10, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta19 = grafo14.proxAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        grafo1.insereAresta((int) (byte) 10, (int) (byte) 1, (int) (short) 100);
        int int18 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta20 = grafo1.proxAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        grafo4.imprime();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) (short) 0, (int) (short) 1);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj(0);
        grafo1.insereAresta((int) '#', (-1), 1);
        java.lang.Class<?> wildcardClass10 = grafo1.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo10.insereAresta((int) (byte) -1, (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        grafo1.insereAresta((int) (byte) 10, (int) (byte) 1, (int) (short) 100);
        ds.Grafo.Aresta aresta20 = grafo1.retiraAresta((int) '#', (int) (byte) 10);
        int int21 = grafo1.numVertices();
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(32, 0, (-1));
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 1);
        int int2 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) ' ', (int) (byte) 1, (int) (byte) 100);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', 35, 1);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        int int4 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        grafo1.insereAresta((int) (byte) 10, (int) (byte) 1, (int) (short) 100);
        ds.Grafo.Aresta aresta19 = grafo1.primeiroListaAdj((int) ' ');
        boolean boolean22 = grafo1.existeAresta((int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        grafo1.imprime();
        grafo1.insereAresta((int) (short) 10, (int) ' ', (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) (short) 1, (int) (short) 10);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = grafo3.listaAdjVazia((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 1, (int) 'a', (int) '4');
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, (int) (short) 10, (int) (byte) 100);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta4 = grafo2.proxAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = grafo1.existeAresta((int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.Grafo grafo1 = new ds.Grafo(35);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 0, (int) 'a');
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        int int7 = aresta3.peso();
        int int8 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        ds.Grafo grafo16 = grafo1.grafoTransposto();
        ds.Grafo grafo17 = grafo1.grafoTransposto();
        java.lang.Class<?> wildcardClass18 = grafo17.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        grafo1.insereAresta(32, (int) (byte) -1, (int) 'a');
        boolean boolean20 = grafo1.listaAdjVazia((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta23 = grafo1.retiraAresta((int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        boolean boolean6 = grafo4.listaAdjVazia(0);
        ds.Grafo grafo7 = grafo4.grafoTransposto();
        ds.Grafo.Aresta aresta9 = grafo7.primeiroListaAdj((int) (byte) 1);
        boolean boolean11 = grafo7.listaAdjVazia((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            grafo7.insereAresta((int) (short) 100, (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) (byte) 100, 35);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo10.retiraAresta((int) ' ', 10);
        grafo10.imprime();
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, (int) (short) 1, (int) (short) 100);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', (int) (short) 100, (-1));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta16 = grafo1.proxAdj(97);
        int int17 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        ds.Grafo grafo16 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta18 = grafo16.primeiroListaAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(grafo16);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj(0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = grafo1.existeAresta((int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (int) (short) 10, (int) ' ');
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        grafo1.insereAresta(32, (int) (byte) -1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo19 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 100, 35);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        ds.Grafo.Aresta aresta15 = grafo1.primeiroListaAdj((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) 100, (int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta15);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        grafo1.imprime();
        boolean boolean16 = grafo1.existeAresta(32, 35);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo3.primeiroListaAdj((int) (short) 0);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        int int16 = grafo15.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta18 = grafo15.proxAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        boolean boolean6 = grafo4.listaAdjVazia(0);
        ds.Grafo grafo7 = grafo4.grafoTransposto();
        ds.Grafo.Aresta aresta9 = grafo7.primeiroListaAdj((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo7.retiraAresta((int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        grafo1.insereAresta((int) (byte) 10, (int) (byte) 1, (int) (short) 100);
        ds.Grafo grafo18 = grafo1.grafoTransposto();
        grafo1.imprime();
        org.junit.Assert.assertNotNull(grafo18);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) ' ', (int) (byte) 1, (int) (byte) 100);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        boolean boolean15 = grafo13.listaAdjVazia(10);
        boolean boolean17 = grafo13.listaAdjVazia((int) '4');
        boolean boolean20 = grafo13.existeAresta((int) '#', (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        grafo13.imprime();
        ds.Grafo.Aresta aresta17 = grafo13.retiraAresta(0, (int) (short) 10);
        grafo13.imprime();
        boolean boolean21 = grafo13.existeAresta((int) (byte) 1, 97);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta24 = grafo13.retiraAresta((int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, (int) (byte) 1, (int) (short) 10);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        ds.Grafo.Aresta aresta15 = grafo1.primeiroListaAdj((int) '4');
        grafo1.insereAresta(0, (int) 'a', (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta22 = grafo1.retiraAresta(100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta15);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        boolean boolean6 = grafo3.existeAresta(0, 10);
        ds.Grafo.Aresta aresta8 = grafo3.proxAdj((int) (short) 0);
        ds.Grafo grafo9 = grafo3.grafoTransposto();
        grafo9.imprime();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(32, (int) (byte) 0, (int) (byte) 10);
        ds.Grafo grafo14 = grafo1.grafoTransposto();
        boolean boolean16 = grafo14.listaAdjVazia((int) '4');
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta5 = grafo2.proxAdj(32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta15 = grafo1.retiraAresta((int) '#', (-1));
        ds.Grafo grafo16 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta18 = grafo1.proxAdj((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta21 = grafo1.retiraAresta((int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNull(aresta18);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, 0, (int) (byte) 10);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) 100, 32, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int) '4');
        boolean boolean12 = grafo1.listaAdjVazia((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta14 = grafo1.proxAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, 35, (int) (short) 0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, (int) '4', 0);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', (int) (short) 1, (int) (short) 1);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        grafo1.insereAresta((int) (byte) 10, (int) (byte) 1, (int) (short) 100);
        boolean boolean19 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta21 = grafo1.primeiroListaAdj((int) '#');
        java.lang.Class<?> wildcardClass22 = aresta21.getClass();
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(aresta21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.Grafo grafo1 = new ds.Grafo(100);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) -1, (int) 'a', 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        int int3 = grafo2.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = grafo2.existeAresta(0, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo4.insereAresta((int) (short) -1, (int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = grafo10.existeAresta(100, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = grafo1.existeAresta((int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo15.insereAresta((-1), 32, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta15 = grafo1.retiraAresta((int) '#', (-1));
        ds.Grafo grafo16 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta18 = grafo16.proxAdj(97);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNull(aresta18);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        boolean boolean6 = grafo1.existeAresta(35, (int) (short) -1);
        grafo1.imprime();
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int) 'a');
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, 0, (int) ' ');
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta15 = grafo1.retiraAresta((int) '#', (-1));
        ds.Grafo grafo16 = grafo1.grafoTransposto();
        int int17 = grafo16.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta20 = grafo16.retiraAresta((int) '#', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(1, (int) '#', 1);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, 0, (int) (byte) -1);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        ds.Grafo.Aresta aresta11 = grafo1.proxAdj((int) 'a');
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        grafo13.imprime();
        ds.Grafo.Aresta aresta17 = grafo13.retiraAresta(0, (int) (short) 10);
        ds.Grafo.Aresta aresta19 = grafo13.primeiroListaAdj((int) (short) 0);
        boolean boolean21 = grafo13.listaAdjVazia(97);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(aresta19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 1);
        int int2 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(10, (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        grafo1.insereAresta((int) (byte) 10, (int) (byte) 1, (int) (short) 100);
        boolean boolean19 = grafo1.listaAdjVazia((int) (short) 1);
        boolean boolean21 = grafo1.listaAdjVazia(32);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 10, 35, 32);
        ds.Grafo.Aresta aresta21 = grafo1.primeiroListaAdj(10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(aresta21);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(35, (int) (short) -1, (int) (short) 10);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        ds.Grafo.Aresta aresta15 = grafo1.primeiroListaAdj((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) -1, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta15);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) 'a', 0, 100);
        grafo1.imprime();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = grafo1.existeAresta((int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, (int) (byte) 0, (int) (byte) 1);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        java.lang.Class<?> wildcardClass10 = grafo1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        boolean boolean17 = grafo1.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta19 = grafo1.proxAdj(32);
        grafo1.insereAresta((int) (byte) 10, (int) (byte) 100, 32);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(aresta19);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) ' ', (int) (byte) 1, (int) (byte) 100);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        boolean boolean15 = grafo13.listaAdjVazia(10);
        boolean boolean17 = grafo13.listaAdjVazia((int) '4');
        java.lang.Class<?> wildcardClass18 = grafo13.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        grafo1.insereAresta((int) (byte) 10, (int) (byte) 1, (int) (short) 100);
        ds.Grafo grafo18 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta20 = grafo1.primeiroListaAdj((int) '4');
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertNull(aresta20);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj(0);
        boolean boolean7 = grafo1.listaAdjVazia(0);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 1);
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        grafo13.imprime();
        ds.Grafo.Aresta aresta17 = grafo13.retiraAresta(0, (int) (short) 10);
        grafo13.imprime();
        grafo13.insereAresta(0, (int) (byte) 100, 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(32, 0, (-1));
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        grafo1.imprime();
        ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj(10);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, 100);
        grafo1.imprime();
        org.junit.Assert.assertNull(aresta4);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj(0);
        grafo1.insereAresta((int) '#', (-1), 1);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj(10);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        java.lang.Class<?> wildcardClass4 = grafo2.getClass();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) ' ', (int) (byte) 1, (int) (byte) 100);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        boolean boolean15 = grafo13.listaAdjVazia(10);
        boolean boolean17 = grafo13.listaAdjVazia((int) '4');
        int int18 = grafo13.numVertices();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo3.retiraAresta((int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 0, (int) 'a');
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (byte) -1, (int) '#');
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        int int6 = aresta3.v1();
        int int7 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', 97, 10);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int) '4');
        boolean boolean12 = grafo1.listaAdjVazia((int) (byte) 1);
        boolean boolean14 = grafo1.listaAdjVazia((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) -1, (int) (short) 0, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta15 = grafo1.retiraAresta((int) '#', (-1));
        ds.Grafo.Aresta aresta17 = grafo1.proxAdj(97);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        boolean boolean16 = grafo1.existeAresta((int) (byte) 1, 1);
        boolean boolean19 = grafo1.existeAresta((int) 'a', 100);
        ds.Grafo.Aresta aresta21 = grafo1.primeiroListaAdj((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta23 = grafo1.primeiroListaAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(aresta21);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 0, (int) 'a');
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        int int7 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        int int3 = grafo2.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta5 = grafo2.primeiroListaAdj((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta15 = grafo1.retiraAresta((int) '#', (-1));
        int int16 = grafo1.numVertices();
        ds.Grafo.Aresta aresta18 = grafo1.primeiroListaAdj(0);
        ds.Grafo.Aresta aresta20 = grafo1.primeiroListaAdj(97);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNull(aresta20);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(32, (int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) (short) 10, (int) ' ', (int) (short) -1);
        ds.Grafo.Aresta aresta20 = grafo1.retiraAresta((int) (short) 10, 32);
        ds.Grafo.Aresta aresta22 = grafo1.primeiroListaAdj(0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta25 = grafo1.retiraAresta(10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertNull(aresta22);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(32, (int) (byte) 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta16 = grafo1.retiraAresta((int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        java.lang.Class<?> wildcardClass5 = grafo1.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean6 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        grafo1.imprime();
        java.lang.Class<?> wildcardClass9 = grafo1.getClass();
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) (byte) 1, 0);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        grafo1.imprime();
        grafo1.insereAresta(10, 97, (int) ' ');
        grafo1.imprime();
        boolean boolean21 = grafo1.listaAdjVazia(10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = grafo1.existeAresta((int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta16 = grafo1.retiraAresta((-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        boolean boolean6 = grafo1.existeAresta(35, (int) (short) -1);
        int int7 = grafo1.numVertices();
        int int8 = grafo1.numVertices();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 0, (int) 'a');
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, (int) (byte) 0, (int) (byte) 1);
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean6 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        grafo1.insereAresta(32, 1, 0);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 10, 35, 32);
        ds.Grafo grafo20 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(grafo20);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        grafo1.insereAresta((int) (byte) 10, (int) (byte) 1, (int) (short) 100);
        int int18 = grafo1.numVertices();
        grafo1.insereAresta(0, (int) (byte) 100, 32);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo23 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) ' ', (int) (byte) 1, (int) (byte) 100);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        boolean boolean15 = grafo1.listaAdjVazia((int) 'a');
        boolean boolean18 = grafo1.existeAresta(10, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        int int5 = grafo3.numVertices();
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta6 = grafo3.retiraAresta(0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        grafo1.imprime();
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        grafo15.imprime();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo15);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        boolean boolean6 = grafo4.listaAdjVazia(0);
        ds.Grafo grafo7 = grafo4.grafoTransposto();
        int int8 = grafo7.numVertices();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (short) 0, (int) (byte) 10);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta6 = grafo2.retiraAresta((int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        grafo13.imprime();
        boolean boolean17 = grafo13.existeAresta(32, 10);
        boolean boolean19 = grafo13.listaAdjVazia((int) (byte) 0);
        grafo13.insereAresta((int) '#', 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, (int) (byte) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 0, (int) 'a');
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.Grafo grafo1 = new ds.Grafo(100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 1);
        int int4 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', 97, 10);
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(1, (int) 'a', 35);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(32, (int) (byte) 0, (int) 'a');
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        boolean boolean6 = grafo3.existeAresta(0, 10);
        ds.Grafo.Aresta aresta8 = grafo3.proxAdj((int) (short) 0);
        grafo3.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta11 = grafo3.proxAdj((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) ' ', (int) (byte) 1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta15 = grafo1.retiraAresta(0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = grafo2.existeAresta((int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo2.imprime();
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 1);
        int int2 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((-1), (int) (short) 1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, (int) ' ', (int) (short) 1);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(1, (-1), 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.Grafo grafo1 = new ds.Grafo(10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = grafo1.listaAdjVazia(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        boolean boolean6 = grafo4.listaAdjVazia(0);
        ds.Grafo grafo7 = grafo4.grafoTransposto();
        ds.Grafo.Aresta aresta9 = grafo7.primeiroListaAdj((int) (byte) 1);
        boolean boolean11 = grafo7.listaAdjVazia((int) ' ');
        grafo7.imprime();
        // The following exception was thrown during execution in test generation
        try {
            grafo7.insereAresta((int) (byte) -1, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(32, (int) (byte) 0, (int) (byte) 10);
        ds.Grafo.Aresta aresta15 = grafo1.primeiroListaAdj(10);
        org.junit.Assert.assertNull(aresta15);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) ' ', (int) (byte) 1, (int) (byte) 100);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = grafo13.grafoTransposto();
        boolean boolean17 = grafo14.existeAresta((int) (short) 10, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = grafo14.listaAdjVazia(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 0, (int) 'a');
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        ds.Grafo grafo5 = grafo3.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = grafo1.listaAdjVazia(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        grafo13.imprime();
        ds.Grafo.Aresta aresta17 = grafo13.retiraAresta(0, (int) (short) 10);
        ds.Grafo.Aresta aresta19 = grafo13.primeiroListaAdj((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta22 = grafo13.retiraAresta(10, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(aresta19);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        boolean boolean6 = grafo3.existeAresta(0, 10);
        ds.Grafo.Aresta aresta8 = grafo3.proxAdj((int) (short) 0);
        grafo3.imprime();
        int int10 = grafo3.numVertices();
        boolean boolean12 = grafo3.listaAdjVazia((int) (byte) 1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        boolean boolean16 = grafo1.existeAresta((int) (byte) 0, (-1));
        grafo1.insereAresta((int) (byte) 1, 35, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        grafo1.imprime();
        grafo1.insereAresta(10, 97, (int) ' ');
        grafo1.imprime();
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta4 = grafo1.proxAdj(32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        int int5 = grafo4.numVertices();
        int int6 = grafo4.numVertices();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) (short) 1, (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        boolean boolean17 = grafo1.listaAdjVazia((int) (byte) 10);
        grafo1.insereAresta((int) 'a', (-1), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, 0, 0);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        grafo1.imprime();
        ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj(10);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, 100);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) -1, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(32, (int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) (short) 10, (int) ' ', (int) (short) -1);
        ds.Grafo.Aresta aresta20 = grafo1.retiraAresta((int) (short) 10, 32);
        int int21 = aresta20.v1();
        int int22 = aresta20.v1();
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) ' ', (int) (byte) 1, (int) (byte) 100);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = grafo13.grafoTransposto();
        grafo13.insereAresta(97, 97, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta5 = grafo1.proxAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        grafo1.insereAresta((int) (byte) 10, (int) (byte) 1, (int) (short) 100);
        ds.Grafo.Aresta aresta20 = grafo1.retiraAresta((int) '#', (int) (byte) 10);
        grafo1.imprime();
        org.junit.Assert.assertNull(aresta20);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int) '4');
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) ' ', (int) (byte) 1, (int) (byte) 100);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        java.lang.Class<?> wildcardClass14 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.Grafo grafo1 = new ds.Grafo(100);
        boolean boolean3 = grafo1.listaAdjVazia(0);
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj(97);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(aresta5);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        grafo1.insereAresta((int) (byte) 10, (int) (byte) 1, (int) (short) 100);
        int int18 = grafo1.numVertices();
        ds.Grafo.Aresta aresta20 = grafo1.proxAdj((int) (byte) 0);
        boolean boolean22 = grafo1.listaAdjVazia(10);
        ds.Grafo grafo23 = grafo1.grafoTransposto();
        boolean boolean26 = grafo1.existeAresta((int) (short) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', 35, 32);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, 100, (int) (short) -1);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(32, (int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) (short) 10, (int) ' ', (int) (short) -1);
        ds.Grafo.Aresta aresta19 = grafo1.proxAdj((int) (short) 0);
        int int20 = grafo1.numVertices();
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        grafo13.imprime();
        ds.Grafo.Aresta aresta17 = grafo13.retiraAresta(0, (int) (short) 10);
        ds.Grafo.Aresta aresta19 = grafo13.primeiroListaAdj((int) (short) 0);
        java.lang.Class<?> wildcardClass20 = aresta19.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(aresta19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (short) 100, (-1));
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', (int) (byte) 100, (-1));
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(1, (-1), 1);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = grafo1.listaAdjVazia((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.Grafo grafo1 = new ds.Grafo(97);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = grafo1.listaAdjVazia((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        boolean boolean10 = grafo1.listaAdjVazia(0);
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta14 = grafo11.retiraAresta(97, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        boolean boolean6 = grafo1.existeAresta(35, (int) (short) -1);
        ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((int) (byte) 0);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        boolean boolean6 = grafo1.existeAresta(35, (int) (short) -1);
        ds.Grafo.Aresta aresta8 = grafo1.proxAdj(0);
        grafo1.imprime();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        boolean boolean16 = grafo1.existeAresta(0, (int) (byte) 1);
        ds.Grafo grafo17 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta19 = grafo17.proxAdj((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta22 = grafo17.retiraAresta(97, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNull(aresta19);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (byte) -1, (int) '#');
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta18 = grafo15.retiraAresta((int) 'a', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        grafo1.insereAresta((int) (byte) 10, (int) (byte) 1, (int) (short) 100);
        int int18 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean22 = grafo1.existeAresta((int) '#', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', (-1), 1);
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (byte) 100, 1);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, (-1), (int) (short) -1);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        boolean boolean18 = grafo1.existeAresta(0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta20 = grafo1.primeiroListaAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 0, (int) 'a');
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        int int7 = aresta3.v2();
        int int8 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        int int4 = grafo2.numVertices();
        grafo2.imprime();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        int int3 = grafo2.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            grafo2.insereAresta((int) (byte) 1, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        boolean boolean6 = grafo4.listaAdjVazia(0);
        ds.Grafo grafo7 = grafo4.grafoTransposto();
        boolean boolean10 = grafo7.existeAresta((int) '#', (int) (short) 0);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int) '4');
        boolean boolean12 = grafo1.listaAdjVazia((int) (byte) 1);
        boolean boolean14 = grafo1.listaAdjVazia((int) '#');
        grafo1.insereAresta((int) (short) 1, 100, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.Grafo grafo1 = new ds.Grafo(0);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(97, 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        ds.Grafo grafo1 = new ds.Grafo(100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 1);
        int int4 = grafo1.numVertices();
        boolean boolean7 = grafo1.existeAresta((int) (byte) 10, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = grafo1.listaAdjVazia((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 0, (int) 'a');
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', 35, 32);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        int int9 = grafo1.numVertices();
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(1, (-1), 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta15 = grafo1.retiraAresta((int) '#', (-1));
        int int16 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta19 = grafo1.retiraAresta(100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        grafo13.imprime();
        boolean boolean17 = grafo13.existeAresta(32, 10);
        ds.Grafo.Aresta aresta19 = grafo13.primeiroListaAdj((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(aresta19);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', 35, 1);
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta5 = grafo2.primeiroListaAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta5 = grafo1.proxAdj(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        int int4 = grafo1.numVertices();
        boolean boolean7 = grafo1.existeAresta(32, 35);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        int int13 = grafo1.numVertices();
        ds.Grafo grafo14 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta17 = grafo14.retiraAresta((int) ' ', (int) (short) 100);
        ds.Grafo grafo18 = grafo14.grafoTransposto();
        boolean boolean21 = grafo14.existeAresta((int) (byte) 1, (int) (short) 1);
        grafo14.insereAresta((int) ' ', (int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        boolean boolean6 = grafo3.existeAresta(0, 10);
        ds.Grafo.Aresta aresta8 = grafo3.proxAdj((int) (short) 0);
        grafo3.imprime();
        ds.Grafo grafo10 = grafo3.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        int int16 = grafo15.numVertices();
        ds.Grafo.Aresta aresta18 = grafo15.primeiroListaAdj((int) '#');
        boolean boolean21 = grafo15.existeAresta(1, (int) (byte) 100);
        boolean boolean23 = grafo15.listaAdjVazia((int) '#');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        boolean boolean6 = grafo4.listaAdjVazia(0);
        ds.Grafo grafo7 = grafo4.grafoTransposto();
        ds.Grafo.Aresta aresta9 = grafo7.primeiroListaAdj((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            grafo7.insereAresta((int) (short) 100, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test345");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test346");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        grafo1.imprime();
        ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj(10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test347");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        grafo1.insereAresta((int) (byte) 10, (int) (byte) 1, (int) (short) 100);
        int int18 = grafo1.numVertices();
        ds.Grafo.Aresta aresta20 = grafo1.proxAdj((int) (byte) 0);
        boolean boolean22 = grafo1.listaAdjVazia(10);
        ds.Grafo.Aresta aresta24 = grafo1.proxAdj((int) (short) 10);
        int int25 = aresta24.v2();
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(aresta24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test348");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test349");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        grafo13.imprime();
        ds.Grafo.Aresta aresta17 = grafo13.retiraAresta(0, (int) (short) 10);
        ds.Grafo.Aresta aresta19 = grafo13.primeiroListaAdj((int) (short) 0);
        int int20 = aresta19.v2();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(aresta19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test350");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        grafo10.insereAresta((int) 'a', 10, (int) 'a');
        java.lang.Class<?> wildcardClass15 = grafo10.getClass();
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test351");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (short) 10, (int) '4');
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test352");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        int int4 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test353");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        boolean boolean6 = grafo3.existeAresta(0, 10);
        ds.Grafo.Aresta aresta8 = grafo3.proxAdj((int) (short) 0);
        grafo3.imprime();
        int int10 = grafo3.numVertices();
        int int11 = grafo3.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta13 = grafo3.proxAdj((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test354");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        grafo1.imprime();
        boolean boolean16 = grafo1.existeAresta(10, 97);
        java.lang.Class<?> wildcardClass17 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test355");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        int int13 = grafo1.numVertices();
        ds.Grafo grafo14 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta17 = grafo14.retiraAresta((int) ' ', (int) (short) 100);
        grafo14.insereAresta(0, (int) 'a', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test356");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 0, (int) 'a');
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        int int7 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test357");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (-1), (int) (short) 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test358");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', 35, 1);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test359");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        grafo1.imprime();
        boolean boolean16 = grafo1.existeAresta(10, 97);
        grafo1.imprime();
        ds.Grafo grafo18 = grafo1.grafoTransposto();
        ds.Grafo grafo19 = grafo18.grafoTransposto();
        grafo18.imprime();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertNotNull(grafo19);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test360");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        boolean boolean10 = grafo1.listaAdjVazia(0);
        boolean boolean13 = grafo1.existeAresta((int) (byte) 1, (int) '#');
        int int14 = grafo1.numVertices();
        ds.Grafo.Aresta aresta16 = grafo1.primeiroListaAdj(97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test361");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (int) (short) 100, 32);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test362");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) (short) 1, (int) (short) 10);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test363");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(32, (int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) (short) 10, (int) ' ', (int) (short) -1);
        ds.Grafo.Aresta aresta20 = grafo1.retiraAresta((int) (short) 10, 32);
        ds.Grafo.Aresta aresta22 = grafo1.primeiroListaAdj(0);
        ds.Grafo.Aresta aresta24 = grafo1.proxAdj(32);
        grafo1.insereAresta((int) 'a', (int) (byte) -1, (int) '#');
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertNotNull(aresta24);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test364");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        grafo1.insereAresta((int) (byte) 10, (int) (byte) 1, (int) (short) 100);
        boolean boolean19 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta21 = grafo1.primeiroListaAdj((int) '#');
        ds.Grafo grafo22 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(aresta21);
        org.junit.Assert.assertNotNull(grafo22);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test365");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 0, (int) 'a');
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        int int7 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test366");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        grafo1.insereAresta((int) (byte) 10, (int) (byte) 1, (int) (short) 100);
        ds.Grafo grafo18 = grafo1.grafoTransposto();
        grafo18.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta21 = grafo18.primeiroListaAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo18);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test367");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        boolean boolean12 = grafo1.listaAdjVazia((int) ' ');
        int int13 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test368");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (int) (byte) -1, (int) (byte) 0);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test369");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        grafo1.insereAresta((int) (byte) 1, (int) (byte) -1, (int) (byte) 100);
        boolean boolean21 = grafo1.existeAresta((int) (short) 10, 10);
        java.lang.Class<?> wildcardClass22 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test370");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        grafo1.insereAresta((int) (byte) 10, (int) (byte) 1, (int) (short) 100);
        int int18 = grafo1.numVertices();
        ds.Grafo.Aresta aresta20 = grafo1.proxAdj((int) (byte) 0);
        boolean boolean22 = grafo1.listaAdjVazia(10);
        ds.Grafo.Aresta aresta24 = grafo1.proxAdj((int) (short) 10);
        int int25 = aresta24.v1();
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(aresta24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test371");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        grafo13.imprime();
        ds.Grafo.Aresta aresta17 = grafo13.retiraAresta(0, (int) (short) 10);
        ds.Grafo.Aresta aresta19 = grafo13.primeiroListaAdj((int) (short) 0);
        int int20 = aresta19.v1();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(aresta19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test372");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        grafo1.imprime();
        ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj(10);
        int int5 = grafo1.numVertices();
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(100, (int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test373");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta15 = grafo1.retiraAresta((int) '#', (-1));
        ds.Grafo.Aresta aresta17 = grafo1.primeiroListaAdj(1);
        boolean boolean19 = grafo1.listaAdjVazia((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test374");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) ' ', (int) (byte) 1, (int) (byte) 100);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        boolean boolean15 = grafo13.listaAdjVazia(10);
        boolean boolean18 = grafo13.existeAresta((int) (short) 1, (int) 'a');
        ds.Grafo.Aresta aresta20 = grafo13.proxAdj((int) (byte) 10);
        grafo13.imprime();
        java.lang.Class<?> wildcardClass22 = grafo13.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test375");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        boolean boolean6 = grafo3.existeAresta(0, 10);
        ds.Grafo.Aresta aresta8 = grafo3.proxAdj((int) (short) 0);
        grafo3.imprime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = grafo3.existeAresta((int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test376");
        ds.Grafo grafo1 = new ds.Grafo(10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test377");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) ' ', (int) (byte) 1, (int) (byte) 100);
        boolean boolean15 = grafo1.existeAresta(35, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test378");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        int int3 = grafo2.numVertices();
        int int4 = grafo2.numVertices();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test379");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        grafo1.imprime();
        ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj(10);
        int int5 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.insereAresta((int) (byte) 1, 35, (int) (short) -1);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test380");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta15 = grafo1.retiraAresta((int) '#', (-1));
        int int16 = grafo1.numVertices();
        ds.Grafo.Aresta aresta18 = grafo1.primeiroListaAdj(35);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(aresta18);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test381");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(35, (int) (short) 0, (int) (byte) 1);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test382");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        grafo1.insereAresta((int) (byte) 10, (int) (byte) 1, (int) (short) 100);
        int int18 = grafo1.numVertices();
        ds.Grafo.Aresta aresta20 = grafo1.proxAdj((int) (byte) 0);
        grafo1.insereAresta((int) (short) 1, (int) (short) 1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta26 = grafo1.primeiroListaAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNull(aresta20);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test383");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', 32, 97);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test384");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(32, (int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) (short) 10, (int) ' ', (int) (short) -1);
        ds.Grafo.Aresta aresta20 = grafo1.retiraAresta((int) (short) 10, 32);
        ds.Grafo.Aresta aresta22 = grafo1.proxAdj((int) '#');
        int int23 = aresta22.peso();
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertNotNull(aresta22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test385");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', 1, 100);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test386");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        boolean boolean16 = grafo1.existeAresta((int) (byte) 1, 1);
        boolean boolean19 = grafo1.existeAresta((int) 'a', 100);
        ds.Grafo grafo20 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(grafo20);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test387");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(32, (int) (byte) 0, (int) (byte) 10);
        ds.Grafo grafo14 = grafo1.grafoTransposto();
        boolean boolean17 = grafo1.existeAresta(1, 0);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test388");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta15 = grafo1.retiraAresta((int) '#', (-1));
        int int16 = grafo1.numVertices();
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta20 = grafo1.retiraAresta((int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test389");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (byte) -1, (int) '#');
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test390");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        boolean boolean6 = grafo4.listaAdjVazia(0);
        ds.Grafo grafo7 = grafo4.grafoTransposto();
        ds.Grafo.Aresta aresta9 = grafo7.primeiroListaAdj((int) (byte) 1);
        boolean boolean11 = grafo7.listaAdjVazia((int) ' ');
        ds.Grafo.Aresta aresta13 = grafo7.primeiroListaAdj(0);
        ds.Grafo.Aresta aresta15 = grafo7.proxAdj((int) '4');
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNull(aresta15);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test391");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        boolean boolean10 = grafo1.listaAdjVazia(0);
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo1.proxAdj((int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo1.primeiroListaAdj(32);
        ds.Grafo.Aresta aresta17 = grafo1.primeiroListaAdj((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta20 = grafo1.retiraAresta((int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNotNull(aresta17);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test392");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        int int2 = grafo1.numVertices();
        boolean boolean5 = grafo1.existeAresta((int) (byte) 0, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test393");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        grafo3.imprime();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test394");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        grafo10.insereAresta((int) 'a', 10, (int) 'a');
        ds.Grafo.Aresta aresta17 = grafo10.retiraAresta((int) (short) 0, 0);
        ds.Grafo grafo18 = grafo10.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(grafo18);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test395");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        int int13 = grafo1.numVertices();
        ds.Grafo grafo14 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta17 = grafo14.retiraAresta((int) ' ', (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = grafo14.listaAdjVazia((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test396");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean4 = grafo1.listaAdjVazia(1);
        int int5 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test397");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj(0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) '4', 97);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test398");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta4 = grafo2.primeiroListaAdj(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test399");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta16 = grafo1.proxAdj(97);
        ds.Grafo.Aresta aresta18 = grafo1.proxAdj(35);
        int int19 = aresta18.v1();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test400");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 10, 35, (int) 'a');
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test401");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 0, (int) ' ');
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test402");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }
}

