package com.tencent.mm.view.c;

import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emoji.b.c;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel.a;
import com.tencent.mm.pluginsdk.ui.chat.j;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.view.e.a.a;

public final class a
{
  private final String TAG = "MicroMsg.emoji.SmileyPanel.SmileyPanelInfo";
  public int gKG;
  public String iiv;
  public int pGW;
  public int pGX;
  public com.tencent.mm.view.f.a uSK;
  public int uVA;
  public com.tencent.mm.view.e.a uVv;
  public int uVw;
  public int uVx;
  public int uVy;
  public boolean uVz = false;
  
  public a(EmojiGroupInfo paramEmojiGroupInfo, int paramInt1, int paramInt2, com.tencent.mm.view.f.a parama, com.tencent.mm.view.e.a parama1, boolean paramBoolean)
  {
    if ((paramEmojiGroupInfo == null) || (bi.oW(paramEmojiGroupInfo.field_productID)))
    {
      x.i("MicroMsg.emoji.SmileyPanel.SmileyPanelInfo", "catch invalid Smiley Tab want add??!!");
      return;
    }
    this.uVv = parama1;
    this.uSK = parama;
    this.iiv = paramEmojiGroupInfo.field_productID;
    this.gKG = paramInt1;
    this.uVA = paramInt2;
    int i;
    if ((paramBoolean) || (paramEmojiGroupInfo.field_productID.equalsIgnoreCase(String.valueOf(EmojiGroupInfo.tcy))))
    {
      parama = this.uSK;
      if (paramEmojiGroupInfo != null) {
        if (paramEmojiGroupInfo.field_productID.equals("TAG_DEFAULT_TAB"))
        {
          paramInt2 = com.tencent.mm.br.e.cjH().apW();
          parama.cCL();
          i = paramInt2;
          if (parama.uWv) {
            i = paramInt2 - 1;
          }
          this.uVw = i;
          paramEmojiGroupInfo = this.uSK;
          parama = this.iiv;
          if ((paramEmojiGroupInfo.gKZ > 0) && (!bi.oW(parama))) {
            break label502;
          }
          paramInt2 = 1;
          label173:
          this.pGW = paramInt2;
          paramEmojiGroupInfo = this.uSK;
          parama = this.iiv;
          if (!bi.oW(parama)) {
            break label617;
          }
          paramInt2 = 0;
          label199:
          this.pGX = paramInt2;
          this.uSK.a(this);
        }
      }
    }
    for (;;)
    {
      this.uVz = paramBoolean;
      x.i("MicroMsg.emoji.SmileyPanel.SmileyPanelInfo", "smiley panel tab: productId: %s, startIndex: %d mAllEmojiNums: %d mRow:%d mCol:%d mSpacing:%d ", new Object[] { this.iiv, Integer.valueOf(paramInt1), Integer.valueOf(this.uVw), Integer.valueOf(this.pGW), Integer.valueOf(this.pGX), Integer.valueOf(this.uVx) });
      return;
      if (paramEmojiGroupInfo.field_productID.equals(String.valueOf(EmojiGroupInfo.tcz)))
      {
        if (com.tencent.mm.view.f.a.isSDCardAvailable())
        {
          paramInt2 = ((c)g.n(c.class)).getProvider().aDV() + 1;
          break;
        }
        paramInt2 = 0;
        break;
      }
      if (paramEmojiGroupInfo.field_productID.equalsIgnoreCase(String.valueOf(EmojiGroupInfo.tcy)))
      {
        if (com.tencent.mm.view.f.a.isSDCardAvailable())
        {
          paramInt2 = 16;
          break;
        }
        paramInt2 = 0;
        break;
      }
      if (com.tencent.mm.view.f.a.d(paramEmojiGroupInfo))
      {
        paramInt2 = 1;
        if (paramEmojiGroupInfo != null)
        {
          if (paramEmojiGroupInfo.field_count <= 0) {
            break label418;
          }
          paramInt2 = paramEmojiGroupInfo.field_count;
        }
        for (;;)
        {
          i = paramInt2;
          if (paramInt2 == 0) {
            i = 1;
          }
          paramInt2 = i;
          if (com.tencent.mm.view.f.a.isSDCardAvailable()) {
            break;
          }
          paramInt2 = 0;
          break;
          label418:
          paramInt2 = ((c)g.n(c.class)).getProvider().zs(paramEmojiGroupInfo.field_productID);
          paramEmojiGroupInfo.field_count = paramInt2;
          long l = System.currentTimeMillis();
          ((c)g.n(c.class)).getProvider().a(paramEmojiGroupInfo);
          x.d("MicroMsg.emoji.SmileyPanel.SmileyPanelStg", "use time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        }
      }
      paramInt2 = 1;
      break;
      label502:
      if (parama.equals("TAG_STORE_TAB"))
      {
        paramInt2 = 1;
        break label173;
      }
      if (parama.equals("TAG_DEFAULT_TAB"))
      {
        i = (paramEmojiGroupInfo.gKZ - paramEmojiGroupInfo.uWo) / paramEmojiGroupInfo.abR(parama);
        label545:
        if (!bi.oW(parama)) {
          break label597;
        }
        paramInt2 = 0;
      }
      for (;;)
      {
        int j = i;
        if (i > paramInt2) {
          j = paramInt2;
        }
        paramInt2 = j;
        if (j > 0) {
          break;
        }
        paramInt2 = 1;
        break;
        i = paramEmojiGroupInfo.gKZ / paramEmojiGroupInfo.abR(parama);
        break label545;
        label597:
        if (parama.equals("TAG_DEFAULT_TAB")) {
          paramInt2 = 3;
        } else {
          paramInt2 = 2;
        }
      }
      label617:
      if (parama.equals("TAG_DEFAULT_TAB"))
      {
        if (paramEmojiGroupInfo.cCI())
        {
          paramInt2 = 7;
          break label199;
        }
        paramInt2 = paramEmojiGroupInfo.cCz() / paramEmojiGroupInfo.uWi;
        break label199;
      }
      if (paramEmojiGroupInfo.gKZ <= 0)
      {
        paramInt2 = 0;
        break label199;
      }
      if (parama.equals("TAG_STORE_TAB"))
      {
        paramInt2 = 3;
        break label199;
      }
      i = paramEmojiGroupInfo.cCz() / paramEmojiGroupInfo.uWf;
      paramInt2 = i;
      if (paramEmojiGroupInfo.cCI())
      {
        paramInt2 = i;
        if (i > 4) {
          paramInt2 = 4;
        }
      }
      x.d("MicroMsg.emoji.SmileyPanel.SmileyPanelStg", "return calc Col Nums: %d", new Object[] { Integer.valueOf(paramInt2) });
      break label199;
      this.uVw = 1;
      this.pGW = 1;
      this.pGX = 1;
      this.uSK.a(this);
    }
  }
  
  public final int aqd()
  {
    return this.pGW * this.pGX;
  }
  
  public final int cCn()
  {
    int i;
    if (aqd() <= 0) {
      i = 0;
    }
    int j;
    do
    {
      return i;
      if (!"TAG_DEFAULT_TAB".equals(this.iiv)) {
        break;
      }
      j = (int)Math.ceil(this.uVw / (aqd() - 1));
      i = j;
    } while (!this.uSK.cCL());
    return j + 1;
    return (int)Math.ceil(this.uVw / aqd());
  }
  
  public final ChatFooterPanel.a cCo()
  {
    com.tencent.mm.view.e.a locala = this.uVv;
    if (locala.uVQ == null) {
      return null;
    }
    return locala.uVQ.getTextOpListener();
  }
  
  public final int getColumnWidth()
  {
    return this.uSK.cCz() / (this.uSK.cCz() / this.uSK.uWf);
  }
  
  public final j getSmileyPanelCallback()
  {
    com.tencent.mm.view.e.a locala = this.uVv;
    if (locala.uVQ == null) {
      return null;
    }
    return locala.uVQ.getSmileyPanelCallback();
  }
  
  public final int getType()
  {
    String str = this.iiv;
    if (str.equals("TAG_DEFAULT_TAB")) {
      return 20;
    }
    if (str.equals(String.valueOf(EmojiGroupInfo.tcz))) {
      return 25;
    }
    return 23;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/view/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */