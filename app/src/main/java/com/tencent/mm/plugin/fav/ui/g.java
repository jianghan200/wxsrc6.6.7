package com.tencent.mm.plugin.fav.ui;

import android.graphics.Bitmap.CompressFormat;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.protocal.c.wl;
import com.tencent.mm.protocal.c.wr;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.c;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class g
{
  static void E(com.tencent.mm.plugin.fav.a.g paramg)
  {
    String str = q.GF();
    wr localwr = new wr();
    localwr.Vw(str);
    localwr.Vx(str);
    localwr.CO(paramg.field_sourceType);
    localwr.fU(bi.VF());
    paramg.field_favProto.a(localwr);
    paramg.field_fromUser = localwr.bSS;
    paramg.field_toUser = localwr.toUser;
  }
  
  public static com.tencent.mm.plugin.fav.a.g a(LinkedList<vx> paramLinkedList, long paramLong)
  {
    Object localObject1 = null;
    if (paramLong != -1L)
    {
      localObject2 = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(paramLong);
      localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject1 = new com.tencent.mm.plugin.fav.a.g();
        ((com.tencent.mm.plugin.fav.a.g)localObject1).field_type = 18;
        ((com.tencent.mm.plugin.fav.a.g)localObject1).field_sourceType = 6;
        localObject2 = q.GF();
        wr localwr = new wr();
        localwr.Vw((String)localObject2);
        localwr.Vx((String)localObject2);
        localwr.CO(((com.tencent.mm.plugin.fav.a.g)localObject1).field_sourceType);
        localwr.fU(bi.VF());
        ((com.tencent.mm.plugin.fav.a.g)localObject1).field_favProto.a(localwr);
        ((com.tencent.mm.plugin.fav.a.g)localObject1).field_fromUser = localwr.bSS;
        ((com.tencent.mm.plugin.fav.a.g)localObject1).field_toUser = localwr.toUser;
        ((com.tencent.mm.plugin.fav.a.g)localObject1).field_favProto.CN(1);
        ((com.tencent.mm.plugin.fav.a.g)localObject1).field_favProto.CM(127);
        ((com.tencent.mm.plugin.fav.a.g)localObject1).field_edittime = bi.VE();
        ((com.tencent.mm.plugin.fav.a.g)localObject1).field_updateTime = bi.VF();
        ((com.tencent.mm.plugin.fav.a.g)localObject1).field_favProto.fT(((com.tencent.mm.plugin.fav.a.g)localObject1).field_edittime);
        ((com.tencent.mm.plugin.fav.a.g)localObject1).field_favProto.rBG.fU(bi.VF());
        ((com.tencent.mm.plugin.fav.a.g)localObject1).field_itemStatus = 9;
        ((com.tencent.mm.plugin.fav.a.g)localObject1).field_localId = paramLong;
        ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().y((com.tencent.mm.plugin.fav.a.g)localObject1);
      }
      ((com.tencent.mm.plugin.fav.a.g)localObject1).field_favProto.rBI.clear();
    }
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject2 = new com.tencent.mm.plugin.fav.a.g();
      ((com.tencent.mm.plugin.fav.a.g)localObject2).field_type = 18;
      ((com.tencent.mm.plugin.fav.a.g)localObject2).field_sourceType = 6;
      E((com.tencent.mm.plugin.fav.a.g)localObject2);
      ((com.tencent.mm.plugin.fav.a.g)localObject2).field_favProto.CN(1);
      ((com.tencent.mm.plugin.fav.a.g)localObject2).field_favProto.CM(127);
    }
    ((com.tencent.mm.plugin.fav.a.g)localObject2).field_edittime = bi.VE();
    ((com.tencent.mm.plugin.fav.a.g)localObject2).field_updateTime = bi.VF();
    ((com.tencent.mm.plugin.fav.a.g)localObject2).field_favProto.fT(((com.tencent.mm.plugin.fav.a.g)localObject2).field_edittime);
    ((com.tencent.mm.plugin.fav.a.g)localObject2).field_favProto.rBG.fU(bi.VF());
    ((com.tencent.mm.plugin.fav.a.g)localObject2).field_favProto.ar(paramLinkedList);
    return (com.tencent.mm.plugin.fav.a.g)localObject2;
  }
  
  public static boolean a(String paramString, LinkedList<vx> paramLinkedList, long paramLong)
  {
    if (paramString.length() == 0)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.FavPostLogic", "postNote null");
      return false;
    }
    if (-1L == paramLong) {}
    for (paramString = a(paramLinkedList, paramLong);; paramString = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(paramLong))
    {
      b.B(paramString);
      return true;
    }
  }
  
  /* Error */
  private static List<String> bd(List<String> paramList)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +12 -> 13
    //   4: aload_0
    //   5: invokeinterface 180 1 0
    //   10: ifne +5 -> 15
    //   13: aload_0
    //   14: areturn
    //   15: new 182	java/util/ArrayList
    //   18: dup
    //   19: invokespecial 183	java/util/ArrayList:<init>	()V
    //   22: astore_2
    //   23: new 185	com/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger
    //   26: dup
    //   27: invokespecial 186	com/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger:<init>	()V
    //   30: astore_3
    //   31: aload_0
    //   32: invokeinterface 190 1 0
    //   37: astore 4
    //   39: aload 4
    //   41: invokeinterface 196 1 0
    //   46: ifeq +115 -> 161
    //   49: aload 4
    //   51: invokeinterface 200 1 0
    //   56: checkcast 149	java/lang/String
    //   59: astore 5
    //   61: aconst_null
    //   62: astore_1
    //   63: aload 5
    //   65: invokestatic 206	com/tencent/mm/vfs/d:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   68: astore_0
    //   69: aload_0
    //   70: ifnonnull +10 -> 80
    //   73: aload_0
    //   74: invokestatic 210	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   77: goto -38 -> 39
    //   80: aload_0
    //   81: astore_1
    //   82: aload_0
    //   83: aload_3
    //   84: invokestatic 216	com/tencent/mm/sdk/platformtools/MMBitmapFactory:checkIsImageLegal	(Ljava/io/InputStream;Lcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;)Z
    //   87: ifeq +21 -> 108
    //   90: aload_0
    //   91: astore_1
    //   92: aload_2
    //   93: aload 5
    //   95: invokeinterface 220 2 0
    //   100: pop
    //   101: aload_0
    //   102: invokestatic 210	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   105: goto -66 -> 39
    //   108: aload_0
    //   109: astore_1
    //   110: aload_3
    //   111: invokevirtual 223	com/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger:getDecodeResult	()I
    //   114: sipush 2000
    //   117: if_icmplt -16 -> 101
    //   120: aload_0
    //   121: astore_1
    //   122: aload_0
    //   123: iconst_5
    //   124: aload_3
    //   125: invokestatic 229	com/tencent/mm/sdk/platformtools/MMBitmapFactory$KVStatHelper:getKVStatString	(Ljava/lang/Object;ILcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;)Ljava/lang/String;
    //   128: astore 5
    //   130: aload_0
    //   131: astore_1
    //   132: getstatic 235	com/tencent/mm/plugin/report/service/h:mEJ	Lcom/tencent/mm/plugin/report/service/h;
    //   135: sipush 12712
    //   138: aload 5
    //   140: invokevirtual 239	com/tencent/mm/plugin/report/service/h:k	(ILjava/lang/String;)V
    //   143: goto -42 -> 101
    //   146: astore_1
    //   147: aload_0
    //   148: invokestatic 210	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   151: goto -112 -> 39
    //   154: astore_0
    //   155: aload_1
    //   156: invokestatic 210	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   159: aload_0
    //   160: athrow
    //   161: aload_2
    //   162: areturn
    //   163: astore_0
    //   164: aconst_null
    //   165: astore_0
    //   166: goto -19 -> 147
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	169	0	paramList	List<String>
    //   62	70	1	localList	List<String>
    //   146	10	1	localException	Exception
    //   22	140	2	localArrayList	java.util.ArrayList
    //   30	95	3	localDecodeResultLogger	com.tencent.mm.sdk.platformtools.MMBitmapFactory.DecodeResultLogger
    //   37	13	4	localIterator	Iterator
    //   59	80	5	str	String
    // Exception table:
    //   from	to	target	type
    //   82	90	146	java/lang/Exception
    //   92	101	146	java/lang/Exception
    //   110	120	146	java/lang/Exception
    //   122	130	146	java/lang/Exception
    //   132	143	146	java/lang/Exception
    //   63	69	154	finally
    //   82	90	154	finally
    //   92	101	154	finally
    //   110	120	154	finally
    //   122	130	154	finally
    //   132	143	154	finally
    //   63	69	163	java/lang/Exception
  }
  
  public static boolean be(List<String> paramList)
  {
    paramList = bd(paramList);
    if ((paramList == null) || (paramList.size() == 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.FavPostLogic", "postImgs path null");
      return false;
    }
    com.tencent.mm.plugin.fav.a.g localg = new com.tencent.mm.plugin.fav.a.g();
    localg.field_type = 2;
    localg.field_sourceType = 6;
    E(localg);
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      vx localvx = new vx();
      localvx.UP(str);
      localvx.UO(com.tencent.mm.plugin.fav.a.b.bm(localvx.toString(), 2));
      c.c(str, 150, 150, Bitmap.CompressFormat.JPEG, 90, com.tencent.mm.plugin.fav.a.b.c(localvx));
      localvx.UQ(com.tencent.mm.plugin.fav.a.b.c(localvx));
      localvx.CF(2);
      localg.field_favProto.rBI.add(localvx);
    }
    b.B(localg);
    h.mEJ.h(10648, new Object[] { Integer.valueOf(2), Integer.valueOf(paramList.size()) });
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/fav/ui/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */