package com.tencent.mm.storage;

import com.tencent.mm.g.c.t;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class k
  extends t
{
  protected static c.a dhO;
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[2];
    locala.columns = new String[3];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "msgListDataId";
    locala.sKA.put("msgListDataId", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" msgListDataId TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.sKz = "msgListDataId";
    locala.columns[1] = "sessionName";
    locala.sKA.put("sessionName", "TEXT default '' ");
    localStringBuilder.append(" sessionName TEXT default '' ");
    locala.columns[2] = "rowid";
    locala.sql = localStringBuilder.toString();
    dhO = locala;
  }
  
  protected final c.a AX()
  {
    return dhO;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/storage/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */