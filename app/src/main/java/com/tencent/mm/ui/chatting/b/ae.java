package com.tencent.mm.ui.chatting.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.Settings.Secure;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.widget.ImageView;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.ak.i.a;
import com.tencent.mm.ak.n;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.mmsight.SightCaptureResult;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.base.s;
import com.tencent.mm.ui.chatting.ak;
import com.tencent.mm.ui.chatting.b.b.m;
import com.tencent.mm.ui.chatting.r;
import com.tencent.mm.ui.tools.a.1;
import com.tencent.mm.ui.widget.DrawedCallBackLinearLayout;
import java.util.ArrayList;

@com.tencent.mm.ui.chatting.b.a.a(cwo=com.tencent.mm.ui.chatting.b.b.x.class)
public class ae
  extends a
  implements i.a, com.tencent.mm.ui.chatting.b.b.x
{
  private com.tencent.mm.ui.widget.a.c lbj;
  
  public final void A(String paramString1, int paramInt, String paramString2)
  {
    if (((this.lbj == null) || (!this.lbj.isShowing())) && (!bi.oW(paramString2)) && (com.tencent.mm.sdk.platformtools.o.Wd(paramString2)))
    {
      localObject = com.tencent.mm.sdk.platformtools.c.e(paramString2, 300, 300, false);
      if (localObject == null) {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChattingUI.SendImgComponent", "showAlert fail, bmp is null");
      }
    }
    else
    {
      return;
    }
    m localm = (m)this.bAG.O(m.class);
    ImageView localImageView = new ImageView(this.bAG.tTq.getContext());
    int i = this.bAG.tTq.getMMResources().getDimensionPixelSize(R.f.LargePadding);
    localImageView.setImageBitmap((Bitmap)localObject);
    localImageView.setPadding(i, i, i, i);
    Object localObject = Settings.Secure.getString(this.bAG.tTq.getContentResolver(), "default_input_method");
    if ((com.tencent.mm.sdk.platformtools.o.bv(com.tencent.mm.a.e.e(paramString2, 0, com.tencent.mm.a.e.cm(paramString2)))) && ((((String)localObject).contains("com.sohu.inputmethod.sogou")) || (((String)localObject).contains("com.tencent.qqpinyin")))) {}
    for (boolean bool = true;; bool = false)
    {
      this.lbj = com.tencent.mm.ui.base.h.a(this.bAG.tTq.getContext(), this.bAG.tTq.getMMResources().getString(R.l.chatting_send_img_confirm), localImageView, this.bAG.tTq.getMMResources().getString(R.l.app_ok), this.bAG.tTq.getMMResources().getString(R.l.app_cancel), new ae.3(this, bool, localm, paramString2), null);
      paramString1 = paramString1.substring(0, paramInt);
      localm.cvb().postDelayed(new ae.4(this, localm, paramString1), 10L);
      return;
    }
  }
  
  public final void a(ContextMenu paramContextMenu, int paramInt, bd parambd)
  {
    paramContextMenu.add(paramInt, 100, 0, this.bAG.tTq.getMMResources().getString(R.l.chatting_long_click_menu_delete_img));
    com.tencent.mm.ak.e locale1 = null;
    if (parambd.field_msgId > 0L) {
      locale1 = com.tencent.mm.ak.o.Pf().br(parambd.field_msgId);
    }
    com.tencent.mm.ak.e locale2;
    if (locale1 != null)
    {
      locale2 = locale1;
      if (locale1.dTK > 0L) {}
    }
    else
    {
      locale2 = locale1;
      if (parambd.field_msgSvrId > 0L) {
        locale2 = com.tencent.mm.ak.o.Pf().bq(parambd.field_msgSvrId);
      }
    }
    if ((parambd.field_isSend == 1) || ((locale2 != null) && (parambd.field_isSend == 0) && (locale2.offset >= locale2.dHI) && (locale2.dHI != 0))) {
      paramContextMenu.add(paramInt, 110, 0, this.bAG.tTq.getMMResources().getString(R.l.retransmit));
    }
    if (locale2 == null) {}
    for (parambd = "";; parambd = com.tencent.mm.ak.o.Pf().o(locale2.dTL, "", ""))
    {
      if ((locale2 != null) && (com.tencent.mm.a.e.cn(parambd))) {
        paramContextMenu.add(paramInt, 112, 0, this.bAG.tTq.getMMResources().getString(R.l.chatting_copy));
      }
      return;
    }
  }
  
  public final void a(SightCaptureResult paramSightCaptureResult)
  {
    String str = paramSightCaptureResult.lek;
    if (!bi.oW(str)) {}
    try
    {
      boolean bool = paramSightCaptureResult.led;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.SendImgComponent", "doSendChattingImage, path: %s", new Object[] { str });
      if (bool) {}
      for (int i = 2;; i = 1)
      {
        paramSightCaptureResult = new com.tencent.mm.ak.l(i, q.GF(), this.bAG.getTalkerUserName(), str, 0, null, 0, "", "", true, R.g.chat_img_template);
        au.DF().a(paramSightCaptureResult, 0);
        return;
      }
      return;
    }
    catch (Exception paramSightCaptureResult)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChattingUI.SendImgComponent", "doSendChattingImage error: %s", new Object[] { paramSightCaptureResult.getMessage() });
    }
  }
  
  public final boolean a(MenuItem paramMenuItem, bd parambd)
  {
    switch (paramMenuItem.getItemId())
    {
    default: 
      return false;
    }
    r.a(parambd, this.bAG.tTq.getContext(), this.bAG);
    return true;
  }
  
  public final boolean aS(bd parambd)
  {
    if (!parambd.ckA()) {
      return false;
    }
    au.HU();
    if (!com.tencent.mm.model.c.isSDCardAvailable())
    {
      s.gH(this.bAG.tTq.getContext());
      return true;
    }
    if (!this.bAG.getTalkerUserName().equals("medianote"))
    {
      au.HU();
      com.tencent.mm.model.c.FQ().b(new com.tencent.mm.aq.e(parambd.field_talker, parambd.field_msgSvrId));
    }
    ak.aI(parambd);
    this.bAG.lT(true);
    return true;
  }
  
  public final void b(long paramLong, int paramInt1, int paramInt2)
  {
    ((com.tencent.mm.ui.chatting.b.b.g)this.bAG.O(com.tencent.mm.ui.chatting.b.b.g.class)).i(paramLong, paramInt1, paramInt2);
  }
  
  public final void cpH()
  {
    com.tencent.mm.ak.o.Pd().dUX = this;
  }
  
  public final void cpK()
  {
    com.tencent.mm.ak.o.Pd().dUX = null;
  }
  
  public final boolean f(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = 1;
    boolean bool2 = true;
    this.bAG.dismissDialog();
    boolean bool1;
    if (paramInt2 != -1)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChattingUI.SendImgComponent", "[dealWithRequestCode] resultCode:%d", new Object[] { Integer.valueOf(paramInt2) });
      bool1 = false;
    }
    Object localObject3;
    label285:
    do
    {
      do
      {
        return bool1;
        switch (paramInt1)
        {
        default: 
          return false;
        case 200: 
          bool1 = bool2;
        }
      } while (paramIntent == null);
      localObject1 = new Intent();
      ((Intent)localObject1).setClassName(this.bAG.tTq.getContext(), "com.tencent.mm.ui.tools.CropImageNewUI");
      ((Intent)localObject1).putExtra("CropImageMode", 4);
      ((Intent)localObject1).putExtra("CropImage_Filter", true);
      localObject2 = this.bAG.getTalkerUserName();
      if ((localObject2 != null) && ((ab.XO((String)localObject2)) || (ab.XQ((String)localObject2)))) {}
      for (bool1 = false;; bool1 = true)
      {
        ((Intent)localObject1).putExtra("CropImage_Has_Raw_Img_Btn", bool1);
        ((Intent)localObject1).putExtra("from_source", 3);
        localObject2 = this.bAG.tTq;
        au.HU();
        localObject3 = com.tencent.mm.model.c.Gb();
        if (paramIntent.getData().toString().startsWith("content://com.google.android.gallery3d")) {
          break label285;
        }
        paramIntent = com.tencent.mm.ui.tools.a.e(((com.tencent.mm.ui.x)localObject2).getContext(), paramIntent, (String)localObject3);
        bool1 = bool2;
        if (bi.oW(paramIntent)) {
          break;
        }
        ((Intent)localObject1).putExtra("CropImage_ImgPath", paramIntent);
        ((com.tencent.mm.ui.x)localObject2).startActivityForResult((Intent)localObject1, 203);
        return true;
      }
      new a.1(paramIntent, (com.tencent.mm.ui.x)localObject2, (String)localObject3, (Intent)localObject1).execute(new Integer[] { Integer.valueOf(0) });
      return true;
      localObject1 = this.bAG.tTq.getContext().getApplicationContext();
      au.HU();
      paramIntent = com.tencent.mm.pluginsdk.ui.tools.l.d((Context)localObject1, paramIntent, com.tencent.mm.model.c.Gb());
      bool1 = bool2;
    } while (paramIntent == null);
    Object localObject1 = new Intent();
    Object localObject2 = new ArrayList(1);
    ((ArrayList)localObject2).add(paramIntent);
    ((Intent)localObject1).putExtra("query_source_type", 3);
    ((Intent)localObject1).putExtra("preview_image", true);
    ((Intent)localObject1).putExtra("isTakePhoto", true);
    ((Intent)localObject1).putExtra("GalleryUI_FromUser", this.bAG.cwp());
    ((Intent)localObject1).putExtra("GalleryUI_ToUser", this.bAG.getTalkerUserName());
    ((Intent)localObject1).putExtra("is_long_click", true);
    ((Intent)localObject1).putStringArrayListExtra("preview_image_list", (ArrayList)localObject2);
    ((Intent)localObject1).addFlags(67108864);
    d.a(this.bAG.tTq, "gallery", ".ui.GalleryEntryUI", (Intent)localObject1, 217);
    return true;
    if (paramIntent == null)
    {
      localObject1 = n.OW().lP(this.bAG.getTalkerUserName());
      if (((ArrayList)localObject1).size() > 0)
      {
        paramIntent = new Intent();
        paramIntent.putStringArrayListExtra("CropImage_OutputPath_List", (ArrayList)localObject1);
        localObject1 = new ArrayList();
        ((ArrayList)localObject1).add(Integer.valueOf(-1));
        paramIntent.putIntegerArrayListExtra("GalleryUI_ImgIdList", (ArrayList)localObject1);
        com.tencent.mm.plugin.report.service.h.mEJ.a(594L, 4L, 1L, true);
      }
    }
    for (;;)
    {
      if (paramIntent == null)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChattingUI.SendImgComponent", "CONTEXT_MENU_WECHAT_GALLERY_IMAGE intent == null");
        return true;
      }
      localObject2 = paramIntent.getStringExtra("GalleryUI_ToUser");
      if (bi.oW((String)localObject2)) {}
      for (localObject1 = this.bAG.getTalkerUserName();; localObject1 = localObject2)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.SendImgComponent", "CONTEXT_MENU_WECHAT_GALLERY_IMAGE userFromIntent:%s rawUsername:%s", new Object[] { localObject2, this.bAG.getTalkerUserName() });
        localObject2 = (m)this.bAG.O(m.class);
        ((m)localObject2).cvb().clearFocus();
        ((m)localObject2).cvb().setBottomPanelVisibility(8);
        localObject3 = (DrawedCallBackLinearLayout)this.bAG.findViewById(R.h.chatting_bg_ll);
        if (localObject3 == null) {
          break;
        }
        ((DrawedCallBackLinearLayout)localObject3).setListener(new ae.1(this, paramIntent, (String)localObject1, (m)localObject2, paramInt1));
        break;
      }
      localObject1 = (m)this.bAG.O(m.class);
      localObject2 = paramIntent.getStringExtra("CropImage_OutputPath");
      if (localObject2 == null)
      {
        ((m)localObject1).cvb().clearFocus();
        return true;
      }
      bool1 = paramIntent.getBooleanExtra("CropImage_Compress_Img", true);
      bool1 = q.a((String)localObject2, this.bAG.getTalkerUserName(), bool1);
      paramIntent.getIntExtra("from_source", 0);
      paramInt2 = paramIntent.getIntExtra("CropImage_rotateCount", 0);
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ChattingUI.SendImgComponent", "dkimgsource" + paramIntent.getIntExtra("from_source", 0));
      if (bool1) {}
      for (paramInt1 = i;; paramInt1 = 0)
      {
        t(paramInt1, paramInt2, (String)localObject2);
        ((m)localObject1).cvb().clearFocus();
        break;
      }
    }
  }
  
  public final void h(long paramLong, boolean paramBoolean)
  {
    ((com.tencent.mm.ui.chatting.b.b.g)this.bAG.O(com.tencent.mm.ui.chatting.b.b.g.class)).u(paramLong, paramBoolean);
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    f(paramInt1, paramInt2, paramIntent);
  }
  
  public final void t(int paramInt1, int paramInt2, String paramString)
  {
    if ((paramString == null) || (paramString.equals("")) || (!com.tencent.mm.a.e.cn(paramString))) {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ChattingUI.SendImgComponent", " doSendImage : filePath is null or empty");
    }
    while (i.X(this.bAG.oLT)) {
      return;
    }
    paramString = new com.tencent.mm.ak.l(4, this.bAG.cwp(), this.bAG.getTalkerUserName(), paramString, paramInt1, null, paramInt2, "", "", true, R.g.chat_img_template);
    au.DF().a(paramString, 0);
    this.bAG.lT(true);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ui/chatting/b/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */