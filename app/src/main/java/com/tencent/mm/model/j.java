package com.tencent.mm.model;

import android.content.Intent;
import com.tencent.mm.ac.d;
import com.tencent.mm.ac.d.b;
import com.tencent.mm.ac.d.b.a;
import com.tencent.mm.ac.e;
import com.tencent.mm.ac.z;
import com.tencent.mm.api.h;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.protocal.c.biy;
import com.tencent.mm.protocal.c.bja;
import com.tencent.mm.protocal.c.bqd;
import com.tencent.mm.protocal.c.qt;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.ui.e.a;
import java.util.ArrayList;
import org.json.JSONObject;

public final class j
  implements h
{
  public final void a(Intent paramIntent, biy parambiy, int paramInt)
  {
    String str = ab.a(parambiy.rvi);
    paramIntent.putExtra("Contact_User", str);
    paramIntent.putExtra("Contact_Nick", ab.a(parambiy.rQz));
    paramIntent.putExtra("Contact_PyInitial", ab.a(parambiy.ruT));
    paramIntent.putExtra("Contact_QuanPin", ab.a(parambiy.ruU));
    paramIntent.putExtra("Contact_Alias", parambiy.eJM);
    paramIntent.putExtra("Contact_Sex", parambiy.eJH);
    paramIntent.putExtra("Contact_VUser_Info", parambiy.rTf);
    paramIntent.putExtra("Contact_VUser_Info_Flag", parambiy.rTe);
    paramIntent.putExtra("Contact_KWeibo_flag", parambiy.rTi);
    paramIntent.putExtra("Contact_KWeibo", parambiy.rTg);
    paramIntent.putExtra("Contact_KWeiboNick", parambiy.rTh);
    paramIntent.putExtra("Contact_Scene", paramInt);
    paramIntent.putExtra("Contact_KHideExpose", true);
    paramIntent.putExtra("Contact_RegionCode", RegionCodeDecoder.aq(parambiy.eJQ, parambiy.eJI, parambiy.eJJ));
    paramIntent.putExtra("Contact_Signature", parambiy.eJK);
    paramIntent.putExtra("Contact_BrandList", parambiy.eJR);
    paramIntent.putExtra("Contact_KSnsIFlag", parambiy.rTk.eJS);
    paramIntent.putExtra("Contact_KSnsBgId", parambiy.rTk.eJU);
    paramIntent.putExtra("Contact_KSnsBgUrl", parambiy.rTk.eJT);
    paramIntent.putExtra(e.a.ths, parambiy.rEJ);
    x.i("MicroMsg.BizInfoLogicImp", "[tomys] anti, content: %s", new Object[] { parambiy.rEJ });
    paramIntent = new d();
    paramIntent.field_username = str;
    paramIntent.field_brandList = parambiy.eJR;
    parambiy = parambiy.rTl;
    if (parambiy != null)
    {
      paramIntent.field_brandFlag = parambiy.eJV;
      paramIntent.field_brandInfo = parambiy.eJX;
      paramIntent.field_extInfo = parambiy.eJW;
      paramIntent.field_brandIconURL = parambiy.eJY;
    }
    if (!z.MY().e(paramIntent)) {
      z.MY().d(paramIntent);
    }
  }
  
  public final void a(Intent paramIntent, bja parambja, int paramInt)
  {
    String str = ab.a(parambja.rvi);
    paramIntent.putExtra("Contact_User", str);
    paramIntent.putExtra("Contact_Nick", ab.a(parambja.rQz));
    paramIntent.putExtra("Contact_PyInitial", ab.a(parambja.ruT));
    paramIntent.putExtra("Contact_QuanPin", ab.a(parambja.ruU));
    paramIntent.putExtra("Contact_Alias", parambja.eJM);
    paramIntent.putExtra("Contact_Sex", parambja.eJH);
    paramIntent.putExtra("Contact_VUser_Info", parambja.rTf);
    paramIntent.putExtra("Contact_VUser_Info_Flag", parambja.rTe);
    paramIntent.putExtra("Contact_KWeibo_flag", parambja.rTi);
    paramIntent.putExtra("Contact_KWeibo", parambja.rTg);
    paramIntent.putExtra("Contact_KWeiboNick", parambja.rTh);
    paramIntent.putExtra("Contact_Scene", paramInt);
    paramIntent.putExtra("Contact_KHideExpose", true);
    paramIntent.putExtra("Contact_RegionCode", RegionCodeDecoder.aq(parambja.eJQ, parambja.eJI, parambja.eJJ));
    paramIntent.putExtra("Contact_Signature", parambja.eJK);
    paramIntent.putExtra("Contact_BrandList", parambja.eJR);
    paramIntent.putExtra("Contact_KSnsIFlag", parambja.rTk.eJS);
    paramIntent.putExtra("Contact_KSnsBgId", parambja.rTk.eJU);
    paramIntent.putExtra("Contact_KSnsBgUrl", parambja.rTk.eJT);
    paramIntent.putExtra("Contact_BIZ_KF_WORKER_ID", parambja.sjm);
    paramIntent.putExtra(e.a.ths, parambja.rEJ);
    paramIntent.putExtra("Contact_BIZ_PopupInfoMsg", parambja.sjn);
    x.i("MicroMsg.BizInfoLogicImp", "[tomys] anti, content: %s", new Object[] { parambja.rEJ });
    paramIntent = new d();
    paramIntent.field_username = str;
    paramIntent.field_brandList = parambja.eJR;
    paramIntent.field_kfWorkerId = parambja.sjm;
    parambja = parambja.rTl;
    if (parambja != null)
    {
      paramIntent.field_brandFlag = parambja.eJV;
      paramIntent.field_brandInfo = parambja.eJX;
      paramIntent.field_extInfo = parambja.eJW;
      paramIntent.field_brandIconURL = parambja.eJY;
    }
    if (!z.MY().e(paramIntent)) {
      z.MY().d(paramIntent);
    }
  }
  
  public final boolean cB(String paramString)
  {
    return z.MY().kA(paramString).LS();
  }
  
  public final ArrayList<String> cC(String paramString)
  {
    try
    {
      paramString = z.MY().kA(paramString).bG(false);
      if ((paramString.dLv == null) && (paramString.dKT != null)) {
        paramString.dLv = d.b.a.kt(paramString.dKT.optString("AcctTransferInfo"));
      }
      paramString = paramString.dLv.dLx;
      return paramString;
    }
    catch (Exception paramString) {}
    return new ArrayList();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/model/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */