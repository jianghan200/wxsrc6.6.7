package com.tencent.mm.plugin.sns.data;

import com.tencent.mm.protocal.c.ate;
import java.util.LinkedList;
import java.util.List;

public final class e
{
  public String kJG;
  public List<ate> list = new LinkedList();
  public int nkQ;
  
  public e() {}
  
  public e(ate paramate)
  {
    this.list.add(paramate);
  }
  
  public e(List<ate> paramList)
  {
    this.list = paramList;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/data/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */