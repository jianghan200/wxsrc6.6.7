package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class cf
  extends c
{
  private static final int cDO;
  private static final int cDP;
  private static final int cDQ;
  private static final int cDR = "addressId".hashCode();
  private static final int cDS = "phoneType".hashCode();
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int ciV;
  private boolean cDJ = true;
  private boolean cDK = true;
  private boolean cDL = true;
  private boolean cDM = true;
  private boolean cDN = true;
  private boolean ciS = true;
  public long field_addressId;
  public long field_calltime;
  public long field_duration;
  public int field_phoneType;
  public String field_phonenumber;
  public int field_status;
  
  static
  {
    cDO = "phonenumber".hashCode();
    cDP = "calltime".hashCode();
    cDQ = "duration".hashCode();
    ciV = "status".hashCode();
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
      if (cDO != k) {
        break label60;
      }
      this.field_phonenumber = paramCursor.getString(i);
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label60:
      if (cDP == k) {
        this.field_calltime = paramCursor.getLong(i);
      } else if (cDQ == k) {
        this.field_duration = paramCursor.getLong(i);
      } else if (ciV == k) {
        this.field_status = paramCursor.getInt(i);
      } else if (cDR == k) {
        this.field_addressId = paramCursor.getLong(i);
      } else if (cDS == k) {
        this.field_phoneType = paramCursor.getInt(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cDJ) {
      localContentValues.put("phonenumber", this.field_phonenumber);
    }
    if (this.cDK) {
      localContentValues.put("calltime", Long.valueOf(this.field_calltime));
    }
    if (this.cDL) {
      localContentValues.put("duration", Long.valueOf(this.field_duration));
    }
    if (this.ciS) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.cDM) {
      localContentValues.put("addressId", Long.valueOf(this.field_addressId));
    }
    if (this.cDN) {
      localContentValues.put("phoneType", Integer.valueOf(this.field_phoneType));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/g/c/cf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */