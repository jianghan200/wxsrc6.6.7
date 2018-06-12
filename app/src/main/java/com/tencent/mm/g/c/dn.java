package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class dn
  extends c
{
  private static final int cMm;
  private static final int cMn;
  private static final int cMo;
  private static final int cMp;
  private static final int cMq;
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int ckw;
  private boolean cMh = true;
  private boolean cMi = true;
  private boolean cMj = true;
  private boolean cMk = true;
  private boolean cMl = true;
  private boolean cku = true;
  public long field_ScanTime;
  public int field_funcType;
  public String field_productId;
  public String field_qrcodeUrl;
  public int field_scene;
  public String field_xmlContent;
  
  static
  {
    cMm = "productId".hashCode();
    cMn = "xmlContent".hashCode();
    cMo = "ScanTime".hashCode();
    cMp = "funcType".hashCode();
    cMq = "qrcodeUrl".hashCode();
    ckw = "scene".hashCode();
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
      if (cMm != k) {
        break label65;
      }
      this.field_productId = paramCursor.getString(i);
      this.cMh = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cMn == k) {
        this.field_xmlContent = paramCursor.getString(i);
      } else if (cMo == k) {
        this.field_ScanTime = paramCursor.getLong(i);
      } else if (cMp == k) {
        this.field_funcType = paramCursor.getInt(i);
      } else if (cMq == k) {
        this.field_qrcodeUrl = paramCursor.getString(i);
      } else if (ckw == k) {
        this.field_scene = paramCursor.getInt(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cMh) {
      localContentValues.put("productId", this.field_productId);
    }
    if (this.cMi) {
      localContentValues.put("xmlContent", this.field_xmlContent);
    }
    if (this.cMj) {
      localContentValues.put("ScanTime", Long.valueOf(this.field_ScanTime));
    }
    if (this.cMk) {
      localContentValues.put("funcType", Integer.valueOf(this.field_funcType));
    }
    if (this.cMl) {
      localContentValues.put("qrcodeUrl", this.field_qrcodeUrl);
    }
    if (this.cku) {
      localContentValues.put("scene", Integer.valueOf(this.field_scene));
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/g/c/dn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */