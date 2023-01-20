package member;

import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class memberMgr {
	
	private DBConnectionMgr pool;
	
	public memberMgr() {
		pool = DBConnectionMgr.getInstance();
		
	}
	
	//모든 리스트 : SELECT
	public Vector<MemberBean> selectAll(){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		Vector<MemberBean> vlist = new Vector<MemberBean>();
		try {
			con = pool.getConnection();
			sql = "select * from tblMember";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(); //SQL문 실행
			while(rs.next()) {
				MemberBean bean = new MemberBean();
				bean.setId(rs.getInt("id")); //id : 컬럼명
				bean.setName(rs.getString("name"));
				bean.setPhone(rs.getString("Phone"));
				bean.setAddress(rs.getString("address"));
				bean.setTeam(rs.getString("team"));
				vlist.addElement(bean);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return vlist;
	}
	//저장 : INSERT - db2
	public boolean insert(MemberBean bean) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		boolean flag = false;
		try {
			con = pool.getConnection();
			sql = "insert tblMember values(null, ?, ?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			//첫번째 ?에 매개변수 들어온 빈즈에 name세팅 : 'aaa'
			pstmt.setString(1, bean.getName());
			pstmt.setString(2, bean.getPhone());
			pstmt.setString(3, bean.getAddress());
			pstmt.setString(4, bean.getTeam());
			//insert, update, delete 적용된 레코드 개수
			int cnt = pstmt.executeUpdate();
			if(cnt == 1) flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;
		
	}
	//한 개의 레코드: SELECT
	//수정 UPDATE- db2
	//삭제	DELETE- db2
	//주소검색(우편번호 검색) : select-db1
	public Vector<ZipcodeBean> zipcodeSearch(String area3){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		Vector<ZipcodeBean> vlist = new Vector<ZipcodeBean>();
		try {
			con = pool.getConnection();
			sql = "select * from tblZipcode" + "where area3 like ?";
			pstmt = con.prepareStatement(sql);
			//like '%강남대로%'
			pstmt.setString(1, "%" + area3 + "%");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				ZipcodeBean bean = new ZipcodeBean();
				//select 뒤에 가져오는 컬럼의 index
				bean.setZipcode(rs.getString(1));
				bean.setArea1(rs.getString(2));
				bean.setArea2(rs.getString(3));
				bean.setArea3(rs.getString(4));
				vlist.addElement(bean);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return vlist;
	}
	
	public static void main(String[] args) {
		memberMgr mgr = new memberMgr();
		MemberBean bean = new MemberBean();
		bean.setName("정영하");
		bean.setPhone("010-6555-5555");
		bean.setAddress("부산시");
		bean.setTeam("동의대");
//		boolean flag = mgr.insert(bean);
//		System.out.println(flag);
		//배열과 Vector밑에는 항상 for문 존재
		Vector<MemberBean> vlist = mgr.selectAll();
		for (int i = 0; i < vlist.size(); i++) {
			MemberBean bean1 = vlist.get(i);
			System.out.println(bean1.getId()+"\t" + bean1.getName() + "\t"
					+bean1.getPhone() + "\t" + bean1.getAddress() + "\t"
					+bean1.getTeam());
		}
	}
//	public static void main(String[] args) {
//		memberMgr mgr = new memberMgr();
//		try {
//			Connection con = mgr.pool.getConnection();
//			System.out.println("성공");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

}
