package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class cd
  extends c
{
  private static final int cBa;
  private static final int cDB;
  private static final int cDC = "descUrl".hashCode();
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int ckj;
  private static final int cnU;
  private static final int cnf;
  private static final int cxB = "svrId".hashCode();
  private boolean cAR = true;
  private boolean cDA = true;
  private boolean cDz = true;
  private boolean cjN = true;
  private boolean cnG = true;
  private boolean cnb = true;
  private boolean cxy = true;
  public String field_content;
  public String field_descUrl;
  public short field_isRead;
  public int field_msgType;
  public long field_pushTime;
  public long field_svrId;
  public String field_title;
  
  static
  {
    cBa = "isRead".hashCode();
    cnf = "title".hashCode();
    ckj = "content".hashCode();
    cDB = "pushTime".hashCode();
    cnU = "msgType".hashCode();
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
      if (cxB != k) {
        break label65;
      }
      this.field_svrId = paramCursor.getLong(i);
      this.cxy = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cBa == k) {
        this.field_isRead = paramCursor.getShort(i);
      } else if (cnf == k) {
        this.field_title = paramCursor.getString(i);
      } else if (ckj == k) {
        this.field_content = paramCursor.getString(i);
      } else if (cDB == k) {
        this.field_pushTime = paramCursor.getLong(i);
      } else if (cnU == k) {
        this.field_msgType = paramCursor.getInt(i);
      } else if (cDC == k) {
        this.field_descUrl = paramCursor.getString(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cxy) {
      localContentValues.put("svrId", Long.valueOf(this.field_svrId));
    }
    if (this.cAR) {
      localContentValues.put("isRead", Short.valueOf(this.field_isRead));
    }
    if (this.cnb) {
      localContentValues.put("title", this.field_title);
    }
    if (this.cjN) {
      localContentValues.put("content", this.field_content);
    }
    if (this.cDz) {
      localContentValues.put("pushTime", Long.valueOf(this.field_pushTime));
    }
    if (this.cnG) {
      localContentValues.put("msgType", Integer.valueOf(this.field_msgType));
    }
    if (this.cDA) {
      localContentValues.put("descUrl", this.field_descUrl);
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/g/c/cd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */