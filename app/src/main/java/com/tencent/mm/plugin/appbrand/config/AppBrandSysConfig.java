package com.tencent.mm.plugin.appbrand.config;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.ipcinvoker.extension.a;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle;
import com.tencent.mm.protocal.c.adz;
import com.tencent.mm.protocal.c.dh;
import java.util.ArrayList;

public class AppBrandSysConfig
  implements Parcelable
{
  public static final Parcelable.Creator<AppBrandSysConfig> CREATOR = new AppBrandSysConfig.1();
  public String appId;
  public String bGy;
  public String bKC;
  public String fqJ;
  public String fqK;
  public boolean fqL = false;
  public boolean fqM = false;
  public boolean fqN = false;
  public boolean fqO = false;
  public AppRuntimeApiPermissionBundle fqP;
  public boolean fqQ;
  public int fqR;
  public int fqS;
  public int fqT;
  public int fqU;
  public int fqV;
  public int fqW;
  public int fqX;
  public boolean fqY;
  public long fqZ;
  public boolean fqw = false;
  public int fra;
  public boolean frb;
  public boolean frc;
  public ArrayList<String> frd;
  public ArrayList<String> fre;
  public ArrayList<String> frf;
  public ArrayList<String> frg;
  public boolean frh;
  public int fri;
  public int frj;
  public boolean frk;
  public int frl;
  public final WxaPkgWrappingInfo frm;
  public AppBrandGlobalSystemConfig frn;
  dh fro;
  public adz frp;
  public int uin;
  
  public AppBrandSysConfig()
  {
    this.frm = new WxaPkgWrappingInfo();
  }
  
  protected AppBrandSysConfig(Parcel paramParcel)
  {
    this.uin = paramParcel.readInt();
    this.bGy = paramParcel.readString();
    this.bKC = paramParcel.readString();
    this.appId = paramParcel.readString();
    this.fqJ = paramParcel.readString();
    this.fqK = paramParcel.readString();
    if (paramParcel.readByte() != 0)
    {
      bool1 = true;
      this.fqL = bool1;
      if (paramParcel.readByte() == 0) {
        break label420;
      }
      bool1 = true;
      label102:
      this.fqM = bool1;
      if (paramParcel.readByte() == 0) {
        break label425;
      }
      bool1 = true;
      label116:
      this.fqN = bool1;
      this.fqP = ((AppRuntimeApiPermissionBundle)paramParcel.readParcelable(AppRuntimeApiPermissionBundle.class.getClassLoader()));
      if (paramParcel.readByte() == 0) {
        break label430;
      }
      bool1 = true;
      label146:
      this.fqQ = bool1;
      this.fqR = paramParcel.readInt();
      this.fqS = paramParcel.readInt();
      this.fqT = paramParcel.readInt();
      this.fqU = paramParcel.readInt();
      this.fqV = paramParcel.readInt();
      this.fqW = paramParcel.readInt();
      this.fqX = paramParcel.readInt();
      if (paramParcel.readByte() == 0) {
        break label435;
      }
      bool1 = true;
      label216:
      this.fqY = bool1;
      this.fqZ = paramParcel.readLong();
      this.fra = paramParcel.readInt();
      if (paramParcel.readByte() == 0) {
        break label440;
      }
      bool1 = true;
      label246:
      this.frb = bool1;
      if (paramParcel.readByte() == 0) {
        break label445;
      }
      bool1 = true;
      label260:
      this.frc = bool1;
      this.frd = paramParcel.createStringArrayList();
      this.fre = paramParcel.createStringArrayList();
      this.frf = paramParcel.createStringArrayList();
      this.frg = paramParcel.createStringArrayList();
      this.frm = ((WxaPkgWrappingInfo)paramParcel.readParcelable(WxaPkgWrappingInfo.class.getClassLoader()));
      this.frn = ((AppBrandGlobalSystemConfig)paramParcel.readParcelable(AppBrandGlobalSystemConfig.class.getClassLoader()));
      if (paramParcel.readByte() <= 0) {
        break label450;
      }
      bool1 = true;
      label338:
      this.frh = bool1;
      this.fri = paramParcel.readInt();
      this.frj = paramParcel.readInt();
      this.frl = paramParcel.readInt();
      if (paramParcel.readInt() != 1) {
        break label455;
      }
    }
    label420:
    label425:
    label430:
    label435:
    label440:
    label445:
    label450:
    label455:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.frk = bool1;
      this.frp = ((adz)com.tencent.mm.ipcinvoker.extension.c.a(com.tencent.mm.ipcinvoker.wx_extension.c.class.getName(), paramParcel));
      this.fro = ((dh)com.tencent.mm.ipcinvoker.extension.c.a(com.tencent.mm.ipcinvoker.wx_extension.c.class.getName(), paramParcel));
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label102;
      bool1 = false;
      break label116;
      bool1 = false;
      break label146;
      bool1 = false;
      break label216;
      bool1 = false;
      break label246;
      bool1 = false;
      break label260;
      bool1 = false;
      break label338;
    }
  }
  
  public final long aeg()
  {
    if (this.fro == null) {
      return 0L;
    }
    return this.fro.rdx;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    return "AppBrandSysConfig{uin=" + this.uin + ", brandId='" + this.bGy + '\'' + ", brandName='" + this.bKC + '\'' + ", appId='" + this.appId + '\'' + ", appIconUrl='" + this.fqJ + '\'' + ", debugEnabled=" + this.fqL + ", performancePanelEnabled=" + this.fqM + ", maxWebViewDepth=" + this.fqR + ", maxBackgroundLifeSpan=" + this.fqS + ", maxRequestConcurrent=" + this.fqT + ", maxUploadConcurrent=" + this.fqU + ", maxDownloadConcurrent=" + this.fqV + ", maxWebsocketConnect=" + this.fqW + ", websocketSkipPortCheck=" + this.fqY + ", requestDomains=" + this.frd + ", socketDomains=" + this.fre + ", uploadDomains=" + this.frf + ", downloadDomains=" + this.frg + ", appPkgInfo=" + this.frm + ", systemSettings=" + this.frn + ", runningFlag=" + n.a(this.fro) + '}';
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int j = 1;
    paramParcel.writeInt(this.uin);
    paramParcel.writeString(this.bGy);
    paramParcel.writeString(this.bKC);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.fqJ);
    paramParcel.writeString(this.fqK);
    byte b;
    label74:
    label88:
    int i;
    if (this.fqL)
    {
      b = 1;
      paramParcel.writeByte(b);
      if (!this.fqM) {
        break label368;
      }
      b = 1;
      paramParcel.writeByte(b);
      if (!this.fqN) {
        break label373;
      }
      b = 1;
      paramParcel.writeByte(b);
      paramParcel.writeParcelable(this.fqP, paramInt);
      if (!this.fqQ) {
        break label378;
      }
      i = 1;
      label112:
      paramParcel.writeByte((byte)i);
      paramParcel.writeInt(this.fqR);
      paramParcel.writeInt(this.fqS);
      paramParcel.writeInt(this.fqT);
      paramParcel.writeInt(this.fqU);
      paramParcel.writeInt(this.fqV);
      paramParcel.writeInt(this.fqW);
      paramParcel.writeInt(this.fqX);
      if (!this.fqY) {
        break label384;
      }
      b = 1;
      label184:
      paramParcel.writeByte(b);
      paramParcel.writeLong(this.fqZ);
      paramParcel.writeInt(this.fra);
      if (!this.frb) {
        break label389;
      }
      b = 1;
      label214:
      paramParcel.writeByte(b);
      if (!this.frc) {
        break label394;
      }
      b = 1;
      label228:
      paramParcel.writeByte(b);
      paramParcel.writeStringList(this.frd);
      paramParcel.writeStringList(this.fre);
      paramParcel.writeStringList(this.frf);
      paramParcel.writeStringList(this.frg);
      paramParcel.writeParcelable(this.frm, paramInt);
      paramParcel.writeParcelable(this.frn, paramInt);
      if (!this.frh) {
        break label399;
      }
      b = 1;
      label292:
      paramParcel.writeByte(b);
      paramParcel.writeInt(this.fri);
      paramParcel.writeInt(this.frj);
      paramParcel.writeInt(this.frl);
      if (!this.frk) {
        break label404;
      }
    }
    label368:
    label373:
    label378:
    label384:
    label389:
    label394:
    label399:
    label404:
    for (paramInt = j;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      com.tencent.mm.ipcinvoker.extension.c.fH(com.tencent.mm.ipcinvoker.wx_extension.c.class.getName()).a(this.frp, paramParcel);
      com.tencent.mm.ipcinvoker.extension.c.a(this.fro, paramParcel);
      return;
      b = 0;
      break;
      b = 0;
      break label74;
      b = 0;
      break label88;
      i = 0;
      break label112;
      b = 0;
      break label184;
      b = 0;
      break label214;
      b = 0;
      break label228;
      b = 0;
      break label292;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/config/AppBrandSysConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */