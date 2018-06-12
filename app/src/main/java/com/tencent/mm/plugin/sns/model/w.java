package com.tencent.mm.plugin.sns.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.sns.storage.t;
import com.tencent.mm.plugin.sns.storage.u;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.bps;
import com.tencent.mm.protocal.c.bpv;
import com.tencent.mm.protocal.c.bpw;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class w
  extends l
  implements k
{
  private int bNI;
  private b diG;
  public com.tencent.mm.ab.e diJ;
  private long noI;
  private int scene = 0;
  
  public w(int paramInt1, long paramLong, String paramString, int paramInt2, List<String> paramList, int paramInt3)
  {
    x.d("MicroMsg.NetSceneSnsTagMemberOption", "opCode " + paramInt1 + " tagName " + paramString + " memberList " + paramList.size() + " scene " + paramInt3);
    this.bNI = paramInt1;
    this.noI = paramLong;
    this.scene = paramInt3;
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bpv();
    ((b.a)localObject).dIH = new bpw();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmsnstagmemberoption";
    ((b.a)localObject).dIF = 291;
    ((b.a)localObject).dII = 115;
    ((b.a)localObject).dIJ = 1000000115;
    this.diG = ((b.a)localObject).KT();
    localObject = (bpv)this.diG.dID.dIL;
    ((bpv)localObject).qZc = paramInt1;
    ((bpv)localObject).snO = paramLong;
    ((bpv)localObject).jSt = paramString;
    ((bpv)localObject).hbF = paramInt2;
    ((bpv)localObject).otY = this.scene;
    paramString = new LinkedList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      paramString.add(new bhz().VO(str));
    }
    ((bpv)localObject).hbG = paramString;
    x.d("MicroMsg.NetSceneSnsTagMemberOption", "rr.req.rImpl " + localObject.toString());
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneSnsTagMemberOption", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    paramq = ((bpw)((b)paramq).dIE.dIL).snQ;
    x.d("MicroMsg.NetSceneSnsTagMemberOption", "Resp.rImpl " + paramq.toString());
    paramArrayOfByte = af.byu().fk(paramq.snO);
    paramArrayOfByte.field_tagId = paramq.snO;
    paramArrayOfByte.field_tagName = bi.aG(paramq.jSt, "");
    switch (this.bNI)
    {
    }
    for (;;)
    {
      af.byu().a(paramArrayOfByte);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      paramArrayOfByte.field_count = paramq.hbF;
      paramArrayOfByte.co(paramq.hbG);
    }
  }
  
  public final int getType()
  {
    return 291;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/sns/model/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */