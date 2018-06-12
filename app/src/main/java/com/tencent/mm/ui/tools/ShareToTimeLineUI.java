package com.tencent.mm.ui.tools;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import com.jg.JgClassChecked;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.model.au;
import com.tencent.mm.modelsimple.aa;
import com.tencent.mm.plugin.account.ui.SimpleLoginUI;
import com.tencent.mm.pluginsdk.ui.AutoLoginActivity;
import com.tencent.mm.pluginsdk.ui.AutoLoginActivity.a;
import com.tencent.mm.protocal.c.ol;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory.DecodeResultLogger;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory.KVStatHelper;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.s;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.e.h;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@JgClassChecked(author=20, fComment="checked", lastDate="20140422", reviewer=20, vComment={com.jg.EType.ACTIVITYCHECK})
public class ShareToTimeLineUI
  extends AutoLoginActivity
  implements com.tencent.mm.ab.e
{
  private ProgressDialog eHw = null;
  private Intent intent;
  private Intent uBM;
  
  private void L(String paramString1, String paramString2, int paramInt)
  {
    Intent localIntent = new Intent();
    ArrayList localArrayList = new ArrayList();
    if (!bi.oW(paramString1))
    {
      localIntent.putExtra("sns_kemdia_path", paramString1);
      localIntent.putExtra("KFilterId", -1);
      localArrayList.add(paramString1);
    }
    if (!bi.oW(paramString2)) {
      localIntent.putExtra(e.h.thz, paramString2);
    }
    if ((paramInt == 4) && (bi.oW(paramString1)) && (!bi.oW(paramString2))) {
      localArrayList.add(paramString2);
    }
    if ((au.HW()) && (!au.Dr()))
    {
      localIntent.putExtra("K_go_to_SnsTimeLineUI", true);
      localIntent.putExtra("Ksnsupload_source", 12);
      localIntent.setClassName(this, "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
      this.uBM = localIntent;
      paramString1 = null;
      switch (paramInt)
      {
      }
    }
    for (;;)
    {
      if (paramString1 != null)
      {
        au.DF().a(837, this);
        com.tencent.mm.kernel.g.DF().a(paramString1, 0);
        showDialog();
      }
      return;
      if (!bi.oW(paramString1))
      {
        paramString2 = new Intent(this, ShareToTimeLineUI.class);
        paramString2.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(paramString1)));
        paramString2.addFlags(32768).addFlags(268435456);
        paramString2.setType("image/*");
        paramString2.setAction("android.intent.action.SEND");
        MMWizardActivity.b(this, new Intent(this, SimpleLoginUI.class).addFlags(268435456).addFlags(32768), paramString2);
      }
      for (;;)
      {
        finish();
        break;
        czy();
      }
      paramString1 = new com.tencent.mm.modelsimple.d(5, localArrayList, cqk());
      continue;
      paramString1 = new com.tencent.mm.modelsimple.d(1, localArrayList, cqk());
    }
  }
  
  private static boolean aaY(String paramString)
  {
    boolean bool1;
    if ((paramString == null) || (paramString.length() == 0)) {
      bool1 = false;
    }
    MMBitmapFactory.DecodeResultLogger localDecodeResultLogger;
    boolean bool2;
    do
    {
      do
      {
        return bool1;
        localDecodeResultLogger = new MMBitmapFactory.DecodeResultLogger();
        bool2 = com.tencent.mm.sdk.platformtools.o.b(paramString, localDecodeResultLogger);
        bool1 = bool2;
      } while (bool2);
      bool1 = bool2;
    } while (localDecodeResultLogger.getDecodeResult() < 2000);
    paramString = MMBitmapFactory.KVStatHelper.getKVStatString(paramString, 4, localDecodeResultLogger);
    com.tencent.mm.plugin.report.service.h.mEJ.k(12712, paramString);
    return bool2;
  }
  
  private ArrayList<String> aj(Bundle paramBundle)
  {
    Object localObject1 = paramBundle.getParcelableArrayList("android.intent.extra.STREAM");
    if ((localObject1 != null) && (((ArrayList)localObject1).size() > 0))
    {
      paramBundle = new ArrayList();
      localObject1 = ((ArrayList)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = (Uri)((Iterator)localObject1).next();
        if ((localObject2 != null) && (bi.n((Uri)localObject2)) && (((Uri)localObject2).getScheme() != null))
        {
          localObject2 = bi.h(this, (Uri)localObject2);
          if (!bi.oW((String)localObject2)) {
            if (aaY((String)localObject2))
            {
              x.i("MicroMsg.ShareToTimeLine", "multisend file path: " + (String)localObject2);
              paramBundle.add(localObject2);
            }
            else
            {
              x.w("MicroMsg.ShareToTimeLine", "not image: " + (String)localObject2);
            }
          }
        }
        else
        {
          x.e("MicroMsg.ShareToTimeLine", "unaccepted uri: " + localObject2);
        }
      }
      if (paramBundle.size() > 0) {
        return paramBundle;
      }
      return null;
    }
    x.e("MicroMsg.ShareToTimeLine", "getParcelableArrayList failed");
    return null;
  }
  
  private void czU()
  {
    Intent localIntent = getIntent();
    if (localIntent == null)
    {
      x.e("MicroMsg.ShareToTimeLine", "launch : fail, intent is null");
      czy();
      finish();
      return;
    }
    Object localObject1 = localIntent.getAction();
    Object localObject2 = s.aq(localIntent);
    if (bi.oW((String)localObject1))
    {
      x.e("MicroMsg.ShareToTimeLine", "launch : fail, action is null");
      czy();
      finish();
      return;
    }
    String str1 = s.j(localIntent, e.h.thz);
    String str2 = getIntent().resolveType(this);
    if (bi.oW(str2))
    {
      czy();
      finish();
      return;
    }
    if (!str2.contains("image"))
    {
      czy();
      finish();
      return;
    }
    if ((((String)localObject1).equals("android.intent.action.SEND")) && (localObject2 != null))
    {
      x.i("MicroMsg.ShareToTimeLine", "send signal: " + (String)localObject1);
      localObject1 = ((Bundle)localObject2).getParcelable("android.intent.extra.STREAM");
      if ((localObject1 == null) || (!(localObject1 instanceof Uri)))
      {
        if (localIntent.getBooleanExtra("Ksnsupload_empty_img", false))
        {
          L(null, str1, 4);
          return;
        }
        czy();
        finish();
        return;
      }
      localObject2 = (Uri)localObject1;
      if (!bi.n((Uri)localObject2))
      {
        x.e("MicroMsg.ShareToTimeLine", "deal : fail, not accept, %s", new Object[] { localObject2 });
        czy();
        finish();
        return;
      }
      localObject1 = bi.h(this, (Uri)localObject2);
      if (!bi.oW((String)localObject1)) {
        break label428;
      }
      localObject1 = com.tencent.mm.pluginsdk.i.d.a(getContentResolver(), (Uri)localObject2, 2);
    }
    label428:
    for (;;)
    {
      if ((bi.oW((String)localObject1)) || (!bi.Xh((String)localObject1)))
      {
        if (localIntent.getBooleanExtra("Ksnsupload_empty_img", false))
        {
          L((String)localObject1, str1, 4);
          return;
        }
        czy();
        finish();
        return;
      }
      if (aaY((String)localObject1))
      {
        L((String)localObject1, str1, 0);
        return;
      }
      czy();
      finish();
      return;
      if ((((String)localObject1).equals("android.intent.action.SEND_MULTIPLE")) && (localObject2 != null) && (((Bundle)localObject2).containsKey("android.intent.extra.STREAM")))
      {
        x.i("MicroMsg.ShareToTimeLine", "send multi: " + (String)localObject1);
        localObject1 = aj((Bundle)localObject2);
        if ((localObject1 == null) || (((ArrayList)localObject1).size() == 0))
        {
          czy();
          finish();
          return;
        }
        d((ArrayList)localObject1, str1);
        return;
      }
      x.e("MicroMsg.ShareToTimeLine", "launch : fail, uri is null");
      czy();
      finish();
      return;
    }
  }
  
  private void czy()
  {
    Toast.makeText(this, R.l.shareimg_to_timeline_get_res_fail, 1).show();
  }
  
  private void d(ArrayList<String> paramArrayList, String paramString)
  {
    if ((paramArrayList == null) || (paramArrayList.size() <= 0))
    {
      finish();
      return;
    }
    if (paramArrayList.size() > 9) {
      paramArrayList.subList(9, paramArrayList.size()).clear();
    }
    Object localObject;
    if ((au.HW()) && (!au.Dr()))
    {
      localObject = new Intent();
      ((Intent)localObject).putStringArrayListExtra("sns_kemdia_path_list", paramArrayList);
      if (!bi.oW(paramString)) {
        ((Intent)localObject).putExtra(e.h.thz, paramString);
      }
      ((Intent)localObject).putExtra("K_go_to_SnsTimeLineUI", true);
      ((Intent)localObject).putExtra("Ksnsupload_source", 12);
      ((Intent)localObject).setClassName(this, "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
      this.uBM = ((Intent)localObject);
    }
    for (;;)
    {
      paramArrayList = new com.tencent.mm.modelsimple.d(1, paramArrayList, cqk());
      au.DF().a(837, this);
      com.tencent.mm.kernel.g.DF().a(paramArrayList, 0);
      showDialog();
      return;
      paramString = new Intent(this, ShareToTimeLineUI.class);
      localObject = new ArrayList(paramArrayList.size());
      Iterator localIterator = paramArrayList.iterator();
      while (localIterator.hasNext()) {
        ((ArrayList)localObject).add(Uri.fromFile(new File((String)localIterator.next())));
      }
      paramString.putParcelableArrayListExtra("android.intent.extra.STREAM", (ArrayList)localObject);
      paramString.setAction("android.intent.action.SEND_MULTIPLE");
      paramString.addFlags(32768).addFlags(268435456);
      paramString.setType("image/*");
      MMWizardActivity.b(this, new Intent(this, SimpleLoginUI.class).addFlags(268435456).addFlags(32768), paramString);
      finish();
    }
  }
  
  private void showDialog()
  {
    getString(R.l.app_tip);
    this.eHw = com.tencent.mm.ui.base.h.a(this, getString(R.l.app_waiting), true, new ShareToTimeLineUI.1(this));
  }
  
  protected final boolean A(Intent paramIntent)
  {
    return true;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.i("MicroMsg.ShareToTimeLine", "onSceneEnd, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    au.DF().b(1200, this);
    if ((this.eHw != null) && (this.eHw.isShowing())) {
      this.eHw.dismiss();
    }
    if ((paraml instanceof aa))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        czU();
        return;
      }
      czy();
    }
    for (;;)
    {
      finish();
      return;
      if (!(paraml instanceof com.tencent.mm.modelsimple.d)) {
        break;
      }
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        if (paraml.dJd == null) {
          continue;
        }
        paramString = (ol)((b)paraml.dJd).dIE.dIL;
        if ((paramString != null) && (!bi.oW(paramString.rsN)))
        {
          paraml = new Intent();
          paraml.putExtra("rawUrl", paramString.rsN);
          paraml.putExtra("showShare", false);
          paraml.putExtra("show_bottom", false);
          paraml.putExtra("needRedirect", false);
          com.tencent.mm.bg.d.b(this, "webview", ".ui.tools.WebViewUI", paraml);
          continue;
        }
      }
      startActivity(this.uBM);
    }
  }
  
  protected final void a(AutoLoginActivity.a parama, Intent paramIntent)
  {
    switch (ShareToTimeLineUI.2.hdM[parama.ordinal()])
    {
    default: 
      finish();
      return;
    }
    this.intent = paramIntent;
    int i = bi.getInt(com.tencent.mm.k.g.AT().getValue("SystemShareControlBitset"), 0);
    x.i("MicroMsg.ShareToTimeLine", "now permission = %d", new Object[] { Integer.valueOf(i) });
    if ((i & 0x2) > 0)
    {
      x.e("MicroMsg.ShareToTimeLine", "now allowed to share to friend");
      finish();
      return;
    }
    parama = s.j(paramIntent, "android.intent.extra.TEXT");
    x.i("MicroMsg.ShareToTimeLine", "postLogin, text = %s", new Object[] { parama });
    if (!bi.oW(parama))
    {
      parama = String.format("weixin://dl/business/systemshare/?txt=%s", new Object[] { URLEncoder.encode(parama) });
      showDialog();
      au.DF().a(1200, this);
      parama = new aa(parama, 15, null);
      au.DF().a(parama, 0);
      return;
    }
    czU();
  }
  
  protected final boolean bjv()
  {
    if ((!au.HW()) || (au.Dr()))
    {
      x.w("MicroMsg.ShareToTimeLine", "not login");
      czU();
      return true;
    }
    return false;
  }
  
  protected void onDestroy()
  {
    au.DF().b(837, this);
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/tools/ShareToTimeLineUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */