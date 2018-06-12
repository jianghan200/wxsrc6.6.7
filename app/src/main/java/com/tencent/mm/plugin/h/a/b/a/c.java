package com.tencent.mm.plugin.h.a.b.a;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.tencent.mm.plugin.h.a.b.h;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@TargetApi(18)
public class c
{
  public static final String TAG = c.class.getName();
  private static HashMap<String, Long> hgB = new HashMap();
  private static HashMap<String, Long> hhL;
  
  static
  {
    HashMap localHashMap = new HashMap();
    hhL = localHashMap;
    localHashMap.put(h.hgQ, Long.valueOf(1L));
    hhL.put(h.hgR, Long.valueOf(1L));
    hhL.put(h.hgS, Long.valueOf(16L));
    hhL.put(h.hgT, Long.valueOf(16L));
    hhL.put(h.hgU, Long.valueOf(16L));
    hhL.put(h.hgV, Long.valueOf(16L));
    hgB.put(h.hgN, Long.valueOf(0L));
    hgB.put(h.hgW, Long.valueOf(2L));
    hgB.put(h.hgZ, Long.valueOf(4L));
    hgB.put(h.hhd, Long.valueOf(8L));
  }
  
  public static long a(BluetoothGattService paramBluetoothGattService)
  {
    long l1 = 0L;
    if (paramBluetoothGattService == null)
    {
      x.e(TAG, "service is null");
      return 0L;
    }
    Object localObject = paramBluetoothGattService.getUuid().toString();
    if ((((String)localObject).equalsIgnoreCase(h.hgN)) && (paramBluetoothGattService.getCharacteristic(UUID.fromString(h.hgQ)) != null))
    {
      paramBluetoothGattService = paramBluetoothGattService.getCharacteristics();
      l1 = 0L;
      int i = 0;
      if (i < paramBluetoothGattService.size())
      {
        localObject = ((BluetoothGattCharacteristic)paramBluetoothGattService.get(i)).getUuid().toString();
        localObject = (Long)hhL.get(localObject);
        if (localObject == null) {}
        for (long l2 = 0L;; l2 = ((Long)localObject).longValue())
        {
          i += 1;
          l1 = l2 | l1;
          break;
        }
      }
      x.d(TAG, "wechat service, profileType = %d", new Object[] { Long.valueOf(l1) });
      return l1;
    }
    paramBluetoothGattService = (Long)hgB.get(localObject);
    if (paramBluetoothGattService == null) {}
    for (;;)
    {
      x.d(TAG, "service uuid = %s, profileType = %d", new Object[] { localObject, Long.valueOf(l1) });
      return l1;
      l1 = paramBluetoothGattService.longValue();
    }
  }
  
  public static byte[] a(BluetoothGattCharacteristic paramBluetoothGattCharacteristic, byte[] paramArrayOfByte)
  {
    int j = 0;
    int k = 0;
    int i = 0;
    if ((paramBluetoothGattCharacteristic == null) || (paramArrayOfByte == null))
    {
      x.e(TAG, "characteristic or recvData is null");
      return null;
    }
    long l = 0L;
    Object localObject = paramBluetoothGattCharacteristic.getUuid().toString();
    paramBluetoothGattCharacteristic = paramBluetoothGattCharacteristic.getService();
    if (paramBluetoothGattCharacteristic != null)
    {
      l = a(paramBluetoothGattCharacteristic);
      x.d(TAG, "recv data. uuid = %s, data = %s", new Object[] { localObject, com.tencent.mm.plugin.exdevice.j.b.aq(paramArrayOfByte) });
      if ((0L == (1L & l)) || ((!((String)localObject).equalsIgnoreCase(f.hin)) && (!((String)localObject).equalsIgnoreCase(f.hio)))) {
        break label468;
      }
      paramBluetoothGattCharacteristic = new f();
      if ((paramArrayOfByte.length > 0) && ((paramArrayOfByte[0] & 0x1) != 0)) {
        break label202;
      }
      x.e(f.TAG, "pase step data error");
      i = 0;
    }
    for (;;)
    {
      if (i == 0) {
        break label458;
      }
      paramArrayOfByte = com.tencent.mm.plugin.exdevice.j.b.bw(paramBluetoothGattCharacteristic);
      x.d(TAG, "step info. stepCount=%d, stepDistance=%d, stepColarie=%d", new Object[] { Integer.valueOf(paramBluetoothGattCharacteristic.hip), Integer.valueOf(paramBluetoothGattCharacteristic.hiq), Integer.valueOf(paramBluetoothGattCharacteristic.hir) });
      return paramArrayOfByte;
      x.e(TAG, "the characteristic has no parent service");
      break;
      label202:
      if ((localObject == null) || ((!((String)localObject).equals(f.hin)) && (!((String)localObject).equals(f.hio))))
      {
        x.e(f.TAG, "uuid is not correct");
        i = 0;
      }
      else
      {
        paramBluetoothGattCharacteristic.hhi = ((String)localObject);
        i = 4;
        if ((paramArrayOfByte[0] & 0x2) != 0) {
          i = 7;
        }
        j = i;
        if ((paramArrayOfByte[0] & 0x4) != 0) {
          j = i + 3;
        }
        if (j > paramArrayOfByte.length)
        {
          x.e(f.TAG, "data len is not enough");
          i = 0;
        }
        else
        {
          paramBluetoothGattCharacteristic.hip = 0;
          j = 0;
          i = 1;
          while (j < 3)
          {
            paramBluetoothGattCharacteristic.hip += ((paramArrayOfByte[i] & 0xFF) << j * 8);
            i += 1;
            j += 1;
          }
          j = i;
          if ((paramArrayOfByte[0] & 0x2) != 0)
          {
            paramBluetoothGattCharacteristic.hiq = 0;
            k = 0;
            for (;;)
            {
              j = i;
              if (k >= 3) {
                break;
              }
              paramBluetoothGattCharacteristic.hiq += ((paramArrayOfByte[i] & 0xFF) << k * 8);
              i += 1;
              k += 1;
            }
          }
          if ((paramArrayOfByte[0] & 0x4) != 0)
          {
            paramBluetoothGattCharacteristic.hir = 0;
            i = 0;
            while (i < 3)
            {
              paramBluetoothGattCharacteristic.hir += ((paramArrayOfByte[j] & 0xFF) << i * 8);
              j += 1;
              i += 1;
            }
          }
          i = 1;
        }
      }
    }
    label458:
    x.e(TAG, "parse step data error");
    return null;
    label468:
    g localg;
    boolean bool;
    if ((0L != (0x2 & l)) && ((((String)localObject).equalsIgnoreCase(g.hgY)) || (((String)localObject).equalsIgnoreCase(g.hgX))))
    {
      localg = new g();
      if ((localObject == null) || (((String)localObject).length() <= 0) || (paramArrayOfByte == null) || (paramArrayOfByte.length <= 0))
      {
        x.e(g.TAG, "characteristicUuid or data is null or nil");
        i = 0;
      }
      while (i != 0)
      {
        paramBluetoothGattCharacteristic = com.tencent.mm.plugin.exdevice.j.b.bw(localg);
        x.d(TAG, "weight info. weight = %d", new Object[] { Integer.valueOf(localg.hiv.hix) });
        return paramBluetoothGattCharacteristic;
        localg.hhi = ((String)localObject);
        if (localg.hhi.equalsIgnoreCase(g.hgX))
        {
          if (4 > paramArrayOfByte.length)
          {
            x.e(g.TAG, "weight scale feature characteristic data is a 32bit value, but current value len is %d", new Object[] { Integer.valueOf(paramArrayOfByte.length) });
            i = 0;
            continue;
          }
          localg.hiu = new g.c();
          paramBluetoothGattCharacteristic = localg.hiu;
          if ((paramArrayOfByte[0] & 0x1) != 0)
          {
            bool = true;
            paramBluetoothGattCharacteristic.hiA = bool;
            paramBluetoothGattCharacteristic = localg.hiu;
            if ((paramArrayOfByte[0] & 0x2) == 0) {
              break label872;
            }
            bool = true;
            paramBluetoothGattCharacteristic.hiB = bool;
            paramBluetoothGattCharacteristic = localg.hiu;
            if ((paramArrayOfByte[0] & 0x4) == 0) {
              break label878;
            }
            bool = true;
            paramBluetoothGattCharacteristic.hiC = bool;
            localg.hiu.hiD = ((byte)((paramArrayOfByte[0] & 0x78) >> 3));
            localg.hiu.hiE = ((byte)(((paramArrayOfByte[0] & 0x80) >> 7) + ((paramArrayOfByte[1] & 0x3) << 1)));
            str = g.TAG;
            if (!localg.hiu.hiA) {
              break label884;
            }
            paramBluetoothGattCharacteristic = "true";
            if (!localg.hiu.hiB) {
              break label891;
            }
            paramArrayOfByte = "true";
            if (!localg.hiu.hiC) {
              break label898;
            }
            localObject = "true";
            x.d(str, "timestampSupported = %s, multipleUsersSupported = %s, BMISupported = %s, weightResolution = %d, heightResolution = %d", new Object[] { paramBluetoothGattCharacteristic, paramArrayOfByte, localObject, Byte.valueOf(localg.hiu.hiD), Byte.valueOf(localg.hiu.hiE) });
          }
        }
        label872:
        label878:
        label884:
        label891:
        label898:
        while (!localg.hhi.equalsIgnoreCase(g.hgY)) {
          for (;;)
          {
            String str;
            i = 1;
            break;
            bool = false;
            continue;
            bool = false;
            continue;
            bool = false;
            continue;
            paramBluetoothGattCharacteristic = "false";
            continue;
            paramArrayOfByte = "false";
            continue;
            localObject = "false";
          }
        }
        k = paramArrayOfByte[0];
        if ((k & 0x2) == 0) {
          break label3887;
        }
      }
    }
    label1029:
    label1103:
    label1157:
    label1280:
    label1383:
    label1389:
    label1554:
    label2124:
    label2547:
    label2626:
    label2696:
    label2762:
    label2866:
    label2878:
    label2890:
    label2902:
    label3012:
    label3063:
    label3133:
    label3301:
    label3315:
    label3327:
    label3339:
    label3836:
    label3882:
    label3887:
    for (j = 10;; j = 3)
    {
      i = j;
      if ((k & 0x4) != 0) {
        i = j + 1;
      }
      j = i;
      if ((k & 0x8) != 0) {
        j = i + 4;
      }
      if (j > paramArrayOfByte.length)
      {
        x.e(g.TAG, "data len is not enough for parse. current len = %d, needed len = %d", new Object[] { Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(j) });
        i = 0;
        break;
      }
      localg.hiv = new g.b();
      paramBluetoothGattCharacteristic = localg.hiv;
      if ((k & 0x1) != 0)
      {
        bool = true;
        paramBluetoothGattCharacteristic.hiw = bool;
        localg.hiv.hix = ((paramArrayOfByte[1] & 0xFF) + ((paramArrayOfByte[2] & 0xFF) << 8));
        if ((k & 0x2) == 0) {
          break label3882;
        }
        localg.hiv.hiy = new g.a();
        paramBluetoothGattCharacteristic = localg.hiv.hiy;
        localObject = g.TAG;
        if (paramArrayOfByte != null) {
          break label1383;
        }
        i = 0;
        x.d((String)localObject, "data size = %d, offset = %d, lenght = %d", new Object[] { Integer.valueOf(i), Integer.valueOf(3), Integer.valueOf(7) });
        if ((paramArrayOfByte != null) && (paramArrayOfByte.length >= 10)) {
          break label1389;
        }
        x.e(g.TAG, "data input error");
      }
      for (i = 10;; i = 3)
      {
        j = i;
        if ((k & 0x4) != 0)
        {
          localg.hiv.hhy = (paramArrayOfByte[i] & 0xFF);
          j = i + 1;
        }
        if ((k & 0x8) != 0)
        {
          localg.hiv.hiz = ((paramArrayOfByte[j] & 0xFF) + ((paramArrayOfByte[(j + 1)] & 0xFF) << 8));
          i = j + 2;
          paramBluetoothGattCharacteristic = localg.hiv;
          j = paramArrayOfByte[i];
          paramBluetoothGattCharacteristic.mHeight = (((paramArrayOfByte[(i + 1)] & 0xFF) << 8) + (j & 0xFF));
        }
        localObject = g.TAG;
        if (localg.hiv.hiw)
        {
          paramBluetoothGattCharacteristic = "lb&inch";
          i = localg.hiv.hix;
          if (localg.hiv.hiy != null) {
            break label1554;
          }
        }
        for (paramArrayOfByte = "null";; paramArrayOfByte = "object")
        {
          x.d((String)localObject, "WeightAndHeightUnit = %s, Weight = %d, TimeStamp = %s, UserId = %d, BMI = %d, Height = %d", new Object[] { paramBluetoothGattCharacteristic, Integer.valueOf(i), paramArrayOfByte, Integer.valueOf(localg.hiv.hhy), Integer.valueOf(localg.hiv.hiz), Integer.valueOf(localg.hiv.mHeight) });
          break;
          bool = false;
          break label1029;
          i = paramArrayOfByte.length;
          break label1103;
          paramBluetoothGattCharacteristic.hhF = ((paramArrayOfByte[3] & 0xFF) + ((paramArrayOfByte[4] & 0xFF) << 8));
          paramBluetoothGattCharacteristic.hhG = (paramArrayOfByte[5] & 0xFF);
          paramBluetoothGattCharacteristic.hhH = (paramArrayOfByte[6] & 0xFF);
          paramBluetoothGattCharacteristic.hhI = (paramArrayOfByte[7] & 0xFF);
          paramBluetoothGattCharacteristic.hhJ = (paramArrayOfByte[8] & 0xFF);
          paramBluetoothGattCharacteristic.hhK = (paramArrayOfByte[9] & 0xFF);
          x.d(g.TAG, "year = %d, month = %d, day = %d, hours = %d, minutes = %d, seconds = %d", new Object[] { Integer.valueOf(paramBluetoothGattCharacteristic.hhF), Integer.valueOf(paramBluetoothGattCharacteristic.hhG), Integer.valueOf(paramBluetoothGattCharacteristic.hhH), Integer.valueOf(paramBluetoothGattCharacteristic.hhI), Integer.valueOf(paramBluetoothGattCharacteristic.hhJ), Integer.valueOf(paramBluetoothGattCharacteristic.hhK) });
          break label1157;
          paramBluetoothGattCharacteristic = "kg&meter";
          break label1280;
        }
        x.e(TAG, "parse weight scale data error");
        return null;
        int m;
        if ((0L != (0x4 & l)) && ((((String)localObject).equalsIgnoreCase(d.hhk)) || (((String)localObject).equalsIgnoreCase(d.hhM)) || (((String)localObject).equalsIgnoreCase(d.hhN))))
        {
          paramBluetoothGattCharacteristic = new d();
          if ((localObject == null) || (((String)localObject).length() <= 0) || (paramArrayOfByte == null)) {
            x.e(d.TAG, "characteristicUuid or data is null");
          }
          while (i != 0)
          {
            return com.tencent.mm.plugin.exdevice.j.b.bw(paramBluetoothGattCharacteristic);
            paramBluetoothGattCharacteristic.hhi = ((String)localObject);
            k = paramArrayOfByte.length;
            if (paramBluetoothGattCharacteristic.hhi.equalsIgnoreCase(d.hhk))
            {
              if (paramArrayOfByte.length < 2)
              {
                x.e(d.TAG, "Received data length is not right:" + k);
                continue;
              }
              paramBluetoothGattCharacteristic.hhU = new d.a(paramBluetoothGattCharacteristic);
              m = paramArrayOfByte[0];
              x.d(d.TAG, "flag=" + m);
              if (((m & 0x1) == 1) && (k >= 3))
              {
                x.d(d.TAG, "Value Format = uint16");
                i = paramArrayOfByte[2];
                paramBluetoothGattCharacteristic.hhU.hhV = ((i << 8 & 0xFF00 & 0xFF00) + (paramArrayOfByte[1] & 0xFF));
                i = 3;
                x.v(d.TAG, "Data received from HR " + paramBluetoothGattCharacteristic.hhU.hhV);
                if ((m & 0x6) != 4) {
                  break label2124;
                }
                x.d(d.TAG, "Sensor Contact feature is supported, but contact is not detected");
                paramBluetoothGattCharacteristic.hhU.hhW = 1;
                j = i;
                if ((m & 0x8) == 8)
                {
                  j = i;
                  if (k >= i + 2)
                  {
                    x.d(d.TAG, "Energy Expend Present");
                    j = paramArrayOfByte[(i + 1)] << 8 & 0xFF00;
                    paramBluetoothGattCharacteristic.hhU.hhX = ((paramArrayOfByte[i] & 0xFF) + (j & 0xFF00));
                    x.v("H7ConnectThread", "energyExp from HR energyExph " + j + " " + paramBluetoothGattCharacteristic.hhU.hhX);
                    j = i + 2;
                  }
                }
                if (((m & 0x10) == 16) && (k >= j + 2))
                {
                  x.d(d.TAG, "RR Interval Present");
                  i = (paramArrayOfByte[(j + 1)] & 0xFF) << 8;
                  paramBluetoothGattCharacteristic.hhU.hhY = ((paramArrayOfByte[j] & 0xFF) + (i & 0xFF00));
                  x.v(d.TAG, "rrInterval from HR rrIntervalh" + i + " " + paramBluetoothGattCharacteristic.hhU.hhY);
                }
              }
            }
            while (!paramBluetoothGattCharacteristic.hhi.equalsIgnoreCase(d.hhM)) {
              for (;;)
              {
                i = 1;
                break;
                if (k >= 2)
                {
                  x.d(d.TAG, "Value Format = uint8");
                  paramBluetoothGattCharacteristic.hhU.hhV = (paramArrayOfByte[1] & 0xFF);
                  i = 2;
                }
                else
                {
                  x.d(d.TAG, "receive data error");
                  break;
                  if ((m & 0x6) == 6)
                  {
                    x.d(d.TAG, "Sensor Contact feature is supported and contact is detected");
                    paramBluetoothGattCharacteristic.hhU.hhW = 2;
                  }
                  else
                  {
                    x.d(d.TAG, "Sensor Contact feature is not supported in the current connection");
                    paramBluetoothGattCharacteristic.hhU.hhW = 0;
                  }
                }
              }
            }
            switch (paramArrayOfByte[0])
            {
            default: 
              paramBluetoothGattCharacteristic.hhT = "Unknown";
            }
            for (;;)
            {
              x.d(d.TAG, "position=" + paramBluetoothGattCharacteristic.hhT);
              break;
              paramBluetoothGattCharacteristic.hhT = "Other";
              continue;
              paramBluetoothGattCharacteristic.hhT = "Chest";
              continue;
              paramBluetoothGattCharacteristic.hhT = "Wrist";
              continue;
              paramBluetoothGattCharacteristic.hhT = "Finger";
              continue;
              paramBluetoothGattCharacteristic.hhT = "Hand";
              continue;
              paramBluetoothGattCharacteristic.hhT = "Ear Lobe";
              continue;
              paramBluetoothGattCharacteristic.hhT = "Foot";
            }
          }
          x.e(TAG, "parse heart rate data error");
          return null;
        }
        if ((0L != (0x8 & l)) && ((((String)localObject).equalsIgnoreCase(b.hhk)) || (((String)localObject).equalsIgnoreCase(b.hhl)) || (((String)localObject).equalsIgnoreCase(b.hhm))))
        {
          paramBluetoothGattCharacteristic = new b();
          if ((localObject == null) || (((String)localObject).length() <= 0) || (paramArrayOfByte == null))
          {
            x.e(b.TAG, "characteristicUuid or data is null");
            i = j;
          }
          while (i != 0)
          {
            return com.tencent.mm.plugin.exdevice.j.b.bw(paramBluetoothGattCharacteristic);
            paramBluetoothGattCharacteristic.hhi = ((String)localObject);
            k = paramArrayOfByte.length;
            if (paramBluetoothGattCharacteristic.hhi.equalsIgnoreCase(b.hhk))
            {
              if (k < 7)
              {
                x.e(b.TAG, "data len is not right.");
                i = j;
                continue;
              }
              paramBluetoothGattCharacteristic.hhs = new b.b(paramBluetoothGattCharacteristic);
              m = paramArrayOfByte[0];
              x.d(b.TAG, "flag=" + m);
              if ((m & 0x1) != 0)
              {
                x.d(b.TAG, "the value unit is kPa.");
                paramBluetoothGattCharacteristic.hhs.hhv = true;
                paramBluetoothGattCharacteristic.hhs.hhC = b.K(paramArrayOfByte, 1);
                paramBluetoothGattCharacteristic.hhs.hhD = b.K(paramArrayOfByte, 3);
                paramBluetoothGattCharacteristic.hhs.hhE = b.K(paramArrayOfByte, 5);
                i = 7;
                if (((m & 0x2) == 0) || (k < 14)) {
                  break label2866;
                }
                x.d(b.TAG, "TimeStamp Present.");
                paramBluetoothGattCharacteristic.hhs.hhA.L(paramArrayOfByte, 7);
                i = 14;
                if (((m & 0x4) == 0) || (k < i + 2)) {
                  break label2878;
                }
                x.d(b.TAG, "PulseRate Present.");
                paramBluetoothGattCharacteristic.hhs.hhx = ((int)b.K(paramArrayOfByte, i));
                i += 2;
                x.d(b.TAG, "PulseRate =" + paramBluetoothGattCharacteristic.hhs.hhx);
                if ((m & 0x8) == 0) {
                  break label2890;
                }
                x.d(b.TAG, "UserId Present.");
                localObject = paramBluetoothGattCharacteristic.hhs;
                j = i + 1;
                ((b.b)localObject).hhy = paramArrayOfByte[i];
                x.d(b.TAG, "UserId = " + paramBluetoothGattCharacteristic.hhs.hhy);
                i = j;
                if ((m & 0x10) == 0) {
                  break label2902;
                }
                x.d(b.TAG, "MeasurementStatus Present.");
                j = paramArrayOfByte[(i + 1)];
                paramBluetoothGattCharacteristic.hhs.hhz = ((paramArrayOfByte[i] & 0xFF) + (j << 8 & 0xFF00 & 0xFF00));
                x.d(b.TAG, "MeasurementStatus = " + paramBluetoothGattCharacteristic.hhs.hhz);
              }
            }
            for (;;)
            {
              i = 1;
              break;
              x.d(b.TAG, "the value unit is mmHg.");
              paramBluetoothGattCharacteristic.hhs.hhv = false;
              break label2547;
              x.d(b.TAG, "TimeStamp not Present.");
              break label2626;
              x.d(b.TAG, "PulseRate not Present.");
              break label2696;
              x.d(b.TAG, "UserId not Present.");
              break label2762;
              x.d(b.TAG, "MeasurementStatus not Present.");
              continue;
              if (paramBluetoothGattCharacteristic.hhi.equalsIgnoreCase(b.hhl))
              {
                if (k < 3)
                {
                  x.e(b.TAG, "data len is not right.");
                  i = j;
                  break;
                }
                paramBluetoothGattCharacteristic.hht = new b.a(paramBluetoothGattCharacteristic);
                m = paramArrayOfByte[0];
                x.d(b.TAG, "flag=" + m);
                if ((m & 0x1) != 0)
                {
                  x.d(b.TAG, "the value unit is kPa.");
                  paramBluetoothGattCharacteristic.hht.hhv = true;
                  paramBluetoothGattCharacteristic.hht.hhw = b.K(paramArrayOfByte, 1);
                  if (((m & 0x2) == 0) || (k < 10)) {
                    break label3301;
                  }
                  x.d(b.TAG, "TimeStamp Present.");
                  paramBluetoothGattCharacteristic.hht.hhA.L(paramArrayOfByte, 3);
                  i = 10;
                  if (((m & 0x4) == 0) || (k < i + 2)) {
                    break label3315;
                  }
                  x.d(b.TAG, "PulseRate Present.");
                  paramBluetoothGattCharacteristic.hht.hhx = ((int)b.K(paramArrayOfByte, i));
                  i += 2;
                  x.d(b.TAG, "PulseRate =" + paramBluetoothGattCharacteristic.hht.hhx);
                  if ((m & 0x8) == 0) {
                    break label3327;
                  }
                  x.d(b.TAG, "UserId Present.");
                  localObject = paramBluetoothGattCharacteristic.hht;
                  j = i + 1;
                  ((b.a)localObject).hhy = paramArrayOfByte[i];
                  x.d(b.TAG, "UserId = " + paramBluetoothGattCharacteristic.hht.hhy);
                  i = j;
                }
                for (;;)
                {
                  if ((m & 0x10) == 0) {
                    break label3339;
                  }
                  x.d(b.TAG, "MeasurementStatus Present.");
                  j = paramArrayOfByte[(i + 1)];
                  paramBluetoothGattCharacteristic.hht.hhz = ((paramArrayOfByte[i] & 0xFF) + (j << 8 & 0xFF00 & 0xFF00));
                  x.d(b.TAG, "MeasurementStatus = " + paramBluetoothGattCharacteristic.hht.hhz);
                  break;
                  x.d(b.TAG, "the value unit is mmHg.");
                  paramBluetoothGattCharacteristic.hht.hhv = false;
                  break label3012;
                  x.d(b.TAG, "TimeStamp not Present.");
                  i = 3;
                  break label3063;
                  x.d(b.TAG, "PulseRate not Present.");
                  break label3133;
                  x.d(b.TAG, "UserId not Present.");
                }
                x.d(b.TAG, "MeasurementStatus not Present.");
                continue;
              }
              if (paramBluetoothGattCharacteristic.hhi.equalsIgnoreCase(b.hhm))
              {
                x.d(b.TAG, "Blood Pressure Feature Characteristic.");
                if (k < 2)
                {
                  x.e(b.TAG, "data len is not right.");
                  i = j;
                  break;
                }
                paramBluetoothGattCharacteristic.hhu = ((paramArrayOfByte[1] << 8 & 0xFF00 & 0xFF00) + (paramArrayOfByte[0] & 0xFF));
                x.d(b.TAG, "bloodPressureFeatureParameters=" + paramBluetoothGattCharacteristic.hhu);
              }
            }
          }
          x.e(TAG, "parse blood pressure data error");
          return null;
        }
        if ((0L != (l & 0x10)) && ((((String)localObject).equalsIgnoreCase(e.hia)) || (((String)localObject).equalsIgnoreCase(e.hib)) || (((String)localObject).equalsIgnoreCase(e.hic)) || (((String)localObject).equalsIgnoreCase(e.hid))))
        {
          paramBluetoothGattCharacteristic = new e();
          if ((localObject == null) || (((String)localObject).length() <= 0) || (paramArrayOfByte == null))
          {
            x.e(e.TAG, "characteristicUuid or data is null");
            i = k;
          }
          while (i != 0)
          {
            return com.tencent.mm.plugin.exdevice.j.b.bw(paramBluetoothGattCharacteristic);
            paramBluetoothGattCharacteristic.hhi = ((String)localObject);
            if (paramBluetoothGattCharacteristic.hhi.equalsIgnoreCase(e.hia))
            {
              if (paramArrayOfByte.length != 3)
              {
                x.e(e.TAG, "Data length incorrect");
                i = k;
              }
              else
              {
                paramBluetoothGattCharacteristic.hie = paramArrayOfByte[0];
                paramBluetoothGattCharacteristic.hif = paramArrayOfByte[1];
                paramBluetoothGattCharacteristic.hig = paramArrayOfByte[2];
              }
            }
            else
            {
              for (;;)
              {
                i = 1;
                break;
                if (paramBluetoothGattCharacteristic.hhi.equalsIgnoreCase(e.hib))
                {
                  if (paramArrayOfByte.length != 1)
                  {
                    x.e(e.TAG, "Data length incorrect");
                    i = k;
                    break;
                  }
                  paramBluetoothGattCharacteristic.hih = paramArrayOfByte[0];
                  continue;
                }
                if (paramBluetoothGattCharacteristic.hhi.equalsIgnoreCase(e.hic))
                {
                  if (paramArrayOfByte.length < 2)
                  {
                    x.e(e.TAG, "Data length incorrect");
                    i = k;
                    break;
                  }
                  paramBluetoothGattCharacteristic.hii[0] = paramArrayOfByte[0];
                  paramBluetoothGattCharacteristic.hii[1] = paramArrayOfByte[1];
                  continue;
                }
                if (!paramBluetoothGattCharacteristic.hhi.equalsIgnoreCase(e.hid)) {
                  break label3836;
                }
                if (paramArrayOfByte.length < 4)
                {
                  x.e(e.TAG, "Data length incorrect");
                  i = k;
                  break;
                }
                paramBluetoothGattCharacteristic.hij = ((paramArrayOfByte[0] & 0xFF) + ((paramArrayOfByte[1] & 0xFF) << 8));
                paramBluetoothGattCharacteristic.hil = paramArrayOfByte[2];
                paramBluetoothGattCharacteristic.hik = paramArrayOfByte[3];
                if (paramArrayOfByte.length > 4)
                {
                  paramBluetoothGattCharacteristic.him = new byte[paramArrayOfByte.length - 4];
                  System.arraycopy(paramArrayOfByte, 4, paramBluetoothGattCharacteristic.him, 0, paramArrayOfByte.length - 4);
                }
                else
                {
                  paramBluetoothGattCharacteristic.him = null;
                }
              }
              x.e(e.TAG, "characteristicUuid is incorrect");
              i = k;
            }
          }
          x.e(TAG, "parse light data error");
          return null;
        }
        x.e(TAG, "unknown characteristic uuid = %s", new Object[] { localObject });
        return null;
      }
    }
  }
  
  public static boolean ae(byte[] paramArrayOfByte)
  {
    if (bi.bC(paramArrayOfByte))
    {
      x.e(TAG, "parseBroadcastServiceUuid error. broadcast data is null or nil");
      return false;
    }
    int i = 0;
    int j;
    int m;
    label180:
    Object localObject;
    while ((i >= 0) && (i < paramArrayOfByte.length))
    {
      int k = i + 1;
      i = paramArrayOfByte[i];
      if (k + i > paramArrayOfByte.length)
      {
        x.w(TAG, "broadcast data len is not enough. offset = %d, current len = %d, broadcast len = %d", new Object[] { Integer.valueOf(k), Integer.valueOf(i), Integer.valueOf(paramArrayOfByte.length) });
        return false;
      }
      if (i <= 0)
      {
        x.w(TAG, "current part of data's len = %d.", new Object[] { Integer.valueOf(i) });
        return false;
      }
      j = k + 1;
      int n = paramArrayOfByte[k];
      m = i - 1;
      i = m;
      k = j;
      switch (n)
      {
      case 0: 
      case 1: 
      case 4: 
      case 5: 
      default: 
        i = m + j;
        break;
      case 2: 
      case 3: 
        while (2 <= i)
        {
          m = k + 1;
          j = paramArrayOfByte[k];
          k = m + 1;
          m = paramArrayOfByte[m];
          i -= 2;
          localObject = String.format("%08x-0000-1000-8000-00805f9b34fb", new Object[] { Integer.valueOf((m & 0xFF) << 8 | j & 0xFF) });
          x.d(TAG, "find 16-bit broacast service = %s", new Object[] { localObject });
          if (hgB.containsKey(localObject)) {
            return true;
          }
        }
        i += k;
      }
    }
    label288:
    j += 16;
    i -= 16;
    for (;;)
    {
      if (16 <= i) {
        try
        {
          localObject = ByteBuffer.wrap(paramArrayOfByte, j, 16).order(ByteOrder.LITTLE_ENDIAN);
          long l = ((ByteBuffer)localObject).getLong();
          localObject = new UUID(((ByteBuffer)localObject).getLong(), l).toString();
          x.d(TAG, "find 128-bit broacast service = %s", new Object[] { localObject });
          boolean bool = hgB.containsKey(localObject);
          if (!bool) {
            break label288;
          }
          return true;
        }
        catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
        {
          localIndexOutOfBoundsException = localIndexOutOfBoundsException;
          x.e("BlueToothDeviceFilter.parseUUID", localIndexOutOfBoundsException.toString());
          j += 16;
          i -= 16;
          continue;
        }
        finally {}
      }
      i = j + i;
      break;
      x.i(TAG, "Manufacturer Specific Data size = %s", new Object[] { Integer.valueOf(m) });
      x.i(TAG, "Manufacturer Specific Data = %s", new Object[] { com.tencent.mm.plugin.exdevice.j.b.aq(Arrays.copyOfRange(paramArrayOfByte, j, j + m)) });
      break label180;
      i = m;
    }
  }
  
  public static boolean b(BluetoothGattService paramBluetoothGattService)
  {
    if (paramBluetoothGattService == null) {
      x.e(TAG, "service is null");
    }
    long l;
    do
    {
      return false;
      l = a(paramBluetoothGattService);
      if (0L != (1L & l))
      {
        if (paramBluetoothGattService == null)
        {
          x.e(TAG, "service is null");
          return false;
        }
        localBluetoothGattCharacteristic = paramBluetoothGattService.getCharacteristic(UUID.fromString(h.hgQ));
        if (localBluetoothGattCharacteristic == null)
        {
          x.e(TAG, "no step measurement characteristic found");
          return false;
        }
        i = localBluetoothGattCharacteristic.getProperties();
        x.d(TAG, "step measurement characteristic properties = %d", new Object[] { Integer.valueOf(i) });
        if (((i & 0x30) == 0) || ((i & 0x2) == 0))
        {
          x.e(TAG, "step measurement characteristic has incorrect proterties(%d)", new Object[] { Integer.valueOf(i) });
          return false;
        }
        paramBluetoothGattService = paramBluetoothGattService.getCharacteristic(UUID.fromString(h.hgR));
        if (paramBluetoothGattService != null)
        {
          i = paramBluetoothGattService.getProperties();
          if (((i & 0x2) == 0) || ((i & 0x20) == 0))
          {
            x.e(TAG, "step target characteristic has incorrect proterties(%d)", new Object[] { Integer.valueOf(i) });
            return false;
          }
        }
        return true;
      }
      if (0L != (0x2 & l))
      {
        if (paramBluetoothGattService == null)
        {
          x.e(TAG, "service is null");
          return false;
        }
        localBluetoothGattCharacteristic = paramBluetoothGattService.getCharacteristic(UUID.fromString(h.hgX));
        if (localBluetoothGattCharacteristic == null)
        {
          x.e(TAG, "weight scale feature characteristic not found");
          return false;
        }
        i = localBluetoothGattCharacteristic.getProperties();
        if ((i & 0x2) == 0)
        {
          x.e(TAG, "weight scale feature characteristic has incorrect properties(%d). properties(%d) needed", new Object[] { Integer.valueOf(i), Integer.valueOf(2) });
          return false;
        }
        paramBluetoothGattService = paramBluetoothGattService.getCharacteristic(UUID.fromString(h.hgY));
        if (paramBluetoothGattService == null)
        {
          x.e(TAG, "weight measurement characteristic not found");
          return false;
        }
        i = paramBluetoothGattService.getProperties();
        if ((i & 0x20) == 0)
        {
          x.e(TAG, "weight measurement characteristic has incorrect properties(%d). properties(%d) needed", new Object[] { Integer.valueOf(i), Integer.valueOf(32) });
          return false;
        }
        return true;
      }
      if (0L != (0x4 & l))
      {
        if (paramBluetoothGattService == null)
        {
          x.e(TAG, "service is null");
          return false;
        }
        localBluetoothGattCharacteristic = paramBluetoothGattService.getCharacteristic(UUID.fromString(h.hha));
        if (localBluetoothGattCharacteristic == null)
        {
          x.e(TAG, "heart rate measurement characteristic not found");
          return false;
        }
        i = localBluetoothGattCharacteristic.getProperties();
        if ((i & 0x10) == 0)
        {
          x.e(TAG, "heart rate measurement characteristic has incorrect properties(%d). properties(%d) needed", new Object[] { Integer.valueOf(i), Integer.valueOf(16) });
          return false;
        }
        localBluetoothGattCharacteristic = paramBluetoothGattService.getCharacteristic(UUID.fromString(h.hhb));
        if (localBluetoothGattCharacteristic != null)
        {
          i = localBluetoothGattCharacteristic.getProperties();
          if ((i & 0x2) == 0)
          {
            x.e(TAG, "heart rate body sensor location characteristic has incorrect properties(%d). properties(%d) needed", new Object[] { Integer.valueOf(i), Integer.valueOf(2) });
            return false;
          }
        }
        paramBluetoothGattService = paramBluetoothGattService.getCharacteristic(UUID.fromString(h.hhc));
        if (paramBluetoothGattService != null)
        {
          i = paramBluetoothGattService.getProperties();
          if ((i & 0x8) == 0)
          {
            x.e(TAG, "heart rate control point characteristic has incorrect properties(%d). properties(%d) needed", new Object[] { Integer.valueOf(i), Integer.valueOf(8) });
            return false;
          }
        }
        return true;
      }
      if (0L != (0x8 & l))
      {
        if (paramBluetoothGattService == null)
        {
          x.e(TAG, "service is null");
          return false;
        }
        localBluetoothGattCharacteristic = paramBluetoothGattService.getCharacteristic(UUID.fromString(h.hhe));
        if (localBluetoothGattCharacteristic == null)
        {
          x.e(TAG, "blood pressure measurement characteristic not found");
          return false;
        }
        i = localBluetoothGattCharacteristic.getProperties();
        if ((i & 0x20) == 0)
        {
          x.e(TAG, "blood pressure measurement characteristic has incorrect properties(%d). properties(%d) needed", new Object[] { Integer.valueOf(i), Integer.valueOf(32) });
          return false;
        }
        localBluetoothGattCharacteristic = paramBluetoothGattService.getCharacteristic(UUID.fromString(h.hhg));
        if (localBluetoothGattCharacteristic == null)
        {
          x.e(TAG, "blood pressure feature characteristic not found");
          return false;
        }
        i = localBluetoothGattCharacteristic.getProperties();
        if ((i & 0x2) == 0)
        {
          x.e(TAG, "blood pressure feature characteristic has incorrect properties(%d). properties(%d) needed", new Object[] { Integer.valueOf(i), Integer.valueOf(2) });
          return false;
        }
        paramBluetoothGattService = paramBluetoothGattService.getCharacteristic(UUID.fromString(h.hhf));
        if (paramBluetoothGattService != null)
        {
          i = paramBluetoothGattService.getProperties();
          if ((i & 0x10) == 0)
          {
            x.e(TAG, "blood pressure intermediate cuff pressure characteristic has incorrect properties(%d). properties(%d) needed", new Object[] { Integer.valueOf(i), Integer.valueOf(16) });
            return false;
          }
        }
        return true;
      }
    } while (0L == (l & 0x10));
    if (paramBluetoothGattService == null)
    {
      x.e(TAG, "service is null");
      return false;
    }
    BluetoothGattCharacteristic localBluetoothGattCharacteristic = paramBluetoothGattService.getCharacteristic(UUID.fromString(h.hgS));
    if (localBluetoothGattCharacteristic == null)
    {
      x.e(TAG, "light color characteristic not found");
      return false;
    }
    int i = localBluetoothGattCharacteristic.getProperties();
    if (((i & 0x20) == 0) || ((i & 0x10) == 0) || ((i & 0x2) == 0) || ((i & 0x8) == 0))
    {
      x.e(TAG, "light color characteristic has incorrect properties(%d). properties(%d) needed", new Object[] { Integer.valueOf(i), Integer.valueOf(32) });
      return false;
    }
    localBluetoothGattCharacteristic = paramBluetoothGattService.getCharacteristic(UUID.fromString(h.hgT));
    if (localBluetoothGattCharacteristic == null)
    {
      x.e(TAG, "light work state characteristic not found");
      return false;
    }
    i = localBluetoothGattCharacteristic.getProperties();
    if (((i & 0x20) == 0) || ((i & 0x2) == 0) || ((i & 0x8) == 0))
    {
      x.e(TAG, "light work state characteristic has incorrect properties(%d). properties(%d) needed", new Object[] { Integer.valueOf(i), Integer.valueOf(32) });
      return false;
    }
    localBluetoothGattCharacteristic = paramBluetoothGattService.getCharacteristic(UUID.fromString(h.hgU));
    if (localBluetoothGattCharacteristic == null)
    {
      x.e(TAG, "light state changed characteristic not found");
      return false;
    }
    i = localBluetoothGattCharacteristic.getProperties();
    if ((i & 0x20) == 0)
    {
      x.e(TAG, "light state changed characteristic has incorrect properties(%d). properties(%d) needed", new Object[] { Integer.valueOf(i), Integer.valueOf(32) });
      return false;
    }
    paramBluetoothGattService = paramBluetoothGattService.getCharacteristic(UUID.fromString(h.hgV));
    if (paramBluetoothGattService == null)
    {
      x.e(TAG, "control point characteristic not found");
      return false;
    }
    i = paramBluetoothGattService.getProperties();
    if (((i & 0x20) == 0) || ((i & 0x8) == 0))
    {
      x.e(TAG, "control point characteristic has incorrect properties(%d). properties(%d) needed", new Object[] { Integer.valueOf(i), Integer.valueOf(32) });
      return false;
    }
    return true;
  }
  
  public static String bX(long paramLong)
  {
    Iterator localIterator = hgB.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (((Long)hgB.get(str)).longValue() == paramLong) {
        return str;
      }
    }
    if (hhL.containsValue(Long.valueOf(paramLong))) {
      return h.hgN;
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/h/a/b/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */