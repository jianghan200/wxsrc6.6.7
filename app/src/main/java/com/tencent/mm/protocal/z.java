package com.tencent.mm.protocal;

import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.c.aqd;
import com.tencent.mm.protocal.c.bsb;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public final class z
{
  private static Map<Integer, Long> bo(byte[] paramArrayOfByte)
  {
    if (bi.bC(paramArrayOfByte)) {
      return null;
    }
    try
    {
      paramArrayOfByte = (bsb)new bsb().aG(paramArrayOfByte);
      if (paramArrayOfByte == null) {
        return null;
      }
    }
    catch (Exception paramArrayOfByte)
    {
      return null;
    }
    x.d("MicroMsg.SyncKeyUtil", "dkpush : keyCount:" + paramArrayOfByte.slH);
    LinkedList localLinkedList = paramArrayOfByte.slI;
    if (localLinkedList.size() != paramArrayOfByte.slH) {
      return null;
    }
    HashMap localHashMap = new HashMap();
    int i = 0;
    while (i < paramArrayOfByte.slH)
    {
      localHashMap.put(Integer.valueOf(((aqd)localLinkedList.get(i)).mEb), Long.valueOf(0xFFFFFFFF & ((aqd)localLinkedList.get(i)).rSE));
      i += 1;
    }
    if (localHashMap.size() != paramArrayOfByte.slH) {
      return null;
    }
    return localHashMap;
  }
  
  public static String bp(byte[] paramArrayOfByte)
  {
    if (bi.bC(paramArrayOfByte)) {
      return "";
    }
    paramArrayOfByte = bo(paramArrayOfByte);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.size() <= 0)) {
      return "";
    }
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(" MsgKey:" + paramArrayOfByte.get(Integer.valueOf(2)));
    localStringBuffer.append(" profile:" + paramArrayOfByte.get(Integer.valueOf(1)));
    localStringBuffer.append(" contact:" + paramArrayOfByte.get(Integer.valueOf(3)));
    localStringBuffer.append(" chatroom:" + paramArrayOfByte.get(Integer.valueOf(11)));
    localStringBuffer.append(" Bottle:" + paramArrayOfByte.get(Integer.valueOf(7)));
    localStringBuffer.append(" QContact:" + paramArrayOfByte.get(Integer.valueOf(5)));
    return localStringBuffer.toString();
  }
  
  public static byte[] g(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if ((paramArrayOfByte1 == null) || (paramArrayOfByte1.length <= 0))
    {
      x.d("MicroMsg.SyncKeyUtil", "empty old key, use new key");
      return paramArrayOfByte2;
    }
    if ((paramArrayOfByte2 == null) || (paramArrayOfByte2.length <= 0))
    {
      x.e("MicroMsg.SyncKeyUtil", "newKey is null");
      return null;
    }
    PByteArray localPByteArray = new PByteArray();
    try
    {
      if (!MMProtocalJni.mergeSyncKey(paramArrayOfByte1, paramArrayOfByte2, localPByteArray))
      {
        x.e("MicroMsg.SyncKeyUtil", "merge key failed");
        return null;
      }
    }
    catch (IncompatibleClassChangeError paramArrayOfByte1)
    {
      x.printErrStackTrace("MicroMsg.Crash", paramArrayOfByte1, "NoSuchMethod MMProtocalJni.mergeSyncKey", new Object[0]);
      throw ((IncompatibleClassChangeError)new IncompatibleClassChangeError("NoSuchMethod MMProtocalJni.mergeSyncKey").initCause(paramArrayOfByte1));
    }
    return localPByteArray.value;
  }
  
  public static boolean h(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    paramArrayOfByte1 = bo(paramArrayOfByte1);
    if (paramArrayOfByte1 == null)
    {
      x.d("MicroMsg.SyncKeyUtil", "dkpush local sync key failed");
      return true;
    }
    paramArrayOfByte2 = bo(paramArrayOfByte2);
    if (paramArrayOfByte2 == null)
    {
      x.e("MicroMsg.SyncKeyUtil", "dkpush svr sync key failed");
      return false;
    }
    Iterator localIterator = paramArrayOfByte2.keySet().iterator();
    while (localIterator.hasNext())
    {
      Integer localInteger = (Integer)localIterator.next();
      Long localLong1 = (Long)paramArrayOfByte1.get(localInteger);
      Long localLong2 = (Long)paramArrayOfByte2.get(localInteger);
      if (localLong1 == null)
      {
        x.d("MicroMsg.SyncKeyUtil", "dkpush local key null :" + localInteger);
        return true;
      }
      x.d("MicroMsg.SyncKeyUtil", "dkpush local key:" + localInteger + " sv:" + localLong2 + " lv:" + localLong1);
      if (localLong2.longValue() > localLong1.longValue()) {
        return true;
      }
    }
    x.d("MicroMsg.SyncKeyUtil", "dkpush two sync key is the same");
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */