public class AdminLogin {
    final String ID = "master";
    final String PWD = "1234";
    public static String adminId = null; //로그인한 ID
    private String adminPwd = null; // 로그인한 비밀번호
    public static boolean logStatus = false; //로그인 상태
    public AdminLogin(){}
    public AdminLogin(String adminId, String adminPwd){
        //로그인(master, 1234)
        if(adminId.equals(ID) && adminPwd.equals(PWD)){
            this.adminId =adminId;
            this.adminPwd = adminPwd;
            this.logStatus = true;
        }else{
            //로그인 실패
            this.adminId = null;
            this.adminPwd = null;
            this.logStatus = false;
        }

    }
    public void logout(){
        adminId=null;
        adminPwd =null;
        logStatus=false;
    }
}
