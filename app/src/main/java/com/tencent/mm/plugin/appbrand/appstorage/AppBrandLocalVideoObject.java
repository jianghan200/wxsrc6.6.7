package com.tencent.mm.plugin.appbrand.appstorage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public class AppBrandLocalVideoObject
  extends AppBrandLocalMediaObject
{
  public static final Parcelable.Creator<AppBrandLocalVideoObject> CREATOR = new AppBrandLocalVideoObject.1();
  public int duration;
  public int height;
  public int size;
  public int width;
  
  public AppBrandLocalVideoObject() {}
  
  private AppBrandLocalVideoObject(Parcel paramParcel)
  {
    super(paramParcel);
    this.duration = paramParcel.readInt();
    this.size = paramParcel.readInt();
    this.width = paramParcel.readInt();
    this.height = paramParcel.readInt();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    return "AppBrandLocalVideoObject{duration=" + this.duration + ", size=" + this.size + ", width=" + this.width + ", height=" + this.height + '}';
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.duration);
    paramParcel.writeInt(this.size);
    paramParcel.writeInt(this.width);
    paramParcel.writeInt(this.height);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appstorage/AppBrandLocalVideoObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */