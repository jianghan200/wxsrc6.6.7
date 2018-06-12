package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public abstract class g
  extends c
{
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int cjZ = "userName".hashCode();
  private static final int ckw = "scene".hashCode();
  private static final int ckx = "ticket".hashCode();
  private boolean cjD = true;
  private boolean cku = true;
  private boolean ckv = true;
  public int field_scene;
  public String field_ticket;
  public String field_userName;
  
  public static c.a wI()
  {
    c.a locala = new c.a();
    locala.sKy = new Field[3];
    locala.columns = new String[4];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "userName";
    locala.sKA.put("userName", "TEXT");
    localStringBuilder.append(" userName TEXT");
    localStringBuilder.append(", ");
    locala.columns[1] = "scene";
    locala.sKA.put("scene", "INTEGER");
    localStringBuilder.append(" scene INTEGER");
    localStringBuilder.append(", ");
    locala.columns[2] = "ticket";
    locala.sKA.put("ticket", "TEXT");
    localStringBuilder.append(" ticket TEXT");
    locala.columns[3] = "rowid";
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
      if (cjZ != k) {
        break label60;
      }
      this.field_userName = paramCursor.getString(i);
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label60:
      if (ckw == k) {
        this.field_scene = paramCursor.getInt(i);
      } else if (ckx == k) {
        this.field_ticket = paramCursor.getString(i);
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cjD) {
      localContentValues.put("userName", this.field_userName);
    }
    if (this.cku) {
      localContentValues.put("scene", Integer.valueOf(this.field_scene));
    }
    if (this.ckv) {
      localContentValues.put("ticket", this.field_ticket);
    }
    if (this.sKx > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.sKx));
    }
    return localContentValues;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/g/c/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */