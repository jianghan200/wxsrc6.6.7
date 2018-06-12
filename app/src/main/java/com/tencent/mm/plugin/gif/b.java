package com.tencent.mm.plugin.gif;

import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emoji.PluginEmoji;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.ref.WeakReference;

public class b
{
  private static b khw;
  public com.tencent.mm.a.f<String, WeakReference<d>> khx = new com.tencent.mm.a.f(10);
  com.tencent.mm.a.f<String, WeakReference<a>> khy = new com.tencent.mm.a.f(10, new b.1(this));
  
  /* Error */
  public static b aVQ()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 37	com/tencent/mm/plugin/gif/b:khw	Lcom/tencent/mm/plugin/gif/b;
    //   6: ifnonnull +25 -> 31
    //   9: ldc 2
    //   11: monitorenter
    //   12: getstatic 37	com/tencent/mm/plugin/gif/b:khw	Lcom/tencent/mm/plugin/gif/b;
    //   15: ifnonnull +13 -> 28
    //   18: new 2	com/tencent/mm/plugin/gif/b
    //   21: dup
    //   22: invokespecial 38	com/tencent/mm/plugin/gif/b:<init>	()V
    //   25: putstatic 37	com/tencent/mm/plugin/gif/b:khw	Lcom/tencent/mm/plugin/gif/b;
    //   28: ldc 2
    //   30: monitorexit
    //   31: getstatic 37	com/tencent/mm/plugin/gif/b:khw	Lcom/tencent/mm/plugin/gif/b;
    //   34: astore_0
    //   35: ldc 2
    //   37: monitorexit
    //   38: aload_0
    //   39: areturn
    //   40: astore_0
    //   41: ldc 2
    //   43: monitorexit
    //   44: aload_0
    //   45: athrow
    //   46: astore_0
    //   47: ldc 2
    //   49: monitorexit
    //   50: aload_0
    //   51: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   34	5	0	localb	b
    //   40	5	0	localObject1	Object
    //   46	5	0	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   12	28	40	finally
    //   28	31	40	finally
    //   41	44	40	finally
    //   3	12	46	finally
    //   31	35	46	finally
    //   44	46	46	finally
  }
  
  public final a EA(String paramString)
  {
    a locala = null;
    if (this.khy.get(paramString) != null) {
      locala = (a)((WeakReference)this.khy.get(paramString)).get();
    }
    return locala;
  }
  
  public final a dj(String paramString1, String paramString2)
  {
    a locala = null;
    if (this.khy.get(paramString1) != null) {
      locala = (a)((WeakReference)this.khy.get(paramString1)).get();
    }
    Object localObject = locala;
    long l;
    if (locala == null)
    {
      l = System.currentTimeMillis();
      if (!o.Wg(paramString2)) {
        break label107;
      }
    }
    label107:
    for (paramString2 = new f(paramString2);; paramString2 = new c(paramString2))
    {
      x.d("MicroMsg.GIF.MMAnimateDrawableCacheMgr", "new MMAnimateDrawable use time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      this.khy.put(paramString1, new WeakReference(paramString2));
      localObject = paramString2;
      return (a)localObject;
    }
  }
  
  public final a q(String paramString, byte[] paramArrayOfByte)
  {
    a locala = null;
    Object localObject = null;
    if (paramArrayOfByte == null)
    {
      paramString = (String)localObject;
      return paramString;
    }
    if (this.khy.get(paramString) != null) {
      locala = (a)((WeakReference)this.khy.get(paramString)).get();
    }
    localObject = locala;
    if (locala == null) {
      if ((!o.bx(paramArrayOfByte)) || (!((PluginEmoji)g.n(PluginEmoji.class)).getEmojiMgr().aEa())) {
        break label118;
      }
    }
    label118:
    for (localObject = new f(paramArrayOfByte);; localObject = new c(paramArrayOfByte))
    {
      this.khy.put(paramString, new WeakReference(localObject));
      paramString = (String)localObject;
      if (((a)localObject).isRunning()) {
        break;
      }
      ((a)localObject).reset();
      return (a)localObject;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/gif/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */