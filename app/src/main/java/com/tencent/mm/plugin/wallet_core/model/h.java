package com.tencent.mm.plugin.wallet_core.model;

import android.os.Bundle;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.wallet_core.c.b;

public final class h
{
  public int pmS = 0;
  public String pmT = "";
  public int pmU = 0;
  public String pmV = "";
  public int pmW = 0;
  public b pmX = new b();
  
  public h() {}
  
  public h(Bundle paramBundle)
  {
    this.pmS = paramBundle.getInt("key_is_gen_cert", 0);
    this.pmU = paramBundle.getInt("key_is_hint_crt", 0);
    this.pmW = paramBundle.getInt("key_is_ignore_cert", 0);
    this.pmT = paramBundle.getString("key_crt_token", "");
    this.pmV = paramBundle.getString("key_crt_wording", "");
    this.pmX = new b(this.pmV);
  }
  
  public final boolean bOB()
  {
    return (this.pmU != 0) && (!bi.oW(this.pmV));
  }
  
  public final boolean bOC()
  {
    return this.pmS == 1;
  }
  
  public final boolean bOD()
  {
    return (bOC()) && (this.pmW == 0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */