package com.tencent.mm.pluginsdk.ui.applet;

import com.tencent.mm.ak.a.b.e;
import com.tencent.mm.ak.q;
import com.tencent.mm.kernel.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public final class f
  implements com.tencent.mm.ak.a.c.b
{
  private final byte[] qIv;
  
  public f()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    StringBuilder localStringBuilder = new StringBuilder();
    com.tencent.mm.kernel.g.Eg();
    this.qIv = com.tencent.mm.a.g.v((a.Dg() + "mmbiz").getBytes());
  }
  
  public final com.tencent.mm.ak.a.d.b mb(String paramString)
  {
    x.d("MicroMsg.ChattingBizImgDownloader", "get image data from url:%s", new Object[] { paramString });
    Object localObject1;
    for (;;)
    {
      try
      {
        long l1 = System.currentTimeMillis();
        Object localObject2 = (HttpURLConnection)new URL(paramString).openConnection();
        ((HttpURLConnection)localObject2).setConnectTimeout(15000);
        ((HttpURLConnection)localObject2).setReadTimeout(20000);
        if (q.lY(paramString)) {
          ((HttpURLConnection)localObject2).setRequestProperty("Referer", q.hZ(com.tencent.mm.protocal.d.qVN));
        }
        if ((((HttpURLConnection)localObject2).getResponseCode() >= 300) || (com.tencent.mm.modelcdntran.d.c((HttpURLConnection)localObject2) != 0))
        {
          ((HttpURLConnection)localObject2).disconnect();
          x.w("MicroMsg.ChattingBizImgDownloader.HttpClientFactory", "httpURLConnectionGet 300");
          localObject1 = null;
          if (localObject1 == null) {
            break;
          }
          long l2 = System.currentTimeMillis();
          if ((q.Pn()) && (!bi.oW(((com.tencent.mm.ak.a.d.b)localObject1).aBC)) && (q.lY(paramString)) && (((com.tencent.mm.ak.a.d.b)localObject1).aBC.equals("image/webp")))
          {
            bool = true;
            x.d("MicroMsg.ChattingBizImgDownloader", "getImageData, isDownloadWebp: %b", new Object[] { Boolean.valueOf(bool) });
            l1 = l2 - l1;
            x.d("MicroMsg.ChattingBizImgDownloader", "download used %d ms", new Object[] { Long.valueOf(l1) });
            h.mEJ.a(86L, 4L, l1, false);
            if (!bool) {
              break;
            }
            h.mEJ.a(86L, 17L, l1, false);
            return (com.tencent.mm.ak.a.d.b)localObject1;
          }
        }
        else
        {
          localObject1 = ((HttpURLConnection)localObject2).getInputStream();
          localObject2 = ((HttpURLConnection)localObject2).getContentType();
          localObject1 = new com.tencent.mm.ak.a.d.b(e.m((InputStream)localObject1), (String)localObject2, (byte)0);
          continue;
        }
        boolean bool = false;
      }
      catch (Exception paramString)
      {
        x.e("MicroMsg.ChattingBizImgDownloader", "get image data failed.:%s", new Object[] { paramString.toString() });
        return new com.tencent.mm.ak.a.d.b(null, null, (byte)0);
      }
    }
    return (com.tencent.mm.ak.a.d.b)localObject1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/applet/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */