package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class b
  extends c
{
  public static final String[] ciG = new String[0];
  private static final int ciM;
  private static final int ciP = "rowid".hashCode();
  private static final int ciT = "billNo".hashCode();
  private static final int ciU;
  private static final int ciV;
  private boolean ciI = true;
  private boolean ciQ = true;
  private boolean ciR = true;
  private boolean ciS = true;
  public String field_billNo;
  public boolean field_insertmsg;
  public long field_localMsgId;
  public int field_status;
  
  static
  {
    ciM = "insertmsg".hashCode();
    ciU = "localMsgId".hashCode();
    ciV = "status".hashCode();
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
      if (ciT != k) {
        break label65;
      }
      this.field_billNo = paramCursor.getString(i);
      this.ciQ = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (ciM == k)
      {
        if (paramCursor.getInt(i) != 0) {}
        for (boolean bool = true;; bool = false)
        {
          this.field_insertmsg = bool;
          break;
        }
      }
      if (ciU == k) {
        this.field_localMsgId = paramCursor.getLong(i);
      } else if (ciV == k) {
        this.field_status = paramCursor.getInt(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.ciQ) {
      localContentValues.put("billNo", this.field_billNo);
    }
    if (this.ciI) {
      localContentValues.put("insertmsg", Boolean.valueOf(this.field_insertmsg));
    }
    if (this.ciR) {
      localContentValues.put("localMsgId", Long.valueOf(this.field_localMsgId));
    }
    if (this.ciS) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/g/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */