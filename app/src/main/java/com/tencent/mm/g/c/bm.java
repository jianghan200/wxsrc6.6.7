package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class bm
  extends c
{
  private static final int cAn;
  private static final int cAo;
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int ckb;
  private static final int cuh = "id".hashCode();
  private boolean cAl = true;
  private boolean cAm = true;
  private boolean cjF = true;
  private boolean cue = true;
  public long field_createTime;
  public String field_id;
  public String field_logContent;
  public int field_protocolNumber;
  
  static
  {
    cAn = "protocolNumber".hashCode();
    cAo = "logContent".hashCode();
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
      if (cuh != k) {
        break label65;
      }
      this.field_id = paramCursor.getString(i);
      this.cue = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cAn == k) {
        this.field_protocolNumber = paramCursor.getInt(i);
      } else if (cAo == k) {
        this.field_logContent = paramCursor.getString(i);
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
    if (this.cue) {
      localContentValues.put("id", this.field_id);
    }
    if (this.cAl) {
      localContentValues.put("protocolNumber", Integer.valueOf(this.field_protocolNumber));
    }
    if (this.cAm) {
      localContentValues.put("logContent", this.field_logContent);
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/g/c/bm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */