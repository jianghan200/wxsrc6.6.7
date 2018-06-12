package com.tencent.mm.compatible.b;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;

public final class j
  extends MediaPlayer
{
  public j()
  {
    f.fJ(hashCode());
  }
  
  public static j c(Context paramContext, Uri paramUri)
  {
    try
    {
      j localj = new j();
      localj.setDataSource(paramContext, paramUri);
      localj.prepare();
      return localj;
    }
    catch (IOException paramContext)
    {
      x.d("MicroMsg.MediaPlayerWrapper", "create failed:", new Object[] { paramContext });
      return null;
    }
    catch (IllegalArgumentException paramContext)
    {
      for (;;)
      {
        x.d("MicroMsg.MediaPlayerWrapper", "create failed:", new Object[] { paramContext });
      }
    }
    catch (SecurityException paramContext)
    {
      for (;;)
      {
        x.d("MicroMsg.MediaPlayerWrapper", "create failed:", new Object[] { paramContext });
      }
    }
  }
  
  public final void release()
  {
    super.release();
    f.fK(hashCode());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/compatible/b/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */