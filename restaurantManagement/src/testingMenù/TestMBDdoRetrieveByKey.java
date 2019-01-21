package testingMenù;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import model.MenùBean;
import model.MenùBeanDAO;

class TestMBDdoRetrieveByKey {
	MenùBean mb = new MenùBean();
	MenùBeanDAO mbd = new MenùBeanDAO();
	int id = 2300;
	@Test
	public void doRetrieveByKeyTest() {
		assertEquals("Stelle di mare", mbd.doRetrieveByKey(id).getNome());
	}

}
