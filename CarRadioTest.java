import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CarRadioTest {

    @Test
    public void testBackwardFrecuencyFm(){

        //preparo
        CarRadio radio = new CarRadio();
        radio.turnOnOff();

        //actuo
        radio.backwardFrequency();

        //assert
        assertEquals(107.9, radio.getCurrentFrequency(), 0.0001);
    }

    @Test
    public void testBackwardFrequencyAM() {
        //preparo
        CarRadio radio = new CarRadio();
        radio.turnOnOff();
        radio.changeStation("FM");

        //actuo
        radio.backwardFrequency();

        //assert
        assertEquals(1610, radio.getCurrentFrequency(), 0.0001);
    }

    @Test
    public void testLoadSavedFrecuencyFm(){
        //preparo
        CarRadio radio = new CarRadio();
        radio.turnOnOff();
        radio.forwardFrequency();
        double savedFrequency = radio.getCurrentFrequency();

        radio.saveFrequency(savedFrequency, 0);
        radio.forwardFrequency();

        //actuo
        
        radio.loadFrequency(0);

        //assert
        assertEquals(savedFrequency, radio.getCurrentFrequency(), 0.0001);

    }


    
}
