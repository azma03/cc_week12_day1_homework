package staff.management;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    
    Director director;

    @Before
    public void setUp() throws Exception {
        director = new Director("Bob", "DTI 789", 100000, "Operations", 50000);
    }

    @Test
    public void canGetName() {
        assertEquals("Bob", director.getName());
    }

    @Test
    public void canSetName() {
        director.setName("Asma");
        assertEquals("Asma", director.getName());
    }

    @Test
    public void canGetNInumber() {
        assertEquals("DTI 789", director.getNInumber());
    }

    @Test
    public void canSetNInumber() {
        director.setNInumber("TYU 234");
        assertEquals("TYU 234", director.getNInumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(100000, director.getSalary(), 0.01);
    }

    @Test
    public void canSetSalary() {
        director.setSalary(120000);
        assertEquals(120000, director.getSalary(), 0.01);
    }

    @Test
    public void canGetDepartmentName() {
        assertEquals("Operations", director.getDeptName());
    }

    @Test
    public void canSetDepartmentName() {
        director.setDeptName("Finance");
        assertEquals("Finance", director.getDeptName());
    }

    @Test
    public void canGetBudget() {
        assertEquals(50000, director.getBudget(), 0.01);
    }

    @Test
    public void canSetBudget() {
        director.setBudget(60000);
        assertEquals(60000, director.getBudget(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(2000);
        assertEquals(102000, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(2000, director.payBonus(), 0.01);
    }
}
