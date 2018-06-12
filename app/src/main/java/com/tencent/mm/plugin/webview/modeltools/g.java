package com.tencent.mm.plugin.webview.modeltools;

import com.tencent.mm.g.c.eu;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class g
  extends eu
{
  public static c.a dhO;
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[2];
    locala.columns = new String[3];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "host";
    locala.sKA.put("host", "TEXT");
    localStringBuilder.append(" host TEXT");
    localStringBuilder.append(", ");
    locala.columns[1] = "expireTime";
    locala.sKA.put("expireTime", "LONG");
    localStringBuilder.append(" expireTime LONG");
    locala.columns[2] = "rowid";
    locala.sql = localStringBuilder.toString();
    dhO = locala;
  }
  
  protected final c.a AX()
  {
    return dhO;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/webview/modeltools/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */