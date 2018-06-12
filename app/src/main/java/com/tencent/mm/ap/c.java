package com.tencent.mm.ap;

import com.tencent.mm.storage.bd;
import java.util.LinkedList;
import java.util.Map;

public final class c
  extends a
{
  public c(Map<String, String> paramMap, bd parambd)
  {
    super(paramMap, parambd);
  }
  
  protected final boolean Qi()
  {
    if (this.values == null) {}
    while (!this.TYPE.equals("chatroommuteexpt")) {
      return false;
    }
    String str2 = (String)this.values.get(".sysmsg.chatroommuteexpt.text");
    String str1 = (String)this.values.get(".sysmsg.chatroommuteexpt.link.text");
    str2 = str2 + str1;
    this.ebH.add(str1);
    this.ebI.addFirst(Integer.valueOf(str2.length() - str1.length()));
    this.ebJ.add(Integer.valueOf(str2.length()));
    this.ebF = str2;
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ap/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */