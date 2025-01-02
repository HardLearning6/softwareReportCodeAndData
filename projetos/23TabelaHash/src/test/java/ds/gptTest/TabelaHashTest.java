package ds.gptTest;

import ds.MeuItem;
import ds.TabelaHash;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class TabelaHashTest {

    private TabelaHash tabelaHash;

    @Before
    public void setUp() throws Exception {
        tabelaHash = new TabelaHash();
    }

    @Test(timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        assertNotNull(tabelaHash);
    }

    @Test(timeout = 1000)
    public void testInsereAndPesquisa() throws Exception {
        String chave = "key1";
        Object item = new MeuItem(1);
        tabelaHash.insere(chave, item);
        assertEquals(item, tabelaHash.pesquisa(chave));
    }

    @Test(timeout = 1000)
    public void testInsereDuplicateKey() throws Exception {
        String chave = "key2";
        Object item = new MeuItem(2);
        tabelaHash.insere(chave, item);
        tabelaHash.insere(chave, new MeuItem(3)); // Duplicate insert
        assertEquals(item, tabelaHash.pesquisa(chave)); // Should still return the first item
    }

    @Test(timeout = 1000)
    public void testRetira() throws Exception {
        String chave = "key3";
        Object item = new MeuItem(3);
        tabelaHash.insere(chave, item);
        tabelaHash.retira(chave);
        assertNull(tabelaHash.pesquisa(chave)); // Should return null after removal
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testRetiraNonExistentKey() throws Exception {
        tabelaHash.retira("nonExistentKey"); // Should throw an exception
    }

    @Test(timeout = 1000)
    public void testRecuperaItens() throws Exception {
        String chave1 = "key4";
        String chave2 = "key5";
        Object item1 = new MeuItem(4);
        Object item2 = new MeuItem(5);
        tabelaHash.insere(chave1, item1);
        tabelaHash.insere(chave2, item2);
        Object[] itens = tabelaHash.recuperaItens();
        assertEquals(2, itens.length); // Should return 2 items
    }

    @Test(timeout = 1000)
    public void testImprime() throws Exception {
        // This test is more of an integration test as it prints to console.
        // We will insert items and check if they are present in the tabela
        String chave = "key6";
        Object item = new MeuItem(6);
        tabelaHash.insere(chave, item);
        // No assertion here, just ensuring it runs without exceptions
        tabelaHash.imprime();
    }

    @Test(timeout = 1000)
    public void testPesquisaNonExistentKey() throws Exception {
        assertNull(tabelaHash.pesquisa("nonExistentKey")); // Should return null
    }

    @Test(timeout = 1000)
    public void testBoundaryValues() throws Exception {
        // Test with boundary key lengths or special characters
        String chave = ""; // Empty string
        Object item = new MeuItem(7);
        tabelaHash.insere(chave, item);
        assertEquals(item, tabelaHash.pesquisa(chave));

        chave = "keyWithMaxLength"; // Assuming this is within any defined max length
        tabelaHash.insere(chave, new MeuItem(8));
        assertNotNull(tabelaHash.pesquisa(chave));
    }
}