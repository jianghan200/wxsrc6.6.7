package com.tencent.mm.plugin.offline.a;

import com.tencent.mm.network.q;
import org.json.JSONObject;

public final class l
  extends h
{
  public String lJi;
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    super.a(paramInt1, paramInt2, paramInt3, paramString, paramq, paramArrayOfByte);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    this.lJi = paramJSONObject.optString("barcode");
  }
  
  public final int aBO()
  {
    return 78;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/offline/a/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */