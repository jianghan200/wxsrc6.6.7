package com.tencent.mm.plugin.appbrand.media.record;

import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class d
{
  public static final Long gim = Long.valueOf(259200000L);
  public static final Long gin = Long.valueOf(86400000L);
  public static final Long gio = Long.valueOf(43200000L);
  public static final Long gip = Long.valueOf(240000L);
  public static final Long giq = Long.valueOf(60000L);
  public static final Long gir = gin;
  public static long gis = 0L;
  private static List<String> git = new ArrayList(10);
  
  public static void ald()
  {
    long l = System.currentTimeMillis();
    if (l - gis <= gir.longValue())
    {
      x.e("MicroMsg.Record.AudioRecordCacheClean", "The last clean time is in AUDIO_RECORD_NO_SCAN_TIME time");
      return;
    }
    x.i("MicroMsg.Record.AudioRecordCacheClean", "start clean audio record file");
    gis = l;
    e.post(new d.1(), "AudioRecordCacheClean");
  }
  
  private static boolean uw(String paramString)
  {
    Iterator localIterator = git.iterator();
    while (localIterator.hasNext()) {
      if (paramString.contains((String)localIterator.next())) {
        return true;
      }
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/media/record/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */