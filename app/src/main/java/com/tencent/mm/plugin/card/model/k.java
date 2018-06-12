package com.tencent.mm.plugin.card.model;

import com.tencent.mm.g.c.ag;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class k
  extends ag
{
  public static c.a dhO;
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[4];
    locala.columns = new String[5];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "code_id";
    locala.sKA.put("code_id", "TEXT");
    localStringBuilder.append(" code_id TEXT");
    localStringBuilder.append(", ");
    locala.columns[1] = "card_id";
    locala.sKA.put("card_id", "TEXT");
    localStringBuilder.append(" card_id TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "code";
    locala.sKA.put("code", "TEXT");
    localStringBuilder.append(" code TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "status";
    locala.sKA.put("status", "INTEGER");
    localStringBuilder.append(" status INTEGER");
    locala.columns[4] = "rowid";
    locala.sql = localStringBuilder.toString();
    dhO = locala;
  }
  
  protected final c.a AX()
  {
    return dhO;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/model/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */