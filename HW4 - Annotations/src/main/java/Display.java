import org.springframework.stereotype.Component;

@Component
public class Display {
    String name, resolution;

    Display(String name, String resolution) {
        this.name = name;
        this.resolution = resolution;
    }

    public String displayInfo() {
        return "Display: " + name + " Resolution: " + resolution;
    }
}
