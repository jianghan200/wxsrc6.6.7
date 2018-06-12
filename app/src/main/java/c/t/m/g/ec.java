package c.t.m.g;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build.VERSION;
import android.provider.Settings.Global;
import android.provider.Settings.System;
import android.telephony.CellInfo;
import android.telephony.CellLocation;
import android.telephony.NeighboringCellInfo;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.eclipse.jdt.annotation.NonNull;

public final class ec
{
  public static boolean a = false;
  
  public static int a(CellLocation paramCellLocation)
  {
    if ((paramCellLocation instanceof CdmaCellLocation)) {
      return ((CdmaCellLocation)paramCellLocation).getBaseStationId();
    }
    try
    {
      int i = ((GsmCellLocation)paramCellLocation).getCid();
      return i;
    }
    catch (Exception paramCellLocation) {}
    return -1;
  }
  
  @SuppressLint({"NewApi"})
  public static List<dp> a(ct paramct)
  {
    Object localObject1;
    try
    {
      localObject1 = paramct.e;
      if (localObject1 != null)
      {
        Object localObject2 = ((TelephonyManager)localObject1).getAllCellInfo();
        if (localObject2 == null) {
          break label79;
        }
        localObject1 = new ArrayList();
        localObject2 = ((List)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          CellInfo localCellInfo = (CellInfo)((Iterator)localObject2).next();
          if (localCellInfo.isRegistered()) {
            ((List)localObject1).add(dp.a(paramct, localCellInfo));
          }
        }
      }
      return null;
    }
    catch (Throwable paramct) {}
    return (List<dp>)localObject1;
    label79:
    return null;
  }
  
  public static void a(@NonNull TelephonyManager paramTelephonyManager, @NonNull int[] paramArrayOfInt)
  {
    paramTelephonyManager = paramTelephonyManager.getNetworkOperator();
    if ((paramTelephonyManager != null) && (paramTelephonyManager.length() >= 5)) {
      try
      {
        paramArrayOfInt[0] = Integer.parseInt(paramTelephonyManager.substring(0, 3));
        paramArrayOfInt[1] = Integer.parseInt(paramTelephonyManager.substring(3, 5));
        return;
      }
      catch (Throwable paramTelephonyManager)
      {
        paramTelephonyManager.toString();
      }
    }
    paramArrayOfInt[0] = 460;
    paramArrayOfInt[1] = 0;
  }
  
  private static boolean a(int paramInt)
  {
    return paramInt != dp.a.c.ordinal();
  }
  
  public static boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    boolean bool2 = true;
    boolean bool1;
    if (b(paramInt1)) {
      if ((paramInt2 >= 0) && (paramInt3 >= 0) && (paramInt4 >= 0) && (paramInt4 <= 65535) && (paramInt5 > 0) && (paramInt5 <= 65535))
      {
        bool1 = bool2;
        if (paramInt3 == 0)
        {
          bool1 = bool2;
          if (paramInt4 == 0)
          {
            bool1 = bool2;
            if (paramInt5 != 0) {}
          }
        }
      }
      else
      {
        bool1 = false;
      }
    }
    do
    {
      return bool1;
      if ((paramInt2 < 0) || (paramInt3 < 0) || (paramInt4 <= 0) || (paramInt4 >= 65535)) {
        return false;
      }
      if ((paramInt5 == 268435455) || (paramInt5 == Integer.MAX_VALUE) || (paramInt5 == 50594049) || (paramInt5 == 65535) || (paramInt5 <= 0)) {
        return false;
      }
      if (paramInt5 == 65535) {
        break;
      }
      bool1 = bool2;
    } while (paramInt5 > 0);
    return false;
  }
  
  public static boolean a(int paramInt, SignalStrength paramSignalStrength1, SignalStrength paramSignalStrength2)
  {
    if ((paramSignalStrength1 == null) || (paramSignalStrength2 == null)) {}
    int i;
    do
    {
      do
      {
        return true;
        i = Math.abs(b(paramInt, paramSignalStrength1, paramSignalStrength2));
        if (!a(paramInt)) {
          break;
        }
      } while (i > 3);
      return false;
      if (!b(paramInt)) {
        break;
      }
    } while (i > 6);
    return false;
    return false;
  }
  
  @SuppressLint({"NewApi"})
  public static boolean a(Context paramContext)
  {
    boolean bool = true;
    try
    {
      if (Build.VERSION.SDK_INT >= 17)
      {
        if (Settings.Global.getInt(paramContext.getContentResolver(), "airplane_mode_on") != 1) {
          break label47;
        }
        return true;
      }
      int i = Settings.System.getInt(paramContext.getContentResolver(), "airplane_mode_on");
      if (i != 1) {
        return false;
      }
    }
    catch (Throwable paramContext)
    {
      bool = false;
    }
    return bool;
    label47:
    return false;
  }
  
  public static boolean a(CellLocation paramCellLocation1, CellLocation paramCellLocation2)
  {
    int i;
    if ((paramCellLocation1 == null) || (paramCellLocation2 == null))
    {
      i = 1;
      if (i == 0) {
        break label21;
      }
    }
    label21:
    label62:
    do
    {
      do
      {
        do
        {
          do
          {
            return false;
            i = 0;
            break;
          } while (paramCellLocation1.getClass() != paramCellLocation2.getClass());
          if (!(paramCellLocation1 instanceof GsmCellLocation)) {
            break label62;
          }
          paramCellLocation1 = (GsmCellLocation)paramCellLocation1;
          paramCellLocation2 = (GsmCellLocation)paramCellLocation2;
        } while (paramCellLocation1.getCid() != paramCellLocation2.getCid());
        return true;
      } while (!(paramCellLocation1 instanceof CdmaCellLocation));
      paramCellLocation1 = (CdmaCellLocation)paramCellLocation1;
      paramCellLocation2 = (CdmaCellLocation)paramCellLocation2;
    } while (paramCellLocation1.getBaseStationId() != paramCellLocation2.getBaseStationId());
    return true;
  }
  
  public static boolean a(dp paramdp)
  {
    if (paramdp == null) {}
    for (int i = 1; i != 0; i = 0) {
      return false;
    }
    return a(paramdp.a.ordinal(), paramdp.b, paramdp.c, paramdp.d, paramdp.e);
  }
  
  private static int b(int paramInt, SignalStrength paramSignalStrength1, SignalStrength paramSignalStrength2)
  {
    try
    {
      if (a(paramInt)) {
        return paramSignalStrength1.getGsmSignalStrength() - paramSignalStrength2.getGsmSignalStrength();
      }
      if (b(paramInt))
      {
        paramInt = paramSignalStrength1.getCdmaDbm();
        int i = paramSignalStrength2.getCdmaDbm();
        return paramInt - i;
      }
    }
    catch (Throwable paramSignalStrength1) {}
    return 0;
  }
  
  public static CellLocation b(ct paramct)
  {
    boolean bool2 = false;
    TelephonyManager localTelephonyManager = paramct.e;
    if (localTelephonyManager != null) {
      try
      {
        CellLocation localCellLocation = localTelephonyManager.getCellLocation();
        int i = localTelephonyManager.getSimState();
        int j;
        if (i == 5) {
          j = 1;
        }
        for (;;)
        {
          try
          {
            bool1 = TextUtils.isEmpty(localTelephonyManager.getSubscriberId());
            if (bool1) {
              continue;
            }
            i = 1;
          }
          catch (Exception localException)
          {
            boolean bool1;
            i = 1;
            continue;
          }
          if ((j != 0) && (i != 0))
          {
            if ((localCellLocation != null) && (!b(localCellLocation)))
            {
              bool1 = bool2;
              if (a(localCellLocation) >= 0) {}
            }
            else
            {
              bool1 = bool2;
              if (!a(paramct.a)) {
                bool1 = true;
              }
            }
            a = bool1;
          }
          return localCellLocation;
          j = 0;
          continue;
          i = 0;
        }
        return CellLocation.getEmpty();
      }
      catch (Exception paramct)
      {
        a = true;
      }
    }
  }
  
  private static boolean b(int paramInt)
  {
    return paramInt == dp.a.c.ordinal();
  }
  
  private static boolean b(CellLocation paramCellLocation)
  {
    try
    {
      paramCellLocation = (GsmCellLocation)paramCellLocation;
      if (paramCellLocation.getCid() == 0)
      {
        int i = paramCellLocation.getLac();
        if (i == 0) {
          return true;
        }
      }
    }
    catch (ClassCastException paramCellLocation) {}
    return false;
  }
  
  public static List<NeighboringCellInfo> c(ct paramct)
  {
    paramct = paramct.e;
    if (paramct != null) {
      try
      {
        paramct = paramct.getNeighboringCellInfo();
        return paramct;
      }
      catch (Exception paramct) {}
    }
    return Collections.emptyList();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/c/t/m/g/ec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */