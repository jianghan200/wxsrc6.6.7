package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class ay
  extends c
{
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int cmm;
  private static final int cnk;
  private static final int cwG = "prodcutID".hashCode();
  private static final int cwH = "totalCount".hashCode();
  private static final int cwI = "continuCount".hashCode();
  private static final int cwJ;
  private static final int cwK;
  private boolean clP = true;
  private boolean cni = true;
  private boolean cwB = true;
  private boolean cwC = true;
  private boolean cwD = true;
  private boolean cwE = true;
  private boolean cwF = true;
  public int field_continuCount;
  public int field_flag;
  public long field_modifyTime;
  public String field_prodcutID;
  public long field_setFlagTime;
  public long field_showTipsTime;
  public int field_totalCount;
  
  static
  {
    cnk = "flag".hashCode();
    cmm = "modifyTime".hashCode();
    cwJ = "showTipsTime".hashCode();
    cwK = "setFlagTime".hashCode();
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
      if (cwG != k) {
        break label65;
      }
      this.field_prodcutID = paramCursor.getString(i);
      this.cwB = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cwH == k) {
        this.field_totalCount = paramCursor.getInt(i);
      } else if (cwI == k) {
        this.field_continuCount = paramCursor.getInt(i);
      } else if (cnk == k) {
        this.field_flag = paramCursor.getInt(i);
      } else if (cmm == k) {
        this.field_modifyTime = paramCursor.getLong(i);
      } else if (cwJ == k) {
        this.field_showTipsTime = paramCursor.getLong(i);
      } else if (cwK == k) {
        this.field_setFlagTime = paramCursor.getLong(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cwB) {
      localContentValues.put("prodcutID", this.field_prodcutID);
    }
    if (this.cwC) {
      localContentValues.put("totalCount", Integer.valueOf(this.field_totalCount));
    }
    if (this.cwD) {
      localContentValues.put("continuCount", Integer.valueOf(this.field_continuCount));
    }
    if (this.cni) {
      localContentValues.put("flag", Integer.valueOf(this.field_flag));
    }
    if (this.clP) {
      localContentValues.put("modifyTime", Long.valueOf(this.field_modifyTime));
    }
    if (this.cwE) {
      localContentValues.put("showTipsTime", Long.valueOf(this.field_showTipsTime));
    }
    if (this.cwF) {
      localContentValues.put("setFlagTime", Long.valueOf(this.field_setFlagTime));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/g/c/ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */