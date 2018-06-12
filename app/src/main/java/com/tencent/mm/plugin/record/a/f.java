package com.tencent.mm.plugin.record.a;

import com.tencent.mm.g.c.dh;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class f
  extends dh
  implements b
{
  public static c.a dhO;
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[18];
    locala.columns = new String[19];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "localId";
    locala.sKA.put("localId", "INTEGER PRIMARY KEY ");
    localStringBuilder.append(" localId INTEGER PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.sKz = "localId";
    locala.columns[1] = "recordLocalId";
    locala.sKA.put("recordLocalId", "INTEGER");
    localStringBuilder.append(" recordLocalId INTEGER");
    localStringBuilder.append(", ");
    locala.columns[2] = "toUser";
    locala.sKA.put("toUser", "TEXT default '' ");
    localStringBuilder.append(" toUser TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[3] = "dataId";
    locala.sKA.put("dataId", "TEXT");
    localStringBuilder.append(" dataId TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "mediaId";
    locala.sKA.put("mediaId", "TEXT");
    localStringBuilder.append(" mediaId TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "path";
    locala.sKA.put("path", "TEXT");
    localStringBuilder.append(" path TEXT");
    localStringBuilder.append(", ");
    locala.columns[6] = "cdnUrl";
    locala.sKA.put("cdnUrl", "TEXT");
    localStringBuilder.append(" cdnUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[7] = "cdnKey";
    locala.sKA.put("cdnKey", "TEXT");
    localStringBuilder.append(" cdnKey TEXT");
    localStringBuilder.append(", ");
    locala.columns[8] = "totalLen";
    locala.sKA.put("totalLen", "INTEGER default '0' ");
    localStringBuilder.append(" totalLen INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[9] = "isThumb";
    locala.sKA.put("isThumb", "INTEGER default 'false' ");
    localStringBuilder.append(" isThumb INTEGER default 'false' ");
    localStringBuilder.append(", ");
    locala.columns[10] = "offset";
    locala.sKA.put("offset", "INTEGER default '0' ");
    localStringBuilder.append(" offset INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[11] = "type";
    locala.sKA.put("type", "INTEGER default '0' ");
    localStringBuilder.append(" type INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[12] = "fileType";
    locala.sKA.put("fileType", "INTEGER default '5' ");
    localStringBuilder.append(" fileType INTEGER default '5' ");
    localStringBuilder.append(", ");
    locala.columns[13] = "status";
    locala.sKA.put("status", "INTEGER default '0' ");
    localStringBuilder.append(" status INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[14] = "errCode";
    locala.sKA.put("errCode", "INTEGER default '0' ");
    localStringBuilder.append(" errCode INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[15] = "tpaeskey";
    locala.sKA.put("tpaeskey", "TEXT");
    localStringBuilder.append(" tpaeskey TEXT");
    localStringBuilder.append(", ");
    locala.columns[16] = "tpauthkey";
    locala.sKA.put("tpauthkey", "TEXT");
    localStringBuilder.append(" tpauthkey TEXT");
    localStringBuilder.append(", ");
    locala.columns[17] = "tpdataurl";
    locala.sKA.put("tpdataurl", "TEXT");
    localStringBuilder.append(" tpdataurl TEXT");
    locala.columns[18] = "rowid";
    locala.sql = localStringBuilder.toString();
    dhO = locala;
  }
  
  protected final c.a AX()
  {
    return dhO;
  }
  
  public final int bqo()
  {
    return this.field_localId;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("localid[").append(this.field_localId).append("]\n");
    localStringBuilder.append("recordId[").append(this.field_recordLocalId).append("]\n");
    localStringBuilder.append("mediaId[").append(this.field_mediaId).append("]\n");
    localStringBuilder.append("dataId[").append(this.field_dataId).append("]\n");
    localStringBuilder.append("path[").append(this.field_path).append("]\n");
    localStringBuilder.append("cdnurl[").append(this.field_cdnUrl).append("]\n");
    localStringBuilder.append("cdnkey[").append(this.field_cdnKey).append("]\n");
    localStringBuilder.append("type[").append(this.field_type).append("]\n");
    localStringBuilder.append("errCode[").append(this.field_errCode).append("]\n");
    localStringBuilder.append("fileType[").append(this.field_fileType).append("]\n");
    localStringBuilder.append("isThumb[").append(this.field_isThumb).append("]\n");
    localStringBuilder.append("status[").append(this.field_status).append("]\n");
    localStringBuilder.append("totalLen[").append(this.field_totalLen).append("]\n");
    localStringBuilder.append("offset[").append(this.field_offset).append("]\n");
    localStringBuilder.append("toUser[").append(this.field_toUser).append("]\n");
    return localStringBuilder.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/record/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */