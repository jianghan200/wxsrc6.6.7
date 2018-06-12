package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMEditText.c;

public class ShareToQQWeiboUI
  extends MMActivity
  implements e
{
  private ProgressDialog eHw = null;
  private TextView mPC;
  private EditText meN;
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.i("MicroMsg.ShareToQQWeiboUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (paraml.getType() != 26) {
      return;
    }
    if (this.eHw != null)
    {
      this.eHw.dismiss();
      this.eHw = null;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      YC();
      setResult(-1);
      finish();
      return;
    }
    setResult(1, new Intent().putExtra("err_code", paramInt2));
    Toast.makeText(this, getString(R.l.share_err, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
  }
  
  protected final int getLayoutId()
  {
    return R.i.edit_share_qqweibo;
  }
  
  protected final void initView()
  {
    setMMTitle(R.l.share_to_tencent_microblog);
    this.meN = ((EditText)findViewById(R.h.content));
    this.mPC = ((TextView)findViewById(R.h.wordcount));
    String str1 = getIntent().getStringExtra("content");
    String str2 = getIntent().getStringExtra("shortUrl");
    this.meN.addTextChangedListener(new MMEditText.c(this.meN, this.mPC, 280));
    if (str1.contains(str2)) {
      this.meN.setText(str1.trim());
    }
    for (;;)
    {
      setBackBtn(new ShareToQQWeiboUI.1(this));
      addTextOptionMenu(0, getString(R.l.app_share), new ShareToQQWeiboUI.2(this));
      return;
      this.meN.setText(str1 + " " + str2);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    au.DF().a(26, this);
    initView();
  }
  
  public void onDestroy()
  {
    au.DF().b(26, this);
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/jsapi/ShareToQQWeiboUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */