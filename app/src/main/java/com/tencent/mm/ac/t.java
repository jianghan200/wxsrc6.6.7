package com.tencent.mm.ac;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aav;
import com.tencent.mm.protocal.c.aaw;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class t
  extends l
  implements k
{
  private Object data;
  public com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  
  private t(String paramString1, String paramString2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new aav();
    ((b.a)localObject).dIH = new aaw();
    ((b.a)localObject).uri = "/cgi-bin/mmocbiz-bin/getbizjsapiresult";
    ((b.a)localObject).dIF = 1285;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (aav)this.diG.dID.dIL;
    ((aav)localObject).ruF = paramString1;
    ((aav)localObject).nc = 1;
    ((aav)localObject).data = paramString2;
    this.data = null;
  }
  
  public static void a(com.tencent.mm.ab.e parame)
  {
    g.Eh().dpP.b(1285, parame);
  }
  
  public static boolean m(String paramString1, String paramString2, String paramString3)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("brand_user_name", paramString2);
      localJSONObject.put("bizchat_id", paramString3);
      paramString1 = new t(paramString1, localJSONObject.toString());
      return g.Eh().dpP.a(paramString1, 0);
    }
    catch (Exception paramString1) {}
    return false;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    x.i("MicroMsg.NetSceneGetBizJsApiResult", "do scene");
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneGetBizJsApiResult", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 1285;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ac/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */