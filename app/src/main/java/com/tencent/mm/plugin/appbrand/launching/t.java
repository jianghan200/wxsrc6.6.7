package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.mm.g.c.cj;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle;
import com.tencent.mm.plugin.appbrand.q.i;
import com.tencent.mm.protocal.c.aql;
import com.tencent.mm.protocal.c.ay;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class t
  extends cj
{
  static final c.a fgt;
  public transient boolean ggm;
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[6];
    locala.columns = new String[7];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "appIdHash";
    locala.sKA.put("appIdHash", "INTEGER PRIMARY KEY ");
    localStringBuilder.append(" appIdHash INTEGER PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.sKz = "appIdHash";
    locala.columns[1] = "appId";
    locala.sKA.put("appId", "TEXT");
    localStringBuilder.append(" appId TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "launchAction";
    locala.sKA.put("launchAction", "BLOB");
    localStringBuilder.append(" launchAction BLOB");
    localStringBuilder.append(", ");
    locala.columns[3] = "jsapiInfo";
    locala.sKA.put("jsapiInfo", "BLOB");
    localStringBuilder.append(" jsapiInfo BLOB");
    localStringBuilder.append(", ");
    locala.columns[4] = "hostInfo";
    locala.sKA.put("hostInfo", "BLOB");
    localStringBuilder.append(" hostInfo BLOB");
    localStringBuilder.append(", ");
    locala.columns[5] = "actionsheetInfo";
    locala.sKA.put("actionsheetInfo", "BLOB");
    localStringBuilder.append(" actionsheetInfo BLOB");
    locala.columns[6] = "rowid";
    locala.sql = localStringBuilder.toString();
    fgt = locala;
  }
  
  protected final c.a AX()
  {
    return fgt;
  }
  
  public final void a(aql paramaql)
  {
    this.field_launchAction = paramaql.rSU;
    this.field_jsapiInfo = paramaql.rSV;
    this.field_hostInfo = paramaql.rSW;
    this.field_actionsheetInfo = paramaql.rSY;
  }
  
  public final void c(AppBrandSysConfig paramAppBrandSysConfig)
  {
    if ((this.field_actionsheetInfo != null) && (this.field_actionsheetInfo.rbe)) {}
    for (boolean bool = true;; bool = false)
    {
      paramAppBrandSysConfig.frc = bool;
      paramAppBrandSysConfig.fqP = new AppRuntimeApiPermissionBundle(this.field_jsapiInfo);
      paramAppBrandSysConfig.fqQ = this.ggm;
      return;
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if ((paramObject instanceof t))
    {
      paramObject = (t)paramObject;
      bool1 = bool2;
      if (this.field_appId.equals(((t)paramObject).field_appId))
      {
        bool1 = bool2;
        if (this.field_launchAction != null)
        {
          bool1 = bool2;
          if (i.a(this.field_launchAction, ((t)paramObject).field_launchAction))
          {
            bool1 = bool2;
            if (this.field_jsapiInfo != null)
            {
              bool1 = bool2;
              if (i.a(this.field_jsapiInfo, ((t)paramObject).field_jsapiInfo))
              {
                bool1 = bool2;
                if (this.field_hostInfo != null)
                {
                  bool1 = bool2;
                  if (i.a(this.field_hostInfo, ((t)paramObject).field_hostInfo))
                  {
                    bool1 = bool2;
                    if (this.field_actionsheetInfo != null)
                    {
                      bool1 = bool2;
                      if (i.a(this.field_actionsheetInfo, ((t)paramObject).field_actionsheetInfo)) {
                        bool1 = true;
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return bool1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */