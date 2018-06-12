package com.tencent.mm.ui.chatting.f;

import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public final class a
  extends com.tencent.mm.ap.a
{
  public String tXR;
  public long tXS = 0L;
  
  public a(Map<String, String> paramMap, bd parambd)
  {
    super(paramMap, parambd);
  }
  
  protected final boolean Qi()
  {
    if (this.values == null)
    {
      x.e("MicroMsg.InvokeMessageNewXmlMsg", "[parseXml] values == null ");
      return false;
    }
    if (this.values.containsKey(".sysmsg.invokeMessage.preContent")) {
      this.tXR = ((String)this.values.get(".sysmsg.invokeMessage.preContent"));
    }
    if (this.values.containsKey(".sysmsg.invokeMessage.timestamp")) {
      this.tXS = bi.WV((String)this.values.get(".sysmsg.invokeMessage.timestamp"));
    }
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = this.values.keySet().iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (str.startsWith(".sysmsg.invokeMessage.text"))
      {
        if (localStringBuilder.length() > 0) {
          localStringBuilder.insert(0, (String)this.values.get(str));
        } else {
          localStringBuilder.append((String)this.values.get(str));
        }
      }
      else
      {
        if ((!str.startsWith(".sysmsg.invokeMessage.link.text")) || (bi.oW((String)this.values.get(str)))) {
          break label341;
        }
        str = (String)this.values.get(str);
        localStringBuilder.append(str);
        this.ebH.add(str);
        i = str.length();
      }
    }
    label341:
    for (;;)
    {
      break;
      this.ebI.addFirst(Integer.valueOf(localStringBuilder.length() - i));
      this.ebJ.add(Integer.valueOf(localStringBuilder.length()));
      this.ebF = localStringBuilder.toString();
      if ((System.currentTimeMillis() - this.tXS >= 300000L) && (!bi.oW(this.tXR))) {
        e.post(new a.1(this), "[checkExpired]");
      }
      return true;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/chatting/f/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */