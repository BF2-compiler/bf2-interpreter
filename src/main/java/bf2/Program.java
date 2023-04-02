package bf2;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public List<Line> lines;

    public Program(){
        this.lines = new ArrayList<>();
    }

    public void addLine(Line line){
        lines.add(line);
    }
}
