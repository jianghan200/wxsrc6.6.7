package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class do
  extends c
{
  private static final int cMC;
  private static final int cMD;
  private static final int cME;
  private static final int cMF;
  private static final int cMG;
  private static final int cMH;
  private static final int cMI;
  private static final int cMJ;
  private static final int cMK = "regionCode".hashCode();
  private static final int cML = "snsFlag".hashCode();
  private static final int cMM = "sns_bgurl".hashCode();
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int cke;
  private static final int cld;
  private static final int cli;
  private static final int cpI;
  private static final int cpV;
  private static final int cvS;
  private static final int cvT;
  private static final int cvU;
  private static final int cvV;
  private boolean cMA = true;
  private boolean cMB = true;
  private boolean cMr = true;
  private boolean cMs = true;
  private boolean cMt = true;
  private boolean cMu = true;
  private boolean cMv = true;
  private boolean cMw = true;
  private boolean cMx = true;
  private boolean cMy = true;
  private boolean cMz = true;
  private boolean cjI = true;
  private boolean ckM = true;
  private boolean clg = true;
  private boolean cpE = true;
  private boolean cpN = true;
  private boolean cvq = true;
  private boolean cvr = true;
  private boolean cvs = true;
  private boolean cvt = true;
  public String field_city;
  public String field_distance;
  public int field_hasHDImg;
  public int field_imgstatus;
  public int field_insertBatch;
  public byte[] field_lvbuffer;
  public String field_nickname;
  public String field_province;
  public String field_regionCode;
  public int field_reserved1;
  public int field_reserved2;
  public String field_reserved3;
  public String field_reserved4;
  public int field_sex;
  public int field_shakeItemID;
  public String field_signature;
  public int field_snsFlag;
  public String field_sns_bgurl;
  public int field_type;
  public String field_username;
  
  static
  {
    cMC = "shakeItemID".hashCode();
    cli = "username".hashCode();
    cpI = "nickname".hashCode();
    cMD = "province".hashCode();
    cME = "city".hashCode();
    cld = "signature".hashCode();
    cMF = "distance".hashCode();
    cMG = "sex".hashCode();
    cMH = "imgstatus".hashCode();
    cMI = "hasHDImg".hashCode();
    cMJ = "insertBatch".hashCode();
    cvS = "reserved1".hashCode();
    cvT = "reserved2".hashCode();
    cvU = "reserved3".hashCode();
    cvV = "reserved4".hashCode();
    cke = "type".hashCode();
    cpV = "lvbuffer".hashCode();
  }
  
  public final void d(Cursor paramCursor)
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
      if (cMC != k) {
        break label65;
      }
      this.field_shakeItemID = paramCursor.getInt(i);
      this.cMr = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cli == k) {
        this.field_username = paramCursor.getString(i);
      } else if (cpI == k) {
        this.field_nickname = paramCursor.getString(i);
      } else if (cMD == k) {
        this.field_province = paramCursor.getString(i);
      } else if (cME == k) {
        this.field_city = paramCursor.getString(i);
      } else if (cld == k) {
        this.field_signature = paramCursor.getString(i);
      } else if (cMF == k) {
        this.field_distance = paramCursor.getString(i);
      } else if (cMG == k) {
        this.field_sex = paramCursor.getInt(i);
      } else if (cMH == k) {
        this.field_imgstatus = paramCursor.getInt(i);
      } else if (cMI == k) {
        this.field_hasHDImg = paramCursor.getInt(i);
      } else if (cMJ == k) {
        this.field_insertBatch = paramCursor.getInt(i);
      } else if (cvS == k) {
        this.field_reserved1 = paramCursor.getInt(i);
      } else if (cvT == k) {
        this.field_reserved2 = paramCursor.getInt(i);
      } else if (cvU == k) {
        this.field_reserved3 = paramCursor.getString(i);
      } else if (cvV == k) {
        this.field_reserved4 = paramCursor.getString(i);
      } else if (cke == k) {
        this.field_type = paramCursor.getInt(i);
      } else if (cpV == k) {
        this.field_lvbuffer = paramCursor.getBlob(i);
      } else if (cMK == k) {
        this.field_regionCode = paramCursor.getString(i);
      } else if (cML == k) {
        this.field_snsFlag = paramCursor.getInt(i);
      } else if (cMM == k) {
        this.field_sns_bgurl = paramCursor.getString(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cMr) {
      localContentValues.put("shakeItemID", Integer.valueOf(this.field_shakeItemID));
    }
    if (this.clg) {
      localContentValues.put("username", this.field_username);
    }
    if (this.cpE) {
      localContentValues.put("nickname", this.field_nickname);
    }
    if (this.cMs) {
      localContentValues.put("province", this.field_province);
    }
    if (this.cMt) {
      localContentValues.put("city", this.field_city);
    }
    if (this.ckM) {
      localContentValues.put("signature", this.field_signature);
    }
    if (this.cMu) {
      localContentValues.put("distance", this.field_distance);
    }
    if (this.cMv) {
      localContentValues.put("sex", Integer.valueOf(this.field_sex));
    }
    if (this.cMw) {
      localContentValues.put("imgstatus", Integer.valueOf(this.field_imgstatus));
    }
    if (this.cMx) {
      localContentValues.put("hasHDImg", Integer.valueOf(this.field_hasHDImg));
    }
    if (this.cMy) {
      localContentValues.put("insertBatch", Integer.valueOf(this.field_insertBatch));
    }
    if (this.cvq) {
      localContentValues.put("reserved1", Integer.valueOf(this.field_reserved1));
    }
    if (this.cvr) {
      localContentValues.put("reserved2", Integer.valueOf(this.field_reserved2));
    }
    if (this.cvs) {
      localContentValues.put("reserved3", this.field_reserved3);
    }
    if (this.cvt) {
      localContentValues.put("reserved4", this.field_reserved4);
    }
    if (this.cjI) {
      localContentValues.put("type", Integer.valueOf(this.field_type));
    }
    if (this.cpN) {
      localContentValues.put("lvbuffer", this.field_lvbuffer);
    }
    if (this.cMz) {
      localContentValues.put("regionCode", this.field_regionCode);
    }
    if (this.cMA) {
      localContentValues.put("snsFlag", Integer.valueOf(this.field_snsFlag));
    }
    if (this.cMB) {
      localContentValues.put("sns_bgurl", this.field_sns_bgurl);
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/g/c/do.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */