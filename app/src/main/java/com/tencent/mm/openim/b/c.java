package com.tencent.mm.openim.b;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.openim.PluginOpenIM;
import com.tencent.mm.openim.d.a;
import com.tencent.mm.openim.d.d;
import com.tencent.mm.openim.d.f;
import com.tencent.mm.protocal.c.afs;
import com.tencent.mm.protocal.c.aft;
import com.tencent.mm.protocal.c.as;
import com.tencent.mm.protocal.c.ayc;
import com.tencent.mm.protocal.c.cgb;
import com.tencent.mm.protocal.c.db;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;

public final class c
  extends l
  implements k
{
  String aem;
  public final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  String eus;
  private LinkedList<String> eut = new LinkedList();
  
  public c(String paramString1, String paramString2, LinkedList<String> paramLinkedList)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new afs();
    ((b.a)localObject).dIH = new aft();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getopenimresource";
    ((b.a)localObject).dIF = 453;
    this.diG = ((b.a)localObject).KT();
    this.eus = paramString1;
    this.aem = paramString2;
    this.eut.addAll(paramLinkedList);
    int i = 10 - this.eut.size();
    if (i > 0) {
      this.eut.addAll(((PluginOpenIM)g.n(PluginOpenIM.class)).getWordingInfoStg().x(i, paramString2));
    }
    localObject = (afs)this.diG.dID.dIL;
    ((afs)localObject).hva = paramString1;
    ((afs)localObject).aem = paramString2;
    ((afs)localObject).rJC = this.eut;
    x.i("MicroMsg.NetSceneGetOpenIMResource", "init NetSceneGetOpenIMResource appid:%s, lang:%s, initWordingIDs:%s, wordidList:%s", new Object[] { paramString1, paramString2, o(paramLinkedList), o(this.eut) });
  }
  
  private static String o(LinkedList<String> paramLinkedList)
  {
    String str = "size:" + paramLinkedList.size() + "[";
    Iterator localIterator = paramLinkedList.iterator();
    for (paramLinkedList = str; localIterator.hasNext(); paramLinkedList = paramLinkedList + str + ",") {
      str = (String)localIterator.next();
    }
    return paramLinkedList + "]";
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneGetOpenIMResource", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, appid:%s, lang:%s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, this.eus, this.aem });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    paramq = (aft)this.diG.dIE.dIL;
    paramArrayOfByte = paramq.rJE;
    x.i("MicroMsg.NetSceneGetOpenIMResource", "onGYNetEnd acct_type_resource  url:%d, word:%d", new Object[] { Integer.valueOf(paramArrayOfByte.raL.size()), Integer.valueOf(paramArrayOfByte.raK.size()) });
    Object localObject = new a();
    ((a)localObject).field_acctTypeId = paramArrayOfByte.raJ;
    ((a)localObject).field_language = this.aem;
    g.Ek();
    ((PluginOpenIM)g.n(PluginOpenIM.class)).getAccTypeInfoStg().b((com.tencent.mm.sdk.e.c)localObject, new String[] { "acctTypeId", "language" });
    ((a)localObject).field_accTypeRec = paramArrayOfByte;
    g.Ek();
    ((PluginOpenIM)g.n(PluginOpenIM.class)).getAccTypeInfoStg().a((a)localObject);
    localObject = paramq.rJD;
    x.i("MicroMsg.NetSceneGetOpenIMResource", "onGYNetEnd appid_resource funcFlag:%d, url:%d, word:%d", new Object[] { Integer.valueOf(((db)localObject).rde), Integer.valueOf(((db)localObject).raL.size()), Integer.valueOf(((db)localObject).raK.size()) });
    com.tencent.mm.openim.d.c localc = new com.tencent.mm.openim.d.c();
    localc.field_appid = this.eus;
    localc.field_language = this.aem;
    g.Ek();
    ((PluginOpenIM)g.n(PluginOpenIM.class)).getAppIdInfoStg().b(localc, new String[] { "appid", "language" });
    localc.field_appRec = ((db)localObject);
    localc.field_acctTypeId = paramArrayOfByte.raJ;
    g.Ek();
    ((PluginOpenIM)g.n(PluginOpenIM.class)).getAppIdInfoStg().a(localc);
    paramArrayOfByte = ((db)localObject).raL.iterator();
    while (paramArrayOfByte.hasNext())
    {
      localObject = (ayc)paramArrayOfByte.next();
      if ("openim_desc_icon".equals(((ayc)localObject).aAL)) {
        ((com.tencent.mm.openim.a.b)g.l(com.tencent.mm.openim.a.b.class)).oC(((ayc)localObject).url);
      }
    }
    x.i("MicroMsg.NetSceneGetOpenIMResource", "onGYNetEnd wording_id_resource   word:%d", new Object[] { Integer.valueOf(paramq.rJF.size()) });
    paramq = paramq.rJF.iterator();
    while (paramq.hasNext())
    {
      paramArrayOfByte = (cgb)paramq.next();
      localObject = new com.tencent.mm.openim.d.e();
      ((com.tencent.mm.openim.d.e)localObject).field_appid = this.eus;
      ((com.tencent.mm.openim.d.e)localObject).field_wordingId = paramArrayOfByte.sAz;
      ((com.tencent.mm.openim.d.e)localObject).field_language = this.aem;
      g.Ek();
      ((PluginOpenIM)g.n(PluginOpenIM.class)).getWordingInfoStg().b((com.tencent.mm.sdk.e.c)localObject, new String[] { "appid", "wordingId", "language" });
      ((com.tencent.mm.openim.d.e)localObject).field_wording = paramArrayOfByte.bSc;
      ((com.tencent.mm.openim.d.e)localObject).field_pinyin = paramArrayOfByte.mcD;
      ((com.tencent.mm.openim.d.e)localObject).field_quanpin = paramArrayOfByte.sAA;
      g.Ek();
      ((PluginOpenIM)g.n(PluginOpenIM.class)).getWordingInfoStg().a((com.tencent.mm.openim.d.e)localObject);
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 453;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/openim/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */