package com.tencent.mm.plugin.h.a.a;

import com.tencent.mm.sdk.platformtools.x;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Vector;
import junit.framework.Assert;

public final class d
{
  private final HashMap<c, Vector<Integer>> dsh = new HashMap();
  private b heQ = null;
  
  public d(b paramb)
  {
    this.heQ = paramb;
  }
  
  private void a(Vector<Integer> paramVector, c paramc)
  {
    x.i("MicroMsg.exdevie.IBeaconManager", "calDistance");
    Object localObject = new int[paramVector.size()];
    int i = 0;
    while (i < localObject.length)
    {
      localObject[i] = ((Integer)paramVector.elementAt(i)).intValue();
      i += 1;
    }
    paramVector = new a((int[])localObject);
    if (1 == paramVector.heM.length)
    {
      x.d("MicroMsg.exdevice.GaussianFilter", "data group length = 1, no need to filter, just return");
      paramVector = paramVector.heM;
    }
    while ((paramVector == null) || (paramVector.length == 0))
    {
      throw new NullPointerException("null == ret || 0 == ret.length");
      localObject = new StringBuilder("");
      ((StringBuilder)localObject).append("Data Before GaussianFilter \r\n");
      i = 0;
      while (i < paramVector.heM.length)
      {
        ((StringBuilder)localObject).append(" " + paramVector.heM[i]);
        i += 1;
      }
      x.d("MicroMsg.exdevice.GaussianFilter", ((StringBuilder)localObject).toString());
      d1 = i.i(paramVector.heM);
      d2 = i.j(paramVector.heM);
      d3 = i.j(0.15D, d2).add(new BigDecimal(d1)).doubleValue();
      double d4 = i.j(3.09D, d2).add(new BigDecimal(d1)).doubleValue();
      x.d("MicroMsg.exdevice.GaussianFilter", "Mean = " + d1 + "SD = " + d2 + "LowerLimit = " + d3 + " UpperLimit = " + d4);
      i = 0;
      localObject = new int[paramVector.heM.length];
      int j = 0;
      while (j < paramVector.heM.length)
      {
        int k = i;
        if (paramVector.heM[j] >= d3)
        {
          k = i;
          if (paramVector.heM[j] <= d4)
          {
            localObject[i] = paramVector.heM[j];
            k = i + 1;
          }
        }
        j += 1;
        i = k;
      }
      if (i != 0) {}
      for (boolean bool = true;; bool = false)
      {
        Assert.assertTrue(bool);
        paramVector = new int[i];
        j = 0;
        while (j < i)
        {
          paramVector[j] = localObject[j];
          j += 1;
        }
      }
      localObject = new StringBuilder("");
      ((StringBuilder)localObject).append("Data After GaussianFilter \r\n");
      i = 0;
      while (i < paramVector.length)
      {
        ((StringBuilder)localObject).append(" " + paramVector[i]);
        i += 1;
      }
      x.d("MicroMsg.exdevice.GaussianFilter", ((StringBuilder)localObject).toString());
    }
    double d2 = i.i(paramVector);
    paramc.heP = new BigDecimal(d2).divide(new BigDecimal(1), 3, 4).doubleValue();
    double d3 = paramc.heO.heS.hfw;
    double d1 = 1.0D * d2 / d3;
    if (d1 < 1.0D) {}
    for (d1 = Math.pow(d1, 10.0D);; d1 = Math.pow(d1, 9.9476D) * 0.92093D + 0.54992D)
    {
      x.i("MicroMsg.exdevie.IBeaconManager", "txPower = %f , rssi = %f,distance = %f", new Object[] { Double.valueOf(d3), Double.valueOf(d2), Double.valueOf(d1) });
      this.heQ.a(d1, paramc);
      return;
    }
  }
  
  public final void a(int paramInt, String paramString, e parame)
  {
    x.i("MicroMsg.exdevie.IBeaconManager", "advertismentProcess, brand = %s, rssi = %d", new Object[] { null, Integer.valueOf(paramInt) });
    if (parame == null) {
      x.e("MicroMsg.exdevie.IBeaconManager", "null == aProtocal");
    }
    c localc;
    do
    {
      return;
      localc = new c();
      localc.heN = null;
      localc.heO = parame;
      localc.bvw = paramString;
      if (!this.dsh.containsKey(localc))
      {
        paramString = new Vector();
        paramString.add(Integer.valueOf(paramInt));
        this.dsh.put(localc, paramString);
        return;
      }
      paramString = (Vector)this.dsh.get(localc);
      paramString.add(Integer.valueOf(paramInt));
    } while (1 > paramString.size());
    try
    {
      a(paramString, localc);
      return;
    }
    catch (Exception parame)
    {
      x.e("MicroMsg.exdevie.IBeaconManager", "calDistance failed!!!, %s", new Object[] { parame.getMessage() });
      return;
    }
    finally
    {
      paramString.clear();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/h/a/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */