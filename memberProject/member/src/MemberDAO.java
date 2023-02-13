package member.src;

import jdbc.src.DBConnection;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO extends DBConnection {
    public MemberDAO(){}
    public static MemberDAO getInstance(){
        return new MemberDAO();
    }
    public int memberWrite(MemberDTO dto){
        // DB연결
        getConnection();
        int result=0;
        //쿼리문작성
        try {

            sql = "insert into member(no, username, tel, email, addr) " +
                    "values(mem_sq.nextval, ?, ?, ?, ?)";
            //prepare
            ps = con.prepareStatement(sql);
            ps.setString(1, dto.getUsername());
            ps.setString(2, dto.getTel());
            ps.setString(3, dto.getEmail());
            ps.setString(4, dto.getAddr());

            //실행결과받기
            result = ps.executeUpdate();

        }catch(Exception e){
            e.printStackTrace();
        }finally {
            dbClose();
        }
        return result;
    }
    //회원전체선택
    public List<MemberDTO> memberAll(){
        List<MemberDTO> list = new ArrayList<MemberDTO>();
        try{
            getConnection();
            sql="select no, username, tel, email, addr, to_char(writedate, 'YYYY-MM-DD') writedate " +
                    "from member order by no";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while(rs.next()){
                MemberDTO dto = new MemberDTO();
                dto.setNo(rs.getInt(1));
                dto.setUsername(rs.getString(2));
                dto.setTel(rs.getString(3));
                dto.setEmail(rs.getString(4));
                dto.setAddr(rs.getString(5));
                dto.setWriteDate(rs.getString(6));
                list.add(dto);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            dbClose();
        }
        return list;
    }

    //회원 검색
    public List<MemberDTO> memberSearchSelect(String searchWord){
        List<MemberDTO> list = new ArrayList<MemberDTO>();
        getConnection();
        try{
            sql = "select no, username, tel, email, addr, to_char(writedate, 'YYYY-MM-DD') writedate " +
                    "from member where username like ? or tel like ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, "%"+searchWord + "%");
            ps.setString(2, "%"+searchWord + "%");
            rs = ps.executeQuery();

            while(rs.next()){
                MemberDTO dto = new MemberDTO();
                dto.setNo(rs.getInt(1));
                dto.setUsername(rs.getString(2));
                dto.setTel(rs.getString(3));
                dto.setEmail(rs.getString(4));
                dto.setAddr(rs.getString(5));
                dto.setWriteDate(rs.getString(6));
                list.add(dto);
            }


        }catch(Exception e){
            e.printStackTrace();
        }finally {
            dbClose();
        }
        return list;

    }
    //회원정보수정
    public int memberUpdate(String username, int edit, String editData){
        getConnection();
        int result=0;
        try{
            String editfield="";
            switch(edit){
                case 1: editfield = "tel"; break;
                case 2: editfield = "email"; break;
                case 3: editfield = "addr"; break;
            }
            sql = "update member set ";
            sql += editfield;
            sql += "=? where username=?";


            ps=con.prepareStatement(sql);
            ps.setString(1, editData);
            ps.setString(2, username);
            result = ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            dbClose();
        }
        return result;
    }

    //회원삭제
    public int memberDelete(int no){
        getConnection();
        int result=0;
        try{
            sql = "delete from member where no=?";
            ps=con.prepareStatement(sql);
            ps.setInt(1, no);
            result = ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            dbClose();
        }
        return result;
    }

}