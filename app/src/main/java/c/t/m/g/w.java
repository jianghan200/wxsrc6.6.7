package c.t.m.g;

import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.Deflater;

public final class w
{
  public static String a;
  private final int b = a("black_list_refresh_gap", 60000, 86400000, 3600000);
  private String c = "";
  private List<n> d = new ArrayList();
  private List<n> e = new ArrayList();
  private List<a> f = new ArrayList();
  
  public w(String paramString)
  {
    this.c = paramString;
    cd.a(paramString, "");
    ac.a().a(new x(this), true, this.b);
  }
  
  public static int a(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    try
    {
      String str2 = a(paramString, m.b());
      String str1 = str2;
      if (TextUtils.isEmpty(str2)) {
        str1 = a(paramString, 0);
      }
      i = Integer.parseInt(str1);
    }
    catch (Throwable paramString)
    {
      for (;;)
      {
        int i = paramInt3;
      }
    }
    return ci.a(i, paramInt1, paramInt2, paramInt3);
  }
  
  private static String a(String paramString, int paramInt)
  {
    String str1 = bf.a().a(p.b());
    String str2 = cd.a(p.g());
    return ((bx)bz.c().a.get("settings")).a(paramString, paramInt, m.e(), m.a, str1, str2);
  }
  
  public static boolean a(String paramString, boolean paramBoolean, Map<String, String> paramMap)
  {
    Object localObject;
    if (paramMap != null)
    {
      localObject = paramMap.keySet().iterator();
      while (((Iterator)localObject).hasNext()) {
        ((Iterator)localObject).next();
      }
    }
    try
    {
      localObject = au.f();
      paramString = au.a(paramString, paramBoolean, paramMap);
      try
      {
        if (((al)localObject).b.getAndIncrement() > ((al)localObject).c) {
          ((al)localObject).b.decrementAndGet();
        } else {
          new al.b((al)localObject, paramString).a(false);
        }
      }
      catch (Throwable paramString) {}
      return true;
    }
    catch (Throwable paramString) {}
  }
  
  public static byte[] a(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0)) {
      return paramArrayOfByte;
    }
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    Deflater localDeflater = new Deflater();
    localDeflater.setInput(paramArrayOfByte);
    localDeflater.finish();
    paramArrayOfByte = new byte['Ā'];
    while (!localDeflater.finished()) {
      localByteArrayOutputStream.write(paramArrayOfByte, 0, localDeflater.deflate(paramArrayOfByte));
    }
    localDeflater.finish();
    localDeflater.end();
    return localByteArrayOutputStream.toByteArray();
  }
  
  /* Error */
  private void c()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new 223	java/lang/StringBuilder
    //   5: dup
    //   6: invokespecial 224	java/lang/StringBuilder:<init>	()V
    //   9: astore_1
    //   10: aload_0
    //   11: getfield 45	c/t/m/g/w:f	Ljava/util/List;
    //   14: invokeinterface 227 1 0
    //   19: astore_2
    //   20: aload_2
    //   21: invokeinterface 152 1 0
    //   26: ifeq +58 -> 84
    //   29: aload_2
    //   30: invokeinterface 156 1 0
    //   35: checkcast 6	c/t/m/g/w$a
    //   38: astore_3
    //   39: aload_1
    //   40: aload_3
    //   41: getfield 230	c/t/m/g/w$a:a	Lc/t/m/g/n;
    //   44: invokevirtual 234	c/t/m/g/n:a	()Ljava/lang/String;
    //   47: invokevirtual 238	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   50: ldc -16
    //   52: invokevirtual 238	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   55: aload_3
    //   56: getfield 243	c/t/m/g/w$a:b	J
    //   59: invokevirtual 246	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   62: ldc -8
    //   64: invokevirtual 238	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: pop
    //   68: goto -48 -> 20
    //   71: astore_1
    //   72: aload_0
    //   73: getfield 36	c/t/m/g/w:c	Ljava/lang/String;
    //   76: ldc 34
    //   78: invokestatic 50	c/t/m/g/cd:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   81: aload_0
    //   82: monitorexit
    //   83: return
    //   84: aload_0
    //   85: getfield 36	c/t/m/g/w:c	Ljava/lang/String;
    //   88: aload_1
    //   89: invokevirtual 251	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   92: invokestatic 50	c/t/m/g/cd:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   95: goto -14 -> 81
    //   98: astore_1
    //   99: aload_0
    //   100: monitorexit
    //   101: aload_1
    //   102: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	103	0	this	w
    //   9	31	1	localStringBuilder	StringBuilder
    //   71	18	1	localThrowable	Throwable
    //   98	4	1	localObject	Object
    //   19	11	2	localIterator	Iterator
    //   38	18	3	locala	a
    // Exception table:
    //   from	to	target	type
    //   2	20	71	java/lang/Throwable
    //   20	68	71	java/lang/Throwable
    //   84	95	71	java/lang/Throwable
    //   2	20	98	finally
    //   20	68	98	finally
    //   72	81	98	finally
    //   84	95	98	finally
  }
  
  final void a()
  {
    int i = 0;
    try
    {
      this.e.clear();
      this.f.clear();
      localObject1 = cd.b(this.c, "");
      boolean bool = TextUtils.isEmpty((CharSequence)localObject1);
      if (!bool) {
        break label48;
      }
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        Object localObject1;
        int j;
        int k;
        cd.a(this.c, "");
      }
    }
    finally {}
    return;
    label48:
    j = a("black_list_outofdate", 60000, 86400000, 7200000);
    localObject1 = ((String)localObject1).split(";");
    k = localObject1.length;
    for (;;)
    {
      if (i < k)
      {
        Object localObject3 = localObject1[i].split("-");
        a locala = localObject3[0];
        long l = Long.parseLong(localObject3[1]);
        if (System.currentTimeMillis() - l < j)
        {
          localObject3 = locala.split(":");
          localObject3 = new n(localObject3[0], Integer.parseInt(localObject3[1]));
          locala = new a((n)localObject3, l);
          this.e.add(localObject3);
          this.f.add(locala);
        }
      }
      else
      {
        c();
        break;
      }
      i += 1;
    }
  }
  
  public final void a(n paramn)
  {
    for (;;)
    {
      try
      {
        Iterator localIterator = this.d.iterator();
        int i;
        if (localIterator.hasNext())
        {
          if (paramn.a((n)localIterator.next()))
          {
            i = 1;
            if (i != 0)
            {
              this.e.add(paramn);
              this.f.add(new a(paramn, System.currentTimeMillis()));
              c();
              return;
            }
            this.d.add(paramn);
          }
        }
        else {
          i = 0;
        }
      }
      finally {}
    }
  }
  
  public final List<n> b()
  {
    try
    {
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = this.e.iterator();
      while (localIterator.hasNext())
      {
        n localn = (n)localIterator.next();
        localArrayList.add(new n(localn.a, localn.b));
      }
    }
    finally {}
    return localList;
  }
  
  public final void b(n paramn)
  {
    for (;;)
    {
      try
      {
        Iterator localIterator = this.d.iterator();
        if (localIterator.hasNext())
        {
          n localn = (n)localIterator.next();
          if (!paramn.a(localn)) {
            continue;
          }
          paramn = localn;
          if (paramn != null) {
            this.d.remove(paramn);
          }
          return;
        }
      }
      finally {}
      paramn = null;
    }
  }
  
  static final class a
  {
    n a;
    long b;
    
    public a(n paramn, long paramLong)
    {
      this.a = paramn;
      this.b = paramLong;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/c/t/m/g/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */