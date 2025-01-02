package ds.gptTest;

import ds.ArvoreBinaria;
import ds.MeuItem;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class ArvoreBinariaTest {

    private ArvoreBinaria arvore;

    @Before
    public void setUp() {
        arvore = new ArvoreBinaria();
    }

    @Test(timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        assertNotNull(arvore);
    }

    @Test(timeout = 1000)
    public void testInsereAndPesquisa() throws Exception {
        MeuItem item = new MeuItem(5);
        arvore.insere(item);
        assertEquals(item, arvore.pesquisa(item));
    }

    @Test(timeout = 1000)
    public void testInsereMultipleItemsAndPesquisa() throws Exception {
        for (int i = 1; i <= 5; i++) {
            arvore.insere(new MeuItem(i));
        }
        for (int i = 1; i <= 5; i++) {
            assertNotNull(arvore.pesquisa(new MeuItem(i)));
        }
    }

    @Test(timeout = 1000)
    public void testPesquisaoInexistente() throws Exception {
        assertNull(arvore.pesquisa(new MeuItem(10)));
    }

    @Test(timeout = 1000)
    public void testRetira() throws Exception {
        MeuItem item = new MeuItem(5);
        arvore.insere(item);
        arvore.retira(item);
        assertNull(arvore.pesquisa(item));
    }

    @Test(timeout = 1000)
    public void testRetiraNonExistent() throws Exception {
        MeuItem item = new MeuItem(10);
        arvore.retira(item); // Should not throw an error
        assertNull(arvore.pesquisa(item));
    }

    @Test(timeout = 1000)
    public void testRetiraAndReinsert() throws Exception {
        MeuItem item = new MeuItem(5);
        arvore.insere(item);
        arvore.retira(item);
        assertNull(arvore.pesquisa(item));
        arvore.insere(item);
        assertEquals(item, arvore.pesquisa(item));
    }

    @Test(timeout = 1000)
    public void testInsertDuplicateItem() throws Exception {
        MeuItem item = new MeuItem(5);
        arvore.insere(item);
        // This should not throw an error, just print to console
        arvore.insere(item); // Attempt to insert duplicate
        assertEquals(item, arvore.pesquisa(item));
    }

    @Test(timeout = 1000)
    public void testRetiraRootNode() throws Exception {
        for (int i = 1; i <= 3; i++) {
            arvore.insere(new MeuItem(i));
        }
        arvore.retira(new MeuItem(2)); // Remove root
        assertNull(arvore.pesquisa(new MeuItem(2)));
    }

    @Test(timeout = 1000)
    public void testTesta() throws Exception {
        for (int i = 1; i <= 5; i++) {
            arvore.insere(new MeuItem(i));
        }
        // This should not throw an error, just print to console
        arvore.testa(); // Testing tree integrity
    }
}