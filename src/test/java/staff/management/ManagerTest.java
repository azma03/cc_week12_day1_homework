package staff.management;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void setUp() throws Exception {
        manager = new Manager("Asma", "ABC 123", 80000, "Operations");
    }

    @Test
    public void canGetName() {
        assertEquals("Asma", manager.getName());
    }

    @Test
    public void canSetName() {
        manager.setName("Sarah");
        assertEquals("Sarah", manager.getName());
    }

    @Test
    public void canSetName__ifNewValueIsNotNull() {
        manager.setName("");
        assertEquals("Asma", manager.getName());
    }

    @Test
    public void canGetNInumber() {
        assertEquals("ABC 123", manager.getNInumber());
    }

    @Test
    public void canSetNInumber() {
        manager.setNInumber("DEF 456");
        assertEquals("DEF 456", manager.getNInumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(80000, manager.getSalary(), 0.01);
    }

    @Test
    public void canSetSalary() {
        manager.setSalary(90000);
        assertEquals(90000, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetDepartmentName() {
        assertEquals("Operations", manager.getDeptName());
    }

    @Test
    public void canSetDepartmentName() {
        manager.setDeptName("Finance");
        assertEquals("Finance", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(500.50);
        assertEquals(80500.50, manager.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary__IfPositiveIncrement() {
        manager.raiseSalary(-500.50);
        assertEquals(80000, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(800, manager.payBonus(), 0.01);
    }
}
