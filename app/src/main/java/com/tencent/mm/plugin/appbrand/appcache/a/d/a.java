package com.tencent.mm.plugin.appbrand.appcache.a.d;

import com.tencent.mm.g.c.db;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class a
  extends db
{
  static final c.a dzU;
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[7];
    locala.columns = new String[8];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "username";
    locala.sKA.put("username", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" username TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.sKz = "username";
    locala.columns[1] = "appId";
    locala.sKA.put("appId", "TEXT");
    localStringBuilder.append(" appId TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "startTime";
    locala.sKA.put("startTime", "LONG");
    localStringBuilder.append(" startTime LONG");
    localStringBuilder.append(", ");
    locala.columns[3] = "endTime";
    locala.sKA.put("endTime", "LONG");
    localStringBuilder.append(" endTime LONG");
    localStringBuilder.append(", ");
    locala.columns[4] = "sceneList";
    locala.sKA.put("sceneList", "TEXT");
    localStringBuilder.append(" sceneList TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "cgiList";
    locala.sKA.put("cgiList", "TEXT");
    localStringBuilder.append(" cgiList TEXT");
    localStringBuilder.append(", ");
    locala.columns[6] = "reportId";
    locala.sKA.put("reportId", "INTEGER");
    localStringBuilder.append(" reportId INTEGER");
    locala.columns[7] = "rowid";
    locala.sql = localStringBuilder.toString();
    dzU = locala;
  }
  
  protected final c.a AX()
  {
    return dzU;
  }
  
  public final String toString()
  {
    return "CmdBlockCgiPersistentInfo{field_username='" + this.field_username + '\'' + ", field_appId='" + this.field_appId + '\'' + ", field_startTime=" + this.field_startTime + ", field_endTime=" + this.field_endTime + ", field_sceneList='" + this.field_sceneList + '\'' + ", field_cgiList='" + this.field_cgiList + '\'' + ", field_reportId=" + this.field_reportId + '}';
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/a/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */