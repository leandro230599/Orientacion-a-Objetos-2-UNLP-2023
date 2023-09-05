package ar.edu.unlp.info.oo2.ejercicio_01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseRealAccessTest {
    private DatabaseAccess database;
    private List<String> listaCensura;
    private Handler handler;

    @BeforeEach
    void setUp() throws Exception {
        this.database = new DatabaseRealAccessProxy(true);
    }

    @Test
    void testGetSearchResults() {
        assertEquals(Arrays.asList("Spiderman", "Marvel"), this.database.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.database.getSearchResults("select * from comics where id=10"));
    }

    @Test
    void testInsertNewRow() {
        assertEquals(3, this.database.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.database.getSearchResults("select * from comics where id=3"));
    }
}
