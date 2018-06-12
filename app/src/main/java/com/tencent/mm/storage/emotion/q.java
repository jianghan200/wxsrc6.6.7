package com.tencent.mm.storage.emotion;

import com.tencent.mm.g.c.dt;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class q
  extends dt
{
  protected static c.a dhO;
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[10];
    locala.columns = new String[11];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "key";
    locala.sKA.put("key", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" key TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.sKz = "key";
    locala.columns[1] = "cnValue";
    locala.sKA.put("cnValue", "TEXT");
    localStringBuilder.append(" cnValue TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "qqValue";
    locala.sKA.put("qqValue", "TEXT");
    localStringBuilder.append(" qqValue TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "twValue";
    locala.sKA.put("twValue", "TEXT");
    localStringBuilder.append(" twValue TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "enValue";
    locala.sKA.put("enValue", "TEXT");
    localStringBuilder.append(" enValue TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "thValue";
    locala.sKA.put("thValue", "TEXT");
    localStringBuilder.append(" thValue TEXT");
    localStringBuilder.append(", ");
    locala.columns[6] = "fileName";
    locala.sKA.put("fileName", "TEXT");
    localStringBuilder.append(" fileName TEXT");
    localStringBuilder.append(", ");
    locala.columns[7] = "eggIndex";
    locala.sKA.put("eggIndex", "INTEGER default '-1' ");
    localStringBuilder.append(" eggIndex INTEGER default '-1' ");
    localStringBuilder.append(", ");
    locala.columns[8] = "position";
    locala.sKA.put("position", "INTEGER default '-1' ");
    localStringBuilder.append(" position INTEGER default '-1' ");
    localStringBuilder.append(", ");
    locala.columns[9] = "flag";
    locala.sKA.put("flag", "INTEGER");
    localStringBuilder.append(" flag INTEGER");
    locala.columns[10] = "rowid";
    locala.sql = localStringBuilder.toString();
    dhO = locala;
  }
  
  public q() {}
  
  public q(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt)
  {
    this.field_key = paramString1;
    this.field_cnValue = paramString3;
    this.field_qqValue = paramString2;
    this.field_enValue = paramString5;
    this.field_thValue = paramString6;
    this.field_twValue = paramString4;
    this.field_position = paramInt;
  }
  
  protected final c.a AX()
  {
    return null;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("key:").append(this.field_key).append("/n");
    localStringBuilder.append("cn:").append(this.field_cnValue).append("/n");
    localStringBuilder.append("qq:").append(this.field_qqValue).append("/n");
    localStringBuilder.append("en:").append(this.field_enValue).append("/n");
    localStringBuilder.append("th:").append(this.field_thValue).append("/n");
    localStringBuilder.append("tw:").append(this.field_twValue).append("/n");
    localStringBuilder.append("position:").append(this.field_position).append("/n");
    localStringBuilder.append("file Name:").append(this.field_fileName).append("/n");
    localStringBuilder.append("egg index:").append(this.field_eggIndex).append("/n");
    return localStringBuilder.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/storage/emotion/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */