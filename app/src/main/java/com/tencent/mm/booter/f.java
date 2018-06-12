package com.tencent.mm.booter;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.mm.a.e;
import com.tencent.mm.a.g;
import com.tencent.mm.a.k;
import com.tencent.mm.a.n;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.g.a.hc;
import com.tencent.mm.g.a.li;
import com.tencent.mm.g.a.ql;
import com.tencent.mm.modelmulti.c;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.protocal.c.awe;
import com.tencent.mm.protocal.k.c;
import com.tencent.mm.protocal.s.b;
import com.tencent.mm.protocal.w.b;
import com.tencent.mm.protocal.z;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class f
{
  public static String D(byte[] paramArrayOfByte)
  {
    if (bi.bC(paramArrayOfByte)) {
      return "buf is nullOrNil";
    }
    if (paramArrayOfByte.length == 1) {
      return "buf.len is 1: " + Integer.toHexString(paramArrayOfByte[0]);
    }
    return "buf last two[len:" + paramArrayOfByte.length + "]: %s, %s" + Integer.toHexString(paramArrayOfByte[(paramArrayOfByte.length - 2)] & 0xFF) + ", " + Integer.toHexString(paramArrayOfByte[(paramArrayOfByte.length - 1)] & 0xFF);
  }
  
  public static boolean a(int paramInt1, int paramInt2, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, long paramLong)
  {
    x.i("MicroMsg.NotifySyncMgr", "dealWithNotify Here, MM should NOT bOotEd , opType:%d respType:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 == 1)
    {
      aH(2L);
      return true;
    }
    if (paramInt1 != 2) {
      return false;
    }
    switch (paramInt2)
    {
    }
    for (;;)
    {
      return true;
      aH(7L);
      continue;
      if ((bi.bC(paramArrayOfByte1)) || (paramArrayOfByte1.length <= 8))
      {
        x.e("MicroMsg.NotifySyncMgr", "dkpush dealWithNotify respBuf error ");
      }
      else
      {
        paramInt1 = n.r(paramArrayOfByte1, 0);
        paramInt2 = n.r(paramArrayOfByte1, 4);
        x.d("MicroMsg.NotifySyncMgr", "dkpush: flag:" + paramInt1 + " bufLen:" + paramInt2 + " dump:" + bi.T(paramArrayOfByte1, 8));
        if (paramInt2 != paramArrayOfByte1.length - 8)
        {
          x.e("MicroMsg.NotifySyncMgr", "dkpush: respBuf length error len:" + paramArrayOfByte1.length);
        }
        else
        {
          byte[] arrayOfByte = new byte[paramInt2];
          System.arraycopy(paramArrayOfByte1, 8, arrayOfByte, 0, paramInt2);
          s.b localb = new s.b();
          PByteArray localPByteArray2 = new PByteArray();
          PByteArray localPByteArray1 = new PByteArray();
          PInt localPInt1 = new PInt();
          PInt localPInt3 = new PInt();
          paramArrayOfByte1 = new PInt(0);
          PInt localPInt2 = new PInt(255);
          boolean bool1;
          try
          {
            bool1 = MMProtocalJni.unpack(localPByteArray1, arrayOfByte, paramArrayOfByte2, localPByteArray2, localPInt1, localPInt3, paramArrayOfByte1, localPInt2);
            if (paramArrayOfByte1.value != 0)
            {
              paramArrayOfByte2 = new hc();
              paramArrayOfByte2.bQo.bQp = paramArrayOfByte1.value;
              boolean bool2 = a.sFg.m(paramArrayOfByte2);
              x.i("MicroMsg.NotifySyncMgr", "summerdiz publish GetDisasterInfoEvent noticeid[%d] publish[%b]", new Object[] { Integer.valueOf(paramArrayOfByte1.value), Boolean.valueOf(bool2) });
              paramArrayOfByte1.value = 0;
            }
            if (!bool1) {
              x.e("MicroMsg.NotifySyncMgr", "unpack push resp failed");
            }
          }
          catch (Exception paramArrayOfByte2)
          {
            x.e("MicroMsg.NotifySyncMgr", "unpack push resp failed: %s", new Object[] { paramArrayOfByte2 });
            x.printErrStackTrace("MicroMsg.NotifySyncMgr", paramArrayOfByte2, "", new Object[0]);
          }
          while (paramArrayOfByte1.value != 0)
          {
            paramArrayOfByte2 = new hc();
            paramArrayOfByte2.bQo.bQp = paramArrayOfByte1.value;
            bool1 = a.sFg.m(paramArrayOfByte2);
            x.i("MicroMsg.NotifySyncMgr", "summerdiz publish GetDisasterInfoEvent noticeid[%d] publish[%b]", new Object[] { Integer.valueOf(paramArrayOfByte1.value), Boolean.valueOf(bool1) });
            paramArrayOfByte1.value = 0;
            break;
            localb.qWC = localPInt2.value;
            if (localPInt1.value == -13)
            {
              localb.qWB = localPInt1.value;
              x.e("MicroMsg.NotifySyncMgr", "unpack push resp failed session timeout");
              break;
            }
            paramInt2 = localb.G(localPByteArray1.value);
            x.d("MicroMsg.NotifySyncMgr", "bufToResp using protobuf ok");
            localb.qWB = paramInt2;
            localb.bufferSize = arrayOfByte.length;
            paramArrayOfByte2 = bi.WP(ad.getContext().getSharedPreferences("notify_sync_pref", 4).getString("notify_sync_key_keybuf", ""));
            arrayOfByte = ab.a(localb.qWX.rny);
            if ((bi.bC(arrayOfByte)) || (!z.h(paramArrayOfByte2, arrayOfByte)))
            {
              x.e("MicroMsg.NotifySyncMgr", "compareKeybuf syncKey failed");
              break;
            }
            new c(localb, paramInt1, paramLong).a(com.tencent.mm.network.aa.UZ(), new f.1());
          }
          if (paramArrayOfByte1 == null) {}
          for (paramLong = 7L;; paramLong = n.r(paramArrayOfByte1, 0))
          {
            aH(paramLong);
            break;
          }
          paramArrayOfByte2 = new w.b();
          try
          {
            paramArrayOfByte2.G(paramArrayOfByte1);
            aH(paramArrayOfByte2.qXc);
          }
          catch (Exception paramArrayOfByte1)
          {
            x.printErrStackTrace("MicroMsg.NotifySyncMgr", paramArrayOfByte1, "", new Object[0]);
          }
        }
      }
    }
  }
  
  public static byte[] a(PInt paramPInt, int paramInt)
  {
    String str = fo(paramInt);
    int j = eC(str);
    int i = 1;
    while (i <= j)
    {
      Object localObject3 = str + "/syncResp.bin" + i;
      if (e.cn((String)localObject3))
      {
        Object localObject2 = e.f((String)localObject3, 0, -1);
        Object localObject1 = localObject2;
        if (bi.bC((byte[])localObject2))
        {
          x.w("MicroMsg.NotifySyncMgr", "readFile getdata null, read again");
          localObject1 = e.f((String)localObject3, 0, -1);
        }
        localObject2 = g.u((q.zy() + paramInt).getBytes());
        localObject3 = k.a((byte[])localObject1, ((String)localObject2).getBytes());
        x.i("MicroMsg.NotifySyncMgr", "readFile, index:[%d of %d], dump data:%s -> %s, key:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), D((byte[])localObject1), D((byte[])localObject3), D(((String)localObject2).getBytes()) });
        if (!bi.bC((byte[])localObject3))
        {
          paramPInt.value = i;
          return (byte[])localObject3;
        }
      }
      i += 1;
    }
    return null;
  }
  
  private static void aH(long paramLong)
  {
    x.i("MicroMsg.NotifySyncMgr", "dealWithSelector, selector = " + paramLong);
    Object localObject;
    if ((0x100 & paramLong) != 0L)
    {
      localObject = new ql();
      a.sFg.m((b)localObject);
    }
    if ((0x200000 & paramLong) != 0L)
    {
      localObject = new li();
      a.sFg.m((b)localObject);
    }
    if ((0xFFFFFFFFFFFFFEFF & paramLong & 0xFFFFFFFFFFDFFFFF & 0x2) != 0L) {
      new c().a(com.tencent.mm.network.aa.UZ(), new f.2());
    }
  }
  
  public static void aO(int paramInt1, int paramInt2)
  {
    String str = fo(paramInt2);
    paramInt2 = eC(str);
    e.deleteFile(str + "/syncResp.bin" + paramInt1);
    x.i("MicroMsg.NotifySyncMgr", "consumeData delIndex:%d, total index:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 == paramInt2)
    {
      e.deleteFile(str + "/syncResp.ini");
      x.i("MicroMsg.NotifySyncMgr", "consumeData: has consme all respdata");
    }
  }
  
  public static int eC(String paramString)
  {
    paramString = e.f(paramString + "/syncResp.ini", 0, -1);
    if (bi.bC(paramString)) {
      return 0;
    }
    try
    {
      int i = Integer.parseInt(new String(paramString));
      return i;
    }
    catch (NumberFormatException paramString) {}
    return 0;
  }
  
  public static String fo(int paramInt)
  {
    String str = g.u(("mm" + paramInt).getBytes());
    str = com.tencent.mm.storage.aa.duN + str + "/pushSyncResp";
    e.cr(str);
    return str;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/booter/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */