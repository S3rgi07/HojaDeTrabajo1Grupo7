import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestStationAndForward {
    @Test
    public void testChangeStationAndForward() {
        CarRadio carRadio = new CarRadio();

        // La radio se enciende en FM
        assert !carRadio.getIsAm();

        // Cambio de estación de FM a Am
        carRadio.changeStation(carRadio.getCurrentStation());
        assert carRadio.getIsAm();

        // Cambio de estación de AM a FM
        carRadio.changeStation(carRadio.getCurrentStation());
        assert !carRadio.getIsAm();

        // Prueba forwardFrequency EN FM
        carRadio.setCurrentFrequency(95.3);
        carRadio.forwardFrequency();
        assert Math.abs(carRadio.getCurrentFrequency() - 95.5) == 0;

        // Cambia a AM y prueba forwardFrequency
        carRadio.changeStation(carRadio.getCurrentStation());
        carRadio.setCurrentFrequency(530);
        carRadio.forwardFrequency();
        assert carRadio.getCurrentFrequency() == 540;

    }
}
