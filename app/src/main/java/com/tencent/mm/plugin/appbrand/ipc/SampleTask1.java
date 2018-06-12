package com.tencent.mm.plugin.appbrand.ipc;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.mm.sdk.platformtools.x;

public class SampleTask1
  extends MainProcessTask
{
  public static final Parcelable.Creator<SampleTask1> CREATOR = new SampleTask1.1();
  public String fEA;
  public String fEB;
  
  public SampleTask1(Parcel paramParcel)
  {
    g(paramParcel);
  }
  
  public final void aai()
  {
    x.e("SampleTask", this.fEA);
    this.fEB = "String from Main Process";
    ahH();
  }
  
  public final void aaj()
  {
    x.e("SampleTask", this.fEB);
  }
  
  public final void g(Parcel paramParcel)
  {
    this.fEA = paramParcel.readString();
    this.fEB = paramParcel.readString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.fEA);
    paramParcel.writeString(this.fEB);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ipc/SampleTask1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */