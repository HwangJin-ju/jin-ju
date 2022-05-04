package co.dev.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.dev.DAO;
import co.dev.vo.MemberVO;

public class MemberDAO extends DAO{
	public void modifyMember(MemberVO member) {
		conn = getConnect();
		String sql = "update member \r\n"
				+ "set passwd = ?, \r\n"
				+ "name = ?,\r\n"
				+ "email = ?\r\n"
				+ "where id = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, member.getPasswd());
			psmt.setString(2, member.getName());
			psmt.setString(3, member.getEmail());
			psmt.setString(4, member.getId());
			
			int r= psmt.executeUpdate();
			System.out.println(r + "건 변경됨");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
	}
	
	public void insertMember(MemberVO member) {
		conn = getConnect();
		String sql = "insert into member(id, name, passwd, email) values(?,?,?,?)";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, member.getId());
			psmt.setString(2, member.getName());
			psmt.setString(3, member.getPasswd());
			psmt.setString(4, member.getEmail());
			
			int r = psmt.executeUpdate();
			System.out.println(r+"건 입력");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	
	public List<MemberVO> listMember() {
		conn = getConnect();
		List<MemberVO> list = new ArrayList<MemberVO>();
		try {
			psmt = conn.prepareStatement("select * from member order by id");
			rs = psmt.executeQuery();
			while(rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setEmail(rs.getString("email"));
				vo.setId(rs.getString("id"));
				vo.setName(rs.getString("name"));
				vo.setPasswd(rs.getString("passwd"));
				list.add(vo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	public MemberVO searchMember(String id) {
		conn = getConnect();
		String sql = "select * from member where id=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			if(rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setId(rs.getString("id"));
				vo.setName(rs.getString("name"));
				vo.setEmail(rs.getString("email"));
				vo.setPasswd(rs.getString("passwd"));
				
				return vo;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return null; //조회했는데 없으면 null을 리턴
 	}
	
	public void updateMember(MemberVO vo) {
		conn = getConnect();
		String sql = "update member set name=?, passwd=?, email=? where id=?"; 
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getName());
			psmt.setString(2, vo.getPasswd());
			psmt.setString(3, vo.getEmail());
			psmt.setString(4, vo.getId());
			
			int r = psmt.executeUpdate();
			System.out.println(r+"건 수정됨");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	
	public void deleteMember(String id) {
		conn = getConnect();
		String sql = "delete from member where id=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			int r = psmt.executeUpdate();
			System.out.println(r+ "건 삭제됨");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect(); 
		}
		
	}
}
