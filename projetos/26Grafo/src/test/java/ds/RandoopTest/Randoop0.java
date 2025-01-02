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
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (byte) -1, (int) (byte) 100);
        int int4 = aresta3.v2();
        java.lang.Class<?> wildcardClass5 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo1 = new ds.Grafo((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo15 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 100);
        int int7 = grafo6.numVertices();
        grafo6.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray18 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo6.cab = intArray18;
        int[] intArray23 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo6.prox = intArray23;
        grafo1.prox = intArray23;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo26 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[32, 0, -1]");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        int[] intArray18 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo1.prox = intArray18;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = grafo1.existeAresta((-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 0, -1]");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta(0, 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 100);
        boolean boolean6 = grafo4.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo7 = grafo4.grafoTransposto();
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 100);
        int int10 = grafo9.numVertices();
        grafo9.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray21 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo9.cab = intArray21;
        int[] intArray26 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo9.prox = intArray26;
        grafo4.prox = intArray26;
        grafo1.peso = intArray26;
        java.lang.Class<?> wildcardClass30 = intArray26.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray12 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo1.cab = intArray12;
        java.lang.Class<?> wildcardClass14 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        java.lang.Class<?> wildcardClass2 = grafo1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray12 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo1.cab = intArray12;
        java.lang.Class<?> wildcardClass14 = intArray12.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.insereAresta(0, 0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = grafo1.existeAresta((-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        grafo1.imprime();
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 100);
        int int15 = grafo14.numVertices();
        grafo14.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray25 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo14.cab = intArray25;
        grafo1.prox = intArray25;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo28 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[35, 10, 100, 97, 1]");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, 1, (int) (short) 10);
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.Grafo grafo1 = new ds.Grafo(52);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        int[] intArray12 = grafo1.peso;
        boolean boolean14 = grafo1.listaAdjVazia((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 100);
        int int17 = grafo16.numVertices();
        grafo16.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray28 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo16.cab = intArray28;
        int[] intArray33 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo16.prox = intArray33;
        int[] intArray37 = new int[] { (byte) 0, (byte) 1 };
        grafo16.prox = intArray37;
        grafo1.peso = intArray37;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) 0, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[0, 1]");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        ds.Grafo.Aresta aresta4 = grafo1.proxAdj((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNull(aresta4);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (byte) -1, (int) (byte) 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        java.lang.Class<?> wildcardClass7 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int) (short) 1);
        org.junit.Assert.assertNull(aresta3);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 100);
        int int7 = grafo6.numVertices();
        grafo6.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray18 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo6.cab = intArray18;
        int[] intArray23 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo6.prox = intArray23;
        grafo1.prox = intArray23;
        int int26 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[32, 0, -1]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 100);
        int int17 = grafo16.numVertices();
        grafo16.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray28 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo16.cab = intArray28;
        int[] intArray33 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo16.prox = intArray33;
        int[] intArray37 = new int[] { (byte) 0, (byte) 1 };
        grafo16.prox = intArray37;
        grafo1.peso = intArray37;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo40 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[0, 1]");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        grafo1.imprime();
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 100);
        int int15 = grafo14.numVertices();
        grafo14.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray25 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo14.cab = intArray25;
        grafo1.prox = intArray25;
        int int28 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta31 = grafo1.retiraAresta((int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int int4 = grafo1.numVertices();
        ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj(52);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta6);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        grafo12.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray12 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo1.cab = intArray12;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35, 10, 100, 97, 1]");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = grafo1.listaAdjVazia((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        boolean boolean14 = grafo1.listaAdjVazia((int) (short) 0);
        boolean boolean16 = grafo1.listaAdjVazia(52);
        ds.Grafo.Aresta aresta19 = grafo1.retiraAresta((int) (byte) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(aresta19);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        ds.Grafo.Aresta aresta9 = grafo1.retiraAresta((int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 100);
        boolean boolean18 = grafo16.listaAdjVazia((int) (short) 10);
        int int19 = grafo16.numVertices();
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 100);
        int int22 = grafo21.numVertices();
        grafo21.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray33 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo21.cab = intArray33;
        int[] intArray35 = grafo21.cab;
        grafo16.cab = intArray35;
        grafo1.cab = intArray35;
        boolean boolean39 = grafo1.listaAdjVazia(52);
        boolean boolean41 = grafo1.listaAdjVazia((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        int[] intArray12 = grafo1.peso;
        int int13 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta16 = grafo1.retiraAresta((int) (byte) -1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 100);
        int int5 = grafo4.numVertices();
        grafo4.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray16 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo4.cab = intArray16;
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 100);
        int int20 = grafo19.numVertices();
        grafo19.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray31 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo19.cab = intArray31;
        int[] intArray36 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo19.prox = intArray36;
        int[] intArray40 = new int[] { (byte) 0, (byte) 1 };
        grafo19.prox = intArray40;
        grafo4.peso = intArray40;
        int int43 = grafo4.numVertices();
        ds.Grafo grafo45 = new ds.Grafo((int) (byte) 100);
        boolean boolean47 = grafo45.listaAdjVazia((int) (short) 10);
        int[] intArray54 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo45.peso = intArray54;
        grafo4.cab = intArray54;
        grafo1.peso = intArray54;
        boolean boolean60 = grafo1.existeAresta((int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (short) -1, (int) '4');
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        int int7 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int int4 = grafo1.numVertices();
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 100);
        int int7 = grafo6.numVertices();
        grafo6.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray18 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo6.cab = intArray18;
        int[] intArray20 = grafo6.cab;
        grafo1.cab = intArray20;
        boolean boolean23 = grafo1.listaAdjVazia((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) -1, (int) (short) 10, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 100);
        int int4 = grafo3.numVertices();
        grafo3.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray15 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo3.cab = intArray15;
        int[] intArray17 = grafo3.cab;
        grafo1.peso = intArray17;
        ds.Grafo grafo19 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(grafo19);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', (int) '4', (int) (byte) -1);
        int int4 = aresta3.v2();
        java.lang.Class<?> wildcardClass5 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int int4 = grafo1.numVertices();
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 100);
        int int7 = grafo6.numVertices();
        grafo6.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray18 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo6.cab = intArray18;
        int[] intArray20 = grafo6.cab;
        grafo1.cab = intArray20;
        int[] intArray22 = grafo1.cab;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (byte) -1, (int) (byte) 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        int int7 = aresta3.peso();
        int int8 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 100);
        int int7 = grafo6.numVertices();
        grafo6.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray18 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo6.cab = intArray18;
        int[] intArray23 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo6.prox = intArray23;
        grafo1.prox = intArray23;
        int[] intArray26 = grafo1.prox;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = grafo1.existeAresta((int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[32, 0, -1]");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo5 = new ds.Grafo((int) (byte) 100);
        boolean boolean7 = grafo5.listaAdjVazia((int) (short) 10);
        int[] intArray14 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo5.peso = intArray14;
        grafo5.imprime();
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 100);
        int int19 = grafo18.numVertices();
        grafo18.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray29 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo18.cab = intArray29;
        grafo5.prox = intArray29;
        grafo1.prox = intArray29;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = grafo1.listaAdjVazia((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[35, 10, 100, 97, 1]");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        java.lang.Class<?> wildcardClass2 = grafo1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.Grafo grafo1 = new ds.Grafo(52);
        boolean boolean4 = grafo1.existeAresta(100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray12 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo1.cab = intArray12;
        ds.Grafo.Aresta aresta15 = grafo1.proxAdj((int) ' ');
        ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((int) (byte) 100, (int) (short) 100);
        ds.Grafo.Aresta aresta21 = grafo1.retiraAresta(100, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNull(aresta21);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 100);
        boolean boolean6 = grafo4.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo7 = grafo4.grafoTransposto();
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 100);
        int int10 = grafo9.numVertices();
        grafo9.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray21 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo9.cab = intArray21;
        int[] intArray26 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo9.prox = intArray26;
        grafo4.prox = intArray26;
        grafo1.peso = intArray26;
        int[] intArray30 = grafo1.peso;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[32, 0, -1]");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (byte) -1, (int) (byte) 100);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        ds.Grafo.Aresta aresta9 = grafo1.retiraAresta((int) ' ', 0);
        int int10 = aresta9.v1();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(aresta9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, 1, (int) (short) 10);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (byte) -1, (int) (byte) 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.v1();
        int int7 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        java.lang.Class<?> wildcardClass15 = intArray13.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        int[] intArray12 = grafo1.peso;
        boolean boolean15 = grafo1.existeAresta(52, (int) (byte) 0);
        boolean boolean17 = grafo1.listaAdjVazia(1);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(97, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int int4 = grafo1.numVertices();
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 100);
        int int7 = grafo6.numVertices();
        grafo6.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray18 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo6.cab = intArray18;
        int[] intArray20 = grafo6.cab;
        grafo1.cab = intArray20;
        boolean boolean23 = grafo1.listaAdjVazia(1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        int[] intArray12 = grafo1.peso;
        int int13 = grafo1.numVertices();
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) '4', (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (-1), 0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        grafo1.imprime();
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 100);
        int int15 = grafo14.numVertices();
        grafo14.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray25 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo14.cab = intArray25;
        grafo1.prox = intArray25;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta29 = grafo1.proxAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[35, 10, 100, 97, 1]");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.Grafo grafo1 = new ds.Grafo(52);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo2.retiraAresta((int) 'a', (int) (short) 10);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta5);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        int[] intArray15 = grafo1.cab;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta17 = grafo1.primeiroListaAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        ds.Grafo.Aresta aresta9 = grafo1.retiraAresta((int) ' ', 0);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) -1, 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(aresta9);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 100);
        int int7 = grafo6.numVertices();
        grafo6.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray18 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo6.cab = intArray18;
        int[] intArray23 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo6.prox = intArray23;
        ds.Grafo grafo26 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo28 = new ds.Grafo((int) (byte) 100);
        int int29 = grafo28.numVertices();
        grafo28.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray40 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo28.cab = intArray40;
        int[] intArray45 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo28.prox = intArray45;
        grafo26.peso = intArray45;
        grafo6.prox = intArray45;
        grafo4.prox = intArray45;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta52 = grafo4.retiraAresta((int) (byte) 100, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[32, 0, -1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[32, 0, -1]");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) ' ', (int) ' ');
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        grafo1.insereAresta((int) '#', (int) '4', (int) (short) 100);
        grafo1.insereAresta((int) '#', 100, (int) (short) -1);
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 100);
        int int17 = grafo16.numVertices();
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 100);
        boolean boolean21 = grafo19.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo22 = grafo19.grafoTransposto();
        ds.Grafo grafo24 = new ds.Grafo((int) (byte) 100);
        int int25 = grafo24.numVertices();
        grafo24.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray36 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo24.cab = intArray36;
        int[] intArray41 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo24.prox = intArray41;
        grafo19.prox = intArray41;
        grafo16.peso = intArray41;
        grafo1.cab = intArray41;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(grafo22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[32, 0, -1]");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (byte) -1, (int) (byte) 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray12 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo1.cab = intArray12;
        ds.Grafo.Aresta aresta15 = grafo1.proxAdj((int) ' ');
        ds.Grafo.Aresta aresta18 = grafo1.retiraAresta(32, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNull(aresta18);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) 'a');
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 100);
        int int19 = grafo18.numVertices();
        grafo18.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray30 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo18.cab = intArray30;
        int[] intArray32 = grafo18.cab;
        grafo16.peso = intArray32;
        grafo1.cab = intArray32;
        boolean boolean36 = grafo1.listaAdjVazia((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = grafo1.existeAresta((int) (byte) -1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        int[] intArray15 = grafo1.cab;
        ds.Grafo.Aresta aresta17 = grafo1.proxAdj((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) 100, (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo1 = new ds.Grafo((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (byte) -1, (int) (byte) 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.v1();
        int int7 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        int[] intArray18 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo1.prox = intArray18;
        int[] intArray22 = new int[] { (byte) 0, (byte) 1 };
        grafo1.prox = intArray22;
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 100);
        boolean boolean27 = grafo25.listaAdjVazia((int) (short) 10);
        int[] intArray34 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo25.peso = intArray34;
        grafo1.cab = intArray34;
        java.lang.Class<?> wildcardClass37 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 1]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        ds.Grafo.Aresta aresta9 = grafo1.retiraAresta((int) ' ', 0);
        int int10 = aresta9.v2();
        java.lang.Class<?> wildcardClass11 = aresta9.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(aresta9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, (int) '4', 100);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) '#', 52);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray12 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo1.cab = intArray12;
        ds.Grafo.Aresta aresta15 = grafo1.proxAdj((int) ' ');
        ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((int) (byte) 100, (int) (short) 100);
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 100);
        int int21 = grafo20.numVertices();
        grafo20.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray32 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo20.cab = intArray32;
        grafo1.cab = intArray32;
        int[] intArray35 = null;
        grafo1.cab = intArray35;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo37 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.insereAresta(0, 0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo1.proxAdj(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        int int4 = grafo1.numVertices();
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(52, 52);
        ds.Grafo.Aresta aresta9 = grafo1.proxAdj((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int int4 = grafo1.numVertices();
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 100);
        int int7 = grafo6.numVertices();
        grafo6.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray18 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo6.cab = intArray18;
        int[] intArray20 = grafo6.cab;
        grafo1.cab = intArray20;
        boolean boolean23 = grafo1.listaAdjVazia((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = grafo1.listaAdjVazia((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        boolean boolean5 = grafo1.listaAdjVazia((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        int[] intArray18 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo1.prox = intArray18;
        int[] intArray22 = new int[] { (byte) 0, (byte) 1 };
        grafo1.prox = intArray22;
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 100);
        int int26 = grafo25.numVertices();
        grafo25.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray36 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo25.cab = intArray36;
        ds.Grafo.Aresta aresta39 = grafo25.proxAdj((int) ' ');
        ds.Grafo.Aresta aresta42 = grafo25.retiraAresta((int) (byte) 100, (int) (short) 100);
        ds.Grafo grafo44 = new ds.Grafo((int) (byte) 100);
        int int45 = grafo44.numVertices();
        grafo44.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray56 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo44.cab = intArray56;
        grafo25.cab = intArray56;
        grafo1.cab = intArray56;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(52, (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertNull(aresta39);
        org.junit.Assert.assertNull(aresta42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (byte) -1, (int) (byte) 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.v1();
        int int7 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.Grafo grafo1 = new ds.Grafo(0);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        int int4 = grafo3.numVertices();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 100);
        int int17 = grafo16.numVertices();
        grafo16.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray28 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo16.cab = intArray28;
        int[] intArray33 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo16.prox = intArray33;
        int[] intArray37 = new int[] { (byte) 0, (byte) 1 };
        grafo16.prox = intArray37;
        grafo1.peso = intArray37;
        int int40 = grafo1.numVertices();
        boolean boolean42 = grafo1.listaAdjVazia((int) 'a');
        int int43 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', (int) '4', (int) (byte) -1);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', 10, (int) (short) 100);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        int[] intArray12 = grafo1.peso;
        int int13 = grafo1.numVertices();
        ds.Grafo.Aresta aresta15 = grafo1.proxAdj((int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNull(aresta15);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        grafo1.imprime();
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 100);
        int int15 = grafo14.numVertices();
        grafo14.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray25 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo14.cab = intArray25;
        grafo1.prox = intArray25;
        int int28 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = grafo1.existeAresta((int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (byte) 10, 32);
        org.junit.Assert.assertNull(aresta4);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 100);
        int int17 = grafo16.numVertices();
        grafo16.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray28 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo16.cab = intArray28;
        int[] intArray33 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo16.prox = intArray33;
        grafo14.peso = intArray33;
        grafo1.peso = intArray33;
        ds.Grafo grafo38 = new ds.Grafo((int) (byte) 100);
        boolean boolean40 = grafo38.listaAdjVazia((int) (short) 10);
        int[] intArray47 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo38.peso = intArray47;
        grafo38.imprime();
        ds.Grafo grafo51 = new ds.Grafo((int) (byte) 100);
        int int52 = grafo51.numVertices();
        grafo51.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray63 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo51.cab = intArray63;
        ds.Grafo grafo66 = new ds.Grafo((int) 'a');
        ds.Grafo grafo68 = new ds.Grafo((int) (byte) 100);
        int int69 = grafo68.numVertices();
        grafo68.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray80 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo68.cab = intArray80;
        int[] intArray82 = grafo68.cab;
        grafo66.peso = intArray82;
        grafo51.cab = intArray82;
        grafo38.cab = intArray82;
        grafo1.peso = intArray82;
        java.lang.Class<?> wildcardClass87 = intArray82.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[32, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 100 + "'", int69 == 100);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        int[] intArray18 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo1.prox = intArray18;
        int[] intArray22 = new int[] { (byte) 0, (byte) 1 };
        grafo1.prox = intArray22;
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 100);
        boolean boolean27 = grafo25.listaAdjVazia((int) (short) 10);
        int[] intArray34 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo25.peso = intArray34;
        grafo1.cab = intArray34;
        ds.Grafo grafo38 = new ds.Grafo((int) (byte) 100);
        boolean boolean40 = grafo38.listaAdjVazia((int) (short) 10);
        int[] intArray47 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo38.peso = intArray47;
        grafo1.peso = intArray47;
        ds.Grafo grafo51 = new ds.Grafo((int) (byte) 100);
        int int52 = grafo51.numVertices();
        grafo51.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray63 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo51.cab = intArray63;
        ds.Grafo grafo66 = new ds.Grafo((int) 'a');
        ds.Grafo grafo68 = new ds.Grafo((int) (byte) 100);
        int int69 = grafo68.numVertices();
        grafo68.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray80 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo68.cab = intArray80;
        int[] intArray82 = grafo68.cab;
        grafo66.peso = intArray82;
        grafo51.cab = intArray82;
        boolean boolean86 = grafo51.listaAdjVazia((int) '#');
        int[] intArray87 = grafo51.cab;
        grafo1.peso = intArray87;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta91 = grafo1.retiraAresta((int) (short) -1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 1]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 100 + "'", int69 == 100);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray87), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, 1, (int) (short) 1);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', 10, (int) (short) 100);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 100);
        int int17 = grafo16.numVertices();
        grafo16.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray28 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo16.cab = intArray28;
        int[] intArray33 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo16.prox = intArray33;
        int[] intArray37 = new int[] { (byte) 0, (byte) 1 };
        grafo16.prox = intArray37;
        grafo1.peso = intArray37;
        int int40 = grafo1.numVertices();
        int[] intArray41 = grafo1.peso;
        ds.Grafo grafo43 = new ds.Grafo((int) (byte) 100);
        boolean boolean45 = grafo43.listaAdjVazia((int) (short) 10);
        int[] intArray52 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo43.peso = intArray52;
        ds.Grafo grafo54 = grafo43.grafoTransposto();
        ds.Grafo grafo55 = grafo43.grafoTransposto();
        ds.Grafo grafo57 = new ds.Grafo((int) (byte) 100);
        int int58 = grafo57.numVertices();
        grafo57.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray69 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo57.cab = intArray69;
        int[] intArray74 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo57.prox = intArray74;
        int[] intArray78 = new int[] { (byte) 0, (byte) 1 };
        grafo57.prox = intArray78;
        ds.Grafo grafo81 = new ds.Grafo((int) (byte) 100);
        boolean boolean83 = grafo81.listaAdjVazia((int) (short) 10);
        int[] intArray90 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo81.peso = intArray90;
        grafo57.cab = intArray90;
        grafo43.prox = intArray90;
        grafo1.cab = intArray90;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[0, 1]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo54);
        org.junit.Assert.assertNotNull(grafo55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 100 + "'", int58 == 100);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[0, 1]");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray90), "[1, -1, 100, 100, 10, 0]");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta5 = grafo1.proxAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        int int13 = grafo1.numVertices();
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 100);
        boolean boolean17 = grafo15.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo18 = grafo15.grafoTransposto();
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 100);
        int int21 = grafo20.numVertices();
        grafo20.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray32 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo20.cab = intArray32;
        int[] intArray37 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo20.prox = intArray37;
        grafo15.prox = intArray37;
        int[] intArray40 = grafo15.prox;
        grafo1.peso = intArray40;
        ds.Grafo.Aresta aresta43 = grafo1.proxAdj(10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[32, 0, -1]");
        org.junit.Assert.assertNull(aresta43);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 1);
        grafo1.insereAresta((int) (byte) 10, (int) '#', (int) '#');
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        int int4 = grafo1.numVertices();
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(52, 52);
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (byte) 100, (int) (short) 100);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) (byte) 100);
        int int4 = grafo3.numVertices();
        grafo3.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray15 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo3.cab = intArray15;
        int[] intArray20 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo3.prox = intArray20;
        grafo1.peso = intArray20;
        int int23 = grafo1.numVertices();
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 0, -1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) 'a');
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 100);
        int int19 = grafo18.numVertices();
        grafo18.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray30 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo18.cab = intArray30;
        int[] intArray32 = grafo18.cab;
        grafo16.peso = intArray32;
        grafo1.cab = intArray32;
        boolean boolean36 = grafo1.listaAdjVazia((int) '#');
        int[] intArray37 = grafo1.cab;
        boolean boolean39 = grafo1.listaAdjVazia((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((-1), (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.Grafo grafo1 = new ds.Grafo(52);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        java.lang.Class<?> wildcardClass3 = grafo2.getClass();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertNull(aresta4);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.Grafo grafo1 = new ds.Grafo(0);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo5 = new ds.Grafo((int) '#');
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 100);
        boolean boolean9 = grafo7.listaAdjVazia((int) (short) 10);
        int[] intArray16 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo7.peso = intArray16;
        grafo7.imprime();
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 100);
        int int21 = grafo20.numVertices();
        grafo20.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray31 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo20.cab = intArray31;
        grafo7.prox = intArray31;
        grafo5.prox = intArray31;
        int[] intArray35 = new int[] {};
        grafo5.peso = intArray35;
        grafo1.peso = intArray35;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[]");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(1, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj(0);
        ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int) (byte) 0, (int) (byte) 1);
        ds.Grafo.Aresta aresta9 = grafo1.proxAdj((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        boolean boolean16 = grafo1.listaAdjVazia(52);
        boolean boolean18 = grafo1.listaAdjVazia((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        int[] intArray18 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo1.prox = intArray18;
        int[] intArray22 = new int[] { (byte) 0, (byte) 1 };
        grafo1.prox = intArray22;
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 100);
        boolean boolean27 = grafo25.listaAdjVazia((int) (short) 10);
        int[] intArray34 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo25.peso = intArray34;
        grafo1.cab = intArray34;
        ds.Grafo grafo38 = new ds.Grafo((int) (byte) 100);
        boolean boolean40 = grafo38.listaAdjVazia((int) (short) 10);
        int[] intArray47 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo38.peso = intArray47;
        grafo1.peso = intArray47;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) 0, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 101]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1, -1, 100, 100, 10, 0]");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        int int14 = grafo13.numVertices();
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 100);
        boolean boolean18 = grafo16.listaAdjVazia((int) (short) 10);
        int[] intArray25 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo16.peso = intArray25;
        ds.Grafo grafo27 = grafo16.grafoTransposto();
        int[] intArray29 = new int[] { '#' };
        grafo16.cab = intArray29;
        grafo13.prox = intArray29;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo27);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[35]");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (short) -1, (int) '4');
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        int[] intArray18 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo1.prox = intArray18;
        int[] intArray22 = new int[] { (byte) 0, (byte) 1 };
        grafo1.prox = intArray22;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) 10, (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 1]");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.proxAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean5 = grafo1.listaAdjVazia((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(52, 97, 97);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        int int13 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(52, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(32, 32, 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        boolean boolean14 = grafo1.listaAdjVazia((int) (short) 0);
        int int15 = grafo1.numVertices();
        int[] intArray16 = null;
        grafo1.prox = intArray16;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) -1, (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 100);
        int int7 = grafo6.numVertices();
        grafo6.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray18 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo6.cab = intArray18;
        int[] intArray23 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo6.prox = intArray23;
        grafo1.prox = intArray23;
        int[] intArray26 = grafo1.prox;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta28 = grafo1.primeiroListaAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[32, 0, -1]");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray12 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo1.cab = intArray12;
        ds.Grafo.Aresta aresta15 = grafo1.proxAdj((int) ' ');
        boolean boolean17 = grafo1.listaAdjVazia((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        int[] intArray13 = grafo1.peso;
        boolean boolean15 = grafo1.listaAdjVazia((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', 1, (int) (byte) 10);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        boolean boolean14 = grafo1.listaAdjVazia((int) (short) 0);
        int int15 = grafo1.numVertices();
        int[] intArray16 = null;
        grafo1.prox = intArray16;
        java.lang.Class<?> wildcardClass18 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo1 = new ds.Grafo((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        boolean boolean14 = grafo1.listaAdjVazia((int) (byte) 0);
        ds.Grafo.Aresta aresta16 = grafo1.primeiroListaAdj(32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 100);
        int int17 = grafo16.numVertices();
        grafo16.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray28 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo16.cab = intArray28;
        int[] intArray33 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo16.prox = intArray33;
        int[] intArray37 = new int[] { (byte) 0, (byte) 1 };
        grafo16.prox = intArray37;
        grafo1.peso = intArray37;
        int int40 = grafo1.numVertices();
        ds.Grafo grafo42 = new ds.Grafo((int) (byte) 100);
        boolean boolean44 = grafo42.listaAdjVazia((int) (short) 10);
        int[] intArray51 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo42.peso = intArray51;
        grafo1.cab = intArray51;
        ds.Grafo grafo55 = new ds.Grafo((int) (byte) 100);
        boolean boolean57 = grafo55.listaAdjVazia((int) (short) 10);
        int int58 = grafo55.numVertices();
        ds.Grafo grafo60 = new ds.Grafo((int) (byte) 100);
        int int61 = grafo60.numVertices();
        grafo60.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray72 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo60.cab = intArray72;
        int[] intArray74 = grafo60.cab;
        grafo55.cab = intArray74;
        grafo1.cab = intArray74;
        java.lang.Class<?> wildcardClass77 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 100 + "'", int58 == 100);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 100 + "'", int61 == 100);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        int[] intArray18 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo1.prox = intArray18;
        int[] intArray22 = new int[] { (byte) 0, (byte) 1 };
        grafo1.prox = intArray22;
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 100);
        boolean boolean27 = grafo25.listaAdjVazia((int) (short) 10);
        int[] intArray34 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo25.peso = intArray34;
        grafo1.cab = intArray34;
        ds.Grafo grafo38 = new ds.Grafo((int) (byte) 100);
        boolean boolean40 = grafo38.listaAdjVazia((int) (short) 10);
        int[] intArray47 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo38.peso = intArray47;
        grafo1.peso = intArray47;
        java.lang.Class<?> wildcardClass50 = intArray47.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 1]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        int int4 = grafo1.numVertices();
        ds.Grafo grafo6 = new ds.Grafo((int) (byte) 100);
        int int7 = grafo6.numVertices();
        grafo6.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray18 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo6.cab = intArray18;
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 100);
        int int22 = grafo21.numVertices();
        grafo21.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray33 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo21.cab = intArray33;
        int[] intArray38 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo21.prox = intArray38;
        int[] intArray42 = new int[] { (byte) 0, (byte) 1 };
        grafo21.prox = intArray42;
        grafo6.peso = intArray42;
        int int45 = grafo6.numVertices();
        ds.Grafo grafo47 = new ds.Grafo((int) (byte) 100);
        boolean boolean49 = grafo47.listaAdjVazia((int) (short) 10);
        int[] intArray56 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo47.peso = intArray56;
        grafo6.cab = intArray56;
        ds.Grafo grafo60 = new ds.Grafo((int) (byte) 100);
        int int61 = grafo60.numVertices();
        grafo60.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray72 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo60.cab = intArray72;
        ds.Grafo grafo75 = new ds.Grafo((int) 'a');
        ds.Grafo grafo77 = new ds.Grafo((int) (byte) 100);
        int int78 = grafo77.numVertices();
        grafo77.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray89 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo77.cab = intArray89;
        int[] intArray91 = grafo77.cab;
        grafo75.peso = intArray91;
        grafo60.cab = intArray91;
        grafo6.prox = intArray91;
        grafo1.cab = intArray91;
        ds.Grafo.Aresta aresta97 = grafo1.primeiroListaAdj(1);
        boolean boolean99 = grafo1.listaAdjVazia(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 100 + "'", int61 == 100);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 100 + "'", int78 == 100);
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNull(aresta97);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, (int) (byte) 100, 97);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        grafo1.imprime();
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 100);
        int int15 = grafo14.numVertices();
        grafo14.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray26 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo14.cab = intArray26;
        ds.Grafo grafo29 = new ds.Grafo((int) 'a');
        ds.Grafo grafo31 = new ds.Grafo((int) (byte) 100);
        int int32 = grafo31.numVertices();
        grafo31.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray43 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo31.cab = intArray43;
        int[] intArray45 = grafo31.cab;
        grafo29.peso = intArray45;
        grafo14.cab = intArray45;
        grafo1.cab = intArray45;
        ds.Grafo grafo50 = new ds.Grafo((int) (byte) 100);
        int int51 = grafo50.numVertices();
        grafo50.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray62 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo50.cab = intArray62;
        int[] intArray64 = grafo50.cab;
        int[] intArray65 = grafo50.cab;
        grafo1.prox = intArray65;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, 1, (int) (short) 10);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, (int) (byte) 100, (int) '#');
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.Grafo grafo1 = new ds.Grafo(1);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        grafo1.imprime();
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (short) 0, (int) (byte) 1);
        boolean boolean11 = grafo1.existeAresta(0, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', 10, (int) (short) 100);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        int[] intArray12 = grafo1.peso;
        boolean boolean15 = grafo1.existeAresta(52, (int) (byte) 0);
        ds.Grafo grafo16 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(grafo16);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        ds.Grafo.Aresta aresta16 = grafo1.proxAdj((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 100);
        int int5 = grafo4.numVertices();
        grafo4.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray16 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo4.cab = intArray16;
        ds.Grafo grafo19 = new ds.Grafo((int) (byte) 100);
        int int20 = grafo19.numVertices();
        grafo19.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray31 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo19.cab = intArray31;
        int[] intArray36 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo19.prox = intArray36;
        int[] intArray40 = new int[] { (byte) 0, (byte) 1 };
        grafo19.prox = intArray40;
        grafo4.peso = intArray40;
        int int43 = grafo4.numVertices();
        ds.Grafo grafo45 = new ds.Grafo((int) (byte) 100);
        boolean boolean47 = grafo45.listaAdjVazia((int) (short) 10);
        int[] intArray54 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo45.peso = intArray54;
        grafo4.cab = intArray54;
        grafo1.peso = intArray54;
        int[] intArray58 = grafo1.peso;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[1, -1, 100, 100, 10, 0]");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int int4 = grafo1.numVertices();
        grafo1.insereAresta((int) (short) 1, (int) ' ', (-1));
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 100);
        int int12 = grafo11.numVertices();
        grafo11.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray23 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo11.cab = intArray23;
        int[] intArray28 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo11.prox = intArray28;
        int[] intArray32 = new int[] { (byte) 0, (byte) 1 };
        grafo11.prox = intArray32;
        ds.Grafo grafo35 = new ds.Grafo((int) (byte) 100);
        boolean boolean37 = grafo35.listaAdjVazia((int) (short) 10);
        int[] intArray44 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo35.peso = intArray44;
        grafo11.cab = intArray44;
        ds.Grafo grafo48 = new ds.Grafo((int) (byte) 100);
        boolean boolean50 = grafo48.listaAdjVazia((int) (short) 10);
        int[] intArray57 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo48.peso = intArray57;
        grafo11.peso = intArray57;
        ds.Grafo grafo61 = new ds.Grafo((int) (byte) 100);
        int int62 = grafo61.numVertices();
        grafo61.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray73 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo61.cab = intArray73;
        ds.Grafo grafo76 = new ds.Grafo((int) 'a');
        ds.Grafo grafo78 = new ds.Grafo((int) (byte) 100);
        int int79 = grafo78.numVertices();
        grafo78.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray90 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo78.cab = intArray90;
        int[] intArray92 = grafo78.cab;
        grafo76.peso = intArray92;
        grafo61.cab = intArray92;
        boolean boolean96 = grafo61.listaAdjVazia((int) '#');
        int[] intArray97 = grafo61.cab;
        grafo11.peso = intArray97;
        grafo9.peso = intArray97;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[0, 1]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 100 + "'", int62 == 100);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 100 + "'", int79 == 100);
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray90), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray92), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNotNull(intArray97);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray97), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (short) -1, (int) '4');
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), 0, 10);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        int int13 = grafo1.numVertices();
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 100);
        boolean boolean17 = grafo15.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo18 = grafo15.grafoTransposto();
        ds.Grafo grafo20 = new ds.Grafo((int) (byte) 100);
        int int21 = grafo20.numVertices();
        grafo20.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray32 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo20.cab = intArray32;
        int[] intArray37 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo20.prox = intArray37;
        grafo15.prox = intArray37;
        int[] intArray40 = grafo15.prox;
        grafo1.peso = intArray40;
        boolean boolean43 = grafo1.listaAdjVazia(52);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[32, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        int[] intArray5 = null;
        grafo1.peso = intArray5;
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(grafo4);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (byte) -1, (int) (byte) 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        int int7 = aresta3.peso();
        java.lang.Class<?> wildcardClass8 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        int[] intArray18 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo1.prox = intArray18;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) ' ', (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 0, -1]");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', (int) '4', (int) (byte) -1);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        int int7 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo5 = new ds.Grafo((int) (byte) 100);
        boolean boolean7 = grafo5.listaAdjVazia((int) (short) 10);
        int[] intArray14 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo5.peso = intArray14;
        grafo5.imprime();
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 100);
        int int19 = grafo18.numVertices();
        grafo18.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray29 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo18.cab = intArray29;
        grafo5.prox = intArray29;
        grafo1.prox = intArray29;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[35, 10, 100, 97, 1]");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        int[] intArray18 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo1.prox = intArray18;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(52, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 0, -1]");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) 'a');
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 100);
        int int19 = grafo18.numVertices();
        grafo18.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray30 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo18.cab = intArray30;
        int[] intArray32 = grafo18.cab;
        grafo16.peso = intArray32;
        grafo1.cab = intArray32;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(100, (int) (byte) 0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo.Aresta aresta14 = grafo1.retiraAresta((int) (short) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', 10, (int) (short) 100);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        boolean boolean14 = grafo1.listaAdjVazia((int) (short) 0);
        int[] intArray15 = grafo1.peso;
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, -1, 100, 100, 10, 0]");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (byte) -1, (int) (byte) 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        int int4 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo9 = new ds.Grafo((int) '#');
        ds.Grafo grafo11 = new ds.Grafo((int) (byte) 100);
        boolean boolean13 = grafo11.listaAdjVazia((int) (short) 10);
        int[] intArray20 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo11.peso = intArray20;
        grafo11.imprime();
        ds.Grafo grafo24 = new ds.Grafo((int) (byte) 100);
        int int25 = grafo24.numVertices();
        grafo24.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray35 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo24.cab = intArray35;
        grafo11.prox = intArray35;
        grafo9.prox = intArray35;
        grafo7.cab = intArray35;
        grafo1.cab = intArray35;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[35, 10, 100, 97, 1]");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        int[] intArray14 = new int[] { '#' };
        grafo1.cab = intArray14;
        int[] intArray16 = grafo1.peso;
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 100);
        boolean boolean20 = grafo18.listaAdjVazia((int) (short) 10);
        int[] intArray27 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo18.peso = intArray27;
        ds.Grafo grafo29 = grafo18.grafoTransposto();
        boolean boolean31 = grafo18.listaAdjVazia((int) (short) 0);
        int[] intArray32 = grafo18.peso;
        grafo1.peso = intArray32;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(52, (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, -1, 100, 100, 10, 0]");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.Grafo grafo1 = new ds.Grafo(0);
        grafo1.insereAresta(0, 0, (int) ' ');
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 100);
        int int8 = grafo7.numVertices();
        grafo7.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray18 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo7.cab = intArray18;
        boolean boolean21 = grafo7.listaAdjVazia((int) (byte) 100);
        ds.Grafo grafo23 = new ds.Grafo((int) (byte) 100);
        boolean boolean25 = grafo23.listaAdjVazia((int) (short) 10);
        int[] intArray32 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo23.peso = intArray32;
        grafo23.imprime();
        ds.Grafo grafo36 = new ds.Grafo((int) (byte) 100);
        int int37 = grafo36.numVertices();
        grafo36.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray47 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo36.cab = intArray47;
        grafo23.prox = intArray47;
        grafo7.cab = intArray47;
        grafo1.prox = intArray47;
        ds.Grafo grafo53 = new ds.Grafo((int) (byte) 100);
        int int54 = grafo53.numVertices();
        grafo53.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray65 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo53.cab = intArray65;
        grafo1.peso = intArray65;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 100 + "'", int54 == 100);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, (int) (byte) 100, (int) (byte) 0);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        boolean boolean14 = grafo1.listaAdjVazia((int) (short) 0);
        int int15 = grafo1.numVertices();
        int[] intArray16 = null;
        grafo1.prox = intArray16;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(0, (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        boolean boolean5 = grafo1.existeAresta((int) '#', 1);
        ds.Grafo grafo7 = new ds.Grafo((int) (byte) 100);
        boolean boolean9 = grafo7.listaAdjVazia((int) (short) 10);
        int[] intArray16 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo7.peso = intArray16;
        ds.Grafo grafo18 = grafo7.grafoTransposto();
        boolean boolean20 = grafo7.listaAdjVazia((int) (short) 0);
        int[] intArray21 = grafo7.peso;
        grafo1.prox = intArray21;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo23 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, -1, 100, 100, 10, 0]");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 100);
        boolean boolean18 = grafo16.listaAdjVazia((int) (short) 10);
        int int19 = grafo16.numVertices();
        ds.Grafo grafo21 = new ds.Grafo((int) (byte) 100);
        int int22 = grafo21.numVertices();
        grafo21.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray33 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo21.cab = intArray33;
        int[] intArray35 = grafo21.cab;
        grafo16.cab = intArray35;
        grafo1.cab = intArray35;
        boolean boolean39 = grafo1.listaAdjVazia(52);
        boolean boolean41 = grafo1.listaAdjVazia(0);
        boolean boolean43 = grafo1.listaAdjVazia((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 100);
        int int17 = grafo16.numVertices();
        grafo16.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray28 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo16.cab = intArray28;
        int[] intArray33 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo16.prox = intArray33;
        int[] intArray37 = new int[] { (byte) 0, (byte) 1 };
        grafo16.prox = intArray37;
        grafo1.peso = intArray37;
        int int40 = grafo1.numVertices();
        boolean boolean42 = grafo1.listaAdjVazia((int) 'a');
        int[] intArray43 = grafo1.cab;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        int[] intArray18 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo1.prox = intArray18;
        int[] intArray22 = new int[] { (byte) 0, (byte) 1 };
        grafo1.prox = intArray22;
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 100);
        int int26 = grafo25.numVertices();
        grafo25.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray36 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo25.cab = intArray36;
        ds.Grafo.Aresta aresta39 = grafo25.proxAdj((int) ' ');
        ds.Grafo.Aresta aresta42 = grafo25.retiraAresta((int) (byte) 100, (int) (short) 100);
        ds.Grafo grafo44 = new ds.Grafo((int) (byte) 100);
        int int45 = grafo44.numVertices();
        grafo44.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray56 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo44.cab = intArray56;
        grafo25.cab = intArray56;
        grafo1.cab = intArray56;
        int[] intArray60 = grafo1.cab;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta62 = grafo1.proxAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertNull(aresta39);
        org.junit.Assert.assertNull(aresta42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        int[] intArray12 = grafo1.peso;
        boolean boolean15 = grafo1.existeAresta(52, (int) (byte) 0);
        boolean boolean18 = grafo1.existeAresta((int) (short) 100, (int) (short) -1);
        boolean boolean20 = grafo1.listaAdjVazia(1);
        ds.Grafo.Aresta aresta23 = grafo1.retiraAresta(97, 52);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(aresta23);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int int4 = grafo1.numVertices();
        grafo1.insereAresta((int) (short) 1, (int) ' ', (-1));
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        java.lang.Class<?> wildcardClass10 = grafo9.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.Grafo grafo1 = new ds.Grafo(52);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo1.imprime();
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 100);
        int int16 = grafo15.numVertices();
        grafo15.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray27 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo15.cab = intArray27;
        ds.Grafo grafo30 = new ds.Grafo((int) 'a');
        ds.Grafo grafo32 = new ds.Grafo((int) (byte) 100);
        int int33 = grafo32.numVertices();
        grafo32.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray44 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo32.cab = intArray44;
        int[] intArray46 = grafo32.cab;
        grafo30.peso = intArray46;
        grafo15.cab = intArray46;
        grafo1.prox = intArray46;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta51 = grafo1.proxAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 10, (int) (byte) -1, (int) (short) 1);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        boolean boolean3 = grafo1.listaAdjVazia(97);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        int[] intArray18 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo1.prox = intArray18;
        int[] intArray22 = new int[] { (byte) 0, (byte) 1 };
        grafo1.prox = intArray22;
        ds.Grafo grafo25 = new ds.Grafo((int) (byte) 100);
        boolean boolean27 = grafo25.listaAdjVazia((int) (short) 10);
        int[] intArray34 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo25.peso = intArray34;
        grafo1.cab = intArray34;
        ds.Grafo grafo38 = new ds.Grafo((int) (byte) 100);
        boolean boolean40 = grafo38.listaAdjVazia((int) (short) 10);
        int[] intArray47 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo38.peso = intArray47;
        grafo1.peso = intArray47;
        ds.Grafo grafo51 = new ds.Grafo((int) (byte) 100);
        int int52 = grafo51.numVertices();
        grafo51.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray63 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo51.cab = intArray63;
        ds.Grafo grafo66 = new ds.Grafo((int) 'a');
        ds.Grafo grafo68 = new ds.Grafo((int) (byte) 100);
        int int69 = grafo68.numVertices();
        grafo68.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray80 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo68.cab = intArray80;
        int[] intArray82 = grafo68.cab;
        grafo66.peso = intArray82;
        grafo51.cab = intArray82;
        boolean boolean86 = grafo51.listaAdjVazia((int) '#');
        int[] intArray87 = grafo51.cab;
        grafo1.peso = intArray87;
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo89 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 1]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 100 + "'", int69 == 100);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray87), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        grafo1.insereAresta((int) '#', (int) '4', (int) (short) 100);
        ds.Grafo grafo12 = new ds.Grafo(0);
        grafo12.insereAresta(0, 0, (int) ' ');
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 100);
        int int19 = grafo18.numVertices();
        grafo18.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray29 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo18.cab = intArray29;
        boolean boolean32 = grafo18.listaAdjVazia((int) (byte) 100);
        ds.Grafo grafo34 = new ds.Grafo((int) (byte) 100);
        boolean boolean36 = grafo34.listaAdjVazia((int) (short) 10);
        int[] intArray43 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo34.peso = intArray43;
        grafo34.imprime();
        ds.Grafo grafo47 = new ds.Grafo((int) (byte) 100);
        int int48 = grafo47.numVertices();
        grafo47.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray58 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo47.cab = intArray58;
        grafo34.prox = intArray58;
        grafo18.cab = intArray58;
        grafo12.prox = intArray58;
        grafo1.cab = intArray58;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean65 = grafo1.listaAdjVazia((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[35, 10, 100, 97, 1]");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        int[] intArray12 = grafo1.peso;
        int int13 = grafo1.numVertices();
        ds.Grafo grafo15 = new ds.Grafo((int) (byte) 100);
        int int16 = grafo15.numVertices();
        grafo15.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray26 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo15.cab = intArray26;
        boolean boolean29 = grafo15.listaAdjVazia((int) (byte) 100);
        ds.Grafo grafo31 = new ds.Grafo((int) (byte) 100);
        boolean boolean33 = grafo31.listaAdjVazia((int) (short) 10);
        int[] intArray40 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo31.peso = intArray40;
        grafo31.imprime();
        ds.Grafo grafo44 = new ds.Grafo((int) (byte) 100);
        int int45 = grafo44.numVertices();
        grafo44.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray55 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo44.cab = intArray55;
        grafo31.prox = intArray55;
        grafo15.cab = intArray55;
        grafo1.peso = intArray55;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[35, 10, 100, 97, 1]");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 1, 32, 32);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        int[] intArray13 = grafo1.peso;
        ds.Grafo.Aresta aresta16 = grafo1.retiraAresta((int) (short) 10, 10);
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 100);
        int int19 = grafo18.numVertices();
        grafo18.insereAresta((int) '#', 1, (int) (short) 0);
        grafo18.insereAresta((int) '#', (int) '4', (int) (short) 100);
        ds.Grafo grafo29 = new ds.Grafo(0);
        grafo29.insereAresta(0, 0, (int) ' ');
        ds.Grafo grafo35 = new ds.Grafo((int) (byte) 100);
        int int36 = grafo35.numVertices();
        grafo35.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray46 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo35.cab = intArray46;
        boolean boolean49 = grafo35.listaAdjVazia((int) (byte) 100);
        ds.Grafo grafo51 = new ds.Grafo((int) (byte) 100);
        boolean boolean53 = grafo51.listaAdjVazia((int) (short) 10);
        int[] intArray60 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo51.peso = intArray60;
        grafo51.imprime();
        ds.Grafo grafo64 = new ds.Grafo((int) (byte) 100);
        int int65 = grafo64.numVertices();
        grafo64.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray75 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo64.cab = intArray75;
        grafo51.prox = intArray75;
        grafo35.cab = intArray75;
        grafo29.prox = intArray75;
        grafo18.cab = intArray75;
        grafo1.prox = intArray75;
        int[] intArray82 = grafo1.prox;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 100 + "'", int65 == 100);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[35, 10, 100, 97, 1]");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo4 = new ds.Grafo((int) (byte) 100);
        boolean boolean6 = grafo4.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo7 = grafo4.grafoTransposto();
        ds.Grafo grafo9 = new ds.Grafo((int) (byte) 100);
        int int10 = grafo9.numVertices();
        grafo9.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray21 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo9.cab = intArray21;
        int[] intArray26 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo9.prox = intArray26;
        grafo4.prox = intArray26;
        grafo1.peso = intArray26;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) 1, (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[32, 0, -1]");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        int[] intArray12 = grafo1.peso;
        boolean boolean15 = grafo1.existeAresta(52, (int) (byte) 0);
        boolean boolean17 = grafo1.listaAdjVazia(1);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) 10, (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (short) -1, (int) '4');
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        int int7 = aresta3.v2();
        int int8 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        grafo1.imprime();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta16 = grafo13.retiraAresta((int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        ds.Grafo grafo3 = new ds.Grafo((int) '#');
        ds.Grafo grafo5 = new ds.Grafo((int) (byte) 100);
        boolean boolean7 = grafo5.listaAdjVazia((int) (short) 10);
        int[] intArray14 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo5.peso = intArray14;
        grafo5.imprime();
        ds.Grafo grafo18 = new ds.Grafo((int) (byte) 100);
        int int19 = grafo18.numVertices();
        grafo18.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray29 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo18.cab = intArray29;
        grafo5.prox = intArray29;
        grafo3.prox = intArray29;
        grafo1.cab = intArray29;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(32, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[35, 10, 100, 97, 1]");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', 10, (int) (short) 100);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean6 = grafo1.existeAresta((int) (short) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        int[] intArray12 = grafo1.peso;
        boolean boolean15 = grafo1.existeAresta(52, (int) (byte) 0);
        ds.Grafo grafo17 = new ds.Grafo((int) (byte) 100);
        boolean boolean19 = grafo17.listaAdjVazia((int) (short) 10);
        int[] intArray26 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo17.peso = intArray26;
        grafo17.imprime();
        ds.Grafo grafo30 = new ds.Grafo((int) (byte) 100);
        int int31 = grafo30.numVertices();
        grafo30.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray41 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo30.cab = intArray41;
        grafo17.prox = intArray41;
        int int44 = grafo17.numVertices();
        int[] intArray45 = grafo17.prox;
        grafo1.peso = intArray45;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[35, 10, 100, 97, 1]");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 100);
        int int17 = grafo16.numVertices();
        grafo16.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray28 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo16.cab = intArray28;
        int[] intArray33 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo16.prox = intArray33;
        int[] intArray37 = new int[] { (byte) 0, (byte) 1 };
        grafo16.prox = intArray37;
        grafo1.peso = intArray37;
        int int40 = grafo1.numVertices();
        ds.Grafo grafo42 = new ds.Grafo((int) (byte) 100);
        boolean boolean44 = grafo42.listaAdjVazia((int) (short) 10);
        int[] intArray51 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo42.peso = intArray51;
        grafo1.cab = intArray51;
        ds.Grafo grafo55 = new ds.Grafo((int) (byte) 100);
        int int56 = grafo55.numVertices();
        grafo55.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray67 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo55.cab = intArray67;
        ds.Grafo grafo70 = new ds.Grafo((int) 'a');
        ds.Grafo grafo72 = new ds.Grafo((int) (byte) 100);
        int int73 = grafo72.numVertices();
        grafo72.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray84 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo72.cab = intArray84;
        int[] intArray86 = grafo72.cab;
        grafo70.peso = intArray86;
        grafo55.cab = intArray86;
        grafo1.prox = intArray86;
        int[] intArray90 = grafo1.prox;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 100 + "'", int73 == 100);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray90), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo1.peso = intArray10;
        grafo1.imprime();
        ds.Grafo grafo14 = new ds.Grafo((int) (byte) 100);
        int int15 = grafo14.numVertices();
        grafo14.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray25 = new int[] { '#', 10, (short) 100, 'a', (short) 1 };
        grafo14.cab = intArray25;
        grafo1.prox = intArray25;
        int int28 = grafo1.numVertices();
        int[] intArray29 = grafo1.prox;
        ds.Grafo grafo31 = new ds.Grafo((int) (byte) 100);
        int int32 = grafo31.numVertices();
        grafo31.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray43 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo31.cab = intArray43;
        ds.Grafo grafo46 = new ds.Grafo((int) (byte) 100);
        int int47 = grafo46.numVertices();
        grafo46.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray58 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo46.cab = intArray58;
        int[] intArray63 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo46.prox = intArray63;
        int[] intArray67 = new int[] { (byte) 0, (byte) 1 };
        grafo46.prox = intArray67;
        grafo31.peso = intArray67;
        int int70 = grafo31.numVertices();
        ds.Grafo grafo72 = new ds.Grafo((int) (byte) 100);
        boolean boolean74 = grafo72.listaAdjVazia((int) (short) 10);
        int[] intArray81 = new int[] { (byte) 1, (short) -1, (byte) 100, (short) 100, 10, 0 };
        grafo72.peso = intArray81;
        grafo31.cab = intArray81;
        grafo1.cab = intArray81;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, -1, 100, 100, 10, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[35, 10, 100, 97, 1]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 100 + "'", int70 == 100);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[1, -1, 100, 100, 10, 0]");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        int int2 = grafo1.numVertices();
        grafo1.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray13 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo1.cab = intArray13;
        ds.Grafo grafo16 = new ds.Grafo((int) (byte) 100);
        int int17 = grafo16.numVertices();
        grafo16.insereAresta((int) '#', 1, (int) (short) 0);
        int[] intArray28 = new int[] { (-1), (byte) 10, (short) 1, (-1), 0, 10 };
        grafo16.cab = intArray28;
        int[] intArray33 = new int[] { ' ', (short) 0, (byte) -1 };
        grafo16.prox = intArray33;
        int[] intArray37 = new int[] { (byte) 0, (byte) 1 };
        grafo16.prox = intArray37;
        grafo1.peso = intArray37;
        int int40 = grafo1.numVertices();
        int[] intArray41 = grafo1.peso;
        // The following exception was thrown during execution in test generation
        try {
            grafo1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, 10, 1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[0, 1]");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        int int4 = grafo1.numVertices();
        grafo1.insereAresta((int) (short) 1, (int) ' ', (-1));
        ds.Grafo.Aresta aresta11 = grafo1.retiraAresta((int) (byte) 100, (int) (byte) 10);
        boolean boolean14 = grafo1.existeAresta(0, (-1));
        boolean boolean17 = grafo1.existeAresta(1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }
}

