package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.protocal.c.db;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;

public abstract class ct
  extends c
{
  private static final int cIY = "acctTypeId".hashCode();
  private static final int cIZ;
  private static final int cJd;
  private static final int cJe;
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int clj;
  private boolean cIV = true;
  private boolean cIW = true;
  private boolean cJb = true;
  private boolean cJc = true;
  private boolean clh = true;
  public String field_acctTypeId;
  public db field_appRec;
  public String field_appid;
  public String field_language;
  public long field_updateTime;
  
  static
  {
    cJd = "appid".hashCode();
    cIZ = "language".hashCode();
    cJe = "appRec".hashCode();
    clj = "updateTime".hashCode();
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
      if (cJd != k) {
        break label60;
      }
      this.field_appid = paramCursor.getString(i);
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label60:
      if (cIZ == k) {
        this.field_language = paramCursor.getString(i);
      } else if (cJe == k) {
        try
        {
          byte[] arrayOfByte = paramCursor.getBlob(i);
          if ((arrayOfByte == null) || (arrayOfByte.length <= 0)) {
            continue;
          }
          this.field_appRec = ((db)new db().aG(arrayOfByte));
        }
        catch (IOException localIOException)
        {
          x.e("MicroMsg.SDK.BaseOpenIMAppIdInfo", localIOException.getMessage());
        }
      } else if (clj == k) {
        this.field_updateTime = paramCursor.getLong(i);
      } else if (cIY == k) {
        this.field_acctTypeId = paramCursor.getString(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cJb) {
      localContentValues.put("appid", this.field_appid);
    }
    if (this.cIW) {
      localContentValues.put("language", this.field_language);
    }
    if ((this.cJc) && (this.field_appRec != null)) {}
    try
    {
      localContentValues.put("appRec", this.field_appRec.toByteArray());
      if (this.clh) {
        localContentValues.put("updateTime", Long.valueOf(this.field_updateTime));
      }
      if (this.cIV) {
        localContentValues.put("acctTypeId", this.field_acctTypeId);
      }
      if (this.sKx > 0L) {
        localContentValues.put("rowid", Long.valueOf(this.sKx));
      }
      return localContentValues;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        x.e("MicroMsg.SDK.BaseOpenIMAppIdInfo", localIOException.getMessage());
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/g/c/ct.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */