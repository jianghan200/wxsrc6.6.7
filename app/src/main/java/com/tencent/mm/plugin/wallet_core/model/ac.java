package com.tencent.mm.plugin.wallet_core.model;

import android.database.Cursor;
import com.tencent.mm.g.c.eo;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.protocal.c.azs;
import com.tencent.mm.protocal.c.ccp;
import com.tencent.mm.protocal.c.ccs;
import com.tencent.mm.protocal.c.cct;
import com.tencent.mm.protocal.c.ccv;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class ac
  extends eo
{
  public static c.a dhO;
  public String kRf = "";
  private azs prn = new azs();
  public ccp pro = null;
  public cct prp = null;
  public boolean prq = false;
  public String prr = "";
  public String prs = "";
  public String prt = "";
  public String pru = "";
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[2];
    locala.columns = new String[3];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "wallet_region";
    locala.sKA.put("wallet_region", "INTEGER PRIMARY KEY ");
    localStringBuilder.append(" wallet_region INTEGER PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.sKz = "wallet_region";
    locala.columns[1] = "wallet_grey_item_buf";
    locala.sKA.put("wallet_grey_item_buf", "BLOB");
    localStringBuilder.append(" wallet_grey_item_buf BLOB");
    locala.columns[2] = "rowid";
    locala.sql = localStringBuilder.toString();
    dhO = locala;
  }
  
  public ac()
  {
    if (this.pro == null) {
      this.pro = new ccp();
    }
    if (this.prp == null) {
      this.prp = new cct();
    }
  }
  
  protected final c.a AX()
  {
    return dhO;
  }
  
  public final void d(Cursor paramCursor)
  {
    super.d(paramCursor);
    this.prn = new azs();
    try
    {
      this.prn = ((azs)this.prn.aG(this.field_wallet_grey_item_buf));
      this.pro = this.prn.scn;
      this.prp = this.prn.sco;
      this.prq = this.prn.scp;
      this.pru = "";
      paramCursor = this.prn.scq.iterator();
      for (;;)
      {
        if (paramCursor.hasNext())
        {
          String str = (String)paramCursor.next();
          this.pru = (this.pru + str + "\n");
          continue;
          if (this.pro != null) {
            break;
          }
        }
      }
    }
    catch (Exception paramCursor)
    {
      x.e("WalletRegionGreyItem", "parser PayIBGGetOverseaWalletRsp error");
    }
    for (;;)
    {
      this.pro = new ccp();
      if (this.prp == null) {
        this.prp = new cct();
      }
      return;
      if (this.prn.scl != null)
      {
        this.prr = ab.a(this.prn.scl.syw);
        this.prs = ab.a(this.prn.scl.syx);
      }
      if (this.prn.scm != null)
      {
        this.prt = ab.a(this.prn.scm.syu);
        this.kRf = ab.a(this.prn.scm.syv);
      }
      x.v("WalletRegionGreyItem", "noticeContent %s", new Object[] { this.prt });
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */