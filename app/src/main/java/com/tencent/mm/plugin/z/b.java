package com.tencent.mm.plugin.z;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.d;
import java.util.Map;

public final class b
{
  public static int lst = 0;
  public static int lsu = 1644429312;
  public static int lsv = 302122240;
  public static int lsw = 50;
  public static int lsx = 20;
  public static int lsy = 100;
  public static int lsz = 3;
  
  public static void bfD()
  {
    Object localObject = com.tencent.mm.model.c.c.Jx().fJ("100224");
    if (((com.tencent.mm.storage.c)localObject).isValid())
    {
      localObject = ((com.tencent.mm.storage.c)localObject).ckq();
      lst = bi.getInt((String)((Map)localObject).get("SyncOpen"), 0);
      lsu = bi.getInt((String)((Map)localObject).get("WindowsVersion"), 1644429312);
      lsv = bi.getInt((String)((Map)localObject).get("MacVersion"), 302122240);
      lsw = bi.getInt((String)((Map)localObject).get("MsgSyncSessionCount"), 50);
      lsx = bi.getInt((String)((Map)localObject).get("MsgSyncMsgCount"), 20);
      lsy = bi.getInt((String)((Map)localObject).get("MsgSyncSessionListCount"), 100);
      lsz = bi.getInt((String)((Map)localObject).get("MsgSyncTimeLimit"), 3);
    }
    x.i("MicroMsg.MsgSynchronizeConstants", "initMsgSynchronizeAbtest, SYNC_CLOSE:%d, WINDOWS_VERSION:%d, MAC_VERSION:%d, SESSION_COUNT:%d, MSG_COUNT%d, MSG_LIST_COUNT:%d, TIME_LIMIT:%d", new Object[] { Integer.valueOf(lst), Integer.valueOf(lsu), Integer.valueOf(lsv), Integer.valueOf(lsw), Integer.valueOf(lsx), Integer.valueOf(lsy), Integer.valueOf(lsz) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/z/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */