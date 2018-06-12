package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel;

import android.os.Looper;
import com.tencent.mm.a.k;
import com.tencent.mm.plugin.backup.a.d;
import com.tencent.mm.plugin.backup.f.b.a;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.c.pw;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.zip.CRC32;

public final class b
  implements b.a
{
  public static final byte[] gRO = "GSMW".getBytes();
  private Socket gDe = null;
  private Boolean gZj = Boolean.valueOf(false);
  private ServerSocket gZk = null;
  private ag gZl = null;
  private ag gZm = new ag(Looper.getMainLooper());
  private DataOutputStream gZn = null;
  private int gZo = 0;
  private int gZp = 0;
  private long gZq = 0L;
  private Object lock = new Object();
  
  public b()
  {
    asT();
  }
  
  private void a(DataInputStream paramDataInputStream)
  {
    try
    {
      for (;;)
      {
        int j;
        if ((!this.gZj.booleanValue()) && (this.gZo != 4))
        {
          j = paramDataInputStream.readByte();
          if (gRO[this.gZo] == j)
          {
            this.gZo += 1;
            continue;
          }
        }
        try
        {
          paramDataInputStream.close();
          if (!this.gZj.booleanValue()) {
            a(true, 0, 10006, ("read_error " + localException).getBytes());
          }
          asS();
          return;
          long l1 = bi.VE();
          long l2 = this.gZq;
          if (this.gZp - (l1 - l2) < 10L)
          {
            if (this.gZp < 0) {
              this.gZp = 0;
            }
            this.gZp += 1;
            this.gZq = l1;
            i = 0;
            String str;
            if (i == 0)
            {
              str = String.format("GSMW in the %dth step error:expect:%02X, butGet:%02X", new Object[] { Integer.valueOf(this.gZo + 1), Integer.valueOf(gRO[this.gZo] & 0xFF), Integer.valueOf(j & 0xFF) });
              x.e("MicroMsg.BakOldJavaEngine", str);
              a(true, 0, 10007, str.getBytes());
            }
            this.gZo = 0;
            continue;
            this.gZo = 0;
            j = paramDataInputStream.readInt();
            short s1 = paramDataInputStream.readShort();
            s2 = paramDataInputStream.readShort();
            int k = paramDataInputStream.readInt();
            if (k > 16777216)
            {
              str = String.format("loopRead size to large:%d", new Object[] { Integer.valueOf(k) });
              x.e("MicroMsg.BakOldJavaEngine", str);
              this.gZj = Boolean.valueOf(true);
              a(true, 0, 10007, str.getBytes());
              return;
            }
            int m = paramDataInputStream.readInt();
            x.i("MicroMsg.BakOldJavaEngine", "read buf size:" + k);
            localObject2 = new byte[k - 20];
            i = 0;
            while (i < localObject2.length)
            {
              int n = paramDataInputStream.read((byte[])localObject2, i, localObject2.length - i);
              if (n == -1) {
                try
                {
                  Thread.sleep(200L);
                }
                catch (InterruptedException localInterruptedException) {}
              } else {
                i += n;
              }
            }
            PByteArray localPByteArray = new PByteArray();
            localObject1 = gRO;
            if (s1 != 1)
            {
              localObject1 = String.format("unpack failed, getVersion:%d", new Object[] { Short.valueOf(s1) });
              x.e("MicroMsg.BakOldPacker", (String)localObject1);
              localPByteArray.value = ((String)localObject1).getBytes();
              i = -1;
              x.d("MicroMsg.BakOldJavaEngine", "summerbak loopRead unpack ret[%d]", new Object[] { Integer.valueOf(i) });
              if (i == 0) {
                break label745;
              }
              if (localPByteArray.value != null) {
                break label728;
              }
            }
            for (localObject1 = "";; localObject1 = new String(localPByteArray.value))
            {
              a(true, 0, 10007, ((String)localObject1).getBytes());
              return;
              if (com.tencent.mm.plugin.backup.f.b.aqS() != 1) {
                break label804;
              }
              i = com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel.b.a((byte[])localObject1, j, s1, s2, k, (byte[])localObject2);
              if (m == i) {
                break label804;
              }
              localObject1 = new CRC32();
              ((CRC32)localObject1).update((byte[])localObject2);
              localObject2 = com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel.b.Y((byte[])localObject2);
              localObject1 = String.format("unpack failed--calcSum:%d, getfromPcMgr:%d, seq:%d, type:%d, size:%d, just buf.crc:%d, last 100 bytes:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(m), Integer.valueOf(j), Short.valueOf(s2), Integer.valueOf(k), Integer.valueOf((int)((CRC32)localObject1).getValue()), localObject2 });
              x.e("MicroMsg.BakOldPacker", (String)localObject1);
              localPByteArray.value = ((String)localObject1).getBytes();
              i = -2;
              break;
              for (;;)
              {
                localPByteArray.value = ((byte[])localObject1);
                i = 0;
                break;
                localObject1 = k.a((byte[])localObject2, d.aqT());
              }
            }
            x.d("MicroMsg.BakOldJavaEngine", "summerbak loopRead unpack ret[%d], seq[%d], type[%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Short.valueOf(s2) });
            a(false, j, s2, localPByteArray.value);
            return;
          }
        }
        catch (IOException paramDataInputStream)
        {
          for (;;)
          {
            short s2;
            Object localObject2;
            continue;
            int i = 1;
            continue;
            Object localObject1 = localObject2;
            if (s2 != 1) {
              if (s2 == 2) {
                localObject1 = localObject2;
              }
            }
          }
        }
      }
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.BakOldJavaEngine", "loopRead %s", new Object[] { localException });
    }
  }
  
  private void a(boolean paramBoolean, int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    this.gZm.post(new b.2(this, paramBoolean, paramInt1, paramInt2, paramArrayOfByte));
  }
  
  /* Error */
  private void asS()
  {
    // Byte code:
    //   0: aload_0
    //   1: iconst_0
    //   2: putfield 75	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/b:gZo	I
    //   5: aload_0
    //   6: iconst_0
    //   7: putfield 77	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/b:gZp	I
    //   10: aload_0
    //   11: lconst_0
    //   12: putfield 79	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/b:gZq	J
    //   15: aload_0
    //   16: iconst_1
    //   17: invokestatic 48	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   20: putfield 50	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/b:gZj	Ljava/lang/Boolean;
    //   23: aload_0
    //   24: getfield 73	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/b:lock	Ljava/lang/Object;
    //   27: astore_1
    //   28: aload_1
    //   29: monitorenter
    //   30: aload_0
    //   31: getfield 71	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/b:gZn	Ljava/io/DataOutputStream;
    //   34: ifnull +10 -> 44
    //   37: aload_0
    //   38: getfield 71	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/b:gZn	Ljava/io/DataOutputStream;
    //   41: invokevirtual 355	java/io/DataOutputStream:close	()V
    //   44: aload_1
    //   45: monitorexit
    //   46: aload_0
    //   47: getfield 54	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/b:gDe	Ljava/net/Socket;
    //   50: ifnull +10 -> 60
    //   53: aload_0
    //   54: getfield 54	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/b:gDe	Ljava/net/Socket;
    //   57: invokevirtual 356	java/net/Socket:close	()V
    //   60: return
    //   61: astore_2
    //   62: aload_1
    //   63: monitorexit
    //   64: aload_2
    //   65: athrow
    //   66: astore_1
    //   67: goto -21 -> 46
    //   70: astore_1
    //   71: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	72	0	this	b
    //   66	1	1	localException1	Exception
    //   70	1	1	localException2	Exception
    //   61	4	2	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   30	44	61	finally
    //   44	46	61	finally
    //   62	64	61	finally
    //   23	30	66	java/lang/Exception
    //   64	66	66	java/lang/Exception
    //   46	60	70	java/lang/Exception
  }
  
  private void asT()
  {
    if ((this.gZl == null) || (!this.gZl.getLooper().getThread().isAlive())) {
      e.b(new b.5(this), "BackupJavaEngine_handler").start();
    }
  }
  
  public final void Z(byte[] paramArrayOfByte)
  {
    if (this.gZj.booleanValue())
    {
      x.e("MicroMsg.BakOldJavaEngine", "engine has stop");
      return;
    }
    this.gZl.post(new b.4(this, paramArrayOfByte));
  }
  
  public final void asR()
  {
    x.i("MicroMsg.BakOldJavaEngine", "close connect");
    asS();
    a(true, 0, 10003, null);
  }
  
  public final void c(int paramInt, List<pw> paramList)
  {
    x.i("MicroMsg.BakOldJavaEngine", "connect type:%d", new Object[] { Integer.valueOf(paramInt) });
    asT();
    e.post(new b.1(this, paramInt, paramList), "BackupJavaEngine_connect");
  }
  
  public final void j(int paramInt, byte[] paramArrayOfByte)
  {
    if (this.gZl != null)
    {
      Z(paramArrayOfByte);
      return;
    }
    this.gZm.postDelayed(new b.3(this, paramInt, paramArrayOfByte), 200L);
  }
  
  public final int k(int paramInt, byte[] paramArrayOfByte)
  {
    return 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */