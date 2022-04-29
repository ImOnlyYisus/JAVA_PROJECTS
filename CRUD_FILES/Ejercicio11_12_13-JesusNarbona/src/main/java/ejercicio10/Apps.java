package ejercicio10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "apps")
@XmlAccessorType(XmlAccessType.FIELD)
public class Apps {
    @XmlElement(name = "app",type = App.class)
    private List<App> appList = new ArrayList<>();

    public Apps(List<App> appList) {
        this.appList = appList;
    }

    public Apps() {
    }

    public List<App> getAppList() {
        return appList;
    }

    public void setAppList(List<App> appList) {
        this.appList = appList;
    }
}
