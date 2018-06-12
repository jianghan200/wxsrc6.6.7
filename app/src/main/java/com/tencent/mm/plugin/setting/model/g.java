package com.tencent.mm.plugin.setting.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aja;
import com.tencent.mm.protocal.c.ajb;
import com.tencent.mm.storage.aa.a;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;

public final class g
  extends l
  implements k
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  
  public g()
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new aja();
    ((b.a)localObject).dIH = new ajb();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/wxaapp/autofill/getinfo";
    ((b.a)localObject).dIF = 1191;
    this.diG = ((b.a)localObject).KT();
    localObject = (aja)this.diG.dID.dIL;
    ((aja)localObject).source = 2;
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add("invoice_info.title");
    localLinkedList.add("invoice_info.tax_number");
    localLinkedList.add("invoice_info.bank_number");
    localLinkedList.add("invoice_info.bank_name");
    localLinkedList.add("invoice_info.type");
    localLinkedList.add("invoice_info.email");
    localLinkedList.add("invoice_info.company_address");
    localLinkedList.add("invoice_info.company_address_detail");
    localLinkedList.add("invoice_info.company_address_postcode");
    localLinkedList.add("invoice_info.phone");
    ((aja)localObject).rLL = localLinkedList;
    ((aja)localObject).rLK = false;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetUserAutoFillInfo", "errType:" + paramInt2 + ",errCode:" + paramInt3 + ",errMsg" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetUserAutoFillInfo", "return is 0.now we parse the json and resetList..");
      paramq = (ajb)((b)paramq).dIE.dIL;
      if (paramq.rLM == null) {}
    }
    try
    {
      boolean bool = new JSONObject(paramq.rLM).getBoolean("has_invoice_info");
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetUserAutoFillInfo", "has_invoice_info is .." + bool);
      com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sWn, Boolean.valueOf(bool));
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    catch (JSONException paramq)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneGetUserAutoFillInfo", "error parse this json");
      }
    }
  }
  
  public final int getType()
  {
    return 1191;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/setting/model/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */