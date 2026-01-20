import java.util.ArrayList;

public class CarRadio {
    private boolean isOn = false;
    private String currentStation;
    private double currentFrecuency;
    private double lastFrecuency = 530;
    private boolean isAm;
    private double[] slotsFavorites = new double[12];



    public void changeStation(String currentStation){
        if (isAm == true) {
            isAm = false;
            double holder = lastFrecuency;
            lastFrecuency = currentFrecuency;
            currentFrecuency = holder;
        }
        else {
            isAm = true;
            double holder = lastFrecuency;
            lastFrecuency = currentFrecuency;
            currentFrecuency = holdader;
        }


    }

    public void forwardFrequency(double currentFrecuency){
        if (isAm == false) {
            if (currentFrecuency < 107.9) {
                currentFrecuency += 0.2;
            }

            else{
                currentFrecuency = 87.9;
            }
        
            
        }
        else if (isAm == true) {
            if (currentFrecuency < 1610) {
                currentFrecuency += 10;
            }

            else{
                currentFrecuency = 530;
            }
        }

    };

    public void backwardFrequency(double currentFrecuency){
        if (isAm == false) {
            if (currentFrecuency > 87.9) {
                currentFrecuency -= 0.2;
            }

            else{
                currentFrecuency = 107.9;
            }
        
            
        }
        else if (isAm == true) {
            if (currentFrecuency > 530) {
                currentFrecuency -= 10;
            }

            else{
                currentFrecuency = 1610;
            }
        }
    };




    

    
}
