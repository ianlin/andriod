import net.radzebra.itTalent.dao.*;
import com.google.gson.*;
import com.google.gson.reflect.*;
public class TryGson{

	public static void main(String[] arg)throws Exception{
		println("try GSON");
  		Gson gson = new Gson();
		String talentJson="{'name':'testname','firstname':'Dan','lastname':'Daley','email':'some@gmail.com'}";
		Talent t = gson.fromJson(talentJson,Talent.class);
		println(t);
		println("name: "+ t.getName());
		println("id: "+t.getId());
		println("email: "+t.getEmail());
		
	}

	public static void println(Object msg){
		System.out.println(msg);
	}
}
