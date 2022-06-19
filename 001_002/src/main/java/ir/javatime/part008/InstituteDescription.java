package ir.javatime.part008;

/**
 * @author Edris Ahani (edris.ahani.tutorial@gmail.com)
 * Date: 5/17/2022
 * Time: 7:57 PM
 */

public class InstituteDescription {
    private String name;
    private String address;
    private String activity;

    public InstituteDescription(String name, String address, String activity) {
        this.name = name;
        this.address = address;
        this.activity = activity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    @Override
    public String toString() {
        return "InstituteDescription{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", activity='" + activity + '\'' +
                '}';
    }
}
