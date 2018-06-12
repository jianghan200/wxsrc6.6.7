package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class ak
  extends c
{
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int ckb;
  private static final int ctm = "labelID".hashCode();
  private static final int ctn = "labelName".hashCode();
  private static final int cto = "labelPYFull".hashCode();
  private static final int ctp = "labelPYShort".hashCode();
  private static final int ctq;
  private boolean cjF = true;
  private boolean cth = true;
  private boolean cti = true;
  private boolean ctj = true;
  private boolean ctk = true;
  private boolean ctl = true;
  public long field_createTime;
  public boolean field_isTemporary;
  public int field_labelID;
  public String field_labelName;
  public String field_labelPYFull;
  public String field_labelPYShort;
  
  static
  {
    ckb = "createTime".hashCode();
    ctq = "isTemporary".hashCode();
  }
  
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
      if (ctm != k) {
        break label65;
      }
      this.field_labelID = paramCursor.getInt(i);
      this.cth = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (ctn == k)
      {
        this.field_labelName = paramCursor.getString(i);
      }
      else if (cto == k)
      {
        this.field_labelPYFull = paramCursor.getString(i);
      }
      else if (ctp == k)
      {
        this.field_labelPYShort = paramCursor.getString(i);
      }
      else if (ckb == k)
      {
        this.field_createTime = paramCursor.getLong(i);
      }
      else
      {
        if (ctq == k)
        {
          if (paramCursor.getInt(i) != 0) {}
          for (boolean bool = true;; bool = false)
          {
            this.field_isTemporary = bool;
            break;
          }
        }
        if (ciP == k) {
          this.sKx = paramCursor.getLong(i);
        }
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cth) {
      localContentValues.put("labelID", Integer.valueOf(this.field_labelID));
    }
    if (this.cti) {
      localContentValues.put("labelName", this.field_labelName);
    }
    if (this.ctj) {
      localContentValues.put("labelPYFull", this.field_labelPYFull);
    }
    if (this.ctk) {
      localContentValues.put("labelPYShort", this.field_labelPYShort);
    }
    if (this.cjF) {
      localContentValues.put("createTime", Long.valueOf(this.field_createTime));
    }
    if (this.ctl) {
      localContentValues.put("isTemporary", Boolean.valueOf(this.field_isTemporary));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/g/c/ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */