package com.tencent.mm.compatible.loader;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.compatible.util.m;
import java.io.Serializable;

public class PluginDescription
  implements Parcelable, Serializable
{
  public static final Parcelable.Creator<PluginDescription> CREATOR = new PluginDescription.1();
  public final String bKg;
  public final int dfH;
  public final String name;
  public final int size;
  public final String url;
  public final String version;
  
  protected PluginDescription(Parcel paramParcel)
  {
    this.name = ((String)m.Z(paramParcel.readString()));
    this.url = ((String)m.Z(paramParcel.readString()));
    this.bKg = ((String)m.Z(paramParcel.readString()));
    this.version = ((String)m.Z(paramParcel.readString()));
    this.size = paramParcel.readInt();
    this.dfH = paramParcel.readInt();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    return String.format("PluginDescription = [name=%s, url=%s, md5=%s, version=%s, size=%d, downloadType=%d]", new Object[] { this.name, this.url, this.bKg, this.version, Integer.valueOf(this.size), Integer.valueOf(this.dfH) });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.name);
    paramParcel.writeString(this.url);
    paramParcel.writeString(this.bKg);
    paramParcel.writeString(this.version);
    paramParcel.writeInt(this.size);
    paramParcel.writeInt(this.dfH);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/compatible/loader/PluginDescription.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */