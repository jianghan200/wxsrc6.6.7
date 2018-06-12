package com.tencent.mm.plugin.shake.d.a;

import com.tencent.mm.plugin.shake.a.a.c;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class n
  extends c
{
  protected static c.a dhO;
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[5];
    locala.columns = new String[6];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "username";
    locala.sKA.put("username", "TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(" username TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.sKz = "username";
    locala.columns[1] = "deeplink";
    locala.sKA.put("deeplink", "TEXT default '' ");
    localStringBuilder.append(" deeplink TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[2] = "title";
    locala.sKA.put("title", "TEXT default '' ");
    localStringBuilder.append(" title TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[3] = "iconurl";
    locala.sKA.put("iconurl", "TEXT default '' ");
    localStringBuilder.append(" iconurl TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[4] = "createtime";
    locala.sKA.put("createtime", "LONG default '' ");
    localStringBuilder.append(" createtime LONG default '' ");
    locala.columns[5] = "rowid";
    locala.sql = localStringBuilder.toString();
    dhO = locala;
  }
  
  protected final c.a AX()
  {
    return dhO;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/shake/d/a/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */