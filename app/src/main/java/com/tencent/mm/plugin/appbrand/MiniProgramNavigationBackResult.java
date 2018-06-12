package com.tencent.mm.plugin.appbrand;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONException;
import org.json.JSONObject;

public class MiniProgramNavigationBackResult
  implements Parcelable
{
  public static final Parcelable.Creator<MiniProgramNavigationBackResult> CREATOR = new MiniProgramNavigationBackResult.1();
  public JSONObject fei;
  public JSONObject fej;
  
  public MiniProgramNavigationBackResult() {}
  
  private MiniProgramNavigationBackResult(Parcel paramParcel)
  {
    try
    {
      this.fei = new JSONObject(bi.aG(paramParcel.readString(), "{}"));
      this.fej = new JSONObject(bi.aG(paramParcel.readString(), "{}"));
      return;
    }
    catch (JSONException paramParcel)
    {
      x.e("MicroMsg.AppBrand.MiniProgramNavigationBackResult", "readFromParcel, ex = %s", new Object[] { paramParcel });
    }
  }
  
  public static MiniProgramNavigationBackResult a(JSONObject paramJSONObject1, JSONObject paramJSONObject2)
  {
    if ((paramJSONObject1 == null) && (paramJSONObject2 == null)) {
      return null;
    }
    MiniProgramNavigationBackResult localMiniProgramNavigationBackResult = new MiniProgramNavigationBackResult();
    JSONObject localJSONObject = new JSONObject();
    if (paramJSONObject1 == null)
    {
      paramJSONObject1 = localJSONObject;
      localMiniProgramNavigationBackResult.fei = ((JSONObject)paramJSONObject1);
      paramJSONObject1 = new JSONObject();
      if (paramJSONObject2 != null) {
        break label65;
      }
    }
    for (;;)
    {
      localMiniProgramNavigationBackResult.fej = ((JSONObject)paramJSONObject1);
      return localMiniProgramNavigationBackResult;
      break;
      label65:
      paramJSONObject1 = paramJSONObject2;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject2 = null;
    if (this.fei == null)
    {
      localObject1 = null;
      paramParcel.writeString((String)localObject1);
      if (this.fej != null) {
        break label44;
      }
    }
    label44:
    for (Object localObject1 = localObject2;; localObject1 = this.fej.toString())
    {
      paramParcel.writeString((String)localObject1);
      return;
      localObject1 = this.fei.toString();
      break;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/MiniProgramNavigationBackResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */