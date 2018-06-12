package com.tencent.mm.plugin.wallet_core.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public class BindCardOrder
  implements Parcelable
{
  public static final Parcelable.Creator<BindCardOrder> CREATOR = new BindCardOrder.1();
  public static int pmB = 1;
  public static int pmC = 2;
  public static int pmD = 6;
  public int jumpType;
  public String lMV;
  private String pmA = "";
  public int pmE;
  public String pmF = "";
  public String pmG = "";
  public String pmH = "";
  public String pmI = "";
  public String pmJ = "";
  public int pmK;
  public int pmL;
  public n pmM;
  public n.a pmN;
  public n.b pmO;
  
  public BindCardOrder() {}
  
  protected BindCardOrder(Parcel paramParcel)
  {
    this.pmA = paramParcel.readString();
    try
    {
      af(new JSONObject(this.pmA));
      return;
    }
    catch (Exception paramParcel)
    {
      x.printErrStackTrace("MicroMsg.BindCardOrder", paramParcel, "", new Object[0]);
    }
  }
  
  public final void af(JSONObject paramJSONObject)
  {
    if (paramJSONObject == null) {}
    for (Object localObject = "";; localObject = paramJSONObject.toString())
    {
      this.pmA = ((String)localObject);
      x.i("MicroMsg.BindCardOrder", "feed json %s", new Object[] { this.pmA });
      try
      {
        this.pmE = paramJSONObject.optInt("show_bind_succ_page", 0);
        this.pmF = paramJSONObject.optString("bind_succ_btn_wording", "");
        this.pmG = paramJSONObject.optString("bind_succ_remind_wording", "");
        this.jumpType = paramJSONObject.optInt("jump_type", 0);
        this.pmJ = paramJSONObject.optString("bind_serial");
        localObject = paramJSONObject.optJSONObject("activity_info");
        this.pmM = new n();
        if (localObject != null)
        {
          n localn = this.pmM;
          localn.pji = ((JSONObject)localObject).optLong("activity_id");
          localn.poB = ((JSONObject)localObject).optLong("activity_type", 0L);
          localn.poC = ((JSONObject)localObject).optLong("award_id");
          localn.poD = ((JSONObject)localObject).optInt("send_record_id");
          localn.poE = ((JSONObject)localObject).optInt("user_record_id");
          localn.poF = ((JSONObject)localObject).optLong("activity_mch_id", 0L);
        }
        localObject = paramJSONObject.optJSONObject("h5_info");
        if (localObject != null)
        {
          this.pmN = new n.a();
          this.pmN.ag((JSONObject)localObject);
        }
        localObject = paramJSONObject.optJSONObject("native_info");
        if (localObject != null)
        {
          this.pmN = new n.a();
          this.pmN.ag((JSONObject)localObject);
        }
        paramJSONObject = paramJSONObject.optJSONObject("tinyapp_info");
        if (paramJSONObject != null)
        {
          this.pmO = new n.b();
          localObject = this.pmO;
          ((n.b)localObject).poI = paramJSONObject.optString("tinyapp_name");
          ((n.b)localObject).poJ = paramJSONObject.optString("tinyapp_logo");
          ((n.b)localObject).poK = paramJSONObject.optString("tinyapp_desc");
          ((n.b)localObject).paD = paramJSONObject.optString("tinyapp_username");
          ((n.b)localObject).paE = paramJSONObject.optString("tinyapp_path");
          ((n.b)localObject).poL = paramJSONObject.optString("activity_tinyapp_btn_text");
          ((n.b)localObject).poM = paramJSONObject.optInt("tinyapp_version", 0);
        }
        return;
      }
      catch (Exception paramJSONObject)
      {
        x.printErrStackTrace("MicroMsg.BindCardOrder", paramJSONObject, "", new Object[0]);
      }
    }
  }
  
  public final boolean bOy()
  {
    return (this.jumpType == pmB) && (this.pmN != null);
  }
  
  public final boolean bOz()
  {
    return (this.jumpType == pmD) && (this.pmN != null);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.pmA);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/BindCardOrder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */