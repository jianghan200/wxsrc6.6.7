package com.tencent.mm.plugin.gallery.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.util.SparseArray;
import com.tencent.mm.protocal.c.anp;
import com.tencent.mm.protocal.c.anq;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.c;
import com.tencent.mm.sdk.platformtools.x;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class d
{
  boolean iWf = true;
  private File jAG;
  List<RandomAccessFile> jAH;
  SparseArray<anq> jAI;
  int jAJ;
  
  d(File paramFile)
  {
    if (!paramFile.isDirectory())
    {
      boolean bool = paramFile.mkdirs();
      x.d("MicroMsg.DiskCache", "dir[%s] not exist, try to create it, result[%B]", new Object[] { paramFile.getAbsolutePath(), Boolean.valueOf(bool) });
    }
    this.jAG = paramFile;
    this.jAI = new SparseArray();
  }
  
  static void f(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      return;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.DiskCache", "want close %s fail: %s", new Object[] { paramCloseable.getClass().getName(), localException.getMessage() });
      x.printErrStackTrace("MicroMsg.DiskCache", localException, "", new Object[0]);
    }
  }
  
  private static String qr(int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder("cache.data");
    if (paramInt == 0) {}
    for (String str = "";; str = "." + paramInt) {
      return str;
    }
  }
  
  final void aRn()
  {
    File localFile = new File(this.jAG, "cache.idx");
    Object localObject2 = new anp();
    String str = localFile.getAbsolutePath();
    Object localObject1 = localObject2;
    if (!bi.oW(str)) {}
    try
    {
      ((anp)localObject2).aG(bi.readFromFile(str));
      localObject1 = localObject2;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.e("MicroMsg.DiskCache", "load index file error");
        x.printErrStackTrace("MicroMsg.DiskCache", localException, "", new Object[0]);
        qp(-1);
        anp localanp1 = new anp();
      }
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      for (;;)
      {
        x.e("MicroMsg.DiskCache", "load index file error, OOM, index length %s", new Object[] { Long.valueOf(localFile.length()) });
        x.printErrStackTrace("MicroMsg.DiskCache", localOutOfMemoryError, "", new Object[0]);
        qp(-1);
        anp localanp2 = new anp();
      }
    }
    this.jAI.clear();
    localObject1 = ((anp)localObject1).rQq.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (anq)((Iterator)localObject1).next();
      this.jAI.put(((anq)localObject2).key, localObject2);
    }
  }
  
  final void aRo()
  {
    anp localanp = new anp();
    int i = 0;
    while (i < this.jAI.size())
    {
      localObject = (anq)this.jAI.valueAt(i);
      localanp.rQq.add(0, localObject);
      x.v("MicroMsg.DiskCache", "index info{key[%s] beg[%d] length[%d] file_suffix[%d]}", new Object[] { Integer.valueOf(((anq)localObject).key), Long.valueOf(((anq)localObject).rQr), Integer.valueOf(((anq)localObject).length), Integer.valueOf(((anq)localObject).rQs) });
      i += 1;
    }
    Object localObject = new File(this.jAG, "cache.idx");
    try
    {
      bi.r(((File)localObject).getAbsolutePath(), localanp.toByteArray());
      return;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.DiskCache", "save index data error: %s", new Object[] { localException.getMessage() });
      x.printErrStackTrace("MicroMsg.DiskCache", localException, "", new Object[0]);
    }
  }
  
  /* Error */
  final void aRp()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 233	com/tencent/mm/plugin/gallery/model/d:jAH	Ljava/util/List;
    //   6: ifnull +17 -> 23
    //   9: aload_0
    //   10: getfield 233	com/tencent/mm/plugin/gallery/model/d:jAH	Ljava/util/List;
    //   13: invokeinterface 236 1 0
    //   18: istore_1
    //   19: iload_1
    //   20: ifgt +6 -> 26
    //   23: aload_0
    //   24: monitorexit
    //   25: return
    //   26: aload_0
    //   27: getfield 233	com/tencent/mm/plugin/gallery/model/d:jAH	Ljava/util/List;
    //   30: invokeinterface 237 1 0
    //   35: astore_2
    //   36: aload_2
    //   37: invokeinterface 156 1 0
    //   42: ifeq -19 -> 23
    //   45: aload_2
    //   46: invokeinterface 160 1 0
    //   51: checkcast 239	java/io/RandomAccessFile
    //   54: invokestatic 241	com/tencent/mm/plugin/gallery/model/d:f	(Ljava/io/Closeable;)V
    //   57: goto -21 -> 36
    //   60: astore_2
    //   61: aload_0
    //   62: monitorexit
    //   63: aload_2
    //   64: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	65	0	this	d
    //   18	2	1	i	int
    //   35	11	2	localIterator	Iterator
    //   60	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	19	60	finally
    //   26	36	60	finally
    //   36	57	60	finally
  }
  
  /* Error */
  public final int aRq()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aload_0
    //   3: monitorenter
    //   4: iload_2
    //   5: istore_1
    //   6: aload_0
    //   7: getfield 233	com/tencent/mm/plugin/gallery/model/d:jAH	Ljava/util/List;
    //   10: ifnull +19 -> 29
    //   13: aload_0
    //   14: getfield 233	com/tencent/mm/plugin/gallery/model/d:jAH	Ljava/util/List;
    //   17: invokeinterface 236 1 0
    //   22: istore_1
    //   23: iload_1
    //   24: ifgt +9 -> 33
    //   27: iload_2
    //   28: istore_1
    //   29: aload_0
    //   30: monitorexit
    //   31: iload_1
    //   32: ireturn
    //   33: aload_0
    //   34: getfield 233	com/tencent/mm/plugin/gallery/model/d:jAH	Ljava/util/List;
    //   37: invokeinterface 237 1 0
    //   42: astore 5
    //   44: iconst_m1
    //   45: istore_1
    //   46: aload 5
    //   48: invokeinterface 156 1 0
    //   53: ifeq +40 -> 93
    //   56: aload 5
    //   58: invokeinterface 160 1 0
    //   63: checkcast 239	java/io/RandomAccessFile
    //   66: astore 6
    //   68: iload_1
    //   69: iconst_1
    //   70: iadd
    //   71: istore_2
    //   72: aload 6
    //   74: invokevirtual 245	java/io/RandomAccessFile:length	()J
    //   77: lstore_3
    //   78: iload_2
    //   79: istore_1
    //   80: lload_3
    //   81: ldc2_w 246
    //   84: lcmp
    //   85: ifge -39 -> 46
    //   88: iload_2
    //   89: istore_1
    //   90: goto -61 -> 29
    //   93: iconst_m1
    //   94: istore_1
    //   95: goto -66 -> 29
    //   98: astore 5
    //   100: ldc 34
    //   102: aload 5
    //   104: ldc 88
    //   106: iconst_0
    //   107: anewarray 4	java/lang/Object
    //   110: invokestatic 92	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   113: iconst_m1
    //   114: istore_1
    //   115: goto -86 -> 29
    //   118: astore 5
    //   120: aload_0
    //   121: monitorexit
    //   122: aload 5
    //   124: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	125	0	this	d
    //   5	110	1	i	int
    //   1	88	2	j	int
    //   77	4	3	l	long
    //   42	15	5	localIterator	Iterator
    //   98	5	5	localIOException	java.io.IOException
    //   118	5	5	localObject	Object
    //   66	7	6	localRandomAccessFile	RandomAccessFile
    // Exception table:
    //   from	to	target	type
    //   33	44	98	java/io/IOException
    //   46	68	98	java/io/IOException
    //   72	78	98	java/io/IOException
    //   6	23	118	finally
    //   33	44	118	finally
    //   46	68	118	finally
    //   72	78	118	finally
    //   100	113	118	finally
  }
  
  public final void aRr()
  {
    ad.getContext().getSharedPreferences(ad.chY(), 0).edit().putInt("com.tencent.mm.gallery.cache.suffix", this.jAJ).commit();
  }
  
  final void qo(int paramInt)
  {
    int i = 0;
    if (paramInt >= 0) {}
    try
    {
      if (this.jAH == null)
      {
        this.jAH = new ArrayList();
        paramInt = i;
        while (paramInt < 25)
        {
          localRandomAccessFile = new RandomAccessFile(new File(this.jAG, qr(paramInt)), "rw");
          this.jAH.add(localRandomAccessFile);
          paramInt += 1;
        }
      }
      RandomAccessFile localRandomAccessFile = new RandomAccessFile(new File(this.jAG, qr(paramInt)), "rw");
      this.jAH.remove(paramInt);
      this.jAH.add(paramInt, localRandomAccessFile);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.e("MicroMsg.DiskCache", "create data file error: %s", new Object[] { localException.getMessage() });
        x.printErrStackTrace("MicroMsg.DiskCache", localException, "", new Object[0]);
        this.jAH = null;
      }
    }
    finally {}
  }
  
  final void qp(int paramInt)
  {
    int j = 0;
    if ((this.jAH == null) || (this.jAH.size() <= 0)) {
      return;
    }
    if (paramInt < 0)
    {
      new File(this.jAG, "cache.idx").delete();
      this.jAI.clear();
    }
    for (;;)
    {
      if (paramInt >= 0) {
        break label217;
      }
      aRp();
      paramInt = j;
      while (paramInt < 25)
      {
        new File(this.jAG, qr(25)).delete();
        paramInt += 1;
      }
      break;
      SparseArray localSparseArray = new SparseArray();
      int i = 0;
      while (i < this.jAI.size())
      {
        anq localanq = (anq)this.jAI.valueAt(i);
        if (localanq.rQs != paramInt) {
          localSparseArray.put(this.jAI.keyAt(i), localanq);
        }
        x.v("MicroMsg.DiskCache", "index info{key[%s] beg[%d] length[%d]}", new Object[] { Integer.valueOf(localanq.key), Long.valueOf(localanq.rQr), Integer.valueOf(localanq.length) });
        i += 1;
      }
      this.jAI = localSparseArray;
      aRo();
    }
    label217:
    f((Closeable)this.jAH.get(paramInt));
    new File(this.jAG, qr(paramInt)).delete();
  }
  
  public final Bitmap qq(int paramInt)
  {
    if ((this.jAH == null) || (this.jAH.size() <= 0))
    {
      x.e("MicroMsg.DiskCache", "want to get bitmap, but data file is null");
      return null;
    }
    Object localObject = (anq)this.jAI.get(paramInt);
    if (localObject != null)
    {
      byte[] arrayOfByte = new byte[((anq)localObject).length];
      try
      {
        x.d("MicroMsg.DiskCache", "read data, beg pos %d, length %d", new Object[] { Long.valueOf(((anq)localObject).rQr), Integer.valueOf(((anq)localObject).length) });
        RandomAccessFile localRandomAccessFile = (RandomAccessFile)this.jAH.get(((anq)localObject).rQs);
        localRandomAccessFile.seek(((anq)localObject).rQr);
        localRandomAccessFile.read(arrayOfByte, 0, ((anq)localObject).length);
        localObject = c.bs(arrayOfByte);
        if (localObject != null)
        {
          x.d("MicroMsg.DiskCache", "get bitmap from disk cache ok, wh[%d, %d]", new Object[] { Integer.valueOf(((Bitmap)localObject).getWidth()), Integer.valueOf(((Bitmap)localObject).getHeight()) });
          return (Bitmap)localObject;
        }
      }
      catch (Exception localException)
      {
        x.w("MicroMsg.DiskCache", "read data fail, key[%d]: %s", new Object[] { Integer.valueOf(paramInt), localException.getMessage() });
        x.printErrStackTrace("MicroMsg.DiskCache", localException, "", new Object[0]);
        this.jAI.remove(paramInt);
        return null;
      }
      this.jAI.remove(paramInt);
      return localException;
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/gallery/model/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */