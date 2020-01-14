package bo;

import java.util.ArrayList;

import bean.giohangbean;

public class giohangbo {
   public ArrayList<giohangbean> ds= new ArrayList<giohangbean>();
   public void Them(String masach, String tensach, String tacgia,
			long gia, long soluong){
	   
	   giohangbean gh= new giohangbean(masach, tensach, tacgia, gia,
			   soluong);
	   ds.add(gh);
   }
   public long Tong(){
	   long s=0;
	   for(giohangbean g: ds)
		   s+=g.getThanhtien();
	   return s;
   }
}
