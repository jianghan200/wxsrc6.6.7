package com.tencent.mm.plugin.subapp.ui.pluginapp;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.model.q;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.i.a.a;
import com.tencent.mm.ui.i.a.b;
import com.tencent.mm.ui.i.a.c;
import com.tencent.mm.ui.s;

public class InviteFriendsBy3rdUI
  extends MMPreference
  implements com.tencent.mm.ab.e, a.a, a.b
{
  private static int otA = 2;
  private static int otB = 3;
  private static int otC = 4;
  private static int otD = 5;
  private static int otE = 0;
  private static int otF = 1;
  private static int otz = 1;
  private ProgressDialog eHw = null;
  private int fromScene;
  private ProgressBar jfO = null;
  private ProgressDialog kxR = null;
  private com.tencent.mm.ui.i.a ogE = new com.tencent.mm.ui.i.a();
  private int otG = 0;
  private Bitmap otH = null;
  private View otI;
  private ImageView otJ = null;
  private EditText otK = null;
  private boolean otL = false;
  private boolean otM = false;
  
  /* Error */
  private static byte[] Fg(String paramString)
  {
    // Byte code:
    //   0: invokestatic 97	com/tencent/mm/model/au:HU	()Lcom/tencent/mm/model/c;
    //   3: pop
    //   4: invokestatic 103	com/tencent/mm/model/c:Gb	()Ljava/lang/String;
    //   7: astore_1
    //   8: invokestatic 97	com/tencent/mm/model/au:HU	()Lcom/tencent/mm/model/c;
    //   11: pop
    //   12: aload_1
    //   13: invokestatic 106	com/tencent/mm/model/c:Gc	()Ljava/lang/String;
    //   16: ldc 108
    //   18: aload_0
    //   19: invokevirtual 114	java/lang/String:getBytes	()[B
    //   22: invokestatic 120	com/tencent/mm/a/g:u	([B)Ljava/lang/String;
    //   25: ldc 122
    //   27: invokestatic 128	com/tencent/mm/sdk/platformtools/h:f	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   30: astore_0
    //   31: new 130	java/io/RandomAccessFile
    //   34: dup
    //   35: aload_0
    //   36: ldc -124
    //   38: invokespecial 135	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   41: astore_1
    //   42: aload_1
    //   43: astore_0
    //   44: aload_1
    //   45: invokevirtual 139	java/io/RandomAccessFile:length	()J
    //   48: l2i
    //   49: newarray <illegal type>
    //   51: astore_2
    //   52: aload_1
    //   53: astore_0
    //   54: aload_1
    //   55: aload_2
    //   56: invokevirtual 143	java/io/RandomAccessFile:read	([B)I
    //   59: pop
    //   60: aload_1
    //   61: invokevirtual 146	java/io/RandomAccessFile:close	()V
    //   64: aload_2
    //   65: areturn
    //   66: astore_2
    //   67: aconst_null
    //   68: astore_1
    //   69: aload_1
    //   70: astore_0
    //   71: ldc -108
    //   73: aload_2
    //   74: ldc -106
    //   76: iconst_0
    //   77: anewarray 152	java/lang/Object
    //   80: invokestatic 158	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   83: aload_1
    //   84: ifnull +7 -> 91
    //   87: aload_1
    //   88: invokevirtual 146	java/io/RandomAccessFile:close	()V
    //   91: aconst_null
    //   92: areturn
    //   93: astore_1
    //   94: aconst_null
    //   95: astore_0
    //   96: aload_0
    //   97: ifnull +7 -> 104
    //   100: aload_0
    //   101: invokevirtual 146	java/io/RandomAccessFile:close	()V
    //   104: aload_1
    //   105: athrow
    //   106: astore_0
    //   107: aload_2
    //   108: areturn
    //   109: astore_0
    //   110: goto -19 -> 91
    //   113: astore_0
    //   114: goto -10 -> 104
    //   117: astore_1
    //   118: goto -22 -> 96
    //   121: astore_2
    //   122: goto -53 -> 69
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	125	0	paramString	String
    //   7	81	1	localObject1	Object
    //   93	12	1	localObject2	Object
    //   117	1	1	localObject3	Object
    //   51	14	2	arrayOfByte	byte[]
    //   66	42	2	localException1	Exception
    //   121	1	2	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   31	42	66	java/lang/Exception
    //   31	42	93	finally
    //   60	64	106	java/lang/Exception
    //   87	91	109	java/lang/Exception
    //   100	104	113	java/lang/Exception
    //   44	52	117	finally
    //   54	60	117	finally
    //   71	83	117	finally
    //   44	52	121	java/lang/Exception
    //   54	60	121	java/lang/Exception
  }
  
  private static Bitmap aYp()
  {
    byte[] arrayOfByte = Fg(q.GF());
    if (arrayOfByte == null) {
      return null;
    }
    return com.tencent.mm.sdk.platformtools.c.bs(arrayOfByte);
  }
  
  private static boolean au(Context paramContext, String paramString)
  {
    if (bi.oW(paramString)) {
      return false;
    }
    try
    {
      paramContext.getPackageManager().getApplicationInfo(paramString, 8192);
      return true;
    }
    catch (PackageManager.NameNotFoundException paramContext) {}
    return false;
  }
  
  private void l(int paramInt, String paramString1, String paramString2)
  {
    this.otI = View.inflate(this.mController.tml, R.i.confirm_dialog_item, null);
    this.otK = ((EditText)this.otI.findViewById(R.h.confirm_dialog_text_et));
    this.otJ = ((ImageView)this.otI.findViewById(R.h.confirm_dialog_imageview));
    this.jfO = ((ProgressBar)this.otI.findViewById(R.h.loading_pb));
    ((View)this.otJ.getParent()).setVisibility(8);
    this.otK.setText(paramString1);
    this.otH = aYp();
    if (this.otH == null)
    {
      Object localObject = q.GF();
      au.HU();
      localObject = new com.tencent.mm.as.a((String)localObject, bi.f((Integer)com.tencent.mm.model.c.DT().get(66561, null)));
      au.DF().a((l)localObject, 0);
      ((ProgressBar)this.otI.findViewById(R.h.loading_pb)).setVisibility(0);
    }
    for (;;)
    {
      com.tencent.mm.pluginsdk.ui.applet.g.a(this.mController, paramString2, this.otI, getResources().getString(R.l.app_send), new InviteFriendsBy3rdUI.2(this, paramString1, paramInt));
      return;
      if (this.otJ != null) {
        this.otJ.setImageBitmap(this.otH);
      }
    }
  }
  
  private void rI(int paramInt)
  {
    com.tencent.mm.ui.base.h.a(this.mController.tml, paramInt, R.l.app_tip, new DialogInterface.OnClickListener()new InviteFriendsBy3rdUI.11
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
    }, new InviteFriendsBy3rdUI.11(this));
  }
  
  private void xW(int paramInt)
  {
    com.tencent.mm.modelmulti.e locale = new com.tencent.mm.modelmulti.e(paramInt);
    getString(R.l.app_tip);
    this.eHw = com.tencent.mm.ui.base.h.a(this, getString(R.l.loading_tips), true, new InviteFriendsBy3rdUI.8(this, locale));
    au.DF().a(locale, 0);
  }
  
  public final int Ys()
  {
    return R.o.invate_friends_by_3rd;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.InviteFriendsBy3rdUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.eHw != null)
    {
      this.eHw.dismiss();
      this.eHw = null;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0)) {
      com.tencent.mm.plugin.report.service.h.mEJ.h(14035, new Object[] { Integer.valueOf(this.otG), Integer.valueOf(otE), Integer.valueOf(this.fromScene) });
    }
    if (paraml.getType() == 1803) {
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        com.tencent.mm.ui.base.h.i(this.mController.tml, R.l.loading_failed, R.l.app_tip);
      }
    }
    label185:
    label496:
    label708:
    label866:
    label874:
    label888:
    label912:
    label936:
    label993:
    do
    {
      return;
      paramString = (com.tencent.mm.modelmulti.e)paraml;
      Object localObject1;
      int i;
      if (bi.oW(paramString.title))
      {
        localObject1 = null;
        paramString = (com.tencent.mm.modelmulti.e)paraml;
        if (!bi.oW(paramString.content)) {
          break label866;
        }
        paramString = null;
        Object localObject2 = q.GG();
        au.HU();
        String str = (String)com.tencent.mm.model.c.DT().get(6, null);
        Object localObject3 = localObject2;
        if (bi.oW((String)localObject2)) {
          localObject3 = str;
        }
        i = ((com.tencent.mm.modelmulti.e)paraml).dZg;
        localObject2 = paramString;
        if ((i & 0x1) > 0)
        {
          localObject2 = localObject1;
          if (bi.oW((String)localObject1)) {
            localObject2 = String.format(getString(R.l.invite_friends_mail_title), new Object[] { q.GH() });
          }
          localObject1 = paramString;
          if (bi.oW(paramString)) {
            localObject1 = String.format(getString(R.l.invite_friends_mail_content), new Object[] { localObject3 });
          }
          paramString = new Intent("android.intent.action.SEND");
          paramString.putExtra("android.intent.extra.SUBJECT", (String)localObject2);
          paramString.putExtra("android.intent.extra.TEXT", (String)localObject1);
          paramString.setType("plain/text");
          startActivity(Intent.createChooser(paramString, getString(R.l.invite_friends_by_mail_select)));
          com.tencent.mm.plugin.report.service.h.mEJ.h(14035, new Object[] { Integer.valueOf(this.otG), Integer.valueOf(otF), Integer.valueOf(this.fromScene) });
          localObject2 = localObject1;
        }
        paramString = (String)localObject2;
        if ((i & 0x2) > 0)
        {
          paramString = (String)localObject2;
          if (bi.oW((String)localObject2)) {
            paramString = String.format(getString(R.l.invite_friends_message_content), new Object[] { localObject3 });
          }
          localObject1 = new Intent("android.intent.action.VIEW");
          ((Intent)localObject1).putExtra("sms_body", paramString);
          ((Intent)localObject1).setType("vnd.android-dir/mms-sms");
          if (!bi.k(this, (Intent)localObject1)) {
            break label874;
          }
          startActivity((Intent)localObject1);
          com.tencent.mm.plugin.report.service.h.mEJ.h(14035, new Object[] { Integer.valueOf(this.otG), Integer.valueOf(otF), Integer.valueOf(this.fromScene) });
        }
        localObject1 = paramString;
        if ((i & 0x4) > 0)
        {
          localObject1 = paramString;
          if (bi.oW(paramString)) {
            localObject1 = String.format(getString(R.l.invite_friends_message_content), new Object[] { localObject3 });
          }
          paramString = new Intent();
          paramString.setAction("android.intent.action.SEND");
          paramString.putExtra("android.intent.extra.TEXT", (String)localObject1);
          paramString.setType("text/plain");
          paramString.setPackage("com.whatsapp");
          startActivity(paramString);
          com.tencent.mm.plugin.report.service.h.mEJ.h(14035, new Object[] { Integer.valueOf(this.otG), Integer.valueOf(otF), Integer.valueOf(this.fromScene) });
        }
        localObject2 = localObject1;
        if ((i & 0x8) > 0)
        {
          paramString = (String)localObject1;
          if (bi.oW((String)localObject1))
          {
            if (!bi.oW(q.GG())) {
              break label888;
            }
            paramString = getString(R.l.invite_friends_facebook_twitter_no_wechatid_content);
          }
          localObject1 = getString(R.l.invite_friends_by_facebook);
          localObject2 = paramString;
          if (this.otM == true)
          {
            l(i, paramString, (String)localObject1);
            this.otM = false;
            localObject2 = paramString;
          }
        }
        if ((i & 0x10) > 0)
        {
          this.ogE.a(this);
          paramString = (String)localObject2;
          if (bi.oW((String)localObject2)) {
            if (!bi.oW(q.GG())) {
              break label912;
            }
          }
        }
      }
      for (paramString = getString(R.l.invite_friends_facebook_twitter_no_wechatid_content);; paramString = String.format(getString(R.l.invite_friends_facebook_twitter_content), new Object[] { q.GG() }))
      {
        localObject1 = getString(R.l.invite_friends_by_twitter);
        if (this.otL == true)
        {
          l(i, paramString, (String)localObject1);
          this.otL = false;
        }
        if (paraml.getType() != 1804) {
          break label993;
        }
        if ((paramInt1 == 0) && (paramInt2 == 0)) {
          break label936;
        }
        com.tencent.mm.ui.base.h.i(this.mController.tml, R.l.sendrequest_send_fail, R.l.app_tip);
        return;
        localObject1 = paramString.title;
        break;
        paramString = paramString.content;
        break label185;
        Toast.makeText(this, R.l.selectsmsapp_none, 1).show();
        break label496;
        paramString = String.format(getString(R.l.invite_friends_facebook_twitter_content), new Object[] { q.GG() });
        break label708;
      }
      com.tencent.mm.ui.base.h.bA(this, getResources().getString(R.l.confirm_dialog_sent));
      com.tencent.mm.plugin.report.service.h.mEJ.h(14035, new Object[] { Integer.valueOf(this.otG), Integer.valueOf(otF), Integer.valueOf(this.fromScene) });
    } while ((paraml.getType() != 168) || (paramInt1 != 0) || (paramInt2 != 0) || (this.otJ == null));
    if (this.jfO != null) {
      this.jfO.setVisibility(8);
    }
    this.otJ.setImageBitmap(aYp());
  }
  
  public final void a(a.c paramc)
  {
    if (this.kxR != null) {
      this.kxR.cancel();
    }
    switch (3.kyp[paramc.ordinal()])
    {
    case 2: 
    default: 
      return;
    case 1: 
      rI(R.l.twitterlogin_success);
      return;
    }
    rI(R.l.twitterlogin_failed);
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    if ("invite_friends_by_message".equals(paramPreference.mKey))
    {
      this.otG = otA;
      xW(2);
      return true;
    }
    if ("invite_friends_by_mail".equals(paramPreference.mKey))
    {
      this.otG = otz;
      xW(1);
      return true;
    }
    if ("invite_friends_by_whatsapp".equals(paramPreference.mKey))
    {
      this.otG = otB;
      xW(4);
      return true;
    }
    if ("invite_friends_by_facebook".equals(paramPreference.mKey))
    {
      this.otG = otC;
      if (q.Hg())
      {
        this.otM = true;
        xW(8);
        return true;
      }
      com.tencent.mm.ui.base.h.a(this.mController.tml, R.l.settings_facebook_notice, R.l.app_tip, new InviteFriendsBy3rdUI.4(this), new InviteFriendsBy3rdUI.5(this));
      return true;
    }
    if ("invite_friends_by_twitter".equals(paramPreference.mKey))
    {
      this.otG = otD;
      if (this.ogE.cAo())
      {
        this.otL = true;
        xW(16);
        return true;
      }
      com.tencent.mm.ui.base.h.a(this.mController.tml, R.l.settings_twitter_notice, R.l.app_tip, new InviteFriendsBy3rdUI.6(this), new InviteFriendsBy3rdUI.7(this));
      return true;
    }
    return false;
  }
  
  public final void b(a.c paramc) {}
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(R.l.find_friends_by_invite_friend);
    this.fromScene = getIntent().getIntExtra("Invite_friends", 4);
    int i = bi.getInt(com.tencent.mm.k.g.AT().getValue("InviteFriendsInviteFlags"), 0);
    paramBundle = this.tCL;
    if ((i & 0x2) <= 0) {
      paramBundle.aaa("invite_friends_by_message");
    }
    if ((i & 0x1) <= 0) {
      paramBundle.aaa("invite_friends_by_mail");
    }
    if (((i & 0x4) <= 0) || (!au(this.mController.tml, "com.whatsapp"))) {
      paramBundle.aaa("invite_friends_by_whatsapp");
    }
    if (((i & 0x8) <= 0) || (!q.He())) {
      paramBundle.aaa("invite_friends_by_facebook");
    }
    if ((i & 0x10) <= 0) {
      paramBundle.aaa("invite_friends_by_twitter");
    }
    paramBundle.notifyDataSetChanged();
    au.DF().a(1803, this);
    au.DF().a(1804, this);
    au.DF().a(168, this);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        InviteFriendsBy3rdUI.this.finish();
        return true;
      }
    });
  }
  
  protected void onDestroy()
  {
    au.DF().b(1803, this);
    au.DF().b(1804, this);
    au.DF().b(168, this);
    if (this.otG == 0) {
      com.tencent.mm.plugin.report.service.h.mEJ.h(14035, new Object[] { Integer.valueOf(this.otG), Integer.valueOf(otE), Integer.valueOf(this.fromScene) });
    }
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/subapp/ui/pluginapp/InviteFriendsBy3rdUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */