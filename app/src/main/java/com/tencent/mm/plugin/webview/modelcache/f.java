package com.tencent.mm.plugin.webview.modelcache;

import com.tencent.mm.g.c.ev;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.reflect.Field;
import java.util.Map;

public final class f
  extends ev
{
  protected static c.a dhO;
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[17];
    locala.columns = new String[18];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "urlMd5Hashcode";
    locala.sKA.put("urlMd5Hashcode", "INTEGER");
    localStringBuilder.append(" urlMd5Hashcode INTEGER");
    localStringBuilder.append(", ");
    locala.columns[1] = "url";
    locala.sKA.put("url", "TEXT");
    localStringBuilder.append(" url TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "appId";
    locala.sKA.put("appId", "TEXT");
    localStringBuilder.append(" appId TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "domain";
    locala.sKA.put("domain", "TEXT");
    localStringBuilder.append(" domain TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "version";
    locala.sKA.put("version", "TEXT");
    localStringBuilder.append(" version TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "localPath";
    locala.sKA.put("localPath", "TEXT");
    localStringBuilder.append(" localPath TEXT");
    localStringBuilder.append(", ");
    locala.columns[6] = "contentType";
    locala.sKA.put("contentType", "TEXT");
    localStringBuilder.append(" contentType TEXT");
    localStringBuilder.append(", ");
    locala.columns[7] = "contentLength";
    locala.sKA.put("contentLength", "LONG");
    localStringBuilder.append(" contentLength LONG");
    localStringBuilder.append(", ");
    locala.columns[8] = "isLatestVersion";
    locala.sKA.put("isLatestVersion", "INTEGER");
    localStringBuilder.append(" isLatestVersion INTEGER");
    localStringBuilder.append(", ");
    locala.columns[9] = "createTime";
    locala.sKA.put("createTime", "LONG");
    localStringBuilder.append(" createTime LONG");
    localStringBuilder.append(", ");
    locala.columns[10] = "accessTime";
    locala.sKA.put("accessTime", "LONG");
    localStringBuilder.append(" accessTime LONG");
    localStringBuilder.append(", ");
    locala.columns[11] = "expireTime";
    locala.sKA.put("expireTime", "LONG default '0' ");
    localStringBuilder.append(" expireTime LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[12] = "cacheType";
    locala.sKA.put("cacheType", "INTEGER");
    localStringBuilder.append(" cacheType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[13] = "configId";
    locala.sKA.put("configId", "TEXT");
    localStringBuilder.append(" configId TEXT");
    localStringBuilder.append(", ");
    locala.columns[14] = "protocol";
    locala.sKA.put("protocol", "INTEGER");
    localStringBuilder.append(" protocol INTEGER");
    localStringBuilder.append(", ");
    locala.columns[15] = "packageId";
    locala.sKA.put("packageId", "TEXT");
    localStringBuilder.append(" packageId TEXT");
    localStringBuilder.append(", ");
    locala.columns[16] = "contentMd5";
    locala.sKA.put("contentMd5", "TEXT");
    localStringBuilder.append(" contentMd5 TEXT");
    locala.columns[17] = "rowid";
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
      x.printErrStackTrace("MicroMsg.WebViewCacheRes", localIllegalAccessException, "", new Object[0]);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/webview/modelcache/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */