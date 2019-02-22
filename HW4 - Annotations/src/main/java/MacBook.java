import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MacBook {
    @Autowired
    @Qualifier("large")
    Battery battery;

    @Autowired
    @Qualifier("retina")
    Display display;

    @Autowired
    @Qualifier("Radeon")
    GPU gpu;

    String name;

    public MacBook(String name) {
        this.name = name;
    }

    public String getInfo() {
        return "Name: " + name + "\n" +battery.batteryInfo() + display.displayInfo() + gpu.gpuInfo();

    }
}
