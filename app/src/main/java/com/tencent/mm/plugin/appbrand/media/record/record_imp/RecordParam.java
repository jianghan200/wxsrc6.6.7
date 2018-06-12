package com.tencent.mm.plugin.appbrand.media.record.record_imp;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.plugin.appbrand.media.record.b;

public class RecordParam
  implements Parcelable
{
  public static final Parcelable.Creator<RecordParam> CREATOR = new RecordParam.1();
  public int aft = 0;
  public String appId = "";
  public String dfX;
  public int duration = 0;
  public String fIJ;
  public int gji = 0;
  public int gjj = 0;
  public b gjk = b.gic;
  public String processName = "";
  public int sampleRate = 0;
  public int scene = 0;
  
  public RecordParam() {}
  
  public RecordParam(Parcel paramParcel)
  {
    this.duration = paramParcel.readInt();
    this.sampleRate = paramParcel.readInt();
    this.gji = paramParcel.readInt();
    this.gjj = paramParcel.readInt();
    this.fIJ = paramParcel.readString();
    this.dfX = paramParcel.readString();
    this.scene = paramParcel.readInt();
    this.aft = paramParcel.readInt();
    this.processName = paramParcel.readString();
    this.appId = paramParcel.readString();
    this.gjk = b.values()[paramParcel.readInt()];
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.duration);
    paramParcel.writeInt(this.sampleRate);
    paramParcel.writeInt(this.gji);
    paramParcel.writeInt(this.gjj);
    paramParcel.writeString(this.fIJ);
    paramParcel.writeString(this.dfX);
    paramParcel.writeInt(this.scene);
    paramParcel.writeInt(this.aft);
    paramParcel.writeString(this.processName);
    paramParcel.writeString(this.appId);
    paramParcel.writeInt(this.gjk.ordinal());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/media/record/record_imp/RecordParam.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */