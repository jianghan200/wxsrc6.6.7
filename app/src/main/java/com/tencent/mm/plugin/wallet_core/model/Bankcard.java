package com.tencent.mm.plugin.wallet_core.model;

import android.content.Context;
import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.g.c.ei;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.Set;

public class Bankcard
  extends ei
  implements Parcelable
{
  public static final Parcelable.Creator<Bankcard> CREATOR = new Parcelable.Creator() {};
  public static c.a dhO;
  public static int plI = 1;
  public static int plJ = 2;
  public static int plK = 4;
  public static int plL = 8;
  public static int plM = 16;
  public static int plN = 32;
  public static int plO = 64;
  public static int plP = 128;
  public boolean btA = false;
  public String plQ;
  public String plR;
  public String plS;
  public String plT;
  public String plU = null;
  public double plV;
  public String plW;
  public double plX;
  public String plY;
  public String plZ;
  public int pll;
  public String pln;
  public String pma;
  public String pmb = null;
  public e pmc;
  public long pmd;
  public long pme;
  public long pmf;
  public String pmg;
  public int pmh;
  public int pmi;
  public String pmj;
  public String pmk;
  public int pml;
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[39];
    locala.columns = new String[40];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "bindSerial";
    locala.sKA.put("bindSerial", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" bindSerial TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.sKz = "bindSerial";
    locala.columns[1] = "cardType";
    locala.sKA.put("cardType", "INTEGER");
    localStringBuilder.append(" cardType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[2] = "bankcardState";
    locala.sKA.put("bankcardState", "INTEGER");
    localStringBuilder.append(" bankcardState INTEGER");
    localStringBuilder.append(", ");
    locala.columns[3] = "forbidWord";
    locala.sKA.put("forbidWord", "TEXT");
    localStringBuilder.append(" forbidWord TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "bankName";
    locala.sKA.put("bankName", "TEXT");
    localStringBuilder.append(" bankName TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "bankcardType";
    locala.sKA.put("bankcardType", "TEXT");
    localStringBuilder.append(" bankcardType TEXT");
    localStringBuilder.append(", ");
    locala.columns[6] = "bankcardTypeName";
    locala.sKA.put("bankcardTypeName", "TEXT");
    localStringBuilder.append(" bankcardTypeName TEXT");
    localStringBuilder.append(", ");
    locala.columns[7] = "bankcardTag";
    locala.sKA.put("bankcardTag", "INTEGER");
    localStringBuilder.append(" bankcardTag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[8] = "bankcardTail";
    locala.sKA.put("bankcardTail", "TEXT");
    localStringBuilder.append(" bankcardTail TEXT");
    localStringBuilder.append(", ");
    locala.columns[9] = "supportTag";
    locala.sKA.put("supportTag", "INTEGER");
    localStringBuilder.append(" supportTag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[10] = "mobile";
    locala.sKA.put("mobile", "TEXT");
    localStringBuilder.append(" mobile TEXT");
    localStringBuilder.append(", ");
    locala.columns[11] = "trueName";
    locala.sKA.put("trueName", "TEXT");
    localStringBuilder.append(" trueName TEXT");
    localStringBuilder.append(", ");
    locala.columns[12] = "desc";
    locala.sKA.put("desc", "TEXT");
    localStringBuilder.append(" desc TEXT");
    localStringBuilder.append(", ");
    locala.columns[13] = "bankPhone";
    locala.sKA.put("bankPhone", "TEXT");
    localStringBuilder.append(" bankPhone TEXT");
    localStringBuilder.append(", ");
    locala.columns[14] = "bizUsername";
    locala.sKA.put("bizUsername", "TEXT");
    localStringBuilder.append(" bizUsername TEXT");
    localStringBuilder.append(", ");
    locala.columns[15] = "onceQuotaKind";
    locala.sKA.put("onceQuotaKind", "DOUBLE");
    localStringBuilder.append(" onceQuotaKind DOUBLE");
    localStringBuilder.append(", ");
    locala.columns[16] = "onceQuotaVirtual";
    locala.sKA.put("onceQuotaVirtual", "DOUBLE");
    localStringBuilder.append(" onceQuotaVirtual DOUBLE");
    localStringBuilder.append(", ");
    locala.columns[17] = "dayQuotaKind";
    locala.sKA.put("dayQuotaKind", "DOUBLE");
    localStringBuilder.append(" dayQuotaKind DOUBLE");
    localStringBuilder.append(", ");
    locala.columns[18] = "dayQuotaVirtual";
    locala.sKA.put("dayQuotaVirtual", "DOUBLE");
    localStringBuilder.append(" dayQuotaVirtual DOUBLE");
    localStringBuilder.append(", ");
    locala.columns[19] = "fetchArriveTime";
    locala.sKA.put("fetchArriveTime", "LONG");
    localStringBuilder.append(" fetchArriveTime LONG");
    localStringBuilder.append(", ");
    locala.columns[20] = "fetchArriveTimeWording";
    locala.sKA.put("fetchArriveTimeWording", "TEXT");
    localStringBuilder.append(" fetchArriveTimeWording TEXT");
    localStringBuilder.append(", ");
    locala.columns[21] = "repay_url";
    locala.sKA.put("repay_url", "TEXT");
    localStringBuilder.append(" repay_url TEXT");
    localStringBuilder.append(", ");
    locala.columns[22] = "wxcreditState";
    locala.sKA.put("wxcreditState", "INTEGER");
    localStringBuilder.append(" wxcreditState INTEGER");
    localStringBuilder.append(", ");
    locala.columns[23] = "bankcardClientType";
    locala.sKA.put("bankcardClientType", "INTEGER");
    localStringBuilder.append(" bankcardClientType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[24] = "ext_msg";
    locala.sKA.put("ext_msg", "TEXT");
    localStringBuilder.append(" ext_msg TEXT");
    localStringBuilder.append(", ");
    locala.columns[25] = "support_micropay";
    locala.sKA.put("support_micropay", "INTEGER");
    localStringBuilder.append(" support_micropay INTEGER");
    localStringBuilder.append(", ");
    locala.columns[26] = "arrive_type";
    locala.sKA.put("arrive_type", "TEXT");
    localStringBuilder.append(" arrive_type TEXT");
    localStringBuilder.append(", ");
    locala.columns[27] = "avail_save_wording";
    locala.sKA.put("avail_save_wording", "TEXT");
    localStringBuilder.append(" avail_save_wording TEXT");
    localStringBuilder.append(", ");
    locala.columns[28] = "fetch_charge_rate";
    locala.sKA.put("fetch_charge_rate", "DOUBLE");
    localStringBuilder.append(" fetch_charge_rate DOUBLE");
    localStringBuilder.append(", ");
    locala.columns[29] = "full_fetch_charge_fee";
    locala.sKA.put("full_fetch_charge_fee", "DOUBLE");
    localStringBuilder.append(" full_fetch_charge_fee DOUBLE");
    localStringBuilder.append(", ");
    locala.columns[30] = "fetch_charge_info";
    locala.sKA.put("fetch_charge_info", "TEXT");
    localStringBuilder.append(" fetch_charge_info TEXT");
    localStringBuilder.append(", ");
    locala.columns[31] = "tips";
    locala.sKA.put("tips", "TEXT");
    localStringBuilder.append(" tips TEXT");
    localStringBuilder.append(", ");
    locala.columns[32] = "forbid_title";
    locala.sKA.put("forbid_title", "TEXT");
    localStringBuilder.append(" forbid_title TEXT");
    localStringBuilder.append(", ");
    locala.columns[33] = "forbid_url";
    locala.sKA.put("forbid_url", "TEXT");
    localStringBuilder.append(" forbid_url TEXT");
    localStringBuilder.append(", ");
    locala.columns[34] = "no_micro_word";
    locala.sKA.put("no_micro_word", "TEXT");
    localStringBuilder.append(" no_micro_word TEXT");
    localStringBuilder.append(", ");
    locala.columns[35] = "card_bottom_wording";
    locala.sKA.put("card_bottom_wording", "TEXT");
    localStringBuilder.append(" card_bottom_wording TEXT");
    localStringBuilder.append(", ");
    locala.columns[36] = "support_lqt_turn_in";
    locala.sKA.put("support_lqt_turn_in", "INTEGER");
    localStringBuilder.append(" support_lqt_turn_in INTEGER");
    localStringBuilder.append(", ");
    locala.columns[37] = "support_lqt_turn_out";
    locala.sKA.put("support_lqt_turn_out", "INTEGER");
    localStringBuilder.append(" support_lqt_turn_out INTEGER");
    localStringBuilder.append(", ");
    locala.columns[38] = "is_hightlight_pre_arrive_time_wording";
    locala.sKA.put("is_hightlight_pre_arrive_time_wording", "INTEGER");
    localStringBuilder.append(" is_hightlight_pre_arrive_time_wording INTEGER");
    locala.columns[39] = "rowid";
    locala.sql = localStringBuilder.toString();
    dhO = locala;
  }
  
  public Bankcard() {}
  
  public Bankcard(byte paramByte)
  {
    this.field_bankcardTag = 1;
  }
  
  public Bankcard(Parcel paramParcel)
  {
    this.field_bankName = paramParcel.readString();
    this.field_desc = paramParcel.readString();
    this.field_bankcardType = paramParcel.readString();
    this.field_bindSerial = paramParcel.readString();
    this.field_cardType = paramParcel.readInt();
    if (paramParcel.readInt() == 1)
    {
      bool1 = true;
      this.btA = bool1;
      this.field_mobile = paramParcel.readString();
      this.field_onceQuotaKind = paramParcel.readDouble();
      this.field_onceQuotaVirtual = paramParcel.readDouble();
      this.field_dayQuotaKind = paramParcel.readDouble();
      this.field_dayQuotaVirtual = paramParcel.readDouble();
      this.field_bankcardTail = paramParcel.readString();
      this.field_bankPhone = paramParcel.readString();
      this.field_bankcardTag = paramParcel.readInt();
      this.field_bankcardState = paramParcel.readInt();
      this.plU = paramParcel.readString();
      this.pll = paramParcel.readInt();
      this.pmb = paramParcel.readString();
      this.field_bankcardClientType = paramParcel.readInt();
      this.field_ext_msg = paramParcel.readString();
      if (paramParcel.readInt() != 1) {
        break label321;
      }
    }
    label321:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.field_support_micropay = bool1;
      this.field_arrive_type = paramParcel.readString();
      this.field_fetch_charge_rate = paramParcel.readDouble();
      this.field_full_fetch_charge_fee = paramParcel.readDouble();
      this.field_no_micro_word = paramParcel.readString();
      this.field_card_bottom_wording = paramParcel.readString();
      this.pmg = paramParcel.readString();
      this.pmd = paramParcel.readLong();
      this.pmf = paramParcel.readLong();
      this.pme = paramParcel.readLong();
      this.pmh = paramParcel.readInt();
      this.pml = paramParcel.readInt();
      this.pmi = paramParcel.readInt();
      this.pmj = paramParcel.readString();
      this.pmk = paramParcel.readString();
      return;
      bool1 = false;
      break;
    }
  }
  
  public static String P(Context paramContext, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return paramContext.getString(a.i.wallet_pay_bankcard_not_exist_tips);
    case 1: 
      return paramContext.getString(a.i.wallet_pay_bankcard_expired_tips);
    case 4: 
      return paramContext.getString(a.i.wallet_pay_bankcard_insufficient_balance_tips);
    case 2: 
      return paramContext.getString(a.i.wallet_pay_bankcard_maintenance_tips);
    case 5: 
      return paramContext.getString(a.i.wallet_pay_bankcard_domestic_tips);
    case 6: 
      return paramContext.getString(a.i.wallet_pay_bankcard_international_tips);
    case 3: 
      return paramContext.getString(a.i.wallet_pay_bankcard_quota_tips);
    }
    return paramContext.getString(a.i.wallet_pay_bankcard_not_support_bankcard_tips);
  }
  
  public static boolean dY(int paramInt1, int paramInt2)
  {
    x.d("MicroMsg.Bankcard", "supportBankcardTag : " + paramInt1 + ", bankcardTag : " + paramInt2);
    return (paramInt1 & paramInt2) > 0;
  }
  
  public static boolean zj(int paramInt)
  {
    return (paramInt & 0x2) > 0;
  }
  
  protected final c.a AX()
  {
    return dhO;
  }
  
  public final int a(int paramInt, Orders paramOrders)
  {
    int i = 0;
    if (this.field_bankcardState != 0)
    {
      x.d("MicroMsg.Bankcard", " bankcardState : " + this.field_bankcardState);
      paramInt = this.field_bankcardState;
    }
    do
    {
      do
      {
        do
        {
          return paramInt;
          if ((paramOrders != null) && (paramOrders.bOd.equals(this.plU))) {
            return 4;
          }
          if ((this.field_bankcardTag & paramInt) > 0) {
            paramInt = 1;
          }
          while (paramInt == 0) {
            if (bOv())
            {
              return 5;
              paramInt = 0;
            }
            else
            {
              return 6;
            }
          }
          paramInt = i;
        } while (paramOrders == null);
        paramInt = i;
      } while (paramOrders.ppc.isEmpty());
      paramInt = i;
    } while (paramOrders.ppc.contains(this.field_bankcardType));
    return 7;
  }
  
  public final boolean bOr()
  {
    if ((this.field_cardType & plK) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      x.d("MicroMsg.Bankcard", "isWXCredit, ret = " + bool);
      return bool;
    }
  }
  
  public final boolean bOs()
  {
    if ((this.field_cardType & plL) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      x.d("MicroMsg.Bankcard", "isWXCredit, ret = " + bool);
      return bool;
    }
  }
  
  public final boolean bOt()
  {
    if ((this.field_cardType & plO) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      x.d("MicroMsg.Bankcard", "isLqtCard, ret = " + bool);
      return bool;
    }
  }
  
  public final boolean bOu()
  {
    if ((this.field_cardType & plJ) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      x.d("MicroMsg.Bankcard", "isCredit, ret = " + bool);
      return bool;
    }
  }
  
  public final boolean bOv()
  {
    if ((this.field_cardType & plI) <= 0) {}
    for (boolean bool = true;; bool = false)
    {
      x.d("MicroMsg.Bankcard", "isDomestic, ret = " + bool);
      return bool;
    }
  }
  
  public final boolean bOw()
  {
    return (this.field_cardType & plP) > 0;
  }
  
  public final void d(Cursor paramCursor)
  {
    super.d(paramCursor);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    paramParcel.writeString(this.field_bankName);
    paramParcel.writeString(this.field_desc);
    paramParcel.writeString(this.field_bankcardType);
    paramParcel.writeString(this.field_bindSerial);
    paramParcel.writeInt(this.field_cardType);
    if (this.btA)
    {
      paramInt = 1;
      paramParcel.writeInt(paramInt);
      paramParcel.writeString(this.field_mobile);
      paramParcel.writeDouble(this.field_onceQuotaKind);
      paramParcel.writeDouble(this.field_onceQuotaVirtual);
      paramParcel.writeDouble(this.field_dayQuotaKind);
      paramParcel.writeDouble(this.field_dayQuotaVirtual);
      paramParcel.writeString(this.field_bankcardTail);
      paramParcel.writeString(this.field_bankPhone);
      paramParcel.writeInt(this.field_bankcardTag);
      paramParcel.writeInt(this.field_bankcardState);
      paramParcel.writeString(this.plU);
      paramParcel.writeInt(this.pll);
      paramParcel.writeString(this.pmb);
      paramParcel.writeInt(this.field_bankcardClientType);
      paramParcel.writeString(this.field_ext_msg);
      if (!this.field_support_micropay) {
        break label300;
      }
    }
    label300:
    for (paramInt = i;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeString(this.field_arrive_type);
      paramParcel.writeDouble(this.field_fetch_charge_rate);
      paramParcel.writeDouble(this.field_full_fetch_charge_fee);
      paramParcel.writeString(this.field_no_micro_word);
      paramParcel.writeString(this.field_card_bottom_wording);
      paramParcel.writeString(this.pmg);
      paramParcel.writeLong(this.pmd);
      paramParcel.writeLong(this.pmf);
      paramParcel.writeLong(this.pme);
      paramParcel.writeInt(this.pmh);
      paramParcel.writeInt(this.pml);
      paramParcel.writeInt(this.pmi);
      paramParcel.writeString(this.pmj);
      paramParcel.writeString(this.pmk);
      return;
      paramInt = 0;
      break;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/Bankcard.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */