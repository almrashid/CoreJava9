import java.util.HashMap;
import java.util.Map;

public class UseMap {


    public static void main(String[] args) {
        Map<String, String> cityCounty=new HashMap<String,String>();
        cityCounty.put("US", "NY");
        cityCounty.put("UK","London");
        cityCounty.put("Canada", "torento");

        for (Map.Entry<String,String> state : cityCounty.entrySet()) {
            System.out.println (state.getKey()+"==="+state.getValue());
        }

        }



    }


