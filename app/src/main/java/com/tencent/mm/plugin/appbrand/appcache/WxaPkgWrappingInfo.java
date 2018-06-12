package com.tencent.mm.plugin.appbrand.appcache;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.a.g;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class WxaPkgWrappingInfo
  extends ModulePkgInfo
  implements Parcelable
{
  public static final Parcelable.Creator<WxaPkgWrappingInfo> CREATOR = new Parcelable.Creator() {};
  public int fih;
  public int fii;
  public long fij;
  public boolean fik;
  public final LinkedList<ModulePkgInfo> fil = new LinkedList();
  public final Map<String, String> fim = new HashMap();
  
  public WxaPkgWrappingInfo()
  {
    this.name = "__APP__";
  }
  
  public WxaPkgWrappingInfo(Parcel paramParcel)
  {
    this();
    readFromParcel(paramParcel);
  }
  
  public static WxaPkgWrappingInfo qX(String paramString)
  {
    if (bi.oW(paramString)) {
      return null;
    }
    Object localObject = new ag(new File(paramString));
    if (!((ag)localObject).fgX)
    {
      x.e("MicroMsg.WxaPkgWrappingInfo#obtain", "wxPkg invalid, path = %s ", new Object[] { paramString });
      ((ag)localObject).close();
      return null;
    }
    if (!((ag)localObject).abW())
    {
      x.e("MicroMsg.WxaPkgWrappingInfo#obtain", "wxPkg read info failed, path = %s ", new Object[] { paramString });
      ((ag)localObject).close();
      return null;
    }
    ((ag)localObject).close();
    localObject = new WxaPkgWrappingInfo();
    ((WxaPkgWrappingInfo)localObject).ffK = paramString;
    ((WxaPkgWrappingInfo)localObject).fik = false;
    ((WxaPkgWrappingInfo)localObject).bKg = g.cu(paramString);
    return (WxaPkgWrappingInfo)localObject;
  }
  
  public final void a(WxaPkgWrappingInfo paramWxaPkgWrappingInfo)
  {
    Parcel localParcel = Parcel.obtain();
    localParcel.setDataPosition(0);
    paramWxaPkgWrappingInfo.writeToParcel(localParcel, 0);
    localParcel.setDataPosition(0);
    readFromParcel(localParcel);
    localParcel.recycle();
  }
  
  final void aco()
  {
    Iterator localIterator = this.fil.iterator();
    while (localIterator.hasNext())
    {
      ModulePkgInfo localModulePkgInfo = (ModulePkgInfo)localIterator.next();
      String str = a.qC(localModulePkgInfo.name);
      this.fim.put(str, localModulePkgInfo.name);
      localModulePkgInfo.name = str;
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void readFromParcel(Parcel paramParcel)
  {
    super.readFromParcel(paramParcel);
    this.fih = paramParcel.readInt();
    this.fii = paramParcel.readInt();
    this.fij = paramParcel.readLong();
    if (paramParcel.readByte() != 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.fik = bool;
      paramParcel.readTypedList(this.fil, ModulePkgInfo.CREATOR);
      return;
    }
  }
  
  public final String toString()
  {
    return "WxaPkgWrappingInfo{pkgDebugType=" + this.fih + ", pkgVersion=" + this.fii + ", pkgCreateTime=" + this.fij + ", localPkg=" + this.fik + ", md5='" + this.bKg + '\'' + ", pkgPath='" + this.ffK + '\'' + '}';
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.fih);
    paramParcel.writeInt(this.fii);
    paramParcel.writeLong(this.fij);
    if (this.fik) {}
    for (byte b = 1;; b = 0)
    {
      paramParcel.writeByte(b);
      paramParcel.writeTypedList(this.fil);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/WxaPkgWrappingInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */