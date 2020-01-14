package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import bean.loaibean;
import bean.sachbean;

public class loaidao {
	DungChung dc= new DungChung();
	  public ArrayList<loaibean> getloai() throws Exception{
		  ArrayList<loaibean> ds= new ArrayList<loaibean>();
		  //b1: Ket noi vao csdl qlsach
		  dc.KetNoi();
		  //b2: Lay du lieu ve
		  String sql="select * from loai";
		  PreparedStatement cmd= dc.cn.prepareStatement(sql);
		  ResultSet rs= cmd.executeQuery();//Thuc hien cau lenh
		  while(rs.next()){ //duyet qua du lieu trong rs
			   String maloai=rs.getString("maloai");
			   String tenloai=rs.getString("tenloai");
			   ds.add(new loaibean(maloai, tenloai));
		  }
		  //Dong ket noi
		  rs.close();
		  dc.cn.close();
		  return ds;
	  }
}
