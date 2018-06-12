package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class ep
  extends c
{
  private static final int cSN = "uin".hashCode();
  private static final int cSO = "is_reg".hashCode();
  private static final int cSP = "true_name".hashCode();
  private static final int cSQ = "card_num".hashCode();
  private static final int cSR = "isDomesticUser".hashCode();
  private static final int cSS = "cre_type".hashCode();
  private static final int cST = "main_card_bind_serialno".hashCode();
  private static final int cSU = "ftf_pay_url".hashCode();
  private static final int cSV = "switchConfig".hashCode();
  private static final int cSW = "reset_passwd_flag".hashCode();
  private static final int cSX = "find_passwd_url".hashCode();
  private static final int cSY = "is_open_touch".hashCode();
  private static final int cSZ = "lct_wording".hashCode();
  private static final int cTa = "lct_url".hashCode();
  private static final int cTb = "cre_name".hashCode();
  private static final int cTc = "lqt_state".hashCode();
  private static final int cTd = "paymenu_use_new".hashCode();
  private static final int cTe = "is_show_lqb".hashCode();
  private static final int cTf = "is_open_lqb".hashCode();
  private static final int cTg = "lqb_open_url".hashCode();
  private static final int cTh = "lqt_cell_is_show".hashCode();
  private static final int cTi = "lqt_cell_icon".hashCode();
  private static final int cTj = "lqt_cell_is_open_lqt".hashCode();
  private static final int cTk = "lqt_cell_lqt_open_url".hashCode();
  private static final int cTl = "lqt_cell_lqt_title".hashCode();
  private static final int cTm = "lqt_cell_lqt_wording".hashCode();
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private boolean cSA = true;
  private boolean cSB = true;
  private boolean cSC = true;
  private boolean cSD = true;
  private boolean cSE = true;
  private boolean cSF = true;
  private boolean cSG = true;
  private boolean cSH = true;
  private boolean cSI = true;
  private boolean cSJ = true;
  private boolean cSK = true;
  private boolean cSL = true;
  private boolean cSM = true;
  private boolean cSn = true;
  private boolean cSo = true;
  private boolean cSp = true;
  private boolean cSq = true;
  private boolean cSr = true;
  private boolean cSs = true;
  private boolean cSt = true;
  private boolean cSu = true;
  private boolean cSv = true;
  private boolean cSw = true;
  private boolean cSx = true;
  private boolean cSy = true;
  private boolean cSz = true;
  public int field_card_num;
  public String field_cre_name;
  public int field_cre_type;
  public String field_find_passwd_url;
  public String field_ftf_pay_url;
  public boolean field_isDomesticUser;
  public int field_is_open_lqb;
  public int field_is_open_touch;
  public int field_is_reg;
  public int field_is_show_lqb;
  public String field_lct_url;
  public String field_lct_wording;
  public String field_lqb_open_url;
  public String field_lqt_cell_icon;
  public int field_lqt_cell_is_open_lqt;
  public int field_lqt_cell_is_show;
  public String field_lqt_cell_lqt_open_url;
  public String field_lqt_cell_lqt_title;
  public String field_lqt_cell_lqt_wording;
  public int field_lqt_state;
  public String field_main_card_bind_serialno;
  public int field_paymenu_use_new;
  public String field_reset_passwd_flag;
  public int field_switchConfig;
  public String field_true_name;
  public String field_uin;
  
  public final void d(Cursor paramCursor)
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
      if (cSN != k) {
        break label65;
      }
      this.field_uin = paramCursor.getString(i);
      this.cSn = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cSO == k)
      {
        this.field_is_reg = paramCursor.getInt(i);
      }
      else if (cSP == k)
      {
        this.field_true_name = paramCursor.getString(i);
      }
      else if (cSQ == k)
      {
        this.field_card_num = paramCursor.getInt(i);
      }
      else
      {
        if (cSR == k)
        {
          if (paramCursor.getInt(i) != 0) {}
          for (boolean bool = true;; bool = false)
          {
            this.field_isDomesticUser = bool;
            break;
          }
        }
        if (cSS == k) {
          this.field_cre_type = paramCursor.getInt(i);
        } else if (cST == k) {
          this.field_main_card_bind_serialno = paramCursor.getString(i);
        } else if (cSU == k) {
          this.field_ftf_pay_url = paramCursor.getString(i);
        } else if (cSV == k) {
          this.field_switchConfig = paramCursor.getInt(i);
        } else if (cSW == k) {
          this.field_reset_passwd_flag = paramCursor.getString(i);
        } else if (cSX == k) {
          this.field_find_passwd_url = paramCursor.getString(i);
        } else if (cSY == k) {
          this.field_is_open_touch = paramCursor.getInt(i);
        } else if (cSZ == k) {
          this.field_lct_wording = paramCursor.getString(i);
        } else if (cTa == k) {
          this.field_lct_url = paramCursor.getString(i);
        } else if (cTb == k) {
          this.field_cre_name = paramCursor.getString(i);
        } else if (cTc == k) {
          this.field_lqt_state = paramCursor.getInt(i);
        } else if (cTd == k) {
          this.field_paymenu_use_new = paramCursor.getInt(i);
        } else if (cTe == k) {
          this.field_is_show_lqb = paramCursor.getInt(i);
        } else if (cTf == k) {
          this.field_is_open_lqb = paramCursor.getInt(i);
        } else if (cTg == k) {
          this.field_lqb_open_url = paramCursor.getString(i);
        } else if (cTh == k) {
          this.field_lqt_cell_is_show = paramCursor.getInt(i);
        } else if (cTi == k) {
          this.field_lqt_cell_icon = paramCursor.getString(i);
        } else if (cTj == k) {
          this.field_lqt_cell_is_open_lqt = paramCursor.getInt(i);
        } else if (cTk == k) {
          this.field_lqt_cell_lqt_open_url = paramCursor.getString(i);
        } else if (cTl == k) {
          this.field_lqt_cell_lqt_title = paramCursor.getString(i);
        } else if (cTm == k) {
          this.field_lqt_cell_lqt_wording = paramCursor.getString(i);
        } else if (ciP == k) {
          this.sKx = paramCursor.getLong(i);
        }
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cSn) {
      localContentValues.put("uin", this.field_uin);
    }
    if (this.cSo) {
      localContentValues.put("is_reg", Integer.valueOf(this.field_is_reg));
    }
    if (this.cSp) {
      localContentValues.put("true_name", this.field_true_name);
    }
    if (this.cSq) {
      localContentValues.put("card_num", Integer.valueOf(this.field_card_num));
    }
    if (this.cSr) {
      localContentValues.put("isDomesticUser", Boolean.valueOf(this.field_isDomesticUser));
    }
    if (this.cSs) {
      localContentValues.put("cre_type", Integer.valueOf(this.field_cre_type));
    }
    if (this.cSt) {
      localContentValues.put("main_card_bind_serialno", this.field_main_card_bind_serialno);
    }
    if (this.cSu) {
      localContentValues.put("ftf_pay_url", this.field_ftf_pay_url);
    }
    if (this.cSv) {
      localContentValues.put("switchConfig", Integer.valueOf(this.field_switchConfig));
    }
    if (this.cSw) {
      localContentValues.put("reset_passwd_flag", this.field_reset_passwd_flag);
    }
    if (this.cSx) {
      localContentValues.put("find_passwd_url", this.field_find_passwd_url);
    }
    if (this.cSy) {
      localContentValues.put("is_open_touch", Integer.valueOf(this.field_is_open_touch));
    }
    if (this.cSz) {
      localContentValues.put("lct_wording", this.field_lct_wording);
    }
    if (this.cSA) {
      localContentValues.put("lct_url", this.field_lct_url);
    }
    if (this.cSB) {
      localContentValues.put("cre_name", this.field_cre_name);
    }
    if (this.cSC) {
      localContentValues.put("lqt_state", Integer.valueOf(this.field_lqt_state));
    }
    if (this.cSD) {
      localContentValues.put("paymenu_use_new", Integer.valueOf(this.field_paymenu_use_new));
    }
    if (this.cSE) {
      localContentValues.put("is_show_lqb", Integer.valueOf(this.field_is_show_lqb));
    }
    if (this.cSF) {
      localContentValues.put("is_open_lqb", Integer.valueOf(this.field_is_open_lqb));
    }
    if (this.cSG) {
      localContentValues.put("lqb_open_url", this.field_lqb_open_url);
    }
    if (this.cSH) {
      localContentValues.put("lqt_cell_is_show", Integer.valueOf(this.field_lqt_cell_is_show));
    }
    if (this.cSI) {
      localContentValues.put("lqt_cell_icon", this.field_lqt_cell_icon);
    }
    if (this.cSJ) {
      localContentValues.put("lqt_cell_is_open_lqt", Integer.valueOf(this.field_lqt_cell_is_open_lqt));
    }
    if (this.cSK) {
      localContentValues.put("lqt_cell_lqt_open_url", this.field_lqt_cell_lqt_open_url);
    }
    if (this.cSL) {
      localContentValues.put("lqt_cell_lqt_title", this.field_lqt_cell_lqt_title);
    }
    if (this.cSM) {
      localContentValues.put("lqt_cell_lqt_wording", this.field_lqt_cell_lqt_wording);
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/g/c/ep.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */