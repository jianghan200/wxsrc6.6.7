package com.tencent.mm.plugin.card.model;

import com.tencent.mm.g.c.cx;
import com.tencent.mm.protocal.c.lh;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class ak
  extends cx
{
  protected static c.a dhO;
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[2];
    locala.columns = new String[3];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "cardUserId";
    locala.sKA.put("cardUserId", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" cardUserId TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.sKz = "cardUserId";
    locala.columns[1] = "retryCount";
    locala.sKA.put("retryCount", "INTEGER");
    localStringBuilder.append(" retryCount INTEGER");
    locala.columns[2] = "rowid";
    locala.sql = localStringBuilder.toString();
    dhO = locala;
  }
  
  public static ak a(lh paramlh)
  {
    ak localak = new ak();
    localak.field_cardUserId = paramlh.ros;
    return localak;
  }
  
  protected final c.a AX()
  {
    return dhO;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof ak)) {}
    do
    {
      return false;
      paramObject = (ak)paramObject;
    } while (this.field_cardUserId != ((ak)paramObject).field_cardUserId);
    return true;
  }
  
  public final int hashCode()
  {
    if (this.field_cardUserId == null) {
      return 0;
    }
    return this.field_cardUserId.hashCode();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/card/model/ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */