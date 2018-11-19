package staff.management.techStaff;

import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    
    DatabaseAdmin databaseAdmin;

    @Before
    public void setUp() throws Exception {
        databaseAdmin = new DatabaseAdmin("Karyn", "QW 234", 50000);
    }

    @Test
    public void canGetName() {
        assertEquals("Karyn", databaseAdmin.getName());
    }

    @Test
    public void canSetName() {
        databaseAdmin.setName("Asma");
        assertEquals("Asma", databaseAdmin.getName());
    }

    @Test
    public void canGetNInumber() {
        assertEquals("QW 234", databaseAdmin.getNInumber());
    }

    @Test
    public void canSetNInumber() {
        databaseAdmin.setNInumber("KL 345");
        assertEquals("KL 345", databaseAdmin.getNInumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(50000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canSetSalary() {
        databaseAdmin.setSalary(55000);
        assertEquals(55000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(500);
        assertEquals(50500, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(500, databaseAdmin.payBonus(), 0.01);
    }
}
