package com.tencent.mm.ui.chatting.b;

import android.content.Context;
import android.widget.Toast;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.a.fi;
import com.tencent.mm.g.a.fi.a;
import com.tencent.mm.g.a.fm;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.model.s;
import com.tencent.mm.modelvoice.m;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bx;
import com.tencent.mm.storage.by;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate.b;
import java.util.HashMap;
import java.util.LinkedHashMap;

@com.tencent.mm.ui.chatting.b.a.a(cwo=com.tencent.mm.ui.chatting.b.b.ad.class)
public class ak
  extends a
  implements com.tencent.mm.ui.chatting.b.b.ad
{
  private static HashMap<Long, String> tSN = new HashMap();
  private static HashMap<Long, ChattingItemTranslate.b> tSO = new HashMap();
  private static LinkedHashMap<Long, bd> tSP = new LinkedHashMap();
  private static HashMap<Long, Boolean> tSQ = new HashMap();
  boolean tSR = false;
  long tSS = 0L;
  boolean tST = false;
  
  private void aat(String paramString)
  {
    if ((this.bAG != null) && (this.bAG.tTq.getContext() != null))
    {
      paramString = Toast.makeText(this.bAG.tTq.getContext(), paramString, 0);
      paramString.setGravity(17, 0, 0);
      paramString.show();
    }
  }
  
  private static void c(int paramInt, bd parambd)
  {
    if (parambd == null) {
      return;
    }
    fm localfm = new fm();
    localfm.bNQ.bNS = 0;
    localfm.bNQ.bNT = 0;
    localfm.bNQ.bNU = 0;
    localfm.bNQ.bNR = 0;
    localfm.bNQ.fileName = parambd.field_imgPath;
    localfm.bNQ.result = paramInt;
    com.tencent.mm.sdk.b.a.sFg.m(localfm);
  }
  
  private void c(long paramLong, bd parambd)
  {
    try
    {
      tSP.put(Long.valueOf(paramLong), parambd);
      return;
    }
    finally
    {
      parambd = finally;
      throw parambd;
    }
  }
  
  private void cwg()
  {
    try
    {
      tSP.clear();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  private void cwj()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 70	com/tencent/mm/ui/chatting/b/ak:bAG	Lcom/tencent/mm/ui/chatting/c/a;
    //   6: ifnull +27 -> 33
    //   9: invokestatic 177	com/tencent/mm/ui/chatting/c/a:cwt	()Lcom/tencent/mm/sdk/platformtools/ag;
    //   12: astore_1
    //   13: aload_1
    //   14: ifnull +16 -> 30
    //   17: aload_1
    //   18: new 179	com/tencent/mm/ui/chatting/b/ak$2
    //   21: dup
    //   22: aload_0
    //   23: invokespecial 181	com/tencent/mm/ui/chatting/b/ak$2:<init>	(Lcom/tencent/mm/ui/chatting/b/ak;)V
    //   26: invokevirtual 187	com/tencent/mm/sdk/platformtools/ag:post	(Ljava/lang/Runnable;)Z
    //   29: pop
    //   30: aload_0
    //   31: monitorexit
    //   32: return
    //   33: aconst_null
    //   34: astore_1
    //   35: goto -22 -> 13
    //   38: astore_1
    //   39: aload_0
    //   40: monitorexit
    //   41: aload_1
    //   42: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	43	0	this	ak
    //   12	23	1	localag	com.tencent.mm.sdk.platformtools.ag
    //   38	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	13	38	finally
    //   17	30	38	finally
  }
  
  private void gB(long paramLong)
  {
    try
    {
      tSN.remove(Long.valueOf(paramLong));
      tSO.remove(Long.valueOf(paramLong));
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private bd gE(long paramLong)
  {
    try
    {
      bd localbd = (bd)tSP.get(Long.valueOf(paramLong));
      return localbd;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void gF(long paramLong)
  {
    try
    {
      if (tSP.containsKey(Long.valueOf(paramLong))) {
        tSP.remove(Long.valueOf(paramLong));
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void gH(long paramLong)
  {
    try
    {
      tSQ.put(Long.valueOf(paramLong), Boolean.valueOf(false));
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private Context getContext()
  {
    if (this.bAG != null) {
      return this.bAG.tTq.getContext();
    }
    return com.tencent.mm.sdk.platformtools.ad.getContext();
  }
  
  private void notifyDataSetChanged()
  {
    if (this.bAG != null) {
      this.bAG.avj();
    }
  }
  
  public final void a(long paramLong, String paramString, ChattingItemTranslate.b paramb)
  {
    try
    {
      tSN.put(Long.valueOf(paramLong), paramString);
      tSO.put(Long.valueOf(paramLong), paramb);
      if (paramb == ChattingItemTranslate.b.ues) {
        tSQ.put(Long.valueOf(paramLong), Boolean.valueOf(true));
      }
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final void cpK()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TransformComponent", "[onChattingExitAnimStart]");
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TransformComponent", "clear VoiceTransTextAct");
    cwg();
    if (this.tSR)
    {
      fi localfi = new fi();
      localfi.bNF.bNI = 3;
      com.tencent.mm.sdk.b.a.sFg.m(localfi);
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TransformComponent", "alvinluo hide transformText");
    com.tencent.mm.sdk.f.e.post(new ak.3(this), "UnsetTransformFlag");
  }
  
  /* Error */
  public final bd cwf()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic 40	com/tencent/mm/ui/chatting/b/ak:tSP	Ljava/util/LinkedHashMap;
    //   5: invokevirtual 268	java/util/LinkedHashMap:entrySet	()Ljava/util/Set;
    //   8: invokeinterface 274 1 0
    //   13: astore_1
    //   14: aload_1
    //   15: invokeinterface 280 1 0
    //   20: ifeq +25 -> 45
    //   23: aload_1
    //   24: invokeinterface 284 1 0
    //   29: checkcast 286	java/util/Map$Entry
    //   32: invokeinterface 289 1 0
    //   37: checkcast 198	com/tencent/mm/storage/bd
    //   40: astore_1
    //   41: aload_0
    //   42: monitorexit
    //   43: aload_1
    //   44: areturn
    //   45: aconst_null
    //   46: astore_1
    //   47: goto -6 -> 41
    //   50: astore_1
    //   51: aload_0
    //   52: monitorexit
    //   53: aload_1
    //   54: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	55	0	this	ak
    //   13	34	1	localObject1	Object
    //   50	4	1	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   2	41	50	finally
  }
  
  public final boolean cwh()
  {
    au.HU();
    return !((Boolean)com.tencent.mm.model.c.DT().get(75, Boolean.valueOf(false))).booleanValue();
  }
  
  public final void cwi()
  {
    au.HU();
    com.tencent.mm.model.c.DT().set(75, Boolean.valueOf(true));
  }
  
  public final void e(bd parambd, boolean paramBoolean)
  {
    int i = 2;
    if (parambd == null)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.TransformComponent", "go VoiceTransTextAct need MsgInfo but null");
      return;
    }
    if (gG(parambd.field_msgId))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TransformComponent", "go VoiceTransTextAct unsetflag MsgId:%s,isVoiceTransforming:%s", new Object[] { Long.valueOf(parambd.field_msgId), Boolean.valueOf(this.tSR) });
      parambd.cmD();
      gH(parambd.field_msgId);
      notifyDataSetChanged();
      return;
    }
    if ((gD(parambd.field_msgId)) && (paramBoolean))
    {
      if (gC(parambd.field_msgId) == ChattingItemTranslate.b.ueq)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TransformComponent", "go VoiceTransTextAct unsetflag removeCache");
        gF(parambd.field_msgId);
        gB(parambd.field_msgId);
        c(5, parambd);
      }
      for (;;)
      {
        notifyDataSetChanged();
        return;
        if (this.tSR)
        {
          localObject = new fi();
          ((fi)localObject).bNF.bNI = 3;
          com.tencent.mm.sdk.b.a.sFg.m((b)localObject);
          gF(parambd.field_msgId);
          gB(parambd.field_msgId);
          parambd.cmD();
          au.HU();
          com.tencent.mm.model.c.FT().a(parambd.field_msgId, parambd);
          cwj();
        }
      }
    }
    Object localObject = m.TJ().Zs(parambd.field_imgPath);
    if ((localObject != null) && (!bi.oW(((bx)localObject).field_content)))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TransformComponent", "alvinluo VoiceTransformText has TransContent MsgId:%s, clientMsgId: %s", new Object[] { Long.valueOf(parambd.field_msgId), parambd.field_imgPath });
      parambd.cmE();
      a(parambd.field_msgId, ((bx)localObject).field_content, ChattingItemTranslate.b.ues);
      au.HU();
      com.tencent.mm.model.c.FT().a(parambd.field_msgId, parambd);
      return;
    }
    int j = au.DF().Lg();
    if ((j != 4) && (j != 6))
    {
      h.i(getContext(), R.l.chatting_transform_network_unavailable, R.l.app_tip);
      c(2, parambd);
      return;
    }
    if (this.tSR)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TransformComponent", "go VoiceTransformText insert transformQueue");
      c(parambd.field_msgId, parambd);
      a(parambd.field_msgId, "", ChattingItemTranslate.b.ueq);
      notifyDataSetChanged();
      return;
    }
    localObject = new fi();
    ((fi)localObject).bNF.bNI = 1;
    com.tencent.mm.sdk.b.a.sFg.m((b)localObject);
    localObject = new fi();
    ((fi)localObject).bNF.bNH = String.valueOf(parambd.field_msgId);
    ((fi)localObject).bNF.fileName = parambd.field_imgPath;
    ((fi)localObject).bNF.bJu = 1;
    ((fi)localObject).bNF.bNI = 0;
    fi.a locala = ((fi)localObject).bNF;
    if (s.hf(this.bAG.getTalkerUserName()))
    {
      paramBoolean = ((com.tencent.mm.ui.chatting.b.b.c)this.bAG.O(com.tencent.mm.ui.chatting.b.b.c.class)).cus();
      if (((com.tencent.mm.ui.chatting.b.b.c)this.bAG.O(com.tencent.mm.ui.chatting.b.b.c.class)).cur()) {
        if (paramBoolean) {
          i = 5;
        }
      }
    }
    for (;;)
    {
      locala.scene = i;
      ((fi)localObject).bNF.bNJ = new ak.1(this, (fi)localObject);
      a(Long.valueOf(((fi)localObject).bNF.bNH).longValue(), "", ChattingItemTranslate.b.uer);
      c(parambd.field_msgId, parambd);
      this.tSR = true;
      notifyDataSetChanged();
      if (!com.tencent.mm.sdk.b.a.sFg.m((b)localObject)) {
        break;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TransformComponent", "go VoiceTransTextAct publish ExtTranslateVoiceEvent");
      return;
      i = 4;
      continue;
      if (com.tencent.mm.ac.f.kL(this.bAG.getTalkerUserName()))
      {
        i = 3;
      }
      else if (com.tencent.mm.ac.f.kM(this.bAG.getTalkerUserName()))
      {
        i = 0;
      }
      else if (com.tencent.mm.ac.f.kI(this.bAG.getTalkerUserName()))
      {
        i = 6;
      }
      else
      {
        i = 7;
        continue;
        if (!s.fq(this.bAG.getTalkerUserName())) {
          i = 1;
        }
      }
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TransformComponent", "go VoiceTransTextAct publish ExtTranslateVoiceEvent fail");
    aat(getContext().getString(R.l.chatting_transform_fail));
    gB(Long.valueOf(((fi)localObject).bNF.bNH).longValue());
    gF(Long.valueOf(((fi)localObject).bNF.bNH).longValue());
    this.tSR = false;
    cwj();
  }
  
  public final ChattingItemTranslate.b gC(long paramLong)
  {
    try
    {
      ChattingItemTranslate.b localb2 = (ChattingItemTranslate.b)tSO.get(Long.valueOf(paramLong));
      ChattingItemTranslate.b localb1 = localb2;
      if (localb2 == null) {
        localb1 = ChattingItemTranslate.b.uep;
      }
      return localb1;
    }
    finally {}
  }
  
  /* Error */
  public final boolean gD(long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic 40	com/tencent/mm/ui/chatting/b/ak:tSP	Ljava/util/LinkedHashMap;
    //   5: lload_1
    //   6: invokestatic 162	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   9: invokevirtual 202	java/util/LinkedHashMap:containsKey	(Ljava/lang/Object;)Z
    //   12: istore_3
    //   13: iload_3
    //   14: ifeq +9 -> 23
    //   17: iconst_1
    //   18: istore_3
    //   19: aload_0
    //   20: monitorexit
    //   21: iload_3
    //   22: ireturn
    //   23: iconst_0
    //   24: istore_3
    //   25: goto -6 -> 19
    //   28: astore 4
    //   30: aload_0
    //   31: monitorexit
    //   32: aload 4
    //   34: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	35	0	this	ak
    //   0	35	1	paramLong	long
    //   12	13	3	bool	boolean
    //   28	5	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	13	28	finally
  }
  
  /* Error */
  public final boolean gG(long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic 42	com/tencent/mm/ui/chatting/b/ak:tSQ	Ljava/util/HashMap;
    //   5: lload_1
    //   6: invokestatic 162	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   9: invokevirtual 505	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   12: checkcast 206	java/lang/Boolean
    //   15: astore 4
    //   17: aload 4
    //   19: ifnull +13 -> 32
    //   22: aload 4
    //   24: invokevirtual 310	java/lang/Boolean:booleanValue	()Z
    //   27: istore_3
    //   28: aload_0
    //   29: monitorexit
    //   30: iload_3
    //   31: ireturn
    //   32: iconst_0
    //   33: istore_3
    //   34: goto -6 -> 28
    //   37: astore 4
    //   39: aload_0
    //   40: monitorexit
    //   41: aload 4
    //   43: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	44	0	this	ak
    //   0	44	1	paramLong	long
    //   27	7	3	bool	boolean
    //   15	8	4	localBoolean	Boolean
    //   37	5	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	17	37	finally
    //   22	28	37	finally
  }
  
  public final String w(long paramLong, String paramString)
  {
    try
    {
      String str2 = (String)tSN.get(Long.valueOf(paramLong));
      String str1 = str2;
      if (bi.oW(str2))
      {
        paramString = m.TJ().Zs(paramString);
        str1 = str2;
        if (paramString != null)
        {
          str1 = str2;
          if (!bi.oW(paramString.field_content)) {
            str1 = paramString.field_content;
          }
        }
      }
      return str1;
    }
    finally {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/chatting/b/ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */