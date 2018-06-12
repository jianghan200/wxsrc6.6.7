package com.tencent.mm.plugin.sns.storage;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Bundle;
import com.tencent.mm.a.g;
import com.tencent.mm.g.c.f;
import com.tencent.mm.protocal.c.bsu;
import com.tencent.mm.protocal.c.qc;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class e
  extends f
{
  protected static c.a dhO;
  protected static Map<String, b> nJd = new ConcurrentHashMap();
  protected static Map<String, a> nJe = new ConcurrentHashMap();
  public String nJb = null;
  protected int nJc;
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[22];
    locala.columns = new String[23];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "snsId";
    locala.sKA.put("snsId", "LONG");
    localStringBuilder.append(" snsId LONG");
    localStringBuilder.append(", ");
    locala.columns[1] = "userName";
    locala.sKA.put("userName", "TEXT");
    localStringBuilder.append(" userName TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "localFlag";
    locala.sKA.put("localFlag", "INTEGER");
    localStringBuilder.append(" localFlag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[3] = "createTime";
    locala.sKA.put("createTime", "INTEGER");
    localStringBuilder.append(" createTime INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "head";
    locala.sKA.put("head", "INTEGER");
    localStringBuilder.append(" head INTEGER");
    localStringBuilder.append(", ");
    locala.columns[5] = "localPrivate";
    locala.sKA.put("localPrivate", "INTEGER");
    localStringBuilder.append(" localPrivate INTEGER");
    localStringBuilder.append(", ");
    locala.columns[6] = "type";
    locala.sKA.put("type", "INTEGER");
    localStringBuilder.append(" type INTEGER");
    localStringBuilder.append(", ");
    locala.columns[7] = "sourceType";
    locala.sKA.put("sourceType", "INTEGER");
    localStringBuilder.append(" sourceType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[8] = "likeFlag";
    locala.sKA.put("likeFlag", "INTEGER");
    localStringBuilder.append(" likeFlag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[9] = "pravited";
    locala.sKA.put("pravited", "INTEGER");
    localStringBuilder.append(" pravited INTEGER");
    localStringBuilder.append(", ");
    locala.columns[10] = "stringSeq";
    locala.sKA.put("stringSeq", "TEXT");
    localStringBuilder.append(" stringSeq TEXT");
    localStringBuilder.append(", ");
    locala.columns[11] = "content";
    locala.sKA.put("content", "BLOB");
    localStringBuilder.append(" content BLOB");
    localStringBuilder.append(", ");
    locala.columns[12] = "attrBuf";
    locala.sKA.put("attrBuf", "BLOB");
    localStringBuilder.append(" attrBuf BLOB");
    localStringBuilder.append(", ");
    locala.columns[13] = "postBuf";
    locala.sKA.put("postBuf", "BLOB");
    localStringBuilder.append(" postBuf BLOB");
    localStringBuilder.append(", ");
    locala.columns[14] = "adinfo";
    locala.sKA.put("adinfo", "TEXT");
    localStringBuilder.append(" adinfo TEXT");
    localStringBuilder.append(", ");
    locala.columns[15] = "adxml";
    locala.sKA.put("adxml", "TEXT");
    localStringBuilder.append(" adxml TEXT");
    localStringBuilder.append(", ");
    locala.columns[16] = "createAdTime";
    locala.sKA.put("createAdTime", "INTEGER");
    localStringBuilder.append(" createAdTime INTEGER");
    localStringBuilder.append(", ");
    locala.columns[17] = "exposureTime";
    locala.sKA.put("exposureTime", "INTEGER");
    localStringBuilder.append(" exposureTime INTEGER");
    localStringBuilder.append(", ");
    locala.columns[18] = "firstControlTime";
    locala.sKA.put("firstControlTime", "INTEGER");
    localStringBuilder.append(" firstControlTime INTEGER");
    localStringBuilder.append(", ");
    locala.columns[19] = "recxml";
    locala.sKA.put("recxml", "TEXT");
    localStringBuilder.append(" recxml TEXT");
    localStringBuilder.append(", ");
    locala.columns[20] = "subType";
    locala.sKA.put("subType", "INTEGER");
    localStringBuilder.append(" subType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[21] = "exposureCount";
    locala.sKA.put("exposureCount", "INTEGER");
    localStringBuilder.append(" exposureCount INTEGER");
    locala.columns[22] = "rowid";
    locala.sql = localStringBuilder.toString();
    dhO = locala;
  }
  
  protected final c.a AX()
  {
    return dhO;
  }
  
  public final void F(Bundle paramBundle)
  {
    if (paramBundle == null) {
      return;
    }
    ContentValues localContentValues = (ContentValues)paramBundle.getParcelable("values");
    this.field_snsId = localContentValues.getAsLong("snsId").longValue();
    this.field_userName = localContentValues.getAsString("userName");
    this.field_localFlag = localContentValues.getAsInteger("localFlag").intValue();
    this.field_createTime = localContentValues.getAsInteger("createTime").intValue();
    this.field_head = localContentValues.getAsInteger("head").intValue();
    this.field_localPrivate = localContentValues.getAsInteger("localPrivate").intValue();
    this.field_type = localContentValues.getAsInteger("type").intValue();
    this.field_sourceType = localContentValues.getAsInteger("sourceType").intValue();
    this.field_likeFlag = localContentValues.getAsInteger("likeFlag").intValue();
    this.field_pravited = localContentValues.getAsInteger("pravited").intValue();
    this.field_stringSeq = localContentValues.getAsString("stringSeq");
    this.field_content = localContentValues.getAsByteArray("content");
    this.field_attrBuf = localContentValues.getAsByteArray("attrBuf");
    this.field_postBuf = localContentValues.getAsByteArray("postBuf");
    this.field_adinfo = localContentValues.getAsString("adinfo");
    this.field_adxml = localContentValues.getAsString("adxml");
    this.field_createAdTime = localContentValues.getAsInteger("createAdTime").intValue();
    this.field_exposureTime = localContentValues.getAsInteger("exposureTime").intValue();
    this.field_firstControlTime = localContentValues.getAsInteger("firstControlTime").intValue();
    this.field_recxml = localContentValues.getAsString("recxml");
    this.field_subType = localContentValues.getAsInteger("subType").intValue();
    this.sKx = localContentValues.getAsLong("rowid").longValue();
    this.nJc = paramBundle.getInt("localid");
  }
  
  public final boolean Ni(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0) || (paramString.equals(this.field_adinfo))) {
      return false;
    }
    nJe.remove(this.field_adinfo);
    this.field_adinfo = paramString;
    return true;
  }
  
  public final boolean Nj(String paramString)
  {
    paramString = com.tencent.mm.modelsns.e.ng(paramString);
    try
    {
      this.field_content = paramString.toByteArray();
      this.nJb = (g.u(this.field_content) + g.u(this.field_attrBuf));
      return true;
    }
    catch (Exception paramString)
    {
      x.printErrStackTrace("MicroMsg.AdSnsInfo", paramString, "", new Object[0]);
    }
    return false;
  }
  
  public final void aK(byte[] paramArrayOfByte)
  {
    this.field_attrBuf = paramArrayOfByte;
    this.nJb = (g.u(this.field_content) + g.u(this.field_attrBuf));
  }
  
  public final b bAF()
  {
    Object localObject;
    b localb;
    if (this.field_adxml != null)
    {
      if (nJd.containsKey(this.field_adxml))
      {
        localObject = (b)nJd.get(this.field_adxml);
        return (b)localObject;
      }
      localb = new b(this.field_adxml);
      nJd.put(this.field_adxml, localb);
    }
    for (;;)
    {
      localObject = localb;
      if (localb != null) {
        break;
      }
      return new b(null);
      localb = null;
    }
  }
  
  public final b bAG()
  {
    Object localObject;
    b localb;
    if (this.field_recxml != null)
    {
      if (nJd.containsKey(this.field_recxml))
      {
        localObject = (b)nJd.get(this.field_recxml);
        return (b)localObject;
      }
      localb = new b(this.field_recxml);
      nJd.put(this.field_recxml, localb);
    }
    for (;;)
    {
      localObject = localb;
      if (localb != null) {
        break;
      }
      return new b(null);
      localb = null;
    }
  }
  
  public final a bAH()
  {
    Object localObject;
    a locala;
    if (this.field_adinfo != null)
    {
      if (nJe.containsKey(this.field_adinfo))
      {
        localObject = (a)nJe.get(this.field_adinfo);
        return (a)localObject;
      }
      locala = new a(this.field_adinfo);
      nJe.put(this.field_adinfo, locala);
    }
    for (;;)
    {
      localObject = locala;
      if (locala != null) {
        break;
      }
      return new a(null);
      locala = null;
    }
  }
  
  public final int bAI()
  {
    b localb = bAG();
    if (localb == null) {
      return 0;
    }
    return localb.nyY;
  }
  
  public final bsu bAJ()
  {
    Object localObject;
    if (this.field_content == null) {
      localObject = com.tencent.mm.modelsns.e.RF();
    }
    bsu localbsu;
    do
    {
      return (bsu)localObject;
      if (this.nJb == null) {
        this.nJb = (g.u(this.field_content) + g.u(this.field_attrBuf));
      }
      if (!n.nJj.containsKey(this.nJb)) {
        break;
      }
      localbsu = (bsu)n.nJj.get(this.nJb);
      localObject = localbsu;
    } while (localbsu != null);
    try
    {
      localObject = (bsu)new bsu().aG(this.field_content);
      n.nJj.put(this.nJb, localObject);
      return (bsu)localObject;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.AdSnsInfo", "error get snsinfo timeline!");
    }
    return com.tencent.mm.modelsns.e.RF();
  }
  
  public final String bAK()
  {
    return v.ah("ad_table_", this.field_snsId);
  }
  
  public final n bAL()
  {
    n localn = new n();
    localn.c(bAJ());
    x.d("MicroMsg.AdSnsInfo", "from server xml ok %d", new Object[] { Long.valueOf(this.field_snsId) });
    localn.nJc = this.nJc;
    localn.field_userName = this.field_userName;
    localn.hK(this.field_createTime);
    localn.field_likeFlag = this.field_likeFlag;
    localn.fe(this.field_snsId);
    localn.field_sourceType = this.field_sourceType;
    localn.field_content = this.field_content;
    localn.wZ(2);
    localn.wZ(32);
    localn.field_attrBuf = this.field_attrBuf;
    bsu localbsu = localn.bAJ();
    localbsu.hbL = this.field_userName;
    localn.field_pravited = localbsu.rVG;
    localn.bBb();
    localn.c(localbsu);
    if (localbsu.sqc != null)
    {
      localn.field_type = localbsu.sqc.ruz;
      localn.field_subType = localbsu.sqc.ruB;
    }
    localn.nJm = this;
    return localn;
  }
  
  public final Bundle bAM()
  {
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("values", super.wH());
    localBundle.putInt("localid", this.nJc);
    return localBundle;
  }
  
  public final boolean bzx()
  {
    b localb = bAF();
    if (localb != null) {
      return localb.bzx();
    }
    return false;
  }
  
  public final void c(bsu parambsu)
  {
    try
    {
      this.field_content = parambsu.toByteArray();
      return;
    }
    catch (Exception parambsu)
    {
      x.printErrStackTrace("MicroMsg.AdSnsInfo", parambsu, "", new Object[0]);
    }
  }
  
  public final void d(Cursor paramCursor)
  {
    super.d(paramCursor);
    this.nJc = ((int)this.sKx);
  }
  
  public final int getSource()
  {
    b localb = bAG();
    if (localb == null) {
      return 0;
    }
    return localb.nyY;
  }
  
  public final void wZ(int paramInt)
  {
    this.field_sourceType |= paramInt;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */