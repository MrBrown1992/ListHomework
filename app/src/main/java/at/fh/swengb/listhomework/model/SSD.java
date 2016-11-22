package at.fh.swengb.listhomework.model;
import java.io.Serializable;
/**
 * Created by Nikolaus Spieß on 20.11.16.
 */

public class SSD implements Serializable {

    private double size;
    private String technology;
    private int speed;
    private int capacity;
    private String name;
    private boolean mounted;
    private String serverurl;


    public SSD(int speed, int capacity, String name, double size, String technology, boolean mounted,String serverurl) {
        this.size = size;
        this.technology = technology;
        this.capacity = capacity;
        this.name = name;
        this.speed = speed;
        this.mounted = mounted;
        this.serverurl=serverurl;

    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public String getServerurl() {
        return serverurl;
    }

    public void setServerurl(String serverurl) {
        this.serverurl = serverurl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMounted() {
        return mounted;
    }

    public void setMounted(boolean mounted) {
        this.mounted = mounted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SSD ssd = (SSD) o;

        if (Double.compare(ssd.size, size) != 0) return false;
        if (speed != ssd.speed) return false;
        if (capacity != ssd.capacity) return false;
        if (mounted != ssd.mounted) return false;
        if (technology != null ? !technology.equals(ssd.technology) : ssd.technology != null)
            return false;
        return name != null ? name.equals(ssd.name) : ssd.name == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(size);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (technology != null ? technology.hashCode() : 0);
        result = 31 * result + speed;
        result = 31 * result + capacity;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (mounted ? 1 : 0);
        return result;
    }




    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append(name).append(" ")
                .append(technology)
                .append('\n')
                .append(capacity).append('\n')
                .append(speed);
        return sb.toString();


    }

}