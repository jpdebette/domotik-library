package fr.jp.perso.domotik;

public class SmartDeviceDto {
   private Model model;
   private String ipAddress;

   public SmartDeviceDto() {

   }

   public SmartDeviceDto(Model model, String ipAddress) {
      this.model = model;
      this.ipAddress = ipAddress;
   }

   public Model getModel() {
      return model;
   }

   public String getIpAddress() {
      return ipAddress;
   }
}
