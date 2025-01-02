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
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.insere(item1);
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = arvoreBinaria0.pesquisa(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.insere(item1);
        java.lang.Class<?> wildcardClass3 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        java.lang.Class<?> wildcardClass1 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.insere(item1);
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.insere(item1);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass5 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.insere(item1);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = arvoreBinaria0.pesquisa(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        arvoreBinaria0.insere(item2);
        java.lang.Class<?> wildcardClass4 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.insere(item1);
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        arvoreBinaria0.insere(item2);
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.insere(item1);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        arvoreBinaria0.insere(item7);
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item10 = arvoreBinaria0.pesquisa(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        arvoreBinaria0.insere(item7);
        java.lang.Class<?> wildcardClass9 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.insere(item1);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        arvoreBinaria0.insere(item2);
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = arvoreBinaria0.pesquisa(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass4 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        arvoreBinaria0.insere(item7);
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        arvoreBinaria0.insere(item3);
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = arvoreBinaria0.pesquisa(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.insere(item1);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.insere(item9);
        java.lang.Class<?> wildcardClass11 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.insere(item1);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass6 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass2 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        java.lang.Class<?> wildcardClass5 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.insere(item9);
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item12 = arvoreBinaria0.pesquisa(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.insere(item1);
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = arvoreBinaria0.pesquisa(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass7 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.insere(item1);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        java.lang.Class<?> wildcardClass9 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass8 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        ds.Item item6 = null;
        arvoreBinaria0.insere(item6);
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = arvoreBinaria0.pesquisa(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        java.lang.Class<?> wildcardClass6 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.insere(item1);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.insere(item9);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass13 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.insere(item9);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = arvoreBinaria0.pesquisa(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        ds.Item item6 = null;
        arvoreBinaria0.retira(item6);
        ds.Item item8 = null;
        arvoreBinaria0.insere(item8);
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.insere(item1);
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.insere(item1);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        ds.Item item6 = null;
        arvoreBinaria0.retira(item6);
        ds.Item item8 = null;
        arvoreBinaria0.insere(item8);
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.insere(item7);
        java.lang.Class<?> wildcardClass9 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.insere(item9);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass14 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        ds.Item item6 = null;
        arvoreBinaria0.retira(item6);
        ds.Item item8 = null;
        arvoreBinaria0.insere(item8);
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = arvoreBinaria0.pesquisa(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        java.lang.Class<?> wildcardClass13 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass12 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        arvoreBinaria0.insere(item3);
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.insere(item1);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass7 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.insere(item1);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.insere(item1);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.insere(item1);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item10 = arvoreBinaria0.pesquisa(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        java.lang.Class<?> wildcardClass13 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.insere(item1);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass9 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        arvoreBinaria0.insere(item11);
        java.lang.Class<?> wildcardClass13 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass11 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.insere(item9);
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass12 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = item4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass10 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass7 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.insere(item1);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = arvoreBinaria0.pesquisa(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        java.lang.Class<?> wildcardClass12 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.insere(item4);
        java.lang.Class<?> wildcardClass6 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        java.lang.Class<?> wildcardClass10 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        ds.Item item6 = null;
        arvoreBinaria0.retira(item6);
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        java.lang.Class<?> wildcardClass10 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.insere(item7);
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item10 = arvoreBinaria0.pesquisa(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        arvoreBinaria0.insere(item11);
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        ds.Item item13 = null;
        arvoreBinaria0.insere(item13);
        java.lang.Class<?> wildcardClass15 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.insere(item1);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = arvoreBinaria0.pesquisa(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        java.lang.Class<?> wildcardClass6 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.insere(item9);
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        java.lang.Class<?> wildcardClass5 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.insere(item1);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = arvoreBinaria0.pesquisa(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.insere(item4);
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass12 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.insere(item1);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        arvoreBinaria0.insere(item3);
        java.lang.Class<?> wildcardClass5 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.insere(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = arvoreBinaria0.pesquisa(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        java.lang.Class<?> wildcardClass7 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.insere(item9);
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        java.lang.Class<?> wildcardClass14 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.insere(item4);
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.insere(item7);
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        arvoreBinaria0.insere(item11);
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        arvoreBinaria0.insere(item12);
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        ds.Item item13 = null;
        arvoreBinaria0.insere(item13);
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass16 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.insere(item1);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        java.lang.Class<?> wildcardClass10 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.insere(item4);
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = arvoreBinaria0.pesquisa(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        arvoreBinaria0.insere(item11);
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item14 = arvoreBinaria0.pesquisa(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        ds.Item item13 = null;
        arvoreBinaria0.insere(item13);
        arvoreBinaria0.testa();
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item5 = null;
        arvoreBinaria0.insere(item5);
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        ds.Item item11 = null;
        arvoreBinaria0.insere(item11);
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.insere(item9);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item16 = arvoreBinaria0.pesquisa(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.insere(item1);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item12 = arvoreBinaria0.pesquisa(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.insere(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass4 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        ds.Item item13 = null;
        arvoreBinaria0.insere(item13);
        arvoreBinaria0.testa();
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        ds.Item item13 = null;
        arvoreBinaria0.insere(item13);
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        ds.Item item10 = null;
        arvoreBinaria0.insere(item10);
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        arvoreBinaria0.testa();
        ds.Item item6 = null;
        arvoreBinaria0.insere(item6);
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = arvoreBinaria0.pesquisa(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        ds.Item item14 = null;
        arvoreBinaria0.insere(item14);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        java.lang.Class<?> wildcardClass9 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.insere(item1);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        arvoreBinaria0.testa();
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        ds.Item item8 = null;
        arvoreBinaria0.insere(item8);
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        ds.Item item13 = null;
        arvoreBinaria0.insere(item13);
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item16 = arvoreBinaria0.pesquisa(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.insere(item9);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.insere(item9);
        arvoreBinaria0.testa();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        arvoreBinaria0.testa();
        ds.Item item6 = null;
        arvoreBinaria0.insere(item6);
        arvoreBinaria0.testa();
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        arvoreBinaria0.testa();
        ds.Item item6 = null;
        arvoreBinaria0.insere(item6);
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass9 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        ds.Item item14 = null;
        arvoreBinaria0.insere(item14);
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.insere(item9);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        ds.Item item16 = null;
        arvoreBinaria0.insere(item16);
        java.lang.Class<?> wildcardClass18 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass13 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        arvoreBinaria0.insere(item11);
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass3 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.insere(item9);
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        arvoreBinaria0.insere(item12);
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = arvoreBinaria0.pesquisa(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        java.lang.Class<?> wildcardClass11 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        arvoreBinaria0.testa();
        ds.Item item6 = null;
        arvoreBinaria0.insere(item6);
        arvoreBinaria0.testa();
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.insere(item7);
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        java.lang.Class<?> wildcardClass12 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        ds.Item item11 = null;
        arvoreBinaria0.insere(item11);
        java.lang.Class<?> wildcardClass13 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        ds.Item item13 = arvoreBinaria0.pesquisa(item12);
        java.lang.Class<?> wildcardClass14 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        ds.Item item14 = null;
        ds.Item item15 = arvoreBinaria0.pesquisa(item14);
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        arvoreBinaria0.testa();
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        arvoreBinaria0.testa();
        ds.Item item17 = null;
        arvoreBinaria0.retira(item17);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass11 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        ds.Item item14 = null;
        ds.Item item15 = arvoreBinaria0.pesquisa(item14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = item15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        arvoreBinaria0.testa();
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = item7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        ds.Item item6 = null;
        arvoreBinaria0.retira(item6);
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        ds.Item item10 = null;
        arvoreBinaria0.insere(item10);
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        java.lang.Class<?> wildcardClass14 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        arvoreBinaria0.insere(item11);
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.insere(item1);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass10 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        ds.Item item13 = null;
        ds.Item item14 = arvoreBinaria0.pesquisa(item13);
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass16 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        arvoreBinaria0.testa();
        ds.Item item13 = null;
        arvoreBinaria0.insere(item13);
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass11 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        arvoreBinaria0.testa();
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        java.lang.Class<?> wildcardClass13 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.insere(item4);
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass7 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        arvoreBinaria0.testa();
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        java.lang.Class<?> wildcardClass12 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.insere(item7);
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        arvoreBinaria0.insere(item12);
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        ds.Item item13 = null;
        arvoreBinaria0.insere(item13);
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item16 = arvoreBinaria0.pesquisa(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass13 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        ds.Item item13 = null;
        ds.Item item14 = arvoreBinaria0.pesquisa(item13);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        ds.Item item14 = null;
        ds.Item item15 = arvoreBinaria0.pesquisa(item14);
        ds.Item item16 = null;
        arvoreBinaria0.insere(item16);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        ds.Item item13 = null;
        ds.Item item14 = arvoreBinaria0.pesquisa(item13);
        ds.Item item15 = null;
        ds.Item item16 = arvoreBinaria0.pesquisa(item15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = item16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        arvoreBinaria0.insere(item12);
        java.lang.Class<?> wildcardClass14 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        ds.Item item11 = null;
        arvoreBinaria0.insere(item11);
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item14 = arvoreBinaria0.pesquisa(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        ds.Item item13 = null;
        arvoreBinaria0.insere(item13);
        arvoreBinaria0.testa();
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        ds.Item item14 = null;
        ds.Item item15 = arvoreBinaria0.pesquisa(item14);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        arvoreBinaria0.insere(item10);
        java.lang.Class<?> wildcardClass12 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        arvoreBinaria0.insere(item9);
        java.lang.Class<?> wildcardClass11 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        java.lang.Class<?> wildcardClass16 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        ds.Item item6 = null;
        arvoreBinaria0.retira(item6);
        ds.Item item8 = null;
        arvoreBinaria0.insere(item8);
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        java.lang.Class<?> wildcardClass11 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        arvoreBinaria0.insere(item8);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        ds.Item item11 = null;
        arvoreBinaria0.insere(item11);
        arvoreBinaria0.testa();
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        ds.Item item13 = null;
        arvoreBinaria0.insere(item13);
        java.lang.Class<?> wildcardClass15 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        ds.Item item6 = null;
        arvoreBinaria0.insere(item6);
        java.lang.Class<?> wildcardClass8 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.insere(item7);
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        arvoreBinaria0.testa();
        ds.Item item14 = null;
        arvoreBinaria0.insere(item14);
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        ds.Item item13 = null;
        arvoreBinaria0.insere(item13);
        java.lang.Class<?> wildcardClass15 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        ds.Item item6 = arvoreBinaria0.pesquisa(item5);
        java.lang.Class<?> wildcardClass7 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.insere(item1);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        arvoreBinaria0.insere(item9);
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        ds.Item item6 = arvoreBinaria0.pesquisa(item5);
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        java.lang.Class<?> wildcardClass9 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass15 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.insere(item7);
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass10 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item5 = null;
        arvoreBinaria0.insere(item5);
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = arvoreBinaria0.pesquisa(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        ds.Item item13 = null;
        arvoreBinaria0.insere(item13);
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item16 = arvoreBinaria0.pesquisa(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        arvoreBinaria0.testa();
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        ds.Item item12 = null;
        ds.Item item13 = arvoreBinaria0.pesquisa(item12);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        arvoreBinaria0.testa();
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        ds.Item item8 = null;
        arvoreBinaria0.insere(item8);
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = arvoreBinaria0.pesquisa(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        ds.Item item13 = arvoreBinaria0.pesquisa(item12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = item13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        arvoreBinaria0.testa();
        ds.Item item13 = null;
        arvoreBinaria0.retira(item13);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        ds.Item item6 = arvoreBinaria0.pesquisa(item5);
        java.lang.Class<?> wildcardClass7 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        ds.Item item13 = null;
        arvoreBinaria0.insere(item13);
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = item10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        arvoreBinaria0.insere(item7);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        arvoreBinaria0.testa();
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.insere(item7);
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        arvoreBinaria0.testa();
        ds.Item item6 = null;
        arvoreBinaria0.insere(item6);
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.insere(item5);
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        ds.Item item16 = null;
        arvoreBinaria0.retira(item16);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        ds.Item item13 = arvoreBinaria0.pesquisa(item12);
        ds.Item item14 = null;
        arvoreBinaria0.insere(item14);
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = arvoreBinaria0.pesquisa(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        java.lang.Class<?> wildcardClass14 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.insere(item4);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        arvoreBinaria0.testa();
        ds.Item item13 = null;
        arvoreBinaria0.insere(item13);
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        ds.Item item13 = null;
        arvoreBinaria0.insere(item13);
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass16 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        arvoreBinaria0.testa();
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        arvoreBinaria0.testa();
        ds.Item item17 = null;
        ds.Item item18 = arvoreBinaria0.pesquisa(item17);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item18);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        ds.Item item6 = arvoreBinaria0.pesquisa(item5);
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.insere(item9);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        ds.Item item6 = arvoreBinaria0.pesquisa(item5);
        ds.Item item7 = null;
        arvoreBinaria0.insere(item7);
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass10 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item15 = null;
        arvoreBinaria0.retira(item15);
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass18 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.insere(item9);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass15 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        java.lang.Class<?> wildcardClass7 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        ds.Item item11 = null;
        arvoreBinaria0.insere(item11);
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item14 = arvoreBinaria0.pesquisa(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        ds.Item item6 = null;
        arvoreBinaria0.retira(item6);
        arvoreBinaria0.testa();
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        arvoreBinaria0.testa();
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        ds.Item item16 = null;
        arvoreBinaria0.retira(item16);
        ds.Item item18 = null;
        ds.Item item19 = arvoreBinaria0.pesquisa(item18);
        java.lang.Class<?> wildcardClass20 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        arvoreBinaria0.insere(item12);
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        arvoreBinaria0.testa();
        ds.Item item13 = null;
        arvoreBinaria0.retira(item13);
        ds.Item item15 = null;
        ds.Item item16 = arvoreBinaria0.pesquisa(item15);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        ds.Item item13 = null;
        arvoreBinaria0.retira(item13);
        java.lang.Class<?> wildcardClass15 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        ds.Item item13 = null;
        ds.Item item14 = arvoreBinaria0.pesquisa(item13);
        ds.Item item15 = null;
        ds.Item item16 = arvoreBinaria0.pesquisa(item15);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.insere(item1);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        arvoreBinaria0.testa();
        ds.Item item13 = null;
        arvoreBinaria0.retira(item13);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.insere(item9);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = arvoreBinaria0.pesquisa(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        arvoreBinaria0.testa();
        ds.Item item15 = null;
        ds.Item item16 = arvoreBinaria0.pesquisa(item15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = item16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        ds.Item item6 = null;
        arvoreBinaria0.insere(item6);
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = arvoreBinaria0.pesquisa(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        arvoreBinaria0.testa();
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        arvoreBinaria0.testa();
        ds.Item item17 = null;
        ds.Item item18 = arvoreBinaria0.pesquisa(item17);
        ds.Item item19 = null;
        arvoreBinaria0.insere(item19);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item18);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        ds.Item item13 = arvoreBinaria0.pesquisa(item12);
        ds.Item item14 = null;
        arvoreBinaria0.insere(item14);
        java.lang.Class<?> wildcardClass16 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.insere(item9);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = item7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item15 = null;
        arvoreBinaria0.retira(item15);
        arvoreBinaria0.testa();
        ds.Item item18 = null;
        arvoreBinaria0.retira(item18);
        java.lang.Class<?> wildcardClass20 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        arvoreBinaria0.insere(item11);
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        arvoreBinaria0.insere(item12);
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.insere(item9);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item14 = arvoreBinaria0.pesquisa(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        arvoreBinaria0.testa();
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        ds.Item item16 = null;
        ds.Item item17 = arvoreBinaria0.pesquisa(item16);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        arvoreBinaria0.testa();
        ds.Item item13 = null;
        arvoreBinaria0.insere(item13);
        java.lang.Class<?> wildcardClass15 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        ds.Item item6 = null;
        arvoreBinaria0.retira(item6);
        ds.Item item8 = null;
        arvoreBinaria0.insere(item8);
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item12 = arvoreBinaria0.pesquisa(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.insere(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        arvoreBinaria0.insere(item11);
        arvoreBinaria0.testa();
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item15 = null;
        arvoreBinaria0.retira(item15);
        ds.Item item17 = null;
        arvoreBinaria0.retira(item17);
        ds.Item item19 = null;
        arvoreBinaria0.retira(item19);
        ds.Item item21 = null;
        arvoreBinaria0.retira(item21);
        ds.Item item23 = null;
        ds.Item item24 = arvoreBinaria0.pesquisa(item23);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item24);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        ds.Item item13 = null;
        arvoreBinaria0.insere(item13);
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        java.lang.Class<?> wildcardClass5 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        ds.Item item10 = null;
        arvoreBinaria0.insere(item10);
        java.lang.Class<?> wildcardClass12 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.insere(item7);
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        ds.Item item6 = null;
        arvoreBinaria0.retira(item6);
        java.lang.Class<?> wildcardClass8 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        arvoreBinaria0.testa();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        ds.Item item13 = arvoreBinaria0.pesquisa(item12);
        ds.Item item14 = null;
        arvoreBinaria0.insere(item14);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        ds.Item item10 = null;
        arvoreBinaria0.insere(item10);
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        arvoreBinaria0.testa();
        ds.Item item17 = null;
        arvoreBinaria0.insere(item17);
        arvoreBinaria0.testa();
        ds.Item item20 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass14 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        arvoreBinaria0.retira(item2);
        ds.Item item4 = null;
        arvoreBinaria0.insere(item4);
        java.lang.Class<?> wildcardClass6 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        arvoreBinaria0.testa();
        ds.Item item14 = null;
        arvoreBinaria0.insere(item14);
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        ds.Item item16 = null;
        arvoreBinaria0.insere(item16);
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        arvoreBinaria0.testa();
        ds.Item item14 = null;
        ds.Item item15 = arvoreBinaria0.pesquisa(item14);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        arvoreBinaria0.insere(item12);
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass10 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        ds.Item item11 = null;
        arvoreBinaria0.insere(item11);
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.insere(item1);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        arvoreBinaria0.testa();
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        ds.Item item8 = null;
        arvoreBinaria0.insere(item8);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        ds.Item item13 = arvoreBinaria0.pesquisa(item12);
        ds.Item item14 = null;
        arvoreBinaria0.insere(item14);
        arvoreBinaria0.testa();
        ds.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass15 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item13 = null;
        arvoreBinaria0.retira(item13);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        ds.Item item10 = null;
        arvoreBinaria0.insere(item10);
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = arvoreBinaria0.pesquisa(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        java.lang.Class<?> wildcardClass11 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.insere(item1);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        ds.Item item13 = arvoreBinaria0.pesquisa(item12);
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        ds.Item item6 = arvoreBinaria0.pesquisa(item5);
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass8 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        arvoreBinaria0.testa();
        ds.Item item14 = null;
        arvoreBinaria0.insere(item14);
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = arvoreBinaria0.pesquisa(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.insere(item5);
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = arvoreBinaria0.pesquisa(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        arvoreBinaria0.testa();
        ds.Item item17 = null;
        arvoreBinaria0.insere(item17);
        ds.Item item19 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        arvoreBinaria0.testa();
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        ds.Item item16 = null;
        arvoreBinaria0.insere(item16);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        ds.Item item12 = null;
        arvoreBinaria0.insere(item12);
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        ds.Item item13 = arvoreBinaria0.pesquisa(item12);
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        ds.Item item16 = null;
        arvoreBinaria0.retira(item16);
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass19 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        arvoreBinaria0.testa();
        ds.Item item14 = null;
        ds.Item item15 = arvoreBinaria0.pesquisa(item14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = item15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        ds.Item item13 = null;
        arvoreBinaria0.retira(item13);
        java.lang.Class<?> wildcardClass15 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        ds.Item item11 = null;
        arvoreBinaria0.insere(item11);
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item15 = null;
        arvoreBinaria0.insere(item15);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        ds.Item item13 = null;
        arvoreBinaria0.retira(item13);
        ds.Item item15 = null;
        arvoreBinaria0.insere(item15);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        ds.Item item16 = null;
        ds.Item item17 = arvoreBinaria0.pesquisa(item16);
        ds.Item item18 = null;
        arvoreBinaria0.insere(item18);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        arvoreBinaria0.testa();
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass17 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        ds.Item item12 = null;
        arvoreBinaria0.insere(item12);
        java.lang.Class<?> wildcardClass14 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        arvoreBinaria0.testa();
        ds.Item item13 = null;
        arvoreBinaria0.insere(item13);
        arvoreBinaria0.testa();
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        arvoreBinaria0.insere(item11);
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item14 = arvoreBinaria0.pesquisa(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        ds.Item item6 = arvoreBinaria0.pesquisa(item5);
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass8 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        ds.Item item6 = null;
        arvoreBinaria0.retira(item6);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        ds.Item item13 = arvoreBinaria0.pesquisa(item12);
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        ds.Item item16 = null;
        arvoreBinaria0.retira(item16);
        arvoreBinaria0.testa();
        ds.Item item19 = null;
        ds.Item item20 = arvoreBinaria0.pesquisa(item19);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item20);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        java.lang.Class<?> wildcardClass6 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        ds.Item item13 = arvoreBinaria0.pesquisa(item12);
        ds.Item item14 = null;
        arvoreBinaria0.insere(item14);
        arvoreBinaria0.testa();
        ds.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item18 = arvoreBinaria0.pesquisa(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.insere(item7);
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = arvoreBinaria0.pesquisa(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        arvoreBinaria0.testa();
        ds.Item item14 = null;
        arvoreBinaria0.insere(item14);
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        arvoreBinaria0.testa();
        ds.Item item14 = null;
        ds.Item item15 = arvoreBinaria0.pesquisa(item14);
        ds.Item item16 = null;
        ds.Item item17 = arvoreBinaria0.pesquisa(item16);
        ds.Item item18 = null;
        arvoreBinaria0.retira(item18);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        java.lang.Class<?> wildcardClass14 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        arvoreBinaria0.retira(item2);
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        arvoreBinaria0.insere(item9);
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        ds.Item item3 = arvoreBinaria0.pesquisa(item2);
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass12 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        ds.Item item13 = arvoreBinaria0.pesquisa(item12);
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        ds.Item item16 = null;
        arvoreBinaria0.insere(item16);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        arvoreBinaria0.testa();
        ds.Item item15 = null;
        arvoreBinaria0.retira(item15);
        ds.Item item17 = null;
        arvoreBinaria0.insere(item17);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        arvoreBinaria0.testa();
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        ds.Item item8 = null;
        arvoreBinaria0.insere(item8);
        java.lang.Class<?> wildcardClass10 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        arvoreBinaria0.testa();
        ds.Item item13 = null;
        ds.Item item14 = arvoreBinaria0.pesquisa(item13);
        ds.Item item15 = null;
        arvoreBinaria0.retira(item15);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        ds.Item item8 = null;
        arvoreBinaria0.insere(item8);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        arvoreBinaria0.testa();
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        arvoreBinaria0.testa();
        ds.Item item13 = null;
        arvoreBinaria0.retira(item13);
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        arvoreBinaria0.testa();
        ds.Item item14 = null;
        ds.Item item15 = arvoreBinaria0.pesquisa(item14);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        ds.Item item13 = arvoreBinaria0.pesquisa(item12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = item13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        arvoreBinaria0.insere(item12);
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        ds.Item item13 = arvoreBinaria0.pesquisa(item12);
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        ds.Item item16 = null;
        ds.Item item17 = arvoreBinaria0.pesquisa(item16);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        arvoreBinaria0.testa();
        ds.Item item15 = null;
        ds.Item item16 = arvoreBinaria0.pesquisa(item15);
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        arvoreBinaria0.testa();
        ds.Item item15 = null;
        arvoreBinaria0.insere(item15);
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item15 = null;
        arvoreBinaria0.retira(item15);
        ds.Item item17 = null;
        arvoreBinaria0.retira(item17);
        ds.Item item19 = null;
        arvoreBinaria0.retira(item19);
        arvoreBinaria0.testa();
        ds.Item item22 = null;
        ds.Item item23 = arvoreBinaria0.pesquisa(item22);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item23);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        arvoreBinaria0.insere(item12);
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = arvoreBinaria0.pesquisa(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        ds.Item item13 = null;
        arvoreBinaria0.retira(item13);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass14 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        arvoreBinaria0.testa();
        ds.Item item14 = null;
        arvoreBinaria0.insere(item14);
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = arvoreBinaria0.pesquisa(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        arvoreBinaria0.testa();
        ds.Item item13 = null;
        arvoreBinaria0.retira(item13);
        ds.Item item15 = null;
        ds.Item item16 = arvoreBinaria0.pesquisa(item15);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.insere(item7);
        java.lang.Class<?> wildcardClass9 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        ds.Item item10 = null;
        arvoreBinaria0.insere(item10);
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        arvoreBinaria0.testa();
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        ds.Item item16 = null;
        arvoreBinaria0.retira(item16);
        ds.Item item18 = null;
        ds.Item item19 = arvoreBinaria0.pesquisa(item18);
        ds.Item item20 = null;
        ds.Item item21 = arvoreBinaria0.pesquisa(item20);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        arvoreBinaria0.testa();
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        ds.Item item16 = null;
        arvoreBinaria0.retira(item16);
        ds.Item item18 = null;
        arvoreBinaria0.retira(item18);
        java.lang.Class<?> wildcardClass20 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        arvoreBinaria0.testa();
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        ds.Item item16 = null;
        arvoreBinaria0.retira(item16);
        ds.Item item18 = null;
        arvoreBinaria0.retira(item18);
        ds.Item item20 = null;
        arvoreBinaria0.retira(item20);
        arvoreBinaria0.testa();
        ds.Item item23 = null;
        ds.Item item24 = arvoreBinaria0.pesquisa(item23);
        ds.Item item25 = null;
        arvoreBinaria0.retira(item25);
        ds.Item item27 = null;
        arvoreBinaria0.insere(item27);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item24);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        java.lang.Class<?> wildcardClass10 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        ds.Item item6 = null;
        arvoreBinaria0.retira(item6);
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        ds.Item item10 = null;
        arvoreBinaria0.insere(item10);
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        ds.Item item13 = null;
        ds.Item item14 = arvoreBinaria0.pesquisa(item13);
        ds.Item item15 = null;
        ds.Item item16 = arvoreBinaria0.pesquisa(item15);
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        arvoreBinaria0.testa();
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        ds.Item item16 = null;
        arvoreBinaria0.retira(item16);
        ds.Item item18 = null;
        arvoreBinaria0.retira(item18);
        ds.Item item20 = null;
        ds.Item item21 = arvoreBinaria0.pesquisa(item20);
        ds.Item item22 = null;
        arvoreBinaria0.insere(item22);
        ds.Item item24 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item21);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        arvoreBinaria0.testa();
        ds.Item item15 = null;
        arvoreBinaria0.insere(item15);
        ds.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        ds.Item item13 = null;
        ds.Item item14 = arvoreBinaria0.pesquisa(item13);
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        arvoreBinaria0.testa();
        ds.Item item15 = null;
        arvoreBinaria0.retira(item15);
        ds.Item item17 = null;
        ds.Item item18 = arvoreBinaria0.pesquisa(item17);
        java.lang.Class<?> wildcardClass19 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        ds.Item item14 = null;
        ds.Item item15 = arvoreBinaria0.pesquisa(item14);
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        ds.Item item13 = null;
        arvoreBinaria0.insere(item13);
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item16 = arvoreBinaria0.pesquisa(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        arvoreBinaria0.retira(item2);
        ds.Item item4 = null;
        arvoreBinaria0.insere(item4);
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = item7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        arvoreBinaria0.retira(item2);
        arvoreBinaria0.testa();
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item15 = null;
        arvoreBinaria0.retira(item15);
        arvoreBinaria0.testa();
        ds.Item item18 = null;
        arvoreBinaria0.retira(item18);
        ds.Item item20 = null;
        arvoreBinaria0.insere(item20);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        ds.Item item8 = null;
        arvoreBinaria0.insere(item8);
        java.lang.Class<?> wildcardClass10 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        ds.Item item13 = null;
        arvoreBinaria0.retira(item13);
        ds.Item item15 = null;
        arvoreBinaria0.insere(item15);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        arvoreBinaria0.insere(item12);
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass15 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        arvoreBinaria0.testa();
        ds.Item item14 = null;
        arvoreBinaria0.insere(item14);
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        arvoreBinaria0.insere(item12);
        java.lang.Class<?> wildcardClass14 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item15 = null;
        arvoreBinaria0.retira(item15);
        ds.Item item17 = null;
        arvoreBinaria0.retira(item17);
        ds.Item item19 = null;
        arvoreBinaria0.retira(item19);
        ds.Item item21 = null;
        arvoreBinaria0.retira(item21);
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        arvoreBinaria0.testa();
        ds.Item item13 = null;
        ds.Item item14 = arvoreBinaria0.pesquisa(item13);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        ds.Item item10 = null;
        arvoreBinaria0.insere(item10);
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass13 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        ds.Item item10 = null;
        arvoreBinaria0.insere(item10);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        arvoreBinaria0.testa();
        ds.Item item14 = null;
        arvoreBinaria0.insere(item14);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        arvoreBinaria0.insere(item12);
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test345");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        arvoreBinaria0.insere(item12);
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test346");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        arvoreBinaria0.insere(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test347");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        ds.Item item13 = arvoreBinaria0.pesquisa(item12);
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        ds.Item item16 = null;
        arvoreBinaria0.retira(item16);
        arvoreBinaria0.testa();
        ds.Item item19 = null;
        arvoreBinaria0.retira(item19);
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test348");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        ds.Item item16 = null;
        arvoreBinaria0.insere(item16);
        ds.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test349");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item16 = null;
        arvoreBinaria0.insere(item16);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test350");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        arvoreBinaria0.testa();
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        ds.Item item16 = null;
        arvoreBinaria0.retira(item16);
        ds.Item item18 = null;
        arvoreBinaria0.retira(item18);
        ds.Item item20 = null;
        arvoreBinaria0.retira(item20);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test351");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test352");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        ds.Item item6 = null;
        arvoreBinaria0.retira(item6);
        ds.Item item8 = null;
        arvoreBinaria0.insere(item8);
        java.lang.Class<?> wildcardClass10 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test353");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        ds.Item item13 = null;
        arvoreBinaria0.retira(item13);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test354");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        arvoreBinaria0.testa();
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        arvoreBinaria0.testa();
        ds.Item item17 = null;
        arvoreBinaria0.insere(item17);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test355");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        arvoreBinaria0.testa();
        ds.Item item15 = null;
        ds.Item item16 = arvoreBinaria0.pesquisa(item15);
        ds.Item item17 = null;
        ds.Item item18 = arvoreBinaria0.pesquisa(item17);
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item18);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test356");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        ds.Item item16 = null;
        ds.Item item17 = arvoreBinaria0.pesquisa(item16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = item17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test357");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        ds.Item item13 = null;
        ds.Item item14 = arvoreBinaria0.pesquisa(item13);
        ds.Item item15 = null;
        ds.Item item16 = arvoreBinaria0.pesquisa(item15);
        ds.Item item17 = null;
        ds.Item item18 = arvoreBinaria0.pesquisa(item17);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item18);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test358");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        arvoreBinaria0.testa();
        ds.Item item13 = null;
        ds.Item item14 = arvoreBinaria0.pesquisa(item13);
        ds.Item item15 = null;
        ds.Item item16 = arvoreBinaria0.pesquisa(item15);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test359");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        ds.Item item6 = arvoreBinaria0.pesquisa(item5);
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test360");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test361");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass5 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test362");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        arvoreBinaria0.testa();
        ds.Item item13 = null;
        arvoreBinaria0.retira(item13);
        ds.Item item15 = null;
        arvoreBinaria0.insere(item15);
        java.lang.Class<?> wildcardClass17 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test363");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test364");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        ds.Item item6 = null;
        arvoreBinaria0.insere(item6);
        java.lang.Class<?> wildcardClass8 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
}

