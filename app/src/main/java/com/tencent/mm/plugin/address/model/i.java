package com.tencent.mm.plugin.address.model;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.alj;
import com.tencent.mm.protocal.c.bif;
import com.tencent.mm.protocal.c.big;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class i
  extends l
  implements k
{
  private com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  public big eXJ;
  
  public i(com.tencent.mm.plugin.q.a.b paramb)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bif();
    ((b.a)localObject).dIH = new big();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/wxaapp/autofill/saveinfo";
    ((b.a)localObject).dIF = 1180;
    this.diG = ((b.a)localObject).KT();
    localObject = (bif)this.diG.dID.dIL;
    ((bif)localObject).source = 2;
    StringBuilder localStringBuilder1 = new StringBuilder();
    StringBuilder localStringBuilder2 = new StringBuilder("{\"user_uin\":");
    au.HU();
    localStringBuilder1.append(c.Df() + " ,\"user_data_list\": [");
    if (paramb.type.equals("0")) {
      localStringBuilder1.append("{\"group_key\": \"invoice_info\",\"group_info\": {\"group_id\": " + paramb.knA + ",\"field_list\": [{\"key\": \"type\",\"value\": \"" + paramb.type + "\"},{\"key\": \"title\",\"value\": \"" + paramb.title + "\"},{\"key\": \"tax_number\",\"value\": \"" + paramb.knC + "\"},{\"key\": \"bank_number\",\"value\": \"" + paramb.knD + "\"},{\"key\": \"phone\",\"value\": \"" + paramb.knG + "\"},{\"key\": \"company_address_detail\",\"value\": \"" + paramb.knI + "\"},{\"key\": \"bank_name\",\"value\": \"" + paramb.knE + "\"}]}}");
    }
    for (;;)
    {
      localStringBuilder1.append("]}");
      ((bif)localObject).rLM = localStringBuilder1.toString();
      return;
      localStringBuilder1.append("{\"group_key\": \"invoice_info\",\"group_info\": {\"group_id\": " + paramb.knA + ",\"field_list\": [{\"key\": \"type\",\"value\": \"" + paramb.type + "\"},{\"key\": \"title\",\"value\": \"" + paramb.knB + "\"},{\"key\": \"phone\",\"value\": \"" + paramb.knH + "\"},{\"key\": \"email\",\"value\": \"" + paramb.csD + "\"}]}}");
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneSaveUserAutoFillInfo", "errType:" + paramInt2 + ",errCode:" + paramInt3 + ",errMsg" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      this.eXJ = ((big)((com.tencent.mm.ab.b)paramq).dIE.dIL);
      if ((this.eXJ != null) && (this.eXJ.siW != null) && (this.eXJ.siW.size() > 0) && (this.eXJ.siW.get(0) != null)) {
        x.i("MicroMsg.NetSceneSaveUserAutoFillInfo", "resp groupId is.." + ((alj)this.eXJ.siW.get(0)).group_id);
      }
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1180;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/address/model/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */