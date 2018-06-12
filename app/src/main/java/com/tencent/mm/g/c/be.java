package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public abstract class be
  extends c
{
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int cjf;
  private static final int cxQ = "configId".hashCode();
  private boolean ciX = true;
  private boolean cxP = true;
  public int field_configId;
  public String field_value;
  
  static
  {
    cjf = "value".hashCode();
  }
  
  public static c.a wI()
  {
    c.a locala = new c.a();
    locala.sKy = new Field[2];
    locala.columns = new String[3];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "configId";
    locala.sKA.put("configId", "INTEGER PRIMARY KEY ");
    localStringBuilder.append(" configId INTEGER PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.sKz = "configId";
    locala.columns[1] = "value";
    locala.sKA.put("value", "TEXT");
    localStringBuilder.append(" value TEXT");
    locala.columns[2] = "rowid";
    locala.sql = localStringBuilder.toString();
    return locala;
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
      if (cxQ != k) {
        break label65;
      }
      this.field_configId = paramCursor.getInt(i);
      this.cxP = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (cjf == k) {
        this.field_value = paramCursor.getString(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cxP) {
      localContentValues.put("configId", Integer.valueOf(this.field_configId));
    }
    if (this.ciX) {
      localContentValues.put("value", this.field_value);
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/g/c/be.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */