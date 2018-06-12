package com.tencent.mm.ak.a.f;

import android.graphics.Bitmap;
import com.tencent.mm.ak.a.c.a;
import com.tencent.mm.ak.a.c.d;
import com.tencent.mm.ak.a.c.e;
import com.tencent.mm.ak.a.c.f;
import com.tencent.mm.ak.a.c.g;
import com.tencent.mm.ak.a.c.i;
import com.tencent.mm.ak.a.c.j;
import com.tencent.mm.ak.a.c.k;
import com.tencent.mm.ak.a.c.l;
import com.tencent.mm.ak.a.c.m;
import com.tencent.mm.ak.a.c.n;
import com.tencent.mm.ak.a.c.o;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class b
  implements Runnable
{
  private final com.tencent.mm.ak.a.a.b dWS;
  public final com.tencent.mm.ak.a.a.c dXk;
  private final m dXl;
  private final a dXm;
  private final com.tencent.mm.ak.a.c.b dXn;
  private final j dXp;
  private final e dXr;
  private final n dXu;
  private final o dYb;
  private final com.tencent.mm.ak.a.b dYi;
  public final com.tencent.mm.ak.a.c dYk;
  private final ag dYl;
  private final i dYm;
  private final g dYn;
  private final f dYo;
  private final k dYp;
  private final d dYq;
  private final l dYr;
  public final String url;
  
  public b(String paramString, com.tencent.mm.ak.a.c paramc, ag paramag, com.tencent.mm.ak.a.a.c paramc1, i parami, j paramj, com.tencent.mm.ak.a.b paramb, g paramg, e parame, d paramd, l paraml)
  {
    this.url = paramString;
    this.dYk = paramc;
    this.dYl = paramag;
    this.dYi = paramb;
    this.dYn = paramg;
    this.dWS = this.dYi.dWS;
    if (paramc1 == null)
    {
      this.dXk = this.dWS.dXk;
      this.dYm = parami;
      if (paramj != null) {
        break label205;
      }
      this.dXp = this.dWS.dXp;
      label80:
      if (this.dXk.dXn == null) {
        break label214;
      }
      this.dXn = this.dXk.dXn;
      label101:
      this.dYb = this.dXk.dYb;
      this.dXl = this.dWS.dXl;
      this.dXm = this.dWS.dXm;
      this.dYo = this.dWS.dXo;
      this.dYp = this.dWS.dXq;
      if (parame != null) {
        break label228;
      }
    }
    label205:
    label214:
    label228:
    for (this.dXr = this.dWS.dXr;; this.dXr = parame)
    {
      this.dYq = paramd;
      this.dYr = paraml;
      this.dXu = this.dWS.dXu;
      return;
      this.dXk = paramc1;
      break;
      this.dXp = paramj;
      break label80;
      this.dXn = this.dWS.dXn;
      break label101;
    }
  }
  
  private Bitmap a(com.tencent.mm.ak.a.d.b paramb, Bitmap paramBitmap)
  {
    Object localObject = paramBitmap;
    if (this.dYn != null)
    {
      localObject = paramBitmap;
      if (paramb != null)
      {
        paramb.bitmap = paramBitmap;
        localObject = this.dYn;
        String str = this.url;
        this.dYk.getImageView();
        paramb = ((g)localObject).a(str, paramb);
        localObject = paramBitmap;
        if (paramb != null)
        {
          localObject = paramBitmap;
          if (!paramb.isRecycled()) {
            localObject = paramb;
          }
        }
      }
    }
    return (Bitmap)localObject;
  }
  
  private void k(String paramString, Bitmap paramBitmap)
  {
    if (this.dXk.dXw)
    {
      x.d("MicroMsg.imageloader.ImageLoadTask", "[cpan] run. put key %s to memory cache.", new Object[] { this.url });
      this.dXl.d(paramString, paramBitmap);
    }
  }
  
  public final void bv(long paramLong)
  {
    if (this.dXp != null) {
      this.dXp.bv(paramLong);
    }
  }
  
  public final String mg(String paramString)
  {
    if ((bi.oW(paramString)) || (this.dXk == null)) {
      return null;
    }
    String str = paramString;
    if (this.dXk.dXW) {
      str = paramString + "round" + this.dXk.dXX;
    }
    paramString = str;
    if (!bi.oW(this.dXk.dXT)) {
      paramString = str + this.dXk.dXT;
    }
    return paramString + "size" + this.dXk.dXE + this.dXk.dXF;
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 8
    //   3: new 114	com/tencent/mm/ak/a/d/b
    //   6: dup
    //   7: invokespecial 213	com/tencent/mm/ak/a/d/b:<init>	()V
    //   10: astore 10
    //   12: aload 10
    //   14: iconst_1
    //   15: putfield 216	com/tencent/mm/ak/a/d/b:bJu	I
    //   18: aload_0
    //   19: aload_0
    //   20: getfield 51	com/tencent/mm/ak/a/f/b:url	Ljava/lang/String;
    //   23: invokevirtual 218	com/tencent/mm/ak/a/f/b:mg	(Ljava/lang/String;)Ljava/lang/String;
    //   26: astore 13
    //   28: ldc -113
    //   30: ldc -36
    //   32: iconst_1
    //   33: anewarray 4	java/lang/Object
    //   36: dup
    //   37: iconst_0
    //   38: aload_0
    //   39: getfield 51	com/tencent/mm/ak/a/f/b:url	Ljava/lang/String;
    //   42: aastore
    //   43: invokestatic 151	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   46: invokestatic 226	java/lang/System:currentTimeMillis	()J
    //   49: lstore_3
    //   50: aload_0
    //   51: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   54: getfield 229	com/tencent/mm/ak/a/a/c:dXD	I
    //   57: istore_2
    //   58: aload_0
    //   59: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   62: getfield 232	com/tencent/mm/ak/a/a/c:dXG	Z
    //   65: istore 7
    //   67: aload_0
    //   68: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   71: getfield 235	com/tencent/mm/ak/a/a/c:bKg	Ljava/lang/String;
    //   74: astore 14
    //   76: ldc -113
    //   78: new 174	java/lang/StringBuilder
    //   81: dup
    //   82: ldc -19
    //   84: invokespecial 240	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   87: iload 7
    //   89: invokevirtual 243	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   92: invokevirtual 192	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   95: invokestatic 246	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   98: ldc -113
    //   100: ldc -8
    //   102: iconst_1
    //   103: anewarray 4	java/lang/Object
    //   106: dup
    //   107: iconst_0
    //   108: iload_2
    //   109: invokestatic 254	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   112: aastore
    //   113: invokestatic 151	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   116: ldc -113
    //   118: ldc_w 256
    //   121: iconst_2
    //   122: anewarray 4	java/lang/Object
    //   125: dup
    //   126: iconst_0
    //   127: aload_0
    //   128: getfield 53	com/tencent/mm/ak/a/f/b:dYk	Lcom/tencent/mm/ak/a/c;
    //   131: getfield 259	com/tencent/mm/ak/a/c:width	I
    //   134: invokestatic 254	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   137: aastore
    //   138: dup
    //   139: iconst_1
    //   140: aload_0
    //   141: getfield 53	com/tencent/mm/ak/a/f/b:dYk	Lcom/tencent/mm/ak/a/c;
    //   144: getfield 262	com/tencent/mm/ak/a/c:height	I
    //   147: invokestatic 254	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   150: aastore
    //   151: invokestatic 151	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   154: iload_2
    //   155: tableswitch	default:+2349->2504, 1:+317->472, 2:+1273->1428, 3:+1303->1458, 4:+1355->1510, 5:+1046->1201
    //   188: ldc -113
    //   190: ldc_w 264
    //   193: iconst_1
    //   194: anewarray 4	java/lang/Object
    //   197: dup
    //   198: iconst_0
    //   199: iload_2
    //   200: invokestatic 254	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   203: aastore
    //   204: invokestatic 267	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   207: invokestatic 226	java/lang/System:currentTimeMillis	()J
    //   210: lstore 5
    //   212: aload 8
    //   214: ifnull +2293 -> 2507
    //   217: aload 8
    //   219: invokevirtual 135	android/graphics/Bitmap:isRecycled	()Z
    //   222: ifeq +2000 -> 2222
    //   225: goto +2282 -> 2507
    //   228: ldc -113
    //   230: ldc_w 269
    //   233: invokestatic 272	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   236: aload 10
    //   238: astore 9
    //   240: aload 8
    //   242: ifnull +2177 -> 2419
    //   245: aload 8
    //   247: invokevirtual 135	android/graphics/Bitmap:isRecycled	()Z
    //   250: ifne +2169 -> 2419
    //   253: ldc -113
    //   255: ldc_w 274
    //   258: invokestatic 246	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   261: aload 8
    //   263: astore 10
    //   265: aload_0
    //   266: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   269: getfield 277	com/tencent/mm/ak/a/a/c:dXI	Z
    //   272: ifeq +17 -> 289
    //   275: aload 8
    //   277: aload_0
    //   278: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   281: getfield 280	com/tencent/mm/ak/a/a/c:dXJ	I
    //   284: invokestatic 285	com/tencent/mm/sdk/platformtools/c:e	(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    //   287: astore 10
    //   289: new 287	com/tencent/mm/ak/a/f/c
    //   292: dup
    //   293: aload_0
    //   294: getfield 51	com/tencent/mm/ak/a/f/b:url	Ljava/lang/String;
    //   297: aload_0
    //   298: getfield 53	com/tencent/mm/ak/a/f/b:dYk	Lcom/tencent/mm/ak/a/c;
    //   301: aload 10
    //   303: aload_0
    //   304: getfield 57	com/tencent/mm/ak/a/f/b:dYi	Lcom/tencent/mm/ak/a/b;
    //   307: aload_0
    //   308: aload_0
    //   309: getfield 51	com/tencent/mm/ak/a/f/b:url	Ljava/lang/String;
    //   312: invokevirtual 218	com/tencent/mm/ak/a/f/b:mg	(Ljava/lang/String;)Ljava/lang/String;
    //   315: invokespecial 290	com/tencent/mm/ak/a/f/c:<init>	(Ljava/lang/String;Lcom/tencent/mm/ak/a/c;Landroid/graphics/Bitmap;Lcom/tencent/mm/ak/a/b;Ljava/lang/String;)V
    //   318: astore 8
    //   320: aload_0
    //   321: getfield 55	com/tencent/mm/ak/a/f/b:dYl	Lcom/tencent/mm/sdk/platformtools/ag;
    //   324: ifnull +13 -> 337
    //   327: aload_0
    //   328: getfield 55	com/tencent/mm/ak/a/f/b:dYl	Lcom/tencent/mm/sdk/platformtools/ag;
    //   331: aload 8
    //   333: invokevirtual 296	com/tencent/mm/sdk/platformtools/ag:post	(Ljava/lang/Runnable;)Z
    //   336: pop
    //   337: aload 9
    //   339: aload 10
    //   341: putfield 118	com/tencent/mm/ak/a/d/b:bitmap	Landroid/graphics/Bitmap;
    //   344: aload 10
    //   346: astore 8
    //   348: aload_0
    //   349: getfield 59	com/tencent/mm/ak/a/f/b:dYn	Lcom/tencent/mm/ak/a/c/g;
    //   352: ifnull +37 -> 389
    //   355: aload 9
    //   357: ifnull +32 -> 389
    //   360: aload 9
    //   362: aload 8
    //   364: putfield 118	com/tencent/mm/ak/a/d/b:bitmap	Landroid/graphics/Bitmap;
    //   367: aload_0
    //   368: getfield 59	com/tencent/mm/ak/a/f/b:dYn	Lcom/tencent/mm/ak/a/c/g;
    //   371: aload_0
    //   372: getfield 51	com/tencent/mm/ak/a/f/b:url	Ljava/lang/String;
    //   375: aload_0
    //   376: getfield 53	com/tencent/mm/ak/a/f/b:dYk	Lcom/tencent/mm/ak/a/c;
    //   379: invokevirtual 124	com/tencent/mm/ak/a/c:getImageView	()Landroid/widget/ImageView;
    //   382: aload 9
    //   384: invokeinterface 299 4 0
    //   389: aload_0
    //   390: getfield 71	com/tencent/mm/ak/a/f/b:dYm	Lcom/tencent/mm/ak/a/c/i;
    //   393: astore 9
    //   395: aload_0
    //   396: getfield 51	com/tencent/mm/ak/a/f/b:url	Ljava/lang/String;
    //   399: astore 10
    //   401: aload_0
    //   402: getfield 53	com/tencent/mm/ak/a/f/b:dYk	Lcom/tencent/mm/ak/a/c;
    //   405: invokevirtual 124	com/tencent/mm/ak/a/c:getImageView	()Landroid/widget/ImageView;
    //   408: pop
    //   409: aload 9
    //   411: aload 10
    //   413: aload 8
    //   415: aload_0
    //   416: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   419: getfield 303	com/tencent/mm/ak/a/a/c:dYc	[Ljava/lang/Object;
    //   422: invokeinterface 308 4 0
    //   427: aload_0
    //   428: getfield 57	com/tencent/mm/ak/a/f/b:dYi	Lcom/tencent/mm/ak/a/b;
    //   431: astore 8
    //   433: aload 8
    //   435: getfield 312	com/tencent/mm/ak/a/b:dWW	Ljava/util/HashMap;
    //   438: ifnull +33 -> 471
    //   441: aload_0
    //   442: ifnull +29 -> 471
    //   445: aload_0
    //   446: getfield 53	com/tencent/mm/ak/a/f/b:dYk	Lcom/tencent/mm/ak/a/c;
    //   449: ifnull +22 -> 471
    //   452: aload 8
    //   454: getfield 312	com/tencent/mm/ak/a/b:dWW	Ljava/util/HashMap;
    //   457: aload_0
    //   458: getfield 53	com/tencent/mm/ak/a/f/b:dYk	Lcom/tencent/mm/ak/a/c;
    //   461: invokevirtual 316	com/tencent/mm/ak/a/c:Pr	()I
    //   464: invokestatic 254	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   467: invokevirtual 322	java/util/HashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   470: pop
    //   471: return
    //   472: aload_0
    //   473: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   476: getfield 325	com/tencent/mm/ak/a/a/c:bOX	Ljava/lang/String;
    //   479: astore 9
    //   481: aload_0
    //   482: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   485: getfield 328	com/tencent/mm/ak/a/a/c:dXK	Z
    //   488: ifeq +123 -> 611
    //   491: aload 9
    //   493: invokestatic 169	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   496: ifne +115 -> 611
    //   499: aload 9
    //   501: invokestatic 333	com/tencent/mm/vfs/d:cn	(Ljava/lang/String;)Z
    //   504: ifeq +107 -> 611
    //   507: aload_0
    //   508: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   511: getfield 336	com/tencent/mm/ak/a/a/c:dXY	Z
    //   514: ifeq +69 -> 583
    //   517: aload_0
    //   518: getfield 53	com/tencent/mm/ak/a/f/b:dYk	Lcom/tencent/mm/ak/a/c;
    //   521: aload 9
    //   523: aload_0
    //   524: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   527: getfield 201	com/tencent/mm/ak/a/a/c:dXE	I
    //   530: aload_0
    //   531: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   534: getfield 207	com/tencent/mm/ak/a/a/c:dXF	I
    //   537: invokestatic 342	com/tencent/mm/ak/a/g/a:b	(Lcom/tencent/mm/ak/a/c;Ljava/lang/String;II)Landroid/graphics/Bitmap;
    //   540: astore 9
    //   542: aload 9
    //   544: astore 8
    //   546: aload 9
    //   548: astore 11
    //   550: aload_0
    //   551: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   554: getfield 345	com/tencent/mm/ak/a/a/c:density	I
    //   557: ifle +1934 -> 2491
    //   560: aload 9
    //   562: astore 8
    //   564: aload 9
    //   566: aload_0
    //   567: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   570: getfield 345	com/tencent/mm/ak/a/a/c:density	I
    //   573: invokevirtual 349	android/graphics/Bitmap:setDensity	(I)V
    //   576: aload 9
    //   578: astore 8
    //   580: goto -373 -> 207
    //   583: aload_0
    //   584: getfield 53	com/tencent/mm/ak/a/f/b:dYk	Lcom/tencent/mm/ak/a/c;
    //   587: aload 9
    //   589: aload_0
    //   590: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   593: getfield 201	com/tencent/mm/ak/a/a/c:dXE	I
    //   596: aload_0
    //   597: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   600: getfield 207	com/tencent/mm/ak/a/a/c:dXF	I
    //   603: invokestatic 351	com/tencent/mm/ak/a/g/a:a	(Lcom/tencent/mm/ak/a/c;Ljava/lang/String;II)Landroid/graphics/Bitmap;
    //   606: astore 9
    //   608: goto -66 -> 542
    //   611: aload_0
    //   612: getfield 51	com/tencent/mm/ak/a/f/b:url	Ljava/lang/String;
    //   615: invokestatic 169	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   618: ifne +572 -> 1190
    //   621: aload_0
    //   622: getfield 51	com/tencent/mm/ak/a/f/b:url	Ljava/lang/String;
    //   625: invokestatic 333	com/tencent/mm/vfs/d:cn	(Ljava/lang/String;)Z
    //   628: ifeq +525 -> 1153
    //   631: iload 7
    //   633: ifeq +21 -> 654
    //   636: aload_0
    //   637: getfield 98	com/tencent/mm/ak/a/f/b:dYp	Lcom/tencent/mm/ak/a/c/k;
    //   640: aload 14
    //   642: aload_0
    //   643: getfield 51	com/tencent/mm/ak/a/f/b:url	Ljava/lang/String;
    //   646: invokeinterface 357 3 0
    //   651: ifeq +488 -> 1139
    //   654: aload_0
    //   655: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   658: getfield 336	com/tencent/mm/ak/a/a/c:dXY	Z
    //   661: ifeq +168 -> 829
    //   664: aload_0
    //   665: getfield 53	com/tencent/mm/ak/a/f/b:dYk	Lcom/tencent/mm/ak/a/c;
    //   668: aload_0
    //   669: getfield 51	com/tencent/mm/ak/a/f/b:url	Ljava/lang/String;
    //   672: aload_0
    //   673: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   676: getfield 201	com/tencent/mm/ak/a/a/c:dXE	I
    //   679: aload_0
    //   680: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   683: getfield 207	com/tencent/mm/ak/a/a/c:dXF	I
    //   686: invokestatic 342	com/tencent/mm/ak/a/g/a:b	(Lcom/tencent/mm/ak/a/c;Ljava/lang/String;II)Landroid/graphics/Bitmap;
    //   689: astore 9
    //   691: aload 9
    //   693: astore 11
    //   695: aload 9
    //   697: astore 8
    //   699: aload_0
    //   700: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   703: getfield 360	com/tencent/mm/ak/a/a/c:dYa	Z
    //   706: ifeq +69 -> 775
    //   709: aload 9
    //   711: astore 11
    //   713: aload 9
    //   715: ifnonnull +60 -> 775
    //   718: aload 9
    //   720: astore 11
    //   722: aload 9
    //   724: astore 8
    //   726: aload_0
    //   727: getfield 105	com/tencent/mm/ak/a/f/b:dYr	Lcom/tencent/mm/ak/a/c/l;
    //   730: ifnull +45 -> 775
    //   733: aload 9
    //   735: astore 8
    //   737: aload_0
    //   738: getfield 103	com/tencent/mm/ak/a/f/b:dYq	Lcom/tencent/mm/ak/a/c/d;
    //   741: ifnull +376 -> 1117
    //   744: aload 9
    //   746: astore 8
    //   748: aload_0
    //   749: getfield 105	com/tencent/mm/ak/a/f/b:dYr	Lcom/tencent/mm/ak/a/c/l;
    //   752: aload_0
    //   753: getfield 103	com/tencent/mm/ak/a/f/b:dYq	Lcom/tencent/mm/ak/a/c/d;
    //   756: aload_0
    //   757: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   760: getfield 303	com/tencent/mm/ak/a/a/c:dYc	[Ljava/lang/Object;
    //   763: invokeinterface 366 2 0
    //   768: invokeinterface 372 2 0
    //   773: astore 11
    //   775: aload 11
    //   777: ifnull +33 -> 810
    //   780: aload 11
    //   782: astore 8
    //   784: aload_0
    //   785: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   788: getfield 345	com/tencent/mm/ak/a/a/c:density	I
    //   791: ifle +19 -> 810
    //   794: aload 11
    //   796: astore 8
    //   798: aload 11
    //   800: aload_0
    //   801: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   804: getfield 345	com/tencent/mm/ak/a/a/c:density	I
    //   807: invokevirtual 349	android/graphics/Bitmap:setDensity	(I)V
    //   810: aload 11
    //   812: astore 8
    //   814: ldc -113
    //   816: ldc_w 374
    //   819: invokestatic 246	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   822: aload 11
    //   824: astore 8
    //   826: goto -619 -> 207
    //   829: aload_0
    //   830: getfield 82	com/tencent/mm/ak/a/f/b:dYb	Lcom/tencent/mm/ak/a/c/o;
    //   833: astore 8
    //   835: aload 8
    //   837: ifnull +180 -> 1017
    //   840: aconst_null
    //   841: astore 9
    //   843: aload 9
    //   845: astore 8
    //   847: aload_0
    //   848: getfield 82	com/tencent/mm/ak/a/f/b:dYb	Lcom/tencent/mm/ak/a/c/o;
    //   851: astore 11
    //   853: aload 9
    //   855: astore 8
    //   857: new 376	com/tencent/mm/vfs/c
    //   860: dup
    //   861: aload_0
    //   862: getfield 51	com/tencent/mm/ak/a/f/b:url	Ljava/lang/String;
    //   865: invokespecial 377	com/tencent/mm/vfs/c:<init>	(Ljava/lang/String;)V
    //   868: pop
    //   869: aload 9
    //   871: astore 8
    //   873: aload 11
    //   875: invokeinterface 383 1 0
    //   880: astore 12
    //   882: aload 12
    //   884: astore 8
    //   886: aload_0
    //   887: getfield 53	com/tencent/mm/ak/a/f/b:dYk	Lcom/tencent/mm/ak/a/c;
    //   890: aload 12
    //   892: aload_0
    //   893: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   896: getfield 201	com/tencent/mm/ak/a/a/c:dXE	I
    //   899: aload_0
    //   900: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   903: getfield 207	com/tencent/mm/ak/a/a/c:dXF	I
    //   906: aload_0
    //   907: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   910: getfield 386	com/tencent/mm/ak/a/a/c:dXM	Z
    //   913: aload_0
    //   914: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   917: getfield 389	com/tencent/mm/ak/a/a/c:alpha	F
    //   920: aload_0
    //   921: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   924: getfield 392	com/tencent/mm/ak/a/a/c:dXH	Z
    //   927: invokestatic 395	com/tencent/mm/ak/a/g/a:a	(Lcom/tencent/mm/ak/a/c;Ljava/io/InputStream;IIZFZ)Landroid/graphics/Bitmap;
    //   930: astore 11
    //   932: aload 11
    //   934: astore 9
    //   936: aload 12
    //   938: ifnull -247 -> 691
    //   941: aload 11
    //   943: astore 8
    //   945: aload 12
    //   947: invokevirtual 400	java/io/InputStream:close	()V
    //   950: aload 11
    //   952: astore 9
    //   954: goto -263 -> 691
    //   957: astore 8
    //   959: aload 11
    //   961: astore 9
    //   963: goto -272 -> 691
    //   966: astore 9
    //   968: aload 8
    //   970: ifnull +8 -> 978
    //   973: aload 8
    //   975: invokevirtual 400	java/io/InputStream:close	()V
    //   978: aload 9
    //   980: athrow
    //   981: astore 11
    //   983: aload 10
    //   985: astore 9
    //   987: aconst_null
    //   988: astore 8
    //   990: aload 11
    //   992: astore 10
    //   994: ldc -113
    //   996: ldc_w 402
    //   999: iconst_1
    //   1000: anewarray 4	java/lang/Object
    //   1003: dup
    //   1004: iconst_0
    //   1005: aload 10
    //   1007: invokevirtual 403	java/lang/Exception:toString	()Ljava/lang/String;
    //   1010: aastore
    //   1011: invokestatic 267	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1014: goto -774 -> 240
    //   1017: aload_0
    //   1018: getfield 103	com/tencent/mm/ak/a/f/b:dYq	Lcom/tencent/mm/ak/a/c/d;
    //   1021: ifnull +66 -> 1087
    //   1024: aload_0
    //   1025: getfield 53	com/tencent/mm/ak/a/f/b:dYk	Lcom/tencent/mm/ak/a/c;
    //   1028: aload_0
    //   1029: getfield 103	com/tencent/mm/ak/a/f/b:dYq	Lcom/tencent/mm/ak/a/c/d;
    //   1032: aload_0
    //   1033: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   1036: getfield 303	com/tencent/mm/ak/a/a/c:dYc	[Ljava/lang/Object;
    //   1039: invokeinterface 366 2 0
    //   1044: aload_0
    //   1045: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   1048: getfield 201	com/tencent/mm/ak/a/a/c:dXE	I
    //   1051: aload_0
    //   1052: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   1055: getfield 207	com/tencent/mm/ak/a/a/c:dXF	I
    //   1058: aload_0
    //   1059: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   1062: getfield 386	com/tencent/mm/ak/a/a/c:dXM	Z
    //   1065: aload_0
    //   1066: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   1069: getfield 389	com/tencent/mm/ak/a/a/c:alpha	F
    //   1072: aload_0
    //   1073: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   1076: getfield 392	com/tencent/mm/ak/a/a/c:dXH	Z
    //   1079: invokestatic 406	com/tencent/mm/ak/a/g/a:a	(Lcom/tencent/mm/ak/a/c;[BIIZFZ)Landroid/graphics/Bitmap;
    //   1082: astore 9
    //   1084: goto -393 -> 691
    //   1087: aload_0
    //   1088: getfield 53	com/tencent/mm/ak/a/f/b:dYk	Lcom/tencent/mm/ak/a/c;
    //   1091: aload_0
    //   1092: getfield 51	com/tencent/mm/ak/a/f/b:url	Ljava/lang/String;
    //   1095: aload_0
    //   1096: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   1099: getfield 201	com/tencent/mm/ak/a/a/c:dXE	I
    //   1102: aload_0
    //   1103: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   1106: getfield 207	com/tencent/mm/ak/a/a/c:dXF	I
    //   1109: invokestatic 351	com/tencent/mm/ak/a/g/a:a	(Lcom/tencent/mm/ak/a/c;Ljava/lang/String;II)Landroid/graphics/Bitmap;
    //   1112: astore 9
    //   1114: goto -423 -> 691
    //   1117: aload 9
    //   1119: astore 8
    //   1121: aload_0
    //   1122: getfield 105	com/tencent/mm/ak/a/f/b:dYr	Lcom/tencent/mm/ak/a/c/l;
    //   1125: aload_0
    //   1126: getfield 51	com/tencent/mm/ak/a/f/b:url	Ljava/lang/String;
    //   1129: invokeinterface 410 2 0
    //   1134: astore 11
    //   1136: goto -361 -> 775
    //   1139: ldc -113
    //   1141: ldc_w 412
    //   1144: invokestatic 272	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   1147: aconst_null
    //   1148: astore 8
    //   1150: goto -943 -> 207
    //   1153: aload_0
    //   1154: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   1157: getfield 415	com/tencent/mm/ak/a/a/c:dXL	Z
    //   1160: ifeq +19 -> 1179
    //   1163: aload_0
    //   1164: getfield 101	com/tencent/mm/ak/a/f/b:dXr	Lcom/tencent/mm/ak/a/c/e;
    //   1167: aload_0
    //   1168: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   1171: getfield 303	com/tencent/mm/ak/a/a/c:dYc	[Ljava/lang/Object;
    //   1174: invokeinterface 421 2 0
    //   1179: ldc -113
    //   1181: ldc_w 423
    //   1184: invokestatic 272	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   1187: goto -980 -> 207
    //   1190: ldc -113
    //   1192: ldc_w 425
    //   1195: invokestatic 272	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   1198: goto -991 -> 207
    //   1201: aconst_null
    //   1202: astore 9
    //   1204: iconst_0
    //   1205: istore_1
    //   1206: aload_0
    //   1207: getfield 88	com/tencent/mm/ak/a/f/b:dXm	Lcom/tencent/mm/ak/a/c/a;
    //   1210: aload_0
    //   1211: getfield 51	com/tencent/mm/ak/a/f/b:url	Ljava/lang/String;
    //   1214: aload_0
    //   1215: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   1218: invokeinterface 430 3 0
    //   1223: astore 11
    //   1225: aload 11
    //   1227: ifnull +1271 -> 2498
    //   1230: iload 7
    //   1232: ifeq +23 -> 1255
    //   1235: aload 11
    //   1237: astore 9
    //   1239: aload_0
    //   1240: getfield 98	com/tencent/mm/ak/a/f/b:dYp	Lcom/tencent/mm/ak/a/c/k;
    //   1243: aload 14
    //   1245: aload 11
    //   1247: invokeinterface 433 3 0
    //   1252: ifeq +153 -> 1405
    //   1255: aload 11
    //   1257: astore 8
    //   1259: aload 11
    //   1261: astore 9
    //   1263: aload_0
    //   1264: getfield 82	com/tencent/mm/ak/a/f/b:dYb	Lcom/tencent/mm/ak/a/c/o;
    //   1267: ifnull +18 -> 1285
    //   1270: aload 11
    //   1272: astore 9
    //   1274: aload_0
    //   1275: getfield 82	com/tencent/mm/ak/a/f/b:dYb	Lcom/tencent/mm/ak/a/c/o;
    //   1278: invokeinterface 383 1 0
    //   1283: astore 8
    //   1285: aload 8
    //   1287: astore 9
    //   1289: aload_0
    //   1290: getfield 53	com/tencent/mm/ak/a/f/b:dYk	Lcom/tencent/mm/ak/a/c;
    //   1293: aload 8
    //   1295: aload_0
    //   1296: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   1299: getfield 201	com/tencent/mm/ak/a/a/c:dXE	I
    //   1302: aload_0
    //   1303: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   1306: getfield 207	com/tencent/mm/ak/a/a/c:dXF	I
    //   1309: aload_0
    //   1310: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   1313: getfield 386	com/tencent/mm/ak/a/a/c:dXM	Z
    //   1316: aload_0
    //   1317: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   1320: getfield 389	com/tencent/mm/ak/a/a/c:alpha	F
    //   1323: aload_0
    //   1324: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   1327: getfield 392	com/tencent/mm/ak/a/a/c:dXH	Z
    //   1330: invokestatic 395	com/tencent/mm/ak/a/g/a:a	(Lcom/tencent/mm/ak/a/c;Ljava/io/InputStream;IIZFZ)Landroid/graphics/Bitmap;
    //   1333: astore 11
    //   1335: aload 11
    //   1337: astore 9
    //   1339: iconst_1
    //   1340: istore_1
    //   1341: aload 8
    //   1343: astore 11
    //   1345: aload 11
    //   1347: ifnull +12 -> 1359
    //   1350: aload 9
    //   1352: astore 8
    //   1354: aload 11
    //   1356: invokevirtual 400	java/io/InputStream:close	()V
    //   1359: aload 9
    //   1361: astore 11
    //   1363: iload_1
    //   1364: ifeq +1127 -> 2491
    //   1367: aload 9
    //   1369: astore 11
    //   1371: aload 9
    //   1373: ifnonnull +1118 -> 2491
    //   1376: aload 9
    //   1378: astore 8
    //   1380: aload_0
    //   1381: getfield 88	com/tencent/mm/ak/a/f/b:dXm	Lcom/tencent/mm/ak/a/c/a;
    //   1384: aload_0
    //   1385: getfield 51	com/tencent/mm/ak/a/f/b:url	Ljava/lang/String;
    //   1388: aload_0
    //   1389: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   1392: invokeinterface 437 3 0
    //   1397: pop
    //   1398: aload 9
    //   1400: astore 8
    //   1402: goto -1195 -> 207
    //   1405: iconst_1
    //   1406: istore_1
    //   1407: aconst_null
    //   1408: astore 9
    //   1410: goto -65 -> 1345
    //   1413: astore 8
    //   1415: aload 9
    //   1417: ifnull +8 -> 1425
    //   1420: aload 9
    //   1422: invokevirtual 400	java/io/InputStream:close	()V
    //   1425: aload 8
    //   1427: athrow
    //   1428: aload_0
    //   1429: getfield 53	com/tencent/mm/ak/a/f/b:dYk	Lcom/tencent/mm/ak/a/c;
    //   1432: aload_0
    //   1433: getfield 51	com/tencent/mm/ak/a/f/b:url	Ljava/lang/String;
    //   1436: aload_0
    //   1437: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   1440: getfield 201	com/tencent/mm/ak/a/a/c:dXE	I
    //   1443: aload_0
    //   1444: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   1447: getfield 207	com/tencent/mm/ak/a/a/c:dXF	I
    //   1450: invokestatic 439	com/tencent/mm/ak/a/g/a:c	(Lcom/tencent/mm/ak/a/c;Ljava/lang/String;II)Landroid/graphics/Bitmap;
    //   1453: astore 8
    //   1455: goto -1248 -> 207
    //   1458: aload_0
    //   1459: getfield 64	com/tencent/mm/ak/a/f/b:dWS	Lcom/tencent/mm/ak/a/a/b;
    //   1462: getfield 443	com/tencent/mm/ak/a/a/b:dXh	Landroid/content/res/Resources;
    //   1465: aload_0
    //   1466: getfield 51	com/tencent/mm/ak/a/f/b:url	Ljava/lang/String;
    //   1469: ldc_w 445
    //   1472: aload_0
    //   1473: getfield 64	com/tencent/mm/ak/a/f/b:dWS	Lcom/tencent/mm/ak/a/a/b;
    //   1476: getfield 448	com/tencent/mm/ak/a/a/b:packageName	Ljava/lang/String;
    //   1479: invokevirtual 454	android/content/res/Resources:getIdentifier	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    //   1482: istore_1
    //   1483: aload_0
    //   1484: getfield 53	com/tencent/mm/ak/a/f/b:dYk	Lcom/tencent/mm/ak/a/c;
    //   1487: iload_1
    //   1488: aload_0
    //   1489: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   1492: getfield 201	com/tencent/mm/ak/a/a/c:dXE	I
    //   1495: aload_0
    //   1496: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   1499: getfield 207	com/tencent/mm/ak/a/a/c:dXF	I
    //   1502: invokestatic 457	com/tencent/mm/ak/a/g/a:a	(Lcom/tencent/mm/ak/a/c;III)Landroid/graphics/Bitmap;
    //   1505: astore 8
    //   1507: goto -1300 -> 207
    //   1510: aload_0
    //   1511: getfield 51	com/tencent/mm/ak/a/f/b:url	Ljava/lang/String;
    //   1514: invokestatic 460	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   1517: invokevirtual 463	java/lang/Integer:intValue	()I
    //   1520: istore_1
    //   1521: aload_0
    //   1522: getfield 53	com/tencent/mm/ak/a/f/b:dYk	Lcom/tencent/mm/ak/a/c;
    //   1525: iload_1
    //   1526: aload_0
    //   1527: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   1530: getfield 201	com/tencent/mm/ak/a/a/c:dXE	I
    //   1533: aload_0
    //   1534: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   1537: getfield 207	com/tencent/mm/ak/a/a/c:dXF	I
    //   1540: invokestatic 457	com/tencent/mm/ak/a/g/a:a	(Lcom/tencent/mm/ak/a/c;III)Landroid/graphics/Bitmap;
    //   1543: astore 8
    //   1545: goto -1338 -> 207
    //   1548: invokestatic 226	java/lang/System:currentTimeMillis	()J
    //   1551: lstore_3
    //   1552: ldc -113
    //   1554: ldc_w 465
    //   1557: invokestatic 246	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   1560: aload_0
    //   1561: getfield 59	com/tencent/mm/ak/a/f/b:dYn	Lcom/tencent/mm/ak/a/c/g;
    //   1564: ifnull +32 -> 1596
    //   1567: aload_0
    //   1568: getfield 59	com/tencent/mm/ak/a/f/b:dYn	Lcom/tencent/mm/ak/a/c/g;
    //   1571: astore 9
    //   1573: aload_0
    //   1574: getfield 51	com/tencent/mm/ak/a/f/b:url	Ljava/lang/String;
    //   1577: astore 11
    //   1579: aload_0
    //   1580: getfield 53	com/tencent/mm/ak/a/f/b:dYk	Lcom/tencent/mm/ak/a/c;
    //   1583: invokevirtual 124	com/tencent/mm/ak/a/c:getImageView	()Landroid/widget/ImageView;
    //   1586: pop
    //   1587: aload 9
    //   1589: aload 11
    //   1591: invokeinterface 468 2 0
    //   1596: aload_0
    //   1597: getfield 108	com/tencent/mm/ak/a/f/b:dXu	Lcom/tencent/mm/ak/a/c/n;
    //   1600: aload_0
    //   1601: getfield 51	com/tencent/mm/ak/a/f/b:url	Ljava/lang/String;
    //   1604: invokeinterface 473 2 0
    //   1609: ifeq +61 -> 1670
    //   1612: aload_0
    //   1613: getfield 79	com/tencent/mm/ak/a/f/b:dXn	Lcom/tencent/mm/ak/a/c/b;
    //   1616: aload_0
    //   1617: getfield 51	com/tencent/mm/ak/a/f/b:url	Ljava/lang/String;
    //   1620: invokeinterface 479 2 0
    //   1625: astore 9
    //   1627: aload 9
    //   1629: ifnonnull +859 -> 2488
    //   1632: new 114	com/tencent/mm/ak/a/d/b
    //   1635: dup
    //   1636: aconst_null
    //   1637: aconst_null
    //   1638: invokespecial 482	com/tencent/mm/ak/a/d/b:<init>	([BLjava/lang/String;)V
    //   1641: astore 10
    //   1643: aload 10
    //   1645: astore 9
    //   1647: aload 9
    //   1649: iconst_2
    //   1650: putfield 216	com/tencent/mm/ak/a/d/b:bJu	I
    //   1653: aload 9
    //   1655: getfield 486	com/tencent/mm/ak/a/d/b:data	[B
    //   1658: ifnonnull +27 -> 1685
    //   1661: aload 9
    //   1663: iconst_1
    //   1664: putfield 489	com/tencent/mm/ak/a/d/b:status	I
    //   1667: goto -1427 -> 240
    //   1670: ldc -113
    //   1672: ldc_w 491
    //   1675: invokestatic 494	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1678: aload 10
    //   1680: astore 9
    //   1682: goto -55 -> 1627
    //   1685: iload 7
    //   1687: ifeq +22 -> 1709
    //   1690: aload_0
    //   1691: getfield 98	com/tencent/mm/ak/a/f/b:dYp	Lcom/tencent/mm/ak/a/c/k;
    //   1694: aload 14
    //   1696: aload 9
    //   1698: getfield 486	com/tencent/mm/ak/a/d/b:data	[B
    //   1701: invokeinterface 498 3 0
    //   1706: ifeq +481 -> 2187
    //   1709: ldc -113
    //   1711: ldc_w 500
    //   1714: invokestatic 246	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   1717: invokestatic 226	java/lang/System:currentTimeMillis	()J
    //   1720: lstore 5
    //   1722: aload 9
    //   1724: getfield 486	com/tencent/mm/ak/a/d/b:data	[B
    //   1727: astore 11
    //   1729: aload 11
    //   1731: astore 10
    //   1733: aload_0
    //   1734: getfield 82	com/tencent/mm/ak/a/f/b:dYb	Lcom/tencent/mm/ak/a/c/o;
    //   1737: ifnull +78 -> 1815
    //   1740: aload_0
    //   1741: getfield 82	com/tencent/mm/ak/a/f/b:dYb	Lcom/tencent/mm/ak/a/c/o;
    //   1744: astore 10
    //   1746: new 502	java/io/ByteArrayInputStream
    //   1749: dup
    //   1750: aload 11
    //   1752: invokespecial 505	java/io/ByteArrayInputStream:<init>	([B)V
    //   1755: pop
    //   1756: aload 10
    //   1758: invokeinterface 383 1 0
    //   1763: astore 10
    //   1765: new 507	java/io/ByteArrayOutputStream
    //   1768: dup
    //   1769: aload 11
    //   1771: arraylength
    //   1772: invokespecial 509	java/io/ByteArrayOutputStream:<init>	(I)V
    //   1775: astore 11
    //   1777: sipush 1024
    //   1780: newarray <illegal type>
    //   1782: astore 12
    //   1784: aload 10
    //   1786: aload 12
    //   1788: invokevirtual 513	java/io/InputStream:read	([B)I
    //   1791: istore_1
    //   1792: iload_1
    //   1793: iflt +15 -> 1808
    //   1796: aload 11
    //   1798: aload 12
    //   1800: iconst_0
    //   1801: iload_1
    //   1802: invokevirtual 517	java/io/ByteArrayOutputStream:write	([BII)V
    //   1805: goto -21 -> 1784
    //   1808: aload 11
    //   1810: invokevirtual 521	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   1813: astore 10
    //   1815: aload_0
    //   1816: getfield 53	com/tencent/mm/ak/a/f/b:dYk	Lcom/tencent/mm/ak/a/c;
    //   1819: aload 10
    //   1821: aload_0
    //   1822: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   1825: getfield 201	com/tencent/mm/ak/a/a/c:dXE	I
    //   1828: aload_0
    //   1829: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   1832: getfield 207	com/tencent/mm/ak/a/a/c:dXF	I
    //   1835: aload_0
    //   1836: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   1839: getfield 386	com/tencent/mm/ak/a/a/c:dXM	Z
    //   1842: aload_0
    //   1843: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   1846: getfield 389	com/tencent/mm/ak/a/a/c:alpha	F
    //   1849: aload_0
    //   1850: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   1853: getfield 392	com/tencent/mm/ak/a/a/c:dXH	Z
    //   1856: invokestatic 406	com/tencent/mm/ak/a/g/a:a	(Lcom/tencent/mm/ak/a/c;[BIIZFZ)Landroid/graphics/Bitmap;
    //   1859: astore 11
    //   1861: aload 11
    //   1863: ifnonnull +20 -> 1883
    //   1866: aload 11
    //   1868: astore 8
    //   1870: aload 9
    //   1872: iconst_3
    //   1873: putfield 489	com/tencent/mm/ak/a/d/b:status	I
    //   1876: aload 11
    //   1878: astore 8
    //   1880: goto -1640 -> 240
    //   1883: aload 11
    //   1885: astore 8
    //   1887: aload 9
    //   1889: getfield 486	com/tencent/mm/ak/a/d/b:data	[B
    //   1892: astore 10
    //   1894: aload 11
    //   1896: astore 8
    //   1898: aload_0
    //   1899: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   1902: getfield 524	com/tencent/mm/ak/a/a/c:dXy	Z
    //   1905: ifeq +27 -> 1932
    //   1908: aload 11
    //   1910: astore 8
    //   1912: aload_0
    //   1913: getfield 88	com/tencent/mm/ak/a/f/b:dXm	Lcom/tencent/mm/ak/a/c/a;
    //   1916: aload_0
    //   1917: getfield 51	com/tencent/mm/ak/a/f/b:url	Ljava/lang/String;
    //   1920: aload 10
    //   1922: aload_0
    //   1923: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   1926: invokeinterface 527 4 0
    //   1931: pop
    //   1932: aload 11
    //   1934: astore 8
    //   1936: aload_0
    //   1937: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   1940: getfield 530	com/tencent/mm/ak/a/a/c:dXx	Z
    //   1943: ifeq +27 -> 1970
    //   1946: aload 11
    //   1948: astore 8
    //   1950: aload_0
    //   1951: getfield 88	com/tencent/mm/ak/a/f/b:dXm	Lcom/tencent/mm/ak/a/c/a;
    //   1954: aload_0
    //   1955: getfield 51	com/tencent/mm/ak/a/f/b:url	Ljava/lang/String;
    //   1958: aload 10
    //   1960: aload_0
    //   1961: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   1964: invokeinterface 527 4 0
    //   1969: pop
    //   1970: aload 11
    //   1972: astore 10
    //   1974: aload 11
    //   1976: astore 8
    //   1978: aload_0
    //   1979: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   1982: getfield 172	com/tencent/mm/ak/a/a/c:dXW	Z
    //   1985: ifeq +56 -> 2041
    //   1988: aload 11
    //   1990: astore 8
    //   1992: aload_0
    //   1993: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   1996: getfield 185	com/tencent/mm/ak/a/a/c:dXX	F
    //   1999: fconst_0
    //   2000: fcmpl
    //   2001: ifne +164 -> 2165
    //   2004: aload 11
    //   2006: astore 8
    //   2008: aload 11
    //   2010: invokevirtual 533	android/graphics/Bitmap:getWidth	()I
    //   2013: aload 11
    //   2015: invokevirtual 536	android/graphics/Bitmap:getHeight	()I
    //   2018: if_icmpne +68 -> 2086
    //   2021: aload 11
    //   2023: astore 8
    //   2025: aload 11
    //   2027: iconst_0
    //   2028: aload 11
    //   2030: invokevirtual 533	android/graphics/Bitmap:getWidth	()I
    //   2033: iconst_2
    //   2034: idiv
    //   2035: i2f
    //   2036: invokestatic 539	com/tencent/mm/sdk/platformtools/c:a	(Landroid/graphics/Bitmap;ZF)Landroid/graphics/Bitmap;
    //   2039: astore 10
    //   2041: aload 10
    //   2043: astore 8
    //   2045: aload_0
    //   2046: aload 9
    //   2048: aload 10
    //   2050: invokespecial 541	com/tencent/mm/ak/a/f/b:a	(Lcom/tencent/mm/ak/a/d/b;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    //   2053: astore 10
    //   2055: aload 10
    //   2057: astore 8
    //   2059: aload_0
    //   2060: aload 13
    //   2062: aload 10
    //   2064: invokespecial 543	com/tencent/mm/ak/a/f/b:k	(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    //   2067: aload 10
    //   2069: astore 8
    //   2071: aload_0
    //   2072: lload 5
    //   2074: lload_3
    //   2075: lsub
    //   2076: invokevirtual 544	com/tencent/mm/ak/a/f/b:bv	(J)V
    //   2079: aload 10
    //   2081: astore 8
    //   2083: goto -1843 -> 240
    //   2086: aload 11
    //   2088: astore 8
    //   2090: aload 11
    //   2092: invokevirtual 533	android/graphics/Bitmap:getWidth	()I
    //   2095: aload 11
    //   2097: invokevirtual 536	android/graphics/Bitmap:getHeight	()I
    //   2100: invokestatic 550	java/lang/Math:min	(II)I
    //   2103: istore_2
    //   2104: iload_2
    //   2105: istore_1
    //   2106: iload_2
    //   2107: ifgt +21 -> 2128
    //   2110: aload 11
    //   2112: astore 8
    //   2114: aload 11
    //   2116: invokevirtual 533	android/graphics/Bitmap:getWidth	()I
    //   2119: aload 11
    //   2121: invokevirtual 536	android/graphics/Bitmap:getHeight	()I
    //   2124: invokestatic 553	java/lang/Math:max	(II)I
    //   2127: istore_1
    //   2128: aload 11
    //   2130: astore 8
    //   2132: aload 11
    //   2134: iload_1
    //   2135: iload_1
    //   2136: iconst_1
    //   2137: invokestatic 556	com/tencent/mm/sdk/platformtools/c:a	(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
    //   2140: astore 10
    //   2142: aload 10
    //   2144: astore 8
    //   2146: aload 10
    //   2148: iconst_0
    //   2149: aload 10
    //   2151: invokevirtual 533	android/graphics/Bitmap:getWidth	()I
    //   2154: iconst_2
    //   2155: idiv
    //   2156: i2f
    //   2157: invokestatic 539	com/tencent/mm/sdk/platformtools/c:a	(Landroid/graphics/Bitmap;ZF)Landroid/graphics/Bitmap;
    //   2160: astore 10
    //   2162: goto -121 -> 2041
    //   2165: aload 11
    //   2167: astore 8
    //   2169: aload 11
    //   2171: iconst_0
    //   2172: aload_0
    //   2173: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   2176: getfield 185	com/tencent/mm/ak/a/a/c:dXX	F
    //   2179: invokestatic 539	com/tencent/mm/sdk/platformtools/c:a	(Landroid/graphics/Bitmap;ZF)Landroid/graphics/Bitmap;
    //   2182: astore 10
    //   2184: goto -143 -> 2041
    //   2187: aload 9
    //   2189: iconst_2
    //   2190: putfield 489	com/tencent/mm/ak/a/d/b:status	I
    //   2193: ldc -113
    //   2195: ldc_w 558
    //   2198: invokestatic 272	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   2201: aconst_null
    //   2202: astore 8
    //   2204: goto -1964 -> 240
    //   2207: ldc -113
    //   2209: ldc_w 560
    //   2212: invokestatic 272	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   2215: aload 10
    //   2217: astore 9
    //   2219: goto -1979 -> 240
    //   2222: aload_0
    //   2223: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   2226: getfield 172	com/tencent/mm/ak/a/a/c:dXW	Z
    //   2229: ifeq +252 -> 2481
    //   2232: aload_0
    //   2233: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   2236: getfield 185	com/tencent/mm/ak/a/a/c:dXX	F
    //   2239: fconst_0
    //   2240: fcmpl
    //   2241: ifne +160 -> 2401
    //   2244: aload 8
    //   2246: invokevirtual 533	android/graphics/Bitmap:getWidth	()I
    //   2249: aload 8
    //   2251: invokevirtual 536	android/graphics/Bitmap:getHeight	()I
    //   2254: if_icmpne +80 -> 2334
    //   2257: aload 8
    //   2259: iconst_0
    //   2260: aload 8
    //   2262: invokevirtual 533	android/graphics/Bitmap:getWidth	()I
    //   2265: iconst_2
    //   2266: idiv
    //   2267: i2f
    //   2268: invokestatic 539	com/tencent/mm/sdk/platformtools/c:a	(Landroid/graphics/Bitmap;ZF)Landroid/graphics/Bitmap;
    //   2271: astore 9
    //   2273: aload 9
    //   2275: astore 8
    //   2277: aload_0
    //   2278: aload 10
    //   2280: aload 9
    //   2282: invokespecial 541	com/tencent/mm/ak/a/f/b:a	(Lcom/tencent/mm/ak/a/d/b;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    //   2285: astore 9
    //   2287: aload 9
    //   2289: astore 8
    //   2291: aload_0
    //   2292: aload 13
    //   2294: aload 9
    //   2296: invokespecial 543	com/tencent/mm/ak/a/f/b:k	(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    //   2299: aload 9
    //   2301: astore 8
    //   2303: aload_0
    //   2304: lload 5
    //   2306: lload_3
    //   2307: lsub
    //   2308: invokevirtual 544	com/tencent/mm/ak/a/f/b:bv	(J)V
    //   2311: aload 9
    //   2313: astore 8
    //   2315: ldc -113
    //   2317: ldc_w 562
    //   2320: invokestatic 246	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   2323: aload 9
    //   2325: astore 8
    //   2327: aload 10
    //   2329: astore 9
    //   2331: goto -2091 -> 240
    //   2334: aload 8
    //   2336: invokevirtual 533	android/graphics/Bitmap:getWidth	()I
    //   2339: aload 8
    //   2341: invokevirtual 536	android/graphics/Bitmap:getHeight	()I
    //   2344: invokestatic 550	java/lang/Math:min	(II)I
    //   2347: istore_2
    //   2348: iload_2
    //   2349: istore_1
    //   2350: iload_2
    //   2351: ifgt +17 -> 2368
    //   2354: aload 8
    //   2356: invokevirtual 533	android/graphics/Bitmap:getWidth	()I
    //   2359: aload 8
    //   2361: invokevirtual 536	android/graphics/Bitmap:getHeight	()I
    //   2364: invokestatic 553	java/lang/Math:max	(II)I
    //   2367: istore_1
    //   2368: aload 8
    //   2370: iload_1
    //   2371: iload_1
    //   2372: iconst_1
    //   2373: invokestatic 556	com/tencent/mm/sdk/platformtools/c:a	(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
    //   2376: astore 9
    //   2378: aload 9
    //   2380: astore 8
    //   2382: aload 9
    //   2384: iconst_0
    //   2385: aload 9
    //   2387: invokevirtual 533	android/graphics/Bitmap:getWidth	()I
    //   2390: iconst_2
    //   2391: idiv
    //   2392: i2f
    //   2393: invokestatic 539	com/tencent/mm/sdk/platformtools/c:a	(Landroid/graphics/Bitmap;ZF)Landroid/graphics/Bitmap;
    //   2396: astore 9
    //   2398: goto -125 -> 2273
    //   2401: aload 8
    //   2403: iconst_0
    //   2404: aload_0
    //   2405: getfield 69	com/tencent/mm/ak/a/f/b:dXk	Lcom/tencent/mm/ak/a/a/c;
    //   2408: getfield 185	com/tencent/mm/ak/a/a/c:dXX	F
    //   2411: invokestatic 539	com/tencent/mm/sdk/platformtools/c:a	(Landroid/graphics/Bitmap;ZF)Landroid/graphics/Bitmap;
    //   2414: astore 9
    //   2416: goto -143 -> 2273
    //   2419: ldc -113
    //   2421: ldc_w 564
    //   2424: invokestatic 272	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   2427: goto -2079 -> 348
    //   2430: astore 8
    //   2432: goto -1454 -> 978
    //   2435: astore 8
    //   2437: goto -1078 -> 1359
    //   2440: astore 9
    //   2442: goto -1017 -> 1425
    //   2445: astore 11
    //   2447: aload 10
    //   2449: astore 9
    //   2451: aload 11
    //   2453: astore 10
    //   2455: goto -1461 -> 994
    //   2458: astore 11
    //   2460: aload 10
    //   2462: astore 9
    //   2464: aload 11
    //   2466: astore 10
    //   2468: goto -1474 -> 994
    //   2471: astore 10
    //   2473: goto -1479 -> 994
    //   2476: astore 10
    //   2478: goto -1484 -> 994
    //   2481: aload 8
    //   2483: astore 9
    //   2485: goto -212 -> 2273
    //   2488: goto -841 -> 1647
    //   2491: aload 11
    //   2493: astore 8
    //   2495: goto -2288 -> 207
    //   2498: aconst_null
    //   2499: astore 9
    //   2501: goto -1156 -> 1345
    //   2504: goto -2316 -> 188
    //   2507: iload_2
    //   2508: tableswitch	default:+36->2544, 1:+-301->2207, 2:+-301->2207, 3:+-301->2207, 4:+-301->2207, 5:+-960->1548
    //   2544: goto -2316 -> 228
    //   2547: astore 10
    //   2549: goto -1555 -> 994
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	2552	0	this	b
    //   1205	1167	1	i	int
    //   57	2451	2	j	int
    //   49	2258	3	l1	long
    //   210	2095	5	l2	long
    //   65	1621	7	bool	boolean
    //   1	943	8	localObject1	Object
    //   957	17	8	localIOException1	java.io.IOException
    //   988	413	8	localObject2	Object
    //   1413	13	8	localObject3	Object
    //   1453	949	8	localObject4	Object
    //   2430	1	8	localIOException2	java.io.IOException
    //   2435	47	8	localIOException3	java.io.IOException
    //   2493	1	8	localObject5	Object
    //   238	724	9	localObject6	Object
    //   966	13	9	localObject7	Object
    //   985	1430	9	localObject8	Object
    //   2440	1	9	localIOException4	java.io.IOException
    //   2449	51	9	localObject9	Object
    //   10	2457	10	localObject10	Object
    //   2471	1	10	localException1	Exception
    //   2476	1	10	localException2	Exception
    //   2547	1	10	localException3	Exception
    //   548	412	11	localObject11	Object
    //   981	10	11	localException4	Exception
    //   1134	1036	11	localObject12	Object
    //   2445	7	11	localException5	Exception
    //   2458	34	11	localException6	Exception
    //   880	919	12	localObject13	Object
    //   26	2267	13	str1	String
    //   74	1621	14	str2	String
    // Exception table:
    //   from	to	target	type
    //   945	950	957	java/io/IOException
    //   847	853	966	finally
    //   857	869	966	finally
    //   873	882	966	finally
    //   886	932	966	finally
    //   18	154	981	java/lang/Exception
    //   188	207	981	java/lang/Exception
    //   472	542	981	java/lang/Exception
    //   583	608	981	java/lang/Exception
    //   611	631	981	java/lang/Exception
    //   636	654	981	java/lang/Exception
    //   654	691	981	java/lang/Exception
    //   829	835	981	java/lang/Exception
    //   973	978	981	java/lang/Exception
    //   978	981	981	java/lang/Exception
    //   1017	1084	981	java/lang/Exception
    //   1087	1114	981	java/lang/Exception
    //   1139	1147	981	java/lang/Exception
    //   1153	1179	981	java/lang/Exception
    //   1179	1187	981	java/lang/Exception
    //   1190	1198	981	java/lang/Exception
    //   1420	1425	981	java/lang/Exception
    //   1425	1428	981	java/lang/Exception
    //   1428	1455	981	java/lang/Exception
    //   1458	1507	981	java/lang/Exception
    //   1510	1545	981	java/lang/Exception
    //   1206	1225	1413	finally
    //   1239	1255	1413	finally
    //   1263	1270	1413	finally
    //   1274	1285	1413	finally
    //   1289	1335	1413	finally
    //   973	978	2430	java/io/IOException
    //   1354	1359	2435	java/io/IOException
    //   1420	1425	2440	java/io/IOException
    //   550	560	2445	java/lang/Exception
    //   564	576	2445	java/lang/Exception
    //   699	709	2445	java/lang/Exception
    //   726	733	2445	java/lang/Exception
    //   737	744	2445	java/lang/Exception
    //   748	775	2445	java/lang/Exception
    //   784	794	2445	java/lang/Exception
    //   798	810	2445	java/lang/Exception
    //   814	822	2445	java/lang/Exception
    //   945	950	2445	java/lang/Exception
    //   1121	1136	2445	java/lang/Exception
    //   1354	1359	2445	java/lang/Exception
    //   1380	1398	2445	java/lang/Exception
    //   2277	2287	2445	java/lang/Exception
    //   2291	2299	2445	java/lang/Exception
    //   2303	2311	2445	java/lang/Exception
    //   2315	2323	2445	java/lang/Exception
    //   2382	2398	2445	java/lang/Exception
    //   207	212	2458	java/lang/Exception
    //   217	225	2458	java/lang/Exception
    //   228	236	2458	java/lang/Exception
    //   1548	1596	2458	java/lang/Exception
    //   1596	1627	2458	java/lang/Exception
    //   1670	1678	2458	java/lang/Exception
    //   2207	2215	2458	java/lang/Exception
    //   2222	2273	2458	java/lang/Exception
    //   2334	2348	2458	java/lang/Exception
    //   2354	2368	2458	java/lang/Exception
    //   2368	2378	2458	java/lang/Exception
    //   2401	2416	2458	java/lang/Exception
    //   1632	1643	2471	java/lang/Exception
    //   1870	1876	2476	java/lang/Exception
    //   1887	1894	2476	java/lang/Exception
    //   1898	1908	2476	java/lang/Exception
    //   1912	1932	2476	java/lang/Exception
    //   1936	1946	2476	java/lang/Exception
    //   1950	1970	2476	java/lang/Exception
    //   1978	1988	2476	java/lang/Exception
    //   1992	2004	2476	java/lang/Exception
    //   2008	2021	2476	java/lang/Exception
    //   2025	2041	2476	java/lang/Exception
    //   2045	2055	2476	java/lang/Exception
    //   2059	2067	2476	java/lang/Exception
    //   2071	2079	2476	java/lang/Exception
    //   2090	2104	2476	java/lang/Exception
    //   2114	2128	2476	java/lang/Exception
    //   2132	2142	2476	java/lang/Exception
    //   2146	2162	2476	java/lang/Exception
    //   2169	2184	2476	java/lang/Exception
    //   1647	1667	2547	java/lang/Exception
    //   1690	1709	2547	java/lang/Exception
    //   1709	1729	2547	java/lang/Exception
    //   1733	1784	2547	java/lang/Exception
    //   1784	1792	2547	java/lang/Exception
    //   1796	1805	2547	java/lang/Exception
    //   1808	1815	2547	java/lang/Exception
    //   1815	1861	2547	java/lang/Exception
    //   2187	2201	2547	java/lang/Exception
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ak/a/f/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */