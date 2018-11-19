package staff.management.techStaff;

import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setUp() throws Exception {
        developer = new Developer("Scott", "RB 12", 50000);
    }

    @Test
    public void canGetName() {
        assertEquals("Scott", developer.getName());
    }

    @Test
    public void canSetName() {
        developer.setName("Asma");
        assertEquals("Asma", developer.getName());
    }

    @Test
    public void canGetNInumber() {
        assertEquals("RB 12", developer.getNInumber());
    }

    @Test
    public void canSetNInumber() {
        developer.setNInumber("TH 89");
        assertEquals("TH 89", developer.getNInumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(50000, developer.getSalary(), 0.01);
    }

    @Test
    public void canSetSalary() {
        developer.setSalary(55000);
        assertEquals(55000, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(500);
        assertEquals(50500, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(500, developer.payBonus(), 0.01);
    }
}
