package com.tencent.mm.plugin.game.wepkg.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.plugin.game.wepkg.a.a;
import org.json.JSONException;
import org.json.JSONObject;

public class WepkgPreloadFile
  implements Parcelable
{
  public static final Parcelable.Creator<WepkgPreloadFile> CREATOR = new WepkgPreloadFile.1();
  public String aAL;
  public String bKg;
  public long createTime;
  public String downloadUrl;
  public String filePath;
  public String kfA;
  public boolean kfB;
  public String kfk;
  public int kfm;
  public String mimeType;
  public int size;
  public String version;
  
  public WepkgPreloadFile() {}
  
  public WepkgPreloadFile(Parcel paramParcel)
  {
    this.aAL = paramParcel.readString();
    this.kfA = paramParcel.readString();
    this.version = paramParcel.readString();
    this.filePath = paramParcel.readString();
    this.kfk = paramParcel.readString();
    this.mimeType = paramParcel.readString();
    this.bKg = paramParcel.readString();
    this.downloadUrl = paramParcel.readString();
    this.size = paramParcel.readInt();
    this.kfm = paramParcel.readInt();
    if (paramParcel.readByte() != 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.kfB = bool;
      this.createTime = paramParcel.readLong();
      return;
    }
  }
  
  public final void a(a parama)
  {
    if (parama != null)
    {
      this.aAL = parama.field_key;
      this.kfA = parama.field_pkgId;
      this.version = parama.field_version;
      this.filePath = parama.field_filePath;
      this.kfk = parama.field_rid;
      this.mimeType = parama.field_mimeType;
      this.bKg = parama.field_md5;
      this.downloadUrl = parama.field_downloadUrl;
      this.size = parama.field_size;
      this.kfm = parama.field_downloadNetType;
      this.kfB = parama.field_completeDownload;
      this.createTime = parama.field_createTime;
    }
  }
  
  public final JSONObject aVx()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("key", this.aAL);
      localJSONObject.put("pkgId", this.kfA);
      localJSONObject.put("version", this.version);
      localJSONObject.put("filePath", this.filePath);
      localJSONObject.put("rid", this.kfk);
      localJSONObject.put("mimeType", this.mimeType);
      localJSONObject.put("md5", this.bKg);
      localJSONObject.put("downloadUrl", this.downloadUrl);
      localJSONObject.put("size", this.size);
      localJSONObject.put("downloadNetType", this.kfm);
      localJSONObject.put("completeDownload", this.kfB);
      localJSONObject.put("createTime", this.createTime);
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
    paramParcel.writeString(this.aAL);
    paramParcel.writeString(this.kfA);
    paramParcel.writeString(this.version);
    paramParcel.writeString(this.filePath);
    paramParcel.writeString(this.kfk);
    paramParcel.writeString(this.mimeType);
    paramParcel.writeString(this.bKg);
    paramParcel.writeString(this.downloadUrl);
    paramParcel.writeInt(this.size);
    paramParcel.writeInt(this.kfm);
    if (this.kfB) {}
    for (paramInt = 1;; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      paramParcel.writeLong(this.createTime);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/game/wepkg/model/WepkgPreloadFile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */