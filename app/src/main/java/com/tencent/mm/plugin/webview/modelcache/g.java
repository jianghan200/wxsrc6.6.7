package com.tencent.mm.plugin.webview.modelcache;

import com.tencent.mm.g.c.er;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.reflect.Field;
import java.util.Map;

final class g
  extends er
{
  protected static c.a dhO;
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[6];
    locala.columns = new String[7];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "disable";
    locala.sKA.put("disable", "INTEGER default 'false' ");
    localStringBuilder.append(" disable INTEGER default 'false' ");
    localStringBuilder.append(", ");
    locala.columns[1] = "configId";
    locala.sKA.put("configId", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" configId TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.sKz = "configId";
    locala.columns[2] = "configUrl";
    locala.sKA.put("configUrl", "TEXT");
    localStringBuilder.append(" configUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "configResources";
    locala.sKA.put("configResources", "TEXT");
    localStringBuilder.append(" configResources TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "configCrc32";
    locala.sKA.put("configCrc32", "LONG");
    localStringBuilder.append(" configCrc32 LONG");
    localStringBuilder.append(", ");
    locala.columns[5] = "isFromXml";
    locala.sKA.put("isFromXml", "INTEGER default 'false' ");
    localStringBuilder.append(" isFromXml INTEGER default 'false' ");
    locala.columns[6] = "rowid";
    locala.sql = localStringBuilder.toString();
    dhO = locala;
  }
  
  protected final c.a AX()
  {
    return dhO;
  }
  
  public final String toString()
  {
    localStringBuilder = new StringBuilder(getClass().getSimpleName() + " {");
    try
    {
      Field[] arrayOfField = getClass().getSuperclass().getDeclaredFields();
      int j = arrayOfField.length;
      int i = 0;
      while (i < j)
      {
        Field localField = arrayOfField[i];
        if (localField.getName().startsWith("field_"))
        {
          localField.setAccessible(true);
          Object localObject = localField.get(this);
          localStringBuilder.append(localField.getName().replaceFirst("field_", "")).append(" = ").append(localObject).append(", ");
        }
        i += 1;
      }
      return " }";
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      x.printErrStackTrace("MicroMsg.WebViewCacheResConfigMap", localIllegalAccessException, "", new Object[0]);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/webview/modelcache/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */