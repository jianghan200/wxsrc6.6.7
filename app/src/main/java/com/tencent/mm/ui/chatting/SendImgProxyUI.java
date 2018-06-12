package com.tencent.mm.ui.chatting;

import android.os.Bundle;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ak.o;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.hardcoder.HardCoderJNI;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.ak;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import java.util.ArrayList;

public class SendImgProxyUI
  extends MMBaseActivity
{
  private static boolean bgH = false;
  private p guT = null;
  
  /* Error */
  private static ArrayList<String> a(ArrayList<String> paramArrayList1, int paramInt, ArrayList<String> paramArrayList2, boolean paramBoolean)
  {
    // Byte code:
    //   0: new 25	java/util/ArrayList
    //   3: dup
    //   4: invokespecial 26	java/util/ArrayList:<init>	()V
    //   7: astore 6
    //   9: aload_0
    //   10: ifnull +194 -> 204
    //   13: aload_0
    //   14: invokevirtual 30	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   17: astore 7
    //   19: aload 7
    //   21: invokeinterface 36 1 0
    //   26: ifeq +178 -> 204
    //   29: aload 7
    //   31: invokeinterface 40 1 0
    //   36: checkcast 42	java/lang/String
    //   39: astore 8
    //   41: aload 8
    //   43: invokevirtual 46	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   46: ldc 48
    //   48: invokevirtual 52	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   51: ifeq +111 -> 162
    //   54: aconst_null
    //   55: astore 5
    //   57: aload 8
    //   59: invokestatic 58	com/tencent/mm/modelsfs/FileOp:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   62: astore_0
    //   63: aload_0
    //   64: astore 5
    //   66: aload_0
    //   67: invokestatic 64	com/tencent/mm/sdk/platformtools/MMBitmapFactory:checkIsImageLegal	(Ljava/io/InputStream;)Z
    //   70: ifeq +33 -> 103
    //   73: aload_0
    //   74: astore 5
    //   76: aload 8
    //   78: invokestatic 70	com/tencent/mm/a/e:cm	(Ljava/lang/String;)I
    //   81: istore 4
    //   83: iload_3
    //   84: ifne +34 -> 118
    //   87: iload 4
    //   89: iload_1
    //   90: if_icmple +28 -> 118
    //   93: aload_0
    //   94: astore 5
    //   96: aload_2
    //   97: aload 8
    //   99: invokevirtual 74	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   102: pop
    //   103: aload_0
    //   104: ifnull -85 -> 19
    //   107: aload_0
    //   108: invokevirtual 79	java/io/InputStream:close	()V
    //   111: goto -92 -> 19
    //   114: astore_0
    //   115: goto -96 -> 19
    //   118: aload_0
    //   119: astore 5
    //   121: aload 6
    //   123: aload 8
    //   125: invokevirtual 74	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   128: pop
    //   129: goto -26 -> 103
    //   132: astore 5
    //   134: aload_0
    //   135: ifnull -116 -> 19
    //   138: aload_0
    //   139: invokevirtual 79	java/io/InputStream:close	()V
    //   142: goto -123 -> 19
    //   145: astore_0
    //   146: goto -127 -> 19
    //   149: astore_0
    //   150: aload 5
    //   152: ifnull +8 -> 160
    //   155: aload 5
    //   157: invokevirtual 79	java/io/InputStream:close	()V
    //   160: aload_0
    //   161: athrow
    //   162: aload 8
    //   164: invokestatic 70	com/tencent/mm/a/e:cm	(Ljava/lang/String;)I
    //   167: istore 4
    //   169: iload_3
    //   170: ifne +19 -> 189
    //   173: iload 4
    //   175: iload_1
    //   176: if_icmple +13 -> 189
    //   179: aload_2
    //   180: aload 8
    //   182: invokevirtual 74	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   185: pop
    //   186: goto -167 -> 19
    //   189: aload 6
    //   191: aload 8
    //   193: invokevirtual 74	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   196: pop
    //   197: goto -178 -> 19
    //   200: astore_2
    //   201: goto -41 -> 160
    //   204: aload 6
    //   206: areturn
    //   207: astore_0
    //   208: aconst_null
    //   209: astore_0
    //   210: goto -76 -> 134
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	213	0	paramArrayList1	ArrayList<String>
    //   0	213	1	paramInt	int
    //   0	213	2	paramArrayList2	ArrayList<String>
    //   0	213	3	paramBoolean	boolean
    //   81	96	4	i	int
    //   55	65	5	localArrayList	ArrayList<String>
    //   132	24	5	localException	Exception
    //   7	198	6	localArrayList1	ArrayList
    //   17	13	7	localIterator	java.util.Iterator
    //   39	153	8	str	String
    // Exception table:
    //   from	to	target	type
    //   107	111	114	java/lang/Exception
    //   66	73	132	java/lang/Exception
    //   76	83	132	java/lang/Exception
    //   96	103	132	java/lang/Exception
    //   121	129	132	java/lang/Exception
    //   138	142	145	java/lang/Exception
    //   57	63	149	finally
    //   66	73	149	finally
    //   76	83	149	finally
    //   96	103	149	finally
    //   121	129	149	finally
    //   155	160	200	java/lang/Exception
    //   57	63	207	java/lang/Exception
  }
  
  private static void g(ArrayList<Integer> paramArrayList, ArrayList<String> paramArrayList1)
  {
    if (paramArrayList.size() != paramArrayList1.size()) {
      x.e("MicroMsg.SendImgProxyUI", "[insertErrMsg] WTF");
    }
    for (;;)
    {
      return;
      int i = 0;
      while (i < paramArrayList1.size())
      {
        int j = ((Integer)paramArrayList.get(i)).intValue();
        Object localObject = o.Pf().hQ(j);
        int k = com.tencent.mm.a.e.cm((String)paramArrayList1.get(i));
        ((com.tencent.mm.ak.e)localObject).setOffset(k);
        ((com.tencent.mm.ak.e)localObject).hL(k);
        o.Pf().a(j, (com.tencent.mm.ak.e)localObject);
        long l = ((com.tencent.mm.ak.e)localObject).dTS;
        x.i("MicroMsg.SendImgProxyUI", "[insertErrMsg] msgLocalId:%s oriImgLocalId:%s", new Object[] { Long.valueOf(l), Integer.valueOf(j) });
        localObject = ((i)com.tencent.mm.kernel.g.l(i.class)).bcY().dW(l);
        ((bd)localObject).setStatus(5);
        ((bd)localObject).eC(256);
        ((i)com.tencent.mm.kernel.g.l(i.class)).bcY().a(l, (bd)localObject);
        x.i("MicroMsg.SendImgProxyUI", "after update msgInfo, localId[%d] svrId[%d] talker[%s] type[%d] isSend[%d] imgPath[%s], status[%d] createTime[%d]", new Object[] { Long.valueOf(((cm)localObject).field_msgId), Long.valueOf(((cm)localObject).field_msgSvrId), ((cm)localObject).field_talker, Integer.valueOf(((bd)localObject).getType()), Integer.valueOf(((cm)localObject).field_isSend), ((cm)localObject).field_imgPath, Integer.valueOf(((cm)localObject).field_status), Long.valueOf(((cm)localObject).field_createTime) });
        i += 1;
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    int i = 0;
    super.onCreate(paramBundle);
    overridePendingTransition(0, 0);
    ak.a(getWindow());
    x.i("MicroMsg.SendImgProxyUI", "onCreate isRunning:%b ,%d", new Object[] { Boolean.valueOf(bgH), Integer.valueOf(hashCode()) });
    if (bgH)
    {
      x.w("MicroMsg.SendImgProxyUI", "duplicate instance");
      finish();
      return;
    }
    bgH = true;
    setContentView(R.i.background_transparent);
    this.guT = h.a(this, getString(R.l.main_sending), false, null);
    boolean bool1 = ao.isWifi(this);
    boolean bool2 = HardCoderJNI.hcSendPicMsgEnable;
    int j = HardCoderJNI.hcSendPicMsgDelay;
    int k = HardCoderJNI.hcSendPicMsgCPU;
    int m = HardCoderJNI.hcSendPicMsgIO;
    if (HardCoderJNI.hcSendPicMsgThr) {
      i = com.tencent.mm.kernel.g.Em().cij();
    }
    i = HardCoderJNI.startPerformance(bool2, j, k, m, i, HardCoderJNI.hcSendPicMsgTimeout, 203, HardCoderJNI.hcSendPicMsgAction, "MicroMsg.SendImgProxyUI");
    au.Em().H(new SendImgProxyUI.1(this, bool1, i));
  }
  
  protected void onDestroy()
  {
    x.i("MicroMsg.SendImgProxyUI", "onDestroy isRunning:%b , %d", new Object[] { Boolean.valueOf(bgH), Integer.valueOf(hashCode()) });
    super.onDestroy();
  }
  
  public void onResume()
  {
    x.i("MicroMsg.SendImgProxyUI", "onResume isRunning:%b ,%d", new Object[] { Boolean.valueOf(bgH), Integer.valueOf(hashCode()) });
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/chatting/SendImgProxyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */