package com.tencent.mm.plugin.sns.model.a;

import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sns.data.i;

public final class g
  extends c
{
  public g(c.a parama, a parama1)
  {
    super(parama, parama1);
  }
  
  public final String MJ(String paramString)
  {
    return paramString;
  }
  
  public final boolean bza()
  {
    String str = i.j(this.caK);
    FileOp.i(this.nsN.getPath(), this.nsN.byY(), str);
    return true;
  }
  
  protected final int bzb()
  {
    return 2;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */