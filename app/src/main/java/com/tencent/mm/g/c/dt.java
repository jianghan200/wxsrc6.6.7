package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class dt
  extends c
{
  private static final int cNK;
  private static final int cNL;
  private static final int cNM;
  private static final int cNN;
  private static final int cNO;
  private static final int cNP;
  private static final int cNQ;
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int cjy = "key".hashCode();
  private static final int cnk;
  private static final int czu;
  private boolean cND = true;
  private boolean cNE = true;
  private boolean cNF = true;
  private boolean cNG = true;
  private boolean cNH = true;
  private boolean cNI = true;
  private boolean cNJ = true;
  private boolean cju = true;
  private boolean cni = true;
  private boolean cyZ = true;
  public String field_cnValue;
  public int field_eggIndex;
  public String field_enValue;
  public String field_fileName;
  public int field_flag;
  public String field_key;
  public int field_position;
  public String field_qqValue;
  public String field_thValue;
  public String field_twValue;
  
  static
  {
    cNK = "cnValue".hashCode();
    cNL = "qqValue".hashCode();
    cNM = "twValue".hashCode();
    cNN = "enValue".hashCode();
    cNO = "thValue".hashCode();
    czu = "fileName".hashCode();
    cNP = "eggIndex".hashCode();
    cNQ = "position".hashCode();
    cnk = "flag".hashCode();
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
      if (cjy != k) {
        break label65;
      }
      this.field_key = paramCursor.getString(i);
      this.cju = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cNK == k) {
        this.field_cnValue = paramCursor.getString(i);
      } else if (cNL == k) {
        this.field_qqValue = paramCursor.getString(i);
      } else if (cNM == k) {
        this.field_twValue = paramCursor.getString(i);
      } else if (cNN == k) {
        this.field_enValue = paramCursor.getString(i);
      } else if (cNO == k) {
        this.field_thValue = paramCursor.getString(i);
      } else if (czu == k) {
        this.field_fileName = paramCursor.getString(i);
      } else if (cNP == k) {
        this.field_eggIndex = paramCursor.getInt(i);
      } else if (cNQ == k) {
        this.field_position = paramCursor.getInt(i);
      } else if (cnk == k) {
        this.field_flag = paramCursor.getInt(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cju) {
      localContentValues.put("key", this.field_key);
    }
    if (this.cND) {
      localContentValues.put("cnValue", this.field_cnValue);
    }
    if (this.cNE) {
      localContentValues.put("qqValue", this.field_qqValue);
    }
    if (this.cNF) {
      localContentValues.put("twValue", this.field_twValue);
    }
    if (this.cNG) {
      localContentValues.put("enValue", this.field_enValue);
    }
    if (this.cNH) {
      localContentValues.put("thValue", this.field_thValue);
    }
    if (this.cyZ) {
      localContentValues.put("fileName", this.field_fileName);
    }
    if (this.cNI) {
      localContentValues.put("eggIndex", Integer.valueOf(this.field_eggIndex));
    }
    if (this.cNJ) {
      localContentValues.put("position", Integer.valueOf(this.field_position));
    }
    if (this.cni) {
      localContentValues.put("flag", Integer.valueOf(this.field_flag));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/g/c/dt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */