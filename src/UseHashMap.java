import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class UseHashMap {

    public static void main(String[] args) {

        List<String> cityOfUSA=new ArrayList<String>();
        cityOfUSA.add("Ny");
        cityOfUSA.add("AR");
        cityOfUSA.add("NN");
        cityOfUSA.add("MA");

        List<String> cityOfUK=new ArrayList<String>();
        cityOfUK.add("London");
        cityOfUK.add("Manchester");
        cityOfUK.add("Chelsea");

        List<String> cityOfBD=new ArrayList<String>();
        cityOfBD.add("CTG");
        cityOfBD.add("Dhaka");
        cityOfBD.add("Comilla");

        Map <String, List<String>> listOfcountry=new LinkedHashMap<String, List<String>>();
        listOfcountry.put("BD",cityOfBD);
        listOfcountry.put("USA",cityOfUSA);
        listOfcountry.put("UK",cityOfUK);

        for (Map.Entry<String,List<String>> state:listOfcountry.entrySet()) {
            System.out.println(state.getKey()+ "--"+ state.getValue());

        }



    }
}
