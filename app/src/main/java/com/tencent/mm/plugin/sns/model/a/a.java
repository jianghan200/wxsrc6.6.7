package com.tencent.mm.plugin.sns.model.a;

import com.tencent.mm.plugin.sns.data.e;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.an;
import com.tencent.mm.protocal.c.ate;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.av;

public final class a
{
  public String bKg = "";
  public String mediaId = "";
  public e nkK = null;
  public String nkR = "";
  public String nkS = "";
  public String nnX = "";
  public String nob = "";
  public ate noc;
  public boolean nsG = false;
  public boolean nsH = false;
  public int nsI = 0;
  public av nsJ;
  public float nsK = 0.0F;
  public String url = "";
  
  public a(String paramString)
  {
    this.mediaId = paramString;
  }
  
  public final String byY()
  {
    if (this.nsI == 4) {
      return i.p(this.noc);
    }
    if (this.nsI == 6) {
      return i.q(this.noc);
    }
    if (this.nsG) {
      return i.n(this.noc);
    }
    return i.m(this.noc);
  }
  
  public final String getPath()
  {
    if (!bi.oW(this.nkR)) {
      return this.nkR;
    }
    if (bi.oW(this.nnX)) {
      init();
    }
    return this.nnX;
  }
  
  public final boolean init()
  {
    this.nnX = an.s(af.getAccSnsPath(), this.mediaId);
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/sns/model/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */