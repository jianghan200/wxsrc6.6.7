package com.tencent.mm.plugin.ipcall.ui;

import android.content.ContentResolver;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.au;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.ipcall.a.g.d;
import com.tencent.mm.plugin.ipcall.a.g.k;
import com.tencent.mm.plugin.ipcall.a.g.l;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import java.util.ArrayList;

public class IPCallUserProfileUI
  extends MMActivity
{
  private String cbH;
  private String cbJ;
  private ImageView eBM;
  private boolean kut = false;
  private TextView kzg;
  private TextView kzh;
  private LinearLayout kzi;
  private LinearLayout kzj;
  private TextView kzk;
  private TextView kzl;
  private TextView kzm;
  private TextView kzn;
  private TextView kzo;
  private Button kzp;
  private String kzq;
  private String kzr;
  private Bitmap kzs;
  private boolean kzt;
  private Cursor kzu = null;
  private boolean kzv = false;
  private com.tencent.mm.plugin.ipcall.a.e.e kzw = new com.tencent.mm.plugin.ipcall.a.e.e();
  
  /* Error */
  private static String Fh(String paramString)
  {
    // Byte code:
    //   0: invokestatic 62	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   3: ldc 64
    //   5: invokestatic 70	com/tencent/mm/pluginsdk/permission/a:bj	(Landroid/content/Context;Ljava/lang/String;)Z
    //   8: ifne +12 -> 20
    //   11: ldc 72
    //   13: ldc 74
    //   15: invokestatic 80	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   18: aconst_null
    //   19: areturn
    //   20: invokestatic 62	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   23: invokevirtual 86	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   26: getstatic 92	android/provider/ContactsContract$CommonDataKinds$Phone:CONTENT_URI	Landroid/net/Uri;
    //   29: aconst_null
    //   30: ldc 94
    //   32: iconst_1
    //   33: anewarray 96	java/lang/String
    //   36: dup
    //   37: iconst_0
    //   38: aload_0
    //   39: aastore
    //   40: aconst_null
    //   41: invokevirtual 102	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   44: astore 4
    //   46: aload 4
    //   48: ifnull -30 -> 18
    //   51: aload 4
    //   53: invokeinterface 108 1 0
    //   58: istore_1
    //   59: iload_1
    //   60: ifeq +139 -> 199
    //   63: ldc 110
    //   65: astore_0
    //   66: aload_0
    //   67: astore_2
    //   68: aload_0
    //   69: astore_3
    //   70: aload 4
    //   72: invokeinterface 113 1 0
    //   77: ifne +125 -> 202
    //   80: aload_0
    //   81: astore_2
    //   82: aload 4
    //   84: aload 4
    //   86: ldc 115
    //   88: invokeinterface 119 2 0
    //   93: invokeinterface 123 2 0
    //   98: astore_3
    //   99: aload_0
    //   100: astore_2
    //   101: new 125	java/lang/StringBuilder
    //   104: dup
    //   105: invokespecial 126	java/lang/StringBuilder:<init>	()V
    //   108: aload_0
    //   109: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   112: aload_3
    //   113: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   116: ldc -124
    //   118: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   121: invokevirtual 136	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   124: astore_0
    //   125: aload_0
    //   126: astore_2
    //   127: aload 4
    //   129: invokeinterface 139 1 0
    //   134: pop
    //   135: goto -69 -> 66
    //   138: astore_0
    //   139: ldc 72
    //   141: ldc -115
    //   143: iconst_2
    //   144: anewarray 143	java/lang/Object
    //   147: dup
    //   148: iconst_0
    //   149: aload_0
    //   150: invokevirtual 146	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   153: aastore
    //   154: dup
    //   155: iconst_1
    //   156: aload_0
    //   157: invokevirtual 150	java/lang/Object:getClass	()Ljava/lang/Class;
    //   160: invokevirtual 155	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   163: aastore
    //   164: invokestatic 158	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   167: aload 4
    //   169: invokeinterface 161 1 0
    //   174: aload_2
    //   175: astore_0
    //   176: aload_2
    //   177: ldc -124
    //   179: invokevirtual 164	java/lang/String:lastIndexOf	(Ljava/lang/String;)I
    //   182: iflt +15 -> 197
    //   185: aload_2
    //   186: iconst_0
    //   187: aload_2
    //   188: ldc -124
    //   190: invokevirtual 164	java/lang/String:lastIndexOf	(Ljava/lang/String;)I
    //   193: invokevirtual 168	java/lang/String:substring	(II)Ljava/lang/String;
    //   196: astore_0
    //   197: aload_0
    //   198: areturn
    //   199: ldc 110
    //   201: astore_3
    //   202: aload 4
    //   204: invokeinterface 161 1 0
    //   209: aload_3
    //   210: astore_2
    //   211: goto -37 -> 174
    //   214: astore_0
    //   215: aload 4
    //   217: invokeinterface 161 1 0
    //   222: aload_0
    //   223: athrow
    //   224: astore_0
    //   225: ldc 110
    //   227: astore_2
    //   228: goto -89 -> 139
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	231	0	paramString	String
    //   58	2	1	bool	boolean
    //   67	161	2	localObject	Object
    //   69	141	3	str	String
    //   44	172	4	localCursor	Cursor
    // Exception table:
    //   from	to	target	type
    //   70	80	138	java/lang/Exception
    //   82	99	138	java/lang/Exception
    //   101	125	138	java/lang/Exception
    //   127	135	138	java/lang/Exception
    //   51	59	214	finally
    //   70	80	214	finally
    //   82	99	214	finally
    //   101	125	214	finally
    //   127	135	214	finally
    //   139	167	214	finally
    //   51	59	224	java/lang/Exception
  }
  
  private void aYq()
  {
    int i = 0;
    ArrayList localArrayList = new ArrayList();
    if ((this.kzu != null) && (this.kzu.getCount() > 0))
    {
      for (;;)
      {
        try
        {
          if ((!this.kzu.moveToFirst()) || (this.kzu.isAfterLast())) {
            break label204;
          }
          i += 1;
          str = this.kzu.getString(this.kzu.getColumnIndex("data1"));
          j = this.kzu.getInt(this.kzu.getColumnIndex("data2"));
          if (!localArrayList.contains(str))
          {
            localArrayList.add(str);
            if (i != this.kzu.getCount()) {
              continue;
            }
            k(str, j, false);
          }
        }
        catch (Exception localException)
        {
          String str;
          int j;
          x.e("MicroMsg.IPCallUserProfileUI", "initPhoneNumberList error: %s", new Object[] { localException.getMessage() });
          return;
          k(str, j, true);
          continue;
        }
        finally
        {
          this.kzu.close();
        }
        this.kzu.moveToNext();
      }
      label204:
      this.kzu.close();
      return;
    }
    this.kzi.setVisibility(8);
  }
  
  private void aYr()
  {
    this.kzp.setOnClickListener(new IPCallUserProfileUI.9(this));
  }
  
  private void aYs()
  {
    if (!this.kzv)
    {
      this.kzj.setVisibility(8);
      this.kzn.setVisibility(8);
    }
    Object localObject1;
    if (!bi.oW(this.cbH))
    {
      localObject1 = this.cbH;
      if (!bi.oW((String)localObject1))
      {
        localObject1 = i.aXv().EP((String)localObject1);
        if ((localObject1 != null) && (((com.tencent.mm.plugin.ipcall.a.g.c)localObject1).sKx != -1L))
        {
          long l = ((com.tencent.mm.plugin.ipcall.a.g.c)localObject1).sKx;
          localObject1 = i.aXw().diF.query("IPCallRecord", l.ksH, "addressId=?", new String[] { String.valueOf(l) }, null, null, "calltime desc limit 4");
          if ((localObject1 == null) || (((Cursor)localObject1).getCount() <= 0)) {
            break label596;
          }
        }
      }
    }
    for (;;)
    {
      try
      {
        int i;
        if (((Cursor)localObject1).moveToFirst())
        {
          i = 0;
          j = i;
          if (!((Cursor)localObject1).isAfterLast())
          {
            Object localObject4 = new k();
            ((k)localObject4).d((Cursor)localObject1);
            i += 1;
            if (i < 3) {
              break label615;
            }
            j = 1;
            int k = ((Cursor)localObject1).getCount();
            Object localObject2 = LayoutInflater.from(this).inflate(R.i.profile_record_item, this.kzj, false);
            TextView localTextView1 = (TextView)((View)localObject2).findViewById(R.h.profile_record_calltime_tv);
            TextView localTextView2 = (TextView)((View)localObject2).findViewById(R.h.profile_record_phonenumber_tv);
            TextView localTextView3 = (TextView)((View)localObject2).findViewById(R.h.profile_record_status_duration_tv);
            localTextView2.setText(com.tencent.mm.plugin.ipcall.b.a.Ft(((k)localObject4).field_phonenumber));
            if (((k)localObject4).field_duration > 0L)
            {
              localTextView3.setText(com.tencent.mm.plugin.ipcall.b.c.dT(((k)localObject4).field_duration));
              localTextView1.setText(com.tencent.mm.plugin.ipcall.b.c.dR(((k)localObject4).field_calltime));
              if (j != 0)
              {
                ((View)localObject2).setBackgroundDrawable(getResources().getDrawable(R.g.profile_record_background_with_line));
                int m = getResources().getDimensionPixelSize(R.f.profile_info_basic_left_right_margin);
                ((View)localObject2).setPadding(m, 0, m, 0);
              }
              if (1 == k)
              {
                localObject4 = (LinearLayout.LayoutParams)((View)localObject2).getLayoutParams();
                ((LinearLayout.LayoutParams)localObject4).height = com.tencent.mm.bp.a.ad(this.mController.tml, R.f.only_one_record_layout_height);
                ((View)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject4);
              }
              this.kzj.addView((View)localObject2);
              if (j != 0) {
                continue;
              }
              ((Cursor)localObject1).moveToNext();
              continue;
              localObject1 = null;
              break;
              localObject1 = i.aXw();
              localObject2 = this.cbJ;
              localObject1 = ((l)localObject1).diF.query("IPCallRecord", l.ksH, "phonenumber=?", new String[] { localObject2 }, null, null, "calltime desc limit 4");
              break;
            }
            localTextView3.setText(com.tencent.mm.plugin.ipcall.b.c.rL(((k)localObject4).field_status));
            continue;
          }
        }
        View localView;
        this.kzj.setVisibility(8);
      }
      catch (Exception localException)
      {
        x.e("MicroMsg.IPCallUserProfileUI", "initRecordList, error: %s", new Object[] { localException.getMessage() });
        return;
        j = i;
        if (j <= 0)
        {
          this.kzj.setVisibility(8);
          return;
        }
        if (((Cursor)localObject1).getCount() < 4) {
          continue;
        }
        localView = LayoutInflater.from(this).inflate(R.i.profile_record_item_see_more, this.kzj, false);
        this.kzj.addView(localView);
        localView.setOnClickListener(new IPCallUserProfileUI.3(this));
        continue;
      }
      finally
      {
        ((Cursor)localObject1).close();
      }
      label596:
      this.kzn.setVisibility(8);
      return;
      label615:
      int j = 0;
    }
  }
  
  private void k(String paramString, int paramInt, boolean paramBoolean)
  {
    View localView = LayoutInflater.from(this).inflate(R.i.profile_phonenumber_item, this.kzi, false);
    Object localObject = (LinearLayout)localView.findViewById(R.h.list_item_layot);
    if (!paramBoolean) {
      ((LinearLayout)localObject).setBackgroundDrawable(null);
    }
    for (;;)
    {
      localObject = (TextView)localView.findViewById(R.h.phonenumber_type_tv);
      TextView localTextView = (TextView)localView.findViewById(R.h.phonenumber_tv);
      localTextView.setText(com.tencent.mm.plugin.ipcall.b.a.Ft(com.tencent.mm.plugin.ipcall.b.c.Fx(paramString)));
      ((TextView)localObject).setText(com.tencent.mm.plugin.ipcall.b.a.rK(paramInt));
      localView.setClickable(true);
      localView.setOnClickListener(new IPCallUserProfileUI.4(this, paramString));
      localView.setOnLongClickListener(new IPCallUserProfileUI.5(this, localTextView));
      this.kzi.addView(localView);
      return;
      ((LinearLayout)localObject).setBackgroundDrawable(getResources().getDrawable(R.g.list_item_normal));
    }
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return R.i.ip_call_user_profile_ui;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    h.mEJ.h(12061, new Object[] { Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
    setBackBtn(new IPCallUserProfileUI.1(this));
    setMMTitle(R.l.ip_call_profile_title);
    this.eBM = ((ImageView)findViewById(R.h.avatar_iv));
    this.kzg = ((TextView)findViewById(R.h.system_addrbook_username_tv));
    this.kzh = ((TextView)findViewById(R.h.wechat_username_tv));
    this.kzi = ((LinearLayout)findViewById(R.h.profile_phonenumber_ll));
    this.kzk = ((TextView)findViewById(R.h.profile_op_save_phonenumber_button));
    this.kzm = ((TextView)findViewById(R.h.profile_op_copy_phonenumber_button));
    this.kzl = ((TextView)findViewById(R.h.profile_op_call_phonenumber_button));
    this.kzj = ((LinearLayout)findViewById(R.h.profile_record_ll));
    this.kzn = ((TextView)findViewById(R.h.record_title));
    this.kzo = ((TextView)findViewById(R.h.invite_friend_text));
    this.kzp = ((Button)findViewById(R.h.profile_invite_op_btn));
    this.cbH = getIntent().getStringExtra("IPCallProfileUI_contactid");
    this.kzq = getIntent().getStringExtra("IPCallProfileUI_systemUsername");
    this.kzr = getIntent().getStringExtra("IPCallProfileUI_wechatUsername");
    this.cbJ = getIntent().getStringExtra("IPCallProfileUI_phonenumber");
    this.kzv = getIntent().getBooleanExtra("IPCallProfileUI_isNeedShowRecord", false);
    if (!bi.oW(this.cbH))
    {
      this.kzs = com.tencent.mm.plugin.ipcall.b.a.ay(this, this.cbH);
      if (this.kzs != null) {
        this.eBM.setImageBitmap(this.kzs);
      }
    }
    if ((this.kzs == null) && (!bi.oW(this.kzr)))
    {
      this.kzs = com.tencent.mm.aa.c.a(this.kzr, false, -1);
      if (this.kzs != null) {
        this.eBM.setImageBitmap(this.kzs);
      }
    }
    if (!bi.oW(this.kzq))
    {
      this.kzg.setText(this.kzq);
      if ((bi.oW(this.kzr)) || (this.kzr.endsWith("@stranger"))) {
        break label525;
      }
      paramBundle = getString(R.l.ip_call_profile_wechat_username_format, new Object[] { r.gT(this.kzr) });
      this.kzh.setText(j.a(this, paramBundle));
    }
    label525:
    boolean bool;
    for (;;)
    {
      if (!bi.oW(this.cbH))
      {
        if (!com.tencent.mm.pluginsdk.permission.a.bj(this, "android.permission.READ_CONTACTS"))
        {
          x.e("MicroMsg.IPCallUserProfileUI", "no contact permission");
          return;
          if (bi.oW(this.cbJ)) {
            break;
          }
          this.kzg.setText(com.tencent.mm.plugin.ipcall.b.a.Ft(this.cbJ));
          break;
          this.kzh.setVisibility(8);
          continue;
        }
        this.kzu = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, "contact_id=?", new String[] { this.cbH }, null);
        if (this.kzu.getCount() > 1) {
          break label724;
        }
        bool = true;
        this.kut = bool;
      }
    }
    aYs();
    this.kzm.setVisibility(8);
    this.kzl.setVisibility(8);
    this.kzk.setVisibility(8);
    this.kzp.setVisibility(8);
    this.kzo.setVisibility(8);
    if ((!bi.oW(this.kzr)) && (!bi.oW(this.kzq)))
    {
      au.HU();
      paramBundle = com.tencent.mm.model.c.FR().Yg(this.kzr);
      if ((paramBundle != null) && (!com.tencent.mm.l.a.gd(paramBundle.field_type)))
      {
        this.kzp.setOnClickListener(new IPCallUserProfileUI.8(this));
        this.kzp.setText(R.l.ip_call_profile_add_wechat_friend_btn);
        this.kzp.setVisibility(0);
      }
    }
    for (;;)
    {
      aYq();
      return;
      label724:
      bool = false;
      break;
      if ((!bi.oW(this.cbH)) && (!bi.oW(this.kzq)))
      {
        aYr();
        this.kzp.setText(R.l.ip_call_profile_invite_wechat_friend_btn);
      }
      else if (!bi.oW(this.cbJ))
      {
        this.kzl.setVisibility(0);
        this.kzm.setVisibility(0);
        paramBundle = ad.getContext();
        Intent localIntent = new Intent("android.intent.action.INSERT");
        localIntent.setType("vnd.android.cursor.dir/contact");
        localIntent.putExtra("phone", "10086");
        if (bi.k(paramBundle, localIntent)) {
          this.kzk.setVisibility(0);
        }
        this.kzk.setOnClickListener(new IPCallUserProfileUI.10(this));
        this.kzl.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            IPCallUserProfileUI.a(IPCallUserProfileUI.this, IPCallUserProfileUI.f(IPCallUserProfileUI.this));
          }
        });
        this.kzm.setOnClickListener(new IPCallUserProfileUI.2(this));
        aYr();
        this.kzp.setText(R.l.ip_call_profile_invite_wechat_friend_btn);
      }
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    if (this.kzt)
    {
      this.kzt = false;
      this.kzj.removeAllViews();
      aYs();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */