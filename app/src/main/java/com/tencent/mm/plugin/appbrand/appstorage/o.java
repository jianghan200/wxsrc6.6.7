package com.tencent.mm.plugin.appbrand.appstorage;

import com.tencent.mm.plugin.appbrand.appcache.a;
import com.tencent.mm.plugin.appbrand.appcache.ag;
import com.tencent.mm.plugin.appbrand.appcache.ag.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public final class o
  extends g
{
  private final ag fgC;
  
  public o(ag paramag)
  {
    this.fgC = paramag;
  }
  
  public final j a(String paramString, FileStructStat paramFileStructStat)
  {
    InputStream localInputStream = this.fgC.qN(paramString);
    if (localInputStream == null) {
      return j.fkO;
    }
    ag localag = this.fgC;
    FileStructStat localFileStructStat2 = localag.fhc;
    FileStructStat localFileStructStat1 = localFileStructStat2;
    if (localFileStructStat2 == null)
    {
      localFileStructStat1 = new FileStructStat();
      FileStat.stat(localag.fgV.getAbsolutePath(), localFileStructStat1);
      localag.fhc = localFileStructStat1;
    }
    localFileStructStat1.fillAnother(paramFileStructStat);
    try
    {
      paramFileStructStat.st_size = localInputStream.available();
      bi.d(localInputStream);
      return j.fkI;
    }
    catch (Exception paramFileStructStat)
    {
      for (;;)
      {
        x.e("MicroMsg.WxaPkgFileSystem", "stat(), %s stream.available fail", new Object[] { paramString });
      }
    }
  }
  
  /* Error */
  public final j a(String paramString, com.tencent.mm.plugin.appbrand.q.h<java.nio.ByteBuffer> paramh)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 13	com/tencent/mm/plugin/appbrand/appstorage/o:fgC	Lcom/tencent/mm/plugin/appbrand/appcache/ag;
    //   4: aload_1
    //   5: invokevirtual 24	com/tencent/mm/plugin/appbrand/appcache/ag:qN	(Ljava/lang/String;)Ljava/io/InputStream;
    //   8: astore_1
    //   9: aload_1
    //   10: ifnonnull +7 -> 17
    //   13: getstatic 30	com/tencent/mm/plugin/appbrand/appstorage/j:fkO	Lcom/tencent/mm/plugin/appbrand/appstorage/j;
    //   16: areturn
    //   17: aload_1
    //   18: invokevirtual 63	java/io/InputStream:available	()I
    //   21: invokestatic 95	java/nio/ByteBuffer:allocateDirect	(I)Ljava/nio/ByteBuffer;
    //   24: astore_3
    //   25: aload_1
    //   26: instanceof 97
    //   29: ifeq +35 -> 64
    //   32: aload_3
    //   33: aload_1
    //   34: checkcast 97	com/tencent/mm/plugin/appbrand/l/a
    //   37: getfield 101	com/tencent/mm/plugin/appbrand/l/a:gqu	Ljava/nio/ByteBuffer;
    //   40: invokevirtual 105	java/nio/ByteBuffer:put	(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    //   43: pop
    //   44: aload_3
    //   45: invokevirtual 109	java/nio/ByteBuffer:rewind	()Ljava/nio/Buffer;
    //   48: pop
    //   49: aload_2
    //   50: aload_3
    //   51: putfield 115	com/tencent/mm/plugin/appbrand/q/h:value	Ljava/lang/Object;
    //   54: getstatic 76	com/tencent/mm/plugin/appbrand/appstorage/j:fkI	Lcom/tencent/mm/plugin/appbrand/appstorage/j;
    //   57: astore_2
    //   58: aload_1
    //   59: invokestatic 73	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   62: aload_2
    //   63: areturn
    //   64: aload_3
    //   65: aload_1
    //   66: invokestatic 121	com/tencent/mm/plugin/appbrand/q/c:p	(Ljava/io/InputStream;)[B
    //   69: invokestatic 125	java/nio/ByteBuffer:wrap	([B)Ljava/nio/ByteBuffer;
    //   72: invokevirtual 105	java/nio/ByteBuffer:put	(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    //   75: pop
    //   76: goto -32 -> 44
    //   79: astore_2
    //   80: ldc 78
    //   82: aload_2
    //   83: ldc 127
    //   85: iconst_0
    //   86: anewarray 82	java/lang/Object
    //   89: invokestatic 131	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   92: aload_1
    //   93: invokestatic 73	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   96: getstatic 134	com/tencent/mm/plugin/appbrand/appstorage/j:fkJ	Lcom/tencent/mm/plugin/appbrand/appstorage/j;
    //   99: areturn
    //   100: astore_2
    //   101: aload_1
    //   102: invokestatic 73	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   105: aload_2
    //   106: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	107	0	this	o
    //   0	107	1	paramString	String
    //   0	107	2	paramh	com.tencent.mm.plugin.appbrand.q.h<java.nio.ByteBuffer>
    //   24	41	3	localByteBuffer	java.nio.ByteBuffer
    // Exception table:
    //   from	to	target	type
    //   17	44	79	java/lang/Exception
    //   44	58	79	java/lang/Exception
    //   64	76	79	java/lang/Exception
    //   17	44	100	finally
    //   44	58	100	finally
    //   64	76	100	finally
    //   80	92	100	finally
  }
  
  public final j b(String paramString, com.tencent.mm.plugin.appbrand.q.h<List<h>> paramh)
  {
    if (ra(paramString) == j.fkI) {
      return j.fkQ;
    }
    String str = a.qC(paramString);
    Object localObject = this.fgC;
    paramString = new LinkedList();
    localObject = ((ag)localObject).fhb.values().iterator();
    while (((Iterator)localObject).hasNext()) {
      paramString.add((ag.a)((Iterator)localObject).next());
    }
    localObject = Pattern.quote(str);
    Iterator localIterator = paramString.iterator();
    while (localIterator.hasNext())
    {
      paramString = (ag.a)localIterator.next();
      if (paramString.fileName.startsWith(str))
      {
        paramString = paramString.fileName.replaceFirst((String)localObject, "");
        if (paramString.split("/").length <= 1)
        {
          h localh = new h();
          localh.fileName = paramString;
          if (paramh.value == null) {}
          for (paramString = new LinkedList();; paramString = (List)paramh.value)
          {
            paramh.value = paramString;
            ((List)paramh.value).add(localh);
            break;
          }
        }
      }
    }
    if (paramh.value == null) {
      return j.fkO;
    }
    return j.fkI;
  }
  
  public final boolean bV(String paramString)
  {
    return true;
  }
  
  public final void initialize()
  {
    this.fgC.abW();
  }
  
  public final j ra(String paramString)
  {
    paramString = this.fgC.qN(paramString);
    if (paramString == null) {
      return j.fkO;
    }
    bi.d(paramString);
    return j.fkI;
  }
  
  public final void release()
  {
    this.fgC.close();
  }
  
  public final j rf(String paramString)
  {
    return b(paramString, new com.tencent.mm.plugin.appbrand.q.h());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appstorage/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */