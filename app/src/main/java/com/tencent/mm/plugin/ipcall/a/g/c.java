package com.tencent.mm.plugin.ipcall.a.g;

import com.tencent.mm.g.c.cc;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;

public final class c
  extends cc
{
  public static c.a dhO;
  public ArrayList<String> ksy;
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[4];
    locala.columns = new String[5];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "wechatUsername";
    locala.sKA.put("wechatUsername", "TEXT");
    localStringBuilder.append(" wechatUsername TEXT");
    localStringBuilder.append(", ");
    locala.columns[1] = "systemAddressBookUsername";
    locala.sKA.put("systemAddressBookUsername", "TEXT");
    localStringBuilder.append(" systemAddressBookUsername TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "contactId";
    locala.sKA.put("contactId", "TEXT");
    localStringBuilder.append(" contactId TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "sortKey";
    locala.sKA.put("sortKey", "TEXT");
    localStringBuilder.append(" sortKey TEXT");
    locala.columns[4] = "rowid";
    locala.sql = localStringBuilder.toString();
    dhO = locala;
  }
  
  public static boolean dq(String paramString1, String paramString2)
  {
    if ((paramString1 == null) && (paramString2 != null)) {}
    while ((paramString1 != null) && (!paramString1.equals(paramString2))) {
      return false;
    }
    return true;
  }
  
  protected final c.a AX()
  {
    return dhO;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/g/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */