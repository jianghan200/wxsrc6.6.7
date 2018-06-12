package com.tencent.mm.plugin.qqmail.b;

import android.text.TextUtils;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

public final class g
  extends h
{
  private HttpClient mcs = null;
  private HttpRequestBase mct = null;
  private HttpResponse mcu = null;
  private boolean mcv = false;
  private int result = 0;
  
  private static void a(h.b paramb, HttpRequestBase paramHttpRequestBase)
  {
    if (paramb.mcy == null) {
      return;
    }
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramb.mcy.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localArrayList.add(new BasicNameValuePair(str, (String)paramb.mcy.get(str)));
    }
    ((HttpPost)paramHttpRequestBase).setEntity(new UrlEncodedFormEntity(localArrayList, "utf-8"));
  }
  
  public final h.c a(String paramString1, String paramString2, h.b paramb, h.a parama)
  {
    x.d("MicroMsg.URLConnectionUtil", "uri=" + paramString2 + ", " + paramb);
    for (;;)
    {
      Object localObject2;
      try
      {
        this.mcv = false;
        this.mcs = new DefaultHttpClient();
        if (paramb.mcx != 0) {
          continue;
        }
        if (paramb.mcx != 0) {
          continue;
        }
        localObject1 = paramb.mcy;
        this.mct = new HttpGet(b(paramString1, paramString2, (Map)localObject1));
        this.mct.addHeader("User-Agent", aBr);
        this.mct.addHeader("Host", host);
        System.setProperty("http.keepAlive", "false");
        this.mct.addHeader("Accept-Charset", "utf-8");
        this.mct.addHeader("Accept-Encoding", "compress;q=0.5, gzip;q=1.0");
        this.mct.addHeader("Content-Type", "text/html");
        this.mct.addHeader("Cookie", J(paramb.mcz));
        if (paramb.mcx == 1) {
          a(paramb, this.mct);
        }
        this.mcu = this.mcs.execute(this.mct);
        this.result = this.mcu.getStatusLine().getStatusCode();
        localObject1 = null;
        localObject2 = null;
        localHttpEntity = null;
        if (this.mcu.getFirstHeader("set-cookie") == null) {
          break label1245;
        }
        paramString1 = this.mcu.getFirstHeader("set-cookie").getValue();
        if (this.mcu.getFirstHeader("Content-Encoding") != null) {
          localObject1 = this.mcu.getFirstHeader("Content-Encoding").getValue();
        }
        if (this.mcu.getFirstHeader("Content-Disposition") != null) {
          localObject2 = this.mcu.getFirstHeader("Content-Disposition").getValue();
        }
        if ((localObject2 == null) || (!((String)localObject2).contains("attachment;")) || (!paramString2.contains("download"))) {
          continue;
        }
        i = 1;
      }
      catch (UnsupportedEncodingException paramString1)
      {
        paramString2 = new h.c(55535, null, "unsupported ecoding");
        paramString1 = paramString2;
        return paramString2;
        localObject1 = null;
        continue;
        i = 0;
        continue;
        localHttpEntity = this.mcu.getEntity();
        localHttpEntity.getContentLength();
        localObject2 = localHttpEntity.getContent();
        if ((localObject1 == null) || (!((String)localObject1).contains("gzip"))) {
          break label1238;
        }
        localObject1 = new GZIPInputStream((InputStream)localObject2);
        if (i == 0) {
          continue;
        }
        localObject2 = mcw;
        StringBuilder localStringBuilder = new StringBuilder();
        if (paramb.mcy.get("default_attach_name") != null) {
          continue;
        }
        paramb = Long.valueOf(System.currentTimeMillis());
        paramb = new FileOutputStream(new File((String)localObject2, paramb), true);
        localObject2 = new byte['Ѐ'];
        if (this.mcv) {
          continue;
        }
        j = ((InputStream)localObject1).read((byte[])localObject2);
        if (j <= 0) {
          continue;
        }
        paramb.write((byte[])localObject2, 0, j);
        paramb.flush();
        parama.bol();
        continue;
      }
      catch (UnknownHostException paramString1)
      {
        paramString2 = new h.c(55531, null, "unknow host");
        paramString1 = paramString2;
        return paramString2;
        paramb = (Serializable)paramb.mcy.get("default_attach_name");
        continue;
        paramb = new ByteArrayOutputStream();
        continue;
      }
      catch (ClientProtocolException paramString1)
      {
        HttpEntity localHttpEntity;
        paramString2 = new h.c(55534, null, "client protocol error");
        paramString1 = paramString2;
        return paramString2;
        if (!this.mcv) {
          continue;
        }
        paramb.flush();
        paramb.close();
        return null;
        int j = this.result;
        parama = JR(paramString1);
        if (i == 0) {
          continue;
        }
        paramString1 = "";
        paramString1 = new h.c(j, parama, paramString1);
        paramb.flush();
        paramb.close();
        localHttpEntity.consumeContent();
        x.d("MicroMsg.URLConnectionUtil", "uri=" + paramString2 + ", " + paramString1);
        return paramString1;
        paramString1 = new String(((ByteArrayOutputStream)paramb).toByteArray());
        continue;
      }
      catch (IllegalStateException paramString1)
      {
        paramString2 = new h.c(55533, null, "illegal state");
        paramString1 = paramString2;
        return paramString2;
      }
      catch (FileNotFoundException paramString1)
      {
        paramString2 = new h.c(55532, null, "output file not found");
        paramString1 = paramString2;
        return paramString2;
      }
      catch (Exception paramString1)
      {
        x.printErrStackTrace("MicroMsg.URLConnectionUtil", paramString1, "http unavailable", new Object[0]);
        if (this.result != 0) {
          continue;
        }
        i = 503;
        paramString2 = new h.c(i, null, null);
        paramString1 = paramString2;
        return paramString2;
        i = this.result;
        continue;
      }
      catch (OutOfMemoryError paramString1)
      {
        x.printErrStackTrace("MicroMsg.URLConnectionUtil", paramString1, "http unavailable", new Object[0]);
        if (this.result != 0) {
          continue;
        }
        int i = 503;
        paramString2 = new h.c(i, null, null);
        paramString1 = paramString2;
        return paramString2;
        i = this.result;
        continue;
      }
      finally
      {
        if (this.mcs == null) {
          continue;
        }
        this.mcs.getConnectionManager().shutdown();
      }
      if (i == 0)
      {
        localObject2 = localHttpEntity;
        if (this.mcu.getFirstHeader("Content-Length") != null) {
          localObject2 = this.mcu.getFirstHeader("Content-Length").getValue();
        }
        if ((!TextUtils.isEmpty((CharSequence)localObject2)) && (bi.getInt((String)localObject2, 0) > 5242880L))
        {
          paramString2 = new h.c(55536, null, "mail content to large");
          paramString1 = paramString2;
          if (this.mcs != null)
          {
            this.mcs.getConnectionManager().shutdown();
            paramString1 = paramString2;
          }
          return paramString1;
          localObject1 = null;
          continue;
          if (paramb.mcx == 0)
          {
            localObject1 = paramb.mcy;
            this.mct = new HttpPost(b(paramString1, paramString2, (Map)localObject1));
            continue;
          }
        }
      }
      label1238:
      Object localObject1 = localObject2;
      continue;
      label1245:
      paramString1 = null;
    }
  }
  
  public final void cancel()
  {
    x.d("MicroMsg.URLConnectionUtil", "cancel conection.");
    this.mcv = true;
    if ((this.mct != null) && (!this.mct.isAborted())) {
      this.mct.abort();
    }
    if (this.mcs != null) {
      this.mcs.getConnectionManager().shutdown();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/qqmail/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */