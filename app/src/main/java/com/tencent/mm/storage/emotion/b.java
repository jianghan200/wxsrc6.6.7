package com.tencent.mm.storage.emotion;

import com.tencent.mm.g.c.at;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class b
  extends at
{
  protected static c.a dhO;
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[7];
    locala.columns = new String[8];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "md5_lang";
    locala.sKA.put("md5_lang", "TEXT PRIMARY KEY  COLLATE NOCASE ");
    localStringBuilder.append(" md5_lang TEXT PRIMARY KEY  COLLATE NOCASE ");
    localStringBuilder.append(", ");
    locala.sKz = "md5_lang";
    locala.columns[1] = "md5";
    locala.sKA.put("md5", "TEXT COLLATE NOCASE ");
    localStringBuilder.append(" md5 TEXT COLLATE NOCASE ");
    localStringBuilder.append(", ");
    locala.columns[2] = "lang";
    locala.sKA.put("lang", "TEXT COLLATE NOCASE ");
    localStringBuilder.append(" lang TEXT COLLATE NOCASE ");
    localStringBuilder.append(", ");
    locala.columns[3] = "desc";
    locala.sKA.put("desc", "TEXT");
    localStringBuilder.append(" desc TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "groupId";
    locala.sKA.put("groupId", "TEXT default '' ");
    localStringBuilder.append(" groupId TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[5] = "click_flag";
    locala.sKA.put("click_flag", "INTEGER");
    localStringBuilder.append(" click_flag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[6] = "download_flag";
    locala.sKA.put("download_flag", "INTEGER");
    localStringBuilder.append(" download_flag INTEGER");
    locala.columns[7] = "rowid";
    locala.sql = localStringBuilder.toString();
    dhO = locala;
  }
  
  protected final c.a AX()
  {
    return null;
  }
  
  public final String Xh()
  {
    if (this.field_md5 == null) {
      return "";
    }
    return this.field_md5;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/storage/emotion/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */