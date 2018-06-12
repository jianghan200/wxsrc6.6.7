package com.tencent.mm.plugin.sns.storage;

import com.tencent.mm.g.c.dw;
import com.tencent.mm.protocal.c.bqd;
import com.tencent.mm.protocal.c.vu;
import com.tencent.mm.protocal.c.xs;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bi;
import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.Map;

public final class l
  extends dw
{
  protected static c.a dhO;
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[16];
    locala.columns = new String[17];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "userName";
    locala.sKA.put("userName", "TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(" userName TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.sKz = "userName";
    locala.columns[1] = "md5";
    locala.sKA.put("md5", "TEXT");
    localStringBuilder.append(" md5 TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "newerIds";
    locala.sKA.put("newerIds", "TEXT");
    localStringBuilder.append(" newerIds TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "bgId";
    locala.sKA.put("bgId", "TEXT");
    localStringBuilder.append(" bgId TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "bgUrl";
    locala.sKA.put("bgUrl", "TEXT");
    localStringBuilder.append(" bgUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "older_bgId";
    locala.sKA.put("older_bgId", "TEXT");
    localStringBuilder.append(" older_bgId TEXT");
    localStringBuilder.append(", ");
    locala.columns[6] = "local_flag";
    locala.sKA.put("local_flag", "INTEGER");
    localStringBuilder.append(" local_flag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[7] = "istyle";
    locala.sKA.put("istyle", "INTEGER");
    localStringBuilder.append(" istyle INTEGER");
    localStringBuilder.append(", ");
    locala.columns[8] = "iFlag";
    locala.sKA.put("iFlag", "INTEGER");
    localStringBuilder.append(" iFlag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[9] = "icount";
    locala.sKA.put("icount", "INTEGER");
    localStringBuilder.append(" icount INTEGER");
    localStringBuilder.append(", ");
    locala.columns[10] = "faultS";
    locala.sKA.put("faultS", "BLOB");
    localStringBuilder.append(" faultS BLOB");
    localStringBuilder.append(", ");
    locala.columns[11] = "snsBgId";
    locala.sKA.put("snsBgId", "LONG");
    localStringBuilder.append(" snsBgId LONG");
    localStringBuilder.append(", ");
    locala.columns[12] = "snsuser";
    locala.sKA.put("snsuser", "BLOB");
    localStringBuilder.append(" snsuser BLOB");
    localStringBuilder.append(", ");
    locala.columns[13] = "adsession";
    locala.sKA.put("adsession", "BLOB");
    localStringBuilder.append(" adsession BLOB");
    localStringBuilder.append(", ");
    locala.columns[14] = "lastFirstPageRequestErrCode";
    locala.sKA.put("lastFirstPageRequestErrCode", "INTEGER");
    localStringBuilder.append(" lastFirstPageRequestErrCode INTEGER");
    localStringBuilder.append(", ");
    locala.columns[15] = "lastFirstPageRequestErrType";
    locala.sKA.put("lastFirstPageRequestErrType", "INTEGER");
    localStringBuilder.append(" lastFirstPageRequestErrType INTEGER");
    locala.columns[16] = "rowid";
    locala.sql = localStringBuilder.toString();
    dhO = locala;
  }
  
  protected final c.a AX()
  {
    return dhO;
  }
  
  public final void bAS()
  {
    this.field_local_flag &= 0xFFFFFFFD;
  }
  
  public final boolean bAT()
  {
    return (this.field_local_flag & 0x2) > 0;
  }
  
  public final bqd bAU()
  {
    try
    {
      bqd localbqd = (bqd)new bqd().aG(this.field_snsuser);
      return localbqd;
    }
    catch (Exception localException) {}
    return null;
  }
  
  public final vu bAV()
  {
    new xs();
    Object localObject1 = new vu();
    Object localObject2 = localObject1;
    if (!bi.bC(this.field_faultS)) {}
    for (;;)
    {
      try
      {
        localObject2 = (xs)new xs().aG(this.field_faultS);
        if (((xs)localObject2).rDy.size() > 0)
        {
          localObject2 = (vu)((xs)localObject2).rDy.getFirst();
          localObject1 = localObject2;
          localObject2 = localObject1;
          return (vu)localObject2;
        }
      }
      catch (Exception localException)
      {
        return (vu)localObject1;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */