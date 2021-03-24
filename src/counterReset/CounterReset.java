package counterReset;

import java.awt.*;

public class CounterReset extends Panel{
    private long count=0;
    private Label label;
    private long maxValue=100;
    public void setMaxValue(long max) {
        maxValue = max;
    }
    public long getMaxValue() { 
        return maxValue; 
    }
    public CounterReset() {
        setBackground(Color.blue); setForeground(Color.white);
        label = new Label(count+"");
        add(label);
    }
    public void increment () {
        if (count < maxValue) {
            count++;
            label.setText(count+" ");
        }
    }
    
    public void reset() {
        count = 0;
        label.setText(count+"");
    }
}
