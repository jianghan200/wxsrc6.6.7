package com.tencent.mm.plugin.ipcall.a.g;

import com.tencent.mm.g.c.ce;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class i
  extends ce
{
  public static c.a dhO;
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[3];
    locala.columns = new String[4];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "countryCode";
    locala.sKA.put("countryCode", "INTEGER PRIMARY KEY ");
    localStringBuilder.append(" countryCode INTEGER PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.sKz = "countryCode";
    locala.columns[1] = "callTimeCount";
    locala.sKA.put("callTimeCount", "LONG");
    localStringBuilder.append(" callTimeCount LONG");
    localStringBuilder.append(", ");
    locala.columns[2] = "lastCallTime";
    locala.sKA.put("lastCallTime", "LONG");
    localStringBuilder.append(" lastCallTime LONG");
    locala.columns[3] = "rowid";
    locala.sql = localStringBuilder.toString();
    dhO = locala;
  }
  
  protected final c.a AX()
  {
    return dhO;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/g/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */