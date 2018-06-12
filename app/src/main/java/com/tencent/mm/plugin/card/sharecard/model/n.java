package com.tencent.mm.plugin.card.sharecard.model;

import com.tencent.mm.g.c.dr;
import com.tencent.mm.protocal.c.bmw;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class n
  extends dr
{
  protected static c.a dhO;
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[5];
    locala.columns = new String[6];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "card_id";
    locala.sKA.put("card_id", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" card_id TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.sKz = "card_id";
    locala.columns[1] = "state_flag";
    locala.sKA.put("state_flag", "INTEGER");
    localStringBuilder.append(" state_flag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[2] = "update_time";
    locala.sKA.put("update_time", "LONG");
    localStringBuilder.append(" update_time LONG");
    localStringBuilder.append(", ");
    locala.columns[3] = "seq";
    locala.sKA.put("seq", "LONG");
    localStringBuilder.append(" seq LONG");
    localStringBuilder.append(", ");
    locala.columns[4] = "retryCount";
    locala.sKA.put("retryCount", "INTEGER");
    localStringBuilder.append(" retryCount INTEGER");
    locala.columns[5] = "rowid";
    locala.sql = localStringBuilder.toString();
    dhO = locala;
  }
  
  public static n b(bmw parambmw)
  {
    n localn = new n();
    localn.field_card_id = parambmw.cac;
    localn.field_update_time = parambmw.rqg;
    localn.field_state_flag = parambmw.hyk;
    localn.field_seq = parambmw.slb;
    localn.field_retryCount = 10;
    return localn;
  }
  
  protected final c.a AX()
  {
    return dhO;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof n)) {}
    do
    {
      return false;
      paramObject = (n)paramObject;
    } while (this.field_card_id != ((n)paramObject).field_card_id);
    return true;
  }
  
  public final int hashCode()
  {
    if (this.field_card_id == null) {
      return 0;
    }
    return this.field_card_id.hashCode();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/card/sharecard/model/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */