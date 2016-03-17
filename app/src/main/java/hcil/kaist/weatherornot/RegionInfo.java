package hcil.kaist.weatherornot;

/**
 * Created by PCPC on 2016-03-16.
 */
public class RegionInfo extends Thread{
    private String city;

    public RegionInfo(){
        city = "";
    }

    public void update(){
        city = "Daejeon";
    }
    @Override
    public void run(){
        super.run();
        update();
    }

    public String getCity(){
        return  city;
    }
}
