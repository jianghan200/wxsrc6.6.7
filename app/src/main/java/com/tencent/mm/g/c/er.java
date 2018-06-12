package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class er
  extends c
{
  private static final int cTu;
  private static final int cTv = "configUrl".hashCode();
  private static final int cTw = "configResources".hashCode();
  private static final int cTx = "configCrc32".hashCode();
  private static final int cTy = "isFromXml".hashCode();
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int cxQ;
  private boolean cTp = true;
  private boolean cTq = true;
  private boolean cTr = true;
  private boolean cTs = true;
  private boolean cTt = true;
  private boolean cxP = true;
  public long field_configCrc32;
  public String field_configId;
  public String field_configResources;
  public String field_configUrl;
  public boolean field_disable;
  public boolean field_isFromXml;
  
  static
  {
    cTu = "disable".hashCode();
    cxQ = "configId".hashCode();
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
    boolean bool;
    if (i < j)
    {
      k = arrayOfString[i].hashCode();
      if (cTu != k) {
        break label74;
      }
      if (paramCursor.getInt(i) == 0) {
        break label68;
      }
      bool = true;
      label55:
      this.field_disable = bool;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label68:
      bool = false;
      break label55;
      label74:
      if (cxQ == k)
      {
        this.field_configId = paramCursor.getString(i);
        this.cxP = true;
      }
      else if (cTv == k)
      {
        this.field_configUrl = paramCursor.getString(i);
      }
      else if (cTw == k)
      {
        this.field_configResources = paramCursor.getString(i);
      }
      else if (cTx == k)
      {
        this.field_configCrc32 = paramCursor.getLong(i);
      }
      else
      {
        if (cTy == k)
        {
          if (paramCursor.getInt(i) != 0) {}
          for (bool = true;; bool = false)
          {
            this.field_isFromXml = bool;
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
    if (this.cTp) {
      localContentValues.put("disable", Boolean.valueOf(this.field_disable));
    }
    if (this.cxP) {
      localContentValues.put("configId", this.field_configId);
    }
    if (this.cTq) {
      localContentValues.put("configUrl", this.field_configUrl);
    }
    if (this.cTr) {
      localContentValues.put("configResources", this.field_configResources);
    }
    if (this.cTs) {
      localContentValues.put("configCrc32", Long.valueOf(this.field_configCrc32));
    }
    if (this.cTt) {
      localContentValues.put("isFromXml", Boolean.valueOf(this.field_isFromXml));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/g/c/er.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */