package com.tencent.mm.storage;

import com.tencent.mm.g.c.c;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bi;
import java.lang.reflect.Field;
import java.util.Map;

public final class a
  extends c
{
  protected static c.a dhO;
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[8];
    locala.columns = new String[9];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "abtestkey";
    locala.sKA.put("abtestkey", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" abtestkey TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.sKz = "abtestkey";
    locala.columns[1] = "value";
    locala.sKA.put("value", "TEXT");
    localStringBuilder.append(" value TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "expId";
    locala.sKA.put("expId", "TEXT");
    localStringBuilder.append(" expId TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "sequence";
    locala.sKA.put("sequence", "LONG");
    localStringBuilder.append(" sequence LONG");
    localStringBuilder.append(", ");
    locala.columns[4] = "prioritylevel";
    locala.sKA.put("prioritylevel", "INTEGER");
    localStringBuilder.append(" prioritylevel INTEGER");
    localStringBuilder.append(", ");
    locala.columns[5] = "startTime";
    locala.sKA.put("startTime", "LONG");
    localStringBuilder.append(" startTime LONG");
    localStringBuilder.append(", ");
    locala.columns[6] = "endTime";
    locala.sKA.put("endTime", "LONG");
    localStringBuilder.append(" endTime LONG");
    localStringBuilder.append(", ");
    locala.columns[7] = "noReport";
    locala.sKA.put("noReport", "INTEGER");
    localStringBuilder.append(" noReport INTEGER");
    locala.columns[8] = "rowid";
    locala.sql = localStringBuilder.toString();
    dhO = locala;
  }
  
  protected final c.a AX()
  {
    return dhO;
  }
  
  public final boolean isValid()
  {
    long l = bi.VE();
    return (l >= this.field_startTime) && (l < this.field_endTime);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/storage/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */