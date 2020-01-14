package tranphuhungbo;

import java.util.ArrayList;

import tranphuhungbean.hangbean;
import tranphuhungdao.hangdao;

public class hangbo {
	hangdao  hang =new hangdao();
	public ArrayList<hangbean> getSach() {
		return hang.getHangFromDatabase();
	}
}
