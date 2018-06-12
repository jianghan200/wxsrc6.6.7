package com.tencent.mm.plugin.shake.b;

import com.tencent.mm.plugin.shake.a.a.b;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class j
  extends b
{
  protected static c.a dhO;
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[3];
    locala.columns = new String[4];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "username";
    locala.sKA.put("username", "TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(" username TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.sKz = "username";
    locala.columns[1] = "lastshaketime";
    locala.sKA.put("lastshaketime", "INTEGER default '0' ");
    localStringBuilder.append(" lastshaketime INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[2] = "isshowed";
    locala.sKA.put("isshowed", "INTEGER default 'false' ");
    localStringBuilder.append(" isshowed INTEGER default 'false' ");
    locala.columns[3] = "rowid";
    locala.sql = localStringBuilder.toString();
    dhO = locala;
  }
  
  protected final c.a AX()
  {
    return dhO;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/shake/b/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */