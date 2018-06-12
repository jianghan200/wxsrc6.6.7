package com.tencent.mm.plugin.appbrand.s.b;

import com.tencent.mm.plugin.appbrand.s.e.i;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public final class d
  extends c
{
  public final com.tencent.mm.plugin.appbrand.s.e.c a(com.tencent.mm.plugin.appbrand.s.e.a parama, i parami)
  {
    super.a(parama, parami);
    parami.vZ("WebSocket Protocol Handshake");
    parami.put("Server", "Java-WebSocket");
    parama = Calendar.getInstance();
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
    localSimpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
    parami.put("Date", localSimpleDateFormat.format(parama.getTime()));
    return parami;
  }
  
  public final a aoI()
  {
    return new d();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/s/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */