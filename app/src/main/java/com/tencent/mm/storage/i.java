package com.tencent.mm.storage;

import com.tencent.mm.g.c.s;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class i
  extends s
{
  protected static c.a dhO;
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[3];
    locala.columns = new String[4];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "deviceId";
    locala.sKA.put("deviceId", "TEXT default '' ");
    localStringBuilder.append(" deviceId TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[1] = "sessionName";
    locala.sKA.put("sessionName", "TEXT default '' ");
    localStringBuilder.append(" sessionName TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[2] = "moveTime";
    locala.sKA.put("moveTime", "BLOB default '' ");
    localStringBuilder.append(" moveTime BLOB default '' ");
    locala.columns[3] = "rowid";
    locala.sql = localStringBuilder.toString();
    dhO = locala;
  }
  
  protected final c.a AX()
  {
    return dhO;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/storage/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */