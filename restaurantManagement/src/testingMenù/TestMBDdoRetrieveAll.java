package testingMenù;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import model.MenùBean;
import model.MenùBeanDAO;

class TestMBDdoRetrieveAll {
	private MenùBean mb = new MenùBean();
	private MenùBeanDAO mbd = new MenùBeanDAO();
	private ArrayList<MenùBean> menu;
	
	@Before
    public void setUp() {
        menu = new ArrayList<MenùBean>();
    }
	
	@Test
	public void doRetirieveAllTest() {
		assertEquals(true, mbd.doRetrieveAll().size()>0);
	}
	 @After
    public void tearDown() {
        menu = null;
    }

 	@Test
    public void testForException() {
        Object o = menu.get(0);
    }
    
}
