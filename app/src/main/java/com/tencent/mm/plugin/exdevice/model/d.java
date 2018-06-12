package com.tencent.mm.plugin.exdevice.model;

import android.content.Context;
import android.os.Looper;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.exdevice.h.a;
import com.tencent.mm.plugin.exdevice.h.b;
import com.tencent.mm.plugin.exdevice.service.f;
import com.tencent.mm.plugin.exdevice.service.f.a;
import com.tencent.mm.plugin.exdevice.service.j;
import com.tencent.mm.plugin.exdevice.service.m;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.plugin.exdevice.service.w;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;

public final class d
{
  private static int iti = 0;
  public com.tencent.mm.plugin.exdevice.service.c itd;
  private w ite;
  HashMap<Long, al> itf;
  HashMap<Long, al> itg;
  HashMap<Long, Integer> ith;
  j itj = null;
  private Object itk = new Object();
  
  public d()
  {
    u.aHG().isZ = new d.1(this);
    if (this.ite == null) {
      this.ite = new d.10(this);
    }
    this.itf = new HashMap();
    this.itg = new HashMap();
    this.ith = new HashMap();
  }
  
  public static int aGM()
  {
    return iti;
  }
  
  /* Error */
  private boolean b(String paramString, long paramLong, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic 79	com/tencent/mm/model/au:DF	()Lcom/tencent/mm/ab/o;
    //   5: invokevirtual 84	com/tencent/mm/ab/o:Lg	()I
    //   8: istore 5
    //   10: iload 5
    //   12: iconst_4
    //   13: if_icmpeq +25 -> 38
    //   16: iload 5
    //   18: bipush 6
    //   20: if_icmpeq +18 -> 38
    //   23: ldc 86
    //   25: ldc 88
    //   27: invokestatic 94	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   30: iconst_0
    //   31: istore 8
    //   33: aload_0
    //   34: monitorexit
    //   35: iload 8
    //   37: ireturn
    //   38: aload_0
    //   39: getfield 61	com/tencent/mm/plugin/exdevice/model/d:itg	Ljava/util/HashMap;
    //   42: lload_2
    //   43: invokestatic 100	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   46: invokevirtual 104	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   49: ifeq +31 -> 80
    //   52: ldc 86
    //   54: ldc 106
    //   56: iconst_2
    //   57: anewarray 4	java/lang/Object
    //   60: dup
    //   61: iconst_0
    //   62: aload_1
    //   63: aastore
    //   64: dup
    //   65: iconst_1
    //   66: lload_2
    //   67: invokestatic 100	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   70: aastore
    //   71: invokestatic 110	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   74: iconst_0
    //   75: istore 8
    //   77: goto -44 -> 33
    //   80: new 112	com/tencent/mm/sdk/platformtools/al
    //   83: dup
    //   84: invokestatic 118	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   87: new 120	com/tencent/mm/plugin/exdevice/model/d$8
    //   90: dup
    //   91: aload_0
    //   92: lload_2
    //   93: aload_1
    //   94: iload 4
    //   96: invokespecial 123	com/tencent/mm/plugin/exdevice/model/d$8:<init>	(Lcom/tencent/mm/plugin/exdevice/model/d;JLjava/lang/String;I)V
    //   99: iconst_0
    //   100: invokespecial 126	com/tencent/mm/sdk/platformtools/al:<init>	(Landroid/os/Looper;Lcom/tencent/mm/sdk/platformtools/al$a;Z)V
    //   103: astore 9
    //   105: invokestatic 132	com/tencent/mm/plugin/exdevice/j/b:aIs	()J
    //   108: lstore 6
    //   110: ldc 86
    //   112: ldc -122
    //   114: iconst_1
    //   115: anewarray 4	java/lang/Object
    //   118: dup
    //   119: iconst_0
    //   120: lload 6
    //   122: invokestatic 100	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   125: aastore
    //   126: invokestatic 110	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   129: aload 9
    //   131: lload 6
    //   133: lload 6
    //   135: invokevirtual 138	com/tencent/mm/sdk/platformtools/al:J	(JJ)V
    //   138: aload_0
    //   139: getfield 61	com/tencent/mm/plugin/exdevice/model/d:itg	Ljava/util/HashMap;
    //   142: lload_2
    //   143: invokestatic 100	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   146: aload 9
    //   148: invokevirtual 142	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   151: pop
    //   152: invokestatic 38	com/tencent/mm/plugin/exdevice/service/u:aHG	()Lcom/tencent/mm/plugin/exdevice/model/c;
    //   155: getfield 146	com/tencent/mm/plugin/exdevice/model/c:isY	Lcom/tencent/mm/plugin/exdevice/service/m;
    //   158: ifnull +48 -> 206
    //   161: ldc 86
    //   163: ldc -108
    //   165: iconst_2
    //   166: anewarray 4	java/lang/Object
    //   169: dup
    //   170: iconst_0
    //   171: aload_1
    //   172: aastore
    //   173: dup
    //   174: iconst_1
    //   175: lload_2
    //   176: invokestatic 100	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   179: aastore
    //   180: invokestatic 110	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   183: invokestatic 38	com/tencent/mm/plugin/exdevice/service/u:aHG	()Lcom/tencent/mm/plugin/exdevice/model/c;
    //   186: getfield 146	com/tencent/mm/plugin/exdevice/model/c:isY	Lcom/tencent/mm/plugin/exdevice/service/m;
    //   189: lload_2
    //   190: iload 4
    //   192: aload_0
    //   193: getfield 51	com/tencent/mm/plugin/exdevice/model/d:ite	Lcom/tencent/mm/plugin/exdevice/service/w;
    //   196: invokeinterface 153 5 0
    //   201: istore 8
    //   203: goto -170 -> 33
    //   206: ldc 86
    //   208: ldc -101
    //   210: invokestatic 94	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   213: iconst_0
    //   214: istore 8
    //   216: goto -183 -> 33
    //   219: astore_1
    //   220: aload_0
    //   221: monitorexit
    //   222: aload_1
    //   223: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	224	0	this	d
    //   0	224	1	paramString	String
    //   0	224	2	paramLong	long
    //   0	224	4	paramInt	int
    //   8	13	5	i	int
    //   108	26	6	l	long
    //   31	184	8	bool	boolean
    //   103	44	9	localal	al
    // Exception table:
    //   from	to	target	type
    //   2	10	219	finally
    //   23	30	219	finally
    //   38	74	219	finally
    //   80	203	219	finally
    //   206	213	219	finally
  }
  
  public static void cB(long paramLong)
  {
    if (u.aHG().isY != null) {
      x.i("MicroMsg.exdevice.ExdeviceConnectManager", "now stop the devide channel : %d, result : %b", new Object[] { Long.valueOf(paramLong), Boolean.valueOf(u.aHG().isY.cT(paramLong)) });
    }
  }
  
  public static boolean ev(boolean paramBoolean)
  {
    boolean bool2 = true;
    if (u.aHG().isY != null)
    {
      long[] arrayOfLong = u.aHG().isY.aHt();
      boolean bool1;
      if ((arrayOfLong == null) || (arrayOfLong.length <= 0))
      {
        x.w("MicroMsg.exdevice.ExdeviceConnectManager", "connectedDevices = null or connectedDevices.length = 0");
        bool1 = false;
      }
      int j;
      int i;
      do
      {
        return bool1;
        j = arrayOfLong.length;
        i = 0;
        bool1 = bool2;
      } while (i >= j);
      long l = arrayOfLong[i];
      x.i("MicroMsg.exdevice.ExdeviceConnectManager", "deviceId = %s", new Object[] { Long.valueOf(l) });
      b localb = ad.aHe().cX(l);
      if (localb == null) {
        x.w("MicroMsg.exdevice.ExdeviceConnectManager", "Get device info failed, deviceId = %s", new Object[] { Long.valueOf(l) });
      }
      for (;;)
      {
        i += 1;
        break;
        if ((paramBoolean) && ((localb.field_closeStrategy & 0x1) == 0))
        {
          x.i("MicroMsg.exdevice.ExdeviceConnectManager", "Device is not close after exit chatting, deviceId = %s", new Object[] { Long.valueOf(l) });
        }
        else
        {
          x.i("MicroMsg.exdevice.ExdeviceConnectManager", "Stop channel, deviceId = %s", new Object[] { Long.valueOf(l) });
          u.aHG().isY.cT(l);
        }
      }
    }
    x.w("MicroMsg.exdevice.ExdeviceConnectManager", "MMExDeviceCore.getTaskQueue().getDispatcher is null!");
    return false;
  }
  
  public final void a(int paramInt, j paramj)
  {
    x.i("MicroMsg.exdevice.ExdeviceConnectManager", "scanLogic, bluetooth version = %d", new Object[] { Integer.valueOf(paramInt) });
    if (paramj == null) {
      x.e("MicroMsg.exdevice.ExdeviceConnectManager", "null == aCallback");
    }
    do
    {
      return;
      this.itj = paramj;
      if (this.itd == null)
      {
        this.itd = new com.tencent.mm.plugin.exdevice.service.c();
        this.itd.iyE = new d.12(this, paramInt, paramInt);
        this.itd.dd(com.tencent.mm.sdk.platformtools.ad.getContext());
        return;
      }
      x.i("MicroMsg.exdevice.ExdeviceConnectManager", "try start scan");
      if (u.aHG().isY == null)
      {
        x.e("MicroMsg.exdevice.ExdeviceConnectManager", "dispatcher is null.");
        return;
      }
    } while (u.aHG().isY.b(paramInt, this.itj));
    x.e("MicroMsg.exdevice.ExdeviceConnectManager", "scan failed!!!");
  }
  
  public final void a(Long paramLong, int paramInt)
  {
    try
    {
      this.ith.put(paramLong, Integer.valueOf(paramInt));
      return;
    }
    finally
    {
      paramLong = finally;
      throw paramLong;
    }
  }
  
  public final void a(String paramString, long paramLong, int paramInt)
  {
    a(paramString, paramLong, paramInt, false);
  }
  
  public final void a(String paramString, long paramLong, int paramInt, boolean paramBoolean)
  {
    a.B("shut_down_device", paramLong);
    if (this.itd == null)
    {
      x.i("MicroMsg.exdevice.ExdeviceConnectManager", "Bind exdeviceService");
      this.itd = new com.tencent.mm.plugin.exdevice.service.c();
      this.itd.iyE = new d.6(this, paramInt, paramString, paramLong, paramBoolean);
      this.itd.dd(com.tencent.mm.sdk.platformtools.ad.getContext());
      return;
    }
    if ((this.itd != null) && (!this.itd.iyF))
    {
      x.i("MicroMsg.exdevice.ExdeviceConnectManager", "ExdeviceService setConnected");
      this.itd.iyE = new d.7(this, paramInt, paramString, paramLong, paramBoolean);
      this.itd.dd(com.tencent.mm.sdk.platformtools.ad.getContext());
      return;
    }
    b(paramString, paramLong, paramInt, paramBoolean);
  }
  
  public final void aGN()
  {
    if ((this.itd != null) && (this.itd.iyF)) {}
    try
    {
      com.tencent.mm.sdk.platformtools.ad.getContext().unbindService(this.itd);
      return;
    }
    catch (Exception localException) {}
  }
  
  public final void b(String paramString, long paramLong, int paramInt, boolean paramBoolean)
  {
    x.i("MicroMsg.exdevice.ExdeviceConnectManager", "doConnect");
    if (paramBoolean) {
      paramBoolean = b(paramString, paramLong, paramInt);
    }
    for (;;)
    {
      x.i("MicroMsg.exdevice.ExdeviceConnectManager", "startChannel Ret = %s", new Object[] { Boolean.valueOf(paramBoolean) });
      return;
      if (au.DF().Lg() != 4)
      {
        x.i("MicroMsg.exdevice.ExdeviceConnectManager", "now network is not avaiable, notify directly");
        paramBoolean = false;
      }
      else
      {
        al localal;
        if (this.itf.containsKey(Long.valueOf(paramLong)))
        {
          x.i("MicroMsg.exdevice.ExdeviceConnectManager", "now the device is connecting, reset timer : brand name = %s, deviceid = %d, bluetooth version = %d", new Object[] { paramString, Long.valueOf(paramLong), Integer.valueOf(paramInt) });
          localal = (al)this.itf.get(Long.valueOf(paramLong));
          localal.SO();
          localal.J(30000L, 30000L);
        }
        for (;;)
        {
          if (u.aHG().isY != null) {
            break label274;
          }
          x.w("MicroMsg.exdevice.ExdeviceConnectManager", "MMExDeviceCore.getTaskQueue().getDispatcher() == null, Just leave, brand name is %s, device id is %d, bluetooth version is %d", new Object[] { paramString, Long.valueOf(paramLong), Integer.valueOf(paramInt) });
          paramBoolean = false;
          break;
          x.i("MicroMsg.exdevice.ExdeviceConnectManager", "the device is not connecting, brand name = %s, deviceid = %d, bluetooth version = %d", new Object[] { paramString, Long.valueOf(paramLong), Integer.valueOf(paramInt) });
          localal = new al(Looper.getMainLooper(), new d.9(this, paramLong, paramString, paramInt), false);
          localal.J(30000L, 30000L);
          this.itf.put(Long.valueOf(paramLong), localal);
        }
        label274:
        paramString = u.aHF().cN(paramLong);
        if (paramString == null)
        {
          x.w("MicroMsg.exdevice.ExdeviceConnectManager", "Device unbond: %s", new Object[] { Long.valueOf(paramLong) });
          paramBoolean = false;
        }
        else
        {
          x.i("MicroMsg.exdevice.ExdeviceConnectManager", "onStateChange, connectState = %d ", new Object[] { Integer.valueOf(paramString.bLv) });
          if ((paramString.bLv != 2) && (paramString.bLv != 1)) {
            u.aHG().isY.a(paramLong, paramInt, this.ite);
          }
          paramBoolean = true;
        }
      }
    }
  }
  
  public final void oZ(int paramInt)
  {
    try
    {
      x.i("MicroMsg.exdevice.ExdeviceConnectManager", "setConnectMode, mode = %d", new Object[] { Integer.valueOf(paramInt) });
      iti = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/exdevice/model/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */