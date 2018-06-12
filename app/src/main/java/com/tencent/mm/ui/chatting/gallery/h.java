package com.tencent.mm.ui.chatting.gallery;

import android.graphics.Bitmap;
import android.os.Looper;
import android.support.v7.app.ActionBarActivity;
import android.util.SparseArray;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.d;
import com.tencent.mm.model.d.a;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.s.a;
import com.tencent.mm.modelvideo.s.a.a;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.pluginsdk.ui.tools.VideoSightView;
import com.tencent.mm.pluginsdk.ui.tools.f;
import com.tencent.mm.pluginsdk.ui.tools.n;
import com.tencent.mm.protocal.c.bri;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.al.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import java.util.HashMap;

public final class h
  extends a
  implements d.a, s.a, al.a
{
  private d gbl;
  private HashMap<String, i.a> tVv = new HashMap();
  private boolean tVw = false;
  
  public h(b paramb)
  {
    super(paramb);
    o.Ta().a(this, Looper.getMainLooper());
    this.gbl = new d();
  }
  
  private void a(r paramr, j paramj)
  {
    if (paramr == null) {
      return;
    }
    com.tencent.mm.modelvideo.t.nU(paramr.getFileName());
    paramj.cxy().tWV.setVisibility(0);
    paramj.cxy().tWV.setProgress(com.tencent.mm.modelvideo.t.f(paramr));
    o.Ta().a(this, Looper.getMainLooper());
  }
  
  private static void a(j paramj, boolean paramBoolean)
  {
    if (paramj == null) {
      return;
    }
    paramj.cxy().tWV.setVisibility(8);
    if (paramBoolean)
    {
      paramj.cxy().tWT.setVisibility(8);
      ((View)paramj.cxy().tWS).setVisibility(0);
      return;
    }
    paramj.cxy().tWT.setVisibility(0);
    ((View)paramj.cxy().tWS).setVisibility(8);
  }
  
  private boolean a(i.a parama)
  {
    if (parama == null) {
      return false;
    }
    o.Ta().a(this);
    if (this.tTx.tTy.getCurrentItem() == parama.pos)
    {
      parama = Fl(parama.pos);
      if (parama != null) {
        parama.cxy().tWV.setVisibility(8);
      }
      return true;
    }
    this.tTx.Ft(parama.pos);
    return false;
  }
  
  private void b(bd parambd, j paramj)
  {
    if (this.tVw) {
      return;
    }
    paramj.cxy().tWW.setVisibility(8);
    o.Ta();
    String str = com.tencent.mm.modelvideo.s.nK(parambd.field_imgPath);
    if (parambd.cmu())
    {
      Toast.makeText(this.tTx.tTy, R.l.video_fail_or_clean, 0).show();
      return;
    }
    if ((str == null) || (!e.cn(str)))
    {
      Toast.makeText(this.tTx.tTy, R.l.video_fail_or_clean, 0).show();
      return;
    }
    this.tTx.tTy.mController.tml.getWindow().addFlags(128);
    Boolean localBoolean = (Boolean)paramj.tWQ.get(str);
    if ((localBoolean == null) || (!localBoolean.booleanValue()))
    {
      ((View)paramj.cxy().tWS).setTag(str);
      paramj.cxy().tWU.setVisibility(8);
      paramj.cxy().tWS.stop();
      if (this.tTx.tTy.gJ(parambd.field_msgId) != 3) {
        break label334;
      }
      paramj.cxy().tWS.setMute(true);
      paramj.cxy().tWS.setVideoPath(str);
      if (paramj.cxy().tWS.q(this.tTx.tTy.mController.tml, false)) {
        break label350;
      }
      paramj.cxy().tWU.setVisibility(0);
      paramj.cxy().tWU.setOnClickListener(new h.1(this, paramj));
      ((View)paramj.cxy().tWS).setVisibility(8);
      paramj.cxy().tWT.setVisibility(0);
    }
    for (;;)
    {
      x.d("MicroMsg.ImageGallerySightHandler", "mAudioHelperTool requestFocus");
      this.gbl.a(this);
      ((View)paramj.cxy().tWS).setVisibility(0);
      return;
      label334:
      paramj.cxy().tWS.setMute(false);
      break;
      label350:
      ((View)paramj.cxy().tWS).setVisibility(0);
      paramj.cxy().tWT.setVisibility(8);
    }
  }
  
  public final void FB(int paramInt)
  {
    bd localbd = this.tTx.ES(paramInt);
    j localj = Fl(paramInt);
    if ((localbd == null) || (localj == null)) {}
    r localr;
    do
    {
      return;
      localr = com.tencent.mm.modelvideo.t.nW(localbd.field_imgPath);
    } while (localr == null);
    if (localbd.field_isSend == 0)
    {
      if ((localr.status == 113) || (localr.status == 111) || (localr.status == 112))
      {
        a(localr, localj);
        return;
      }
      if (localr.status == 198)
      {
        a(localr, localj);
        return;
      }
    }
    b(localbd, localj);
  }
  
  public final void a(s.a.a parama)
  {
    Object localObject = parama.fileName;
    if ((ai.oW((String)localObject)) || (this.tVv == null)) {}
    do
    {
      return;
      bd localbd;
      int i;
      while ((i < ((j)localObject).cxz().tWV.getMax()) || (!a(parama)))
      {
        do
        {
          do
          {
            do
            {
              do
              {
                parama = (i.a)this.tVv.get(localObject);
              } while (parama == null);
              localbd = parama.bGS;
            } while ((localbd == null) || (localbd.field_imgPath == null) || (!localbd.field_imgPath.equals(localObject)));
            localObject = com.tencent.mm.modelvideo.t.nW(localbd.field_imgPath);
          } while (localObject == null);
          if ((!localbd.cmu()) && (((r)localObject).status != 198)) {
            break;
          }
        } while (!a(parama));
        Toast.makeText(this.tTx.tTy, R.l.video_fail_or_clean, 0).show();
        return;
        i = com.tencent.mm.modelvideo.t.f((r)localObject);
        localObject = Fl(parama.pos);
        if ((this.tTx.tTy.getCurrentItem() != parama.pos) || (localObject == null)) {
          break;
        }
        ((j)localObject).cxy().tWV.setVisibility(0);
        ((j)localObject).cxy().tWV.setProgress(i);
      }
      b(localbd, (j)localObject);
      return;
    } while (localObject != null);
  }
  
  public final boolean a(j paramj, bd parambd, int paramInt)
  {
    super.a(paramj, parambd, paramInt);
    o.Ta();
    Object localObject1 = BackwardSupportUtil.b.e(com.tencent.mm.modelvideo.s.nL(parambd.field_imgPath), 1.0F);
    if (this.tVv != null) {
      this.tVv.put(parambd.field_imgPath, new i.a(parambd, paramInt));
    }
    a(paramj, false);
    ((View)paramj.cxy().tWS).setVisibility(8);
    paramj.cxy().tWT.setImageBitmap((Bitmap)localObject1);
    paramj.cxy().tWT.setVisibility(0);
    paramj.cxy().tWW.setVisibility(8);
    localObject1 = com.tencent.mm.modelvideo.t.nW(parambd.field_imgPath);
    paramj.tWW.setTag(localObject1);
    Object localObject2;
    if (localObject1 == null)
    {
      localObject2 = null;
      if (localObject2 != null) {
        break label190;
      }
      paramj.jcm.setVisibility(8);
    }
    for (;;)
    {
      if ((paramj.cxy().tWS instanceof VideoSightView)) {
        n.a(paramj.jcm, (VideoSightView)paramj.cxy().tWS);
      }
      return true;
      localObject2 = ((r)localObject1).enV;
      break;
      label190:
      if (ai.oW(((bri)localObject2).dyJ))
      {
        x.i("MicroMsg.ImageGallerySightHandler", " there is no attachurl, show more info btn");
        localObject1 = ((bri)localObject2).dyM;
        localObject2 = ((bri)localObject2).dyN;
        if ((!bi.oW((String)localObject1)) && (!bi.oW((String)localObject2)))
        {
          paramj.jcm.setText((CharSequence)localObject1);
          paramj.jcm.setVisibility(0);
          paramj.jcm.setTag(parambd);
        }
        else
        {
          paramj.jcm.setVisibility(8);
        }
      }
      else
      {
        paramj.jcm.setVisibility(0);
        paramj.jcm.setText(this.tTx.tTy.getString(R.l.sns_ad_sight_full, new Object[] { Integer.valueOf(((bri)localObject2).rBq) }));
        Object localObject3 = this.tTx.tTy.getString(R.l.sns_ad_sight_full);
        localObject1 = localObject3;
        if (((bri)localObject2).rBq / 60 > 0) {
          localObject1 = (String)localObject3 + this.tTx.tTy.getString(R.l.sns_ad_sight_full_m, new Object[] { Integer.valueOf(((bri)localObject2).rBq / 60) });
        }
        localObject3 = localObject1;
        if (((bri)localObject2).rBq % 60 > 0) {
          localObject3 = (String)localObject1 + this.tTx.tTy.getString(R.l.sns_ad_sight_full_s, new Object[] { Integer.valueOf(((bri)localObject2).rBq % 60) });
        }
        localObject1 = (String)localObject3 + this.tTx.tTy.getString(R.l.sns_ad_sight_full_end);
        paramj.jcm.setText((CharSequence)localObject1);
        paramj.jcm.setTag(parambd);
      }
    }
  }
  
  public final void cwV()
  {
    SparseArray localSparseArray = this.tTx.tzb;
    int i = 0;
    while (i < localSparseArray.size())
    {
      int j = localSparseArray.keyAt(i);
      if ((localSparseArray.get(j) != null) && (((View)localSparseArray.get(j)).getTag() != null))
      {
        j localj = (j)((View)localSparseArray.get(j)).getTag();
        if ((localj.tWR != null) && (localj.cxy().tWR.getVisibility() == 0))
        {
          localj.cxy().tWS.setVideoCallback(null);
          if ((((View)localj.cxy().tWS).getVisibility() == 0) && (localj != null))
          {
            a(localj, false);
            if (localj.cxy().tWS != null) {
              localj.cxy().tWS.stop();
            }
            x.d("MicroMsg.ImageGallerySightHandler", "mAudioHelperTool abandonFocus");
            this.gbl.bv(false);
            this.tTx.tTy.mController.tml.getWindow().clearFlags(128);
          }
        }
      }
      i += 1;
    }
  }
  
  public final void detach()
  {
    cwV();
    this.tTx.tTy.mController.tml.getWindow().clearFlags(128);
    this.tVw = true;
    super.detach();
    this.tVv.clear();
    this.tVv = null;
    o.Ta().a(this);
    x.d("MicroMsg.ImageGallerySightHandler", "mAudioHelperTool abandonFocus");
    this.gbl.bv(true);
  }
  
  public final boolean vD()
  {
    if (this.tTx == null) {}
    j localj;
    do
    {
      return false;
      localj = this.tTx.cwO();
    } while ((localj == null) || (localj.tWR == null) || (localj.cxy().tWR.getVisibility() != 0));
    a(localj, true);
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/chatting/gallery/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */