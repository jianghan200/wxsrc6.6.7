package com.tencent.mm.plugin.appbrand.s;

import com.tencent.mm.plugin.appbrand.s.d.d.a;
import com.tencent.mm.plugin.appbrand.s.e.h;
import com.tencent.mm.plugin.appbrand.s.e.i;
import com.tencent.mm.sdk.platformtools.x;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public final class c
  implements a
{
  public static boolean DEBUG;
  public static int gCJ = 16384;
  public static final List<com.tencent.mm.plugin.appbrand.s.b.a> gCK;
  public SelectionKey gCL;
  public ByteChannel gCM;
  public final BlockingQueue<ByteBuffer> gCN;
  public final BlockingQueue<ByteBuffer> gCO;
  private volatile boolean gCP = false;
  private int gCQ = a.a.gCz;
  public final d gCR;
  private List<com.tencent.mm.plugin.appbrand.s.b.a> gCS;
  public com.tencent.mm.plugin.appbrand.s.b.a gCT = null;
  public int gCU;
  private d.a gCV = null;
  private ByteBuffer gCW = ByteBuffer.allocate(0);
  public com.tencent.mm.plugin.appbrand.s.e.a gCX = null;
  private String gCY = null;
  private Integer gCZ = null;
  private Boolean gDa = null;
  public String gDb = null;
  
  static
  {
    DEBUG = false;
    ArrayList localArrayList = new ArrayList(4);
    gCK = localArrayList;
    localArrayList.add(new com.tencent.mm.plugin.appbrand.s.b.c());
    gCK.add(new com.tencent.mm.plugin.appbrand.s.b.b());
    gCK.add(new com.tencent.mm.plugin.appbrand.s.b.d());
  }
  
  public c(d paramd, com.tencent.mm.plugin.appbrand.s.b.a parama)
  {
    if ((paramd == null) || ((parama == null) && (this.gCU == a.b.gCG))) {
      throw new IllegalArgumentException("parameters must not be null");
    }
    this.gCN = new LinkedBlockingQueue();
    this.gCO = new LinkedBlockingQueue();
    this.gCR = paramd;
    this.gCU = a.b.gCF;
    if (parama != null) {
      this.gCT = parama.aoI();
    }
  }
  
  private void a(com.tencent.mm.plugin.appbrand.s.c.b paramb)
  {
    d(paramb.gDF, paramb.getMessage(), false);
  }
  
  private void c(com.tencent.mm.plugin.appbrand.s.e.f paramf)
  {
    if (DEBUG) {
      x.i("MicroMsg.AppBrandNetWork.WebSocketImpl", "open using draft: " + this.gCT.getClass().getSimpleName());
    }
    this.gCQ = a.a.gCB;
    try
    {
      this.gCR.d(paramf);
      return;
    }
    catch (RuntimeException paramf)
    {
      this.gCR.f(paramf);
    }
  }
  
  /* Error */
  private void e(int paramInt, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 77	com/tencent/mm/plugin/appbrand/s/c:gCP	Z
    //   6: istore 4
    //   8: iload 4
    //   10: ifeq +6 -> 16
    //   13: aload_0
    //   14: monitorexit
    //   15: return
    //   16: aload_0
    //   17: iload_1
    //   18: invokestatic 204	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   21: putfield 102	com/tencent/mm/plugin/appbrand/s/c:gCZ	Ljava/lang/Integer;
    //   24: aload_0
    //   25: aload_2
    //   26: putfield 100	com/tencent/mm/plugin/appbrand/s/c:gCY	Ljava/lang/String;
    //   29: aload_0
    //   30: iload_3
    //   31: invokestatic 209	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   34: putfield 104	com/tencent/mm/plugin/appbrand/s/c:gDa	Ljava/lang/Boolean;
    //   37: aload_0
    //   38: iconst_1
    //   39: putfield 77	com/tencent/mm/plugin/appbrand/s/c:gCP	Z
    //   42: aload_0
    //   43: getfield 86	com/tencent/mm/plugin/appbrand/s/c:gCT	Lcom/tencent/mm/plugin/appbrand/s/b/a;
    //   46: ifnull +10 -> 56
    //   49: aload_0
    //   50: getfield 86	com/tencent/mm/plugin/appbrand/s/c:gCT	Lcom/tencent/mm/plugin/appbrand/s/b/a;
    //   53: invokevirtual 212	com/tencent/mm/plugin/appbrand/s/b/a:reset	()V
    //   56: aload_0
    //   57: aconst_null
    //   58: putfield 98	com/tencent/mm/plugin/appbrand/s/c:gCX	Lcom/tencent/mm/plugin/appbrand/s/e/a;
    //   61: goto -48 -> 13
    //   64: astore_2
    //   65: aload_0
    //   66: monitorexit
    //   67: aload_2
    //   68: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	69	0	this	c
    //   0	69	1	paramInt	int
    //   0	69	2	paramString	String
    //   0	69	3	paramBoolean	boolean
    //   6	3	4	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	8	64	finally
    //   16	56	64	finally
    //   56	61	64	finally
  }
  
  private boolean m(ByteBuffer paramByteBuffer)
  {
    ByteBuffer localByteBuffer;
    if (this.gCW.capacity() == 0) {
      localByteBuffer = paramByteBuffer;
    }
    for (;;)
    {
      localByteBuffer.mark();
      try
      {
        if (this.gCU == a.b.gCG) {
          if (this.gCT == null)
          {
            Iterator localIterator = this.gCS.iterator();
            label47:
            if (localIterator.hasNext())
            {
              com.tencent.mm.plugin.appbrand.s.b.a locala1 = ((com.tencent.mm.plugin.appbrand.s.b.a)localIterator.next()).aoI();
              try
              {
                locala1.lS(this.gCU);
                localByteBuffer.reset();
                Object localObject2 = locala1.t(localByteBuffer);
                if (!(localObject2 instanceof com.tencent.mm.plugin.appbrand.s.e.a))
                {
                  e(1002, "wrong http function", false);
                  return false;
                  if (this.gCW.remaining() < paramByteBuffer.remaining())
                  {
                    localByteBuffer = ByteBuffer.allocate(this.gCW.capacity() + paramByteBuffer.remaining());
                    this.gCW.flip();
                    localByteBuffer.put(this.gCW);
                    this.gCW = localByteBuffer;
                  }
                  this.gCW.put(paramByteBuffer);
                  this.gCW.flip();
                  localByteBuffer = this.gCW;
                  continue;
                }
                localObject2 = (com.tencent.mm.plugin.appbrand.s.e.a)localObject2;
                if (locala1.c((com.tencent.mm.plugin.appbrand.s.e.a)localObject2) != com.tencent.mm.plugin.appbrand.s.b.a.b.gDw) {
                  break label47;
                }
                this.gDb = ((com.tencent.mm.plugin.appbrand.s.e.a)localObject2).aoO();
                try
                {
                  i locali = this.gCR.aoD();
                  ar(com.tencent.mm.plugin.appbrand.s.b.a.e(locala1.a((com.tencent.mm.plugin.appbrand.s.e.a)localObject2, locali)));
                  this.gCT = locala1;
                  c((com.tencent.mm.plugin.appbrand.s.e.f)localObject2);
                  return true;
                }
                catch (com.tencent.mm.plugin.appbrand.s.c.b localb)
                {
                  e(localb.gDF, localb.getMessage(), false);
                  return false;
                }
                catch (RuntimeException localRuntimeException)
                {
                  this.gCR.f(localRuntimeException);
                  e(-1, localRuntimeException.getMessage(), false);
                  return false;
                }
              }
              catch (com.tencent.mm.plugin.appbrand.s.c.d locald2)
              {
                x.e("MicroMsg.AppBrandNetWork.WebSocketImpl", "InvalidHandshakeException e: " + locald2.toString());
              }
            }
          }
        }
        Object localObject1;
        int j;
        int i;
        return false;
      }
      catch (com.tencent.mm.plugin.appbrand.s.c.d locald1)
      {
        x.e("MicroMsg.AppBrandNetWork.WebSocketImpl", "decodeHandshake: " + locald1.toString());
        a(locald1);
        for (;;)
        {
          return false;
          if (this.gCT != null) {
            break;
          }
          d(1002, "no draft matches", false);
          break;
          localObject1 = this.gCT.t(localByteBuffer);
          if (!(localObject1 instanceof com.tencent.mm.plugin.appbrand.s.e.a))
          {
            e(1002, "wrong http function", false);
            return false;
          }
          localObject1 = (com.tencent.mm.plugin.appbrand.s.e.a)localObject1;
          if (this.gCT.c((com.tencent.mm.plugin.appbrand.s.e.a)localObject1) == com.tencent.mm.plugin.appbrand.s.b.a.b.gDw)
          {
            c((com.tencent.mm.plugin.appbrand.s.e.f)localObject1);
            return true;
          }
          d(1002, "the handshake did finaly not match", false);
          return false;
          if (this.gCU == a.b.gCF)
          {
            this.gCT.lS(this.gCU);
            localObject1 = this.gCT.t(localByteBuffer);
            if (!(localObject1 instanceof h))
            {
              e(1002, "wrong http function", false);
              return false;
            }
            localObject1 = (h)localObject1;
            if (this.gCT.a(this.gCX, (h)localObject1) == com.tencent.mm.plugin.appbrand.s.b.a.b.gDw)
            {
              c((com.tencent.mm.plugin.appbrand.s.e.f)localObject1);
              return true;
            }
            d(1002, "draft refuses handshake" + ((h)localObject1).aoP(), false);
          }
        }
      }
      catch (com.tencent.mm.plugin.appbrand.s.c.a locala)
      {
        for (;;)
        {
          x.e("MicroMsg.AppBrandNetWork.WebSocketImpl", "decodeHandshake: " + locala.toString());
          if (this.gCW.capacity() == 0)
          {
            localByteBuffer.reset();
            j = locala.gDE;
            i = j;
            if (j == 0) {
              i = localByteBuffer.capacity() + 16;
            }
            this.gCW = ByteBuffer.allocate(i);
            this.gCW.put(paramByteBuffer);
          }
          else
          {
            this.gCW.position(this.gCW.limit());
            this.gCW.limit(this.gCW.capacity());
          }
        }
      }
    }
  }
  
  private void n(ByteBuffer paramByteBuffer)
  {
    for (;;)
    {
      d.a locala1;
      boolean bool;
      int i;
      try
      {
        Iterator localIterator = this.gCT.s(paramByteBuffer).iterator();
        if (localIterator.hasNext())
        {
          paramByteBuffer = (com.tencent.mm.plugin.appbrand.s.d.d)localIterator.next();
          if (DEBUG) {
            x.i("MicroMsg.AppBrandNetWork.WebSocketImpl", "matched frame: " + paramByteBuffer);
          }
          locala1 = paramByteBuffer.aoN();
          bool = paramByteBuffer.aoL();
          if (locala1 != d.a.gDN) {
            break label211;
          }
          i = 1005;
          if (!(paramByteBuffer instanceof com.tencent.mm.plugin.appbrand.s.d.a)) {
            break label480;
          }
          paramByteBuffer = (com.tencent.mm.plugin.appbrand.s.d.a)paramByteBuffer;
          i = paramByteBuffer.aoJ();
          paramByteBuffer = paramByteBuffer.getMessage();
          if (this.gCQ == a.a.gCC) {
            Q(i, paramByteBuffer);
          }
        }
        else
        {
          return;
        }
      }
      catch (com.tencent.mm.plugin.appbrand.s.c.b paramByteBuffer)
      {
        x.e("MicroMsg.AppBrandNetWork.WebSocketImpl", "decodeFrames: " + paramByteBuffer.toString());
        this.gCR.f(paramByteBuffer);
        a(paramByteBuffer);
      }
      if (this.gCT.aoH() == com.tencent.mm.plugin.appbrand.s.b.a.a.gDu)
      {
        d(i, paramByteBuffer, true);
      }
      else
      {
        e(i, paramByteBuffer, false);
        continue;
        label211:
        if (locala1 == d.a.gDL)
        {
          this.gCR.a(this, paramByteBuffer);
        }
        else if (locala1 != d.a.gDM)
        {
          if ((!bool) || (locala1 == d.a.gDI))
          {
            if (locala1 != d.a.gDI)
            {
              if (this.gCV != null) {
                throw new com.tencent.mm.plugin.appbrand.s.c.b("Previous continuous frame sequence not completed.");
              }
              this.gCV = locala1;
            }
            label342:
            do
            {
              for (;;)
              {
                try
                {
                  this.gCR.c(paramByteBuffer);
                }
                catch (RuntimeException paramByteBuffer)
                {
                  this.gCR.f(paramByteBuffer);
                }
                break;
                if (!bool) {
                  break label342;
                }
                if (this.gCV == null) {
                  throw new com.tencent.mm.plugin.appbrand.s.c.b("Continuous frame sequence was not started.");
                }
                this.gCV = null;
              }
            } while (this.gCV != null);
            throw new com.tencent.mm.plugin.appbrand.s.c.b("Continuous frame sequence was not started.");
          }
          if (this.gCV != null) {
            throw new com.tencent.mm.plugin.appbrand.s.c.b("Continuous frame sequence not completed.");
          }
          d.a locala2 = d.a.gDJ;
          if (locala1 == locala2)
          {
            try
            {
              this.gCR.vV(com.tencent.mm.plugin.appbrand.s.f.b.w(paramByteBuffer.aoK()));
            }
            catch (RuntimeException paramByteBuffer)
            {
              this.gCR.f(paramByteBuffer);
            }
          }
          else
          {
            locala2 = d.a.gDK;
            if (locala1 == locala2)
            {
              try
              {
                this.gCR.p(paramByteBuffer.aoK());
              }
              catch (RuntimeException paramByteBuffer)
              {
                this.gCR.f(paramByteBuffer);
              }
            }
            else
            {
              throw new com.tencent.mm.plugin.appbrand.s.c.b("non control or continious frame expected");
              label480:
              paramByteBuffer = "";
            }
          }
        }
      }
    }
  }
  
  private void o(ByteBuffer paramByteBuffer)
  {
    if (DEBUG) {
      x.i("MicroMsg.AppBrandNetWork.WebSocketImpl", "write(\" + buf.remaining() + \"): {\" + ( buf.remaining() > 1000 ? \"too big to display\" : new String( buf.array() ) ) + \"}");
    }
    this.gCN.add(paramByteBuffer);
  }
  
  /* Error */
  public final void Q(int paramInt, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 84	com/tencent/mm/plugin/appbrand/s/c:gCQ	I
    //   6: istore_3
    //   7: getstatic 439	com/tencent/mm/plugin/appbrand/s/a$a:gCD	I
    //   10: istore 4
    //   12: iload_3
    //   13: iload 4
    //   15: if_icmpne +6 -> 21
    //   18: aload_0
    //   19: monitorexit
    //   20: return
    //   21: aload_0
    //   22: getfield 441	com/tencent/mm/plugin/appbrand/s/c:gCL	Ljava/nio/channels/SelectionKey;
    //   25: ifnull +10 -> 35
    //   28: aload_0
    //   29: getfield 441	com/tencent/mm/plugin/appbrand/s/c:gCL	Ljava/nio/channels/SelectionKey;
    //   32: invokevirtual 446	java/nio/channels/SelectionKey:cancel	()V
    //   35: aload_0
    //   36: getfield 448	com/tencent/mm/plugin/appbrand/s/c:gCM	Ljava/nio/channels/ByteChannel;
    //   39: astore 5
    //   41: aload 5
    //   43: ifnull +12 -> 55
    //   46: aload_0
    //   47: getfield 448	com/tencent/mm/plugin/appbrand/s/c:gCM	Ljava/nio/channels/ByteChannel;
    //   50: invokeinterface 453 1 0
    //   55: aload_0
    //   56: getfield 129	com/tencent/mm/plugin/appbrand/s/c:gCR	Lcom/tencent/mm/plugin/appbrand/s/d;
    //   59: iload_1
    //   60: aload_2
    //   61: invokeinterface 456 3 0
    //   66: aload_0
    //   67: getfield 86	com/tencent/mm/plugin/appbrand/s/c:gCT	Lcom/tencent/mm/plugin/appbrand/s/b/a;
    //   70: ifnull +10 -> 80
    //   73: aload_0
    //   74: getfield 86	com/tencent/mm/plugin/appbrand/s/c:gCT	Lcom/tencent/mm/plugin/appbrand/s/b/a;
    //   77: invokevirtual 212	com/tencent/mm/plugin/appbrand/s/b/a:reset	()V
    //   80: aload_0
    //   81: aconst_null
    //   82: putfield 98	com/tencent/mm/plugin/appbrand/s/c:gCX	Lcom/tencent/mm/plugin/appbrand/s/e/a;
    //   85: aload_0
    //   86: getstatic 439	com/tencent/mm/plugin/appbrand/s/a$a:gCD	I
    //   89: putfield 84	com/tencent/mm/plugin/appbrand/s/c:gCQ	I
    //   92: aload_0
    //   93: getfield 125	com/tencent/mm/plugin/appbrand/s/c:gCN	Ljava/util/concurrent/BlockingQueue;
    //   96: invokeinterface 459 1 0
    //   101: goto -83 -> 18
    //   104: astore_2
    //   105: aload_0
    //   106: monitorexit
    //   107: aload_2
    //   108: athrow
    //   109: astore 5
    //   111: aload_0
    //   112: getfield 129	com/tencent/mm/plugin/appbrand/s/c:gCR	Lcom/tencent/mm/plugin/appbrand/s/d;
    //   115: aload 5
    //   117: invokeinterface 197 2 0
    //   122: goto -67 -> 55
    //   125: astore_2
    //   126: aload_0
    //   127: getfield 129	com/tencent/mm/plugin/appbrand/s/c:gCR	Lcom/tencent/mm/plugin/appbrand/s/d;
    //   130: aload_2
    //   131: invokeinterface 197 2 0
    //   136: goto -70 -> 66
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	139	0	this	c
    //   0	139	1	paramInt	int
    //   0	139	2	paramString	String
    //   6	10	3	i	int
    //   10	6	4	j	int
    //   39	3	5	localByteChannel	ByteChannel
    //   109	7	5	localIOException	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   2	12	104	finally
    //   21	35	104	finally
    //   35	41	104	finally
    //   46	55	104	finally
    //   55	66	104	finally
    //   66	80	104	finally
    //   80	101	104	finally
    //   111	122	104	finally
    //   126	136	104	finally
    //   46	55	109	java/io/IOException
    //   55	66	125	java/lang/RuntimeException
  }
  
  public final void aoE()
  {
    if (this.gCQ == a.a.gCz)
    {
      Q(-1, "");
      return;
    }
    if (this.gCP)
    {
      int i = this.gCZ.intValue();
      String str = this.gCY;
      this.gDa.booleanValue();
      Q(i, str);
      return;
    }
    if (this.gCT.aoH() == com.tencent.mm.plugin.appbrand.s.b.a.a.gDs)
    {
      Q(1000, "");
      return;
    }
    if ((this.gCT.aoH() == com.tencent.mm.plugin.appbrand.s.b.a.a.gDt) && (this.gCU != a.b.gCG))
    {
      Q(1000, "");
      return;
    }
    Q(1006, "");
  }
  
  public final boolean aoF()
  {
    return this.gCQ == a.a.gCC;
  }
  
  public final void ar(List<ByteBuffer> paramList)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      o((ByteBuffer)paramList.next());
    }
  }
  
  public final void b(com.tencent.mm.plugin.appbrand.s.d.d paramd)
  {
    if (DEBUG) {
      x.i("MicroMsg.AppBrandNetWork.WebSocketImpl", "\"send frame: \" + framedata ");
    }
    o(this.gCT.d(paramd));
  }
  
  public final void d(int paramInt, String paramString, boolean paramBoolean)
  {
    if ((this.gCQ != a.a.gCC) && (this.gCQ != a.a.gCD))
    {
      if (this.gCQ != a.a.gCB) {
        break label165;
      }
      if (paramInt == 1006)
      {
        this.gCQ = a.a.gCC;
        e(paramInt, paramString, false);
      }
    }
    else
    {
      return;
    }
    if (this.gCT.aoH() != com.tencent.mm.plugin.appbrand.s.b.a.a.gDs) {}
    for (;;)
    {
      try
      {
        b(new com.tencent.mm.plugin.appbrand.s.d.b(paramInt, paramString));
        e(paramInt, paramString, paramBoolean);
        if (paramInt == 1002) {
          e(paramInt, paramString, paramBoolean);
        }
        this.gCQ = a.a.gCC;
        this.gCW = null;
        return;
      }
      catch (com.tencent.mm.plugin.appbrand.s.c.b localb)
      {
        x.e("MicroMsg.AppBrandNetWork.WebSocketImpl", "close: " + localb.toString());
        this.gCR.f(localb);
        e(1006, "generated frame is invalid", false);
        continue;
      }
      label165:
      if (paramInt == -3) {
        e(-3, paramString, true);
      } else {
        e(-1, paramString, false);
      }
    }
  }
  
  public final void d(Collection<com.tencent.mm.plugin.appbrand.s.d.d> paramCollection)
  {
    if (!isOpen()) {
      throw new com.tencent.mm.plugin.appbrand.s.c.f();
    }
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      b((com.tencent.mm.plugin.appbrand.s.d.d)paramCollection.next());
    }
  }
  
  public final int hashCode()
  {
    return super.hashCode();
  }
  
  public final boolean isClosed()
  {
    return this.gCQ == a.a.gCD;
  }
  
  public final boolean isOpen()
  {
    return this.gCQ == a.a.gCB;
  }
  
  public final void l(ByteBuffer paramByteBuffer)
  {
    if (DEBUG) {
      x.i("MicroMsg.AppBrandNetWork.WebSocketImpl", "\"process(\" + socketBuffer.remaining() + \"): {\" + ( socketBuffer.remaining() > 1000 ? \"too big to display\" : new String( socketBuffer.array(), socketBuffer.position(), socketBuffer.remaining() ) ) + \"}\"");
    }
    if (this.gCQ != a.a.gCz) {
      if (this.gCQ == a.a.gCB) {
        n(paramByteBuffer);
      }
    }
    do
    {
      do
      {
        return;
      } while ((!m(paramByteBuffer)) || (aoF()) || (isClosed()));
      if (paramByteBuffer.hasRemaining())
      {
        n(paramByteBuffer);
        return;
      }
    } while (!this.gCW.hasRemaining());
    n(this.gCW);
  }
  
  public final String toString()
  {
    return super.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/s/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */