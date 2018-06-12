package com.tencent.mm.plugin.appbrand.config;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.sdk.platformtools.bi;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class AppBrandInitConfig
  implements Parcelable
{
  public static final Parcelable.Creator<AppBrandInitConfig> CREATOR = new Parcelable.Creator() {};
  public String appId;
  public int bGM;
  public String bKC;
  public String dFy;
  public String dzR;
  public String extInfo;
  public String fdE;
  public int fig;
  public final AppBrandLaunchReferrer fqA = new AppBrandLaunchReferrer();
  public boolean fqr;
  public boolean fqs;
  public String fqt;
  public String fqu;
  private Boolean fqv;
  public boolean fqw;
  public String fqx;
  public boolean fqy;
  public boolean fqz;
  public String iconUrl;
  public long startTime;
  public String username;
  
  AppBrandInitConfig() {}
  
  private AppBrandInitConfig(Parcel paramParcel)
  {
    this.username = paramParcel.readString();
    this.appId = paramParcel.readString();
    this.bKC = paramParcel.readString();
    this.iconUrl = paramParcel.readString();
    this.fig = paramParcel.readInt();
    this.bGM = paramParcel.readInt();
    if (paramParcel.readByte() != 0)
    {
      bool1 = true;
      this.fqr = bool1;
      if (paramParcel.readByte() == 0) {
        break label213;
      }
      bool1 = true;
      label88:
      this.fqs = bool1;
      if (paramParcel.readByte() == 0) {
        break label218;
      }
      bool1 = true;
      label102:
      this.fqw = bool1;
      this.fqt = paramParcel.readString();
      this.fqu = paramParcel.readString();
      this.extInfo = paramParcel.readString();
      this.fqx = paramParcel.readString();
      this.dFy = paramParcel.readString();
      this.dzR = paramParcel.readString();
      if (paramParcel.readByte() == 0) {
        break label223;
      }
      bool1 = true;
      label164:
      this.fqy = bool1;
      this.startTime = paramParcel.readLong();
      this.fqA.h(paramParcel);
      this.fdE = paramParcel.readString();
      if (paramParcel.readByte() == 0) {
        break label228;
      }
    }
    label213:
    label218:
    label223:
    label228:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.fqz = bool1;
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label88;
      bool1 = false;
      break label102;
      bool1 = false;
      break label164;
    }
  }
  
  public final boolean aaq()
  {
    return 4 == this.bGM;
  }
  
  public final void aea()
  {
    this.fdE = ("SessionId@" + hashCode() + "#" + bi.VF());
  }
  
  public final boolean aeb()
  {
    if (this.fqv != null) {
      return this.fqv.booleanValue();
    }
    if (bi.oW(this.fqu))
    {
      this.fqv = Boolean.valueOf(false);
      return this.fqv.booleanValue();
    }
    try
    {
      JSONArray localJSONArray = new JSONObject(this.fqu).optJSONArray("call_plugin_info");
      if ((localJSONArray == null) || (localJSONArray.length() == 0))
      {
        this.fqv = Boolean.valueOf(false);
        return this.fqv.booleanValue();
      }
      this.fqv = Boolean.valueOf(true);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        this.fqv = Boolean.valueOf(false);
      }
    }
    return this.fqv.booleanValue();
  }
  
  public final JSONObject aec()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("shareKey", this.dzR);
      localJSONObject.put("shareName", this.dFy);
      if (localJSONObject.length() == 0) {
        return null;
      }
      return localJSONObject;
    }
    catch (JSONException localJSONException) {}
    return null;
  }
  
  public final JSONObject aed()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("appId", this.appId);
      localJSONObject.put("nickname", this.bKC);
      localJSONObject.put("icon", this.iconUrl);
      if (localJSONObject.length() == 0) {
        return null;
      }
      return localJSONObject;
    }
    catch (JSONException localJSONException) {}
    return null;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    return "AppBrandInitConfig{visitingSessionId='" + this.fdE + '\'' + ", username='" + this.username + '\'' + ", appId='" + this.appId + '\'' + ", brandName='" + this.bKC + '\'' + ", debugType=" + this.fig + ", isPluginApp=" + this.fqr + ", preferRunInTools=" + this.fqs + ", orientation='" + this.fqt + '\'' + ", enterPath='" + this.fqx + '\'' + ", shareName='" + this.dFy + '\'' + ", shareKey='" + this.dzR + '\'' + ", isStick=" + this.fqy + ", startTime=" + this.startTime + ", attrsFromCgi=" + this.fqz + ", referrer=" + this.fqA + ", extInfo=" + this.extInfo + '}';
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    paramParcel.writeString(this.username);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.bKC);
    paramParcel.writeString(this.iconUrl);
    paramParcel.writeInt(this.fig);
    paramParcel.writeInt(this.bGM);
    byte b;
    if (this.fqr)
    {
      b = 1;
      paramParcel.writeByte(b);
      if (!this.fqs) {
        break label202;
      }
      b = 1;
      label74:
      paramParcel.writeByte(b);
      if (!this.fqw) {
        break label207;
      }
      b = 1;
      label88:
      paramParcel.writeByte(b);
      paramParcel.writeString(this.fqt);
      paramParcel.writeString(this.fqu);
      paramParcel.writeString(this.extInfo);
      paramParcel.writeString(this.fqx);
      paramParcel.writeString(this.dFy);
      paramParcel.writeString(this.dzR);
      if (!this.fqy) {
        break label212;
      }
      b = 1;
      label150:
      paramParcel.writeByte(b);
      paramParcel.writeLong(this.startTime);
      this.fqA.writeToParcel(paramParcel, paramInt);
      paramParcel.writeString(this.fdE);
      if (!this.fqz) {
        break label217;
      }
    }
    label202:
    label207:
    label212:
    label217:
    for (paramInt = i;; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      return;
      b = 0;
      break;
      b = 0;
      break label74;
      b = 0;
      break label88;
      b = 0;
      break label150;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/config/AppBrandInitConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */