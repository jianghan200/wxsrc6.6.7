package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.protocal.c.as;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;

public abstract class cs
  extends c
{
  private static final int cIY;
  private static final int cIZ;
  private static final int cJa;
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int clj;
  private boolean cIV = true;
  private boolean cIW = true;
  private boolean cIX = true;
  private boolean clh = true;
  public as field_accTypeRec;
  public String field_acctTypeId;
  public String field_language;
  public long field_updateTime;
  
  static
  {
    cIY = "acctTypeId".hashCode();
    cIZ = "language".hashCode();
    cJa = "accTypeRec".hashCode();
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
      if (cIY != k) {
        break label60;
      }
      this.field_acctTypeId = paramCursor.getString(i);
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label60:
      if (cIZ == k) {
        this.field_language = paramCursor.getString(i);
      } else if (cJa == k) {
        try
        {
          byte[] arrayOfByte = paramCursor.getBlob(i);
          if ((arrayOfByte == null) || (arrayOfByte.length <= 0)) {
            continue;
          }
          this.field_accTypeRec = ((as)new as().aG(arrayOfByte));
        }
        catch (IOException localIOException)
        {
          x.e("MicroMsg.SDK.BaseOpenIMAccTypeInfo", localIOException.getMessage());
        }
      } else if (clj == k) {
        this.field_updateTime = paramCursor.getLong(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cIV) {
      localContentValues.put("acctTypeId", this.field_acctTypeId);
    }
    if (this.cIW) {
      localContentValues.put("language", this.field_language);
    }
    if ((this.cIX) && (this.field_accTypeRec != null)) {}
    try
    {
      localContentValues.put("accTypeRec", this.field_accTypeRec.toByteArray());
      if (this.clh) {
        localContentValues.put("updateTime", Long.valueOf(this.field_updateTime));
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
        x.e("MicroMsg.SDK.BaseOpenIMAccTypeInfo", localIOException.getMessage());
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/g/c/cs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */