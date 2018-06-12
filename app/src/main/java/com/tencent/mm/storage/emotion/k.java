package com.tencent.mm.storage.emotion;

import com.tencent.mm.g.c.ax;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class k
  extends ax
{
  protected static c.a dhO;
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[2];
    locala.columns = new String[3];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "productID";
    locala.sKA.put("productID", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" productID TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.sKz = "productID";
    locala.columns[1] = "content";
    locala.sKA.put("content", "BLOB default '' ");
    localStringBuilder.append(" content BLOB default '' ");
    locala.columns[2] = "rowid";
    locala.sql = localStringBuilder.toString();
    dhO = locala;
  }
  
  protected final c.a AX()
  {
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/storage/emotion/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */