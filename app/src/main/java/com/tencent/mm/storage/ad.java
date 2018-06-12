package com.tencent.mm.storage;

import com.tencent.mm.g.c.ak;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class ad
  extends ak
{
  protected static c.a dhO;
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[6];
    locala.columns = new String[7];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "labelID";
    locala.sKA.put("labelID", "INTEGER PRIMARY KEY ");
    localStringBuilder.append(" labelID INTEGER PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.sKz = "labelID";
    locala.columns[1] = "labelName";
    locala.sKA.put("labelName", "TEXT");
    localStringBuilder.append(" labelName TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "labelPYFull";
    locala.sKA.put("labelPYFull", "TEXT");
    localStringBuilder.append(" labelPYFull TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "labelPYShort";
    locala.sKA.put("labelPYShort", "TEXT");
    localStringBuilder.append(" labelPYShort TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "createTime";
    locala.sKA.put("createTime", "LONG");
    localStringBuilder.append(" createTime LONG");
    localStringBuilder.append(", ");
    locala.columns[5] = "isTemporary";
    locala.sKA.put("isTemporary", "INTEGER");
    localStringBuilder.append(" isTemporary INTEGER");
    locala.columns[6] = "rowid";
    locala.sql = localStringBuilder.toString();
    dhO = locala;
  }
  
  protected final c.a AX()
  {
    return dhO;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/storage/ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */