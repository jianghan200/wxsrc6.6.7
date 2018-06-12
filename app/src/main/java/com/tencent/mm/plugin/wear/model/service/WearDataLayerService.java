package com.tencent.mm.plugin.wear.model.service;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.WearableListenerService;
import com.google.android.gms.wearable.d;
import com.google.android.gms.wearable.f;
import com.google.android.gms.wearable.i;
import com.google.android.gms.wearable.j;
import com.google.android.gms.wearable.l;
import com.google.android.gms.wearable.m;
import com.jg.JgClassChecked;
import com.tencent.mm.a.g;
import com.tencent.mm.sdk.platformtools.x;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

@JgClassChecked(author=100, fComment="checked", lastDate="20141125", reviewer=20, vComment={com.jg.EType.SERVICESCHECK})
public class WearDataLayerService
  extends WearableListenerService
{
  private static Bundle bd(byte[] paramArrayOfByte)
  {
    Bundle localBundle = new Bundle();
    DataInputStream localDataInputStream = new DataInputStream(new ByteArrayInputStream(paramArrayOfByte));
    int i = localDataInputStream.readInt();
    localBundle.putInt("key_connecttype", i);
    int j = localDataInputStream.readInt();
    localBundle.putInt("key_sessionid", j);
    int k = localDataInputStream.readInt();
    localBundle.putInt("key_funid", k);
    int m = localDataInputStream.readInt();
    if ((m > 0) && (m < paramArrayOfByte.length))
    {
      paramArrayOfByte = new byte[m];
      localDataInputStream.readFully(paramArrayOfByte);
      localBundle.putByteArray("key_data", paramArrayOfByte);
    }
    while (m < paramArrayOfByte.length)
    {
      x.i("MicroMsg.Wear.WearDataLayerService", "receive data connectType=%d sessionId=%d funId=%d contentLength=%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m) });
      return localBundle;
    }
    throw new IOException("contentLength too large " + m);
  }
  
  public final void a(Channel paramChannel)
  {
    String str1 = paramChannel.getPath();
    String str2 = paramChannel.rO();
    Object localObject = g.u(str1.getBytes());
    localObject = new File(com.tencent.mm.compatible.util.e.dgk, (String)localObject);
    x.i("MicroMsg.Wear.WearDataLayerService", "onChannelOpened %s %s %s", new Object[] { str1, str2, ((File)localObject).getAbsolutePath() });
    if (((File)localObject).exists()) {
      ((File)localObject).delete();
    }
    if (!((File)localObject).getParentFile().exists()) {
      ((File)localObject).getParentFile().mkdirs();
    }
    try
    {
      ((File)localObject).createNewFile();
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        try
        {
          paramChannel.a(new com.tencent.mm.plugin.wear.model.a.a().bSu(), Uri.fromFile((File)localObject));
          return;
        }
        catch (Exception paramChannel)
        {
          x.printErrStackTrace("MicroMsg.Wear.WearDataLayerService", paramChannel, "fuck Xiao Mi", new Object[0]);
        }
        localIOException = localIOException;
        x.printErrStackTrace("MicroMsg.Wear.WearDataLayerService", localIOException, "onChannelOpened", new Object[0]);
      }
    }
  }
  
  public final void a(Channel paramChannel, int paramInt1, int paramInt2)
  {
    x.i("MicroMsg.Wear.WearDataLayerService", "onChannelClosed %s %s %d %d", new Object[] { paramChannel.getPath(), paramChannel.rO(), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
  }
  
  public final void a(com.google.android.gms.wearable.e parame)
  {
    x.i("MicroMsg.Wear.WearDataLayerService", "onDataChanged %d %s", new Object[] { Integer.valueOf(parame.getCount()), parame.bcQ });
    Iterator localIterator = parame.iterator();
    for (;;)
    {
      if (localIterator.hasNext())
      {
        Object localObject = (d)localIterator.next();
        if (((d)localObject).getType() != 1) {
          continue;
        }
        Uri localUri = ((d)localObject).rP().getUri();
        if (!com.tencent.mm.plugin.wear.a.b.PS(localUri.getPath())) {
          continue;
        }
        localObject = ((d)localObject).rP();
        if (localObject == null) {
          throw new IllegalStateException("provided dataItem is null");
        }
        localObject = new j((f)localObject).bdp.bC("key_data");
        if (localObject != null)
        {
          localObject = new com.tencent.mm.plugin.wear.model.a.a().a((Asset)localObject);
          if (localObject == null) {
            return;
          }
        }
        try
        {
          x.i("MicroMsg.Wear.WearDataLayerService", "receive data = %d", new Object[] { Integer.valueOf(localObject.length) });
          com.tencent.mm.plugin.wear.model.b.a.L(bd((byte[])localObject));
          new com.tencent.mm.plugin.wear.model.a.a().i(localUri);
        }
        catch (IOException localIOException)
        {
          for (;;)
          {
            x.printErrStackTrace("MicroMsg.Wear.WearDataLayerService", localIOException, "decode data error", new Object[0]);
          }
        }
      }
    }
    parame.release();
  }
  
  public final void a(l paraml)
  {
    x.i("MicroMsg.Wear.WearDataLayerService", "onMessageReceived %s", new Object[] { paraml.getPath() });
    if (com.tencent.mm.plugin.wear.a.b.PS(paraml.getPath())) {}
    try
    {
      paraml = paraml.getData();
      x.i("MicroMsg.Wear.WearDataLayerService", "receive data = %d", new Object[] { Integer.valueOf(paraml.length) });
      com.tencent.mm.plugin.wear.model.b.a.L(bd(paraml));
      return;
    }
    catch (IOException paraml)
    {
      x.printErrStackTrace("MicroMsg.Wear.WearDataLayerService", paraml, "decode message error", new Object[0]);
    }
  }
  
  public final void a(m paramm)
  {
    x.i("MicroMsg.Wear.WearDataLayerService", "onPeerConnected %s", new Object[] { paramm.getId() });
    Bundle localBundle = new Bundle();
    localBundle.putInt("key_connecttype", 3);
    localBundle.putInt("key_funid", 1);
    localBundle.putByteArray("key_data", paramm.getId().getBytes());
    com.tencent.mm.plugin.wear.model.b.a.L(localBundle);
  }
  
  public final void b(Channel paramChannel, int paramInt1, int paramInt2)
  {
    String str = paramChannel.getPath();
    x.i("MicroMsg.Wear.WearDataLayerService", "onInputClosed %s %s %d %d", new Object[] { str, paramChannel.rO(), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 == 0)
    {
      paramChannel = g.u(str.getBytes());
      paramChannel = new File(com.tencent.mm.compatible.util.e.dgk, paramChannel);
      x.i("MicroMsg.Wear.WearDataLayerService", "onInputClosed %s, %d", new Object[] { paramChannel.getAbsolutePath(), Long.valueOf(paramChannel.length()) });
      Bundle localBundle = new Bundle();
      localBundle.putInt("key_connecttype", 1);
      localBundle.putInt("key_funid", com.tencent.mm.plugin.wear.a.b.PT(str));
      localBundle.putInt("key_sessionid", 0);
      localBundle.putByteArray("key_data", paramChannel.getAbsolutePath().getBytes());
      com.tencent.mm.plugin.wear.model.b.a.L(localBundle);
    }
  }
  
  public final void b(m paramm)
  {
    x.i("MicroMsg.Wear.WearDataLayerService", "onPeerDisconnected %s", new Object[] { paramm.getId() });
    Bundle localBundle = new Bundle();
    localBundle.putInt("key_connecttype", 3);
    localBundle.putInt("key_funid", -1);
    localBundle.putByteArray("key_data", paramm.getId().getBytes());
    com.tencent.mm.plugin.wear.model.b.a.L(localBundle);
  }
  
  public final void c(Channel paramChannel, int paramInt1, int paramInt2)
  {
    x.i("MicroMsg.Wear.WearDataLayerService", "onOutputClosed %s %s %d %d", new Object[] { paramChannel.getPath(), paramChannel.rO(), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
  }
  
  public void onCreate()
  {
    super.onCreate();
    x.i("MicroMsg.Wear.WearDataLayerService", "onCreate");
  }
  
  public void onDestroy()
  {
    x.i("MicroMsg.Wear.WearDataLayerService", "onDestroy");
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wear/model/service/WearDataLayerService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */