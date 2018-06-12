package com.tencent.mm.plugin.sport.c;

import android.os.RemoteException;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.sport.PluginSport;
import com.tencent.mm.sdk.platformtools.ad;

public final class i
{
  public static long L(int paramInt, long paramLong)
  {
    if (ad.cic()) {
      return ((PluginSport)g.n(PluginSport.class)).getSportFileStorage().getLong(paramInt, paramLong);
    }
    return new h(com.tencent.mm.plugin.sport.b.a.ooI).getLong(paramInt, paramLong);
  }
  
  public static void M(int paramInt, long paramLong)
  {
    if (ad.cic())
    {
      ((PluginSport)g.n(PluginSport.class)).getSportFileStorage().setLong(paramInt, paramLong);
      return;
    }
    throw new RuntimeException(String.format("not support set value in %s process", new Object[] { ad.getProcessName() }));
  }
  
  public static void N(int paramInt, long paramLong)
  {
    if (ad.cif()) {
      ((PluginSport)g.n(PluginSport.class)).getSportFileStorage().setLong(paramInt, paramLong);
    }
    com.tencent.mm.plugin.sport.a.a locala;
    do
    {
      do
      {
        return;
      } while (!ad.cic());
      locala = ((PluginSport)g.n(PluginSport.class)).getDeviceStepManager().ooN;
    } while (locala == null);
    try
    {
      locala.K(paramInt, paramLong);
      return;
    }
    catch (RemoteException localRemoteException) {}
  }
  
  public static h bFN()
  {
    if (ad.cic()) {
      return new h(com.tencent.mm.plugin.sport.b.a.ooI);
    }
    if (ad.cif()) {
      return new h(com.tencent.mm.plugin.sport.b.a.ooH);
    }
    return null;
  }
  
  public static long xS(int paramInt)
  {
    if (ad.cif()) {
      return ((PluginSport)g.n(PluginSport.class)).getSportFileStorage().getLong(paramInt, 0L);
    }
    if (ad.cic())
    {
      com.tencent.mm.plugin.sport.a.a locala = ((PluginSport)g.n(PluginSport.class)).getDeviceStepManager().ooN;
      if (locala != null) {
        try
        {
          long l = locala.getLong(paramInt, 0L);
          return l;
        }
        catch (RemoteException localRemoteException) {}
      }
    }
    return new h(com.tencent.mm.plugin.sport.b.a.ooH).getLong(paramInt, 0L);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/sport/c/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */