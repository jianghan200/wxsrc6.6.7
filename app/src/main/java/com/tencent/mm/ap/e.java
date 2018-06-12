package com.tencent.mm.ap;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public final class e
  extends a
{
  public String bUu;
  public LinkedList<String> ebU = new LinkedList();
  public String url;
  
  public e(Map<String, String> paramMap, bd parambd)
  {
    super(paramMap, parambd);
  }
  
  protected final boolean Qi()
  {
    if (this.values == null)
    {
      x.e("MicroMsg.DelChatroomMemberNewXmlMsg", "[parseXml] values == null ");
      return false;
    }
    x.i("MicroMsg.DelChatroomMemberNewXmlMsg", "[parseXml] type:%s, values size:%s", new Object[] { bi.oV(this.TYPE), Integer.valueOf(this.values.size()) });
    Object localObject1;
    int i;
    if ((!bi.oW(this.TYPE)) && (this.TYPE.equalsIgnoreCase("delchatroommember")))
    {
      this.url = bi.oV((String)this.values.get(".sysmsg.delchatroommember.url"));
      this.bUu = bi.oV((String)this.values.get(".sysmsg.delchatroommember.link.qrcode"));
      this.ebU.add(this.values.get(".sysmsg.delchatroommember.link.memberlist.username"));
      localObject1 = this.values.keySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (String)((Iterator)localObject1).next();
        if (((String)localObject2).startsWith(".sysmsg.delchatroommember.link.memberlist.username#")) {
          this.ebU.add(this.values.get(localObject2));
        }
      }
      localObject1 = new StringBuilder();
      Object localObject2 = this.values.keySet().iterator();
      i = 0;
      while (((Iterator)localObject2).hasNext())
      {
        String str = (String)((Iterator)localObject2).next();
        if (str.startsWith(ebD))
        {
          if (((StringBuilder)localObject1).length() > 0) {
            ((StringBuilder)localObject1).insert(0, (String)this.values.get(str));
          } else {
            ((StringBuilder)localObject1).append((String)this.values.get(str));
          }
        }
        else
        {
          if (!str.startsWith(".sysmsg.delchatroommember.link.text")) {
            break label478;
          }
          ((StringBuilder)localObject1).append((String)this.values.get(str));
          this.ebH.add(this.values.get(str));
          i = ((String)this.values.get(str)).length();
        }
      }
    }
    label478:
    for (;;)
    {
      break;
      this.ebI.addFirst(Integer.valueOf(((StringBuilder)localObject1).length() - i));
      this.ebJ.add(Integer.valueOf(((StringBuilder)localObject1).length()));
      this.ebF = ((StringBuilder)localObject1).toString();
      x.i("MicroMsg.DelChatroomMemberNewXmlMsg", "[parseXml] url:%s, qrcode:%s, members size :%s", new Object[] { this.url, this.bUu, Integer.valueOf(this.ebU.size()) });
      return true;
      x.e("MicroMsg.DelChatroomMemberNewXmlMsg", "[parseXml] type err :%s", new Object[] { bi.oV(this.TYPE) });
      return false;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ap/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */