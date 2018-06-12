package com.tencent.mm.plugin.game.wepkg.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.plugin.game.wepkg.a.c;
import org.json.JSONException;
import org.json.JSONObject;

public class WepkgVersion
  implements Parcelable
{
  public static final Parcelable.Creator<WepkgVersion> CREATOR = new WepkgVersion.1();
  public String appId;
  public String bKg;
  public String cfx;
  public int cga;
  public String charset;
  public long createTime;
  public String downloadUrl;
  public String ffK;
  public String kfA;
  public boolean kfR;
  public long kfS;
  public long kfT;
  public int kfU;
  public int kfV;
  public long kfW;
  public boolean kfX;
  public boolean kfY;
  public boolean kfZ;
  public int kfm;
  public int kga;
  public String version;
  
  public WepkgVersion() {}
  
  public WepkgVersion(Parcel paramParcel)
  {
    this.kfA = paramParcel.readString();
    this.appId = paramParcel.readString();
    this.version = paramParcel.readString();
    this.ffK = paramParcel.readString();
    if (paramParcel.readByte() != 0)
    {
      bool1 = true;
      this.kfR = bool1;
      this.kfS = paramParcel.readLong();
      this.kfT = paramParcel.readLong();
      this.kfU = paramParcel.readInt();
      this.cfx = paramParcel.readString();
      this.bKg = paramParcel.readString();
      this.downloadUrl = paramParcel.readString();
      this.kfV = paramParcel.readInt();
      this.kfm = paramParcel.readInt();
      this.kfW = paramParcel.readLong();
      this.createTime = paramParcel.readLong();
      this.charset = paramParcel.readString();
      if (paramParcel.readByte() == 0) {
        break label204;
      }
      bool1 = true;
      label149:
      this.kfX = bool1;
      if (paramParcel.readByte() == 0) {
        break label209;
      }
      bool1 = true;
      label163:
      this.kfY = bool1;
      if (paramParcel.readByte() == 0) {
        break label214;
      }
    }
    label204:
    label209:
    label214:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.kfZ = bool1;
      this.kga = paramParcel.readInt();
      this.cga = paramParcel.readInt();
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label149;
      bool1 = false;
      break label163;
    }
  }
  
  public final void a(c paramc)
  {
    if (paramc != null)
    {
      this.kfA = paramc.field_pkgId;
      this.appId = paramc.field_appId;
      this.version = paramc.field_version;
      this.ffK = paramc.field_pkgPath;
      this.kfR = paramc.field_disableWvCache;
      this.kfS = paramc.field_clearPkgTime;
      this.kfT = paramc.field_checkIntervalTime;
      this.kfU = paramc.field_packMethod;
      this.cfx = paramc.field_domain;
      this.bKg = paramc.field_md5;
      this.downloadUrl = paramc.field_downloadUrl;
      this.kfV = paramc.field_pkgSize;
      this.kfm = paramc.field_downloadNetType;
      this.kfW = paramc.field_nextCheckTime;
      this.createTime = paramc.field_createTime;
      this.charset = paramc.field_charset;
      this.kfX = paramc.field_bigPackageReady;
      this.kfY = paramc.field_preloadFilesReady;
      this.kfZ = paramc.field_preloadFilesAtomic;
      this.kga = paramc.field_totalDownloadCount;
      this.cga = paramc.field_downloadTriggerType;
    }
  }
  
  public final JSONObject aVx()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("appId", this.appId);
      localJSONObject.put("version", this.version);
      localJSONObject.put("pkgPath", this.ffK);
      localJSONObject.put("disableWvCache", this.kfR);
      localJSONObject.put("clearPkgTime", this.kfS);
      localJSONObject.put("checkIntervalTime", this.kfT);
      localJSONObject.put("packMethod", this.kfU);
      localJSONObject.put("domain", this.cfx);
      localJSONObject.put("md5", this.bKg);
      localJSONObject.put("downloadUrl", this.downloadUrl);
      localJSONObject.put("pkgSize", this.kfV);
      localJSONObject.put("downloadNetType", this.kfm);
      localJSONObject.put("nextCheckTime", this.kfW);
      localJSONObject.put("charset", this.charset);
      localJSONObject.put("bigPackageReady", this.kfX);
      localJSONObject.put("preloadFilesReady", this.kfY);
      localJSONObject.put("preloadFilesAtomic", this.kfZ);
      localJSONObject.put("totalDownloadCount", this.kga);
      localJSONObject.put("downloadTriggerType", this.cga);
      return localJSONObject;
    }
    catch (JSONException localJSONException) {}
    return localJSONObject;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    paramParcel.writeString(this.kfA);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.version);
    paramParcel.writeString(this.ffK);
    if (this.kfR)
    {
      paramInt = 1;
      paramParcel.writeByte((byte)paramInt);
      paramParcel.writeLong(this.kfS);
      paramParcel.writeLong(this.kfT);
      paramParcel.writeInt(this.kfU);
      paramParcel.writeString(this.cfx);
      paramParcel.writeString(this.bKg);
      paramParcel.writeString(this.downloadUrl);
      paramParcel.writeInt(this.kfV);
      paramParcel.writeInt(this.kfm);
      paramParcel.writeLong(this.kfW);
      paramParcel.writeLong(this.createTime);
      paramParcel.writeString(this.charset);
      if (!this.kfX) {
        break label204;
      }
      paramInt = 1;
      label146:
      paramParcel.writeByte((byte)paramInt);
      if (!this.kfY) {
        break label209;
      }
      paramInt = 1;
      label161:
      paramParcel.writeByte((byte)paramInt);
      if (!this.kfZ) {
        break label214;
      }
    }
    label204:
    label209:
    label214:
    for (paramInt = i;; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      paramParcel.writeInt(this.kga);
      paramParcel.writeInt(this.cga);
      return;
      paramInt = 0;
      break;
      paramInt = 0;
      break label146;
      paramInt = 0;
      break label161;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/wepkg/model/WepkgVersion.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */