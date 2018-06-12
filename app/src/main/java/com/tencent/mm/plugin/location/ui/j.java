package com.tencent.mm.plugin.location.ui;

import android.content.Context;
import android.graphics.Color;
import android.os.Looper;
import android.os.Message;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.mm.plugin.location.model.l;
import com.tencent.mm.plugin.location.model.p;
import com.tencent.mm.plugin.map.a.e;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class j
{
  TextView Dm;
  Context context;
  private String hOr;
  boolean kFQ = false;
  private ViewGroup kFS;
  ArrayList<String> kFT;
  private final int kFU = 100;
  private final int kFV = 1;
  private final int kFW = 2;
  private final int kFX = 3;
  private final int kFY = 4;
  private final int kFZ = 5;
  private final int kGa = 6;
  private final int kGb = 7;
  private final int kGc = 8;
  private final int kGd = 9;
  private final int kGe = 10;
  boolean kGf = true;
  private int kGg = Color.parseColor("#44FEBB");
  int kGh = Color.parseColor("#FFFFFF");
  int kGi = Color.parseColor("#E54646");
  int kGj = Color.parseColor("#FFC90C");
  boolean kGk = false;
  String kGl = "";
  ag mHandler = new j.1(this, Looper.getMainLooper());
  
  public j(Context paramContext, ViewGroup paramViewGroup, String paramString)
  {
    this.context = paramContext;
    this.kFS = paramViewGroup;
    this.Dm = ((TextView)this.kFS.findViewById(a.e.title));
    this.hOr = paramString;
    init();
  }
  
  private void init()
  {
    x.d("MicroMsg.ShareHeaderMsgMgr", "init");
    this.Dm.invalidate();
    this.kFT = new ArrayList();
    Iterator localIterator = l.aZj().ns(this.hOr).iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      this.kFT.add(str);
    }
    gh(false);
  }
  
  final void gh(boolean paramBoolean)
  {
    this.mHandler.removeMessages(2);
    Message localMessage = Message.obtain();
    localMessage.what = 2;
    localMessage.obj = Integer.valueOf(this.kFT.size());
    x.d("MicroMsg.ShareHeaderMsgMgr", "updateMemberCount, size=%d, isDelay=%b", new Object[] { Integer.valueOf(this.kFT.size()), Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      this.mHandler.sendMessageDelayed(localMessage, 100L);
      return;
    }
    this.mHandler.sendMessage(localMessage);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/location/ui/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */