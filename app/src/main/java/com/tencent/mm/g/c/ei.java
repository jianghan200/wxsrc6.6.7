package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class ei
  extends c
{
  private static final int cGm = "tips".hashCode();
  private static final int cQI;
  private static final int cQJ;
  private static final int cQK;
  private static final int cQL;
  private static final int cQM;
  private static final int cQN;
  private static final int cQO;
  private static final int cQP;
  private static final int cQQ;
  private static final int cQR;
  private static final int cQS;
  private static final int cQT;
  private static final int cQU;
  private static final int cQV;
  private static final int cQW;
  private static final int cQX;
  private static final int cQY;
  private static final int cQZ;
  private static final int cRa;
  private static final int cRb;
  private static final int cRc;
  private static final int cRd;
  private static final int cRe;
  private static final int cRf;
  private static final int cRg;
  private static final int cRh;
  private static final int cRi;
  private static final int cRj;
  private static final int cRk;
  private static final int cRl;
  private static final int cRm = "forbid_title".hashCode();
  private static final int cRn = "forbid_url".hashCode();
  private static final int cRo = "no_micro_word".hashCode();
  private static final int cRp = "card_bottom_wording".hashCode();
  private static final int cRq = "support_lqt_turn_in".hashCode();
  private static final int cRr = "support_lqt_turn_out".hashCode();
  private static final int cRs = "is_hightlight_pre_arrive_time_wording".hashCode();
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int cws;
  private boolean cGg = true;
  private boolean cPX = true;
  private boolean cPY = true;
  private boolean cPZ = true;
  private boolean cQA = true;
  private boolean cQB = true;
  private boolean cQC = true;
  private boolean cQD = true;
  private boolean cQE = true;
  private boolean cQF = true;
  private boolean cQG = true;
  private boolean cQH = true;
  private boolean cQa = true;
  private boolean cQb = true;
  private boolean cQc = true;
  private boolean cQd = true;
  private boolean cQe = true;
  private boolean cQf = true;
  private boolean cQg = true;
  private boolean cQh = true;
  private boolean cQi = true;
  private boolean cQj = true;
  private boolean cQk = true;
  private boolean cQl = true;
  private boolean cQm = true;
  private boolean cQn = true;
  private boolean cQo = true;
  private boolean cQp = true;
  private boolean cQq = true;
  private boolean cQr = true;
  private boolean cQs = true;
  private boolean cQt = true;
  private boolean cQu = true;
  private boolean cQv = true;
  private boolean cQw = true;
  private boolean cQx = true;
  private boolean cQy = true;
  private boolean cQz = true;
  private boolean cwo = true;
  public String field_arrive_type;
  public String field_avail_save_wording;
  public String field_bankName;
  public String field_bankPhone;
  public int field_bankcardClientType;
  public int field_bankcardState;
  public int field_bankcardTag;
  public String field_bankcardTail;
  public String field_bankcardType;
  public String field_bankcardTypeName;
  public String field_bindSerial;
  public String field_bizUsername;
  public int field_cardType;
  public String field_card_bottom_wording;
  public double field_dayQuotaKind;
  public double field_dayQuotaVirtual;
  public String field_desc;
  public String field_ext_msg;
  public long field_fetchArriveTime;
  public String field_fetchArriveTimeWording;
  public String field_fetch_charge_info;
  public double field_fetch_charge_rate;
  public String field_forbidWord;
  public String field_forbid_title;
  public String field_forbid_url;
  public double field_full_fetch_charge_fee;
  public int field_is_hightlight_pre_arrive_time_wording;
  public String field_mobile;
  public String field_no_micro_word;
  public double field_onceQuotaKind;
  public double field_onceQuotaVirtual;
  public String field_repay_url;
  public int field_supportTag;
  public int field_support_lqt_turn_in;
  public int field_support_lqt_turn_out;
  public boolean field_support_micropay;
  public String field_tips;
  public String field_trueName;
  public int field_wxcreditState;
  
  static
  {
    cQI = "bindSerial".hashCode();
    cQJ = "cardType".hashCode();
    cQK = "bankcardState".hashCode();
    cQL = "forbidWord".hashCode();
    cQM = "bankName".hashCode();
    cQN = "bankcardType".hashCode();
    cQO = "bankcardTypeName".hashCode();
    cQP = "bankcardTag".hashCode();
    cQQ = "bankcardTail".hashCode();
    cQR = "supportTag".hashCode();
    cQS = "mobile".hashCode();
    cQT = "trueName".hashCode();
    cws = "desc".hashCode();
    cQU = "bankPhone".hashCode();
    cQV = "bizUsername".hashCode();
    cQW = "onceQuotaKind".hashCode();
    cQX = "onceQuotaVirtual".hashCode();
    cQY = "dayQuotaKind".hashCode();
    cQZ = "dayQuotaVirtual".hashCode();
    cRa = "fetchArriveTime".hashCode();
    cRb = "fetchArriveTimeWording".hashCode();
    cRc = "repay_url".hashCode();
    cRd = "wxcreditState".hashCode();
    cRe = "bankcardClientType".hashCode();
    cRf = "ext_msg".hashCode();
    cRg = "support_micropay".hashCode();
    cRh = "arrive_type".hashCode();
    cRi = "avail_save_wording".hashCode();
    cRj = "fetch_charge_rate".hashCode();
    cRk = "full_fetch_charge_fee".hashCode();
    cRl = "fetch_charge_info".hashCode();
  }
  
  public void d(Cursor paramCursor)
  {
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null) {
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    label20:
    int k;
    if (i < j)
    {
      k = arrayOfString[i].hashCode();
      if (cQI != k) {
        break label65;
      }
      this.field_bindSerial = paramCursor.getString(i);
      this.cPX = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cQJ == k)
      {
        this.field_cardType = paramCursor.getInt(i);
      }
      else if (cQK == k)
      {
        this.field_bankcardState = paramCursor.getInt(i);
      }
      else if (cQL == k)
      {
        this.field_forbidWord = paramCursor.getString(i);
      }
      else if (cQM == k)
      {
        this.field_bankName = paramCursor.getString(i);
      }
      else if (cQN == k)
      {
        this.field_bankcardType = paramCursor.getString(i);
      }
      else if (cQO == k)
      {
        this.field_bankcardTypeName = paramCursor.getString(i);
      }
      else if (cQP == k)
      {
        this.field_bankcardTag = paramCursor.getInt(i);
      }
      else if (cQQ == k)
      {
        this.field_bankcardTail = paramCursor.getString(i);
      }
      else if (cQR == k)
      {
        this.field_supportTag = paramCursor.getInt(i);
      }
      else if (cQS == k)
      {
        this.field_mobile = paramCursor.getString(i);
      }
      else if (cQT == k)
      {
        this.field_trueName = paramCursor.getString(i);
      }
      else if (cws == k)
      {
        this.field_desc = paramCursor.getString(i);
      }
      else if (cQU == k)
      {
        this.field_bankPhone = paramCursor.getString(i);
      }
      else if (cQV == k)
      {
        this.field_bizUsername = paramCursor.getString(i);
      }
      else if (cQW == k)
      {
        this.field_onceQuotaKind = paramCursor.getDouble(i);
      }
      else if (cQX == k)
      {
        this.field_onceQuotaVirtual = paramCursor.getDouble(i);
      }
      else if (cQY == k)
      {
        this.field_dayQuotaKind = paramCursor.getDouble(i);
      }
      else if (cQZ == k)
      {
        this.field_dayQuotaVirtual = paramCursor.getDouble(i);
      }
      else if (cRa == k)
      {
        this.field_fetchArriveTime = paramCursor.getLong(i);
      }
      else if (cRb == k)
      {
        this.field_fetchArriveTimeWording = paramCursor.getString(i);
      }
      else if (cRc == k)
      {
        this.field_repay_url = paramCursor.getString(i);
      }
      else if (cRd == k)
      {
        this.field_wxcreditState = paramCursor.getInt(i);
      }
      else if (cRe == k)
      {
        this.field_bankcardClientType = paramCursor.getInt(i);
      }
      else if (cRf == k)
      {
        this.field_ext_msg = paramCursor.getString(i);
      }
      else
      {
        if (cRg == k)
        {
          if (paramCursor.getInt(i) != 0) {}
          for (boolean bool = true;; bool = false)
          {
            this.field_support_micropay = bool;
            break;
          }
        }
        if (cRh == k) {
          this.field_arrive_type = paramCursor.getString(i);
        } else if (cRi == k) {
          this.field_avail_save_wording = paramCursor.getString(i);
        } else if (cRj == k) {
          this.field_fetch_charge_rate = paramCursor.getDouble(i);
        } else if (cRk == k) {
          this.field_full_fetch_charge_fee = paramCursor.getDouble(i);
        } else if (cRl == k) {
          this.field_fetch_charge_info = paramCursor.getString(i);
        } else if (cGm == k) {
          this.field_tips = paramCursor.getString(i);
        } else if (cRm == k) {
          this.field_forbid_title = paramCursor.getString(i);
        } else if (cRn == k) {
          this.field_forbid_url = paramCursor.getString(i);
        } else if (cRo == k) {
          this.field_no_micro_word = paramCursor.getString(i);
        } else if (cRp == k) {
          this.field_card_bottom_wording = paramCursor.getString(i);
        } else if (cRq == k) {
          this.field_support_lqt_turn_in = paramCursor.getInt(i);
        } else if (cRr == k) {
          this.field_support_lqt_turn_out = paramCursor.getInt(i);
        } else if (cRs == k) {
          this.field_is_hightlight_pre_arrive_time_wording = paramCursor.getInt(i);
        } else if (ciP == k) {
          this.sKx = paramCursor.getLong(i);
        }
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cPX) {
      localContentValues.put("bindSerial", this.field_bindSerial);
    }
    if (this.cPY) {
      localContentValues.put("cardType", Integer.valueOf(this.field_cardType));
    }
    if (this.cPZ) {
      localContentValues.put("bankcardState", Integer.valueOf(this.field_bankcardState));
    }
    if (this.cQa) {
      localContentValues.put("forbidWord", this.field_forbidWord);
    }
    if (this.cQb) {
      localContentValues.put("bankName", this.field_bankName);
    }
    if (this.cQc) {
      localContentValues.put("bankcardType", this.field_bankcardType);
    }
    if (this.cQd) {
      localContentValues.put("bankcardTypeName", this.field_bankcardTypeName);
    }
    if (this.cQe) {
      localContentValues.put("bankcardTag", Integer.valueOf(this.field_bankcardTag));
    }
    if (this.cQf) {
      localContentValues.put("bankcardTail", this.field_bankcardTail);
    }
    if (this.cQg) {
      localContentValues.put("supportTag", Integer.valueOf(this.field_supportTag));
    }
    if (this.cQh) {
      localContentValues.put("mobile", this.field_mobile);
    }
    if (this.cQi) {
      localContentValues.put("trueName", this.field_trueName);
    }
    if (this.cwo) {
      localContentValues.put("desc", this.field_desc);
    }
    if (this.cQj) {
      localContentValues.put("bankPhone", this.field_bankPhone);
    }
    if (this.cQk) {
      localContentValues.put("bizUsername", this.field_bizUsername);
    }
    if (this.cQl) {
      localContentValues.put("onceQuotaKind", Double.valueOf(this.field_onceQuotaKind));
    }
    if (this.cQm) {
      localContentValues.put("onceQuotaVirtual", Double.valueOf(this.field_onceQuotaVirtual));
    }
    if (this.cQn) {
      localContentValues.put("dayQuotaKind", Double.valueOf(this.field_dayQuotaKind));
    }
    if (this.cQo) {
      localContentValues.put("dayQuotaVirtual", Double.valueOf(this.field_dayQuotaVirtual));
    }
    if (this.cQp) {
      localContentValues.put("fetchArriveTime", Long.valueOf(this.field_fetchArriveTime));
    }
    if (this.cQq) {
      localContentValues.put("fetchArriveTimeWording", this.field_fetchArriveTimeWording);
    }
    if (this.cQr) {
      localContentValues.put("repay_url", this.field_repay_url);
    }
    if (this.cQs) {
      localContentValues.put("wxcreditState", Integer.valueOf(this.field_wxcreditState));
    }
    if (this.cQt) {
      localContentValues.put("bankcardClientType", Integer.valueOf(this.field_bankcardClientType));
    }
    if (this.cQu) {
      localContentValues.put("ext_msg", this.field_ext_msg);
    }
    if (this.cQv) {
      localContentValues.put("support_micropay", Boolean.valueOf(this.field_support_micropay));
    }
    if (this.cQw) {
      localContentValues.put("arrive_type", this.field_arrive_type);
    }
    if (this.cQx) {
      localContentValues.put("avail_save_wording", this.field_avail_save_wording);
    }
    if (this.cQy) {
      localContentValues.put("fetch_charge_rate", Double.valueOf(this.field_fetch_charge_rate));
    }
    if (this.cQz) {
      localContentValues.put("full_fetch_charge_fee", Double.valueOf(this.field_full_fetch_charge_fee));
    }
    if (this.cQA) {
      localContentValues.put("fetch_charge_info", this.field_fetch_charge_info);
    }
    if (this.cGg) {
      localContentValues.put("tips", this.field_tips);
    }
    if (this.cQB) {
      localContentValues.put("forbid_title", this.field_forbid_title);
    }
    if (this.cQC) {
      localContentValues.put("forbid_url", this.field_forbid_url);
    }
    if (this.cQD) {
      localContentValues.put("no_micro_word", this.field_no_micro_word);
    }
    if (this.cQE) {
      localContentValues.put("card_bottom_wording", this.field_card_bottom_wording);
    }
    if (this.cQF) {
      localContentValues.put("support_lqt_turn_in", Integer.valueOf(this.field_support_lqt_turn_in));
    }
    if (this.cQG) {
      localContentValues.put("support_lqt_turn_out", Integer.valueOf(this.field_support_lqt_turn_out));
    }
    if (this.cQH) {
      localContentValues.put("is_hightlight_pre_arrive_time_wording", Integer.valueOf(this.field_is_hightlight_pre_arrive_time_wording));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/g/c/ei.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */