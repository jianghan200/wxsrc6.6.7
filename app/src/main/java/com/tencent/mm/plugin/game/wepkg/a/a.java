package com.tencent.mm.plugin.game.wepkg.a;

import com.tencent.mm.g.c.ex;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class a
  extends ex
{
  public static final c.a dzU;
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[14];
    locala.columns = new String[15];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "key";
    locala.sKA.put("key", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" key TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.sKz = "key";
    locala.columns[1] = "pkgId";
    locala.sKA.put("pkgId", "TEXT");
    localStringBuilder.append(" pkgId TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "version";
    locala.sKA.put("version", "TEXT");
    localStringBuilder.append(" version TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "filePath";
    locala.sKA.put("filePath", "TEXT");
    localStringBuilder.append(" filePath TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "rid";
    locala.sKA.put("rid", "TEXT");
    localStringBuilder.append(" rid TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "mimeType";
    locala.sKA.put("mimeType", "TEXT");
    localStringBuilder.append(" mimeType TEXT");
    localStringBuilder.append(", ");
    locala.columns[6] = "md5";
    locala.sKA.put("md5", "TEXT");
    localStringBuilder.append(" md5 TEXT");
    localStringBuilder.append(", ");
    locala.columns[7] = "downloadUrl";
    locala.sKA.put("downloadUrl", "TEXT");
    localStringBuilder.append(" downloadUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[8] = "size";
    locala.sKA.put("size", "INTEGER");
    localStringBuilder.append(" size INTEGER");
    localStringBuilder.append(", ");
    locala.columns[9] = "downloadNetType";
    locala.sKA.put("downloadNetType", "INTEGER");
    localStringBuilder.append(" downloadNetType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[10] = "completeDownload";
    locala.sKA.put("completeDownload", "INTEGER default 'false' ");
    localStringBuilder.append(" completeDownload INTEGER default 'false' ");
    localStringBuilder.append(", ");
    locala.columns[11] = "createTime";
    locala.sKA.put("createTime", "LONG");
    localStringBuilder.append(" createTime LONG");
    localStringBuilder.append(", ");
    locala.columns[12] = "autoDownloadCount";
    locala.sKA.put("autoDownloadCount", "INTEGER default '0' ");
    localStringBuilder.append(" autoDownloadCount INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[13] = "fileDownloadCount";
    locala.sKA.put("fileDownloadCount", "INTEGER default '0' ");
    localStringBuilder.append(" fileDownloadCount INTEGER default '0' ");
    locala.columns[14] = "rowid";
    locala.sql = localStringBuilder.toString();
    dzU = locala;
  }
  
  protected final c.a AX()
  {
    return dzU;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/wepkg/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */