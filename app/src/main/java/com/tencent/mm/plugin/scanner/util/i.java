package com.tencent.mm.plugin.scanner.util;

import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.d;
import java.util.Map;

public final class i
{
  public static boolean btj()
  {
    Object localObject = com.tencent.mm.model.c.c.Jx().fJ("100027");
    if (!((com.tencent.mm.storage.c)localObject).isValid())
    {
      x.e("MicroMsg.ScanHistoryUtil", "shouldShowHistoryList item.isValid is false");
      return false;
    }
    localObject = ((com.tencent.mm.storage.c)localObject).ckq();
    if (localObject == null)
    {
      x.e("MicroMsg.ScanHistoryUtil", "shouldShowHistoryList args == null");
      return false;
    }
    if ((((Map)localObject).containsKey("showEntrance")) && ("1".equals(((Map)localObject).get("showEntrance")))) {
      return true;
    }
    x.e("MicroMsg.ScanHistoryUtil", "not contain the showEntrance key or the value is not 1");
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/scanner/util/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */