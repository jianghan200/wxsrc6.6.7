package com.tencent.mm.plugin.account.security.a;

import com.tencent.mm.g.c.dm;
import com.tencent.mm.protocal.c.arp;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class d
  extends dm
{
  protected static c.a dhO;
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[4];
    locala.columns = new String[5];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "uid";
    locala.sKA.put("uid", "TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(" uid TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.sKz = "uid";
    locala.columns[1] = "name";
    locala.sKA.put("name", "TEXT default '' ");
    localStringBuilder.append(" name TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[2] = "devicetype";
    locala.sKA.put("devicetype", "TEXT default '' ");
    localStringBuilder.append(" devicetype TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[3] = "createtime";
    locala.sKA.put("createtime", "LONG default '0' ");
    localStringBuilder.append(" createtime LONG default '0' ");
    locala.columns[4] = "rowid";
    locala.sql = localStringBuilder.toString();
    dhO = locala;
  }
  
  public d()
  {
    this.field_uid = "0";
    this.field_name = "";
    this.field_devicetype = "";
    this.field_createtime = 0L;
  }
  
  public d(arp paramarp)
  {
    this.field_uid = paramarp.fMk;
    this.field_devicetype = paramarp.devicetype;
    this.field_name = paramarp.devicename;
    this.field_createtime = paramarp.rTQ;
  }
  
  protected final c.a AX()
  {
    return dhO;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/account/security/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */