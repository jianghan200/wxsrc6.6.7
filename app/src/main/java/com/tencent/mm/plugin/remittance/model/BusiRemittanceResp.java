package com.tencent.mm.plugin.remittance.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.protocal.c.jc;
import com.tencent.mm.protocal.c.xc;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

public class BusiRemittanceResp
  implements Parcelable
{
  public static final Parcelable.Creator<BusiRemittanceResp> CREATOR = new BusiRemittanceResp.1();
  public int mwN = 0;
  public String mwO = "";
  public String mwP = "";
  public int mwQ;
  public String mwR;
  public String mwS;
  public List<xc> mwT = new LinkedList();
  public jc mwU;
  public int mwV = 0;
  public int mwW = 0;
  public int mwX = 400;
  
  BusiRemittanceResp() {}
  
  protected BusiRemittanceResp(Parcel paramParcel)
  {
    this.mwN = paramParcel.readInt();
    this.mwO = paramParcel.readString();
    this.mwP = paramParcel.readString();
    this.mwQ = paramParcel.readInt();
    this.mwR = paramParcel.readString();
    this.mwS = paramParcel.readString();
    this.mwV = paramParcel.readInt();
    this.mwW = paramParcel.readInt();
    this.mwX = paramParcel.readInt();
    this.mwT = new LinkedList();
    int j = paramParcel.readInt();
    int i = 0;
    for (;;)
    {
      if (i < j)
      {
        int k = paramParcel.readInt();
        byte[] arrayOfByte1;
        if (k > 0)
        {
          arrayOfByte1 = new byte[k];
          paramParcel.readByteArray(arrayOfByte1);
        }
        try
        {
          xc localxc = new xc();
          localxc.aG(arrayOfByte1);
          this.mwT.add(localxc);
          i += 1;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            x.printErrStackTrace("MicroMsg.BusiRemittanceResp", localException, "", new Object[0]);
          }
        }
      }
    }
    i = paramParcel.readInt();
    byte[] arrayOfByte2;
    if (i > 0)
    {
      arrayOfByte2 = new byte[i];
      paramParcel.readByteArray(arrayOfByte2);
      this.mwU = new jc();
    }
    try
    {
      this.mwU.aG(arrayOfByte2);
      return;
    }
    catch (Exception paramParcel)
    {
      x.printErrStackTrace("MicroMsg.BusiRemittanceResp", paramParcel, "", new Object[0]);
    }
  }
  
  BusiRemittanceResp(JSONObject paramJSONObject)
  {
    this.mwN = paramJSONObject.optInt("show_photo", 0);
    this.mwO = paramJSONObject.optString("photo_url", "");
    this.mwP = paramJSONObject.optString("favor_desc", "");
    this.mwQ = paramJSONObject.optInt("scan_scene", 0);
    this.mwR = paramJSONObject.optString("favor_req_sign", "");
    this.mwS = paramJSONObject.optString("favor_req_extend", "");
    this.mwV = paramJSONObject.optInt("get_favor_flag", 0);
    this.mwW = paramJSONObject.optInt("photo_style", 0);
    this.mwX = paramJSONObject.optInt("get_favor_interval", 400);
    this.mwT = b.q(paramJSONObject.optJSONArray("favor_list"));
    paramJSONObject = paramJSONObject.optJSONObject("favor_comm_resp");
    if (paramJSONObject != null)
    {
      this.mwU = new jc();
      this.mwU.rkv = paramJSONObject.optString("default_fav_compose_id");
      this.mwU.rkt = b.q(paramJSONObject.optJSONArray("favor_info_list"));
      this.mwU.rkw = paramJSONObject.optString("favor_resp_sign");
      this.mwU.rkx = paramJSONObject.optString("no_compose_wording");
      this.mwU.rku = b.p(paramJSONObject.optJSONArray("favor_compose_result_list"));
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.mwN);
    paramParcel.writeString(this.mwO);
    paramParcel.writeString(this.mwP);
    paramParcel.writeInt(this.mwQ);
    paramParcel.writeString(this.mwR);
    paramParcel.writeString(this.mwS);
    paramParcel.writeInt(this.mwV);
    paramParcel.writeInt(this.mwW);
    paramParcel.writeInt(this.mwX);
    paramParcel.writeInt(this.mwT.size());
    if (this.mwT.size() > 0)
    {
      paramInt = 0;
      for (;;)
      {
        if (paramInt < this.mwT.size())
        {
          Object localObject1 = (xc)this.mwT.get(paramInt);
          try
          {
            localObject1 = ((xc)localObject1).toByteArray();
            paramParcel.writeInt(localObject1.length);
            if (localObject1.length > 0) {
              paramParcel.writeByteArray((byte[])localObject1);
            }
            paramInt += 1;
          }
          catch (Exception localException1)
          {
            for (;;)
            {
              x.printErrStackTrace("MicroMsg.BusiRemittanceResp", localException1, "", new Object[0]);
              localObject2 = new byte[0];
            }
          }
        }
      }
    }
    Object localObject2 = new byte[0];
    try
    {
      byte[] arrayOfByte = this.mwU.toByteArray();
      localObject2 = arrayOfByte;
    }
    catch (Exception localException2)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.BusiRemittanceResp", localException2, "", new Object[0]);
      }
    }
    paramParcel.writeInt(localObject2.length);
    if (localObject2.length > 0) {
      paramParcel.writeByteArray((byte[])localObject2);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/remittance/model/BusiRemittanceResp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */