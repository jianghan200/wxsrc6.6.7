package com.tencent.mm.pluginsdk.model.app;

import com.tencent.mm.g.c.h;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class b
  extends h
{
  protected static c.a dhO;
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[20];
    locala.columns = new String[21];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "appId";
    locala.sKA.put("appId", "TEXT");
    localStringBuilder.append(" appId TEXT");
    localStringBuilder.append(", ");
    locala.columns[1] = "sdkVer";
    locala.sKA.put("sdkVer", "LONG");
    localStringBuilder.append(" sdkVer LONG");
    localStringBuilder.append(", ");
    locala.columns[2] = "mediaSvrId";
    locala.sKA.put("mediaSvrId", "TEXT");
    localStringBuilder.append(" mediaSvrId TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "mediaId";
    locala.sKA.put("mediaId", "TEXT");
    localStringBuilder.append(" mediaId TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "clientAppDataId";
    locala.sKA.put("clientAppDataId", "TEXT");
    localStringBuilder.append(" clientAppDataId TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "type";
    locala.sKA.put("type", "LONG");
    localStringBuilder.append(" type LONG");
    localStringBuilder.append(", ");
    locala.columns[6] = "totalLen";
    locala.sKA.put("totalLen", "LONG");
    localStringBuilder.append(" totalLen LONG");
    localStringBuilder.append(", ");
    locala.columns[7] = "offset";
    locala.sKA.put("offset", "LONG");
    localStringBuilder.append(" offset LONG");
    localStringBuilder.append(", ");
    locala.columns[8] = "status";
    locala.sKA.put("status", "LONG");
    localStringBuilder.append(" status LONG");
    localStringBuilder.append(", ");
    locala.columns[9] = "isUpload";
    locala.sKA.put("isUpload", "INTEGER");
    localStringBuilder.append(" isUpload INTEGER");
    localStringBuilder.append(", ");
    locala.columns[10] = "createTime";
    locala.sKA.put("createTime", "LONG");
    localStringBuilder.append(" createTime LONG");
    localStringBuilder.append(", ");
    locala.columns[11] = "lastModifyTime";
    locala.sKA.put("lastModifyTime", "LONG");
    localStringBuilder.append(" lastModifyTime LONG");
    localStringBuilder.append(", ");
    locala.columns[12] = "fileFullPath";
    locala.sKA.put("fileFullPath", "TEXT");
    localStringBuilder.append(" fileFullPath TEXT");
    localStringBuilder.append(", ");
    locala.columns[13] = "fullXml";
    locala.sKA.put("fullXml", "TEXT");
    localStringBuilder.append(" fullXml TEXT");
    localStringBuilder.append(", ");
    locala.columns[14] = "msgInfoId";
    locala.sKA.put("msgInfoId", "LONG");
    localStringBuilder.append(" msgInfoId LONG");
    localStringBuilder.append(", ");
    locala.columns[15] = "netTimes";
    locala.sKA.put("netTimes", "LONG");
    localStringBuilder.append(" netTimes LONG");
    localStringBuilder.append(", ");
    locala.columns[16] = "isUseCdn";
    locala.sKA.put("isUseCdn", "INTEGER");
    localStringBuilder.append(" isUseCdn INTEGER");
    localStringBuilder.append(", ");
    locala.columns[17] = "signature";
    locala.sKA.put("signature", "TEXT");
    localStringBuilder.append(" signature TEXT");
    localStringBuilder.append(", ");
    locala.columns[18] = "fakeAeskey";
    locala.sKA.put("fakeAeskey", "TEXT");
    localStringBuilder.append(" fakeAeskey TEXT");
    localStringBuilder.append(", ");
    locala.columns[19] = "fakeSignature";
    locala.sKA.put("fakeSignature", "TEXT");
    localStringBuilder.append(" fakeSignature TEXT");
    locala.columns[20] = "rowid";
    locala.sql = localStringBuilder.toString();
    dhO = locala;
  }
  
  public b()
  {
    this.field_netTimes = 0L;
  }
  
  protected final c.a AX()
  {
    return dhO;
  }
  
  public final boolean aSc()
  {
    if (this.field_totalLen <= 0L) {}
    while (this.field_offset != this.field_totalLen) {
      return false;
    }
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/pluginsdk/model/app/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */