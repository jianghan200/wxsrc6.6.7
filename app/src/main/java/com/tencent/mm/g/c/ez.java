package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class ez
  extends c
{
  private static final int cUN;
  private static final int cUO = "msgtime".hashCode();
  public static final String[] ciG = new String[0];
  private static final int ciO = "msgId".hashCode();
  private static final int ciP = "rowid".hashCode();
  private static final int cli = "username".hashCode();
  private static final int clp;
  private static final int cnU = "msgType".hashCode();
  private static final int cxM;
  private boolean cUL = true;
  private boolean cUM = true;
  private boolean ciK = true;
  private boolean clg = true;
  private boolean clm = true;
  private boolean cnG = true;
  private boolean cxG = true;
  public long field_msgId;
  public int field_msgSubType;
  public int field_msgType;
  public long field_msgtime;
  public String field_path;
  public long field_size;
  public String field_username;
  
  static
  {
    cUN = "msgSubType".hashCode();
    cxM = "path".hashCode();
    clp = "size".hashCode();
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
      if (ciO != k) {
        break label60;
      }
      this.field_msgId = paramCursor.getLong(i);
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label60:
      if (cli == k) {
        this.field_username = paramCursor.getString(i);
      } else if (cnU == k) {
        this.field_msgType = paramCursor.getInt(i);
      } else if (cUN == k) {
        this.field_msgSubType = paramCursor.getInt(i);
      } else if (cxM == k) {
        this.field_path = paramCursor.getString(i);
      } else if (clp == k) {
        this.field_size = paramCursor.getLong(i);
      } else if (cUO == k) {
        this.field_msgtime = paramCursor.getLong(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.ciK) {
      localContentValues.put("msgId", Long.valueOf(this.field_msgId));
    }
    if (this.clg) {
      localContentValues.put("username", this.field_username);
    }
    if (this.cnG) {
      localContentValues.put("msgType", Integer.valueOf(this.field_msgType));
    }
    if (this.cUL) {
      localContentValues.put("msgSubType", Integer.valueOf(this.field_msgSubType));
    }
    if (this.cxG) {
      localContentValues.put("path", this.field_path);
    }
    if (this.clm) {
      localContentValues.put("size", Long.valueOf(this.field_size));
    }
    if (this.cUM) {
      localContentValues.put("msgtime", Long.valueOf(this.field_msgtime));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/g/c/ez.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */