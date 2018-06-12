package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.support.v4.content.a;
import com.tencent.mm.sdk.platformtools.ad;
import java.lang.reflect.Method;
import java.util.UUID;

public final class b
{
  @TargetApi(18)
  public static boolean a(BluetoothGatt paramBluetoothGatt)
  {
    if (paramBluetoothGatt != null) {}
    for (;;)
    {
      try
      {
        Method localMethod = BluetoothGatt.class.getMethod("refresh", new Class[0]);
        if (localMethod != null)
        {
          localMethod.setAccessible(true);
          bool = ((Boolean)localMethod.invoke(paramBluetoothGatt, new Object[0])).booleanValue();
          return bool;
        }
      }
      catch (Exception paramBluetoothGatt)
      {
        return false;
      }
      boolean bool = false;
    }
  }
  
  /* Error */
  @android.annotation.SuppressLint({"MissingPermission", "NewApi"})
  public static BluetoothAdapter aiA()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: invokestatic 48	com/tencent/mm/plugin/appbrand/jsapi/bluetooth/ble/sdk/d/b:aiz	()Landroid/bluetooth/BluetoothManager;
    //   6: astore_0
    //   7: aload_0
    //   8: ifnull +13 -> 21
    //   11: aload_0
    //   12: invokevirtual 53	android/bluetooth/BluetoothManager:getAdapter	()Landroid/bluetooth/BluetoothAdapter;
    //   15: astore_0
    //   16: ldc 2
    //   18: monitorexit
    //   19: aload_0
    //   20: areturn
    //   21: ldc 55
    //   23: ldc 57
    //   25: iconst_0
    //   26: anewarray 4	java/lang/Object
    //   29: invokestatic 63	com/tencent/mm/plugin/appbrand/jsapi/bluetooth/ble/sdk/d/a:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   32: aconst_null
    //   33: astore_0
    //   34: goto -18 -> 16
    //   37: astore_0
    //   38: ldc 2
    //   40: monitorexit
    //   41: aload_0
    //   42: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   6	28	0	localObject1	Object
    //   37	5	0	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   3	7	37	finally
    //   11	16	37	finally
    //   21	32	37	finally
  }
  
  public static boolean aiB()
  {
    if (aiA() == null) {
      return false;
    }
    return aiA().isEnabled();
  }
  
  private static BluetoothManager aiz()
  {
    try
    {
      BluetoothManager localBluetoothManager = (BluetoothManager)ad.getContext().getSystemService("bluetooth");
      return localBluetoothManager;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static boolean kE(int paramInt)
  {
    return (paramInt & 0x2) > 0;
  }
  
  public static boolean kF(int paramInt)
  {
    return (paramInt & 0x8) > 0;
  }
  
  public static boolean kG(int paramInt)
  {
    return (paramInt & 0x4) > 0;
  }
  
  public static boolean kH(int paramInt)
  {
    return (paramInt & 0x10) > 0;
  }
  
  public static boolean kI(int paramInt)
  {
    return (paramInt & 0x20) > 0;
  }
  
  public static boolean tu(String paramString)
  {
    return a.f(ad.getContext(), paramString) == 0;
  }
  
  public static boolean tv(String paramString)
  {
    try
    {
      UUID.fromString(paramString);
      return true;
    }
    catch (Exception paramString) {}
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bluetooth/ble/sdk/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */