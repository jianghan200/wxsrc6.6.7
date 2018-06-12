package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class aa
  extends c
{
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int ciV;
  private static final int ckP;
  private static final int cke;
  private static final int cli = "username".hashCode();
  private static final int clj;
  private static final int cop;
  private static final int cpA;
  private static final int cpB;
  private static final int cpo;
  private static final int cpp;
  private static final int cpq;
  private static final int cpr;
  private static final int cps;
  private static final int cpt;
  private static final int cpu;
  private static final int cpv;
  private static final int cpw;
  private static final int cpx;
  private static final int cpy;
  private static final int cpz;
  private boolean ciS = true;
  private boolean cjI = true;
  private boolean cky = true;
  private boolean clg = true;
  private boolean clh = true;
  private boolean cod = true;
  private boolean cpa = true;
  private boolean cpb = true;
  private boolean cpc = true;
  private boolean cpd = true;
  private boolean cpe = true;
  private boolean cpf = true;
  private boolean cpg = true;
  private boolean cph = true;
  private boolean cpi = true;
  private boolean cpj = true;
  private boolean cpk = true;
  private boolean cpl = true;
  private boolean cpm = true;
  private boolean cpn = true;
  public int field_acceptType;
  public String field_appId;
  public String field_attrSyncVersion;
  public int field_bitFlag;
  public int field_brandFlag;
  public String field_brandIconURL;
  public String field_brandInfo;
  public String field_brandList;
  public String field_brandListContent;
  public String field_brandListVersion;
  public String field_enterpriseFather;
  public String field_extInfo;
  public int field_hadAlert;
  public long field_incrementUpdateTime;
  public String field_kfWorkerId;
  public int field_specialType;
  public int field_status;
  public int field_type;
  public long field_updateTime;
  public String field_username;
  
  static
  {
    ckP = "appId".hashCode();
    cpo = "brandList".hashCode();
    cpp = "brandListVersion".hashCode();
    cpq = "brandListContent".hashCode();
    cpr = "brandFlag".hashCode();
    cps = "extInfo".hashCode();
    cpt = "brandInfo".hashCode();
    cpu = "brandIconURL".hashCode();
    clj = "updateTime".hashCode();
    cpv = "hadAlert".hashCode();
    cpw = "acceptType".hashCode();
    cke = "type".hashCode();
    ciV = "status".hashCode();
    cpx = "enterpriseFather".hashCode();
    cpy = "kfWorkerId".hashCode();
    cpz = "specialType".hashCode();
    cpA = "attrSyncVersion".hashCode();
    cpB = "incrementUpdateTime".hashCode();
    cop = "bitFlag".hashCode();
  }
  
  public void d(Cursor paramCursor)
  {
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null) {
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    label20:
    int k;
    if (i < j)
    {
      k = arrayOfString[i].hashCode();
      if (cli != k) {
        break label65;
      }
      this.field_username = paramCursor.getString(i);
      this.clg = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (ckP == k) {
        this.field_appId = paramCursor.getString(i);
      } else if (cpo == k) {
        this.field_brandList = paramCursor.getString(i);
      } else if (cpp == k) {
        this.field_brandListVersion = paramCursor.getString(i);
      } else if (cpq == k) {
        this.field_brandListContent = paramCursor.getString(i);
      } else if (cpr == k) {
        this.field_brandFlag = paramCursor.getInt(i);
      } else if (cps == k) {
        this.field_extInfo = paramCursor.getString(i);
      } else if (cpt == k) {
        this.field_brandInfo = paramCursor.getString(i);
      } else if (cpu == k) {
        this.field_brandIconURL = paramCursor.getString(i);
      } else if (clj == k) {
        this.field_updateTime = paramCursor.getLong(i);
      } else if (cpv == k) {
        this.field_hadAlert = paramCursor.getInt(i);
      } else if (cpw == k) {
        this.field_acceptType = paramCursor.getInt(i);
      } else if (cke == k) {
        this.field_type = paramCursor.getInt(i);
      } else if (ciV == k) {
        this.field_status = paramCursor.getInt(i);
      } else if (cpx == k) {
        this.field_enterpriseFather = paramCursor.getString(i);
      } else if (cpy == k) {
        this.field_kfWorkerId = paramCursor.getString(i);
      } else if (cpz == k) {
        this.field_specialType = paramCursor.getInt(i);
      } else if (cpA == k) {
        this.field_attrSyncVersion = paramCursor.getString(i);
      } else if (cpB == k) {
        this.field_incrementUpdateTime = paramCursor.getLong(i);
      } else if (cop == k) {
        this.field_bitFlag = paramCursor.getInt(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.clg) {
      localContentValues.put("username", this.field_username);
    }
    if (this.cky) {
      localContentValues.put("appId", this.field_appId);
    }
    if (this.field_brandList == null) {
      this.field_brandList = "";
    }
    if (this.cpa) {
      localContentValues.put("brandList", this.field_brandList);
    }
    if (this.cpb) {
      localContentValues.put("brandListVersion", this.field_brandListVersion);
    }
    if (this.cpc) {
      localContentValues.put("brandListContent", this.field_brandListContent);
    }
    if (this.cpd) {
      localContentValues.put("brandFlag", Integer.valueOf(this.field_brandFlag));
    }
    if (this.cpe) {
      localContentValues.put("extInfo", this.field_extInfo);
    }
    if (this.cpf) {
      localContentValues.put("brandInfo", this.field_brandInfo);
    }
    if (this.cpg) {
      localContentValues.put("brandIconURL", this.field_brandIconURL);
    }
    if (this.clh) {
      localContentValues.put("updateTime", Long.valueOf(this.field_updateTime));
    }
    if (this.cph) {
      localContentValues.put("hadAlert", Integer.valueOf(this.field_hadAlert));
    }
    if (this.cpi) {
      localContentValues.put("acceptType", Integer.valueOf(this.field_acceptType));
    }
    if (this.cjI) {
      localContentValues.put("type", Integer.valueOf(this.field_type));
    }
    if (this.ciS) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.cpj) {
      localContentValues.put("enterpriseFather", this.field_enterpriseFather);
    }
    if (this.cpk) {
      localContentValues.put("kfWorkerId", this.field_kfWorkerId);
    }
    if (this.cpl) {
      localContentValues.put("specialType", Integer.valueOf(this.field_specialType));
    }
    if (this.cpm) {
      localContentValues.put("attrSyncVersion", this.field_attrSyncVersion);
    }
    if (this.cpn) {
      localContentValues.put("incrementUpdateTime", Long.valueOf(this.field_incrementUpdateTime));
    }
    if (this.cod) {
      localContentValues.put("bitFlag", Integer.valueOf(this.field_bitFlag));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/g/c/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */