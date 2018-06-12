package com.tencent.mm.plugin.scanner.history.a;

import com.tencent.mm.g.c.dn;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class a
  extends dn
{
  protected static c.a dhO;
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[6];
    locala.columns = new String[7];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "productId";
    locala.sKA.put("productId", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" productId TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.sKz = "productId";
    locala.columns[1] = "xmlContent";
    locala.sKA.put("xmlContent", "TEXT");
    localStringBuilder.append(" xmlContent TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "ScanTime";
    locala.sKA.put("ScanTime", "LONG");
    localStringBuilder.append(" ScanTime LONG");
    localStringBuilder.append(", ");
    locala.columns[3] = "funcType";
    locala.sKA.put("funcType", "INTEGER");
    localStringBuilder.append(" funcType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "qrcodeUrl";
    locala.sKA.put("qrcodeUrl", "TEXT");
    localStringBuilder.append(" qrcodeUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "scene";
    locala.sKA.put("scene", "INTEGER");
    localStringBuilder.append(" scene INTEGER");
    locala.columns[6] = "rowid";
    locala.sql = localStringBuilder.toString();
    dhO = locala;
  }
  
  protected final c.a AX()
  {
    return dhO;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/scanner/history/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */