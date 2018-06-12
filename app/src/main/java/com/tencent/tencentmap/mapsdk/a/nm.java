package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import android.os.Handler;
import android.os.Message;

public class nm
{
  private boolean a = true;
  private byte[] b = new byte[0];
  private int c = 0;
  private int d = 5000;
  private Context e;
  private ni f;
  
  public nm(Context paramContext, ni paramni)
  {
    this.e = paramContext;
    this.f = paramni;
  }
  
  /* Error */
  private void f()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 24	com/tencent/tencentmap/mapsdk/a/nm:b	[B
    //   6: astore_1
    //   7: aload_1
    //   8: monitorenter
    //   9: getstatic 43	com/tencent/tencentmap/mapsdk/a/kh:f	Lcom/tencent/tencentmap/mapsdk/a/kh$a;
    //   12: getstatic 47	com/tencent/tencentmap/mapsdk/a/kh$a:c	Lcom/tencent/tencentmap/mapsdk/a/kh$a;
    //   15: if_acmpeq +8 -> 23
    //   18: aload_1
    //   19: monitorexit
    //   20: aload_0
    //   21: monitorexit
    //   22: return
    //   23: aload_1
    //   24: monitorexit
    //   25: new 49	com/tencent/tencentmap/mapsdk/a/mn
    //   28: dup
    //   29: aload_0
    //   30: getfield 30	com/tencent/tencentmap/mapsdk/a/nm:e	Landroid/content/Context;
    //   33: invokespecial 52	com/tencent/tencentmap/mapsdk/a/mn:<init>	(Landroid/content/Context;)V
    //   36: invokevirtual 55	com/tencent/tencentmap/mapsdk/a/mn:a	()Ljava/lang/Integer;
    //   39: astore_2
    //   40: aload_2
    //   41: ifnull -21 -> 20
    //   44: aload_0
    //   45: getfield 24	com/tencent/tencentmap/mapsdk/a/nm:b	[B
    //   48: astore_1
    //   49: aload_1
    //   50: monitorenter
    //   51: aload_2
    //   52: invokevirtual 61	java/lang/Integer:intValue	()I
    //   55: ifne +59 -> 114
    //   58: getstatic 63	com/tencent/tencentmap/mapsdk/a/kh$a:a	Lcom/tencent/tencentmap/mapsdk/a/kh$a;
    //   61: putstatic 43	com/tencent/tencentmap/mapsdk/a/kh:f	Lcom/tencent/tencentmap/mapsdk/a/kh$a;
    //   64: invokestatic 69	java/util/Calendar:getInstance	()Ljava/util/Calendar;
    //   67: iconst_1
    //   68: invokevirtual 73	java/util/Calendar:get	(I)I
    //   71: putstatic 76	com/tencent/tencentmap/mapsdk/a/kh:g	I
    //   74: invokestatic 69	java/util/Calendar:getInstance	()Ljava/util/Calendar;
    //   77: iconst_2
    //   78: invokevirtual 73	java/util/Calendar:get	(I)I
    //   81: putstatic 79	com/tencent/tencentmap/mapsdk/a/kh:h	I
    //   84: invokestatic 69	java/util/Calendar:getInstance	()Ljava/util/Calendar;
    //   87: iconst_5
    //   88: invokevirtual 73	java/util/Calendar:get	(I)I
    //   91: putstatic 82	com/tencent/tencentmap/mapsdk/a/kh:i	I
    //   94: aload_1
    //   95: monitorexit
    //   96: goto -76 -> 20
    //   99: astore_2
    //   100: aload_1
    //   101: monitorexit
    //   102: aload_2
    //   103: athrow
    //   104: astore_1
    //   105: aload_0
    //   106: monitorexit
    //   107: aload_1
    //   108: athrow
    //   109: astore_2
    //   110: aload_1
    //   111: monitorexit
    //   112: aload_2
    //   113: athrow
    //   114: getstatic 84	com/tencent/tencentmap/mapsdk/a/kh$a:b	Lcom/tencent/tencentmap/mapsdk/a/kh$a;
    //   117: putstatic 43	com/tencent/tencentmap/mapsdk/a/kh:f	Lcom/tencent/tencentmap/mapsdk/a/kh$a;
    //   120: goto -56 -> 64
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	123	0	this	nm
    //   104	7	1	localObject1	Object
    //   39	13	2	localInteger	Integer
    //   99	4	2	localObject2	Object
    //   109	4	2	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   51	64	99	finally
    //   64	96	99	finally
    //   100	102	99	finally
    //   114	120	99	finally
    //   2	9	104	finally
    //   25	40	104	finally
    //   44	51	104	finally
    //   102	104	104	finally
    //   112	114	104	finally
    //   9	20	109	finally
    //   23	25	109	finally
    //   110	112	109	finally
  }
  
  private void g()
  {
    synchronized (this.b)
    {
      if (!this.a) {
        return;
      }
      if (kh.f != kh.a.c) {
        kh.f = kh.a.c;
      }
      h();
      return;
    }
  }
  
  private void h()
  {
    synchronized (this.b)
    {
      if (this.c > 0) {
        return;
      }
      this.c += 1;
      new nm.1(this).execute(new String[] { "" });
      return;
    }
  }
  
  public void a()
  {
    synchronized (this.b)
    {
      this.a = false;
      return;
    }
  }
  
  public void b()
  {
    synchronized (this.b)
    {
      this.a = true;
      return;
    }
  }
  
  public void c()
  {
    g();
  }
  
  public void d()
  {
    synchronized (this.b)
    {
      this.a = false;
      return;
    }
  }
  
  public void e()
  {
    if ((this.f != null) && (this.f.a != null))
    {
      Object localObject = new lh();
      ((lh)localObject).a = 3;
      localObject = this.f.a.obtainMessage(((lh)localObject).a, localObject);
      this.f.a.sendMessage((Message)localObject);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/nm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */