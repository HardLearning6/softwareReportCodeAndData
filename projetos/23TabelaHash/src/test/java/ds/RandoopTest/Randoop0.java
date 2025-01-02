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
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass1 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
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
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = obj5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass7 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Class<?> wildcardClass7 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass5 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass5 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass12 = tabelaHash8.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass14 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass5 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0f + "'", obj9, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0]");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass4 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0f + "'", obj11, 0.0f);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass8 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) 0.0f);
        tabelaHash10.imprime();
        tabelaHash10.retira("");
        java.lang.Object obj18 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Class<?> wildcardClass20 = tabelaHash10.getClass();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0f + "'", obj9, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.insere("", (java.lang.Object) 'a');
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[a]");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object[] objArray10 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray10);
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object[] objArray10 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray10);
        java.lang.Class<?> wildcardClass12 = objArray10.getClass();
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0f + "'", obj7, 0.0f);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass11 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        tabelaHash14.retira("hi!");
        java.lang.Object obj19 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.insere("hi!", (java.lang.Object) (short) 0);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0f + "'", obj12, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 0);
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0]");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass9 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass7 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[0.0]");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass2 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.retira("hi!");
        java.lang.Object obj15 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.insere("hi!", (java.lang.Object) (short) 0);
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 0);
        java.lang.Object obj21 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 1 + "'", obj21, 1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass12 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass9 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray16 = tabelaHash12.recuperaItens();
        java.lang.Object obj18 = tabelaHash12.pesquisa("");
        java.lang.Object obj20 = null;
        tabelaHash12.insere("", obj20);
        java.lang.Object[] objArray22 = tabelaHash12.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        java.lang.Object obj25 = null;
        tabelaHash0.insere("hi!", obj25);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0.0f + "'", obj18, 0.0f);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[0.0]");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        tabelaHash3.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray7 = tabelaHash3.recuperaItens();
        java.lang.Object obj9 = tabelaHash3.pesquisa("");
        java.lang.Object obj11 = null;
        tabelaHash3.insere("", obj11);
        tabelaHash3.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray18 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0f + "'", obj9, 0.0f);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 0);
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass11 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0]");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass7 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (short) 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass10 = objArray9.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0f + "'", obj8, 0.0f);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray16 = tabelaHash12.recuperaItens();
        java.lang.Object obj18 = tabelaHash12.pesquisa("hi!");
        java.lang.Object obj20 = tabelaHash12.pesquisa("hi!");
        java.lang.Object obj22 = tabelaHash12.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[0.0]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0]");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[0.0]");
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass7 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object[] objArray10 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray10);
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray17 = tabelaHash13.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        java.lang.Class<?> wildcardClass19 = tabelaHash13.getClass();
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0f + "'", obj12, 0.0f);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray12 = tabelaHash8.recuperaItens();
        java.lang.Object obj14 = tabelaHash8.pesquisa("");
        java.lang.Object obj16 = null;
        tabelaHash8.insere("", obj16);
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object[] objArray19 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray20 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0f + "'", obj14, 0.0f);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[, 1]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[, 1]");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray17 = tabelaHash13.recuperaItens();
        java.lang.Object obj19 = tabelaHash13.pesquisa("");
        java.lang.Object obj21 = null;
        tabelaHash13.insere("", obj21);
        tabelaHash13.retira("");
        tabelaHash10.insere("hi!", (java.lang.Object) "");
        tabelaHash10.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0.0f + "'", obj19, 0.0f);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        tabelaHash8.imprime();
        tabelaHash8.retira("");
        tabelaHash8.retira("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray12 = tabelaHash8.recuperaItens();
        java.lang.Object obj14 = tabelaHash8.pesquisa("");
        java.lang.Object obj16 = null;
        tabelaHash8.insere("", obj16);
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object[] objArray19 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass20 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0f + "'", obj14, 0.0f);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[, 1]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) 0.0f);
        tabelaHash12.imprime();
        tabelaHash12.retira("");
        tabelaHash12.retira("hi!");
        tabelaHash12.retira("");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("", (java.lang.Object) 0.0f);
        tabelaHash24.imprime();
        tabelaHash24.retira("");
        tabelaHash24.retira("hi!");
        java.lang.Object obj34 = tabelaHash24.pesquisa("");
        tabelaHash12.insere("", (java.lang.Object) tabelaHash24);
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object[] objArray37 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass38 = objArray37.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[, ]");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass9 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj14 = tabelaHash9.pesquisa("hi!");
        tabelaHash0.insere("", obj14);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("", (java.lang.Object) 0);
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0.0]");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass5 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray12 = tabelaHash8.recuperaItens();
        java.lang.Object obj14 = tabelaHash8.pesquisa("");
        java.lang.Object obj16 = null;
        tabelaHash8.insere("", obj16);
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object[] objArray19 = tabelaHash0.recuperaItens();
        java.lang.Object obj21 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray22 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0f + "'", obj14, 0.0f);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[, 1]");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "" + "'", obj21, "");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[, 1]");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) 0.0f);
        tabelaHash10.imprime();
        tabelaHash10.retira("");
        java.lang.Object obj18 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash10.imprime();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.retira("");
        tabelaHash10.imprime();
        tabelaHash10.retira("hi!");
        tabelaHash10.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass15 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) 0.0f);
        tabelaHash12.imprime();
        tabelaHash12.retira("");
        tabelaHash12.retira("hi!");
        tabelaHash12.retira("");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("", (java.lang.Object) 0.0f);
        tabelaHash24.imprime();
        tabelaHash24.retira("");
        tabelaHash24.retira("hi!");
        java.lang.Object obj34 = tabelaHash24.pesquisa("");
        tabelaHash12.insere("", (java.lang.Object) tabelaHash24);
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object[] objArray37 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass40 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[, ]");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0f + "'", obj11, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray9 = tabelaHash5.recuperaItens();
        java.lang.Object obj11 = tabelaHash5.pesquisa("");
        tabelaHash5.retira("");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.retira("");
        tabelaHash15.imprime();
        java.lang.Class<?> wildcardClass19 = tabelaHash15.getClass();
        tabelaHash5.insere("hi!", (java.lang.Object) wildcardClass19);
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0f + "'", obj11, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) 0.0f);
        tabelaHash12.imprime();
        tabelaHash12.retira("");
        tabelaHash12.retira("hi!");
        tabelaHash12.retira("");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("", (java.lang.Object) 0.0f);
        tabelaHash24.imprime();
        tabelaHash24.retira("");
        tabelaHash24.retira("hi!");
        java.lang.Object obj34 = tabelaHash24.pesquisa("");
        tabelaHash12.insere("", (java.lang.Object) tabelaHash24);
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object obj38 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray39 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "" + "'", obj38, "");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[, ]");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0f + "'", obj9, 0.0f);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass11 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass12 = tabelaHash8.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass12);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray16 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[0.0]");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray17 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray18 = tabelaHash13.recuperaItens();
        tabelaHash13.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        tabelaHash13.retira("hi!");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0f + "'", obj8, 0.0f);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0.0]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0.0]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[0.0]");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 100);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0.0]");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) 0.0f);
        tabelaHash12.imprime();
        tabelaHash12.retira("");
        tabelaHash12.retira("hi!");
        tabelaHash12.retira("");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("", (java.lang.Object) 0.0f);
        tabelaHash24.imprime();
        tabelaHash24.retira("");
        tabelaHash24.retira("hi!");
        java.lang.Object obj34 = tabelaHash24.pesquisa("");
        tabelaHash12.insere("", (java.lang.Object) tabelaHash24);
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object[] objArray37 = tabelaHash0.recuperaItens();
        java.lang.Object obj39 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        tabelaHash41.imprime();
        java.lang.Object[] objArray43 = tabelaHash41.recuperaItens();
        tabelaHash41.imprime();
        tabelaHash41.retira("hi!");
        tabelaHash41.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj51 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[, ]");
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + "" + "'", obj39, "");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + "" + "'", obj51, "");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 10L);
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.retira("");
        tabelaHash12.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        java.lang.Object[] objArray22 = tabelaHash20.recuperaItens();
        tabelaHash12.insere("hi!", (java.lang.Object) objArray22);
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray29 = tabelaHash25.recuperaItens();
        tabelaHash12.insere("", (java.lang.Object) tabelaHash25);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash25);
        java.lang.Object obj33 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[0.0]");
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray12 = tabelaHash8.recuperaItens();
        java.lang.Object obj14 = tabelaHash8.pesquisa("");
        java.lang.Object obj16 = null;
        tabelaHash8.insere("", obj16);
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object[] objArray19 = tabelaHash0.recuperaItens();
        java.lang.Object obj21 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0f + "'", obj14, 0.0f);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[, 1]");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "" + "'", obj21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0.0]");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) 0.0f);
        tabelaHash12.imprime();
        tabelaHash12.retira("");
        tabelaHash12.retira("hi!");
        java.lang.Object obj22 = tabelaHash12.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass28 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj11 = tabelaHash6.pesquisa("hi!");
        tabelaHash6.imprime();
        tabelaHash6.retira("hi!");
        java.lang.Object[] objArray15 = tabelaHash6.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0.0]");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        tabelaHash0.retira("");
        tabelaHash0.insere("", (java.lang.Object) 100);
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass17 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100 + "'", obj16, 100);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0.0]");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray14 = tabelaHash10.recuperaItens();
        java.lang.Object obj16 = tabelaHash10.pesquisa("");
        java.lang.Object obj18 = null;
        tabelaHash10.insere("", obj18);
        java.lang.Object[] objArray20 = tabelaHash10.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.retira("");
        tabelaHash23.imprime();
        java.lang.Object obj28 = tabelaHash23.pesquisa("");
        tabelaHash0.insere("hi!", obj28);
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        java.lang.Object[] objArray35 = tabelaHash31.recuperaItens();
        java.lang.Object obj37 = tabelaHash31.pesquisa("");
        java.lang.Object obj39 = tabelaHash31.pesquisa("hi!");
        java.lang.Object obj41 = tabelaHash31.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0f + "'", obj16, 0.0f);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[0.0]");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass8 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) 0.0f);
        tabelaHash12.imprime();
        tabelaHash12.retira("");
        tabelaHash12.retira("hi!");
        tabelaHash12.retira("");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("", (java.lang.Object) 0.0f);
        tabelaHash24.imprime();
        tabelaHash24.retira("");
        tabelaHash24.retira("hi!");
        java.lang.Object obj34 = tabelaHash24.pesquisa("");
        tabelaHash12.insere("", (java.lang.Object) tabelaHash24);
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object obj38 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray44 = tabelaHash40.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash40);
        java.lang.Object[] objArray46 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass47 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "" + "'", obj38, "");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[0.0]");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[, ]");
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.insere("", (java.lang.Object) 0.0f);
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash5.retira("");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass3 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) 0.0f);
        tabelaHash12.imprime();
        tabelaHash12.retira("");
        tabelaHash12.retira("hi!");
        tabelaHash12.retira("");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("", (java.lang.Object) 0.0f);
        tabelaHash24.imprime();
        tabelaHash24.retira("");
        tabelaHash24.retira("hi!");
        java.lang.Object obj34 = tabelaHash24.pesquisa("");
        tabelaHash12.insere("", (java.lang.Object) tabelaHash24);
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object[] objArray37 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[, ]");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0f + "'", obj12, 0.0f);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash7.imprime();
        tabelaHash7.imprime();
        java.lang.Object obj12 = tabelaHash7.pesquisa("");
        tabelaHash7.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.insere("", (java.lang.Object) 0.0f);
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash5.retira("hi!");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass11 = objArray10.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0f + "'", obj9, 0.0f);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0f + "'", obj12, 0.0f);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0f + "'", obj14, 0.0f);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass11 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 10L);
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.retira("");
        tabelaHash12.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        java.lang.Object[] objArray22 = tabelaHash20.recuperaItens();
        tabelaHash12.insere("hi!", (java.lang.Object) objArray22);
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray29 = tabelaHash25.recuperaItens();
        tabelaHash12.insere("", (java.lang.Object) tabelaHash25);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash25);
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray37 = tabelaHash33.recuperaItens();
        java.lang.Object obj39 = tabelaHash33.pesquisa("");
        java.lang.Object obj41 = null;
        tabelaHash33.insere("", obj41);
        tabelaHash33.retira("");
        tabelaHash33.imprime();
        java.lang.Object obj47 = tabelaHash33.pesquisa("hi!");
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        tabelaHash49.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray53 = tabelaHash49.recuperaItens();
        tabelaHash49.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj58 = tabelaHash49.pesquisa("");
        tabelaHash33.insere("hi!", (java.lang.Object) "");
        tabelaHash33.imprime();
        tabelaHash25.insere("", (java.lang.Object) tabelaHash33);
        tabelaHash25.imprime();
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[0.0]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 0.0f + "'", obj39, 0.0f);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 0.0f + "'", obj58, 0.0f);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0]");
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) 0.0f);
        tabelaHash10.imprime();
        tabelaHash10.retira("");
        java.lang.Object obj18 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash10.retira("hi!");
        java.lang.Object[] objArray22 = tabelaHash10.recuperaItens();
        java.lang.Object obj24 = tabelaHash10.pesquisa("");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object obj8 = null;
        tabelaHash0.insere("hi!", obj8);
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0]");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray21 = tabelaHash17.recuperaItens();
        java.lang.Object obj23 = tabelaHash17.pesquisa("");
        java.lang.Object obj25 = null;
        tabelaHash17.insere("", obj25);
        tabelaHash17.retira("");
        tabelaHash14.insere("hi!", (java.lang.Object) "");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0.0f + "'", obj23, 0.0f);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray14 = tabelaHash10.recuperaItens();
        java.lang.Object obj16 = tabelaHash10.pesquisa("");
        java.lang.Object obj18 = null;
        tabelaHash10.insere("", obj18);
        java.lang.Object[] objArray20 = tabelaHash10.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.retira("");
        tabelaHash23.imprime();
        java.lang.Object obj28 = tabelaHash23.pesquisa("");
        tabelaHash0.insere("hi!", obj28);
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.imprime();
        java.lang.Object[] objArray33 = tabelaHash31.recuperaItens();
        java.lang.Object[] objArray34 = tabelaHash31.recuperaItens();
        tabelaHash31.retira("hi!");
        java.lang.Object[] objArray37 = tabelaHash31.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash31);
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.insere("", (java.lang.Object) 0.0f);
        tabelaHash40.imprime();
        tabelaHash40.retira("");
        tabelaHash40.imprime();
        tabelaHash40.retira("");
        tabelaHash40.retira("");
        tabelaHash31.insere("", (java.lang.Object) tabelaHash40);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0f + "'", obj16, 0.0f);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[0.0]");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.insere("", (java.lang.Object) 0.0f);
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        tabelaHash15.retira("hi!");
        java.lang.Object[] objArray19 = tabelaHash15.recuperaItens();
        java.lang.Object[] objArray20 = tabelaHash15.recuperaItens();
        java.lang.Object obj22 = tabelaHash15.pesquisa("");
        tabelaHash5.insere("hi!", (java.lang.Object) tabelaHash15);
        java.lang.Object[] objArray24 = tabelaHash15.recuperaItens();
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object[] objArray10 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray10);
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray17 = tabelaHash13.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.retira("");
        java.lang.Object[] objArray24 = tabelaHash20.recuperaItens();
        tabelaHash13.insere("", (java.lang.Object) tabelaHash20);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0.0]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) 0.0f);
        tabelaHash10.imprime();
        java.lang.Object obj16 = tabelaHash10.pesquisa("hi!");
        tabelaHash0.insere("", obj16);
        java.lang.Object obj19 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) 0.0f);
        tabelaHash12.imprime();
        tabelaHash12.retira("");
        tabelaHash12.retira("hi!");
        java.lang.Object obj22 = tabelaHash12.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass6 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0f + "'", obj9, 0.0f);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[0.0]");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass9 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.retira("hi!");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray25 = tabelaHash21.recuperaItens();
        java.lang.Object obj27 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.retira("hi!");
        tabelaHash15.insere("", (java.lang.Object) tabelaHash21);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash21);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.retira("");
        tabelaHash34.imprime();
        tabelaHash34.retira("hi!");
        tabelaHash34.retira("hi!");
        tabelaHash34.retira("hi!");
        tabelaHash34.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash34);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[0.0]");
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray12 = tabelaHash8.recuperaItens();
        java.lang.Object obj14 = tabelaHash8.pesquisa("");
        java.lang.Object obj16 = null;
        tabelaHash8.insere("", obj16);
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object[] objArray19 = tabelaHash0.recuperaItens();
        java.lang.Object obj21 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Object obj25 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0f + "'", obj14, 0.0f);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[, 1]");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "" + "'", obj21, "");
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) 0.0f);
        tabelaHash12.imprime();
        tabelaHash12.retira("");
        tabelaHash12.retira("hi!");
        tabelaHash12.retira("");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("", (java.lang.Object) 0.0f);
        tabelaHash24.imprime();
        tabelaHash24.retira("");
        tabelaHash24.retira("hi!");
        java.lang.Object obj34 = tabelaHash24.pesquisa("");
        tabelaHash12.insere("", (java.lang.Object) tabelaHash24);
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object obj38 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray44 = tabelaHash40.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash40);
        tabelaHash40.retira("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "" + "'", obj38, "");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[0.0]");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) 0.0f);
        tabelaHash10.imprime();
        tabelaHash10.retira("");
        java.lang.Object obj18 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash10.retira("hi!");
        tabelaHash10.imprime();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.retira("hi!");
        java.lang.Object obj15 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.insere("hi!", (java.lang.Object) (short) 0);
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 0);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.imprime();
        tabelaHash22.retira("");
        java.lang.Object[] objArray26 = tabelaHash22.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray26);
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) 0.0f);
        tabelaHash10.imprime();
        tabelaHash10.retira("");
        tabelaHash10.retira("hi!");
        java.lang.Object obj20 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray20 = tabelaHash16.recuperaItens();
        tabelaHash16.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj25 = tabelaHash16.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        tabelaHash0.imprime();
        java.lang.Object obj29 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0.0f + "'", obj25, 0.0f);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "" + "'", obj29, "");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("", (java.lang.Object) 0);
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass9 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object[] objArray17 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[0.0]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray12 = tabelaHash8.recuperaItens();
        java.lang.Object obj14 = tabelaHash8.pesquisa("");
        java.lang.Object obj16 = null;
        tabelaHash8.insere("", obj16);
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass20 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0f + "'", obj14, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj12 = tabelaHash7.pesquisa("hi!");
        java.lang.Class<?> wildcardClass13 = tabelaHash7.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray11 = tabelaHash7.recuperaItens();
        java.lang.Object[] objArray12 = tabelaHash7.recuperaItens();
        java.lang.Object[] objArray13 = tabelaHash7.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash7.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[0.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[0.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0.0]");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[0.0]");
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash9.imprime();
        tabelaHash9.imprime();
        java.lang.Object[] objArray13 = tabelaHash9.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash9.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray14);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0.0]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0f + "'", obj11, 0.0f);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.retira("");
        tabelaHash10.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj18 = tabelaHash10.pesquisa("");
        java.lang.Object obj20 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray17 = tabelaHash13.recuperaItens();
        java.lang.Object obj19 = tabelaHash13.pesquisa("");
        java.lang.Object obj21 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        java.lang.Object obj24 = tabelaHash13.pesquisa("");
        tabelaHash13.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0.0]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0.0f + "'", obj19, 0.0f);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0.0f + "'", obj24, 0.0f);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0]");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = obj8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
        tabelaHash2.insere("", (java.lang.Object) 0.0f);
        tabelaHash2.imprime();
        tabelaHash2.retira("");
        tabelaHash2.imprime();
        tabelaHash2.insere("hi!", (java.lang.Object) 10L);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.retira("");
        tabelaHash14.imprime();
        tabelaHash14.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.imprime();
        java.lang.Object[] objArray24 = tabelaHash22.recuperaItens();
        tabelaHash14.insere("hi!", (java.lang.Object) objArray24);
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray31 = tabelaHash27.recuperaItens();
        tabelaHash14.insere("", (java.lang.Object) tabelaHash27);
        tabelaHash2.insere("hi!", (java.lang.Object) tabelaHash27);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj36 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[0.0]");
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass11 = objArray10.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0f + "'", obj9, 0.0f);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj15 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        java.lang.Object obj18 = tabelaHash10.pesquisa("");
        java.lang.Object[] objArray19 = tabelaHash10.recuperaItens();
        tabelaHash10.retira("hi!");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray27 = tabelaHash23.recuperaItens();
        java.lang.Object[] objArray28 = tabelaHash23.recuperaItens();
        tabelaHash23.retira("hi!");
        tabelaHash10.insere("", (java.lang.Object) tabelaHash23);
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object[] objArray33 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0.0]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0.0f + "'", obj18, 0.0f);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[0.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[0.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[0.0]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[0.0]");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass12 = tabelaHash8.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass12);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj18 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0.0f + "'", obj18, 0.0f);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass6 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) 0.0f);
        tabelaHash12.imprime();
        tabelaHash12.retira("");
        tabelaHash12.retira("hi!");
        java.lang.Object obj22 = tabelaHash12.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray14 = tabelaHash10.recuperaItens();
        java.lang.Object obj16 = tabelaHash10.pesquisa("");
        java.lang.Object obj18 = null;
        tabelaHash10.insere("", obj18);
        java.lang.Object[] objArray20 = tabelaHash10.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        tabelaHash0.retira("");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0f + "'", obj16, 0.0f);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[0.0]");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) 0.0f);
        tabelaHash12.imprime();
        tabelaHash12.retira("");
        tabelaHash12.retira("hi!");
        tabelaHash12.retira("");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("", (java.lang.Object) 0.0f);
        tabelaHash24.imprime();
        tabelaHash24.retira("");
        tabelaHash24.retira("hi!");
        java.lang.Object obj34 = tabelaHash24.pesquisa("");
        tabelaHash12.insere("", (java.lang.Object) tabelaHash24);
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object obj38 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray44 = tabelaHash40.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash40);
        java.lang.Object[] objArray46 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray47 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "" + "'", obj38, "");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[0.0]");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[, ]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[, ]");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object[] objArray10 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray10);
        tabelaHash0.retira("");
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        java.lang.Object[] objArray20 = tabelaHash16.recuperaItens();
        java.lang.Object obj22 = tabelaHash16.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) 0.0f);
        tabelaHash12.imprime();
        tabelaHash12.retira("");
        tabelaHash12.retira("hi!");
        tabelaHash12.retira("");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("", (java.lang.Object) 0.0f);
        tabelaHash24.imprime();
        tabelaHash24.retira("");
        tabelaHash24.retira("hi!");
        java.lang.Object obj34 = tabelaHash24.pesquisa("");
        tabelaHash12.insere("", (java.lang.Object) tabelaHash24);
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object obj38 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray44 = tabelaHash40.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash40);
        java.lang.Object[] objArray46 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        tabelaHash48.imprime();
        tabelaHash48.retira("hi!");
        java.lang.Object[] objArray52 = tabelaHash48.recuperaItens();
        java.lang.Object[] objArray53 = tabelaHash48.recuperaItens();
        java.lang.Object obj55 = tabelaHash48.pesquisa("");
        tabelaHash0.insere("", obj55);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "" + "'", obj38, "");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[0.0]");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[, ]");
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[]");
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
        org.junit.Assert.assertNull(obj55);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object[] objArray10 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray10);
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray17 = tabelaHash13.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        java.lang.Object obj20 = tabelaHash13.pesquisa("");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0.0f + "'", obj20, 0.0f);
    }
}

