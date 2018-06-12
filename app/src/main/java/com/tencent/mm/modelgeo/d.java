package com.tencent.mm.modelgeo;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.yy;
import com.tencent.mm.protocal.c.yz;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d
  extends l
  implements k
{
  private String bPL = "";
  public final b diG;
  private com.tencent.mm.ab.e diJ;
  
  public d(double paramDouble1, double paramDouble2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new yy();
    ((b.a)localObject).dIH = new yz();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getaddress";
    ((b.a)localObject).dIF = 655;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (yy)this.diG.dID.dIL;
    ((yy)localObject).rjj = paramDouble1;
    ((yy)localObject).rji = paramDouble2;
  }
  
  public final Addr OE()
  {
    int i = 0;
    if (bi.oW(this.bPL)) {
      return null;
    }
    Addr localAddr = new Addr();
    for (;;)
    {
      try
      {
        x.d("MicroMsg.NetSceneGetAddress", "tofutest retJson: %s", new Object[] { this.bPL });
        Object localObject = new JSONObject(this.bPL);
        localAddr.dRR = ((JSONObject)localObject).optString("request_id");
        localObject = ((JSONObject)localObject).getJSONArray("results");
        localAddr.dRH = ((JSONArray)localObject).getJSONObject(1).getString("address_name");
        JSONObject localJSONObject = ((JSONArray)localObject).getJSONObject(0);
        localAddr.dRI = localJSONObject.getString("p");
        localAddr.dRJ = localJSONObject.getString("c");
        localAddr.dRL = localJSONObject.getString("d");
        localAddr.dRM = "";
        localAddr.dRN = "";
        localAddr.dRO = "";
        int j = ((JSONArray)localObject).length();
        if (i < j) {
          try
          {
            localJSONObject = ((JSONArray)localObject).getJSONObject(i);
            String str = localJSONObject.getString("dtype");
            if ("ST".equals(str))
            {
              localAddr.dRN = localJSONObject.getString("name");
              if (!"FORMAT_ADDRESS".equals(str)) {
                break label270;
              }
              localAddr.dRP = localJSONObject.getString("rough_address_name");
              break label270;
            }
            if (!"ST_NO".equals(str)) {
              continue;
            }
            localAddr.dRO = localJSONObject.getString("name");
            continue;
            if (bi.oW(localAddr.dRO)) {
              continue;
            }
          }
          catch (Exception localException2) {}
        }
        localAddr.dRN = "";
        return localAddr;
      }
      catch (Exception localException1)
      {
        return null;
      }
      label270:
      i += 1;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneGetAddress", "onGYNetEnd errType %d errCode%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      this.bPL = ((yz)((b)paramq).dIE.dIL).rFb;
      x.d("MicroMsg.NetSceneGetAddress", this.bPL);
      if (this.diJ != null) {
        this.diJ.a(paramInt2, paramInt3, paramString, this);
      }
    }
    while (this.diJ == null) {
      return;
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 655;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/modelgeo/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */