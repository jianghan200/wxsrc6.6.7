package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.mm.g.c.o;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class al
  extends o
{
  static final c.a dzU;
  public static final String[] fhI;
  
  static
  {
    int i = 0;
    fhI = new String[] { "appId", "version", "debugType" };
    Object localObject1 = new c.a();
    ((c.a)localObject1).sKy = new Field[10];
    ((c.a)localObject1).columns = new String[11];
    Object localObject2 = new StringBuilder();
    ((c.a)localObject1).columns[0] = "appId";
    ((c.a)localObject1).sKA.put("appId", "TEXT");
    ((StringBuilder)localObject2).append(" appId TEXT");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[1] = "version";
    ((c.a)localObject1).sKA.put("version", "INTEGER");
    ((StringBuilder)localObject2).append(" version INTEGER");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[2] = "versionMd5";
    ((c.a)localObject1).sKA.put("versionMd5", "TEXT");
    ((StringBuilder)localObject2).append(" versionMd5 TEXT");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[3] = "versionState";
    ((c.a)localObject1).sKA.put("versionState", "INTEGER");
    ((StringBuilder)localObject2).append(" versionState INTEGER");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[4] = "pkgPath";
    ((c.a)localObject1).sKA.put("pkgPath", "TEXT");
    ((StringBuilder)localObject2).append(" pkgPath TEXT");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[5] = "createTime";
    ((c.a)localObject1).sKA.put("createTime", "LONG");
    ((StringBuilder)localObject2).append(" createTime LONG");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[6] = "debugType";
    ((c.a)localObject1).sKA.put("debugType", "INTEGER default '0' ");
    ((StringBuilder)localObject2).append(" debugType INTEGER default '0' ");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[7] = "downloadURL";
    ((c.a)localObject1).sKA.put("downloadURL", "TEXT");
    ((StringBuilder)localObject2).append(" downloadURL TEXT");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[8] = "startTime";
    ((c.a)localObject1).sKA.put("startTime", "LONG");
    ((StringBuilder)localObject2).append(" startTime LONG");
    ((StringBuilder)localObject2).append(", ");
    ((c.a)localObject1).columns[9] = "endTime";
    ((c.a)localObject1).sKA.put("endTime", "LONG");
    ((StringBuilder)localObject2).append(" endTime LONG");
    ((c.a)localObject1).columns[10] = "rowid";
    ((c.a)localObject1).sql = ((StringBuilder)localObject2).toString();
    dzU = (c.a)localObject1;
    localObject1 = " PRIMARY KEY (";
    localObject2 = fhI;
    int j = localObject2.length;
    while (i < j)
    {
      localObject3 = localObject2[i];
      localObject1 = (String)localObject1 + ", " + (String)localObject3;
      i += 1;
    }
    localObject1 = ((String)localObject1).replaceFirst(",", "");
    localObject1 = (String)localObject1 + " )";
    localObject2 = new StringBuilder();
    Object localObject3 = dzU;
    ((c.a)localObject3).sql = (((c.a)localObject3).sql + "," + (String)localObject1);
  }
  
  protected final c.a AX()
  {
    return dzU;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */