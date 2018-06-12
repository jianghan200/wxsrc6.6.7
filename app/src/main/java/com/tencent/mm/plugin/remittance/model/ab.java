package com.tencent.mm.plugin.remittance.model;

import android.text.TextUtils;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.plugin.ac.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.remittance.b.c;
import com.tencent.mm.plugin.remittance.b.d;
import com.tencent.mm.pluginsdk.model.app.k;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.y.g.a;
import com.tencent.mm.y.h;
import java.util.HashMap;
import java.util.HashSet;

public final class ab
{
  public static String TAG = "MicroMsg.RemittanceLocalMsgMgr";
  public Object lock = new Object();
  public HashSet<String> myE = null;
  public HashMap<String, String> myF = new HashMap();
  
  /* Error */
  private boolean Kz(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 26	com/tencent/mm/plugin/remittance/model/ab:myE	Ljava/util/HashSet;
    //   6: aload_1
    //   7: invokevirtual 42	java/util/HashSet:contains	(Ljava/lang/Object;)Z
    //   10: ifne +16 -> 26
    //   13: aload_0
    //   14: getfield 26	com/tencent/mm/plugin/remittance/model/ab:myE	Ljava/util/HashSet;
    //   17: aload_1
    //   18: invokevirtual 45	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   21: istore_2
    //   22: aload_0
    //   23: monitorexit
    //   24: iload_2
    //   25: ireturn
    //   26: getstatic 20	com/tencent/mm/plugin/remittance/model/ab:TAG	Ljava/lang/String;
    //   29: ldc 47
    //   31: invokestatic 53	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   34: iconst_0
    //   35: istore_2
    //   36: goto -14 -> 22
    //   39: astore_1
    //   40: aload_0
    //   41: monitorexit
    //   42: aload_1
    //   43: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	44	0	this	ab
    //   0	44	1	paramString	String
    //   21	15	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	22	39	finally
    //   26	34	39	finally
  }
  
  public final boolean Ky(String paramString)
  {
    synchronized (this.lock)
    {
      boolean bool = this.myE.contains(paramString);
      return bool;
    }
  }
  
  public final boolean V(String paramString1, String paramString2, String paramString3)
  {
    if ((TextUtils.isEmpty(paramString2)) || (TextUtils.isEmpty(paramString3)) || (TextUtils.isEmpty(paramString1)))
    {
      x.e(TAG, "msgxml or toUserName or antiRepeatid is null");
      return false;
    }
    if (!Kz(paramString1)) {
      return false;
    }
    com.tencent.mm.storage.bd localbd = new com.tencent.mm.storage.bd();
    localbd.setContent(paramString2);
    localbd.setStatus(2);
    localbd.ep(paramString3);
    localbd.ay(com.tencent.mm.model.bd.iD(paramString3));
    localbd.eX(1);
    localbd.setType(419430449);
    long l = ((i)com.tencent.mm.kernel.g.l(i.class)).bcY().T(localbd);
    if (l < 0L)
    {
      x.e(TAG, com.tencent.mm.compatible.util.g.Ac() + "insert msg failed :" + l);
      this.myE.remove(paramString1);
      return false;
    }
    localbd.setMsgId(l);
    boolean bool1;
    if (localbd.aQm())
    {
      com.tencent.mm.modelstat.b.ehL.a(localbd, h.g(localbd));
      paramString3 = new com.tencent.mm.y.g();
      paramString3.field_xml = localbd.field_content;
      paramString2 = bi.WT(paramString2);
      paramString1 = null;
      if (paramString2 != null)
      {
        paramString2 = g.a.J(paramString2, localbd.field_reserved);
        paramString1 = paramString2;
        if (paramString2 != null)
        {
          paramString3.field_title = paramString2.title;
          paramString3.field_description = paramString2.description;
          paramString1 = paramString2;
        }
      }
      paramString3.field_type = 2000;
      paramString3.field_msgId = l;
      paramString2 = a.bmg().fI(l);
      if ((paramString2 == null) || (paramString2.field_msgId != l)) {
        break label366;
      }
      bool1 = a.bmg().c(paramString3, new String[0]);
    }
    for (;;)
    {
      if (paramString1 != null)
      {
        paramString2 = new c();
        paramString2.field_locaMsgId = localbd.field_msgId;
        paramString2.field_transferId = paramString1.dxB;
        paramString2.field_receiveStatus = -1;
        paramString2.field_isSend = true;
        com.tencent.mm.plugin.remittance.a.b.bqQ();
        com.tencent.mm.plugin.remittance.a.b.bqS().a(paramString2);
      }
      return bool1;
      com.tencent.mm.modelstat.b.ehL.f(localbd);
      break;
      label366:
      boolean bool2 = a.bmg().b(paramString3);
      bool1 = bool2;
      if (!bool2)
      {
        x.e(TAG, "PinOpenApi.getAppMessageStorage().insert msg failed id:" + l);
        bool1 = bool2;
      }
    }
  }
  
  public final boolean en(String paramString1, String paramString2)
  {
    String str = (String)this.myF.get(paramString1);
    if (bi.oW(str))
    {
      x.w(TAG, "empty transid: %s", new Object[] { paramString1 });
      return false;
    }
    return V(paramString1, str, paramString2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/remittance/model/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */