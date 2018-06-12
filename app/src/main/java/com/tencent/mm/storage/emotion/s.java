package com.tencent.mm.storage.emotion;

import com.tencent.mm.g.c.du;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class s
  extends du
{
  protected static c.a dhO;
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[2];
    locala.columns = new String[3];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "key";
    locala.sKA.put("key", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" key TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.sKz = "key";
    locala.columns[1] = "position";
    locala.sKA.put("position", "INTEGER");
    localStringBuilder.append(" position INTEGER");
    locala.columns[2] = "rowid";
    locala.sql = localStringBuilder.toString();
    dhO = locala;
  }
  
  public s() {}
  
  public s(int paramInt, String paramString)
  {
    this.field_position = paramInt;
    this.field_key = paramString;
  }
  
  protected final c.a AX()
  {
    return null;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("index:").append(this.field_position);
    localStringBuilder.append("key  :").append(this.field_key);
    return localStringBuilder.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/storage/emotion/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */