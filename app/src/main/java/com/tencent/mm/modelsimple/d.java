package com.tencent.mm.modelsimple;

import android.graphics.BitmapFactory.Options;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bmz;
import com.tencent.mm.protocal.c.bnb;
import com.tencent.mm.protocal.c.bnc;
import com.tencent.mm.protocal.c.ok;
import com.tencent.mm.protocal.c.ol;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.xweb.util.c;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class d
  extends l
  implements k
{
  private b dZf;
  private com.tencent.mm.ab.e diJ;
  private List<String> eeX;
  private String eeY;
  private int type;
  
  public d(int paramInt, List<String> paramList, String paramString)
  {
    this.type = paramInt;
    this.eeX = paramList;
    this.eeY = paramString;
  }
  
  /* Error */
  private void T(List<String> paramList)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 37	com/tencent/mm/modelsimple/d:dZf	Lcom/tencent/mm/ab/b;
    //   4: getfield 43	com/tencent/mm/ab/b:dID	Lcom/tencent/mm/ab/b$b;
    //   7: getfield 49	com/tencent/mm/ab/b$b:dIL	Lcom/tencent/mm/bk/a;
    //   10: checkcast 51	com/tencent/mm/protocal/c/ok
    //   13: astore 7
    //   15: aload 7
    //   17: iconst_3
    //   18: putfield 54	com/tencent/mm/protocal/c/ok:hcE	I
    //   21: invokestatic 60	java/lang/System:currentTimeMillis	()J
    //   24: lstore_3
    //   25: aload_1
    //   26: invokeinterface 66 1 0
    //   31: astore 8
    //   33: aload 8
    //   35: invokeinterface 72 1 0
    //   40: ifeq +271 -> 311
    //   43: aload 8
    //   45: invokeinterface 76 1 0
    //   50: checkcast 78	java/lang/String
    //   53: astore 9
    //   55: ldc 80
    //   57: ldc 82
    //   59: iconst_1
    //   60: anewarray 84	java/lang/Object
    //   63: dup
    //   64: iconst_0
    //   65: aload 9
    //   67: aastore
    //   68: invokestatic 90	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   71: new 92	com/tencent/mm/protocal/c/bnd
    //   74: dup
    //   75: invokespecial 93	com/tencent/mm/protocal/c/bnd:<init>	()V
    //   78: astore 10
    //   80: new 95	android/media/MediaMetadataRetriever
    //   83: dup
    //   84: invokespecial 96	android/media/MediaMetadataRetriever:<init>	()V
    //   87: astore 5
    //   89: aload 5
    //   91: astore_1
    //   92: aload 5
    //   94: aload 9
    //   96: invokevirtual 100	android/media/MediaMetadataRetriever:setDataSource	(Ljava/lang/String;)V
    //   99: aload 5
    //   101: astore_1
    //   102: aload 5
    //   104: bipush 9
    //   106: invokevirtual 104	android/media/MediaMetadataRetriever:extractMetadata	(I)Ljava/lang/String;
    //   109: iconst_m1
    //   110: invokestatic 110	com/tencent/mm/sdk/platformtools/bi:getInt	(Ljava/lang/String;I)I
    //   113: istore_2
    //   114: aload 5
    //   116: astore_1
    //   117: ldc 80
    //   119: ldc 112
    //   121: iconst_1
    //   122: anewarray 84	java/lang/Object
    //   125: dup
    //   126: iconst_0
    //   127: iload_2
    //   128: invokestatic 118	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   131: aastore
    //   132: invokestatic 90	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   135: aload 5
    //   137: astore_1
    //   138: aload 10
    //   140: iload_2
    //   141: putfield 121	com/tencent/mm/protocal/c/bnd:slf	I
    //   144: aload 5
    //   146: invokevirtual 124	android/media/MediaMetadataRetriever:release	()V
    //   149: aload 10
    //   151: new 126	java/io/File
    //   154: dup
    //   155: aload 9
    //   157: invokespecial 128	java/io/File:<init>	(Ljava/lang/String;)V
    //   160: invokestatic 134	com/tencent/xweb/util/c:m	(Ljava/io/File;)Ljava/lang/String;
    //   163: putfield 137	com/tencent/mm/protocal/c/bnd:rwt	Ljava/lang/String;
    //   166: aload 7
    //   168: getfield 141	com/tencent/mm/protocal/c/ok:rsJ	Ljava/util/LinkedList;
    //   171: aload 10
    //   173: invokevirtual 147	java/util/LinkedList:add	(Ljava/lang/Object;)Z
    //   176: pop
    //   177: goto -144 -> 33
    //   180: astore_1
    //   181: ldc 80
    //   183: aload_1
    //   184: ldc -107
    //   186: iconst_1
    //   187: anewarray 84	java/lang/Object
    //   190: dup
    //   191: iconst_0
    //   192: aload_1
    //   193: invokevirtual 153	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   196: aastore
    //   197: invokestatic 157	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   200: goto -51 -> 149
    //   203: astore 6
    //   205: aconst_null
    //   206: astore 5
    //   208: aload 5
    //   210: astore_1
    //   211: ldc 80
    //   213: aload 6
    //   215: ldc -97
    //   217: iconst_2
    //   218: anewarray 84	java/lang/Object
    //   221: dup
    //   222: iconst_0
    //   223: aload 9
    //   225: aastore
    //   226: dup
    //   227: iconst_1
    //   228: aload 6
    //   230: invokevirtual 153	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   233: aastore
    //   234: invokestatic 157	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   237: aload 5
    //   239: ifnull -90 -> 149
    //   242: aload 5
    //   244: invokevirtual 124	android/media/MediaMetadataRetriever:release	()V
    //   247: goto -98 -> 149
    //   250: astore_1
    //   251: ldc 80
    //   253: aload_1
    //   254: ldc -107
    //   256: iconst_1
    //   257: anewarray 84	java/lang/Object
    //   260: dup
    //   261: iconst_0
    //   262: aload_1
    //   263: invokevirtual 153	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   266: aastore
    //   267: invokestatic 157	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   270: goto -121 -> 149
    //   273: astore 5
    //   275: aconst_null
    //   276: astore_1
    //   277: aload_1
    //   278: ifnull +7 -> 285
    //   281: aload_1
    //   282: invokevirtual 124	android/media/MediaMetadataRetriever:release	()V
    //   285: aload 5
    //   287: athrow
    //   288: astore_1
    //   289: ldc 80
    //   291: aload_1
    //   292: ldc -107
    //   294: iconst_1
    //   295: anewarray 84	java/lang/Object
    //   298: dup
    //   299: iconst_0
    //   300: aload_1
    //   301: invokevirtual 153	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   304: aastore
    //   305: invokestatic 157	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   308: goto -23 -> 285
    //   311: ldc 80
    //   313: ldc -95
    //   315: iconst_1
    //   316: anewarray 84	java/lang/Object
    //   319: dup
    //   320: iconst_0
    //   321: invokestatic 60	java/lang/System:currentTimeMillis	()J
    //   324: lload_3
    //   325: lsub
    //   326: invokestatic 166	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   329: aastore
    //   330: invokestatic 90	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   333: return
    //   334: astore 5
    //   336: goto -59 -> 277
    //   339: astore 6
    //   341: goto -133 -> 208
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	344	0	this	d
    //   0	344	1	paramList	List<String>
    //   113	28	2	i	int
    //   24	301	3	l	long
    //   87	156	5	localMediaMetadataRetriever	android.media.MediaMetadataRetriever
    //   273	13	5	localObject1	Object
    //   334	1	5	localObject2	Object
    //   203	26	6	localException1	Exception
    //   339	1	6	localException2	Exception
    //   13	154	7	localok	ok
    //   31	13	8	localIterator	Iterator
    //   53	171	9	str	String
    //   78	94	10	localbnd	com.tencent.mm.protocal.c.bnd
    // Exception table:
    //   from	to	target	type
    //   144	149	180	java/lang/Exception
    //   80	89	203	java/lang/Exception
    //   242	247	250	java/lang/Exception
    //   80	89	273	finally
    //   281	285	288	java/lang/Exception
    //   92	99	334	finally
    //   102	114	334	finally
    //   117	135	334	finally
    //   138	144	334	finally
    //   211	237	334	finally
    //   92	99	339	java/lang/Exception
    //   102	114	339	java/lang/Exception
    //   117	135	339	java/lang/Exception
    //   138	144	339	java/lang/Exception
  }
  
  private void U(List<String> paramList)
  {
    ok localok = (ok)this.dZf.dID.dIL;
    localok.hcE = 5;
    long l = System.currentTimeMillis();
    paramList = paramList.iterator();
    if (paramList.hasNext())
    {
      String str = (String)paramList.next();
      x.i("MicroMsg.NetSceneCheckSysShare", "share text %s", new Object[] { str });
      int i = str.indexOf("|");
      bnc localbnc = new bnc();
      if ((i >= 0) && (i + 1 < str.length())) {
        localbnc.bHD = str.substring(0, i);
      }
      for (localbnc.URL = str.substring(i + 1);; localbnc.URL = str)
      {
        localbnc.rwt = c.u(localbnc.URL.getBytes());
        localok.rsM.add(localbnc);
        break;
        localbnc.bHD = "";
      }
    }
    x.i("MicroMsg.NetSceneCheckSysShare", "cost %d ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
  }
  
  private void V(List<String> paramList)
  {
    ok localok = (ok)this.dZf.dID.dIL;
    localok.hcE = 4;
    long l = System.currentTimeMillis();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      Object localObject = (String)paramList.next();
      bmz localbmz = new bmz();
      localObject = new File((String)localObject);
      localbmz.ruE = ((int)((File)localObject).length());
      localbmz.rwt = c.m((File)localObject);
      localok.rsL.add(localbmz);
    }
    x.i("MicroMsg.NetSceneCheckSysShare", "cost %d ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    parame1 = new b.a();
    Object localObject1 = new ok();
    if (!bi.oW(this.eeY)) {
      ((ok)localObject1).rsH = this.eeY;
    }
    parame1.dIG = ((com.tencent.mm.bk.a)localObject1);
    parame1.dIH = new ol();
    parame1.uri = "/cgi-bin/micromsg-bin/checksystemshare";
    parame1.dIF = 837;
    parame1.dII = 0;
    parame1.dIJ = 0;
    this.dZf = parame1.KT();
    switch (this.type)
    {
    }
    for (;;)
    {
      int i = 1;
      if (com.tencent.mm.kernel.g.Eg().Dx()) {
        i = bi.getInt(com.tencent.mm.k.g.AT().getValue("ShareExtCheckSwitch"), 1);
      }
      if (i == 1) {
        break;
      }
      this.diJ.a(0, 0, "need not check", this);
      return 0;
      Object localObject2 = this.eeX;
      parame1 = (ok)this.dZf.dID.dIL;
      parame1.hcE = 1;
      localObject1 = new BitmapFactory.Options();
      ((BitmapFactory.Options)localObject1).inJustDecodeBounds = true;
      long l = System.currentTimeMillis();
      localObject2 = ((List)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        Object localObject3 = (String)((Iterator)localObject2).next();
        x.i("MicroMsg.NetSceneCheckSysShare", "img file %s", new Object[] { localObject3 });
        byte[] arrayOfByte = com.tencent.mm.a.e.e((String)localObject3, 0, -1);
        if ((arrayOfByte != null) && (arrayOfByte.length > 0))
        {
          bnb localbnb = new bnb();
          localbnb.rwt = c.u(arrayOfByte);
          MMBitmapFactory.decodeByteArray(arrayOfByte, 0, arrayOfByte.length, (BitmapFactory.Options)localObject1);
          x.i("MicroMsg.NetSceneCheckSysShare", "decode img, width %d, height: %d", new Object[] { Integer.valueOf(((BitmapFactory.Options)localObject1).outWidth), Integer.valueOf(((BitmapFactory.Options)localObject1).outHeight) });
          localbnb.Width = ((BitmapFactory.Options)localObject1).outWidth;
          localbnb.Height = ((BitmapFactory.Options)localObject1).outHeight;
          localObject3 = new com.tencent.mm.plugin.af.a.a().Kf((String)localObject3);
          if (localObject3 != null)
          {
            x.i("MicroMsg.NetSceneCheckSysShare", "scan qrcode, type %s, result %s, ", new Object[] { ((com.tencent.mm.plugin.af.a.d)localObject3).mji, ((com.tencent.mm.plugin.af.a.d)localObject3).result });
            if (!bi.oW(((com.tencent.mm.plugin.af.a.d)localObject3).mji))
            {
              if ((!((com.tencent.mm.plugin.af.a.d)localObject3).mji.equals("QR_CODE")) && (!((com.tencent.mm.plugin.af.a.d)localObject3).mji.equals("WX_CODE"))) {
                break label492;
              }
              localbnb.siz = ((com.tencent.mm.plugin.af.a.d)localObject3).result;
            }
          }
          for (;;)
          {
            localbnb.sle = ((com.tencent.mm.plugin.af.a.d)localObject3).mji;
            parame1.rsI.add(localbnb);
            break;
            label492:
            i = ((com.tencent.mm.plugin.af.a.d)localObject3).result.indexOf(",");
            if ((i >= 0) && (i + 1 < ((com.tencent.mm.plugin.af.a.d)localObject3).result.length())) {
              localbnb.siz = ((com.tencent.mm.plugin.af.a.d)localObject3).result.substring(i + 1);
            } else {
              localbnb.siz = ((com.tencent.mm.plugin.af.a.d)localObject3).result;
            }
          }
        }
      }
      x.i("MicroMsg.NetSceneCheckSysShare", "cost %d ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      continue;
      T(this.eeX);
      continue;
      U(this.eeX);
      continue;
      V(this.eeX);
    }
    return a(parame, this.dZf, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneCheckSysShare", "errType %d, errCode %d, errMsg", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 837;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/modelsimple/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */