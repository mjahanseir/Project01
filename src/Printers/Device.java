package Printers;

public class Device {
    //attribute
    private String deviceID;
    private String deviceName;
    private String deviceSerial;
    private String deviceModel;
    private String deviceBrand;
    //Constructor
    public Device(String deviceID, String deviceName, String deviceSerial, String deviceModel, String deviceBrand) {
        this.deviceID = deviceID;
        this.deviceName = deviceName;
        this.deviceSerial = deviceSerial;
        this.deviceModel = deviceModel;
        this.deviceBrand = deviceBrand;
    }
    //Setter and Getter
    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceSerial() {
        return deviceSerial;
    }

    public void setDeviceSerial(String deviceSerial) {
        this.deviceSerial = deviceSerial;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public String getDeviceBrand() {
        return deviceBrand;
    }

    public void setDeviceBrand(String deviceBrand) {
        this.deviceBrand = deviceBrand;
    }
}
