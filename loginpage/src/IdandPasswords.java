import java.util.HashMap;

public class IdandPasswords {
    HashMap<String,String> logininfo=new HashMap<String,String>();
    IdandPasswords(){
        logininfo.put("Admin","123");
        logininfo.put("64281","456");
        logininfo.put("64363","789");
    }
    protected HashMap getLoginInfo(){
        return logininfo;
    }
}

