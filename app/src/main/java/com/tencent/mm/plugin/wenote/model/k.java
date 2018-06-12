package com.tencent.mm.plugin.wenote.model;

import android.content.Context;
import android.os.Message;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.R.l;
import com.tencent.mm.compatible.util.b;
import com.tencent.mm.e.b.j;
import com.tencent.mm.plugin.wenote.model.b.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.al.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;

public final class k
{
  private static k qoB = null;
  public long duration;
  public b epT = new b(ad.getContext());
  private final ag hnB = new ag()
  {
    public final void handleMessage(Message paramAnonymousMessage)
    {
      super.handleMessage(paramAnonymousMessage);
      k.b(k.this);
    }
  };
  public long hng = -1L;
  private Toast hnh;
  public boolean hnt;
  public boolean hnu;
  public final al hnz = new al(new al.a()
  {
    public final boolean vD()
    {
      if (k.f(k.this) == -1L) {
        k.a(k.this, bi.VG());
      }
      long l = bi.bI(k.f(k.this));
      if ((l >= 3590000L) && (l <= 3600000L))
      {
        if (k.g(k.this) != null) {
          break label170;
        }
        k.a(k.this, Toast.makeText(ad.getContext(), ad.getContext().getString(R.l.fav_rcd_time_limit, new Object[] { Integer.valueOf((int)((3600000L - l) / 1000L)) }), 0));
      }
      for (;;)
      {
        k.g(k.this).show();
        if (l < 3600000L) {
          break;
        }
        x.v("MicroMsg.WNNoteVoiceLogic", "record stop on countdown");
        k.h(k.this);
        k.i(k.this);
        if (k.d(k.this) != null) {
          k.d(k.this).bZj();
        }
        return false;
        label170:
        k.g(k.this).setText(ad.getContext().getString(R.l.fav_rcd_time_limit, new Object[] { Integer.valueOf((int)((3600000L - l) / 1000L)) }));
      }
      return true;
    }
  }, true);
  public long iZe;
  public j iZl;
  public TextView jaG;
  public String path = "";
  public String qoA = "";
  public int qoC = 0;
  public a qoD;
  public com.tencent.mm.plugin.wenote.model.a.k qoE = null;
  public final ag qoF = new k.4(this);
  public com.tencent.mm.modelvoice.k qoz;
  
  public static k bZe()
  {
    if (qoB == null) {
      qoB = new k();
    }
    return qoB;
  }
  
  public static k bZf()
  {
    return qoB;
  }
  
  public static void destroy()
  {
    qoB = null;
  }
  
  private long getDuration()
  {
    if (this.iZe == 0L) {
      return 0L;
    }
    return bi.bI(this.iZe);
  }
  
  public final void aMn()
  {
    if (!this.hnt) {
      return;
    }
    this.qoF.removeMessages(4096);
    if (this.qoA.equals("speex"))
    {
      this.qoz.we();
      if (this.epT != null) {
        this.epT.zY();
      }
      this.duration = getDuration();
      if (this.duration >= 800L) {
        break label138;
      }
    }
    label138:
    for (int i = 1;; i = 0)
    {
      this.hnz.SO();
      if (i != 0)
      {
        File localFile = new File(this.path);
        if (localFile.exists()) {
          localFile.delete();
        }
        this.hnB.sendEmptyMessageDelayed(0, 500L);
      }
      this.hnt = false;
      return;
      this.iZl.we();
      break;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wenote/model/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */