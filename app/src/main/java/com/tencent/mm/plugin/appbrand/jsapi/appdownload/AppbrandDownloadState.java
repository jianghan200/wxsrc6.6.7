package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONException;
import org.json.JSONObject;

public class AppbrandDownloadState
  implements Parcelable
{
  public static final Parcelable.Creator<AppbrandDownloadState> CREATOR = new Parcelable.Creator() {};
  public String appId;
  public long bGm;
  public long bSP;
  public long fHs;
  public String state;
  
  public AppbrandDownloadState() {}
  
  private AppbrandDownloadState(Parcel paramParcel)
  {
    this.state = paramParcel.readString();
    this.bGm = paramParcel.readLong();
    this.appId = paramParcel.readString();
    this.bSP = paramParcel.readLong();
    this.fHs = paramParcel.readLong();
  }
  
  public final JSONObject ahS()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("state", this.state);
      localJSONObject.put("downloadId", this.bGm);
      localJSONObject.put("appId", this.appId);
      localJSONObject.put("progress", this.bSP);
      localJSONObject.put("taskSize", this.fHs);
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      x.e("MicroMsg.AppbrandDownloadState", "toJsonObject: " + localJSONException.getMessage());
    }
    return localJSONObject;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.state);
    paramParcel.writeLong(this.bGm);
    paramParcel.writeString(this.appId);
    paramParcel.writeLong(this.bSP);
    paramParcel.writeLong(this.fHs);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/appdownload/AppbrandDownloadState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */