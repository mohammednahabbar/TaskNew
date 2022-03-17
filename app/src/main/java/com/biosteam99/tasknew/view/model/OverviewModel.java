package com.biosteam99.tasknew.view.model;

public class OverviewModel {

   private String title;
   private String desc;
   private String time;

   public OverviewModel(String title, String desc, String time) {
      this.title = title;
      this.desc = desc;
      this.time = time;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getDesc() {
      return desc;
   }

   public void setDesc(String desc) {
      this.desc = desc;
   }

   public String getTime() {
      return time;
   }

   public void setTime(String time) {
      this.time = time;
   }
}
