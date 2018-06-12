package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class ad
  extends c
{
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int ckb;
  private static final int cqe = "canvasId".hashCode();
  private static final int cqf = "canvasXml".hashCode();
  private boolean cjF = true;
  private boolean cqc = true;
  private boolean cqd = true;
  public long field_canvasId;
  public String field_canvasXml;
  public long field_createTime;
  
  static
  {
    ckb = "createTime".hashCode();
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
      if (cqe != k) {
        break label65;
      }
      this.field_canvasId = paramCursor.getLong(i);
      this.cqc = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cqf == k) {
        this.field_canvasXml = paramCursor.getString(i);
      } else if (ckb == k) {
        this.field_createTime = paramCursor.getLong(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cqc) {
      localContentValues.put("canvasId", Long.valueOf(this.field_canvasId));
    }
    if (this.cqd) {
      localContentValues.put("canvasXml", this.field_canvasXml);
    }
    if (this.cjF) {
      localContentValues.put("createTime", Long.valueOf(this.field_createTime));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/g/c/ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */