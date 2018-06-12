package com.tencent.mm.plugin.appbrand.report;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class AppBrandStatObject
  implements Parcelable
{
  public static final Parcelable.Creator<AppBrandStatObject> CREATOR = new AppBrandStatObject.1();
  public String bGG;
  public int cbA;
  public int cbB;
  public String cbC;
  public int gqK;
  public int scene;
  
  public AppBrandStatObject() {}
  
  protected AppBrandStatObject(Parcel paramParcel)
  {
    this.cbB = paramParcel.readInt();
    this.cbC = paramParcel.readString();
    this.scene = paramParcel.readInt();
    this.bGG = paramParcel.readString();
    this.gqK = paramParcel.readInt();
    this.cbA = paramParcel.readInt();
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    return "AppBrandStatObject{preScene=" + this.cbB + ", preSceneNote='" + this.cbC + '\'' + ", scene=" + this.scene + ", sceneNote='" + this.bGG + '\'' + ", usedState=" + this.gqK + '}';
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.cbB);
    paramParcel.writeString(this.cbC);
    paramParcel.writeInt(this.scene);
    paramParcel.writeString(this.bGG);
    paramParcel.writeInt(this.gqK);
    paramParcel.writeInt(this.cbA);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/report/AppBrandStatObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */