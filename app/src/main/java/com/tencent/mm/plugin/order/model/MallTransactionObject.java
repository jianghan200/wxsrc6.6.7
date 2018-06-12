package com.tencent.mm.plugin.order.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class MallTransactionObject
  implements Parcelable
{
  public static final Parcelable.Creator<MallTransactionObject> CREATOR = new Parcelable.Creator() {};
  public int bCK;
  public int bID;
  public String bOe;
  public int dTR;
  public String desc;
  public String fqJ;
  public double hUL = 0.0D;
  public int lNG;
  public String lNH;
  public String lNI;
  public String lNJ;
  public String lNK;
  public String lNL;
  public String lNM;
  public String lNN;
  public String lNO;
  public String lNP;
  public String lNQ;
  public int lNR;
  public String lNS;
  public String lNT;
  public String lNU;
  public String lNV;
  public String lNW;
  public String lNX;
  public String lNY;
  public String lNZ;
  public List<MallOrderDetailObject.HelpCenter> lNv = new LinkedList();
  public int lNw = -1;
  public String lNy;
  public String lOa;
  public double lOb;
  public String lOc;
  public String lOd;
  public String lOe;
  public String lOf;
  public String lOg;
  public int lOh;
  public int lOi;
  public double lOj;
  public String lOk;
  public int lOl;
  public String lOm;
  public int lOn;
  public int lOo;
  public int lOp;
  public String lOq;
  public String lOr;
  public String lOs;
  public String lOt;
  public String lOu;
  public String lOv;
  public double lOw;
  public String lOx;
  public int type;
  
  public MallTransactionObject() {}
  
  public MallTransactionObject(Parcel paramParcel)
  {
    this.bID = paramParcel.readInt();
    this.lNG = paramParcel.readInt();
    this.bCK = paramParcel.readInt();
    this.lNH = paramParcel.readString();
    this.lNI = paramParcel.readString();
    this.lNJ = paramParcel.readString();
    this.lNK = paramParcel.readString();
    this.desc = paramParcel.readString();
    this.lNL = paramParcel.readString();
    this.lNM = paramParcel.readString();
    this.hUL = paramParcel.readDouble();
    this.lNN = paramParcel.readString();
    this.lNO = paramParcel.readString();
    this.lNP = paramParcel.readString();
    this.lNQ = paramParcel.readString();
    this.dTR = paramParcel.readInt();
    this.lNR = paramParcel.readInt();
    this.bOe = paramParcel.readString();
    this.lNS = paramParcel.readString();
    this.lNT = paramParcel.readString();
    this.lNV = paramParcel.readString();
    this.lNW = paramParcel.readString();
    this.lNy = paramParcel.readString();
    this.lNX = paramParcel.readString();
    this.fqJ = paramParcel.readString();
    this.lNY = paramParcel.readString();
    this.lNZ = paramParcel.readString();
    this.lOa = paramParcel.readString();
    this.lOb = paramParcel.readDouble();
    this.lOc = paramParcel.readString();
    this.lOd = paramParcel.readString();
    this.lOe = paramParcel.readString();
    this.lOf = paramParcel.readString();
    this.lOh = paramParcel.readInt();
    this.lOn = paramParcel.readInt();
    this.lOj = paramParcel.readDouble();
    this.lOk = paramParcel.readString();
    this.lOl = paramParcel.readInt();
    this.lOm = paramParcel.readString();
    this.lOn = paramParcel.readInt();
    this.lOo = paramParcel.readInt();
    this.lOp = paramParcel.readInt();
    this.lOq = paramParcel.readString();
    this.lOr = paramParcel.readString();
    this.lOs = paramParcel.readString();
    this.lOt = paramParcel.readString();
    this.lOu = paramParcel.readString();
    this.lOv = paramParcel.readString();
    this.lOw = paramParcel.readDouble();
    this.lOx = paramParcel.readString();
    this.lOg = paramParcel.readString();
    this.lNw = paramParcel.readInt();
    int j = paramParcel.readInt();
    this.lNv = new LinkedList();
    int i = 0;
    while (i < j)
    {
      MallOrderDetailObject.HelpCenter localHelpCenter = (MallOrderDetailObject.HelpCenter)paramParcel.readParcelable(MallOrderDetailObject.HelpCenter.class.getClassLoader());
      this.lNv.add(localHelpCenter);
      i += 1;
    }
  }
  
  public static MallTransactionObject U(JSONObject paramJSONObject)
  {
    if (paramJSONObject != null)
    {
      MallTransactionObject localMallTransactionObject = new MallTransactionObject();
      localMallTransactionObject.type = paramJSONObject.optInt("rec_type", 1);
      localMallTransactionObject.bID = paramJSONObject.optInt("sub_pay_type", 0);
      localMallTransactionObject.lNG = paramJSONObject.optInt("pay_scene");
      localMallTransactionObject.bCK = paramJSONObject.optInt("user_type");
      localMallTransactionObject.lNH = paramJSONObject.optString("buy_uin");
      localMallTransactionObject.lNI = paramJSONObject.optString("buy_name");
      localMallTransactionObject.lNJ = paramJSONObject.optString("sale_uin");
      localMallTransactionObject.lNK = paramJSONObject.optString("sale_name");
      localMallTransactionObject.bOe = paramJSONObject.optString("trans_id");
      localMallTransactionObject.lNS = paramJSONObject.optString("sp_billno");
      localMallTransactionObject.desc = paramJSONObject.optString("goods_name");
      localMallTransactionObject.lNL = paramJSONObject.optString("goods_detail");
      localMallTransactionObject.hUL = (paramJSONObject.optDouble("fee") / 100.0D);
      localMallTransactionObject.lNN = paramJSONObject.optString("fee_color");
      localMallTransactionObject.lNO = paramJSONObject.optString("trade_state");
      localMallTransactionObject.lNP = paramJSONObject.optString("trade_state_name");
      localMallTransactionObject.lNQ = paramJSONObject.optString("trade_state_color");
      localMallTransactionObject.lNT = paramJSONObject.optString("buy_bank_name");
      localMallTransactionObject.lNU = paramJSONObject.optString("card_tail");
      localMallTransactionObject.dTR = paramJSONObject.optInt("create_timestamp");
      localMallTransactionObject.lNR = paramJSONObject.optInt("modify_timestamp");
      localMallTransactionObject.lNV = paramJSONObject.optString("fee_type");
      JSONObject localJSONObject = paramJSONObject.optJSONObject("appinfo");
      if (localJSONObject != null)
      {
        localMallTransactionObject.lNW = localJSONObject.optString("app_username");
        localMallTransactionObject.lNy = localJSONObject.optString("app_telephone");
        localMallTransactionObject.lNX = localJSONObject.optString("app_nickname");
        localMallTransactionObject.fqJ = localJSONObject.optString("app_icon_url");
        localMallTransactionObject.lOf = localJSONObject.optString("safeguard_url");
        localMallTransactionObject.lOg = localJSONObject.optString("display_name");
      }
      localMallTransactionObject.lNY = paramJSONObject.optString("deliver_price");
      localMallTransactionObject.lNZ = paramJSONObject.optString("preferential_price");
      localMallTransactionObject.lOa = paramJSONObject.optString("discount");
      localMallTransactionObject.lOb = (paramJSONObject.optDouble("original_total_fee") / 100.0D);
      localMallTransactionObject.lOc = paramJSONObject.optString("total_price");
      localMallTransactionObject.lOd = paramJSONObject.optString("receipt_company");
      localMallTransactionObject.lOe = paramJSONObject.optString("biz_pledge");
      localMallTransactionObject.lOh = paramJSONObject.optInt("pre_fetch_timestamp");
      localMallTransactionObject.lOi = paramJSONObject.optInt("arrived_timestamp");
      localMallTransactionObject.lOj = (paramJSONObject.optDouble("transfer_fee") / 100.0D);
      localMallTransactionObject.lOk = paramJSONObject.optString("receiver_name");
      localMallTransactionObject.lOl = paramJSONObject.optInt("allow_resend_msg");
      localMallTransactionObject.lOm = paramJSONObject.optString("charge_fee");
      localMallTransactionObject.lOn = paramJSONObject.optInt("receive_timestamp");
      localMallTransactionObject.lOo = paramJSONObject.optInt("refund_timestamp");
      localMallTransactionObject.lOp = paramJSONObject.optInt("create_timestamp");
      localMallTransactionObject.lOq = paramJSONObject.optString("buy_bank_type");
      localMallTransactionObject.lOr = paramJSONObject.optString("payer_name");
      localMallTransactionObject.lOs = paramJSONObject.optString("true_name");
      localMallTransactionObject.lOt = paramJSONObject.optString("refund_bank_type");
      localMallTransactionObject.lOu = paramJSONObject.optString("rateinfo");
      localMallTransactionObject.lOv = paramJSONObject.optString("original_feeinfo");
      localMallTransactionObject.lOw = (paramJSONObject.optDouble("fetch_total_fee") / 100.0D);
      localMallTransactionObject.lOx = paramJSONObject.optString("fetch_total_fee_color");
      localMallTransactionObject.lNw = paramJSONObject.optInt("userroll_type");
      localMallTransactionObject.lNv = V(paramJSONObject);
      return localMallTransactionObject;
    }
    return null;
  }
  
  private static List<MallOrderDetailObject.HelpCenter> V(JSONObject paramJSONObject)
  {
    localLinkedList = new LinkedList();
    try
    {
      paramJSONObject = paramJSONObject.getJSONArray("help_center");
      int i = 0;
      while (i < paramJSONObject.length())
      {
        MallOrderDetailObject.HelpCenter localHelpCenter = new MallOrderDetailObject.HelpCenter();
        JSONObject localJSONObject = paramJSONObject.getJSONObject(i);
        localHelpCenter.bIq = localJSONObject.optBoolean("is_show_button");
        localHelpCenter.name = localJSONObject.optString("name");
        localHelpCenter.url = localJSONObject.optString("url");
        localLinkedList.add(localHelpCenter);
        i += 1;
      }
      return localLinkedList;
    }
    catch (Exception paramJSONObject)
    {
      x.printErrStackTrace("MicroMsg.MallTransactionObject", paramJSONObject, "", new Object[0]);
      x.e("MicroMsg.MallTransactionObject", "parseHelpCenter error %s", new Object[] { paramJSONObject.getMessage() });
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.bID);
    paramParcel.writeInt(this.lNG);
    paramParcel.writeInt(this.bCK);
    paramParcel.writeString(this.lNH);
    paramParcel.writeString(this.lNI);
    paramParcel.writeString(this.lNJ);
    paramParcel.writeString(this.lNK);
    paramParcel.writeString(this.desc);
    paramParcel.writeString(this.lNL);
    paramParcel.writeString(this.lNM);
    paramParcel.writeDouble(this.hUL);
    paramParcel.writeString(this.lNN);
    paramParcel.writeString(this.lNO);
    paramParcel.writeString(this.lNP);
    paramParcel.writeString(this.lNQ);
    paramParcel.writeInt(this.dTR);
    paramParcel.writeInt(this.lNR);
    paramParcel.writeString(this.bOe);
    paramParcel.writeString(this.lNS);
    paramParcel.writeString(this.lNT);
    paramParcel.writeString(this.lNV);
    paramParcel.writeString(this.lNW);
    paramParcel.writeString(this.lNy);
    paramParcel.writeString(this.lNX);
    paramParcel.writeString(this.fqJ);
    paramParcel.writeString(this.lNY);
    paramParcel.writeString(this.lNZ);
    paramParcel.writeString(this.lOa);
    paramParcel.writeDouble(this.lOb);
    paramParcel.writeString(this.lOc);
    paramParcel.writeString(this.lOd);
    paramParcel.writeString(this.lOe);
    paramParcel.writeString(this.lOf);
    paramParcel.writeInt(this.lOh);
    paramParcel.writeInt(this.lOn);
    paramParcel.writeDouble(this.lOj);
    paramParcel.writeString(this.lOk);
    paramParcel.writeInt(this.lOl);
    paramParcel.writeString(this.lOm);
    paramParcel.writeInt(this.lOn);
    paramParcel.writeInt(this.lOo);
    paramParcel.writeInt(this.lOp);
    paramParcel.writeString(this.lOq);
    paramParcel.writeString(this.lOr);
    paramParcel.writeString(this.lOs);
    paramParcel.writeString(this.lOt);
    paramParcel.writeString(this.lOu);
    paramParcel.writeString(this.lOv);
    paramParcel.writeDouble(this.lOw);
    paramParcel.writeString(this.lOx);
    paramParcel.writeString(this.lOg);
    paramParcel.writeInt(this.lNw);
    paramParcel.writeInt(this.lNv.size());
    Iterator localIterator = this.lNv.iterator();
    while (localIterator.hasNext()) {
      paramParcel.writeParcelable((MallOrderDetailObject.HelpCenter)localIterator.next(), paramInt);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/order/model/MallTransactionObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */