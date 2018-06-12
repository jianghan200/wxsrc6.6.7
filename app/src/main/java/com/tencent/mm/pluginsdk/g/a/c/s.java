package com.tencent.mm.pluginsdk.g.a.c;

import com.tencent.mm.g.c.dk;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.reflect.Field;
import java.util.Map;

public final class s
  extends dk
{
  public static final c.a dhO;
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[34];
    locala.columns = new String[35];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "urlKey_hashcode";
    locala.sKA.put("urlKey_hashcode", "INTEGER PRIMARY KEY ");
    localStringBuilder.append(" urlKey_hashcode INTEGER PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.sKz = "urlKey_hashcode";
    locala.columns[1] = "urlKey";
    locala.sKA.put("urlKey", "TEXT");
    localStringBuilder.append(" urlKey TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "url";
    locala.sKA.put("url", "TEXT");
    localStringBuilder.append(" url TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "fileVersion";
    locala.sKA.put("fileVersion", "TEXT");
    localStringBuilder.append(" fileVersion TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "networkType";
    locala.sKA.put("networkType", "INTEGER default '2' ");
    localStringBuilder.append(" networkType INTEGER default '2' ");
    localStringBuilder.append(", ");
    locala.columns[5] = "maxRetryTimes";
    locala.sKA.put("maxRetryTimes", "INTEGER default '3' ");
    localStringBuilder.append(" maxRetryTimes INTEGER default '3' ");
    localStringBuilder.append(", ");
    locala.columns[6] = "retryTimes";
    locala.sKA.put("retryTimes", "INTEGER default '3' ");
    localStringBuilder.append(" retryTimes INTEGER default '3' ");
    localStringBuilder.append(", ");
    locala.columns[7] = "filePath";
    locala.sKA.put("filePath", "TEXT");
    localStringBuilder.append(" filePath TEXT");
    localStringBuilder.append(", ");
    locala.columns[8] = "status";
    locala.sKA.put("status", "INTEGER default '0' ");
    localStringBuilder.append(" status INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[9] = "contentLength";
    locala.sKA.put("contentLength", "LONG default '0' ");
    localStringBuilder.append(" contentLength LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[10] = "contentType";
    locala.sKA.put("contentType", "TEXT");
    localStringBuilder.append(" contentType TEXT");
    localStringBuilder.append(", ");
    locala.columns[11] = "expireTime";
    locala.sKA.put("expireTime", "LONG default '0' ");
    localStringBuilder.append(" expireTime LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[12] = "md5";
    locala.sKA.put("md5", "TEXT");
    localStringBuilder.append(" md5 TEXT");
    localStringBuilder.append(", ");
    locala.columns[13] = "groupId1";
    locala.sKA.put("groupId1", "TEXT");
    localStringBuilder.append(" groupId1 TEXT");
    localStringBuilder.append(", ");
    locala.columns[14] = "groupId2";
    locala.sKA.put("groupId2", "TEXT");
    localStringBuilder.append(" groupId2 TEXT");
    localStringBuilder.append(", ");
    locala.columns[15] = "priority";
    locala.sKA.put("priority", "INTEGER default '0' ");
    localStringBuilder.append(" priority INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[16] = "fileUpdated";
    locala.sKA.put("fileUpdated", "INTEGER");
    localStringBuilder.append(" fileUpdated INTEGER");
    localStringBuilder.append(", ");
    locala.columns[17] = "deleted";
    locala.sKA.put("deleted", "INTEGER default 'false' ");
    localStringBuilder.append(" deleted INTEGER default 'false' ");
    localStringBuilder.append(", ");
    locala.columns[18] = "resType";
    locala.sKA.put("resType", "INTEGER");
    localStringBuilder.append(" resType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[19] = "subType";
    locala.sKA.put("subType", "INTEGER");
    localStringBuilder.append(" subType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[20] = "reportId";
    locala.sKA.put("reportId", "LONG");
    localStringBuilder.append(" reportId LONG");
    localStringBuilder.append(", ");
    locala.columns[21] = "sampleId";
    locala.sKA.put("sampleId", "TEXT");
    localStringBuilder.append(" sampleId TEXT");
    localStringBuilder.append(", ");
    locala.columns[22] = "eccSignature";
    locala.sKA.put("eccSignature", "BLOB");
    localStringBuilder.append(" eccSignature BLOB");
    localStringBuilder.append(", ");
    locala.columns[23] = "originalMd5";
    locala.sKA.put("originalMd5", "TEXT");
    localStringBuilder.append(" originalMd5 TEXT");
    localStringBuilder.append(", ");
    locala.columns[24] = "fileCompress";
    locala.sKA.put("fileCompress", "INTEGER default 'false' ");
    localStringBuilder.append(" fileCompress INTEGER default 'false' ");
    localStringBuilder.append(", ");
    locala.columns[25] = "fileEncrypt";
    locala.sKA.put("fileEncrypt", "INTEGER default 'false' ");
    localStringBuilder.append(" fileEncrypt INTEGER default 'false' ");
    localStringBuilder.append(", ");
    locala.columns[26] = "encryptKey";
    locala.sKA.put("encryptKey", "TEXT");
    localStringBuilder.append(" encryptKey TEXT");
    localStringBuilder.append(", ");
    locala.columns[27] = "keyVersion";
    locala.sKA.put("keyVersion", "INTEGER default '0' ");
    localStringBuilder.append(" keyVersion INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[28] = "EID";
    locala.sKA.put("EID", "INTEGER");
    localStringBuilder.append(" EID INTEGER");
    localStringBuilder.append(", ");
    locala.columns[29] = "fileSize";
    locala.sKA.put("fileSize", "LONG");
    localStringBuilder.append(" fileSize LONG");
    localStringBuilder.append(", ");
    locala.columns[30] = "needRetry";
    locala.sKA.put("needRetry", "INTEGER default '1' ");
    localStringBuilder.append(" needRetry INTEGER default '1' ");
    localStringBuilder.append(", ");
    locala.columns[31] = "appId";
    locala.sKA.put("appId", "TEXT");
    localStringBuilder.append(" appId TEXT");
    localStringBuilder.append(", ");
    locala.columns[32] = "wvCacheType";
    locala.sKA.put("wvCacheType", "INTEGER");
    localStringBuilder.append(" wvCacheType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[33] = "packageId";
    locala.sKA.put("packageId", "TEXT");
    localStringBuilder.append(" packageId TEXT");
    locala.columns[34] = "rowid";
    locala.sql = localStringBuilder.toString();
    dhO = locala;
  }
  
  protected final c.a AX()
  {
    return dhO;
  }
  
  public final String toString()
  {
    localStringBuilder = new StringBuilder("ResDownloaderRecord {");
    try
    {
      Field[] arrayOfField = getClass().getSuperclass().getDeclaredFields();
      int j = arrayOfField.length;
      int i = 0;
      while (i < j)
      {
        Field localField2 = arrayOfField[i];
        if (localField2.getName().startsWith("field_"))
        {
          localField2.setAccessible(true);
          Object localObject = localField2.get(this);
          localStringBuilder.append(localField2.getName().replaceFirst("field_", "")).append(" = ").append(localObject).append(", ");
        }
        i += 1;
      }
      try
      {
        Field localField1 = getClass().getSuperclass().getSuperclass().getField("systemRowid");
        localField1.setAccessible(true);
        localStringBuilder.append("systemRowid = ").append(localField1.get(this));
        return " }";
      }
      catch (IllegalAccessException localIllegalAccessException2)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.ResDownloaderRecord", localIllegalAccessException2, "", new Object[0]);
        }
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.ResDownloaderRecord", localNoSuchFieldException, "", new Object[0]);
        }
      }
    }
    catch (IllegalAccessException localIllegalAccessException1)
    {
      x.printErrStackTrace("MicroMsg.ResDownloaderRecord", localIllegalAccessException1, "", new Object[0]);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/pluginsdk/g/a/c/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */