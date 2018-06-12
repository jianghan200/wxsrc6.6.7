package com.tencent.mm.plugin.boots.a;

import com.tencent.mm.g.c.e;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class a
  extends e
{
  public static c.a dhO;
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[4];
    locala.columns = new String[5];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "key";
    locala.sKA.put("key", "INTEGER PRIMARY KEY  COLLATE NOCASE ");
    localStringBuilder.append(" key INTEGER PRIMARY KEY  COLLATE NOCASE ");
    localStringBuilder.append(", ");
    locala.sKz = "key";
    locala.columns[1] = "mau";
    locala.sKA.put("mau", "INTEGER");
    localStringBuilder.append(" mau INTEGER");
    localStringBuilder.append(", ");
    locala.columns[2] = "dau";
    locala.sKA.put("dau", "INTEGER");
    localStringBuilder.append(" dau INTEGER");
    localStringBuilder.append(", ");
    locala.columns[3] = "useTime";
    locala.sKA.put("useTime", "LONG");
    localStringBuilder.append(" useTime LONG");
    locala.columns[4] = "rowid";
    locala.sql = localStringBuilder.toString();
    dhO = locala;
  }
  
  protected final c.a AX()
  {
    return dhO;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/boots/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */