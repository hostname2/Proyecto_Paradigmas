
import org.json.JSONObject;




public class EstructuraJson {

    public JSONObject creaInformacion(){
        return new JSONObject(jsonstirng);
    }

    public static String jsonstirng = "{'Autores' : ['Sebastian','Marvin','Grelvin'], 'Grupo':'10 am'}";
    
    public static void main(String[] args){

        //String jsonString = "{'test1':'value1','test2':{'id':0,'name':'testName'}}";
        //String jstring = "{'Autores' : ['Sebastian','Marvin','Grelvin'], 'Grupo':'10 am'}";
        //JSONObject jobj = new JSONObject(jstring);
        //System.out.println(jobj.toString());
    }

}
