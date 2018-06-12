package com.tencent.mm.pluginsdk.g.a.a;

import com.tencent.mm.a.g;
import com.tencent.mm.pluginsdk.g.a.c.q;
import com.tencent.mm.pluginsdk.g.a.c.q.a;
import com.tencent.mm.pluginsdk.g.a.c.s;
import com.tencent.mm.pluginsdk.g.a.c.t;
import com.tencent.mm.pluginsdk.g.a.d.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.Set;

final class h
  implements com.tencent.mm.pluginsdk.g.a.c.h
{
  private static void a(s params, boolean paramBoolean)
  {
    q.a.ccH().Tp(params.field_urlKey);
    a.Tr(params.field_filePath);
    a.Tr(params.field_filePath + ".decompressed");
    a.Tr(params.field_filePath + ".decrypted");
    if ((2 == params.field_status) && (!paramBoolean))
    {
      x.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "delete completed but invalid file, but forceDL = false, skip this downloading");
      return;
    }
    if ((params.field_maxRetryTimes > 0) && (params.field_retryTimes <= 0))
    {
      x.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "record_maxRetryTimes = %d, record_retryTimes = %d, retry times out, skip ", new Object[] { Integer.valueOf(params.field_maxRetryTimes), Integer.valueOf(params.field_retryTimes) });
      return;
    }
    params.field_retryTimes -= 1;
    params.field_fileUpdated = true;
    q.a.ccH().g(params);
    j.n(params.field_reportId, 12L);
    x.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "post network task");
    params = c.c(params);
    params.pON = false;
    q.a.ccH().d(params);
  }
  
  private static boolean d(s params)
  {
    return bi.oV(g.cu(params.field_filePath)).equals(params.field_md5);
  }
  
  private static void e(s params)
  {
    if ((!params.field_fileCompress) && (!params.field_fileEncrypt))
    {
      b.c.ccr().d(params.field_resType, params.field_subType, params.field_filePath, bi.getInt(params.field_fileVersion, 0));
      return;
    }
    x.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "send query and decrypt request");
    b.c.ccr().b(params);
  }
  
  public final void a(s params, int paramInt)
  {
    Object localObject1;
    Object localObject2;
    if ((params.field_expireTime != 0L) && (params.field_expireTime <= bi.VE()))
    {
      x.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "urlKey(%s) exceed expire time(%d), delete", new Object[] { params.field_urlKey, Long.valueOf(params.field_expireTime) });
      localObject1 = q.a.ccH();
      localObject2 = params.field_urlKey;
      if (((q)localObject1).fAQ) {
        ((q)localObject1).qDu.jy((String)localObject2);
      }
      a.Tr(params.field_filePath);
      a.Tr(params.field_filePath + ".decompressed");
      a.Tr(params.field_filePath + ".decrypted");
      q.a.ccH().Tp(params.field_urlKey);
    }
    do
    {
      return;
      if (paramInt == 0)
      {
        x.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "network unavailable, skip");
        return;
      }
      if ((2 == paramInt) && (1 == params.field_networkType))
      {
        x.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "network type = gprs, record network type = wifi, skip this ");
        return;
      }
      if (params.field_deleted)
      {
        x.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "record(%s), should have been deleted", new Object[] { params.field_urlKey });
        a.Tr(params.field_filePath);
        a.Tr(params.field_filePath + ".decompressed");
        a.Tr(params.field_filePath + ".decrypted");
        return;
      }
      if (!params.field_needRetry)
      {
        x.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "no need retry, resType %d, subType %d, version %s", new Object[] { Integer.valueOf(params.field_resType), Integer.valueOf(params.field_subType), params.field_fileVersion });
        return;
      }
      if (params.field_status == 2)
      {
        long l = a.Io(params.field_filePath);
        if (params.field_contentLength > l)
        {
          x.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "content-length > fileSize, resume download");
          if (0L == l)
          {
            if (!params.field_needRetry)
            {
              x.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "no need retry, resType %d, subType %d, version %s", new Object[] { Integer.valueOf(params.field_resType), Integer.valueOf(params.field_subType), params.field_fileVersion });
              return;
            }
            if (1 != paramInt)
            {
              x.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "fileSize = 0, completed file may be deleted by user, skip this because it's not wifi");
              return;
            }
            localObject1 = b.c.ccr().ccp().iterator();
            while (((Iterator)localObject1).hasNext())
            {
              localObject2 = (b.b)((Iterator)localObject1).next();
              paramInt = params.field_resType;
              paramInt = params.field_subType;
              bi.getInt(params.field_fileVersion, 0);
              if (((b.b)localObject2).ccq())
              {
                x.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "filterNotRetry by %s, resType %d, subType %d, version %s", new Object[] { localObject2.getClass().getName(), Integer.valueOf(params.field_resType), Integer.valueOf(params.field_subType), params.field_fileVersion });
                return;
              }
            }
            params.field_fileUpdated = true;
            b.c.ccr().f(params.field_resType, params.field_subType, 0, bi.oV(params.field_groupId2).equals("NewXml"));
            q.a.ccH().g(params);
          }
          q.a.ccH().d(c.c(params));
          return;
        }
        if (!d(params))
        {
          x.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "file invalid, re-download");
          if (1 == paramInt) {}
          for (boolean bool = true;; bool = false)
          {
            a(params, bool);
            return;
          }
        }
        x.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "md5 check ok, file download complete, throw event to do decrypt");
        e(params);
        return;
      }
      if ((params.field_status == 1) || (params.field_status == 0))
      {
        x.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "db status: downloading or waiting, db content-length %d", new Object[] { Long.valueOf(params.field_contentLength) });
        if (!q.a.ccH().To(params.field_urlKey))
        {
          x.d("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "check md5");
          if (d(params))
          {
            x.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "md5 match, request complete, throw event to do decrypt");
            params.field_status = 2;
            params.field_contentLength = a.Io(params.field_filePath);
            q.a.ccH().g(params);
            e(params);
            return;
          }
          if (0L == a.Io(params.field_filePath))
          {
            params.field_fileUpdated = true;
            q.a.ccH().g(params);
            b.c.ccr().f(params.field_resType, params.field_subType, 0, bi.oV(params.field_groupId2).equals("NewXml"));
          }
          x.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "md5 not match,  download");
          q.a.ccH().d(c.c(params));
          return;
        }
        x.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "request already in downloading queue");
        return;
      }
    } while ((params.field_status != 4) && (params.field_status != 3));
    x.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "file invalid, re-download");
    params.field_status = 0;
    a(params, true);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/pluginsdk/g/a/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */