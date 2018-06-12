package com.tencent.mm.plugin.address.model;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aja;
import com.tencent.mm.protocal.c.ajb;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
  extends l
  implements k
{
  private com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  
  public b()
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
    x.d("MicroMsg.NetSceneGetUserAutoFillInfo", "errType:" + paramInt2 + ",errCode:" + paramInt3 + ",errMsg" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      com.tencent.mm.plugin.address.a.a.Zw().eXD = new com.tencent.mm.plugin.q.a.a();
      x.i("MicroMsg.NetSceneGetUserAutoFillInfo", "return is 0.now we resetList and parse the json ..");
      paramq = (ajb)((com.tencent.mm.ab.b)paramq).dIE.dIL;
      x.i("MicroMsg.NetSceneGetUserAutoFillInfo", "resp json is.." + paramq.rLM);
      if (paramq.rLM == null) {}
    }
    for (;;)
    {
      int j;
      try
      {
        paramq = new JSONObject(paramq.rLM).getJSONArray("user_data_list").getJSONObject(0).getJSONArray("group_info_list");
        if ((paramq == null) || (paramq.length() <= 0)) {
          break label863;
        }
        i = 0;
        paramInt1 = paramq.length();
        if (i >= paramInt1) {
          break label863;
        }
        try
        {
          localObject = paramq.getJSONObject(i);
          paramArrayOfByte = new com.tencent.mm.plugin.q.a.b();
          paramArrayOfByte.knA = ((JSONObject)localObject).getInt("group_id");
          paramArrayOfByte.knJ = ((JSONObject)localObject).getString("invoice_url");
          x.i("MicroMsg.NetSceneGetUserAutoFillInfo", "get groupid:" + ((JSONObject)localObject).getInt("group_id") + "get invoiceUrl:" + ((JSONObject)localObject).getString("invoice_url"));
          localObject = ((JSONObject)localObject).getJSONArray("field_list");
          if ((localObject == null) || (((JSONArray)localObject).length() <= 0)) {
            continue;
          }
          j = 0;
          if (j >= ((JSONArray)localObject).length()) {
            continue;
          }
          localJSONObject = ((JSONArray)localObject).getJSONObject(j);
          str = localJSONObject.getString("key");
          paramInt1 = -1;
          switch (str.hashCode())
          {
          case 110371416: 
            if (!str.equals("title")) {
              break label878;
            }
            paramInt1 = 0;
          }
        }
        catch (JSONException paramArrayOfByte)
        {
          String str;
          x.e("MicroMsg.NetSceneGetUserAutoFillInfo", "parse error for no." + i);
          i += 1;
        }
        if (!str.equals("tax_number")) {
          break label878;
        }
        paramInt1 = 1;
      }
      catch (JSONException paramq)
      {
        int i;
        Object localObject;
        JSONObject localJSONObject;
        x.e("MicroMsg.NetSceneGetUserAutoFillInfo", "error parse this json");
      }
      if (str.equals("bank_name"))
      {
        paramInt1 = 2;
        break label878;
        if (str.equals("bank_number"))
        {
          paramInt1 = 3;
          break label878;
          if (str.equals("type"))
          {
            paramInt1 = 4;
            break label878;
            if (str.equals("email"))
            {
              paramInt1 = 5;
              break label878;
              if (str.equals("phone"))
              {
                paramInt1 = 6;
                break label878;
                if (str.equals("company_address_detail"))
                {
                  paramInt1 = 7;
                  break label878;
                  paramArrayOfByte.title = localJSONObject.getString("value");
                  break label924;
                  continue;
                  paramArrayOfByte.knC = localJSONObject.getString("value");
                  break label924;
                  paramArrayOfByte.knE = localJSONObject.getString("value");
                  break label924;
                  paramArrayOfByte.knD = localJSONObject.getString("value");
                  break label924;
                  paramArrayOfByte.type = localJSONObject.getString("value");
                  break label924;
                  paramArrayOfByte.csD = localJSONObject.getString("value");
                  break label924;
                  paramArrayOfByte.knG = localJSONObject.getString("value");
                  paramArrayOfByte.knH = localJSONObject.getString("value");
                  break label924;
                  paramArrayOfByte.knI = localJSONObject.getString("value");
                  break label924;
                  localObject = com.tencent.mm.plugin.address.a.a.Zw();
                  if ((paramArrayOfByte.type != null) && (paramArrayOfByte.type.equals("0")))
                  {
                    paramArrayOfByte.knB = "";
                    paramArrayOfByte.knH = "";
                    paramArrayOfByte.csD = "";
                    ((com.tencent.mm.plugin.address.b.a.a)localObject).eXD.knz.add(paramArrayOfByte);
                    x.i("MicroMsg.InvoiceMgr", "type is error..");
                    continue;
                  }
                  if ((paramArrayOfByte.type == null) || (!paramArrayOfByte.type.equals("1"))) {
                    continue;
                  }
                  paramArrayOfByte.knB = paramArrayOfByte.title;
                  paramArrayOfByte.title = "";
                  paramArrayOfByte.knG = "";
                  paramArrayOfByte.knC = "";
                  paramArrayOfByte.knD = "";
                  paramArrayOfByte.knE = "";
                  paramArrayOfByte.knI = "";
                  ((com.tencent.mm.plugin.address.b.a.a)localObject).eXD.knz.add(paramArrayOfByte);
                  continue;
                  label863:
                  this.diJ.a(paramInt2, paramInt3, paramString, this);
                  return;
                }
              }
            }
          }
        }
      }
      label878:
      switch (paramInt1)
      {
      }
      label924:
      j += 1;
    }
  }
  
  public final int getType()
  {
    return 1191;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/address/model/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */