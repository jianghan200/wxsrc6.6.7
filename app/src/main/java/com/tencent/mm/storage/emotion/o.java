package com.tencent.mm.storage.emotion;

import android.database.Cursor;
import com.tencent.mm.g.c.bs;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class o
  extends bs
{
  public static c.a dhO;
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[2];
    locala.columns = new String[3];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "reqType";
    locala.sKA.put("reqType", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" reqType TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.sKz = "reqType";
    locala.columns[1] = "cache";
    locala.sKA.put("cache", "BLOB default '' ");
    localStringBuilder.append(" cache BLOB default '' ");
    locala.columns[2] = "rowid";
    locala.sql = localStringBuilder.toString();
    dhO = locala;
  }
  
  public o(Cursor paramCursor)
  {
    if (paramCursor == null) {
      return;
    }
    d(paramCursor);
  }
  
  public o(String paramString, byte[] paramArrayOfByte)
  {
    this.field_reqType = paramString;
    this.field_cache = paramArrayOfByte;
  }
  
  protected final c.a AX()
  {
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/storage/emotion/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */