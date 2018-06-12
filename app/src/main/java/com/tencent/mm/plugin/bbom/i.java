package com.tencent.mm.plugin.bbom;

import com.tencent.mm.model.bf;
import com.tencent.mm.plugin.messenger.foundation.a.l;
import com.tencent.mm.protocal.c.ato;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.bd;

public final class i
  implements l
{
  private String hev = null;
  
  public i(String paramString)
  {
    this.hev = paramString;
  }
  
  public final void a(ato paramato, bd parambd)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("<msgsource>");
    localStringBuilder.append("<strangerantispamticket ticket=\"" + this.hev + "\"></strangerantispamticket>");
    localStringBuilder.append(bi.oV(bf.Iq()));
    if ((bi.oW(paramato.rco)) || (!paramato.rco.startsWith("<msgsource>"))) {}
    for (parambd = "<msgsource></msgsource>";; parambd = paramato.rco)
    {
      paramato.rco = parambd;
      paramato.rco = paramato.rco.replace("<msgsource>", localStringBuilder.toString());
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/bbom/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */