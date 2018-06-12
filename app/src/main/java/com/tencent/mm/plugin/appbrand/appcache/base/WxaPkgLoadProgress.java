package com.tencent.mm.plugin.appbrand.appcache.base;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.pluginsdk.g.a.c.k;

public class WxaPkgLoadProgress
  extends k
  implements Parcelable
{
  public static final Parcelable.Creator<WxaPkgLoadProgress> CREATOR = new WxaPkgLoadProgress.1();
  public long fix = -1L;
  public long fiy = -1L;
  public int progress = 0;
  
  public WxaPkgLoadProgress() {}
  
  public WxaPkgLoadProgress(int paramInt, long paramLong1, long paramLong2)
  {
    this.progress = paramInt;
    this.fix = paramLong1;
    this.fiy = paramLong2;
  }
  
  protected WxaPkgLoadProgress(Parcel paramParcel)
  {
    this.progress = paramParcel.readInt();
    this.fix = paramParcel.readLong();
    this.fiy = paramParcel.readLong();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    return "WxaPkgLoadProgress{progress=" + this.progress + ", writtenLength=" + this.fix + ", totalLength=" + this.fiy + '}';
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.progress);
    paramParcel.writeLong(this.fix);
    paramParcel.writeLong(this.fiy);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/base/WxaPkgLoadProgress.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */