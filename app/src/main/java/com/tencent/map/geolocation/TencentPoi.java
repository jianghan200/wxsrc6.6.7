package com.tencent.map.geolocation;

public abstract interface TencentPoi
{
  public abstract String getAddress();
  
  public abstract String getCatalog();
  
  public abstract String getDirection();
  
  public abstract double getDistance();
  
  public abstract double getLatitude();
  
  public abstract double getLongitude();
  
  public abstract String getName();
  
  public abstract String getUid();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/map/geolocation/TencentPoi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */